package com.cengizhanozeyranoglu.controller;

import com.cengizhanozeyranoglu.model.GeoResponse;

import java.util.Map;

public interface IRestGeoController {

    public GeoResponse getGeoInfo(String city);

}
