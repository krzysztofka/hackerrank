package com.kali.algo

import spock.lang.Specification
import spock.lang.Unroll

import static com.kali.algo.CountTriplets.countTriplets

class CountTripletsTest extends Specification {

    @Unroll
    def "should change #input to #output"() {
        expect:
        countTriplets(input, r) == output

        where:
        input                      | r | output
        [1L, 2L, 2L, 4L]           | 2L | 2L
        [1L, 2L, 1L, 2L, 4L]       | 2 | 3
        [1L, 3L, 9L, 9L, 27L, 81L] | 3 | 6
        [1L]                       | 1 | 0
        [1L, 1L]                   | 1 | 0
        [1L, 1L, 1L]               | 1 | 1
        [1L, 1L, 1L, 1L]           | 1 | 4
        [1L, 1L, 1L, 1L, 1L]       | 1 | 10


    }
}
