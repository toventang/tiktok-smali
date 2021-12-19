package com.ss.android.ugc.aweme.commercialize.preview.manager;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.preview.api.AdsPreviewApi;
import com.ss.android.ugc.aweme.commercialize.preview.c.a;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class AdsPreviewStateManager implements au {

    /* renamed from: f  reason: collision with root package name */
    public static List<String> f75031f;

    /* renamed from: g  reason: collision with root package name */
    public static List<String> f75032g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f75033h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final f.a.l.b<com.ss.android.ugc.aweme.commercialize.preview.c.a> f75034a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a.b.a f75035b = new f.a.b.a();

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.preview.a.a f75036c;

    /* renamed from: d  reason: collision with root package name */
    public String f75037d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f75038e = "";

    /* renamed from: i  reason: collision with root package name */
    private final Keva f75039i = Keva.getRepo("ads_preview_keva");

    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f75041a = new c();

        static {
            Covode.recordClassIndex(46259);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(46256);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            dispose();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46257);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void dispose() {
        this.f75035b.dispose();
    }

    public AdsPreviewStateManager() {
        f.a.l.b<com.ss.android.ugc.aweme.commercialize.preview.c.a> bVar = new f.a.l.b<>();
        l.b(bVar, "");
        this.f75034a = bVar;
    }

    public final void a() {
        f.a.b.b a2 = ((AdsPreviewApi) com.ss.android.ugc.aweme.commercialize.util.b.a.a(AdsPreviewApi.class, com.ss.android.ugc.aweme.commercialize.util.c.f75475a)).sendAdsPreviewRequest(this.f75037d, this.f75038e).c(new d(this)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new e(this), new f(this));
        l.b(a2, "");
        f.a.j.a.a(a2, this.f75035b);
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdsPreviewStateManager f75042a;

        static {
            Covode.recordClassIndex(46260);
        }

        d(AdsPreviewStateManager adsPreviewStateManager) {
            this.f75042a = adsPreviewStateManager;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f75042a.a(a.b.f75010a);
        }
    }

    public final void a(com.ss.android.ugc.aweme.commercialize.preview.c.a aVar) {
        this.f75034a.onNext(aVar);
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.commercialize.preview.a.a a(AdsPreviewStateManager adsPreviewStateManager) {
        com.ss.android.ugc.aweme.commercialize.preview.a.a aVar = adsPreviewStateManager.f75036c;
        if (aVar == null) {
            l.a("previewCallback");
        }
        return aVar;
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdsPreviewStateManager f75044a;

        static {
            Covode.recordClassIndex(46262);
        }

        f(AdsPreviewStateManager adsPreviewStateManager) {
            this.f75044a = adsPreviewStateManager;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f75044a.a(a.C1706a.f75009a);
            this.f75044a.a(null, null);
            r.onEventV3("ads_interface_preview_ad_failed");
        }
    }

    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdsPreviewStateManager f75040a;

        static {
            Covode.recordClassIndex(46258);
        }

        public b(AdsPreviewStateManager adsPreviewStateManager) {
            this.f75040a = adsPreviewStateManager;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj instanceof a.e) {
                AdsPreviewStateManager.a(this.f75040a).a();
            } else if (obj instanceof a.d) {
                AdsPreviewStateManager.a(this.f75040a).b();
            } else if (obj instanceof a.b) {
                AdsPreviewStateManager.a(this.f75040a).c();
            } else if (obj instanceof a.c) {
                AdsPreviewStateManager.a(this.f75040a).d();
            } else if (obj instanceof a.C1706a) {
                AdsPreviewStateManager.a(this.f75040a).e();
            }
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdsPreviewStateManager f75043a;

        static {
            Covode.recordClassIndex(46261);
        }

        e(AdsPreviewStateManager adsPreviewStateManager) {
            this.f75043a = adsPreviewStateManager;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<String> adIds;
            List<String> creativeIds;
            List<String> creativeIds2;
            com.ss.android.ugc.aweme.commercialize.preview.b.a aVar = (com.ss.android.ugc.aweme.commercialize.preview.b.a) obj;
            List<String> adIds2 = aVar.getAdIds();
            if (((adIds2 == null || adIds2.isEmpty()) && ((creativeIds2 = aVar.getCreativeIds()) == null || creativeIds2.isEmpty())) || ((adIds = aVar.getAdIds()) != null && !adIds.isEmpty() && (creativeIds = aVar.getCreativeIds()) != null && !creativeIds.isEmpty())) {
                this.f75043a.a(a.C1706a.f75009a);
                this.f75043a.a(null, null);
                r.onEventV3("ads_interface_preview_ad_failed");
                return;
            }
            this.f75043a.a(a.c.f75011a);
            this.f75043a.a(aVar.getAdIds(), aVar.getCreativeIds());
        }
    }

    public final void a(List<String> list, List<String> list2) {
        boolean z;
        f75031f = list;
        f75032g = list2;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f75039i.storeLong("preview_timestamp", System.currentTimeMillis());
            Keva keva = this.f75039i;
            Object[] array = list.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            keva.storeStringArray("preview_adids", (String[]) array);
        }
        if (list2 != null && !list2.isEmpty()) {
            this.f75039i.storeLong("preview_timestamp", System.currentTimeMillis());
            Keva keva2 = this.f75039i;
            Object[] array2 = list2.toArray(new String[0]);
            Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
            keva2.storeStringArray("preview_cids", (String[]) array2);
        }
    }
}
