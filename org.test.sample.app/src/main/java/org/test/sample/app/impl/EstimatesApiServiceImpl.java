package org.test.sample.app.impl;

import org.test.sample.app.*;
import org.test.sample.app.dto.*;


import org.test.sample.app.dto.ErrorDTO;
import org.test.sample.app.dto.PriceEstimateDTO;
import org.test.sample.app.dto.ProductDTO;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;

public class EstimatesApiServiceImpl extends EstimatesApiService {
    @Override
    public Response estimatesPriceGet(Double startLatitude,Double startLongitude,Double endLatitude,Double endLongitude){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response estimatesTimeGet(Double startLatitude,Double startLongitude,String customerUuid,String productId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
