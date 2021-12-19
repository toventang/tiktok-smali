package com.ss.android.ugc.aweme.base.ui.anchor;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.d;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.crossplatform.b.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.multi.k;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class g extends d implements i, j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f68355c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final String f68356b;

    /* renamed from: d  reason: collision with root package name */
    private k f68357d;

    static {
        Covode.recordClassIndex(42086);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(157, new org.greenrobot.eventbus.g(g.class, "onEvent", b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42087);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @r
    public final void onEvent(b bVar) {
        String str;
        String str2 = "";
        l.d(bVar, str2);
        ICommerceService a2 = com.ss.android.ugc.aweme.commerce.service.a.a();
        com.ss.android.ugc.aweme.commerce.service.a.a aVar = new com.ss.android.ugc.aweme.commerce.service.a.a();
        String str3 = this.f68356b;
        if (str3 != null) {
            str2 = str3;
        }
        aVar.f73497b = str2;
        Aweme aweme = this.f68363a;
        String str4 = null;
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        aVar.f73499d = str;
        Aweme aweme2 = this.f68363a;
        if (aweme2 != null) {
            str4 = aweme2.getAid();
        }
        aVar.f73498c = str4;
        aVar.q = this.f68357d.f110914b.f110924a;
        aVar.r = String.valueOf(bVar.f78592a);
        aVar.y = String.valueOf(this.f68357d.f110914b.f110932i);
        aVar.w = this.f68357d.f110914b.f110935l;
        aVar.x = this.f68357d.f110914b.f110934k;
        aVar.u = "video";
        aVar.v = "video_cart_tag";
        aVar.I = com.ss.android.ugc.aweme.base.b.a(this.f68363a);
        aVar.G = "video_single_anchor";
        aVar.H = "video";
        a2.logCommerceEvents("product_stay_time", aVar);
        EventBus.a().b(this);
    }
}
