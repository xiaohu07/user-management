package com.xiao.usermanagement.models.request;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class AddRoleEntitlements {
  private String roleId;

  private List<String> entitlementIds;
}
