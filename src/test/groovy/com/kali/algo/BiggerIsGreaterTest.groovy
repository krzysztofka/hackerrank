package com.kali.algo

import spock.lang.Specification
import spock.lang.Unroll

import static com.kali.algo.BiggerIsGreater.biggerIsGreater

class BiggerIsGreaterTest extends Specification {


    @Unroll
    def "should change #input to #output"() {
        expect:

        biggerIsGreater(input) == output
        where:
        input  | output
        "ab"   | "ba"
        "bb"   | "no answer"
        "hefg" | "hegf"
        "dhck" | "dhkc"
        "dkhc" | "hcdk"
    }
}
