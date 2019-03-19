/*
 * Copyright (c) UChicago Argonne, LLC. All rights reserved.
 * See LICENSE file.
 */
package gov.anl.aps.cdb.rest;

/**
 *
 * @author djarosz
 */
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.glassfish.jersey.jackson.JacksonFeature;

@ApplicationPath("/api/")
public class CdbRestService extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> restResourceClasses = getRestResourceClasses();
        // Add json processor 
        restResourceClasses.add(JacksonFeature.class); 
        return restResourceClasses; 
    }

    /**
     * Do not modify this method. It is automatically generated by NetBeans REST support.
     */
    private Set<Class<?>> getRestResourceClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        resources.add(gov.anl.aps.cdb.rest.authentication.AuthenticationFilter.class);
        resources.add(gov.anl.aps.cdb.rest.routes.AuthenticationRoute.class);
        resources.add(gov.anl.aps.cdb.rest.routes.ItemRoute.class);
        resources.add(gov.anl.aps.cdb.rest.routes.PropertyTypeRoute.class);
        resources.add(gov.anl.aps.cdb.rest.routes.UsersRoute.class);
        return resources;
    }
    
}