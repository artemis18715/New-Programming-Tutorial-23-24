package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp
public class motor extends OpMode {
    DcMotor motor;
    @Override
    public void init() {
        motor = hardwareMap.get(DcMotor.class, "motor");
        telemetry.addData("Hardware: ", "Initialized");
    }

    @Override
    public void loop() {
        if(gamepad1.left_stick_y > 0){
            motor.setPower(0.5);
        }
        motor.setPower(0);

    }
}