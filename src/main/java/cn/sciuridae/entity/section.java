package cn.sciuridae.entity;

import lombok.Data;

import java.util.List;

@Data
public class section {
    private String template;
    private String slot;
    private List<Component> component;//solt 和 template
}
