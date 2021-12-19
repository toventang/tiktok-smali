package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class setPressed extends setClickable {
    private static int getMethod;
    private static int getUrl = 1;
    private final List<String> getBody;
    private final List<String> getHeaders;

    static {
        Covode.recordClassIndex(2611);
    }

    public final List<String> getBody() {
        int i2 = getMethod;
        int i3 = i2 + 49;
        getUrl = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 107;
        getUrl = i5 % 128;
        if (i5 % 2 != 0) {
            return this.getBody;
        }
        return this.getBody;
    }

    public final List<String> getUrl() {
        int i2 = (getUrl + 111) % 128;
        getMethod = i2;
        int i3 = i2 + 35;
        getUrl = i3 % 128;
        if (i3 % 2 != 0) {
            return this.getHeaders;
        }
        return this.getHeaders;
    }

    public setPressed(int i2, int i3, List<String> list, List<String> list2) {
        super(i3);
        this.getBody = list;
        this.getHeaders = list2;
    }
}
