package org.firstinspires.ftc.teamcode.TeleOp;


import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;


@TeleOp
public class TeleOpMode extends LinearOpMode {

    public void runOpMode() {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);
        drive.setPoseEstimate(new Pose2d(0, 0, 0));
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        waitForStart();
        while(opModeIsActive()) {
            drive.update();
            double gamepadX = -gamepad1.left_stick_x;
            double gamepadY = -gamepad1.left_stick_y;
            double r = Math.hypot(gamepadX, gamepadY);
            //i like cheese
        }

    }

}
