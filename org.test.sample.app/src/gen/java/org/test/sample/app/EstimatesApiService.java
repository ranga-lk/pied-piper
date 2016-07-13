package org.test.sample.app;

import org.test.sample.app.*;
import org.test.sample.app.dto.*;

import org.test.sample.app.dto.ErrorDTO;
import org.test.sample.app.dto.PriceEstimateDTO;
import org.test.sample.app.dto.ProductDTO;

import java.util.List;

import java.io.InputStream;


import javax.ws.rs.core.Response;

public abstract class EstimatesApiService {
    public abstract Response estimatesPriceGet(Double startLatitude,Double startLongitude,Double endLatitude,Double endLongitude);
    public abstract Response estimatesTimeGet(Double startLatitude,Double startLongitude,String customerUuid,String productId);
}

