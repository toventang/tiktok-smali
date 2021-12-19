package com.lynx.tasm.c;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public class e extends b {

    /* renamed from: a  reason: collision with root package name */
    private String f56493a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, Object> f56494b;

    static {
        Covode.recordClassIndex(35249);
    }

    @Override // com.lynx.tasm.c.b
    public final Map<String, Object> a() {
        HashMap<String, Object> hashMap = this.f56494b;
        if (hashMap == null) {
            return null;
        }
        return hashMap;
    }

    @Override // com.lynx.tasm.c.b
    public final String b() {
        String str = this.f56493a;
        if (str != null) {
            return str;
        }
        return "params";
    }

    public e(int i2, String str) {
        super(i2, str);
    }

    public final void a(String str, HashMap<String, Object> hashMap) {
        this.f56493a = str;
        this.f56494b = hashMap;
    }
}
