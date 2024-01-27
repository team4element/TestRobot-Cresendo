package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import frc.robot.Constants.OperatorConstants;

public class Shooter {

    public Shooter() {
    }

    public static TalonFX leftMotor = new TalonFX(OperatorConstants.kLeftMotor);
    public static TalonFX rightMotor = new TalonFX(OperatorConstants.kRightMotor);

    public void spin(double speed) {
        leftMotor.set(speed);
        rightMotor.set(speed);
    }

    public void motorOff() {
        leftMotor.stopMotor();
        rightMotor.stopMotor();

    }

}
