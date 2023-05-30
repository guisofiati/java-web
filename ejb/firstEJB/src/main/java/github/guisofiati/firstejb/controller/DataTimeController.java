package github.guisofiati.firstejb.controller;

import github.guisofiati.firstejb.ejb.DataTimeBean;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "dataTimeController") // (like JSF manegedBean)
@RequestScoped // life cycle
public class DataTimeController implements Serializable {
    
    @EJB // to be instanciate by server
    private DataTimeBean dataTimeBean;
    
    public DataTimeController() {
        System.out.println("Controller instance created");
    }

    public DataTimeBean getDataTimeBean() {
        return dataTimeBean;
    }

    public void setDataTimeBean(DataTimeBean dataTimeBean) {
        this.dataTimeBean = dataTimeBean;
    }
    
}
