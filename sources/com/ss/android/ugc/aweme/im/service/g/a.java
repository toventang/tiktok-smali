package com.ss.android.ugc.aweme.im.service.g;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import java.util.Map;

public abstract class a {

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, Object> f103861f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, Object> f103862g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, Object> f103863h;

    static {
        Covode.recordClassIndex(66534);
    }

    public a() {
        this(null, null, null, 7);
    }

    private a(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
        l.d(map, "");
        l.d(map2, "");
        l.d(map3, "");
        this.f103861f = map;
        this.f103862g = map2;
        this.f103863h = map3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Map map, Map map2, Map map3, int i2) {
        this((i2 & 1) != 0 ? ag.a() : map, (i2 & 2) != 0 ? ag.a() : map2, (i2 & 4) != 0 ? ag.a() : map3);
    }
}
