package com.atitus.tcc.data;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
public class Section {
    private String type;
    private ArrayList<Hit> hits;
}
