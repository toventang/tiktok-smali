package com.ss.android.ugc.aweme.commercialize.log;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.discover.model.Banner;
import h.f.a.m;
import java.util.Map;

public final /* synthetic */ class r implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Map f74832a;

    /* renamed from: b  reason: collision with root package name */
    private final Banner f74833b;

    static {
        Covode.recordClassIndex(46125);
    }

    public r(Map map, Banner banner) {
        this.f74832a = map;
        this.f74833b = banner;
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        f.b bVar = (f.b) obj;
        return ((Boolean) obj2).booleanValue() ? bVar.a(this.f74832a) : bVar.a(this.f74833b);
    }
}
