package org.test.sample.app.factories;

import org.test.sample.app.MeApiService;
import org.test.sample.app.impl.MeApiServiceImpl;

public class MeApiServiceFactory {

   private final static MeApiService service = new MeApiServiceImpl();

   public static MeApiService getMeApi()
   {
      return service;
   }
}
