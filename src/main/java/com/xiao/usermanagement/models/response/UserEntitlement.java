package com.xiao.usermanagement.models.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class UserEntitlement {
  private String entitlementId;

  private String name;

  private String description;
}
