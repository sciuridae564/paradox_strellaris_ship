package cn.sciuridae.entity;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ship_sizes {
    private String key ;
    private String graphics_culture = "no";//
    private String entity;//实体模型名字
    private String max_hitpoints;//基本船体
    private String formation_priority = "4";//编队优先权,越高越在前面
    private String max_speed;//最大速度
    private String combat_disengage_chance;//逃跑概率
    private String acceleration;//加速度
    private String rotation_speed ;//旋转角速度
    private String collision_radius;//碰撞半径
    private String modifier;//修正
    private String ship_modifier;//修正
    private String size_multiplier;//占的指挥点数
    //private String combat_size_multiplier;//战斗时覆盖上面
    private String fleet_slot_size = "4" ;//
    private List<String> section_slots;//插槽 { "bow" = { locator = "part1" } }
    private String num_target_locators;
    private String is_space_station;//是空间站吗
    private String icon_frame;//确定此 Ship Size 的图标在共享图标文件中的索引。
    private String enable_default_design;//是否生成一个自动设计,no则不允许ai建造
    private String is_designable;//是否可建造
    private String _class;
    private List<String> required_component_set;//组件，如反应堆和光环
    private String[] empire_limit;//帝国最多允许建造的此船型数量，一共三个数值 1.base 基础数量 2.帝国最大允许数量 3.扩展容量 帝国海军容量/这个数
    private Map<String,String> upkeep;
    private Map<String,String> cost;




}

