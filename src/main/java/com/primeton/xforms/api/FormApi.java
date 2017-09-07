/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.primeton.xforms.api;

import com.primeton.xforms.model.Form;
import com.primeton.xforms.model.Response;

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
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-06T21:06:45.082+08:00")

@Api(value = "form", description = "the form API")
public interface FormApi {

    @ApiOperation(value = "Delete form by ID", notes = "Delete a single Form", response = Void.class, tags={ "Form", })
    @ApiResponses(value = {  })
    
    @RequestMapping(value = "/form/{formId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteFormById(@ApiParam(value = "ID of Form to delete",required=true ) @PathVariable("formId") String formId);


    @ApiOperation(value = "Get forms list", notes = "null", response = Void.class, tags={ "Form", })
    @ApiResponses(value = {  })
    
    @RequestMapping(value = "/form",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> queryForm(@ApiParam(value = "only return top limit records") @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "return more records via offset") @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "separating multi-fields by '|' that be used sortby") @RequestParam(value = "sortby", required = false) String sortby,@ApiParam(value = "asc or desc", allowableValues = "asc, desc", defaultValue = "desc") @RequestParam(value = "order", required = false, defaultValue="desc") String order);


    @ApiOperation(value = "Get a business form  by ID", notes = "Returns a single business form", response = Void.class, tags={ "Form", })
    @ApiResponses(value = {  })
    
    @RequestMapping(value = "/form/{formId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> queryFormById(@ApiParam(value = "ID of template to return",required=true ) @PathVariable("formId") String formId);


    @ApiOperation(value = "Add a new Template", notes = "null", response = Response.class, tags={ "Form", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "return success", response = Response.class),
        @ApiResponse(code = 404, message = "哥们，我找不到你要的东西！", response = Response.class),
        @ApiResponse(code = 405, message = "你请求的输入值有问题吧？", response = Response.class),
        @ApiResponse(code = 500, message = "服务器受到外星人攻击！正在抢修中……", response = Response.class) })
    
    @RequestMapping(value = "/form",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Response> updateForm(@ApiParam(value = "Template object that need to be added" ,required=true )  @Valid @RequestBody Form form);

}