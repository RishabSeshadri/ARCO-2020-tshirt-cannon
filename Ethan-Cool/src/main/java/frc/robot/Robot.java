/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* Jackson, bad. Ethan, good. Rishab, chaotic good.                           */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {


  private MecanumDrive kuunavDrive;

  private Joystick rishab;
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */


  @Override
  public void robotInit() {
    WPI_TalonSRX frontL = new WPI_TalonSRX(1);
    WPI_TalonSRX frontR = new WPI_TalonSRX(2);
    WPI_TalonSRX backL = new WPI_TalonSRX(3);
    WPI_TalonSRX backR = new WPI_TalonSRX(4);

    //REFERENCE
    //REFERENCE
    //REFERENCE
    //https://tinyurl.com/FRCreference2020 GO TO TINYURL FOR BASIC FRC REFERENCE CODE 2020
    //REFERENCE
    //REFERENCE
    //REFERENCE

    frontL.setInverted(true);
    backL.setInverted(true);

    rishab = new Joystick(420);  //Rishab do be a joystick tho

    kuunavDrive = new MecanumDrive(frontL, frontR, backL, backR);
  }

  /**
   * This function is called every robot packet, no matter the mode. Use this for items like
   * diagnostics that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
    // Runs the Scheduler.  This is responsible for polling buttons, adding newly-scheduled
    // commands, running already-scheduled commands, removing finished or interrupted commands,
    // and running subsystem periodic() methods.  This must be called from the robot's periodic
    // block in order for anything in the Command-based framework to work.

  }

  /**
   * This function is called once each time the robot enters Disabled mode.
   */
  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
  }

  /**
   * This autonomous runs the autonomous command selected by your {@link RobotContainer} class.
   */
  @Override
  public void autonomousInit() {
    
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
    kuunavDrive.driveCartesian(rishab.getX(), rishab.getY(),
    rishab.getZ(), 0);
  }

  @Override
  public void testInit() {
    // Cancels all running commands at the start of test mode. 
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
  }
  
}
