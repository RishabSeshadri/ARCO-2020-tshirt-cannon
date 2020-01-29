package frc.robot;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

public class RobotMap {

    public static MecanumDrive KUUNAV_DRIVE;
    public static TalonSRX FRONT_RIGHT, FRONT_LEFT, BACK_LEFT, BACK_RIGHT;
    public static VictorSPX CANNON_SPINNER; // ? JAXON_TALL
    public static LiftyThingIdkBruhItsJustAName SPINNY_BOI; // ? LIFTY_BOI
    public static XboxController RISHAB;

    public static void init() {
        FRONT_LEFT = new TalonSRX(10);
        FRONT_RIGHT = new TalonSRX(20);
        BACK_LEFT = new TalonSRX(30);
        BACK_RIGHT = new TalonSRX(40);
    
        CANNON_SPINNER = new VictorSPX(17);
        // ? JAXON_TALL = new VictorSPX(23);

        RISHAB = new XboxController(8);
    
        KUUNAV_DRIVE = new MecanumDrive(FRONT_LEFT, FRONT_RIGHT, BACK_LEFT, BACK_RIGHT);

        SPINNY_BOI = new LiftyThingIdkBruhItsJustAName(CANNON_SPINNER);
        // ? LIFTY_BOI = new LiftyThingIdkBruhItsJustAName(JAXON_TALL);
    }
}
