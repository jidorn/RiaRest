package fr.afcepf.al26.ria.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Stagiaire on 18/03/2016.
 */
@ApplicationPath("/restInPeace/*")
public class MonApplication extends Application {

    /**
     * la collection de singletons.
     */
    private Set<Object> nosSingletons = new HashSet<>();

    /**
     * le constructor.
     */
    public MonApplication() {
        nosSingletons.add(new PremierService());
    }

    /**
     * singletons.
     * @return singletons.
     */
    @Override
    public Set<Object> getSingletons() {
        return nosSingletons;
    }
}
