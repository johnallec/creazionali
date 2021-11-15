package com.johnny.creazionali.Creature_AF.client;

import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.johnny.creazionali.Creature_AF.Creatura;
import com.johnny.creazionali.Creature_AF.creature.Ghoul;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.IOException;
public class Main {
	public static void main(String[] args) {
		Crea c = new Crea();
		List<Creatura> listaCreature = c.get(new Ghoul());
		for(Creatura creatura : listaCreature)
			System.out.println(creatura.toString());
		JFrame frame = new JFrame();
		frame.setSize(800,800);
		JPanel panel = new JPanel(new GridLayout());
		for(Creatura creatura : listaCreature){
			Image img;
			try {
				img = ImageIO.read(creatura.getPathImg());
				JLabel label = new JLabel();
				label.setSize(80,110);
				label.setVisible(true);
				img = img.getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
				label.setIcon(new ImageIcon(img));
				panel.add(label);
			} catch (IOException e) {
				System.out.println("AHIAHIAHI");
				e.printStackTrace();
			}
			
		}
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
