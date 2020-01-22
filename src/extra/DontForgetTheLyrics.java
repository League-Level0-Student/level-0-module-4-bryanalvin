package extra;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	
	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
JOptionPane.showMessageDialog(null, "I shall explain the game.Yu have to guess the rest of the lyrics of this thing i made ok?");
		// 5. Use the playSound method to play your song.
playSound("Sup.wav");
		// 6. Make a pop-up for the player to type their answer.
String Music=JOptionPane.showInputDialog("Now type your answer.");
		// 7. If they answered correctly, tell them that they were right.
if (Music.equalsIgnoreCase("Girls Like you")) {
	JOptionPane.showMessageDialog(null, "Your Right!");
}
else { JOptionPane.showMessageDialog(null, "Your Wrong.");
	
}
if (Music.equalsIgnoreCase("Barnes Firm")) {
	JOptionPane.showMessageDialog(null, "Your Right!");
}
else { JOptionPane.showMessageDialog(null, "Your Wrong.");
	
}
playSound("Copyright.wav");
// 6. Make a pop-up for the player to type their answer.
JOptionPane.showInputDialog("Now type your answer.");
// 7. If they answered correctly, tell them that they were right.

// 8. Otherwise, tell them they are wrong, and give them the answer.


		// 10. [optional] Add a points variable that will calculate their final score.
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}


