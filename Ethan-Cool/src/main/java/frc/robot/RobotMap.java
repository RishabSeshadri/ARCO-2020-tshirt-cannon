package frc.robot;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibJ.DoubleSolenoid;
import edu.wpi.first.wpilibj.Compressor;

public class RobotMap {

    public static MecanumDrive KUUNAV_DRIVE;
    public static TalonSRX FRONT_RIGHT, FRONT_LEFT, BACK_LEFT, BACK_RIGHT;
    public static VictorSPX CANNON_SPINNER; // ? JAXON_TALL
    public static LiftyThingIdkBruhItsJustAName SPINNY_BOI; // ? LIFTY_BOI
    public static XboxController RISHAB;
    public static DoubleSolenoid D_SOLENOID;
    public static Compressor AIR_BOI;


    public static void init() {
        FRONT_LEFT = new TalonSRX(10);
        FRONT_RIGHT = new TalonSRX(20);
        BACK_LEFT = new TalonSRX(30);
        BACK_RIGHT = new TalonSRX(40);
    
        CANNON_SPINNER = new VictorSPX(17);
        // ? JAXON_TALL = new VictorSPX(23);

        D_SOLENOID = new DoubleSolenoid(1, 1);
        AIR_BOI = new Compressor(0);
        AIR_BOI.setClosedLoopControl(true);

        RISHAB = new XboxController(0);
    
        KUUNAV_DRIVE = new MecanumDrive(FRONT_LEFT, FRONT_RIGHT, BACK_LEFT, BACK_RIGHT);

        SPINNY_BOI = new LiftyThingIdkBruhItsJustAName(CANNON_SPINNER);
        // ? LIFTY_BOI = new LiftyThingIdkBruhItsJustAName(JAXON_TALL);

        
    }
}
