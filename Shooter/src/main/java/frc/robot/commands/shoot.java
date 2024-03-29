// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class shoot extends Command {
  /** Creates a new shoot. */
  public static Shooter m_shooter;

  public shoot(Shooter shooter) {

    this.m_shooter = shooter;
    addRequirements(m_shooter);

    // Use addRequirements() here to declare subsystem dependencies.
  }

  private void addRequirements(Shooter m_shooter){
    throw new UnsupportedOperationException("Unimplemented method'addRequirements'");

  }
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    m_shooter.spin(0.5);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interupted) {
    m_shooter.motorOff();

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
