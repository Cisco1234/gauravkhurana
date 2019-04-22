package com.hcl.dna.adc.api;

import com.hcl.dna.adc.api.model.Sequence;

import io.swagger.annotations.*;
import java.util.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import java.util.List;

import javax.validation.constraints.*;

@Controller
public class ShipmentApiController implements ShipmentApi {
	
	@Value("${endpointBaseurl}")
	private String baseURL;
	
	private final RestTemplate restTemplate = new RestTemplate();



    public ResponseEntity<Void> createShipment(@ApiParam(value = "" ,required=true ) @RequestBody Sequence body) {
       
        HttpEntity requestEntity = null;
 		String uri = baseURL+"/shipment";
    requestEntity = new HttpEntity<Sequence>(body);
  		ResponseEntity<Void> response = restTemplate.exchange(uri, HttpMethod.POST, requestEntity,Void.class);
        return response;
    }

    public ResponseEntity<Void> deleteShipment(@ApiParam(value = "shipment id to delete",required=true ) @PathVariable("shipmentId") Long shipmentId,
        @ApiParam(value = ""  ) @RequestHeader(value="api_key", required=false) String apiKey) {
       
        HttpEntity requestEntity = null;
 		String uri = baseURL+"/shipment/{shipmentId}";
 		uri = uri.replace("{"+"shipmentId"+"}", shipmentId+"");
  		ResponseEntity<Void> response = restTemplate.exchange(uri, HttpMethod.DELETE, requestEntity,Void.class);
        return response;
    }

    public ResponseEntity<Sequence> getShipment(@ApiParam(value = "",required=true ) @PathVariable("shipmentId") Long shipmentId) {
       
        HttpEntity requestEntity = null;
 		String uri = baseURL+"/shipment/{shipmentId}";
 		uri = uri.replace("{"+"shipmentId"+"}", shipmentId+"");
  		ResponseEntity<Sequence> response = restTemplate.exchange(uri, HttpMethod.GET, requestEntity,Sequence.class);
        return response;
    }

    public ResponseEntity<Void> updateShipment(@ApiParam(value = "" ,required=true ) @RequestBody Sequence body) {
       
        HttpEntity requestEntity = null;
 		String uri = baseURL+"/shipment";
    requestEntity = new HttpEntity<Sequence>(body);
  		ResponseEntity<Void> response = restTemplate.exchange(uri, HttpMethod.PUT, requestEntity,Void.class);
        return response;
    }

}
