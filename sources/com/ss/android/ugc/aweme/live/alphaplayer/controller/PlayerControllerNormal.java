package com.ss.android.ugc.aweme.live.alphaplayer.controller;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.live.alphaplayer.a;
import com.ss.android.ugc.aweme.live.alphaplayer.a.b;
import com.ss.android.ugc.aweme.live.alphaplayer.c.a;
import com.ss.android.ugc.aweme.live.alphaplayer.d.c;
import com.ss.android.ugc.aweme.live.alphaplayer.d.d;
import java.io.File;

public class PlayerControllerNormal implements au, a {

    /* renamed from: a  reason: collision with root package name */
    public d f108220a;

    /* renamed from: b  reason: collision with root package name */
    public a f108221b;

    /* renamed from: c  reason: collision with root package name */
    private long f108222c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f108223d;

    /* renamed from: e  reason: collision with root package name */
    private Context f108224e;

    /* renamed from: f  reason: collision with root package name */
    private b f108225f;

    /* renamed from: g  reason: collision with root package name */
    private com.ss.android.ugc.aweme.live.alphaplayer.a.a f108226g;

    /* renamed from: h  reason: collision with root package name */
    private c<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> f108227h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f108228i;

    /* renamed from: j  reason: collision with root package name */
    private int f108229j;

    /* renamed from: k  reason: collision with root package name */
    private int f108230k;

    /* renamed from: l  reason: collision with root package name */
    private int f108231l;

    /* renamed from: m  reason: collision with root package name */
    private c.d<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> f108232m;
    private c.b<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> n;

