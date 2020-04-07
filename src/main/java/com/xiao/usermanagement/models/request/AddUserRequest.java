package com.xiao.usermanagement.models.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@ApiModel("Add user model")
public class AddUserRequest {

  @ApiModelProperty("User email")
  private String email;

  @ApiModelProperty("User pw")
  private String password;
}
