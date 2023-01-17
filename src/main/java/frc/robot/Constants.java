// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public final static class DrivetrainConstants{
        public final static int MOTOR_L1_ID = 0;
        public final static int MOTOR_L2_ID = 1;
        public final static int MOTOR_R1_ID = 2;
        public final static int MOTOR_R2_ID = 3;
        //public final static Double MAX_MOTOR_POWER = 0.8;
    }
    public final static class Binds{
        public final static int L_Y_AXIS = 1;
        public final static int R_X_AXIS = 4;
    }
    }
