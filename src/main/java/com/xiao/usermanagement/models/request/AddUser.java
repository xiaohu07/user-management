package com.xiao.usermanagement.models.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class AddUser {

  private String email;

  private String password;
}
