package com.xiao.usermanagement.models.request;

import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class UpdateUser {

  @NotNull
  private String userId;

  private String email;

  private String password;
}
