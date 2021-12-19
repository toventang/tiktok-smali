package com.bytedance.android.livesdk.newvideogift.controllers;

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
import com.ss.android.ugc.aweme.live.alphaplayer.a.b;
import com.ss.android.ugc.aweme.live.alphaplayer.c.a;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.a;
import com.ss.android.ugc.aweme.live.alphaplayer.d.c;
import com.ss.android.ugc.aweme.live.alphaplayer.d.d;
import java.io.File;

public class LocalPlayerControllerNormal implements au, a {

    /* renamed from: a  reason: collision with root package name */
    public d f19961a;

    /* renamed from: b  reason: collision with root package name */
    com.ss.android.ugc.aweme.live.alphaplayer.a.a f19962b;

    /* renamed from: c  reason: collision with root package name */
    c<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> f19963c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.live.alphaplayer.a f19964d;

    /* renamed from: e  reason: collision with root package name */
    int f19965e;

    /* renamed from: f  reason: collision with root package name */
    int f19966f;

    /* renamed from: g  reason: collision with root package name */
    int f19967g;

    /* renamed from: h  reason: collision with root package name */
    private long f19968h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f19969i;

    /* renamed from: j  reason: collision with root package name */
    private Context f19970j;

    /* renamed from: k  reason: collision with root package name */
    private b f19971k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f19972l;

    /* renamed from: m  reason: collision with root package name */
    private c.d<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> f19973m;
    private c.b<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> n;

