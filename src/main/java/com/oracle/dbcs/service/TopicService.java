package com.oracle.dbcs.service;

import com.oracle.dbcs.bean.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    //Arrays.asList will create immutable list
   private List<Topic> topics = new ArrayList(Arrays.asList(
           new Topic("spring", "Spring Framework", "Spring framework Description"),
           new Topic("java", "core java", "core java Description"),
           new Topic("javascript", "Javascript", "javascript Description")

           ));

   public List<Topic> getAllTopics() {
       return topics;
   }

   public Topic getTopic(String id) {
       return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
   }

   public void addTopic(Topic topic) {
       topics.add(topic);
   }

   public void updateTopic(String id, Topic topic) {
       Topic updateTopic = topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
        topics.remove(updateTopic);
        topics.add(topic);
    };

   public void deleteTopic(String id) {
        Topic updateTopic = topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
        topics.remove(updateTopic);
    };


}
