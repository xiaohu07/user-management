package com.xiao.usermanagement.entities;

import java.util.Set;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@Data
@Accessors(chain = true)
@Document(collection = "roles")
public class Role {
  @Id
  private String id;

  private String name;

  private Set<Entitlement> entitlements;
}
