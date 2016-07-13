package org.test.sample.app.factories;

import org.test.sample.app.EstimatesApiService;
import org.test.sample.app.impl.EstimatesApiServiceImpl;

public class EstimatesApiServiceFactory {

   private final static EstimatesApiService service = new EstimatesApiServiceImpl();

   public static EstimatesApiService getEstimatesApi()
   {
      return service;
   }
}
