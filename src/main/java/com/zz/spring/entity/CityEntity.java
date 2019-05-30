package com.zz.spring.entity;

import com.zz.spring.anno.Entity;
import lombok.Data;

@Data
@Entity(value = "city")
public class CityEntity {

    private String name;

    private String id;
}
