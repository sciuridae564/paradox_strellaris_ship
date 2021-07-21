package cn.sciuridae.entity;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class component_templates {
    private String component_type;
    private String key ;
    private String icon;
    private String icon_frame;
    private String power;
    private Map<String,String> modifier;
    private List<String> prerequisites;
    private String component_set;
    private String upgrades_to;
    private Map<String,String> cost;
    private Map<String,String> upkeep;

    private String use_ship_kill_target ="no"  ;//我也不知道这啥
    private String hidden;//不让ai和玩家直接使用，全局舰船设计可以使用
    //导弹
    private String missile_speed ;
    private String missile_evasion ;
    private String missile_shield ;
    private String missile_armor ;
    private String missile_health ;
    private String missile_retarget_range ;

    //通用
    private String firing_arc;//最大射角
    private String min_range ;//最小射程
    private String range;//范围
    private String accuracy ;//精度
    private String tracking ;//跟踪
    private String hull_damage ;//
    private String shield_damage ;//
    private String shield_penetration ;//
    private String Armor_damage ;//
    private String Armor_penetration  ;// 装甲穿透
    private String cooldown  ;//冷却
    private String total_fire_time  ;//冷却
    private String windup  ;//冷却
    private String[] damage   ;//伤害
    private String should_ai_use   ;//ai能用吗


    private String size  ;//
    private String type  ;//
    private String prio_projectile = "yes"  ;//如果是，如果要显示的图形太多，必须忽略其中的一些图形，则会优先显示该组件的弹丸图形。
    private String projectile_gfx  ;//指定此组件的弹丸图形。
    private String size_restriction  ;//可以装备这个组件的舰船类型

}
