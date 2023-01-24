 // Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DrivetrainSubsystem extends SubsystemBase {
  /** Creates a new Drivetrain. */

  public WPI_TalonFX leftMotor1, leftMotor2, rightMotor1, rightMotor2;

  public MotorControllerGroup leftMotorGroup, rightMotorGroup;
  public DifferentialDrive ddrive;


  public DrivetrainSubsystem() {

    leftMotor1 = new WPI_TalonFX(Constants.DrivetrainConstants.MOTOR_L1_ID);   // Assigning a port ID to leftMotor1
    leftMotor1.setNeutralMode(NeutralMode.Brake);
    leftMotor2 = new WPI_TalonFX(Constants.DrivetrainConstants.MOTOR_L2_ID);
    leftMotor2.setNeutralMode(NeutralMode.Brake);
    rightMotor1 = new WPI_TalonFX(Constants.DrivetrainConstants.MOTOR_R1_ID);
    rightMotor1.setNeutralMode(NeutralMode.Brake);
    rightMotor2 = new WPI_TalonFX(Constants.DrivetrainConstants.MOTOR_R2_ID);
    rightMotor2.setNeutralMode(NeutralMode.Brake);

    leftMotorGroup = new MotorControllerGroup(leftMotor1, leftMotor2);
    leftMotorGroup.setInverted(true);
    rightMotorGroup = new MotorControllerGroup(rightMotor1, rightMotor2);

    ddrive = new DifferentialDrive(leftMotorGroup, rightMotorGroup);

    

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void driveWithJoysticks(double throttle, double turn, double maxOutput){
    if(throttle>=0.9 || throttle<=-0.9 || turn>=0.9 || turn<=-0.9){
      maxOutput = 0.8;
  
    } else {
      maxOutput = 0.6                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ;

    }
    SmartDashboard.putNumber("MaxOutput", maxOutput);
    double forwardSpeed = throttle * maxOutput;
    double turnSpeed = turn * maxOutput;
    ddrive.arcadeDrive(forwardSpeed, turnSpeed);
  }
}