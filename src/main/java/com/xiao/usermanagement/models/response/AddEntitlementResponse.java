package com.xiao.usermanagement.models.response;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class AddEntitlementResponse {
  private String entitlementId;
}
