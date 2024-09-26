package frc.team578.robot.commands.auto.commandgroups;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.team578.robot.commands.ShooterSingleShotCommand;
import frc.team578.robot.commands.auto.AutoTurnToHeading;

public class PenfieldRightShot  extends CommandGroup {

    public PenfieldRightShot(int shooterRPM) {
        addSequential(new MoveBackwardOffLine());
        addSequential(new ShooterSingleShotCommand(shooterRPM));
    }

    public PenfieldRightShot() {
        addSequential(new MoveBackwardOffLine());
        addSequential(new ShooterSingleShotCommand());
    }
}
