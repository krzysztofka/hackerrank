package com.kali.algo;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayManipulation {

//    static long arrayManipulation(int n, int[][] queries) {
//        long[] arr = new long[n];
//        for (int[] query: queries) {
//            arr[query[0] -1] += query[2];
//            int minus =
//        }
//    }
//
//    private static Set<Query> merge(List<Query> existing) {
//        TreeSet<Query> merged = new TreeSet<>();
//        for (Query q : existing) {
//            merge(merged, q);
//        }
//        return merged;
//    }
//
//    private static void merge(TreeSet<Query> existing, Query q) {
//        List<Query> overlapping = new ArrayList<>();
//        Iterator<Query> existingIt = existing.iterator();
//        while (existingIt.hasNext()) {
//            Query next = existingIt.next();
//            if (next.overlap(q)) {
//                overlapping.add(next);
//                existingIt.remove();
//            } else {
//                break;
//            }
//        }
//        if (overlapping.isEmpty()) {
//            existing.add(q);
//        } else {
//            range(overlapping, q)
//                    .stream()
//                    .forEach(existing::add);
//        }
//    }
//
//    private static List<Query> range(List<Query> overlapping, Query q) {
//        List<Query> list = new ArrayList<>();
//
//    }
//
//    private static List<Query> range(Query left, Query right) {
//        List<Query> result;
//        if (left.contains(right) && right.contains(left)) {
//            result = new ArrayList<>();
//            left.setSummand(left.getSummand() + right.getSummand());
//            result.add(left);
//        } else if (left.contains(right)) {
//            result = rangeContains(left, right);
//        } else if (right.contains(left)) {
//            result = rangeContains(right, left);
//        } else {
//            result = new ArrayList<>();
//            Query newQuery = new Query(left.b, right.a, left.summand + right.summand);
//            left.b = newQuery.a -1;
//            right.a = newQuery.b + 1;
//            result.add(left);
//            result.add(newQuery);
//            result.add(right);
//        }
//        return result;
//    }
//
//    private static List<Query> rangeContains(Query container, Query contained) {
//        if (contained.a == container.a) {
//
//        } else if (contained.b == container.b) {
//
//        } else {
//
//        }
//    }
//
//    private static class Query implements Comparable<Query> {
//
//        private static Comparator comparator = Comparator.comparingLong(Query::getA).thenComparing(Query::getB);
//        private int a;
//        private int b;
//        private long summand;
//
//        public Query(int a, int b, long sumand) {
//            this.a = a;
//            this.b = b;
//            this.summand = sumand;
//        }
//
//        private boolean overlap(Query other) {
//            return this.a <= other.b && this.b >= other.a || other.a <= this.b && other.b >= this.a;
//        }
//
//        private boolean contains(Query other) {
//            return this.a <= other.a && this.b >= other.b;
//        }
//
//        public int getA() {
//            return a;
//        }
//
//        public int getB() {
//            return b;
//        }
//
//        public void setA(int a) {
//            this.a = a;
//        }
//
//        public void setB(int b) {
//            this.b = b;
//        }
//
//        public void setSummand(long summand) {
//            this.summand = summand;
//        }
//
//        public long getSummand() {
//            return summand;
//        }
//
//        @Override
//        public int compareTo(Query o) {
//            return comparator.compare(this, o);
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            Query query = (Query) o;
//            return a == query.a &&
//                    b == query.b &&
//                    summand == query.summand;
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(a, b);
//        }
//    }
}
