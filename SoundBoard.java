import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.*;
import java.io.*;

public class SoundBoard extends JFrame /*implements KeyListener, ActionListener*/ {
	
	JTextArea displayArea;
	static final String newline = System.getProperty("line.separator");
	private SourceDataLine line;
	private AudioInputStream a;
	private static Clip[] myClips = new Clip[26];
	private static int clipCount = 0;
	
	public SoundBoard(String name) {
		super(name);
		
		createNote("damn-son.wav");
		createNote("Explosion.wav");
		createNote("Funny-reactions.wav");
		createNote("hitmarker.wav");
		createNote("Illuminati-Confirmed-Sound-Effect.wav");
		createNote("MLG-Horns-Sound-Effect.wav");
		createNote("mom-get-the-camera.wav");
		createNote("OH-BABY-A-TRIPLE.wav");
		createNote("Sad-distorted-violin-full.wav");
		createNote("sanic-hedgehog.wav");
		createNote("Shrek-What-Are-You-Doing-in-My-Swamp.wav");
		createNote("Sike-That's-the-wrong-Number.wav");
		createNote("Smoke-weed-everyday.wav");
		createNote("Spooky-Scary-Skeleton.wav");
		createNote("Tactical-Nuke-sound-MW2.wav");
		createNote("Whatcha-Say.wav");
		createNote("Wombo-Combo-reactions.wav");
		createNote("WoW.wav");
		createNote("sandstorm.wav");
		createNote("rickroll.wav");
		createNote("yee-mania.wav");
		createNote("sanic.wav");
		createNote("helicopter.wav");
		createNote("navy-seal.wav");
		createNote("john-cena.wav");
		createNote("just-do-it.wav");
		createNote("shots-fired.wav");
		createNote("never-done-that.wav");

		addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				displayInfo(e);
			}

			/** Handle the key-pressed event from the text field. */
			public void keyPressed(KeyEvent e) {
				displayInfo(e);
				//System.out.println(e.getKeyChar());
				switch (e.getKeyCode()) {
					case KeyEvent.VK_H:
						myClips[0].start();
						myClips[0].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_J:
						myClips[1].start();
						myClips[1].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_A:
						myClips[2].start();
						myClips[2].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_S:
						myClips[3].start();
						myClips[3].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_D:
						myClips[4].start();
						myClips[4].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_F:
						myClips[5].start();
						myClips[5].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_G:
						myClips[6].start();
						myClips[6].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_K:
						myClips[7].start();
						myClips[7].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_L:
						myClips[8].start();
						myClips[8].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_O:
						myClips[9].start();
						myClips[9].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_P:
						myClips[10].start();
						myClips[10].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_W:
						myClips[11].start();
						myClips[11].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_E:
						myClips[12].start();
						myClips[12].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_R:
						myClips[13].start();
						myClips[13].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_T:
						myClips[14].start();
						myClips[14].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_Y:
						myClips[15].start();
						myClips[15].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_U:
						myClips[16].start();
						myClips[16].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_I:
						myClips[17].start();
						myClips[17].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_Q:
						myClips[18].start();
						myClips[18].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_Z:
						myClips[19].start();
						myClips[19].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_X:
						myClips[20].start();
						myClips[20].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_C:
						myClips[21].start();
						myClips[21].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_V:
						myClips[22].start();
						myClips[22].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_B:
						myClips[23].start();
						myClips[23].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_N:
						myClips[24].start();
						myClips[24].loop(Clip.LOOP_CONTINUOUSLY);
						break;
					case KeyEvent.VK_M:
						myClips[25].start();
						myClips[25].loop(Clip.LOOP_CONTINUOUSLY);
						break;
				}
			}

