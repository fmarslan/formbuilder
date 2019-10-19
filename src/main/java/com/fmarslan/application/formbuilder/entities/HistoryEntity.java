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
public class HistoryEntity implements Serializable{

    private static final long serialVersionUID = 6228149954012591283L;
	private int id;
    private ScreenEntity screen;
    private FieldEntity field;
    private String oldValue;
    private String newValue;
    private String updatedDate;
    private String updatedBy;
}