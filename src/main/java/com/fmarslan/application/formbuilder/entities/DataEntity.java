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
public class DataEntity implements Serializable{

    private static final long serialVersionUID = -5679755108073531426L;

    private int id;
    private ScreenEntity screen;
    private FieldEntity field;
    private String value;
}