    static {
        Covode.recordClassIndex(69354);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void a(com.ss.android.ugc.aweme.live.alphaplayer.a.d dVar) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final int j() {
        return 0;
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final View a() {
        return this.f108221b;
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        g();
    }

    @v(a = i.a.ON_PAUSE)
    public void onPause() {
        d();
    }

    @v(a = i.a.ON_RESUME)
    public void onResume() {
        e();
    }

    @v(a = i.a.ON_STOP)
    public void onStop() {
        f();
    }

    private void i() {
        this.f108223d = false;
        this.f108222c = 0;
        com.ss.android.ugc.aweme.live.alphaplayer.a.a aVar = this.f108226g;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final boolean b() {
        c<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> cVar = this.f108227h;
        if (cVar == null || !cVar.k()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final int c() {
        c<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> cVar = this.f108227h;
        if (cVar == null) {
            return -1;
        }
        try {
            return cVar.h().f108197c;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void h() {
        c<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> cVar = this.f108227h;
        if (cVar != null) {
            cVar.f();
            this.f108220a = d.NOT_PREPARED;
            this.f108223d = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void d() {
        if (this.f108227h != null && this.f108220a == d.STARTED) {
            this.f108227h.d();
            this.f108220a = d.PAUSED;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void e() {
        if (this.f108223d) {
            l();
        } else if (this.f108228i) {
            this.f108228i = false;
            k();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void f() {
        if (this.f108227h == null) {
            return;
        }
        if (this.f108220a == d.STARTED || this.f108220a == d.PAUSED) {
            this.f108227h.d();
            this.f108220a = d.PAUSED;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerControllerNormal$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f108233a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 69355(0x10eeb, float:9.7187E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.live.alphaplayer.d.d[] r0 = com.ss.android.ugc.aweme.live.alphaplayer.d.d.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerControllerNormal.AnonymousClass1.f108233a = r2
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.ss.android.ugc.aweme.live.alphaplayer.d.d.PREPARED     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerControllerNormal.AnonymousClass1.f108233a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.ss.android.ugc.aweme.live.alphaplayer.d.d.PAUSED     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerControllerNormal.AnonymousClass1.f108233a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.ss.android.ugc.aweme.live.alphaplayer.d.d.NOT_PREPARED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerControllerNormal.AnonymousClass1.f108233a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.ss.android.ugc.aweme.live.alphaplayer.d.d.STOPPED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerControllerNormal.AnonymousClass1.<clinit>():void");
        }
    }

    private void k() {
        if (this.f108227h != null) {
            if (this.f108220a == d.NOT_PREPARED || this.f108220a == d.STOPPED) {
                this.f108227h.a(this.f108232m);
                this.f108227h.a(this.n);
                this.f108227h.b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void g() {
        this.f108221b.onPause();
        if (this.f108227h == null) {
            this.f108220a = d.NOT_PREPARED;
            return;
        }
        if (this.f108220a == d.STARTED) {
            this.f108227h.d();
            this.f108220a = d.PAUSED;
        }
        if (this.f108220a == d.PAUSED) {
            this.f108227h.e();
            this.f108220a = d.STOPPED;
        }
        this.f108227h.g();
        this.f108221b.d();
        this.f108220a = d.RELEASE;
    }

    private void l() {
        if (this.f108227h != null) {
            int i2 = AnonymousClass1.f108233a[this.f108220a.ordinal()];
            if (i2 == 1) {
                this.f108227h.c();
                this.f108223d = true;
                this.f108220a = d.STARTED;
                com.ss.android.ugc.aweme.live.alphaplayer.a.a aVar = this.f108226g;
                if (aVar != null) {
                    aVar.a();
                }
            } else if (i2 == 2) {
                this.f108227h.c();
                this.f108220a = d.STARTED;
            } else if (i2 == 3 || i2 == 4) {
                try {
                    k();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    a("prepare and start MediaPlayer failure.");
                    i();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final a a(com.ss.android.ugc.aweme.live.alphaplayer.a.a aVar) {
        this.f108226g = aVar;
        return this;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void a(Surface surface) {
        this.f108227h.a(surface);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void a(b bVar) {
        this.f108225f = bVar;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void b(ViewGroup viewGroup) {
        MethodCollector.i(3931);
        if (viewGroup == null) {
            MethodCollector.o(3931);
            return;
        }
        viewGroup.removeView(this.f108221b);
        MethodCollector.o(3931);
    }

    private void a(String str) {
        String str2;
        b bVar = this.f108225f;
        if (bVar != null) {
            c<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> cVar = this.f108227h;
            if (cVar != null) {
                str2 = cVar.j();
            } else {
                str2 = "unknown";
            }
            bVar.a(false, str2, 0, 0, str + ", messageId: " + this.f108222c);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void a(ViewGroup viewGroup) {
        MethodCollector.i(3929);
        if (viewGroup == null) {
            MethodCollector.o(3929);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f108221b.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f108221b);
        }
        if (viewGroup.indexOfChild(this.f108221b) == -1) {
            viewGroup.addView(this.f108221b);
        }
        MethodCollector.o(3929);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void a(com.ss.android.ugc.aweme.live.alphaplayer.c.a aVar) {
        String str;
        this.f108222c = aVar.f108158d;
        if (aVar.f108155a) {
            this.f108221b.setVisibility(0);
            this.f108221b.bringToFront();
            try {
                this.f108227h.f();
                this.f108220a = d.NOT_PREPARED;
                int i2 = this.f108224e.getResources().getConfiguration().orientation;
                a.b a2 = aVar.a(i2);
                if (a2 != null && !TextUtils.isEmpty(a2.f108166a)) {
                    if (new File(a2.f108166a).exists()) {
                        this.f108221b.setConfigParams(a2);
                        this.f108227h.a(a2.f108166a);
                        this.f108229j = a2.f108173h;
                        this.f108230k = a2.f108174i;
                        this.f108231l = a2.f108175j;
                        if (this.f108221b.f108107a) {
                            k();
                            return;
                        } else {
                            this.f108228i = true;
                            return;
                        }
                    }
                }
                if (1 == i2) {
                    StringBuilder sb = new StringBuilder("dataPath is empty or File is not exists. path: ");
                    if (a2 == null) {
                        str = "null";
                    } else {
                        str = a2.f108166a;
                    }
                    a(sb.append(str).toString());
                }
                i();
            } catch (Exception e2) {
                e2.printStackTrace();
                i();
                a("alphaVideoView set dataSource failure:" + Log.getStackTraceString(e2));
            }
        } else {
            i();
            a("dataSource is invalid. ErrorInfo: " + aVar.f108157c);
        }
    }
}
