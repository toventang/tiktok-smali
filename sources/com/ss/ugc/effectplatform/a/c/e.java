package com.ss.ugc.effectplatform.a.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f153434a;

    /* renamed from: b  reason: collision with root package name */
    public final c f153435b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f153436c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, Object> f153437d;

    /* renamed from: e  reason: collision with root package name */
    public final String f153438e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f153439f;

    static {
        Covode.recordClassIndex(102316);
    }

    private e(String str, c cVar, Map<String, ? extends Object> map, String str2, boolean z) {
        l.c(str, "");
        l.c(cVar, "");
        l.c(str2, "");
        this.f153434a = str;
        this.f153435b = cVar;
        this.f153436c = null;
        this.f153437d = map;
        this.f153438e = str2;
        this.f153439f = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, c cVar, Map map, String str2, boolean z, int i2) {
        this(str, (i2 & 2) != 0 ? c.GET : cVar, (i2 & 8) != 0 ? null : map, (i2 & 16) != 0 ? "application/x-www-form-urlencoded" : str2, (i2 & 32) != 0 ? true : z);
    }
}
