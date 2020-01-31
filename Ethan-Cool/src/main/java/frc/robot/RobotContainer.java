package frc.robot;

import frc.robot.subsystems.LiftyThingIdkBruhItsJustAName;

public class RobotContainer{
    private final LiftyThingIdkBruhItsJustAName loftyLift;
    private final ThisNameIsReleventToWhatThisDoes com_Lift;

    public RobotContainer(){
        loftyLift = new LiftyThingIdkBruhItsJustAName(RobotMap.CANNON_SPINNER);
        
        com_Lift = new ThisNameIsReleventToWhatThisDoes(loftyLift);
    }
}