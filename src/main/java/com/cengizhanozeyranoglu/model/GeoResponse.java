package com.cengizhanozeyranoglu.model;

import lombok.Data;
import org.springframework.data.geo.GeoResult;

import java.util.List;


@Data
public class GeoResponse {

    private List<GeoApiResult> results;
}
