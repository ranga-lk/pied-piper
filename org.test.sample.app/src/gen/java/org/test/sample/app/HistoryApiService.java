package org.test.sample.app;

import org.test.sample.app.*;
import org.test.sample.app.dto.*;

import org.test.sample.app.dto.ActivitiesDTO;
import org.test.sample.app.dto.ErrorDTO;

import java.util.List;

import java.io.InputStream;


import javax.ws.rs.core.Response;

public abstract class HistoryApiService {
    public abstract Response historyGet(Integer offset,Integer limit);
}

