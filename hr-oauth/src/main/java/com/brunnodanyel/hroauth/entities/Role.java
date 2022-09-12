package com.brunnodanyel.hroauth.entities;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String roleName;
}
