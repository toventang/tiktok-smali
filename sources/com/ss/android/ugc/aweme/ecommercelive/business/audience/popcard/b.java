package com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.lifecycle.t;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.cg;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class b extends com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.b implements i, j {

    /* renamed from: b  reason: collision with root package name */
    private boolean f87839b;

    /* renamed from: c  reason: collision with root package name */
    private final h f87840c;

    /* renamed from: d  reason: collision with root package name */
    private final h f87841d = h.i.a((h.f.a.a) C2126b.f87846a);

    static {
        Covode.recordClassIndex(55239);
    }

    private final a b() {
        return (a) this.f87840c.getValue();
    }

    private final Handler c() {
        return (Handler) this.f87841d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.b
    public final void b(String str) {
        l.d(str, "");
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(45, new g(b.class, "onShopCartAnimChange", com.ss.android.ugc.aweme.ecommercelive.business.audience.b.b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.b$b  reason: collision with other inner class name */
    static final class C2126b extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2126b f87846a = new C2126b();

        static {
            Covode.recordClassIndex(55241);
        }

        C2126b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static final class c extends m implements h.f.a.a<a> {
        final /* synthetic */ d $widget;

        static {
            Covode.recordClassIndex(55242);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar) {
            super(0);
            this.$widget = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(new h.f.a.b<com.ss.android.ugc.aweme.ecommercelive.business.audience.b.b, z>(this) {
                /* class com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.b.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(55243);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.ecommercelive.business.audience.b.b bVar) {
                    com.ss.android.ugc.aweme.ecommercelive.business.audience.b.b bVar2 = bVar;
                    l.d(bVar2, "");
                    IFrameSlot.SlotViewModel slotViewModel = this.this$0.$widget.f87930d;
                    if (slotViewModel != null) {
                        com.ss.android.ugc.aweme.ecommercelive.business.common.c.c.a(slotViewModel, bVar2.f87784a);
                    }
                    return z.f158842a;
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f87855a = new d();

        static {
            Covode.recordClassIndex(55244);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ecommercelive.business.audience.b.a(true));
            return z.f158842a;
        }
    }

    private final void e() {
        this.f87833a.f87929c.b(d.f87855a);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.b
    public final void a() {
        c().removeCallbacks(b());
        cg.b(this);
    }

    private final void d() {
        if (!this.f87839b) {
            this.f87833a.f87929c.f87838d = new a(this);
            this.f87839b = true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<String, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(55240);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            this.this$0.a(str2);
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        super(dVar);
        l.d(dVar, "");
        this.f87840c = h.i.a((h.f.a.a) new c(dVar));
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.b
    public final void a(com.ss.android.ugc.aweme.ecommercelive.business.common.a.c cVar) {
        cg.a(this);
        d();
        if (this.f87833a.f87929c.f87835a != null) {
            e();
        }
    }

    @r
    public final void onShopCartAnimChange(com.ss.android.ugc.aweme.ecommercelive.business.audience.b.b bVar) {
        l.d(bVar, "");
        b().f87830a = bVar;
        c().postDelayed(b(), bVar.f87785b);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.b
    public final void a(com.ss.android.ugc.aweme.ecommercelive.framework.a.a.b bVar) {
        l.d(bVar, "");
        d();
        if (this.f87833a.f87929c.f87835a != null) {
            e();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.b
    public final void a(String str) {
        Object obj;
        t<Pair<Boolean, String>> tVar;
        Pair<Boolean, String> value;
        l.d(str, "");
        IFrameSlot.SlotViewModel slotViewModel = this.f87833a.f87930d;
        if (slotViewModel == null || (tVar = slotViewModel.f12709a) == null || (value = tVar.getValue()) == null) {
            obj = null;
        } else {
            obj = value.first;
        }
        if (l.a(obj, (Object) true)) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ecommercelive.business.audience.b.a(false));
        }
        this.f87833a.f87929c.f87836b = null;
    }
}
