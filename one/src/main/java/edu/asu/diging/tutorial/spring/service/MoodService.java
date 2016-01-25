package edu.asu.diging.tutorial.spring.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;

@Service
public class MoodService implements MoodServiceInterface{

	String[] moods;
	String[] reasons;
		
	public Mood getCurrentMood(){
		Random random = new Random();
		int index = random.nextInt(moods.length);
		return new Mood(moods[index], reasons[index]);
	}

	public void congiure() {
		moods = new String[] {"happy", "sad", "disgust"};
		reasons = new String[] {"work done", "no long weekend", "they donot keep my word"};		
	}
}
