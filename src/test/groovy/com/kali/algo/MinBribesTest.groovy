package com.kali.algo

import spock.lang.Specification
import spock.lang.Unroll

import static com.kali.algo.MinBribes.minimumBribes

class MinBribesTest extends Specification {

    @Unroll
    def "should change #input to #output"() {
        expect:
        minimumBribes(input.toArray(new int[0])) == output

        where:
        input                    | output
        [2, 1, 5, 3, 4]          | "3"
        [1, 2, 5, 3, 7, 8, 6, 4] | "7"

    }
}
