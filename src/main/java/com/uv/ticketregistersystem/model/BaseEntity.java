package com.uv.ticketregistersystem.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(name = "created_at")
    private Date createdAt = new Date();

}
