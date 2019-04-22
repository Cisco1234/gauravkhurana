package com.hcl.dna.adc.api;

import com.hcl.dna.adc.api.model.Sequence;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;

@Api(value = "Shipment", description = "the Shipment API")
public interface ShipmentApi {

    @ApiOperation(value = "Add a new shipment", notes = "Api to create a new shipment", response = Void.class, tags={ "Shipment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    @RequestMapping(value = "/shipment",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> createShipment(@ApiParam(value = "" ,required=true ) @RequestBody Sequence body);


    @ApiOperation(value = "Deletes a shipment", notes = "", response = Void.class, tags={ "Shipment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "shipment not found", response = Void.class) })
    @RequestMapping(value = "/shipment/{shipmentId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteShipment(@ApiParam(value = "shipment id to delete",required=true ) @PathVariable("shipmentId") Long shipmentId,
        @ApiParam(value = ""  ) @RequestHeader(value="api_key", required=false) String apiKey);


    @ApiOperation(value = "Find shipment", notes = "Returns a shipment detail by shipment Id", response = Sequence.class, tags={ "Shipment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Sequence.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Sequence.class),
        @ApiResponse(code = 404, message = "Shipment not found", response = Sequence.class) })
    @RequestMapping(value = "/shipment/{shipmentId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Sequence> getShipment(@ApiParam(value = "",required=true ) @PathVariable("shipmentId") Long shipmentId);


    @ApiOperation(value = "Update an existing shipment", notes = "", response = Void.class, tags={ "Shipment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Shipment not found", response = Void.class),
        @ApiResponse(code = 405, message = "Validation exception", response = Void.class) })
    @RequestMapping(value = "/shipment",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateShipment(@ApiParam(value = "" ,required=true ) @RequestBody Sequence body);

}
