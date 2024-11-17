package com.cengizhanozeyranoglu.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Geometry {

    @JsonProperty("lat")
    private double latitude;

    @JsonProperty("lng")
    private double longitude;
}
