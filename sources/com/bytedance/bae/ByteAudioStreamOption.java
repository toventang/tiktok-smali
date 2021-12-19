package com.bytedance.bae;

import com.bytedance.covode.number.Covode;

public class ByteAudioStreamOption {
    private int key;
    private Object value;

    static {
        Covode.recordClassIndex(15322);
    }

    public void setValue(int i2, Float f2) {
    }

    public void setValue(int i2, Long l2) {
    }

    public int getType() {
        return this.key;
    }

    public static ByteAudioStreamOption create() {
        return new ByteAudioStreamOption();
    }

    public Float floatValue(int i2) {
        return Float.valueOf(Float.NaN);
    }

    public Long longValue(int i2) {
        return Long.MIN_VALUE;
    }

    public boolean boolValue(int i2) {
        return Boolean.parseBoolean(this.value.toString());
    }

    public int intValue(int i2) {
        return Integer.parseInt(this.value.toString());
    }

    public void setValue(int i2, Boolean bool) {
        this.value = bool;
        this.key = i2;
    }

    public void setValue(int i2, Integer num) {
        this.value = num;
        this.key = i2;
    }

    public void nativeSetValue(int i2, int i3) {
        boolean z;
        if (i2 == 20000 || i2 == 20003 || i2 == 20004 || i2 == 20005 || i2 == 20006 || i2 == 20008 || i2 == 20009 || i2 == 2) {
            setValue(i2, new Integer(i3));
        } else if (i2 == 10001 || i2 == 10002 || i2 == 20001 || i2 == 20002 || i2 == 20007 || i2 == 14) {
            if (i3 != 0) {
                z = true;
            } else {
                z = false;
            }
            setValue(i2, Boolean.valueOf(z));
        }
    }
}
