package org.firstinspires.ftc.teamcode.Teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.seattlesolvers.solverslib.command.InstantCommand;
import com.seattlesolvers.solverslib.command.RunCommand;
import com.seattlesolvers.solverslib.command.button.GamepadButton;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;
import com.seattlesolvers.solverslib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.Subsystems.Intake;

public class IntakeTeleop extends CommandOpMode {
    public Intake intake;

    @Override
    public void initialize() {
        intake = new Intake(hardwareMap, telemetry);

        GamepadEx gamepadEx = new GamepadEx(gamepad1);

        gamepadEx.getGamepadButton(GamepadKeys.Button.A)
                .whenPressed(new InstantCommand(intake::intake, intake));

        gamepadEx.getGamepadButton(GamepadKeys.Button.B)
                .whenPressed(new InstantCommand(intake::outtake, intake));

        gamepadEx.getGamepadButton(GamepadKeys.Button.Y)
                .whenPressed(new InstantCommand(intake::stop, intake));
    }
}
