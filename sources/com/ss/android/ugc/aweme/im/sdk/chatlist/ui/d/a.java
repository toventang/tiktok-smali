package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.d;

import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.k;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.aa;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class a implements k<com.ss.android.ugc.aweme.im.service.k.a>, i, j {

    /* renamed from: d  reason: collision with root package name */
    public static final C2555a f102104d = new C2555a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final am f102105a = an.a(bf.f159040a);

    /* renamed from: b  reason: collision with root package name */
    public String f102106b = "";

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chatlist.ui.b.a f102107c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f102108e = true;

    /* renamed from: f  reason: collision with root package name */
    private final TuxStatusView.c f102109f;

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.a.a f102110g;

    /* renamed from: h  reason: collision with root package name */
    private final TuxStatusView f102111h;

    static {
        Covode.recordClassIndex(65335);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(195, new g(a.class, "onEvent", com.ss.android.ugc.aweme.im.sdk.common.data.model.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.d.a$a  reason: collision with other inner class name */
    public static final class C2555a {
        static {
            Covode.recordClassIndex(65336);
        }

        private C2555a() {
        }

        public /* synthetic */ C2555a(byte b2) {
            this();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f102112a;

        static {
            Covode.recordClassIndex(65337);
        }

        b(a aVar) {
            this.f102112a = aVar;
        }

        public final void run() {
            this.f102112a.a();
        }
    }

    public final void a() {
        if (!this.f102110g.f4207a.f4004f.isEmpty() || !this.f102107c.f4207a.f4004f.isEmpty()) {
            this.f102111h.setVisibility(8);
            if (this.f102107c.a()) {
                List<T> list = this.f102110g.f4207a.f4004f;
                l.b(list, "");
                if (!list.isEmpty()) {
                    this.f102107c.a(n.a(com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.b.f101874a));
                    return;
                }
                return;
            }
            return;
        }
        this.f102111h.setVisibility(0);
        this.f102111h.setStatus(this.f102109f);
    }

    @r
    public final void onEvent(com.ss.android.ugc.aweme.im.sdk.common.data.model.a aVar) {
        l.d(aVar, "");
        aa.a();
    }

    static final class c extends h.c.b.a.k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ List $result;
        int label;

        static {
            Covode.recordClassIndex(65338);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(List list, h.c.d dVar) {
            super(2, dVar);
            this.$result = list;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new c(this.$result, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                h.r.a(obj);
                com.ss.android.ugc.aweme.im.sdk.common.controller.e.i.a(this.$result);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.e.k
    public final void a(List<com.ss.android.ugc.aweme.im.service.k.a> list) {
        l.d(list, "");
        this.f102107c.a(list, new b(this));
        if (this.f102108e) {
            this.f102108e = false;
            bz unused = kotlinx.coroutines.i.a(this.f102105a, bf.f159041b, null, new c(list, null), 2);
            com.ss.android.ugc.aweme.cc.c.a("im_chat_list", (com.ss.android.ugc.aweme.cc.b) null, 6);
        }
        com.ss.android.ugc.aweme.im.sdk.chatlist.a.a.a(list.size(), -1);
    }

    static final class d extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f102113a = new d();

        static {
            Covode.recordClassIndex(65339);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_large_direct_message;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 70.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 70.0f, system2.getDisplayMetrics()));
            aVar2.f44753e = Integer.valueOf((int) R.attr.bd);
            return z.f158842a;
        }
    }

    public a(com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.a.a aVar, com.ss.android.ugc.aweme.im.sdk.chatlist.ui.b.a aVar2, TuxStatusView tuxStatusView) {
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(tuxStatusView, "");
        this.f102110g = aVar;
        this.f102107c = aVar2;
        this.f102111h = tuxStatusView;
        if (!EventBus.a().a(this)) {
            EventBus.a(EventBus.a(), this);
        }
        tuxStatusView.setVisibility(0);
        tuxStatusView.a();
        TuxStatusView.c a2 = new TuxStatusView.c().a(com.bytedance.tux.c.c.a(d.f102113a));
        String string = tuxStatusView.getContext().getString(R.string.d41);
        l.b(string, "");
        TuxStatusView.c a3 = a2.a(string);
        String string2 = tuxStatusView.getContext().getString(R.string.d40);
        l.b(string2, "");
        this.f102109f = a3.a((CharSequence) string2);
    }
}
