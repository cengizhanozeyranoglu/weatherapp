package com.cengizhanozeyranoglu.services.serviceimpl;

import com.cengizhanozeyranoglu.configuration.GlobalProperties;
import com.cengizhanozeyranoglu.model.GeoResponse;
import com.cengizhanozeyranoglu.services.IGeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;


@Service
public class GeoServiceImpl implements IGeoService {
    @Autowired
    private GlobalProperties globalProperties;


    @Override
    public GeoResponse getGeoInfo(String city) {

        String rootUrl =globalProperties.getGeoEndpoint();

        String apiKey = globalProperties.getApiKey();

        String endPoint = rootUrl + city + "&key=" + apiKey;


      try{
          RestTemplate restTemplate = new RestTemplate();
          ResponseEntity<GeoResponse> response = restTemplate.exchange(endPoint, HttpMethod.GET, null, GeoResponse.class);

          if (response.getStatusCode().is2xxSuccessful()) {
              return response.getBody();

          }
      }catch (Exception e){
          e.getMessage();
      }

        return null;
    }
}
