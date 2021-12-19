package com.ss.android.i;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public String f59577a;

    /* renamed from: b  reason: collision with root package name */
    public int f59578b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, Object> f59579c;

    static {
        Covode.recordClassIndex(36778);
    }

    public final String toString() {
        Map<String, Object> map = this.f59579c;
        String str = "";
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                str = str + "[key:" + ((Object) entry.getKey()) + " value: " + entry.getValue() + "]";
            }
        }
        return "event: " + this.f59577a + " send channels: " + this.f59578b + " info: " + str;
    }

    public c(String str, Map<String, Object> map, int i2) {
        this.f59577a = str;
        this.f59579c = map;
        this.f59578b = i2;
    }
}
