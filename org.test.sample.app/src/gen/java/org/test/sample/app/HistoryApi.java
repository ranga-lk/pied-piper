package org.test.sample.app;

import org.test.sample.app.dto.*;
import org.test.sample.app.HistoryApiService;
import org.test.sample.app.factories.HistoryApiServiceFactory;

import io.swagger.annotations.ApiParam;

import org.test.sample.app.dto.ActivitiesDTO;
import org.test.sample.app.dto.ErrorDTO;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/history")

@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/history", description = "the history API")
public class HistoryApi  {

   private final HistoryApiService delegate = HistoryApiServiceFactory.getHistoryApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "User Activity", notes = "The User Activity endpoint returns data about a user's lifetime activity with Uber. The response will include pickup locations and times, dropoff locations and times, the distance of past requests, and information about which products were requested.<br><br>The history array in the response will have a maximum length based on the limit parameter. The response value count may exceed limit, therefore subsequent API requests may be necessary.", response = ActivitiesDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "History information for the given user"),
        
        @io.swagger.annotations.ApiResponse(code = 0, message = "Unexpected error") })

    public Response historyGet(@ApiParam(value = "Offset the list of returned results by this amount. Default is zero.") @QueryParam("offset") Integer offset,
    @ApiParam(value = "Number of items to retrieve. Default is 5, maximum is 100.") @QueryParam("limit") Integer limit)
    {
    return delegate.historyGet(offset,limit);
    }
}

