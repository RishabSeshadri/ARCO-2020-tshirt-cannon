package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ThisNameIsReleventToWhatThisDoes extends CommandBase {
    //This is the class for the command which controls the item which moves the canon up and down
    private final LiftyThingIdkBruhItsJustAName canonspin;

    public ThisNameIsReleventToWhatThisDoes(LiftyThingIdkBruhItsJustAName spinny){
        canonspin = spinny;

        addRequirements(spinny);
    }
}