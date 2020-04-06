package com.xiao.usermanagement.models.request;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class AddEntitlement {

  private String name;

  private String description;
}
