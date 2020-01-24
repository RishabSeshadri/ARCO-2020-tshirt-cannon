package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class RobotMap {

    public static WPI_TalonSRX JAXONSHORT;

    public static void init() {
        JAXONSHORT = new WPI_TalonSRX(69);
    }
}
