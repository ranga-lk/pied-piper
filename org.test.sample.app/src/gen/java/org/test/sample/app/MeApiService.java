package org.test.sample.app;

import org.test.sample.app.*;
import org.test.sample.app.dto.*;

import org.test.sample.app.dto.ErrorDTO;
import org.test.sample.app.dto.ProfileDTO;

import java.util.List;

import java.io.InputStream;


import javax.ws.rs.core.Response;

public abstract class MeApiService {
    public abstract Response meGet();
}

