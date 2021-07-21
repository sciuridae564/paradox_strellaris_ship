import cn.sciuridae.entity.global_ship_designs;
import cn.sciuridae.util.scriptReader.Work_respoence;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        try {
            Work_respoence  work_respoence=new Work_respoence();
            Map<String, Object> work = work_respoence.work(global_ship_designs.class, "C:\\Users\\kjhgf\\Documents\\Paradox Interactive\\Stellaris\\mod\\AssaultLily_In_Stellairs\\common\\global_ship_designs\\AL_event_ship.txt");
           System.out.println(work);

        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException | IOException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
