package com.xiao.usermanagement.entities;

import java.util.Set;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@Document(collection = "users")
public class User {
  @Id
  private String id;

  private String email;

  private String password;

  private Role role;

  private Set<Entitlement> entitlements;

}
