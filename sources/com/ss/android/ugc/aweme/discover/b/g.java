package com.ss.android.ugc.aweme.discover.b;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.google.android.material.appbar.AppBarLayout;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore;
import com.ss.android.ugc.aweme.autoplay.player.video.SearchVideoView;
import com.ss.android.ugc.aweme.base.v;
import com.ss.android.ugc.aweme.discover.a.as;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.iv;
import com.ss.android.ugc.aweme.utils.y;
import com.zhiliaoapp.musically.R;
import h.z;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class g extends RecyclerView.n implements View.OnAttachStateChangeListener {
    public static final b p = new b((byte) 0);
    private boolean A;
    private Integer B;
    private Integer C;
    private long D;

    /* renamed from: a  reason: collision with root package name */
    public float f80842a;

    /* renamed from: b  reason: collision with root package name */
    public float f80843b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f80844c;

    /* renamed from: d  reason: collision with root package name */
    public int f80845d;

    /* renamed from: e  reason: collision with root package name */
    public int f80846e;

    /* renamed from: f  reason: collision with root package name */
    boolean f80847f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f80848g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f80849h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f80850i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f80851j;

    /* renamed from: k  reason: collision with root package name */
    public Integer f80852k;

    /* renamed from: l  reason: collision with root package name */
    b f80853l;

    /* renamed from: m  reason: collision with root package name */
    public final h.h f80854m = h.i.a((h.f.a.a) new s(this));
    public final RecyclerView n;
    public final View o;
    private final h.h q = h.i.a((h.f.a.a) new d(this));
    private final h.h r = h.i.a((h.f.a.a) h.f80864a);
    private final h.h s = h.i.a((h.f.a.a) i.f80865a);
    private final h.h t = h.i.a((h.f.a.a) C1886g.f80863a);
    private final h.h u = h.i.a((h.f.a.a) e.f80862a);
    private final h.h v = h.i.a((h.f.a.a) new f(this));
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* access modifiers changed from: package-private */
    public static final class a extends Handler {

        /* renamed from: e  reason: collision with root package name */
        private static final C1885a f80855e = new C1885a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public boolean f80856a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f80857b;

        /* renamed from: c  reason: collision with root package name */
        private final WeakReference<g> f80858c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f80859d;

        static {
            Covode.recordClassIndex(50264);
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.b.g$a$a  reason: collision with other inner class name */
        static final class C1885a {
            static {
                Covode.recordClassIndex(50265);
            }

            private C1885a() {
            }

            public /* synthetic */ C1885a(byte b2) {
                this();
            }
        }

        public final void a() {
            this.f80859d = true;
            this.f80856a = false;
            removeMessages(1);
        }

        public final void b() {
            this.f80857b = false;
            this.f80859d = false;
            this.f80856a = false;
            removeCallbacksAndMessages(null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g gVar) {
            super(Looper.getMainLooper());
            h.f.b.l.d(gVar, "");
            this.f80858c = new WeakReference<>(gVar);
        }

        public final void a(Integer num) {
            if (this.f80859d) {
                this.f80859d = false;
                removeMessages(1);
                return;
            }
            this.f80856a = true;
            obtainMessage(1, num).sendToTarget();
        }

        public final void handleMessage(Message message) {
            T t;
            b bVar;
            String str;
            h.f.b.l.d(message, "");
            int i2 = message.what;
            Object obj = null;
            if (i2 == 1) {
                this.f80857b = true;
                g gVar = this.f80858c.get();
                if (gVar != null) {
                    Object obj2 = message.obj;
                    if (obj2 instanceof Integer) {
                        obj = obj2;
                    }
                    Integer num = (Integer) obj;
                    b a2 = gVar.a(0);
                    if (a2 != null) {
                        gVar.a(a2, num, new l(gVar, num));
                    }
                }
            } else if (i2 == 2) {
                Object obj3 = message.obj;
                g gVar2 = this.f80858c.get();
                if (gVar2 != null) {
                    Object obj4 = message.obj;
                    if (!(obj4 instanceof String)) {
                        obj4 = null;
                    }
                    Set<Map.Entry<Integer, b>> entrySet = gVar2.b().entrySet();
                    h.f.b.l.b(entrySet, "");
                    Iterator<T> it = entrySet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        T t2 = t;
                        Aweme u = ((b) t2.getValue()).d().u();
                        if (u != null) {
                            str = u.getAid();
                        } else {
                            str = null;
                        }
                        ((b) t2.getValue()).d().k();
                        if (h.f.b.l.a((Object) str, obj4) && d.b((b) t2.getValue()) >= 0) {
                            break;
                        }
                    }
                    T t3 = t;
                    if (t3 != null) {
                        bVar = (b) t3.getValue();
                        if (bVar != null) {
                            Integer.valueOf(bVar.d().k());
                        }
                    } else {
                        bVar = null;
                    }
                    gVar2.f80852k = null;
                    gVar2.f80847f = false;
                    if (bVar != null) {
                        gVar2.a(bVar, (Integer) null, (f) null);
                    }
                }
            }
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<int[]> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f80862a = new e();

        static {
            Covode.recordClassIndex(50269);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ int[] invoke() {
            return new int[2];
        }
    }

    static {
        Covode.recordClassIndex(50263);
    }

    private final Map<c, Float> h() {
        return (Map) this.s.getValue();
    }

    private final Map<c, Float> i() {
        return (Map) this.t.getValue();
    }

    private final int[] j() {
        return (int[]) this.u.getValue();
    }

    public final Context a() {
        return (Context) this.q.getValue();
    }

    /* access modifiers changed from: package-private */
    public final ConcurrentHashMap<Integer, b> b() {
        return (ConcurrentHashMap) this.r.getValue();
    }

    public final a c() {
        return (a) this.v.getValue();
    }

    static final class b {
        static {
            Covode.recordClassIndex(50266);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final void g() {
        f();
    }

    public final void a(boolean z2, AppBarLayout appBarLayout) {
        this.y = z2;
        this.f80848g = false;
        this.x = false;
        this.f80853l = null;
        this.f80852k = null;
        if (appBarLayout != null) {
            appBarLayout.a(new m(this));
        }
        l();
        this.n.b(this);
        this.n.a(this);
        this.n.removeOnAttachStateChangeListener(this);
        this.n.addOnAttachStateChangeListener(this);
        f();
        for (Map.Entry<Integer, b> entry : b().entrySet()) {
            Aweme u2 = entry.getValue().d().u();
            if (u2 != null) {
                u2.getDesc();
            }
            SearchPlayerCore a2 = d.a(entry.getValue());
            if (a2 != null) {
                com.ss.android.ugc.aweme.video.i mPlayer = a2.getMPlayer();
                if (mPlayer != null) {
                    Integer.valueOf(mPlayer.hashCode());
                }
                a2.getMPlayer();
                com.ss.android.ugc.aweme.video.i mPlayer2 = a2.getMPlayer();
                if (mPlayer2 != null) {
                    mPlayer2.H();
                }
            }
        }
        c().b();
        c().postDelayed(new n(this), 1000);
        this.A = true;
    }

    public final void a(String str) {
        if (str != null && str.length() != 0) {
            this.f80847f = true;
            a c2 = c();
            c2.removeMessages(2);
            Message obtain = Message.obtain();
            obtain.what = 2;
            obtain.obj = str;
            c2.sendMessageDelayed(obtain, 500);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<a> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(50270);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(this.this$0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.b.g$g  reason: collision with other inner class name */
    static final class C1886g extends h.f.b.m implements h.f.a.a<Map<c, Float>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1886g f80863a = new C1886g();

        static {
            Covode.recordClassIndex(50271);
        }

        C1886g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<c, Float> invoke() {
            return new LinkedHashMap();
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<ConcurrentHashMap<Integer, b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f80864a = new h();

        static {
            Covode.recordClassIndex(50272);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConcurrentHashMap<Integer, b> invoke() {
            return new ConcurrentHashMap();
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<Map<c, Float>> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f80865a = new i();

        static {
            Covode.recordClassIndex(50273);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<c, Float> invoke() {
            return new LinkedHashMap();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ h.f.a.a $fillHeightTask;

        static {
            Covode.recordClassIndex(50282);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(h.f.a.a aVar) {
            super(0);
            this.$fillHeightTask = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            this.$fillHeightTask.invoke();
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<Context> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(50268);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Context invoke() {
            return this.this$0.n.getContext();
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ View $it;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(50280);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(View view, g gVar) {
            super(0);
            this.$it = view;
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f80845d = this.$it.getHeight();
            return z.f158842a;
        }
    }

    public final void e() {
        if (this.A) {
            l();
            b(0);
        }
    }

    public static final class l extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f80875a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Integer f80876b;

        static {
            Covode.recordClassIndex(50276);
        }

        public static final class a extends f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f80877a;

            static {
                Covode.recordClassIndex(50277);
            }

            @Override // com.ss.android.ugc.aweme.discover.b.f
            public final void a() {
                b a2 = this.f80877a.f80875a.a(1);
                if (a2 != null) {
                    a2.n();
                }
                this.f80877a.f80875a.c().a(this.f80877a.f80876b);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(l lVar) {
                this.f80877a = lVar;
            }
        }

        @Override // com.ss.android.ugc.aweme.discover.b.f
        public final void a() {
            b a2 = this.f80875a.a(0);
            if (a2 != null) {
                a2.n();
            }
            b a3 = this.f80875a.a(1);
            if (a3 != null) {
                this.f80875a.a(a3, this.f80876b, new a(this));
            }
        }

        l(g gVar, Integer num) {
            this.f80875a = gVar;
            this.f80876b = num;
        }
    }

    static final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f80879a;

        static {
            Covode.recordClassIndex(50279);
        }

        n(g gVar) {
            this.f80879a = gVar;
        }

        public final void run() {
            this.f80879a.n.isAttachedToWindow();
            if (!this.f80879a.f80849h && this.f80879a.f80850i) {
                this.f80879a.d();
            }
            this.f80879a.f80848g = true;
        }
    }

    private final void l() {
        if (!this.f80844c) {
            r rVar = new r(this);
            if (this.o.getHeight() <= 0) {
                iv.a(this.o, new q(rVar));
            } else {
                rVar.invoke();
            }
        }
    }

    public final void f() {
        if (c().f80856a) {
            c().a();
        }
        c(a(0));
        c(a(1));
        c(this.f80853l);
    }

    /* access modifiers changed from: package-private */
    public static final class r extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(50283);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            float f2;
            int[] iArr = new int[2];
            this.this$0.o.getLocationOnScreen(iArr);
            int i2 = iArr[1];
            g gVar = this.this$0;
            float f3 = (float) i2;
            gVar.f80842a = (((float) gVar.o.getHeight()) * 0.15f) + f3;
            g gVar2 = this.this$0;
            float height = (float) gVar2.o.getHeight();
            if (as.a() == 0 || as.a() == 1 || as.a() == 3) {
                f2 = 0.45f;
            } else {
                f2 = 0.35f;
            }
            gVar2.f80843b = f3 + (height * f2);
            this.this$0.f80844c = true;
            this.this$0.o.getHeight();
            return 0;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(50284);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
            if (com.ss.android.ugc.aweme.utils.fe.a.MOBILE != r1) goto L_0x0009;
         */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Boolean invoke() {
            /*
                r4 = this;
                boolean r1 = com.ss.android.ugc.aweme.discover.b.h.b()
                r3 = 1
                r0 = 0
                if (r1 != 0) goto L_0x000e
            L_0x0008:
                r3 = 0
            L_0x0009:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                return r0
            L_0x000e:
                boolean r0 = com.ss.android.ugc.aweme.discover.a.w.a()
                if (r0 != 0) goto L_0x0015
                goto L_0x0008
            L_0x0015:
                com.ss.android.ugc.aweme.discover.b.g r0 = r4.this$0
                android.content.Context r1 = r0.a()
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)
                boolean r0 = com.ss.android.ugc.aweme.utils.fe.a(r1)
                if (r0 != 0) goto L_0x0027
                goto L_0x0008
            L_0x0027:
                com.ss.android.ugc.aweme.discover.b.g r0 = r4.this$0
                android.content.Context r2 = r0.a()
                com.ss.android.ugc.aweme.utils.fe$a r0 = com.ss.android.ugc.aweme.framework.c.a.f96676a
                if (r0 == 0) goto L_0x0037
                com.ss.android.ugc.aweme.utils.fe$a r1 = com.ss.android.ugc.aweme.framework.c.a.f96676a
                com.ss.android.ugc.aweme.utils.fe$a r0 = com.ss.android.ugc.aweme.utils.fe.a.NONE
                if (r1 != r0) goto L_0x004c
            L_0x0037:
                com.ss.android.ugc.aweme.utils.fe$a r1 = com.ss.android.ugc.aweme.utils.fe.b(r2)
            L_0x003b:
                com.ss.android.ugc.aweme.utils.fe$a r0 = com.ss.android.ugc.aweme.utils.fe.a.MOBILE_2G
                if (r0 == r1) goto L_0x0008
                com.ss.android.ugc.aweme.utils.fe$a r0 = com.ss.android.ugc.aweme.utils.fe.a.MOBILE_3G
                if (r0 == r1) goto L_0x0008
                com.ss.android.ugc.aweme.utils.fe$a r0 = com.ss.android.ugc.aweme.utils.fe.a.MOBILE_4G
                if (r0 == r1) goto L_0x0008
                com.ss.android.ugc.aweme.utils.fe$a r0 = com.ss.android.ugc.aweme.utils.fe.a.MOBILE
                if (r0 != r1) goto L_0x0009
                goto L_0x0008
            L_0x004c:
                com.ss.android.ugc.aweme.utils.fe$a r1 = com.ss.android.ugc.aweme.framework.c.a.f96676a
                goto L_0x003b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.b.g.s.invoke():java.lang.Object");
        }
    }

    private final b k() {
        T t2;
        Collection<b> values = b().values();
        h.f.b.l.b(values, "");
        Iterator<T> it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            T t3 = t2;
            if (t3.d().k() == 0 && com.ss.android.ugc.aweme.discover.mixfeed.a.b.a(Integer.valueOf(t3.d().i())) && t3.d().e()) {
                break;
            }
        }
        return t2;
    }

    public final void d() {
        Integer num;
        if (this.A && !this.f80847f && !this.f80849h && this.f80850i && !this.f80851j) {
            if (!this.x) {
                if (!this.y) {
                    int i2 = 1;
                    if (h.a() == 1) {
                        i2 = 3;
                    }
                    if (!c().f80857b) {
                        c().a(Integer.valueOf(i2));
                    } else {
                        b a2 = a(0);
                        if (a2 != null) {
                            a(a2, (Integer) null, (f) null);
                        }
                    }
                } else {
                    b k2 = k();
                    if (k2 != null) {
                        num = Integer.valueOf(k2.d().i());
                    } else {
                        num = null;
                    }
                    if (com.ss.android.ugc.aweme.discover.mixfeed.a.b.a(num) && k2 != null && k2.d().k() == 0) {
                        a(k2, (Integer) null, (f) null);
                    }
                }
            }
            b bVar = this.f80853l;
            if (bVar != null) {
                a(bVar, (Integer) null, (f) null);
            }
        }
    }

    public static final class j implements com.bytedance.lighten.a.c.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f80866a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f80867b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Integer f80868c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f80869d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SmartImageView f80870e;

        static {
            Covode.recordClassIndex(50274);
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri) {
            hashCode();
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view) {
            hashCode();
            if (view != null) {
                view.hashCode();
            }
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, com.bytedance.lighten.a.o oVar) {
            hashCode();
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, Throwable th) {
            hashCode();
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, Throwable th) {
            hashCode();
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, com.bytedance.lighten.a.o oVar, Animatable animatable) {
            SmartImageView p;
            com.facebook.fresco.animation.a.a aVar;
            b bVar;
            Integer num;
            int b2 = d.b(this.f80867b);
            hashCode();
            if (view != null) {
                Integer.valueOf(view.hashCode());
            }
            if (this.f80866a.f80852k == null || ((num = this.f80866a.f80852k) != null && num.intValue() == b2)) {
                g gVar = this.f80866a;
                b bVar2 = this.f80867b;
                Integer num2 = this.f80868c;
                f fVar = this.f80869d;
                if (bVar2 != null && (p = bVar2.p()) != null) {
                    d.b(bVar2);
                    if (!gVar.f80849h) {
                        e eVar = null;
                        if (!gVar.c().f80856a && (bVar = gVar.f80853l) != null) {
                            int b3 = d.b(bVar);
                            int b4 = d.b(bVar2);
                            d.d(bVar2);
                            d.d(bVar);
                            if (b3 != b4 && d.d(bVar)) {
                                b bVar3 = gVar.f80853l;
                                if (bVar3 != null) {
                                    Integer.valueOf(d.b(bVar3));
                                }
                                g.b(bVar);
                                bVar.n();
                            }
                        }
                        com.facebook.fresco.animation.c.a a2 = d.a(p);
                        if (a2 != null) {
                            aVar = a2.f47564d;
                        } else {
                            aVar = null;
                        }
                        if (aVar instanceof e) {
                            eVar = aVar;
                        }
                        e eVar2 = eVar;
                        if (eVar2 != null) {
                            eVar2.f80841b = num2;
                        } else if (a2 != null) {
                            a2.a(new e(a2.f47564d, num2));
                        }
                        d.a(p, new p(fVar));
                        if (p.f39942c == null || !p.f39942c.f39963b) {
                            d.b(bVar2);
                            return;
                        }
                        d.b(bVar2);
                        Aweme u = bVar2.d().u();
                        if (u != null) {
                            u.getDesc();
                        }
                        p.setUserVisibleHint(true);
                        p.b();
                        gVar.f80853l = bVar2;
                        return;
                    }
                    return;
                }
                return;
            }
            d.b(this.f80870e);
        }

        j(g gVar, b bVar, Integer num, f fVar, SmartImageView smartImageView) {
            this.f80866a = gVar;
            this.f80867b = bVar;
            this.f80868c = num;
            this.f80869d = fVar;
            this.f80870e = smartImageView;
        }
    }

    public final void onViewAttachedToWindow(View view) {
        d();
    }

    public static final class p extends com.facebook.fresco.animation.c.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f80880a;

        static {
            Covode.recordClassIndex(50281);
        }

        @Override // com.facebook.fresco.animation.c.b, com.facebook.fresco.animation.c.c
        public final void a(com.facebook.fresco.animation.c.a aVar) {
        }

        p(f fVar) {
            this.f80880a = fVar;
        }

        @Override // com.facebook.fresco.animation.c.b, com.facebook.fresco.animation.c.c
        public final void b(com.facebook.fresco.animation.c.a aVar) {
            f fVar = this.f80880a;
            if (fVar != null) {
                fVar.a();
            }
        }
    }

    private static void c(b bVar) {
        if (h.d()) {
            b(bVar);
            if (bVar != null) {
                bVar.n();
                return;
            }
            return;
        }
        SearchPlayerCore a2 = d.a(bVar);
        if (a2 != null) {
            a2.a();
        }
    }

    static void b(b bVar) {
        SmartImageView p2;
        if (bVar != null && (p2 = bVar.p()) != null) {
            d.b(bVar);
            Aweme u2 = bVar.d().u();
            if (u2 != null) {
                u2.getDesc();
            }
            d.a(p2, null);
            p2.setUserVisibleHint(false);
            p2.c();
        }
    }

    /* access modifiers changed from: package-private */
    public final b a(int i2) {
        T t2;
        Collection<b> values = b().values();
        h.f.b.l.b(values, "");
        Iterator<T> it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            T t3 = t2;
            if (d.c(t3) == i2 && t3.d().e()) {
                break;
            }
        }
        return t2;
    }

    public final void onViewDetachedFromWindow(View view) {
        f();
        this.f80853l = null;
        this.C = null;
        this.y = false;
        this.x = false;
        this.f80844c = false;
        this.f80846e = 0;
        this.f80845d = 0;
        this.f80843b = 0.0f;
        this.f80842a = 0.0f;
        c().b();
        this.n.b(this);
        b().clear();
        h().clear();
        i().clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (r3 != null) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.ss.android.ugc.aweme.base.model.UrlModel d(com.ss.android.ugc.aweme.discover.b.b r5) {
        /*
            r4 = 0
            if (r5 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.search.j.a r0 = r5.d()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.u()
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.feed.model.Video r2 = r0.getVideo()
            if (r2 != 0) goto L_0x0014
        L_0x0013:
            return r4
        L_0x0014:
            int r1 = com.ss.android.ugc.aweme.discover.b.h.a()
            r0 = 1
            if (r1 == r0) goto L_0x0027
            r0 = 2
            if (r1 == r0) goto L_0x0032
            r0 = 3
            if (r1 == r0) goto L_0x0022
            goto L_0x0013
        L_0x0022:
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r2.getAiDynamicCoverBak()
            goto L_0x0036
        L_0x0027:
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r2.getAnimatedCover()
            if (r3 != 0) goto L_0x0039
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r2.getDynamicCover()
            goto L_0x0036
        L_0x0032:
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r2.getAiDynamicCover()
        L_0x0036:
            r0 = 0
            if (r3 == 0) goto L_0x0013
        L_0x0039:
            java.util.List r0 = r3.getUrlList()
            if (r0 == 0) goto L_0x0013
            java.util.Iterator r2 = r0.iterator()
        L_0x0043:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0013
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0043
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0043
            if (r1 == 0) goto L_0x0013
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.b.g.d(com.ss.android.ugc.aweme.discover.b.b):com.ss.android.ugc.aweme.base.model.UrlModel");
    }

    public static final class k implements SearchVideoView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f80871a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Boolean f80872b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SearchPlayerCore f80873c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f80874d;

        static {
            Covode.recordClassIndex(50275);
        }

        @Override // com.ss.android.ugc.aweme.autoplay.player.video.SearchVideoView.b
        public final void a(com.ss.android.ugc.aweme.shortvideo.j.j jVar) {
            h.f.b.l.d(jVar, "");
            int i2 = jVar.f128596c;
            if (i2 != 1) {
                if (i2 != 7) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 11) {
                                if (i2 != 12) {
                                    return;
                                }
                            } else if ((this.f80871a instanceof com.ss.android.ugc.aweme.discover.n.c) && i.a()) {
                                ((com.ss.android.ugc.aweme.discover.n.c) this.f80871a).L();
                                return;
                            } else {
                                return;
                            }
                        } else if ((this.f80871a instanceof com.ss.android.ugc.aweme.discover.n.c) && i.a()) {
                            ((com.ss.android.ugc.aweme.discover.n.c) this.f80871a).L();
                            return;
                        } else {
                            return;
                        }
                    } else if ((this.f80871a instanceof com.ss.android.ugc.aweme.discover.n.c) && i.a()) {
                        ((com.ss.android.ugc.aweme.discover.n.c) this.f80871a).N();
                        return;
                    } else {
                        return;
                    }
                } else if (h.f.b.l.a((Object) this.f80872b, (Object) true)) {
                    this.f80873c.a();
                    f fVar = this.f80874d;
                    if (fVar != null) {
                        fVar.a();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            if ((this.f80871a instanceof com.ss.android.ugc.aweme.discover.n.c) && i.a()) {
                ((com.ss.android.ugc.aweme.discover.n.c) this.f80871a).N();
            }
        }

        k(b bVar, Boolean bool, SearchPlayerCore searchPlayerCore, f fVar) {
            this.f80871a = bVar;
            this.f80872b = bool;
            this.f80873c = searchPlayerCore;
            this.f80874d = fVar;
        }
    }

    private final void b(int i2) {
        int i3;
        boolean z2;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i2 > 0) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        Integer num = this.B;
        if (num == null || num.intValue() != i3) {
            this.B = Integer.valueOf(i3);
            h().clear();
            i().clear();
        }
        if (Math.abs(i2) > 30) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f6 = this.f80842a;
        int i4 = this.f80846e;
        float f7 = f6 + ((float) i4);
        float f8 = this.f80843b + ((float) i4);
        b().size();
        for (b bVar : b().values()) {
            int b2 = d.b(bVar);
            if (b2 >= 0 && bVar.d().e()) {
                bVar.d().h().getLocationOnScreen(j());
                float f9 = (float) j()[1];
                float f10 = ((float) this.f80845d) + f9;
                int j2 = bVar.d().j();
                if (!com.ss.android.ugc.aweme.discover.mixfeed.a.b.a(Integer.valueOf(bVar.d().i())) || i2 == 0) {
                    if (j2 != 0) {
                        if (j2 == 1) {
                            if (i3 == 1) {
                                Float f11 = h().get(new c(bVar, Integer.valueOf(b2)));
                                if (f11 != null) {
                                    f3 = f11.floatValue();
                                } else {
                                    f3 = f9;
                                }
                                float c2 = h.j.h.c(f3, f9);
                                float b3 = h.j.h.b(f3, f9);
                                if (f7 >= c2 && f7 <= b3) {
                                    h.f.b.l.b(bVar, "");
                                    a(bVar, z2);
                                }
                            }
                        } else if (j2 != 1) {
                        }
                        if (i3 == -1) {
                            Float f12 = i().get(new c(bVar, Integer.valueOf(b2)));
                            if (f12 != null) {
                                f2 = f12.floatValue();
                            } else {
                                f2 = f10;
                            }
                            float c3 = h.j.h.c(f2, f10);
                            float b4 = h.j.h.b(f2, f10);
                            if (f8 >= c3 && f8 <= b4) {
                                h.f.b.l.b(bVar, "");
                                a(bVar, z2);
                            }
                        }
                    } else if (i3 == 1) {
                        Float f13 = h().get(new c(bVar, Integer.valueOf(b2)));
                        if (f13 != null) {
                            f5 = f13.floatValue();
                        } else {
                            f5 = f9;
                        }
                        float c4 = h.j.h.c(f5, f9);
                        float b5 = h.j.h.b(f5, f9);
                        if (f8 >= c4 && f8 <= b5) {
                            h.f.b.l.b(bVar, "");
                            a(bVar, z2);
                        }
                    } else if (i3 == -1) {
                        Float f14 = h().get(new c(bVar, Integer.valueOf(b2)));
                        if (f14 != null) {
                            f4 = f14.floatValue();
                        } else {
                            f4 = f9;
                        }
                        float c5 = h.j.h.c(f4, f9);
                        float b6 = h.j.h.b(f4, f9);
                        if (f7 >= c5 && f7 <= b6) {
                            h.f.b.l.b(bVar, "");
                            a(bVar, z2);
                        }
                    }
                    throw new IllegalStateException("Unsupported column index " + j2 + " found");
                }
                float f15 = this.f80843b;
                if (f15 >= f9 && f15 <= ((float) bVar.d().h().getHeight()) + f9) {
                    d.b(bVar);
                    h.f.b.l.b(bVar, "");
                    a(bVar, z2);
                }
                h().put(new c(bVar, Integer.valueOf(d.b(bVar))), Float.valueOf(f9));
                i().put(new c(bVar, Integer.valueOf(d.b(bVar))), Float.valueOf(f10));
            }
        }
    }

    public final void a(b bVar) {
        if (bVar != null && bVar.o()) {
            ConcurrentHashMap<Integer, b> b2 = b();
            Integer valueOf = Integer.valueOf(bVar.hashCode());
            if (b2.get(valueOf) == null) {
                bVar.hashCode();
                b().size();
                if (com.ss.android.ugc.aweme.discover.mixfeed.a.b.a(Integer.valueOf(bVar.d().i()))) {
                    this.z = true;
                }
                b2.putIfAbsent(valueOf, bVar);
            }
            if (this.f80845d <= 0 && bVar.d().i() == 16) {
                View h2 = bVar.d().h();
                if (h2.getHeight() <= 0) {
                    iv.a(h2, new o(h2, this));
                } else {
                    this.f80845d = h2.getHeight();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public b f80860a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f80861b;

        static {
            Covode.recordClassIndex(50267);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return h.f.b.l.a(this.f80860a, cVar.f80860a) && h.f.b.l.a(this.f80861b, cVar.f80861b);
        }

        public final int hashCode() {
            b bVar = this.f80860a;
            int i2 = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            Integer num = this.f80861b;
            if (num != null) {
                i2 = num.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "HolderAndPosition(holder=" + this.f80860a + ", adapterPos=" + this.f80861b + ")";
        }

        public c(b bVar, Integer num) {
            this.f80860a = bVar;
            this.f80861b = num;
        }
    }

    static final class m implements AppBarLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f80878a;

        static {
            Covode.recordClassIndex(50278);
        }

        m(g gVar) {
            this.f80878a = gVar;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.a
        public final void a(AppBarLayout appBarLayout, int i2) {
            this.f80878a.f80846e = i2;
        }
    }

    public g(RecyclerView recyclerView, View view) {
        h.f.b.l.d(recyclerView, "");
        h.f.b.l.d(view, "");
        this.n = recyclerView;
        this.o = view;
    }

    private final void a(b bVar, boolean z2) {
        boolean z3;
        boolean z4;
        if (c().f80856a) {
            c().a();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.w == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        long j2 = this.D;
        if (j2 == 0 || elapsedRealtime - j2 > 500) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z3 || z4 || z2) {
            Integer valueOf = Integer.valueOf(d.b(bVar));
            this.C = valueOf;
            this.f80852k = valueOf;
            d.b(bVar);
            return;
        }
        d.b(bVar);
        this.C = null;
        this.D = elapsedRealtime;
        this.f80852k = Integer.valueOf(d.b(bVar));
        a(bVar, (Integer) null, (f) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2) {
        RecyclerView.i iVar;
        T t2;
        b bVar;
        h.f.b.l.d(recyclerView, "");
        super.a(recyclerView, i2);
        this.w = i2;
        if (i2 == 0) {
            RecyclerView recyclerView2 = this.n;
            if (recyclerView2 != null) {
                iVar = recyclerView2.getLayoutManager();
            } else {
                iVar = null;
            }
            if (!(iVar instanceof LinearLayoutManager)) {
                iVar = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) iVar;
            if (linearLayoutManager != null && linearLayoutManager.l() == 0) {
                this.x = false;
                this.f80852k = null;
                this.C = null;
                if (this.y) {
                    b k2 = k();
                    if (k2 != null) {
                        a(k2, false);
                        return;
                    }
                    return;
                }
                b a2 = a(0);
                if (a2 != null) {
                    a(a2, (Integer) null, (f) null);
                    return;
                }
                return;
            }
            Integer num = this.C;
            if (num != null) {
                int intValue = num.intValue();
                Set<Map.Entry<Integer, b>> entrySet = b().entrySet();
                h.f.b.l.b(entrySet, "");
                Iterator<T> it = entrySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t2 = null;
                        break;
                    }
                    t2 = it.next();
                    if (intValue == d.b((b) t2.getValue())) {
                        break;
                    }
                }
                T t3 = t2;
                if (t3 != null) {
                    bVar = (b) t3.getValue();
                } else {
                    bVar = null;
                }
                a(bVar, (Integer) null, (f) null);
                this.C = null;
            }
        }
    }

    private final void b(b bVar, Integer num, f fVar) {
        SmartImageView p2;
        if (bVar != null && (p2 = bVar.p()) != null) {
            p2.setVisibility(0);
            com.ss.android.ugc.aweme.base.l a2 = v.a(d(bVar));
            List<String> list = a2.f68145b;
            h.f.b.l.b(list, "");
            h.a.n.h((List) list);
            com.bytedance.lighten.a.v a3 = com.bytedance.lighten.a.r.a(a2);
            a3.E = p2;
            com.bytedance.lighten.a.v a4 = a3.a("TLVideoPlayController");
            a4.n = androidx.core.content.b.a(a(), (int) R.drawable.be2);
            a4.a(new j(this, bVar, num, fVar, p2));
        }
    }

    private final void a(b bVar, Boolean bool, f fVar) {
        b.d q2;
        boolean z2;
        b bVar2;
        if (!this.f80849h && this.f80850i && bVar != null && (q2 = bVar.q()) != null && (q2 instanceof SearchVideoView)) {
            SearchVideoView searchVideoView = (SearchVideoView) q2;
            SearchPlayerCore a2 = d.a(bVar);
            if (a2 != null) {
                if (!a2.getSurfaceHolder().c()) {
                    bVar.hashCode();
                    return;
                }
                if (y.b(bVar.d().u()) || a.a()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                a2.setMute(z2);
                d.b(bVar);
                Aweme u2 = bVar.d().u();
                if (u2 != null) {
                    u2.getAid();
                }
                searchVideoView.setVideoPlayerStatusListener(new k(bVar, bool, a2, fVar));
                if (!c().f80856a && (bVar2 = this.f80853l) != null) {
                    int b2 = d.b(bVar2);
                    int b3 = d.b(bVar);
                    d.e(bVar);
                    d.e(bVar2);
                    if (b2 != b3 && d.e(bVar2)) {
                        b bVar3 = this.f80853l;
                        if (bVar3 != null) {
                            Integer.valueOf(d.b(bVar3));
                        }
                        SearchPlayerCore a3 = d.a(bVar2);
                        if (a3 != null) {
                            a3.a();
                        }
                    }
                }
                if (h.f.b.l.a((Object) bool, (Object) true)) {
                    a2.f67545a = 0;
                }
                a2.x();
                this.f80853l = bVar;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ae, code lost:
        if (r0.getMLiveStarted() == true) goto L_0x00b0;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.b.g.a(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void a(b bVar, Integer num, f fVar) {
        boolean z2;
        if (bVar != null) {
            com.ss.android.ugc.aweme.search.j.a d2 = bVar.d();
            d.b(bVar);
            d2.i();
            d2.r();
            d2.e();
            if (!this.f80849h && d2.e() && !d2.v()) {
                if (d2.i() == 16) {
                    if (!d2.r()) {
                        com.ss.android.ugc.aweme.autoplay.e.a.c(bVar);
                        com.ss.android.ugc.aweme.autoplay.e.a.d(bVar);
                        if (h.c()) {
                            if (num != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            a(bVar, Boolean.valueOf(z2), fVar);
                        } else if (h.d()) {
                            b(bVar, num, fVar);
                        }
                    }
                } else if (com.ss.android.ugc.aweme.discover.mixfeed.a.b.a(Integer.valueOf(d2.i())) && !bVar.m()) {
                    com.ss.android.ugc.aweme.autoplay.e.a.c(bVar.q());
                    com.ss.android.ugc.aweme.autoplay.e.a.d(bVar);
                    bVar.x();
                    this.f80853l = bVar;
                }
            }
        }
    }
}
