package com.scb.channels.research.api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import static com.scb.channels.research.utils.ResourceUtils.RESOURCE_ROOT_PATH;

@Path(RESOURCE_ROOT_PATH + "/user")
public interface UserResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    String getUserDetails(@HeaderParam("UserId") String userId);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    String updateUserProfile(@HeaderParam("UserId") String userId, String body);

    @GET
    @Path("/userid")
    @Produces(MediaType.APPLICATION_JSON)
    String getUserIDByEmail(@HeaderParam("UserLogin") String userLogin);

    @GET
    @Path("/entitlement")
    @Produces(MediaType.APPLICATION_JSON)
    String getUserEntitlements(@HeaderParam("UserId") String userId);
}
