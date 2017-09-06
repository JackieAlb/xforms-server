package com.primeton.xforms.api;


import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeton.xforms.model.Response;
import com.primeton.xforms.model.Template;

import java.util.List;

import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-05T16:51:09.815+08:00")

@RestController
@RequestMapping("/api")
public class TemplateApiController implements TemplateApi {



    public ResponseEntity<Response> addFormTemplate(@ApiParam(value = "Template object that need to be added" ,required=true )  @Valid @RequestBody Template body) {
        // do some magic!
        return new ResponseEntity<Response>(HttpStatus.OK);
    }

    public ResponseEntity<List<Template>> queryFormTemplate(@ApiParam(value = "Template object that need to be added" ,required=true )  @Valid @RequestBody Template body) {
        // do some magic!
        return new ResponseEntity<List<Template>>(HttpStatus.OK);
    }

    public ResponseEntity<Response> updateFormTemplate(@ApiParam(value = "Template object that need to be added" ,required=true )  @Valid @RequestBody Template body) {
        // do some magic!
        return new ResponseEntity<Response>(HttpStatus.OK);
    }

}
