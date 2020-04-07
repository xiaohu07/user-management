package com.xiao.usermanagement.controller;

import com.xiao.usermanagement.models.request.AddUserRequest;
import com.xiao.usermanagement.models.response.AddUserResponse;
import com.xiao.usermanagement.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api("User api")
@RestController
public class UserManagementController {
  private static final String BASE_USER = "/user";
  private static final String UPDATE_USER = BASE_USER + "/update";
  private static final String ADD_USER = BASE_USER + "/add";
  private static final String ENTITLEMENTS_USER = BASE_USER + "/entitlements";
  private static final String ALL_USER = BASE_USER + "/all";
  private static final String UPDATE_USER_ROLE = BASE_USER + "/update-role";

  @Autowired
  private UserService userService;

  @ApiOperation("Create a new user")
  @PostMapping(ADD_USER)
  public ResponseEntity<AddUserResponse> addUser(@RequestBody AddUserRequest addUserRequest) {
    System.out.println("===========" + addUserRequest);
    AddUserResponse addUserResponse = userService.addNewUser(addUserRequest);
    return new ResponseEntity<>(addUserResponse, HttpStatus.ACCEPTED);
  }
}
