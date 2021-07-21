package cn.sciuridae.entity;

import lombok.Data;

import java.util.List;

@Data
public class global_ship_designs {
    private String name;
    private String ship_size;
    private String is_event_design;
    private List<section> section;
    private List<String> required_component;

}
