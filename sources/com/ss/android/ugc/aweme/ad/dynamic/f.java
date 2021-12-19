package com.ss.android.ugc.aweme.ad.dynamic;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class f implements com.ss.android.ugc.aweme.ad.feed.b.e, i, j {

    /* renamed from: e  reason: collision with root package name */
    public static final a f65725e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f65726a;

    /* renamed from: b  reason: collision with root package name */
    public long f65727b = 1;

    /* renamed from: c  reason: collision with root package name */
    public int f65728c;

    /* renamed from: d  reason: collision with root package name */
    public final ViewGroup f65729d;

    /* renamed from: f  reason: collision with root package name */
    private Aweme f65730f;

    /* renamed from: g  reason: collision with root package name */
    private BulletContainerView f65731g;

    /* renamed from: h  reason: collision with root package name */
    private com.bytedance.ies.bullet.c.c.i f65732h;

    /* renamed from: i  reason: collision with root package name */
    private final List<com.ss.android.ugc.aweme.ad.feed.b.f> f65733i = new ArrayList();

    static {
        Covode.recordClassIndex(40436);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(303, new org.greenrobot.eventbus.g(f.class, "onDynamicAdStatusEvent", e.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40437);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class g implements p {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f65734a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f65735b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ JSONObject f65736c = null;

        /* renamed from: d  reason: collision with root package name */
        private final String f65737d;

        static {
            Covode.recordClassIndex(40443);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f65737d;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final /* bridge */ /* synthetic */ Object b() {
            return this.f65734a;
        }

        g(String str, JSONObject jSONObject) {
            this.f65735b = str;
            this.f65737d = str;
            this.f65734a = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.e
    public final long f() {
        return this.f65726a;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.e
    public final long g() {
        return this.f65727b;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.e
    public final boolean e() {
        if (this.f65728c == 1) {
            return true;
        }
        return false;
    }

    public final String a() {
        String aid;
        Aweme aweme = this.f65730f;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            return "";
        }
        return aid;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.e
    public final void b() {
        a("play");
        this.f65728c = 1;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.e
    public final void c() {
        a("pause");
        this.f65728c = 2;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.e
    public final void d() {
        a("stop");
        this.f65728c = 3;
        this.f65726a = 0;
    }

    static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.ad.feed.b.f, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(40438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.ad.feed.b.f fVar) {
            com.ss.android.ugc.aweme.ad.feed.b.f fVar2 = fVar;
            l.d(fVar2, "");
            fVar2.a(this.this$0.a(), this.this$0.f65727b);
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<com.ss.android.ugc.aweme.ad.feed.b.f, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(40439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.ad.feed.b.f fVar) {
            com.ss.android.ugc.aweme.ad.feed.b.f fVar2 = fVar;
            l.d(fVar2, "");
            this.this$0.f65728c = 1;
            fVar2.a(this.this$0.a());
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<com.ss.android.ugc.aweme.ad.feed.b.f, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(40440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.ad.feed.b.f fVar) {
            com.ss.android.ugc.aweme.ad.feed.b.f fVar2 = fVar;
            l.d(fVar2, "");
            this.this$0.f65728c = 3;
            fVar2.b(this.this$0.a());
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<com.ss.android.ugc.aweme.ad.feed.b.f, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(40441);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.ad.feed.b.f fVar) {
            com.ss.android.ugc.aweme.ad.feed.b.f fVar2 = fVar;
            l.d(fVar2, "");
            fVar2.c(this.this$0.a());
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.dynamic.f$f  reason: collision with other inner class name */
    static final class C1467f extends m implements h.f.a.b<com.ss.android.ugc.aweme.ad.feed.b.f, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(40442);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1467f(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.ad.feed.b.f fVar) {
            com.ss.android.ugc.aweme.ad.feed.b.f fVar2 = fVar;
            l.d(fVar2, "");
            fVar2.a(this.this$0.a(), this.this$0.f65726a, this.this$0.f65727b);
            return z.f158842a;
        }
    }

    public f(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        this.f65729d = viewGroup;
    }

    private final void a(h.f.a.b<? super com.ss.android.ugc.aweme.ad.feed.b.f, z> bVar) {
        Iterator<T> it = this.f65733i.iterator();
        while (it.hasNext()) {
            bVar.invoke(it.next());
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.e
    public final void b(com.ss.android.ugc.aweme.ad.feed.b.f fVar) {
        l.d(fVar, "");
        this.f65733i.remove(fVar);
    }

    private final void a(String str) {
        l.d("sendEventToFe: ".concat(String.valueOf(str)), "");
        com.bytedance.ies.bullet.c.c.i iVar = this.f65732h;
        if (iVar != null) {
            iVar.onEvent(new g(str, null));
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.e
    public final void a(com.ss.android.ugc.aweme.ad.feed.b.f fVar) {
        l.d(fVar, "");
        this.f65733i.add(fVar);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.e
    public final void a(Aweme aweme) {
        MethodCollector.i(3057);
        if (aweme == null) {
            MethodCollector.o(3057);
            return;
        }
        this.f65730f = aweme;
        l.d("attachBulletView", "");
        ViewGroup viewGroup = null;
        if (this.f65729d.getChildAt(0) instanceof BulletContainerView) {
            this.f65729d.removeViewAt(0);
            this.f65731g = null;
            this.f65732h = null;
        }
        com.ss.android.ugc.aweme.ad.feed.b.a a2 = b.f65701a.a(a());
        if (a2 == null) {
            l.d("attachBulletView failed, dynamicAdCache not found", "");
            MethodCollector.o(3057);
        } else if (a2.f65745a != 1) {
            l.d("attachBulletView failed, fe not ready", "");
            MethodCollector.o(3057);
        } else {
            BulletContainerView bulletContainerView = a2.f65746b;
            if (bulletContainerView == null) {
                l.d("attachBulletView failed, bulletView == null", "");
                MethodCollector.o(3057);
                return;
            }
            if (bulletContainerView.getParent() != null) {
                l.d("bulletView parent not null", "");
                ViewParent parent = bulletContainerView.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = parent;
                }
                ViewGroup viewGroup2 = viewGroup;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(bulletContainerView);
                }
            }
            this.f65731g = bulletContainerView;
            this.f65732h = a2.f65747c;
            long j2 = a2.f65748d;
            if (j2 <= 0) {
                j2 = 1;
            }
            this.f65727b = j2;
            ViewGroup viewGroup3 = this.f65729d;
            if (viewGroup3 instanceof FrameLayout) {
                viewGroup3.addView(this.f65731g, 0, new FrameLayout.LayoutParams(-1, -1, 17));
                MethodCollector.o(3057);
            } else if (viewGroup3 instanceof RelativeLayout) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(13, -1);
                this.f65729d.addView(this.f65731g, 0, layoutParams);
                MethodCollector.o(3057);
            } else {
                viewGroup3.addView(this.f65731g, 0, new ViewGroup.LayoutParams(-1, -1));
                MethodCollector.o(3057);
            }
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onDynamicAdStatusEvent(e eVar) {
        int i2;
        JSONObject jSONObject;
        l.d(eVar, "");
        int i3 = eVar.f65722a;
        BulletContainerView bulletContainerView = this.f65731g;
        if (bulletContainerView != null) {
            i2 = bulletContainerView.hashCode();
        } else {
            i2 = 0;
        }
        if (i3 == i2) {
            l.a((Object) eVar.f65723b, (Object) "updateTime");
            l.d("onDynamicAdStatusEvent, type: " + eVar.f65723b + ", params: " + eVar.f65724c, "");
            String str = eVar.f65723b;
            switch (str.hashCode()) {
                case -934426579:
                    if (str.equals("resume")) {
                        a(new c(this));
                        return;
                    }
                    return;
                case -599445191:
                    if (str.equals("complete")) {
                        a(new e(this));
                        return;
                    }
                    return;
                case -295931082:
                    if (str.equals("updateTime") && (jSONObject = eVar.f65724c) != null) {
                        this.f65726a = (long) jSONObject.optDouble("time");
                        a(new C1467f(this));
                        return;
                    }
                    return;
                case 106440182:
                    if (str.equals("pause")) {
                        a(new d(this));
                        return;
                    }
                    return;
                case 108386723:
                    if (str.equals("ready")) {
                        a(new b(this));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
