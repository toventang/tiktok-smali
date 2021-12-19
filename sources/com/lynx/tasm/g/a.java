package com.lynx.tasm.g;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, String> f56621a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public int f56622b = 0;

    static {
        Covode.recordClassIndex(35309);
    }

    public final boolean a(a aVar) {
        if (aVar == null) {
            return false;
        }
        this.f56621a = aVar.f56621a;
        this.f56622b++;
        return true;
    }

    public final void a(HashMap hashMap, String str) {
        hashMap.put(str, this.f56621a);
    }
}
