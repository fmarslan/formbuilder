package com.fmarslan.application.formbuilder.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_screens")
public class ScreenEntity implements Serializable {

    private static final long serialVersionUID = -8375109395200088119L;

	@Id
    private int id;

    @Column(name = "screen_name")
    private String name;

    @ManyToMany(cascade = CascadeType.REMOVE)
    @JoinTable(name = "tbl_screen_fields", joinColumns = @JoinColumn(name = "screen_id"), inverseJoinColumns = @JoinColumn(name = "field_id"))
    private List<FieldEntity> entites;
}