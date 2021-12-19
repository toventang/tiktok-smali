package com.ss.android.ugc.aweme.poi_map.service;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import h.f.b.l;
import h.q;
import h.r;
import java.util.Objects;

public final class b implements IPoiMapService {

    /* renamed from: a  reason: collision with root package name */
    public static final b f115553a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IPoiMapService f115554b;

    @Override // com.ss.android.ugc.aweme.poi_map.service.IPoiMapService
    public final Bundle a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, Long l2, String str9, String str10, String str11, String str12, UrlModel urlModel, String str13, String str14, String str15, String str16, String str17, String str18) {
        l.d(str3, "");
        l.d(str4, "");
        return this.f115554b.a(str, str2, str3, str4, str5, str6, str7, num, str8, l2, str9, str10, str11, str12, urlModel, str13, str14, str15, str16, str17, str18);
    }

    @Override // com.ss.android.ugc.aweme.poi_map.service.IPoiMapService
    public final Class<? extends Fragment> a() {
        return this.f115554b.a();
    }

    static final class a<T> implements ServiceProvider {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f115555a;

        static {
            Covode.recordClassIndex(74478);
        }

        a(Class cls) {
            this.f115555a = cls;
        }

        @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
        public final /* synthetic */ Object get() {
            Object newInstance = this.f115555a.newInstance();
            Objects.requireNonNull(newInstance, "null cannot be cast to non-null type com.ss.android.ugc.aweme.poi_map.service.IPoiMapService");
            return newInstance;
        }
    }

    static {
        Covode.recordClassIndex(74477);
    }

    private b() {
        Object obj;
        IPoiMapService poiMapServiceEmptylmpl;
        try {
            obj = q.m223constructorimpl(Class.forName("com.ss.android.ugc.aweme.poi_map.service.PoiMapServiceImpl"));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        Class cls = (Class) (q.m228isFailureimpl(obj) ? null : obj);
        if (cls != null) {
            ServiceManager.get().bind(a.f115552a, new a(cls)).asSingleton();
            poiMapServiceEmptylmpl = (IPoiMapService) ServiceManager.get().getService(a.f115552a);
        } else {
            poiMapServiceEmptylmpl = new PoiMapServiceEmptylmpl();
        }
        l.b(poiMapServiceEmptylmpl, "");
        this.f115554b = poiMapServiceEmptylmpl;
    }
}
