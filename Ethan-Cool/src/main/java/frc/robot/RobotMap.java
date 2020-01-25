package frc.robot;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

public class RobotMap {

    public static VictorSPX JAXONSHORT;

    public static void init() {
        JAXONSHORT = new VictorSPX(11);
    }
}
