package com.ss.android.ugc.aweme.im.sdk.common.controller.e;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.u;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.ies.im.core.api.b.h;
import com.bytedance.im.core.d.ah;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.chat.b.g;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.aa;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n;
import com.ss.android.ugc.aweme.im.service.IIMunder16Proxy;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ad;
import h.p;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.ci;
import kotlinx.coroutines.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public final class l implements com.bytedance.im.core.i.b, g.a, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: i  reason: collision with root package name */
    public static volatile l f102264i;

    /* renamed from: j  reason: collision with root package name */
    public static volatile boolean f102265j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f102266k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, com.ss.android.ugc.aweme.im.service.k.a> f102267a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, com.ss.android.ugc.aweme.im.service.k.a> f102268b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f102269c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f102270d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f102271e;

    /* renamed from: f  reason: collision with root package name */
    public final u<List<Long>> f102272f;

    /* renamed from: g  reason: collision with root package name */
    public final Comparator<com.ss.android.ugc.aweme.im.service.k.a> f102273g;

    /* renamed from: h  reason: collision with root package name */
    public final b f102274h;

    /* renamed from: l  reason: collision with root package name */
    private final am f102275l;

    /* renamed from: m  reason: collision with root package name */
    private final Set<k<com.ss.android.ugc.aweme.im.service.k.a>> f102276m;
    private bz n;
    private g.a o;
    private final com.bytedance.ies.im.core.api.b.a.a p;

    public interface b {
        static {
            Covode.recordClassIndex(65438);
        }

        com.ss.android.ugc.aweme.im.service.k.a a(com.bytedance.im.core.d.h hVar);

        void a(int i2);

        void a(int i2, boolean z, boolean z2);

        boolean a();

        Map<String, com.ss.android.ugc.aweme.im.service.k.a> b();

        void b(int i2);

        Map<String, com.ss.android.ugc.aweme.im.service.k.a> c();

        int d();

        List<com.bytedance.im.core.d.h> e();

        Comparator<com.ss.android.ugc.aweme.im.service.k.a> f();

        boolean g();

        boolean h();

        boolean i();

        boolean j();
    }

    static {
        Covode.recordClassIndex(65435);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.g.a
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.g.a
    public final void a(Object obj, int i2) {
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(182, new org.greenrobot.eventbus.g(l.class, "updateU16Settings", com.ss.android.ugc.aweme.im.service.b.e.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65437);
        }

        private a() {
        }

        public static l a() {
            l lVar;
            MethodCollector.i(4666);
            l lVar2 = l.f102264i;
            if (lVar2 == null) {
                synchronized (l.class) {
                    try {
                        lVar = l.f102264i;
                        if (lVar == null) {
                            lVar = new l((byte) 0);
                            l.f102264i = lVar;
                        }
                    } finally {
                        MethodCollector.o(4666);
                    }
                }
                return lVar;
            }
            MethodCollector.o(4666);
            return lVar2;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f102278a;

        static {
            Covode.recordClassIndex(65439);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.b
        public final Map<String, com.ss.android.ugc.aweme.im.service.k.a> b() {
            return this.f102278a.f102268b;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.b
        public final Map<String, com.ss.android.ugc.aweme.im.service.k.a> c() {
            return this.f102278a.f102267a;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.b
        public final int d() {
            return this.f102278a.f102269c;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.b
        public final Comparator<com.ss.android.ugc.aweme.im.service.k.a> f() {
            return this.f102278a.f102273g;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.b
        public final boolean g() {
            return com.ss.android.ugc.aweme.im.service.c.c.a();
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.b
        public final boolean i() {
            return com.ss.android.ugc.aweme.inbox.a.a.c();
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.b
        public final boolean j() {
            return com.ss.android.ugc.aweme.notice.api.ab.b.b();
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.b
        public final List<com.bytedance.im.core.d.h> e() {
            return a.C0745a.a().a();
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.b
        public final boolean h() {
            if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.g.a() > 0) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.b
        public final boolean a() {
            return this.f102278a.f102270d;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(l lVar) {
            this.f102278a = lVar;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.b
        public final void a(int i2) {
            this.f102278a.f102269c = i2;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.b
        public final com.ss.android.ugc.aweme.im.service.k.a a(com.bytedance.im.core.d.h hVar) {
            h.f.b.l.d(hVar, "");
            h.f.b.l.d(hVar, "");
            return com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.c.a(hVar);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.b
        public final void b(int i2) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.notice.api.b.c(i2));
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.b
        public final void a(int i2, boolean z, boolean z2) {
            com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.a.f102292a.a(new com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.i(com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b().toString()), new com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.h(i2, z, z2));
        }
    }

    public final void f() {
        this.f102271e.sendEmptyMessage(1);
    }

    static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f102281a;

        static {
            Covode.recordClassIndex(65446);
        }

        i(l lVar) {
            this.f102281a = lVar;
        }

        public final void run() {
            if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a()) {
                this.f102281a.d();
            }
        }
    }

    public final void d() {
        if (com.bytedance.ies.im.core.api.b.a().d() != null) {
            com.ss.android.ugc.aweme.im.sdk.group.b.a.a.f102653d.a();
            bz unused = kotlinx.coroutines.i.a(this.f102275l, com.ss.android.ugc.aweme.af.a.f66269a, null, new d(this, null), 2);
        }
    }

    private final synchronized bz g() {
        bz bzVar;
        MethodCollector.i(5842);
        com.ss.android.ugc.aweme.im.service.m.a.c("SessionListManager", "syncSessionListI18n step 1");
        boolean unused = com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.a.f102292a.a(new com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.i(com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b().toString()), false);
        com.ss.android.ugc.aweme.im.service.m.a.c("SessionListManager", "syncSessionListI18n step 2");
        bzVar = kotlinx.coroutines.i.a(this.f102275l, null, null, new j(this, null), 3);
        MethodCollector.o(5842);
        return bzVar;
    }

    private final synchronized bz h() {
        bz bzVar;
        MethodCollector.i(5963);
        com.ss.android.ugc.aweme.im.service.m.a.c("SessionListManager", "syncSessionListNotice");
        bzVar = kotlinx.coroutines.i.a(this.f102275l, null, null, new k(this, null), 3);
        MethodCollector.o(5963);
        return bzVar;
    }

    private l() {
        this.f102275l = an.a(bf.f159041b);
        this.f102273g = e.f102279a;
        this.f102267a = new ConcurrentHashMap();
        this.f102268b = new ConcurrentHashMap();
        this.f102276m = new HashSet();
        this.o = this;
        this.f102271e = new com.ss.android.ugc.aweme.im.sdk.chat.b.g(Looper.getMainLooper(), this.o);
        this.f102272f = new u(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f102277a;

            static {
                Covode.recordClassIndex(65436);
            }

            {
                this.f102277a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f102277a.f102270d = true;
                this.f102277a.f102271e.sendEmptyMessage(2);
            }
        };
        this.p = new f(this);
        this.f102274h = new c(this);
    }

    public final void b() {
        int i2;
        com.ss.android.ugc.aweme.notice.api.b.a(99, this.f102269c);
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.notice.api.bean.m(99, this.f102269c));
        if (com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c.a()) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        com.ss.android.ugc.aweme.notice.api.b.a(101, i2);
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.notice.api.bean.m(101, i2));
        com.ss.android.ugc.aweme.im.service.m.a.c("notice_count", "postUnreadCount=" + this.f102269c + " unreadDot=" + i2);
    }

    public final void c() {
        a.C0745a.a().a(this.p);
        h.a.a().a(this);
        bz unused = kotlinx.coroutines.i.a(this.f102275l, com.ss.android.ugc.aweme.af.a.f66269a, null, new h(this, null), 2);
        if (com.ss.android.ugc.aweme.im.service.c.b.a()) {
            if (com.bytedance.ies.im.core.api.b.a().d() != null) {
                d();
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new i(this), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            }
        }
        aa.a();
    }

    public final void e() {
        a.C0745a.a().b(this.p);
        h.a.a().b(this);
        bz unused = kotlinx.coroutines.i.a(this.f102275l, com.ss.android.ugc.aweme.af.a.f66269a, null, new C2559l(this, null), 2);
        if (com.ss.android.ugc.aweme.im.service.c.b.a() && com.bytedance.ies.im.core.api.b.a().d() != null) {
            com.ss.android.ugc.aweme.im.sdk.group.b.a.a aVar = com.ss.android.ugc.aweme.im.sdk.group.b.a.a.f102653d;
            com.ss.android.ugc.aweme.im.sdk.group.b.a.a.f102650a.clear();
            a.C0745a.a().b(aVar);
            bz unused2 = kotlinx.coroutines.i.a(this.f102275l, com.ss.android.ugc.aweme.af.a.f66269a, null, new m(this, null), 2);
        }
        this.f102271e.removeMessages(2);
        bz bzVar = this.n;
        if (bzVar != null) {
            bzVar.a((CancellationException) null);
        }
        this.f102267a.clear();
        this.f102268b.clear();
        this.f102270d = false;
        this.f102269c = 0;
        b();
    }

    public /* synthetic */ l(byte b2) {
        this();
    }

    public static final class f implements com.bytedance.ies.im.core.api.b.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f102280a;

        static {
            Covode.recordClassIndex(65442);
        }

        @Override // com.bytedance.im.core.d.r
        public final void a(String str, int i2) {
            h.f.b.l.d(str, "");
        }

        @Override // com.bytedance.im.core.d.r
        public final void a(String str, int i2, List<Long> list) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(list, "");
        }

        @Override // com.bytedance.im.core.d.r
        public final void a(String str, List<? extends ah> list) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(list, "");
        }

        @Override // com.bytedance.im.core.d.r
        public final void a(List<? extends ah> list) {
            h.f.b.l.d(list, "");
        }

        @Override // com.bytedance.im.core.d.r
        public final void b(List<? extends ah> list) {
            h.f.b.l.d(list, "");
        }

        @Override // com.bytedance.im.core.d.r
        public final void c(com.bytedance.im.core.d.h hVar) {
            h.f.b.l.d(hVar, "");
        }

        @Override // com.bytedance.im.core.d.r
        public final void c(List<? extends ah> list) {
            h.f.b.l.d(list, "");
        }

        @Override // com.bytedance.im.core.d.r
        public final int d() {
            return 0;
        }

        @Override // com.bytedance.im.core.d.r
        public final void d(com.bytedance.im.core.d.h hVar) {
            h.f.b.l.d(hVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(l lVar) {
            this.f102280a = lVar;
        }

        @Override // com.bytedance.im.core.d.r
        public final void a(com.bytedance.im.core.d.h hVar) {
            h.f.b.l.d(hVar, "");
            this.f102280a.f102270d = true;
            this.f102280a.f102271e.sendEmptyMessage(2);
        }

        @Override // com.bytedance.im.core.d.r
        public final void b(com.bytedance.im.core.d.h hVar) {
            h.f.b.l.d(hVar, "");
            this.f102280a.f102270d = true;
            this.f102280a.f102271e.sendEmptyMessage(2);
        }

        @Override // com.bytedance.im.core.d.p
        public final void a(Map<String, ? extends com.bytedance.im.core.d.h> map) {
            h.f.b.l.d(map, "");
            l.f102265j = true;
            this.f102280a.f102270d = true;
            this.f102280a.f102271e.sendEmptyMessage(2);
        }

        @Override // com.bytedance.im.core.d.r
        public final void a(com.bytedance.im.core.d.h hVar, int i2) {
            h.f.b.l.d(hVar, "");
            this.f102280a.f102270d = true;
            this.f102280a.f102271e.sendEmptyMessage(2);
        }
    }

    public final void b(k<com.ss.android.ugc.aweme.im.service.k.a> kVar) {
        Set<k<com.ss.android.ugc.aweme.im.service.k.a>> set = this.f102276m;
        Objects.requireNonNull(set, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        ad.b(set).remove(kVar);
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(65440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(l lVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = lVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new d(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                com.ss.android.ugc.aweme.im.sdk.group.b.a.a.f102651b.observeForever(this.this$0.f102272f);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class h extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(65445);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(l lVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = lVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new h(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((h) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                EventBus.a(EventBus.a(), this.this$0);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.l$l  reason: collision with other inner class name */
    static final class C2559l extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(65451);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2559l(l lVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = lVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new C2559l(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((C2559l) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                EventBus.a().b(this.this$0);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class m extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(65452);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(l lVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = lVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new m(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((m) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                com.ss.android.ugc.aweme.im.sdk.group.b.a.a.f102651b.removeObserver(this.this$0.f102272f);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void a(k<com.ss.android.ugc.aweme.im.service.k.a> kVar) {
        h.f.b.l.d(kVar, "");
        this.f102276m.add(kVar);
        this.f102271e.sendEmptyMessage(1);
    }

    private static List<com.ss.android.ugc.aweme.im.service.k.a> b(List<com.ss.android.ugc.aweme.im.service.k.a> list) {
        h.f.b.l.d(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<com.ss.android.ugc.aweme.im.service.k.a> it = list.iterator();
        while (it.hasNext()) {
            com.ss.android.ugc.aweme.im.service.k.a next = it.next();
            if (next instanceof com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.c) {
                it.remove();
                arrayList.add(next);
            }
        }
        list.addAll(arrayList);
        return list;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.g.a
    public final void a(int i2) {
        bz bzVar;
        bz bzVar2 = this.n;
        if (bzVar2 == null || bzVar2.k()) {
            com.ss.android.ugc.aweme.im.service.m.a.a("SessionListManager", "Will update data");
            com.ss.android.ugc.aweme.im.service.e b2 = b.b();
            if (b2 == null || !b2.enableIM() || (b2.getUnder16Proxy() != null && b2.getUnder16Proxy().a())) {
                bzVar = h();
            } else {
                bzVar = g();
            }
            this.n = bzVar;
            return;
        }
        com.ss.android.ugc.aweme.im.service.m.a.a("SessionListManager", "Will not update data because previous job is still running");
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void updateU16Settings(com.ss.android.ugc.aweme.im.service.b.e eVar) {
        com.ss.android.ugc.aweme.im.service.m.a.c("SessionListManager", "updateU16Settings");
        if (!in.d()) {
            if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a()) {
                com.ss.android.ugc.aweme.im.service.m.a.c("SessionListManager", "updateU16Settings is login");
                this.f102271e.sendEmptyMessage(1);
                return;
            }
            this.f102269c = 0;
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(65447);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(l lVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = lVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new j(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((j) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            final List<com.ss.android.ugc.aweme.im.service.k.a> component1;
            final int intValue;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                p<List<com.ss.android.ugc.aweme.im.service.k.a>, Integer> a2 = l.a(this.this$0.f102274h);
                component1 = a2.component1();
                intValue = a2.component2().intValue();
                ci ciVar = o.f159148a;
                AnonymousClass1 r1 = new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                    /* class com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.j.AnonymousClass1 */
                    int label;
                    final /* synthetic */ j this$0;

                    static {
                        Covode.recordClassIndex(65448);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.c.b.a.a
                    public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                        h.f.b.l.d(dVar, "");
                        return 

                        /* access modifiers changed from: package-private */
                        public static final class k extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
                            int label;
                            final /* synthetic */ l this$0;

                            static {
                                Covode.recordClassIndex(65449);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            k(l lVar, h.c.d dVar) {
                                super(2, dVar);
                                this.this$0 = lVar;
                            }

                            @Override // h.c.b.a.a
                            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                h.f.b.l.d(dVar, "");
                                return new k(this.this$0, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                                return ((k) create(amVar, dVar)).invokeSuspend(z.f158842a);
                            }

                            @Override // h.c.b.a.a
                            public final Object invokeSuspend(Object obj) {
                                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                int i2 = this.label;
                                if (i2 == 0) {
                                    r.a(obj);
                                    l lVar = this.this$0;
                                    final ArrayList arrayList = new ArrayList(lVar.f102268b.values());
                                    IIMunder16Proxy under16Proxy = b.b().getUnder16Proxy();
                                    if (under16Proxy != null && under16Proxy.b()) {
                                        n a2 = n.a();
                                        h.f.b.l.b(a2, "");
                                        if (!a2.f102428a.getBoolean("notice_under_16_deleted_state", false)) {
                                            arrayList.add(new com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.e());
                                        }
                                    }
                                    lVar.f102269c = 0;
                                    h.a.n.a((List) arrayList, (Comparator) lVar.f102273g);
                                    ci ciVar = o.f159148a;
                                    AnonymousClass1 r1 = new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                                        /* class com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.k.AnonymousClass1 */
                                        int label;
                                        final /* synthetic */ k this$0;

                                        static {
                                            Covode.recordClassIndex(65450);
                                        }

                                        {
                                            this.this$0 = r2;
                                        }

                                        @Override // h.c.b.a.a
                                        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                            h.f.b.l.d(dVar, "");
                                            return 

                                            @Override // com.bytedance.im.core.i.b
                                            public final void a(com.bytedance.im.core.i.d dVar) {
                                                String str;
                                                String str2;
                                                StringBuilder sb = new StringBuilder("onStrangerBoxUpdate: ");
                                                if (dVar != null) {
                                                    long j2 = -1;
                                                    if (dVar.f38133b != null) {
                                                        str2 = dVar.f38133b.getConversationId();
                                                        ai lastMessage = dVar.f38133b.getLastMessage();
                                                        if (lastMessage != null) {
                                                            j2 = lastMessage.getMsgId();
                                                        }
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    str = "StrangerBox{totalUnread=" + dVar.f38132a + ", latestConversation=" + str2 + ", latestMessageId=" + j2 + "}";
                                                } else {
                                                    str = null;
                                                }
                                                com.ss.android.ugc.aweme.im.service.m.a.c("SessionListManager", sb.append(str).toString());
                                                if (dVar == null || dVar.f38133b == null) {
                                                    a.a().a("stranger_1");
                                                } else {
                                                    bz unused = kotlinx.coroutines.i.a(this.f102275l, null, null, new g(this, dVar, null), 3);
                                                }
                                            }

                                            /* access modifiers changed from: package-private */
                                            public static final class g extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
                                                final /* synthetic */ com.bytedance.im.core.i.d $strangerBox;
                                                int label;
                                                final /* synthetic */ l this$0;

                                                static {
                                                    Covode.recordClassIndex(65443);
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                g(l lVar, com.bytedance.im.core.i.d dVar, h.c.d dVar2) {
                                                    super(2, dVar2);
                                                    this.this$0 = lVar;
                                                    this.$strangerBox = dVar;
                                                }

                                                @Override // h.c.b.a.a
                                                public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                                    h.f.b.l.d(dVar, "");
                                                    return new g(this.this$0, this.$strangerBox, dVar);
                                                }

                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                @Override // h.f.a.m
                                                public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                                                    return ((g) create(amVar, dVar)).invokeSuspend(z.f158842a);
                                                }

                                                @Override // h.c.b.a.a
                                                public final Object invokeSuspend(Object obj) {
                                                    boolean z;
                                                    String str;
                                                    long j2;
                                                    h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                                    int i2 = this.label;
                                                    if (i2 == 0) {
                                                        r.a(obj);
                                                        com.bytedance.im.core.d.h hVar = this.$strangerBox.f38133b;
                                                        h.f.b.l.b(hVar, "");
                                                        com.ss.android.ugc.aweme.im.service.k.a a2 = com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.c.a(hVar);
                                                        com.bytedance.im.core.d.h hVar2 = this.$strangerBox.f38133b;
                                                        h.f.b.l.b(hVar2, "");
                                                        h.f.b.l.d(hVar2, "");
                                                        String a3 = c.a(hVar2.getConversationId());
                                                        ai lastMessage = hVar2.getLastMessage();
                                                        if (a3 == null || a3.length() == 0) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        if (z && lastMessage != null) {
                                                            a3 = lastMessage.getSecSender();
                                                        }
                                                        final com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.f fVar = new com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.f(a3, g.a(String.valueOf(b.a.c(hVar2.getConversationId())), a3), (byte) 0);
                                                        fVar.f103871m = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.d44);
                                                        if (a2 == null || (str = a2.g()) == null) {
                                                            ai lastMessage2 = hVar2.getLastMessage();
                                                            if (lastMessage2 == null) {
                                                                str = "";
                                                            } else {
                                                                str = com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.c.a(b.f.b(lastMessage2), lastMessage2, false);
                                                            }
                                                        }
                                                        fVar.n = str;
                                                        if (a2 != null) {
                                                            j2 = a2.o;
                                                        } else {
                                                            j2 = hVar2.getUpdatedTime();
                                                        }
                                                        fVar.a(j2);
                                                        String conversationId = hVar2.getConversationId();
                                                        h.f.b.l.b(conversationId, "");
                                                        fVar.f101883g = conversationId;
                                                        ci ciVar = o.f159148a;
                                                        AnonymousClass1 r1 = new h.f.a.m<am, h.c.d<? super z>, Object>(this, null) {
                                                            /* class com.ss.android.ugc.aweme.im.sdk.common.controller.e.l.g.AnonymousClass1 */
                                                            int label;
                                                            final /* synthetic */ g this$0;

                                                            static {
                                                                Covode.recordClassIndex(65444);
                                                            }

                                                            {
                                                                this.this$0 = r2;
                                                            }

                                                            @Override // h.c.b.a.a
                                                            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                                                                h.f.b.l.d(dVar, "");
                                                                return 

                                                                public final void a(String str) {
                                                                    if (!TextUtils.isEmpty(str)) {
                                                                        Map<String, com.ss.android.ugc.aweme.im.service.k.a> map = this.f102268b;
                                                                        Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
                                                                        if (map.containsKey(str)) {
                                                                            Map<String, com.ss.android.ugc.aweme.im.service.k.a> map2 = this.f102268b;
                                                                            Objects.requireNonNull(map2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                                                                            ad.h(map2).remove(str);
                                                                            this.f102271e.sendEmptyMessage(2);
                                                                        }
                                                                    }
                                                                }

                                                                public static p<List<com.ss.android.ugc.aweme.im.service.k.a>, Integer> a(b bVar) {
                                                                    boolean z;
                                                                    int i2;
                                                                    boolean z2;
                                                                    h.f.b.l.d(bVar, "");
                                                                    ArrayList arrayList = new ArrayList(bVar.b().values());
                                                                    boolean z3 = false;
                                                                    int i3 = 0;
                                                                    if (bVar.a()) {
                                                                        bVar.c().clear();
                                                                        List<com.bytedance.im.core.d.h> e2 = bVar.e();
                                                                        com.ss.android.ugc.aweme.im.service.m.a.c("SessionListManager", "syncSessionListI18n step 3, ConversationSize: " + e2.size());
                                                                        boolean z4 = false;
                                                                        int i4 = 0;
                                                                        for (com.bytedance.im.core.d.h hVar : e2) {
                                                                            try {
                                                                                com.ss.android.ugc.aweme.im.service.k.a a2 = bVar.a(hVar);
                                                                                if (a2 != null) {
                                                                                    Map<String, com.ss.android.ugc.aweme.im.service.k.a> c2 = bVar.c();
                                                                                    String bF_ = a2.bF_();
                                                                                    h.f.b.l.b(bF_, "");
                                                                                    c2.put(bF_, a2);
                                                                                    arrayList.add(a2);
                                                                                    if (!a2.i() || !hVar.isMute()) {
                                                                                        z = false;
                                                                                    } else {
                                                                                        z = true;
                                                                                    }
                                                                                    if ((a2 instanceof com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.c) && bVar.g()) {
                                                                                        com.ss.android.ugc.aweme.im.service.m.a.c("SessionListManager", "IMGroupChatHoldoutExperiment is on conversation isMute: " + z + " session unread count: " + ((com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.c) a2).q);
                                                                                    } else if (!z) {
                                                                                        if (bVar.h()) {
                                                                                            if (a2.q > 0) {
                                                                                                z2 = true;
                                                                                            } else {
                                                                                                z2 = false;
                                                                                            }
                                                                                            boolean z5 = a2.r;
                                                                                            if (z2 || z5) {
                                                                                                i2 = 1;
                                                                                            } else {
                                                                                                i2 = 0;
                                                                                            }
                                                                                        } else {
                                                                                            i2 = a2.q;
                                                                                        }
                                                                                        i4 += i2;
                                                                                    }
                                                                                } else {
                                                                                    com.ss.android.ugc.aweme.im.service.m.a.c("SessionListManager", "syncSessionListI18n step 4, session is null for conversation " + hVar.getConversationId());
                                                                                }
                                                                            } catch (Exception e3) {
                                                                                com.ss.android.ugc.aweme.im.service.m.a.a("SessionListManager", "syncSessionListI18n step 4, faulted for conversation " + hVar.getConversationId() + ": ", e3);
                                                                                z4 = true;
                                                                            }
                                                                        }
                                                                        com.ss.android.ugc.aweme.im.service.m.a.c("SessionListManager", "syncSessionListI18n step 5, completing session conversion, completed: " + arrayList.size());
                                                                        if (!bVar.i()) {
                                                                            i3 = i4;
                                                                        }
                                                                        if (bVar.j()) {
                                                                            bVar.b(bVar.d());
                                                                        }
                                                                        bVar.a(i3);
                                                                        com.ss.android.ugc.aweme.im.service.m.a.c("SessionListManager", "syncSessionListI18n step 6, mUnreadCount: " + bVar.d());
                                                                        z3 = z4;
                                                                    } else {
                                                                        arrayList.addAll(bVar.c().values());
                                                                    }
                                                                    h.a.n.a((List) arrayList, (Comparator) bVar.f());
                                                                    if (bVar.g()) {
                                                                        b(arrayList);
                                                                    }
                                                                    bVar.a(arrayList.size(), bVar.a(), z3);
                                                                    return new p<>(arrayList, Integer.valueOf(bVar.d()));
                                                                }

                                                                public final void a(List<? extends com.ss.android.ugc.aweme.im.service.k.a> list) {
                                                                    for (k<com.ss.android.ugc.aweme.im.service.k.a> kVar : this.f102276m) {
                                                                        if (list == null) {
                                                                            kVar.a(new ArrayList());
                                                                        } else {
                                                                            kVar.a(ad.d(list));
                                                                        }
                                                                    }
                                                                }

                                                                static final class e<T> implements Comparator {

                                                                    /* renamed from: a  reason: collision with root package name */
                                                                    public static final e f102279a = new e();

                                                                    static {
                                                                        Covode.recordClassIndex(65441);
                                                                    }

                                                                    e() {
                                                                    }

                                                                    @Override // java.util.Comparator
                                                                    public final /* synthetic */ int compare(Object obj, Object obj2) {
                                                                        com.ss.android.ugc.aweme.im.service.k.a aVar = (com.ss.android.ugc.aweme.im.service.k.a) obj;
                                                                        com.ss.android.ugc.aweme.im.service.k.a aVar2 = (com.ss.android.ugc.aweme.im.service.k.a) obj2;
                                                                        h.f.b.l.b(aVar, "");
                                                                        int i2 = aVar.t;
                                                                        h.f.b.l.b(aVar2, "");
                                                                        if (i2 == aVar2.t) {
                                                                            return (aVar2.o > aVar.o ? 1 : (aVar2.o == aVar.o ? 0 : -1));
                                                                        }
                                                                        return h.f.b.l.a(aVar2.t, aVar.t);
                                                                    }
                                                                }
                                                            }
