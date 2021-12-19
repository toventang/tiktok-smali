package com.ss.android.ugc.aweme.choosemusic.h.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.app.f.d;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f70563a = new HashMap();

    static {
        Covode.recordClassIndex(43516);
    }

    public final a a(Map<? extends String, ? extends String> map) {
        if (map != null) {
            this.f70563a.putAll(map);
        }
        return this;
    }

    public final a a(String str, String str2) {
        return a(str, str2, d.a.f66731a);
    }

    public final a a(String str, int i2) {
        return a(str, String.valueOf(i2), d.a.f66731a);
    }

    public final a a(String str, Object obj) {
        if (obj != null) {
            a(str, new f().b(obj));
        }
        return this;
    }

    private a a(String str, String str2, d.a aVar) {
        this.f70563a.put(str, aVar.a(str2));
        return this;
    }
}
