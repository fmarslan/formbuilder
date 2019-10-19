package com.fmarslan.application.formbuilder.entities;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ScreenEntity implements Serializable{
    private int id;
    private String name;
    private List<FieldEntity> entites;
}