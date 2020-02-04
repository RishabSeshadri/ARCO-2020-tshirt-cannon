package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ThisNameIsReleventToWhatThisDoes extends CommandBase {
    //This is the class for the command which controls the item which moves the canon up and down
    private final LiftyThingIdkBruhItsJustAName canonspin;
    private final DoubleSupplier mSpeed;

    public ThisNameIsReleventToWhatThisDoes(LiftyThingIdkBruhItsJustAName spinny, DoubleSupplier speed){
        canonspin = spinny;
        mSpeed = speed;

        addRequirements(spinny);
    }
    @Override
    public void execute(){
        canonSpin.setSpeed(mSpeed.getAsDouble());
    }
    @Override
    public boolean isFinished() {
      return true;
    }
}