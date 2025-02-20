package ir.maktabsharif.Hw5.q1;

public class ShootingTest {
    protected int number;

    protected static Soldier[] setRandomSoldiers(int size) {
        Soldier[] soldiers = new Soldier[size];
        for (int i = 0; i < soldiers.length; i++) {
            soldiers[i] = new Soldier();
            soldiers[i].setId(i + 4021654041L);
            soldiers[i].setRank(Rank.LIEUTENANT);
            Bullet[] bullets = setRandomBullets(4, soldiers[i]);
            soldiers[i].setBullets(bullets);
            int score = calculateScore(bullets);
            soldiers[i].setScore(score);
            soldiers[i].setInitialRank(soldiers[i].getRank());
            if (soldiers[i].getScore() >= 28) {
                if (soldiers[i].getRank() == Rank.LIEUTENANT) {
                    soldiers[i].setRank(Rank.SERGEANT);
                }
                if (soldiers[i].getRank() == Rank.SERGEANT) {
                    soldiers[i].setRank(Rank.CORPORAL);
                }
                if (soldiers[i].getRank() == Rank.CORPORAL) {
                    soldiers[i].setRank(Rank.CORPORAL);
                }
            } else if (soldiers[i].getRank() == Rank.CORPORAL) {
                soldiers[i].setRank(Rank.SERGEANT);
            } else if (soldiers[i].getRank() == Rank.SERGEANT) {
                soldiers[i].setRank(Rank.LIEUTENANT);
            }
        }
        return soldiers;
    }


    protected static Bullet[] setRandomBullets(int count, Soldier soldier) {
        Bullet[] bullets = new Bullet[count];
        for (int i = 0; i < bullets.length; i++) {
            bullets[i] = new Bullet();
            bullets[i].setCount(i + 1);
            bullets[i].setPoint(getRandom(16));
            bullets[i].setSoldier(soldier);
        }
        return bullets;
    }

    protected static int calculateScore(Bullet[] bullets) {
        int score = 0;
        for (Bullet bullet : bullets) {
            score = bullet.getPoint() + score;
        }
        return score;
    }

    protected static int getRandom(int range) {
        int random = (int) (Math.random() * range);
        return random;
    }

    protected static void scoreCheck(Soldier[] soldiers) {
        int sumScore = 0;
        for (Soldier soldier : soldiers) {
            sumScore += soldier.getScore();
        }
        int meanScore = sumScore / 15;
        System.out.println(meanScore);
    }

    protected static void updateRanks(Soldier[] soldiers) {
        for (Soldier soldier : soldiers) {
            soldier.setInitialRank(soldier.getRank());
            updateRanks(soldiers);
        }
    }
    protected static double checkRankPercentage(Soldier[] soldiers) {
        int corporalCount = 0;
        for (Soldier soldier : soldiers) {
            if (soldier.getRank() == Rank.CORPORAL) {
                corporalCount++;
            }
        }
        return (double) corporalCount / soldiers.length * 100;
    }
    protected static void repeatUntilTarget(Soldier[] soldiers, int targetPercentage) {
        int attempt = 1;
        while (true) {
            System.out.println("Shooting Test " + attempt);
            System.out.println("====================");
            for (Soldier soldier : soldiers) {
                System.out.println(soldier);
            }
            double corporalPercentage = checkRankPercentage(soldiers);
            System.out.println("Percentage of Corporals: " + corporalPercentage + "%");
            if (corporalPercentage >= targetPercentage) {
                System.out.println("Target achieved! Test ends.");
                break;
            }
            System.out.println("Target not reached. Repeating the test...");
            for (Soldier soldier : soldiers) {
                Bullet[] bullets = setRandomBullets(4, soldier);
                soldier.setBullets(bullets);
                int score = calculateScore(bullets);
                soldier.setScore(score);

                soldier.setInitialRank(soldier.getRank());
                updateRanks(soldiers);
            }

            attempt++;
        }
    }
}

