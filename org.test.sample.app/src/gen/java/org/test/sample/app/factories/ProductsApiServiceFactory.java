package org.test.sample.app.factories;

import org.test.sample.app.ProductsApiService;
import org.test.sample.app.impl.ProductsApiServiceImpl;

public class ProductsApiServiceFactory {

   private final static ProductsApiService service = new ProductsApiServiceImpl();

   public static ProductsApiService getProductsApi()
   {
      return service;
   }
}
