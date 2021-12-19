package com.lynx.tasm.c;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public class c extends b {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f56489a = new HashMap();

    static {
        Covode.recordClassIndex(35247);
    }

    @Override // com.lynx.tasm.c.b
    public final String b() {
        return "detail";
    }

    @Override // com.lynx.tasm.c.b
    public final Map<String, Object> a() {
        return this.f56489a;
    }

    public final void a(String str, Object obj) {
        this.f56489a.put(str, obj);
    }

    public c(int i2, String str) {
        super(i2, str);
    }
}
