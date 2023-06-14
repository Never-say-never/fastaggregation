package com.fastaggrigation.pinotaggrigation;

import ch.qos.logback.core.testUtil.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Random;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/pinot")
public class AggregationController {

    @Autowired
    private KafkaTemplate<String, SimpleData> kafkaTemplate;

    private final String[] names = {"John", "Jade", "Love", "Allen", "Barbara", "Dick", "Chrom"};
    private final String[] surnames = {"Johnson", "Jadeson", "Loveson", "Allenson", "Barbarason", "Dickson", "Chromson"};

    public void sendMessage(SimpleData msg) {
        kafkaTemplate.send("SimpleDataTable1", msg);
    }

    private SimpleData create() {
        Random random = new Random();

        return SimpleData.builder()
                .name(names[random.nextInt(names.length - 1)])
                .surname(surnames[random.nextInt(surnames.length - 1)])
                .timestamp(System.currentTimeMillis())

                .aggrVal1(random.nextDouble(100))
                .aggrVal2(random.nextDouble(10))
                .aggrVal3(random.nextDouble(10))
                .aggrVal4(random.nextDouble(100))
                .aggrVal5(random.nextDouble(100))
                .aggrVal6(random.nextDouble(100))
                .aggrVal7(random.nextDouble(100))
                .aggrVal8(random.nextDouble(100))
                .aggrVal9(random.nextDouble(100))
                .aggrVal0(random.nextDouble(100))

                .val0(random.nextLong(10000))
                .val1(random.nextLong(10000))
                .val2(random.nextLong(10000))
                .val3(random.nextLong(10000))
                .val4(random.nextLong(10000))
                .val5(random.nextLong(10000))
                .val6(random.nextLong(10000))
                .val7(random.nextLong(10000))
                .val8(random.nextLong(10000))
                .val9(random.nextLong(10000))

                .build();
    }

    @GetMapping("/import")
    public String importData() {
        IntStream.range(0, 40_000_000).parallel().forEach(i -> sendMessage(create()));
        return "OK";
    }
}
