package com.snoweagle.lab.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.TopicPartition;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by snoweagle on 01/12/2016.
 */
public class TestConsumer {
    public static void main(String[] args) throws InterruptedException {
        Properties props = new Properties();
        props.put("bootstrap.servers", "210.209.85.161:9092");

        //消费者的组id
        props.put("group.id", "test");//这里是GroupA或者GroupB
        props.put("enable.auto.commit", "true");
        props.put("auto.commit.interval.ms", "1000");
        //从poll(拉)的回话处理时长
        props.put("session.timeout.ms", "30000");
        //poll的数量限制
        props.put("max.poll.records", "100");
        props.put("auto.offset.reset", "earliest");

        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);
        //订阅主题列表topic
        consumer.subscribe(Arrays.asList("chat"));

        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(100);
            System.out.println(records.isEmpty());
            for (ConsumerRecord<String, String> record : records){
                System.out.printf("offset = %d, key = %s, value = %s\n", record.offset(), record.key(), record.value());
            //            consumer.commitSync();

                        System.out.println(record.key()+"说:"+record.value());
             }
            TimeUnit.SECONDS.sleep(3L);
        }


    }
}
