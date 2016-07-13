package org.test.sample.app;

import org.test.sample.app.*;
import org.test.sample.app.dto.*;

import org.test.sample.app.dto.ErrorDTO;
import org.test.sample.app.dto.ProductDTO;

import java.util.List;

import java.io.InputStream;


import javax.ws.rs.core.Response;

public abstract class ProductsApiService {
    public abstract Response productsGet(Double latitude,Double longitude);
}

