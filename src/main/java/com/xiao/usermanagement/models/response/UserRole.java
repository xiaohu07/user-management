package com.xiao.usermanagement.models.response;

import java.util.Set;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class UserRole {

  private String roleId;

  private String name;

  private Set<UserEntitlement> entitlements;
}
