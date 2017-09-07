package com.primeton.xforms.api;

import com.primeton.xforms.model.Form;
import com.primeton.xforms.model.Response;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-06T21:06:45.082+08:00")

@RestController
@RequestMapping("/api")
public class FormApiController implements FormApi {



    public ResponseEntity<Void> deleteFormById(@ApiParam(value = "ID of Form to delete",required=true ) @PathVariable("formId") String formId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> queryForm(@ApiParam(value = "only return top limit records") @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "return more records via offset") @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "separating multi-fields by '|' that be used sortby") @RequestParam(value = "sortby", required = false) String sortby,
        @ApiParam(value = "asc or desc", allowableValues = "asc, desc", defaultValue = "desc") @RequestParam(value = "order", required = false, defaultValue="desc") String order) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> queryFormById(@ApiParam(value = "ID of template to return",required=true ) @PathVariable("formId") String formId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Response> updateForm(@ApiParam(value = "Template object that need to be added" ,required=true )  @Valid @RequestBody Form form) {
        // do some magic!
        return new ResponseEntity<Response>(HttpStatus.OK);
    }

}
