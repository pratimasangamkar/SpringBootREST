package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Topic;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic(11,"Core Java","Core dava Description"),
			new Topic(12,"Spring Batch","Spring Batch Demo")
			
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(int id){
		return topics.stream().filter(x -> x.getId() == id).findFirst().get();
	}

	public void addTopic(Topic topic){
		topics.add(topic);
	}
	
	public void updateTopic(int id, Topic topic){
		
		topics.stream().filter(x -> x.getId() == id).map(x -> x=topic);
	}
	
	public void deleteTopic(int id){
		topics .removeIf(x -> x.getId()==id);
	}
}
