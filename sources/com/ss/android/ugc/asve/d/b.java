package com.ss.android.ugc.asve.d;

import android.os.Handler;
import android.os.Looper;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.medialib.qr.PicScanner;
import com.ss.android.medialib.qr.ScanSettings;
import com.ss.android.ugc.asve.context.h;
import com.ss.android.ugc.asve.d.a;
import com.ss.android.vesdk.a.d;
import com.ss.android.vesdk.ax;
import h.f.b.l;

public final class b implements MessageCenter.Listener, a {

    /* renamed from: a  reason: collision with root package name */
    public a.b f61964a;

    /* renamed from: b  reason: collision with root package name */
    public PicScanner f61965b;

    /* renamed from: c  reason: collision with root package name */
    public final String f61966c = "VEScanController";

    /* renamed from: d  reason: collision with root package name */
    private final Handler f61967d = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    private final a f61968e = new a(this);

    /* renamed from: f  reason: collision with root package name */
    private final ax f61969f;

    /* renamed from: g  reason: collision with root package name */
    private final h f61970g;

    static {
        Covode.recordClassIndex(38106);
    }

    private final void d() {
        MessageCenter.removeListener(this);
        MessageCenter.addListener(this);
    }

    @Override // com.ss.android.ugc.asve.d.a
    public final void c() {
        PicScanner picScanner = this.f61965b;
        if (picScanner != null) {
            picScanner.release();
        }
        MessageCenter.removeListener(this);
    }

    @Override // com.ss.android.ugc.asve.d.a
    public final void a() {
        PicScanner picScanner = this.f61965b;
        if (picScanner != null) {
            picScanner.stop();
        }
        a aVar = this.f61968e;
        if (aVar != null) {
            this.f61967d.removeCallbacks(aVar);
        }
        this.f61965b = null;
    }

    @Override // com.ss.android.ugc.asve.d.a
    public final void b() {
        if (!this.f61970g.z()) {
            a();
        }
        a(false, 65536L);
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final PicScanner f61971a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f61972b;

        static {
            Covode.recordClassIndex(38107);
        }

        public final void run() {
            a.b bVar;
            MethodCollector.i(9788);
            synchronized (this.f61972b) {
                try {
                    PicScanner picScanner = this.f61971a;
                    if (picScanner != null && !(!l.a(picScanner, this.f61972b.f61965b))) {
                        if (this.f61971a.isValid()) {
                            if (!this.f61971a.isSuccess() && (bVar = this.f61972b.f61964a) != null) {
                                bVar.a(a.C1352a.f61960b);
                            }
                            MethodCollector.o(9788);
                        }
                    }
                } finally {
                    MethodCollector.o(9788);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(b bVar) {
            this.f61972b = bVar;
            this.f61971a = bVar.f61965b;
        }
    }

    @Override // com.ss.android.ugc.asve.d.a
    public final void a(a.b bVar) {
        this.f61964a = bVar;
    }

    @Override // com.ss.android.ugc.asve.d.a
    public final void a(boolean z) {
        this.f61969f.k(z);
    }

    @Override // com.ss.android.ugc.asve.d.a
    public final void a(float f2, float f3) {
        this.f61969f.b(f2, f3);
    }

    public b(ax axVar, h hVar) {
        l.d(axVar, "");
        l.d(hVar, "");
        this.f61969f = axVar;
        this.f61970g = hVar;
    }

    @Override // com.ss.android.ugc.asve.d.a
    public final void a(boolean z, long j2) {
        d();
        this.f61969f.a(z, j2);
    }

    @Override // com.ss.android.ugc.asve.d.a
    public final void a(String str, ScanSettings scanSettings, long j2) {
        a.b bVar;
        l.d(str, "");
        l.d(scanSettings, "");
        a();
        if (this.f61965b == null) {
            this.f61965b = new PicScanner();
        }
        d();
        PicScanner picScanner = this.f61965b;
        if ((picScanner == null || picScanner.start(str, scanSettings) < 0) && (bVar = this.f61964a) != null) {
            bVar.a(a.C1352a.f61959a);
        }
        this.f61967d.postDelayed(this.f61968e, j2);
    }

    @Override // com.ss.android.ugc.asve.d.a
    public final void a(float f2, float f3, float f4, float f5) {
        this.f61969f.a(f2, f3, f4, f5);
    }

    @Override // com.ss.android.ugc.asve.d.a
    public final void a(String str, int i2, int i3, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f61969f.a(str, i2, i3, str2);
    }

    @Override // com.ss.android.ugc.asve.d.a
    public final int b(float f2, float f3, float f4, float f5) {
        d();
        d dVar = new d();
        dVar.f150881b = f2;
        dVar.f150882f = f3;
        dVar.f150883g = f4;
        dVar.f150884h = f5;
        dVar.f150885i = true;
        dVar.f150886j = 0;
        dVar.f150887k = d.f150880a;
        dVar.f150888l = 0;
        dVar.f150889m = false;
        return this.f61969f.I().a(dVar);
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i2, int i3, int i4, String str) {
        if (i2 == 24) {
            PicScanner picScanner = this.f61965b;
            if (picScanner != null) {
                a.b bVar = this.f61964a;
                if (bVar != null) {
                    bVar.a(picScanner.getEnigmaResult());
                    return;
                }
                return;
            }
            EnigmaResult q = this.f61969f.q();
            a.b bVar2 = this.f61964a;
            if (bVar2 != null) {
                bVar2.a(q);
            }
        }
    }
}
