class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return knightIsAwake!=true;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return (knightIsAwake || archerIsAwake || prisonerIsAwake);
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake!=false && archerIsAwake!=true;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (petDogIsPresent!=false && archerIsAwake!=true) || (petDogIsPresent!=true && prisonerIsAwake!=false && knightIsAwake!=true && archerIsAwake!=true);
    }
}
