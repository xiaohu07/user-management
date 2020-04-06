package com.xiao.usermanagement.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@Document(collection = "entitlements")
public class Entitlement {
  @Id
  private String id;

  private String name;

  private String description;
}
