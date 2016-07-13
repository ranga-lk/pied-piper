package org.test.sample.app.impl;

import org.test.sample.app.*;
import org.test.sample.app.dto.*;


import org.test.sample.app.dto.ErrorDTO;
import org.test.sample.app.dto.ProfileDTO;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;

public class MeApiServiceImpl extends MeApiService {
    @Override
    public Response meGet(){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
