package com.xiao.usermanagement.service;

import com.xiao.usermanagement.entities.User;
import com.xiao.usermanagement.models.request.AddUserRequest;
import com.xiao.usermanagement.models.response.AddUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Autowired
  private MongoTemplate mongoTemplate;

  public AddUserResponse addNewUser(AddUserRequest addUserRequest) {
    System.out.println("===========user service being called");
    User user = new User().setEmail(addUserRequest.getEmail()).setPassword(addUserRequest.getPassword());
    this.mongoTemplate.save(user, "user");
    return new AddUserResponse().setUserId(user.getId());
  }
}