			/** Handle the key-released event from the text field. */
			public void keyReleased(KeyEvent e) {
				displayInfo(e);
				switch (e.getKeyCode()) {
					case KeyEvent.VK_H:
						myClips[0].stop();
						myClips[0].setFramePosition(0);
						break;
					case KeyEvent.VK_J:
						myClips[1].stop();
						myClips[1].setFramePosition(0);
						break;
					case KeyEvent.VK_A:
						myClips[2].stop();
						myClips[2].setFramePosition(0);
						break;
					case KeyEvent.VK_S:
						myClips[3].stop();
						myClips[3].setFramePosition(0);
						break;
					case KeyEvent.VK_D:
						myClips[4].stop();
						myClips[4].setFramePosition(0);
						break;
					case KeyEvent.VK_F:
						myClips[5].stop();
						myClips[5].setFramePosition(0);
						break;
					case KeyEvent.VK_G:
						myClips[6].stop();
						myClips[6].setFramePosition(0);
						break;
					case KeyEvent.VK_K:
						myClips[7].stop();
						myClips[7].setFramePosition(0);
						break;
					case KeyEvent.VK_L:
						myClips[8].stop();
						myClips[8].setFramePosition(0);
						break;
					case KeyEvent.VK_O:
						myClips[9].stop();
						myClips[9].setFramePosition(0);
						break;
					case KeyEvent.VK_P:
						myClips[10].stop();
						myClips[10].setFramePosition(0);
						break;
					case KeyEvent.VK_W:
						myClips[11].stop();
						myClips[11].setFramePosition(0);
						break;
					case KeyEvent.VK_E:
						myClips[12].stop();
						myClips[12].setFramePosition(0);
						break;
					case KeyEvent.VK_R:
						myClips[13].stop();
						myClips[13].setFramePosition(0);
						break;
					case KeyEvent.VK_T:
						myClips[14].stop();
						myClips[14].setFramePosition(0);
						break;
					case KeyEvent.VK_Y:
						myClips[15].stop();
						myClips[15].setFramePosition(0);
						break;
					case KeyEvent.VK_U:
						myClips[16].stop();
						myClips[16].setFramePosition(0);
						break;
					case KeyEvent.VK_I:
						myClips[17].stop();
						myClips[17].setFramePosition(0);
						break;
					case KeyEvent.VK_Q:
						myClips[18].stop();
						myClips[18].setFramePosition(0);
					case KeyEvent.VK_Z:
						myClips[19].stop();
						myClips[19].setFramePosition(0);
						break;
					case KeyEvent.VK_X:
						myClips[20].stop();
						myClips[20].setFramePosition(0);
						break;
					case KeyEvent.VK_C:
						myClips[21].stop();
						myClips[21].setFramePosition(0);
						break;
					case KeyEvent.VK_V:
						myClips[22].stop();
						myClips[22].setFramePosition(0);
						break;
					case KeyEvent.VK_B:
						myClips[23].stop();
						myClips[23].setFramePosition(0);
						break;
					case KeyEvent.VK_N:
						myClips[24].stop();
						myClips[24].setFramePosition(0);
						break;
					case KeyEvent.VK_M:
						myClips[25].stop();
						myClips[25].setFramePosition(0);
						break;
				}
			}
		});
		setFocusable(true);
	}
	
	public void createNote(String noteName) {
		try {
			File file = new File("sounds/"+noteName);
			if (file.exists()) {
				myClips[clipCount] = AudioSystem.getClip();
				AudioInputStream ais = AudioSystem.getAudioInputStream(file.toURI().toURL());
				myClips[clipCount].open(ais);
				clipCount++;
			}
			else {
				throw new RuntimeException("Sound: file not found.");
			}
		} catch (Exception e){ }
	}
	
	public void displayInfo(KeyEvent e) {
		displayArea.append(e.getKeyChar() + newline);
	}
	
	private void play(SourceDataLine sourceLine, Note note, int ms) {
        ms = Math.min(ms, Note.SECONDS * 1000);
        int length = Note.SAMPLE_RATE * ms / 1000;
		int count = sourceLine.write(note.data(), 0, length);
    }
	
	public static void createAndShowGUI() {
		SoundBoard frame = new SoundBoard("SoundBoard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addComponentsToPane();
        frame.pack();
        frame.setVisible(true);
	}
	
	public void addComponentsToPane(){

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setPreferredSize(new Dimension(375, 125));
        
        getContentPane().add(scrollPane, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}
}