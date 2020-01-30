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
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.XboxController;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;


import edu.wpi.first.wpilibj.Joystick;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  /**
   * REFERENCE
   * https://tinyurl.com/FRCreference2020
   * GO TO TINYURL FOR BASIC FRC REFERENCE CODE USING WPILIB 2020
   */
  
  // Object Declarations for Current TimedRobot Instance
  

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  private static final int solenoidOff = 1;
  private static final int solenoidForeward = 2;
  private static final int SolenoidReverse = 3;

  @Override
  public void robotInit() {
    RobotMap.init();
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
    RobotMap.KUUNAV_DRIVE.driveCartesian(
      RobotMap.RISHAB.getX(GenericHID.Hand.kLeft),
      RobotMap.RISHAB.getY(GenericHID.Hand.kLeft),
      RobotMap.RISHAB.getX(GenericHID.Hand.kRight)
    );
  
    RobotMap.D_SOLENOID.set(D_SOLENOID.Value.kOff);
    RobotMap.AIR_BOI.setClosedLoopControl(true);
    //Turns Double solenoid on/off
    (RobotMap.RISHAB.getAButton(GenericHID.Hand.kA) && (RobotMap.D_SOLENOID.get() == kOff || kReverse)) ? RobotMap.D_SOLENOID.set(D_SOLENOID.Value.kForward) :
    (RobotMap.RISHAB.getAButton(GenericHID.Hand.kA) && (RobotMap.D_SOLENOID.get() == kOff || kForward)) ? RobotMap.D_SOLENOID.set(D_SOLENOID.Value.kReverse) :
    RobotMap.D_SOLENOID.set(D_SOLENOID.Value.kOff);


    RobotMap.RISHAB.getBumper(GenericHID.Hand.kLeft) ? RobotMap.SPINNY_BOI.setSpeed(-0.5) :
      RobotMap.RISHAB.getBumper(GenericHID.Hand.kRight) ? RobotMap.SPINNY_BOI.setSpeed(0.5) :
      RobotMap.SPINNY_BOI.setSpeed(0);
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
