package com.bytedance.ies.ugc.aweme.commercialize.splash.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ad.splash.c.a;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.ag;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.List;
import java.util.concurrent.Callable;

final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final List f34758a;

    static {
        Covode.recordClassIndex(20848);
    }

    d(List list) {
        this.f34758a = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<a> list = this.f34758a;
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
        if (f2 == null) {
            return null;
        }
        for (a aVar : list) {
            f2.a().a(Integer.valueOf(aVar.y()), aVar.l(), aVar.z(), aVar.m(), (ag) GsonHolder.c().b().a(aVar.E(), ag.class));
        }
        return null;
    }
}