    static {
        Covode.recordClassIndex(11801);
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
        return this.f19964d;
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
        this.f19969i = false;
        this.f19968h = 0;
        com.ss.android.ugc.aweme.live.alphaplayer.a.a aVar = this.f19962b;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final boolean b() {
        c<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> cVar = this.f19963c;
        if (cVar == null || !cVar.k()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final int c() {
        c<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> cVar = this.f19963c;
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
        c<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> cVar = this.f19963c;
        if (cVar != null) {
            cVar.f();
            this.f19961a = d.NOT_PREPARED;
            this.f19969i = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void d() {
        if (this.f19963c != null && this.f19961a == d.STARTED) {
            this.f19963c.d();
            this.f19961a = d.PAUSED;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void e() {
        if (this.f19969i) {
            l();
        } else if (this.f19972l) {
            this.f19972l = false;
            k();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void f() {
        if (this.f19963c == null) {
            return;
        }
        if (this.f19961a == d.STARTED || this.f19961a == d.PAUSED) {
            this.f19963c.d();
            this.f19961a = d.PAUSED;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerControllerNormal$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f19974a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 11802(0x2e1a, float:1.6538E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.live.alphaplayer.d.d[] r0 = com.ss.android.ugc.aweme.live.alphaplayer.d.d.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerControllerNormal.AnonymousClass1.f19974a = r2
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.ss.android.ugc.aweme.live.alphaplayer.d.d.PREPARED     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerControllerNormal.AnonymousClass1.f19974a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.ss.android.ugc.aweme.live.alphaplayer.d.d.PAUSED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerControllerNormal.AnonymousClass1.f19974a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.ss.android.ugc.aweme.live.alphaplayer.d.d.NOT_PREPARED     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerControllerNormal.AnonymousClass1.f19974a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.ss.android.ugc.aweme.live.alphaplayer.d.d r0 = com.ss.android.ugc.aweme.live.alphaplayer.d.d.STOPPED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.newvideogift.controllers.LocalPlayerControllerNormal.AnonymousClass1.<clinit>():void");
        }
    }

    private void k() {
        if (this.f19963c != null) {
            if (this.f19961a == d.NOT_PREPARED || this.f19961a == d.STOPPED) {
                this.f19963c.a(this.f19973m);
                this.f19963c.a(this.n);
                this.f19963c.b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void g() {
        this.f19964d.onPause();
        if (this.f19963c == null) {
            this.f19961a = d.NOT_PREPARED;
            return;
        }
        if (this.f19961a == d.STARTED) {
            this.f19963c.d();
            this.f19961a = d.PAUSED;
        }
        if (this.f19961a == d.PAUSED) {
            this.f19963c.e();
            this.f19961a = d.STOPPED;
        }
        this.f19963c.g();
        this.f19964d.d();
        this.f19961a = d.RELEASE;
    }

    private void l() {
        if (this.f19963c != null) {
            int i2 = AnonymousClass1.f19974a[this.f19961a.ordinal()];
            if (i2 == 1) {
                this.f19963c.c();
                this.f19969i = true;
                this.f19961a = d.STARTED;
                com.ss.android.ugc.aweme.live.alphaplayer.a.a aVar = this.f19962b;
                if (aVar != null) {
                    aVar.a();
                }
            } else if (i2 == 2) {
                this.f19963c.c();
                this.f19961a = d.STARTED;
            } else if (i2 == 3 || i2 == 4) {
                try {
                    k();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    a(false, "prepare and start MediaPlayer failure.");
                    i();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final a a(com.ss.android.ugc.aweme.live.alphaplayer.a.a aVar) {
        this.f19962b = aVar;
        return this;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void a(Surface surface) {
        this.f19963c.a(surface);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void b(ViewGroup viewGroup) {
        MethodCollector.i(10922);
        if (viewGroup == null) {
            MethodCollector.o(10922);
            return;
        }
        viewGroup.removeView(this.f19964d);
        MethodCollector.o(10922);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void a(ViewGroup viewGroup) {
        MethodCollector.i(10757);
        if (viewGroup == null) {
            MethodCollector.o(10757);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f19964d.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f19964d);
        }
        if (viewGroup.indexOfChild(this.f19964d) == -1) {
            viewGroup.addView(this.f19964d);
        }
        MethodCollector.o(10757);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void a(b bVar) {
        this.f19971k = bVar;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.a
    public final void a(com.ss.android.ugc.aweme.live.alphaplayer.c.a aVar) {
        String str;
        this.f19968h = aVar.f108158d;
        if (aVar.f108155a) {
            this.f19964d.setVisibility(0);
            this.f19964d.bringToFront();
            try {
                this.f19963c.f();
                this.f19961a = d.NOT_PREPARED;
                int i2 = this.f19970j.getResources().getConfiguration().orientation;
                a.b a2 = aVar.a(i2);
                if (a2 != null && !TextUtils.isEmpty(a2.f108166a)) {
                    if (new File(a2.f108166a).exists()) {
                        this.f19964d.setConfigParams(a2);
                        this.f19963c.a(a2.f108166a);
                        this.f19965e = a2.f108173h;
                        this.f19966f = a2.f108174i;
                        this.f19967g = a2.f108175j;
                        if (this.f19964d.f108107a) {
                            k();
                            return;
                        } else {
                            this.f19972l = true;
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
                    a(false, sb.append(str).toString());
                }
                i();
            } catch (Exception e2) {
                e2.printStackTrace();
                i();
                a(false, "alphaVideoView set dataSource failure:" + Log.getStackTraceString(e2));
            }
        } else {
            i();
            a(false, "dataSource is invalid. ErrorInfo: " + aVar.f108157c);
        }
    }

    private void a(boolean z, String str) {
        a(false, 0, 0, str);
    }

    private void a(boolean z, int i2, int i3, String str) {
        String str2;
        b bVar = this.f19971k;
        if (bVar != null) {
            c<com.ss.android.ugc.aweme.live.alphaplayer.d.a<com.ss.android.ugc.aweme.live.alphaplayer.d.a>> cVar = this.f19963c;
            if (cVar != null) {
                str2 = cVar.j();
            } else {
                str2 = "unknown";
            }
            bVar.a(z, str2, 0, 0, str + ", messageId: " + this.f19968h);
        }
    }
}
