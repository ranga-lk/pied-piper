package org.test.sample.app.impl;

import org.test.sample.app.*;
import org.test.sample.app.dto.*;


import org.test.sample.app.dto.ActivitiesDTO;
import org.test.sample.app.dto.ErrorDTO;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;

public class HistoryApiServiceImpl extends HistoryApiService {
    @Override
    public Response historyGet(Integer offset,Integer limit){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
