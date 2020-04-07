package com.xiao.usermanagement.models.response;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@ApiModel("User id")
public class AddUserResponse {
  private String userId;
}
