package com.kali.algo

import spock.lang.Specification
import spock.lang.Unroll

import static com.kali.algo.FreqQuery.freqQuery

class FreqQueryTest extends Specification {


    @Unroll
    def "should change #input to #output"() {
        expect:
        freqQuery(input) == output

        where:
        input                                                              | output
        [[1, 5], [1, 6], [3, 2], [1, 10], [1, 10], [1, 6], [2, 5], [3, 2]] | [0, 1]
    }

}
