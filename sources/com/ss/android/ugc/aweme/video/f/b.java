package com.ss.android.ugc.aweme.video.f;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.video.b.q;
import com.ss.android.ugc.aweme.video.f.c;
import com.ss.android.ugc.aweme.video.i;
import com.ss.android.ugc.aweme.video.preload.s;
import com.ss.android.ugc.aweme.video.v;
import com.toutiao.proxyserver.u;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

public class b implements a {
    private static final String B = b.class.getSimpleName();
    int A = -1;
    private a C;
    private c D;
    private SparseArray<View> E = new SparseArray<>();
    private int F = -1;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f143374a;

    /* renamed from: b  reason: collision with root package name */
    long f143375b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f143376c = 0;

    /* renamed from: d  reason: collision with root package name */
    int f143377d = 0;

    /* renamed from: e  reason: collision with root package name */
    long f143378e;

    /* renamed from: f  reason: collision with root package name */
    boolean f143379f;

    /* renamed from: g  reason: collision with root package name */
    int f143380g;

    /* renamed from: h  reason: collision with root package name */
    int f143381h;

    /* renamed from: i  reason: collision with root package name */
    int f143382i = -1;

    /* renamed from: j  reason: collision with root package name */
    long f143383j = -1;

    /* renamed from: k  reason: collision with root package name */
    int f143384k;

    /* renamed from: l  reason: collision with root package name */
    float f143385l;

    /* renamed from: m  reason: collision with root package name */
    String f143386m;
    String n;
    String o;
    String p;
    String q;
    boolean r;
    String s;
    String t;
    String u;
    double v;
    int w = -1;
    int x = -1;
    String y;
    int z;

    static {
        Covode.recordClassIndex(93836);
    }

    @Override // com.ss.android.ugc.aweme.video.f.a
    public final void a() {
        this.f143377d = 0;
        this.f143375b = 0;
        this.f143376c = 0;
        this.f143378e = 0;
        this.f143379f = false;
        this.f143382i = -1;
        this.f143383j = -1;
        this.t = null;
        this.s = null;
        this.q = null;
        this.f143386m = null;
        this.r = false;
        this.x = -1;
        this.w = -1;
        this.y = null;
    }

    @Override // com.ss.android.ugc.aweme.video.f.a
    public final void a(int i2) {
        this.f143377d = i2;
    }

    @Override // com.ss.android.ugc.aweme.video.f.a
    public final void b(int i2) {
        this.f143376c = i2;
    }

    @Override // com.ss.android.ugc.aweme.video.f.a
    public final void a(long j2) {
        this.f143375b = j2;
    }

    static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<b> f143387a;

        static {
            Covode.recordClassIndex(93837);
        }

        a(b bVar) {
            this.f143387a = new WeakReference<>(bVar);
        }

        public final void handleMessage(Message message) {
            b bVar;
            String str;
            WeakReference<b> weakReference = this.f143387a;
            if (weakReference != null && (bVar = weakReference.get()) != null && message.what == 1) {
                i O = v.O();
                bVar.a(R.string.g2m, bVar.p);
                if (bVar.o == null || bVar.o.length() <= 25) {
                    bVar.a(R.string.h7i, bVar.o);
                } else {
                    bVar.a(R.string.h7i, bVar.o.substring(0, 25) + "\n" + bVar.o.substring(25, bVar.o.length()));
                }
                bVar.a(R.string.byg, String.valueOf(bVar.f143378e) + "ms");
                bVar.a(R.string.a7k, String.valueOf(bVar.f143376c));
                bVar.a(R.string.a7l, String.valueOf(bVar.f143375b) + "ms");
                bVar.a(R.string.d18, String.valueOf(bVar.f143377d));
                bVar.a(R.string.a8t, String.valueOf(bVar.f143382i));
                bVar.a(R.string.haf, String.valueOf(bVar.f143383j));
                bVar.a(R.string.g30, bVar.s);
                bVar.a(R.string.cp3, String.valueOf(bVar.f143379f));
                bVar.a(R.string.b4i, String.valueOf(bVar.t));
                bVar.a(R.string.g1l, String.valueOf(bVar.u));
                bVar.a(R.string.g1m, String.valueOf(bVar.v));
                bVar.a(R.string.dr7, String.valueOf(O.a()));
                bVar.a(R.string.h82, String.valueOf(u.f154997l));
                bVar.a(R.string.dqy, String.valueOf(bVar.f143385l));
                bVar.a(R.string.a8x, bVar.f143386m);
                bVar.a(R.string.co4, String.valueOf(bVar.f143380g) + "KBps");
                bVar.a(R.string.et8, String.valueOf(bVar.f143381h) + "KBps");
                bVar.a(R.string.a6d, String.valueOf(bVar.f143384k));
                if (bVar.n != null) {
                    bVar.a(R.string.a6e, bVar.n);
                }
                bVar.a(R.string.gaq, "false");
                bVar.a(R.string.d6c, "false");
                bVar.a(R.string.h7x, String.valueOf(bVar.r));
                if (bVar.q == null || bVar.q.length() <= 120) {
                    str = bVar.q;
                } else {
                    str = bVar.q.substring(0, 120);
                }
                bVar.a(R.string.drb, str);
                bVar.a(R.string.dr8, O.b());
                bVar.a(R.string.ete, q.b() + s.b().e().getClass().getSimpleName());
                bVar.a(R.string.ahf, new StringBuilder().append(bVar.w).toString());
                bVar.a(R.string.ahe, new StringBuilder().append(bVar.x).toString());
                bVar.a(R.string.hda, String.valueOf(bVar.y));
                bVar.a(R.string.h7u, String.valueOf(bVar.z));
                bVar.a(R.string.etf, String.valueOf(bVar.A));
                removeMessages(1);
                if (!bVar.f143374a) {
                    sendEmptyMessageDelayed(1, 1000);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.video.f.a
    public final void a(boolean z2) {
        this.f143374a = !z2;
        if (z2) {
            this.C.sendEmptyMessageDelayed(1, 1000);
        } else {
            this.C.removeMessages(1);
        }
    }

    public b(Context context, FrameLayout frameLayout) {
        MethodCollector.i(8549);
        c cVar = new c(context);
        this.D = cVar;
        frameLayout.addView(cVar.f143389b, new FrameLayout.LayoutParams(-1, -1));
        this.C = new a(this);
        MethodCollector.o(8549);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, String str) {
        MethodCollector.i(8591);
        View view = this.E.get(i2);
        if (view == null) {
            c cVar = this.D;
            String string = cVar.f143388a.getString(i2);
            View a2 = com.a.a(LayoutInflater.from(cVar.f143388a), R.layout.b3o, cVar.f143390c, false);
            c.a a3 = c.a(a2);
            if (a3.f143391a != null) {
                a3.f143391a.setText(string);
            }
            a3.a(str);
            cVar.f143390c.addView(a2);
            this.E.put(i2, a2);
            MethodCollector.o(8591);
            return;
        }
        c.a(view).a(str);
        MethodCollector.o(8591);
    }
}
