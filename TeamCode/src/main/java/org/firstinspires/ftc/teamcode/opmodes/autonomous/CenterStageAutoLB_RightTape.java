package org.firstinspires.ftc.teamcode.opmodes.autonomous;
import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.roadrunner.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.roadrunner.trajectorysequence.TrajectorySequence;

@Autonomous(name = "LeftBlueRight")
public class CenterStageAutoLB_RightTape extends LinearOpMode {
    @Override
    public void runOpMode()
    {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);
        Pose2d myPose = new Pose2d(16, 63, Math.toRadians(90));

        drive.setPoseEstimate(myPose);

        TrajectorySequence trajSeq = drive.trajectorySequenceBuilder(myPose)

                .lineToLinearHeading(new Pose2d(12, 31, Math.toRadians(0)))
                .waitSeconds(1)
                .lineToLinearHeading(new Pose2d(10, 31, Math.toRadians(0)))
                .waitSeconds(1)
                .lineToLinearHeading(new Pose2d(55, 36, Math.toRadians(180)))
                .waitSeconds(1)
                .lineToLinearHeading(new Pose2d(47, 36, Math.toRadians(180)))
                .waitSeconds(1)
                .lineToLinearHeading(new Pose2d(47, 66, Math.toRadians(180)))
                .lineToLinearHeading(new Pose2d(62, 66, Math.toRadians(180)))
                .build();

        drive.followTrajectorySequence(trajSeq);
    }
}
