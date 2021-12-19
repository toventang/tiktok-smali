package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public class VEEffectParams {
    public static int EFFECT_TYPE_APPEND_COMPOSER = 6;
    public static int EFFECT_TYPE_APPEND_COMPOSER_WITH_TAG = 2;
    public static int EFFECT_TYPE_RELOAD_COMPOSER = 5;
    public static int EFFECT_TYPE_RELOAD_COMPOSER_WITH_TAG = 1;
    public static int EFFECT_TYPE_REMOVE_COMPOSER = 9;
    public static int EFFECT_TYPE_REPLACE_COMPOSER = 7;
    public static int EFFECT_TYPE_REPLACE_COMPOSER_WITH_TAG = 3;
    public static int EFFECT_TYPE_SET_COMPOSER = 4;
    public static int EFFECT_TYPE_SET_COMPOSER_WITH_TAG;
    public static int EFFECT_TYPE_UPDATE_COMPOSER = 8;
    public int TYPE;
    public ArrayList<Boolean> boolArrayValue = new ArrayList<>();
    public boolean boolValueOne;
    public boolean boolValueThree;
    public boolean boolValueTwo;
    public ArrayList<Float> floatArrayValue = new ArrayList<>();
    public float floatValueOne;
    public float floatValueThree;
    public float floatValueTwo;
    public ArrayList<Integer> intArrayValue = new ArrayList<>();
    public int intValueOne;
    public int intValueThree;
    public int intValueTwo;
    public ArrayList<String> stringArrayOne = new ArrayList<>();
    public ArrayList<String> stringArrayThree = new ArrayList<>();
    public ArrayList<String> stringArrayTwo = new ArrayList<>();
    public String stringValueOne = "";
    public String stringValueThree = "";
    public String stringValueTwo = "";

    static {
        Covode.recordClassIndex(99137);
    }

    public String toString() {
        return "type:" + this.TYPE + " int1: " + this.intValueOne + " int2: " + this.intValueTwo + " int3: " + this.intValueThree + " float1: " + this.floatValueOne + " float2: " + this.floatValueTwo + " float3: " + this.floatValueThree + " bool1: " + this.boolValueOne + " bool2: " + this.boolValueTwo + " bool3: " + this.boolValueThree + " string1: " + this.stringValueOne + " string2: " + this.stringValueTwo + " string3: " + this.stringValueThree + " intA: " + this.intArrayValue.toString() + " floatA: " + this.floatArrayValue.toString() + " boolA: " + this.boolArrayValue.toString() + " stringA1: " + this.stringArrayOne.toString() + " stringA2: " + this.stringArrayTwo.toString() + " stringA3: " + this.stringArrayThree.toString();
    }
}
