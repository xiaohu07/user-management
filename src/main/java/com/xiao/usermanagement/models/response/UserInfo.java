package com.xiao.usermanagement.models.response;

import java.util.Set;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class UserInfo {
  private String userId;

  private String email;

  private String password;

  private UserRole role;

  private Set<UserEntitlement> entitlements;
}
