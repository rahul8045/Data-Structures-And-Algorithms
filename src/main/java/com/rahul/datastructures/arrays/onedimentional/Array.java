///*
//package com.rahul.datastructures.arrays.onedimentional;
//
//import java.util.HashSet;
//import java.util.Iterator;
//
//public class Array {
//    public int[] solution(int N) {
//        // write your code in Java SE 8
//        // HashMap<Integer, HashSet<Integer>> memMap = new HashMap<Integer, HashSet<Integer>>();
//        HashSet<Integer> resultSet = new HashSet<Integer>();
//        getDecomposition(N, resultSet, false);
//        int[] result = new int[resultSet.size()];
//        Iterator<Integer> itr = resultSet.iterator();
//        for(int i=0; i<resultSet.size(); i++) {
//            result[i] = itr.next();
//        }
//        return result;
//    }
//
//    private void getDecomposition(int N, HashSet<Integer> resultSet, boolean isResultOccured) {
//        if(N == 0) {
//            isResultOccured = true;
//        } else {
//            if(isOdd(N)) {
//                resultSet.add(i);
//            } else {
//                for(int i=1; i<N; i=i+2) {
//                    if(!resultSet.contains(i)) {
//                        resultSet.add(i);
//                        if(N-i >= 0) {
//                            getDecomposition(N-i, resultSet);
//                        }
//                    } else {
//                        continue;
//                    }
//                }
//            }
//        }
//        if(!isResultOccured) {
//            resultSet = new HashSet<Integer>();
//        }
//    }
//
//    private boolean isOdd(int n) {
//        return (n%2 == 1);
//    }
//}
//*/
