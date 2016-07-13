package org.test.sample.app.factories;

import org.test.sample.app.HistoryApiService;
import org.test.sample.app.impl.HistoryApiServiceImpl;

public class HistoryApiServiceFactory {

   private final static HistoryApiService service = new HistoryApiServiceImpl();

   public static HistoryApiService getHistoryApi()
   {
      return service;
   }
}
