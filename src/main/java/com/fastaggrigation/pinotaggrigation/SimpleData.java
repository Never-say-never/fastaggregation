package com.fastaggrigation.pinotaggrigation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
public final class SimpleData {
    private final String name;
    private final String surname;

    private final Long val1;
    private final Long val2;
    private final Long val3;
    private final Long val4;
    private final Long val5;
    private final Long val6;
    private final Long val7;
    private final Long val8;
    private final Long val9;
    private final Long val0;

    private final Double aggrVal1;
    private final Double aggrVal2;
    private final Double aggrVal3;
    private final Double aggrVal4;
    private final Double aggrVal5;
    private final Double aggrVal6;
    private final Double aggrVal7;
    private final Double aggrVal8;
    private final Double aggrVal9;
    private final Double aggrVal0;

    private final Long timestamp;
}
