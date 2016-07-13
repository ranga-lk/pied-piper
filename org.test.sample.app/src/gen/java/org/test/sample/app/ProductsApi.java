package org.test.sample.app;

import org.test.sample.app.dto.*;
import org.test.sample.app.ProductsApiService;
import org.test.sample.app.factories.ProductsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import org.test.sample.app.dto.ErrorDTO;
import org.test.sample.app.dto.ProductDTO;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/products")

@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/products", description = "the products API")
public class ProductsApi  {

   private final ProductsApiService delegate = ProductsApiServiceFactory.getProductsApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Product Types", notes = "The Products endpoint returns information about the *Uber* products\noffered at a given location. The response includes the display name\nand other details about each product, and lists the products in the\nproper display order.\n", response = ProductDTO.class, responseContainer = "List")
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of products"),
        
        @io.swagger.annotations.ApiResponse(code = 0, message = "Unexpected error") })

    public Response productsGet(@ApiParam(value = "Latitude component of location.",required=true) @QueryParam("latitude") Double latitude,
    @ApiParam(value = "Longitude component of location.",required=true) @QueryParam("longitude") Double longitude)
    {
    return delegate.productsGet(latitude,longitude);
    }
}

