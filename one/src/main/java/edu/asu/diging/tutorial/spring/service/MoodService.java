package edu.asu.diging.tutorial.spring.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;

@Service
public class MoodService implements MoodServiceInterface{

	String[] moods;
	String[] reasons;
	String[] meanings;
		
	public Mood getCurrentMood(){
		Random random = new Random();
		int index = random.nextInt(moods.length);
		return new Mood(moods[index], reasons[index], meanings[index]);
	}

	public void congiure() {
		moods = new String[] {"happy", "sad", "disgust"};
		reasons = new String[] {"work done", "no long weekend", "they donot keep my word"};	
		meanings = new String[] {"feeling or showing pleasure or contentment", "feeling or showing sorrow; unhappy", "a feeling of revulsion or profound disapproval aroused by something unpleasant or offensive"};
	}
}
