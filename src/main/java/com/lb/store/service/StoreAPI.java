package com.lb.store.service;


import com.lb.data.storeLocator.Store;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

/**
 * Created by pbitta on 11/2/16.
 */


@Path("/vsdp")
@Produces(MediaType.APPLICATION_JSON)
public class StoreAPI {

    @GET
    @Path("/search")
    public Response searchStoresByKeyword(@QueryParam(value = "storeid") int storeid) {

        Store serviceStores = new StoreLocatorService().getStore(storeid);

        return Response.ok(serviceStores).build();
    }

    @GET
    @Path("/allStores")
    public Response getAllStores() {
        Set<Store>  serviceStores = new StoreLocatorService().getAllStores();
        return Response.ok(serviceStores).build();
    }

}
