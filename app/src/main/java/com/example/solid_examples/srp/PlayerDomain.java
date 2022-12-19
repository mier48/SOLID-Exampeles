package com.example.solid_examples.srp;

public class PlayerDomain {

    Double winPercentage(Player player) {
        return (double) (player.getWin() / (player.getWin() + player.getLose()));
    }

    Double losePercentage(Player player) {
        return 0.0;
    }
}
