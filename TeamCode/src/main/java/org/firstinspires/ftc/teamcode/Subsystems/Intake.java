package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.Command;
import com.seattlesolvers.solverslib.command.InstantCommand;
import com.seattlesolvers.solverslib.command.SubsystemBase;
import com.seattlesolvers.solverslib.hardware.motors.Motor;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Intake extends SubsystemBase {
    Motor intake;
    public Intake(HardwareMap hwMap, Telemetry telemetry) {
        Motor intake = new Motor(hwMap, "intake");
    }

    private void setPower(int power) {
        intake.set(power);
    }

    public Command intake() {
        return new InstantCommand(() -> setPower(1));
    }

    public Command outtake() {
        return new InstantCommand(() -> setPower(-1));
    }

    public Command stop() {
        return new InstantCommand(() -> setPower(0));
    }
}
