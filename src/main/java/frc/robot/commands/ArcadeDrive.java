  // Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DrivetrainSubsystem;

public class ArcadeDrive extends CommandBase {
  /** Creates a new ArcadeDrive. */

  DrivetrainSubsystem drive;

  public ArcadeDrive(DrivetrainSubsystem drive) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.drive = drive;
    addRequirements(drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drive.driveWithJoysticks(-(RobotContainer.driverJoystick.getRawAxis(Constants.Binds.L_Y_AXIS)), -(RobotContainer.driverJoystick.getRawAxis(Constants.Binds.R_X_AXIS)), 0);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
