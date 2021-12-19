package com.ss.android.ugc.aweme.commercialize.log;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.discover.model.Banner;
import h.f.a.m;
import java.util.Map;

public final /* synthetic */ class q implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Map f74830a;

    /* renamed from: b  reason: collision with root package name */
    private final Banner f74831b;

    static {
        Covode.recordClassIndex(46124);
    }

    public q(Map map, Banner banner) {
        this.f74830a = map;
        this.f74831b = banner;
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        f.b bVar = (f.b) obj;
        return ((Boolean) obj2).booleanValue() ? bVar.a(this.f74830a) : bVar.a(this.f74831b);
    }
}
