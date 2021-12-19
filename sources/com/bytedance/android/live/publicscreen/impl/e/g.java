package com.bytedance.android.live.publicscreen.impl.e;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.publicscreen.a.e;
import com.bytedance.android.live.publicscreen.impl.model.i;
import com.bytedance.android.live.publicscreen.impl.model.q;
import com.bytedance.android.livesdk.model.ba;
import com.bytedance.android.livesdk.model.message.az;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class g extends c {

    /* renamed from: d  reason: collision with root package name */
    private static final a f12323d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private long f12324b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.android.live.publicscreen.impl.a f12325c;

    /* renamed from: e  reason: collision with root package name */
    final Handler f12326e = new Handler(new b(this));

    /* renamed from: f  reason: collision with root package name */
    public int f12327f;

    /* renamed from: g  reason: collision with root package name */
    public int f12328g;

    /* renamed from: h  reason: collision with root package name */
    public int f12329h;

    /* renamed from: i  reason: collision with root package name */
    public int f12330i;

    /* renamed from: j  reason: collision with root package name */
    public int f12331j;

    /* renamed from: k  reason: collision with root package name */
    public int f12332k;

    /* renamed from: l  reason: collision with root package name */
    public int f12333l;

    /* renamed from: m  reason: collision with root package name */
    public int f12334m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    final long u = 60000;
    public long v;

    static {
        Covode.recordClassIndex(6781);
    }

    public abstract void a();

    static final class a {
        static {
            Covode.recordClassIndex(6782);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.c, com.bytedance.android.live.publicscreen.impl.e.b
    public void b() {
        super.b();
        this.f12326e.sendEmptyMessageDelayed(1, this.u);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.c, com.bytedance.android.live.publicscreen.impl.e.b
    public final void c() {
        super.c();
        f();
        this.f12324b = 0;
        this.f12326e.removeCallbacksAndMessages(null);
    }

    public g() {
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(e.class);
        this.f12325c = (com.bytedance.android.live.publicscreen.impl.a) (!(a2 instanceof com.bytedance.android.live.publicscreen.impl.a) ? null : a2);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.c, com.bytedance.android.live.publicscreen.impl.e.b
    public void d() {
        super.d();
        if (e().n.c()) {
            if (this.f12324b == 0) {
                this.f12324b = SystemClock.uptimeMillis();
            }
        } else if (this.f12324b > 0) {
            this.v += SystemClock.uptimeMillis() - this.f12324b;
            this.f12324b = 0;
        }
    }

    public final String g() {
        ba userAttr;
        if (e().f12205i) {
            return "anchor";
        }
        User a2 = e().a();
        if (a2 == null || (userAttr = a2.getUserAttr()) == null || !userAttr.f19030b) {
            return "viewer";
        }
        return "admin";
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        if (this.f12324b > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.v += uptimeMillis - this.f12324b;
            this.f12324b = uptimeMillis;
        }
        a();
        com.bytedance.android.live.publicscreen.impl.a aVar = this.f12325c;
        if (aVar != null) {
            aVar.addHotDuration(e().f12197a, this.v);
        }
        this.v = 0;
        this.f12327f = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.f12328g = 0;
        this.f12329h = 0;
        this.f12330i = 0;
        this.f12331j = 0;
        this.f12332k = 0;
        this.f12333l = 0;
        this.f12334m = 0;
        this.n = 0;
        this.o = 0;
        this.s = 0;
        this.t = 0;
    }

    static final class b implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f12335a;

        static {
            Covode.recordClassIndex(6783);
        }

        b(g gVar) {
            this.f12335a = gVar;
        }

        public final boolean handleMessage(Message message) {
            l.d(message, "");
            g gVar = this.f12335a;
            if (message.what != 1) {
                return false;
            }
            gVar.f();
            gVar.f12326e.sendEmptyMessageDelayed(1, gVar.u);
            return true;
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.c, com.bytedance.android.live.publicscreen.impl.e.b
    public void f(h hVar) {
        l.d(hVar, "");
        super.f(hVar);
        if (hVar instanceof com.bytedance.android.live.publicscreen.impl.model.g) {
            this.f12332k++;
        } else if (hVar instanceof com.bytedance.android.live.publicscreen.impl.model.e) {
            this.f12333l++;
        } else {
            if (hVar instanceof q) {
                if (((q) hVar).s()) {
                    this.f12334m++;
                    return;
                } else if (((q) hVar).t()) {
                    this.n++;
                    return;
                }
            }
            if (hVar instanceof com.bytedance.android.live.publicscreen.impl.model.chat.b) {
                this.o++;
            } else if (hVar instanceof i) {
                MESSAGE message = ((k) hVar).f12190d;
                l.b(message, "");
                if (((az) message).f19236h == 1) {
                    this.t++;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        if (com.facebook.imagepipeline.e.k.a().e().b(android.net.Uri.parse(r3)) == false) goto L_0x003d;
     */
    @Override // com.bytedance.android.live.publicscreen.impl.e.c, com.bytedance.android.live.publicscreen.impl.e.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.bytedance.android.live.publicscreen.a.d.h r5, long r6) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.e.g.a(com.bytedance.android.live.publicscreen.a.d.h, long):void");
    }
}
