package org.test.sample.app;

import org.test.sample.app.dto.*;
import org.test.sample.app.EstimatesApiService;
import org.test.sample.app.factories.EstimatesApiServiceFactory;

import io.swagger.annotations.ApiParam;

import org.test.sample.app.dto.ErrorDTO;
import org.test.sample.app.dto.PriceEstimateDTO;
import org.test.sample.app.dto.ProductDTO;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/estimates")

@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/estimates", description = "the estimates API")
public class EstimatesApi  {

   private final EstimatesApiService delegate = EstimatesApiServiceFactory.getEstimatesApi();

    @GET
    @Path("/price")
    
    
    @io.swagger.annotations.ApiOperation(value = "Price Estimates", notes = "The Price Estimates endpoint returns an estimated price range\nfor each product offered at a given location. The price estimate is\nprovided as a formatted string with the full price range and the localized\ncurrency symbol.<br><br>The response also includes low and high estimates,\nand the [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) currency code for\nsituations requiring currency conversion. When surge is active for a particular\nproduct, its surge_multiplier will be greater than 1, but the price estimate\nalready factors in this multiplier.\n", response = PriceEstimateDTO.class, responseContainer = "List")
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of price estimates by product"),
        
        @io.swagger.annotations.ApiResponse(code = 0, message = "Unexpected error") })

    public Response estimatesPriceGet(@ApiParam(value = "Latitude component of start location.",required=true) @QueryParam("start_latitude") Double startLatitude,
    @ApiParam(value = "Longitude component of start location.",required=true) @QueryParam("start_longitude") Double startLongitude,
    @ApiParam(value = "Latitude component of end location.",required=true) @QueryParam("end_latitude") Double endLatitude,
    @ApiParam(value = "Longitude component of end location.",required=true) @QueryParam("end_longitude") Double endLongitude)
    {
    return delegate.estimatesPriceGet(startLatitude,startLongitude,endLatitude,endLongitude);
    }
    @GET
    @Path("/time")
    
    
    @io.swagger.annotations.ApiOperation(value = "Time Estimates", notes = "The Time Estimates endpoint returns ETAs for all products offered at a given location, with the responses expressed as integers in seconds. We recommend that this endpoint be called every minute to provide the most accurate, up-to-date ETAs.", response = ProductDTO.class, responseContainer = "List")
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of products"),
        
        @io.swagger.annotations.ApiResponse(code = 0, message = "Unexpected error") })

    public Response estimatesTimeGet(@ApiParam(value = "Latitude component of start location.",required=true) @QueryParam("start_latitude") Double startLatitude,
    @ApiParam(value = "Longitude component of start location.",required=true) @QueryParam("start_longitude") Double startLongitude,
    @ApiParam(value = "Unique customer identifier to be used for experience customization.") @QueryParam("customer_uuid") String customerUuid,
    @ApiParam(value = "Unique identifier representing a specific product for a given latitude & longitude.") @QueryParam("product_id") String productId)
    {
    return delegate.estimatesTimeGet(startLatitude,startLongitude,customerUuid,productId);
    }
}

