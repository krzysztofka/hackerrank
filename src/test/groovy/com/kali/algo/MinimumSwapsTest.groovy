package com.kali.algo

import spock.lang.Specification
import spock.lang.Unroll

import static com.kali.algo.MinimumSwaps.minimumSwaps

class MinimumSwapsTest extends Specification {


    @Unroll
    def "should change #input to #output"() {
        expect:
        minimumSwaps(input.toArray(new int[0])) == output

        where:
        input                 | output
        [7, 1, 3, 2, 4, 5, 6] | 5
        [4, 3, 1, 2]          | 3
    }
}
