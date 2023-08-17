package com.gyull.board.domain.role;

import java.util.List;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class RolePermission {
  private Integer rolePermissionIdx;
  private Integer roleIdx;
  private List<Permission> permission;
}
