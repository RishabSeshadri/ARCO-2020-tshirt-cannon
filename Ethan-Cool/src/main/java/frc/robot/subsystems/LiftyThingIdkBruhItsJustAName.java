package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;


public class LiftyThingIdkBruhItsJustAName extends SubsystemBase {
    
    VictorSPX spinnyThingForCanon;

    public LiftyThingIdkBruhItsJustAName(VuctorSPX hi){
     spinnyThingForCanon = hi;

    }
    public void disable(){
        setSpeed(0);
    }

    public void setSpeed(double speed) {
        spinnyThingForCanon.set(ControlMode.PercentOutput, speed);
    }
    
    public void getSpeed(){
        spinnyThingForCanon.getMotorOutputPercent();
    }

    
}
