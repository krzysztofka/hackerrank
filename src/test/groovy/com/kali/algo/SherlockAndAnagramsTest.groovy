package com.kali.algo

import spock.lang.Specification
import spock.lang.Unroll

import static com.kali.algo.SherlockAndAnagrams.sherlockAndAnagrams

class SherlockAndAnagramsTest extends Specification {

    @Unroll
    def "should change #input to #output"() {
        expect:
        sherlockAndAnagrams(input) == output

        where:
        input        | output
        "abba"       | 4
        "abcd"       | 0
        "ifailuhkqq" | 3
        "kkkk"       | 10
    }
}
