package github.guisofiati.webflux;

import github.guisofiati.webflux.documents.Playlist;
import github.guisofiati.webflux.repositories.PlaylistRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.UUID;

@Component
public class Seed implements CommandLineRunner {

    private final PlaylistRepository playlistRepository;

    Seed(PlaylistRepository playlistRepository) {
        this.playlistRepository = playlistRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        playlistRepository.deleteAll()
                .thenMany(
                        Flux.just("Spring Boot", "Spring WebFlux", "Servlet", "JSP (JavaServer Pages)",
                                "JSF (JavaServer Faces)", "EJB", "Struts 2", "VRaptor", "Quarkus", "Cucumber",
                                "JUnit 5", "Spring Batch", "Spring MVC")
                                .map(playlist -> new Playlist(UUID.randomUUID().toString(), playlist))
                                .flatMap(playlistRepository::save))
                                .subscribe(System.out::println);
    }
}
