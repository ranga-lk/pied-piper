package org.test.sample.app;

import org.test.sample.app.dto.*;
import org.test.sample.app.MeApiService;
import org.test.sample.app.factories.MeApiServiceFactory;

import io.swagger.annotations.ApiParam;

import org.test.sample.app.dto.ErrorDTO;
import org.test.sample.app.dto.ProfileDTO;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/me")

@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/me", description = "the me API")
public class MeApi  {

   private final MeApiService delegate = MeApiServiceFactory.getMeApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "User Profile", notes = "The User Profile endpoint returns information about the Uber user that has authorized with the application.", response = ProfileDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Profile information for a user"),
        
        @io.swagger.annotations.ApiResponse(code = 0, message = "Unexpected error") })

    public Response meGet()
    {
    return delegate.meGet();
    }
}

