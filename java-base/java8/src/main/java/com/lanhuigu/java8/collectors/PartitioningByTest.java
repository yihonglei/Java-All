package com.lanhuigu.java8.collectors;

import com.lanhuigu.java8.stream.Dish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: $CLASS_NAME
 * @Package: com.lanhuigu.java8.collectors
 * @date 2018/3/11 10:58
 */
public class PartitioningByTest {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );

        Map<Boolean, List<Dish>> partitionedMenu =
                menu.stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        List<Dish> dishes = partitionedMenu.get(true);

        dishes.forEach(d -> System.out.println(d.getName()));
    }
}
