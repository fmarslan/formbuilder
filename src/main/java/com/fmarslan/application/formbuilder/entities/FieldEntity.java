package com.fmarslan.application.formbuilder.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FieldEntity implements Serializable{
	private static final long serialVersionUID = -3511641752862012902L;
    private int id;
    private String label;
    private String fieldType;
    private String regex;
    private String values;
}