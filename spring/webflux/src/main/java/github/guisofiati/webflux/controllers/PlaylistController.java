package github.guisofiati.webflux.controllers;

import github.guisofiati.webflux.documents.Playlist;
import github.guisofiati.webflux.services.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/playlists")
public class PlaylistController {

    @Autowired
    private PlaylistService playlistService;

    @GetMapping
    public Flux<Playlist> getAllPlaylists() {
        return playlistService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<Playlist> getPlaylistById(@PathVariable String id) {
        return playlistService.findById(id);
    }

    @PostMapping
    public Mono<Playlist> save(@RequestBody Playlist playlist) {
        return playlistService.save(playlist);
    }
}
