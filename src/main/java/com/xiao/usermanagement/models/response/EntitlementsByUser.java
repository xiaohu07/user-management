package com.xiao.usermanagement.models.response;

import java.util.Set;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class EntitlementsByUser {
  private String userId;

  private Set<UserEntitlement> entitlements;
}
