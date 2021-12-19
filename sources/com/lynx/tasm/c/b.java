package com.lynx.tasm.c;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public class b extends d {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f56488a;

    static {
        Covode.recordClassIndex(35246);
    }

    public String b() {
        return "params";
    }

    public Map<String, Object> a() {
        return this.f56488a;
    }

    public b(int i2, String str) {
        super(i2, str);
    }

    public b(int i2, String str, Map<String, Object> map) {
        super(i2, str);
        this.f56488a = map;
    }
}
