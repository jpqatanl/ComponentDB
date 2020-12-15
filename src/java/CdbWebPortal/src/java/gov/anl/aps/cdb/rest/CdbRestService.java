/*
 * Copyright (c) UChicago Argonne, LLC. All rights reserved.
 * See LICENSE file.
 */
package gov.anl.aps.cdb.rest;

/**
 *
 * @author djarosz
 */
import io.swagger.v3.jaxrs2.integration.resources.AcceptHeaderOpenApiResource;
import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.glassfish.jersey.jackson.JacksonFeature;

@ApplicationPath("/api/")
public class CdbRestService extends Application {

    public CdbRestService() {
        super();
    }

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> restResourceClasses = getRestResourceClasses();

        // Swagger core v2.0
        restResourceClasses.add(OpenApiResource.class);
        restResourceClasses.add(AcceptHeaderOpenApiResource.class);

        // Add json processor 
        restResourceClasses.add(JacksonFeature.class);

        return restResourceClasses;
    }

    /**
     * Do not modify this method. It is automatically generated by NetBeans REST
     * support.
     */
    private Set<Class<?>> getRestResourceClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        resources.add(gov.anl.aps.cdb.rest.authentication.AuthenticationFilter.class);
        resources.add(gov.anl.aps.cdb.rest.provider.GenericAPIExceptionProvider.class);
        resources.add(gov.anl.aps.cdb.rest.routes.AuthenticationRoute.class);
        resources.add(gov.anl.aps.cdb.rest.routes.CableCatalogItemRoute.class);
        resources.add(gov.anl.aps.cdb.rest.routes.DomainRoute.class);
        resources.add(gov.anl.aps.cdb.rest.routes.DownloadRoute.class);
        resources.add(gov.anl.aps.cdb.rest.routes.ItemRoute.class);
        resources.add(gov.anl.aps.cdb.rest.routes.LocationItemRoute.class);
        resources.add(gov.anl.aps.cdb.rest.routes.MachineDesignItemRoute.class);
        resources.add(gov.anl.aps.cdb.rest.routes.PropertyTypeRoute.class);
        resources.add(gov.anl.aps.cdb.rest.routes.PropertyValueRoute.class);
        resources.add(gov.anl.aps.cdb.rest.routes.SourceRoute.class);
        resources.add(gov.anl.aps.cdb.rest.routes.LogRoute.class); 
        resources.add(gov.anl.aps.cdb.rest.routes.TestRoute.class);
        resources.add(gov.anl.aps.cdb.rest.routes.UsersRoute.class);
        return resources;
    }

}
