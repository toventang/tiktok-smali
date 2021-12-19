package com.bytedance.android.livesdk.browser.e;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.monitor.d.g;
import com.bytedance.android.monitor.d.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.ies.web.jsbridge2.al;
import com.bytedance.ies.web.jsbridge2.q;
import com.bytedance.ies.web.jsbridge2.w;
import com.lynx.tasm.LynxView;
import h.f.b.l;
import java.util.List;

public final class a implements q {

    /* renamed from: b  reason: collision with root package name */
    public static final C0311a f14390b = new C0311a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.ies.web.jsbridge2.a f14391a;

    static {
        Covode.recordClassIndex(7974);
    }

    public static int a(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? 0 : -2;
        }
        return -1;
    }

    @Override // com.bytedance.ies.web.jsbridge2.q
    public final void a(w wVar, int i2) {
    }

    /* renamed from: com.bytedance.android.livesdk.browser.e.a$a  reason: collision with other inner class name */
    public static final class C0311a {
        static {
            Covode.recordClassIndex(7975);
        }

        private C0311a() {
        }

        public /* synthetic */ C0311a(byte b2) {
            this();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f14392a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f14393b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f14394c;

        static {
            Covode.recordClassIndex(7976);
        }

        b(a aVar, String str, long j2) {
            this.f14392a = aVar;
            this.f14393b = str;
            this.f14394c = j2;
        }

        public final void run() {
            LynxView lynxView = (LynxView) this.f14392a.f14391a.b();
            if (lynxView != null && !TextUtils.isEmpty(this.f14393b)) {
                h hVar = new h();
                hVar.f23482b = this.f14393b;
                hVar.f23483c = 0;
                hVar.f23487g = 0;
                if (hVar.f23487g != 0) {
                    hVar.f23488h = this.f14394c;
                    hVar.f23486f = hVar.f23488h - hVar.f23487g;
                }
                com.bytedance.android.monitor.lynx.b.f23580f.a(lynxView, hVar);
            }
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f14395a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f14396b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ al f14397c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f14398d;

        static {
            Covode.recordClassIndex(7977);
        }

        c(a aVar, String str, al alVar, long j2) {
            this.f14395a = aVar;
            this.f14396b = str;
            this.f14397c = alVar;
            this.f14398d = j2;
        }

        public final void run() {
            long j2;
            List<TimeLineEvent> list;
            LynxView lynxView = (LynxView) this.f14395a.f14391a.b();
            if (!(lynxView == null || TextUtils.isEmpty(this.f14396b))) {
                al alVar = this.f14397c;
                if (alVar == null || (list = alVar.f35618c) == null) {
                    j2 = 0;
                } else {
                    j2 = 0;
                    for (T t : list) {
                        if (t != null && l.a((Object) TimeLineEvent.b.ar, (Object) t.getLabel())) {
                            j2 = t.getElapsedTimestamp();
                        }
                    }
                }
                h hVar = new h();
                hVar.f23482b = this.f14396b;
                hVar.f23483c = 0;
                hVar.f23487g = j2;
                if (hVar.f23487g != 0) {
                    hVar.f23488h = this.f14398d;
                    hVar.f23486f = hVar.f23488h - hVar.f23487g;
                }
                com.bytedance.android.monitor.lynx.b.f23580f.a(lynxView, hVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f14399a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f14400b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f14401c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f14402d;

        static {
            Covode.recordClassIndex(7978);
        }

        d(a aVar, String str, int i2, long j2) {
            this.f14399a = aVar;
            this.f14400b = str;
            this.f14401c = i2;
            this.f14402d = j2;
        }

        public final void run() {
            LynxView lynxView = (LynxView) this.f14399a.f14391a.b();
            if (lynxView != null && !TextUtils.isEmpty(this.f14400b)) {
                h hVar = new h();
                hVar.f23482b = this.f14400b;
                hVar.f23483c = a.a(this.f14401c);
                hVar.f23487g = 0;
                if (hVar.f23487g != 0) {
                    hVar.f23488h = this.f14402d;
                    hVar.f23486f = this.f14402d - hVar.f23487g;
                }
                com.bytedance.android.monitor.lynx.b.f23580f.a(lynxView, hVar);
                g gVar = new g();
                gVar.f23479e = this.f14400b;
                gVar.f23477c = a.a(this.f14401c);
                com.bytedance.android.monitor.lynx.b.f23580f.a(lynxView, gVar);
            }
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f14403a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f14404b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ al f14405c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f14406d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f14407e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f14408f;

        static {
            Covode.recordClassIndex(7979);
        }

        e(a aVar, String str, al alVar, int i2, String str2, long j2) {
            this.f14403a = aVar;
            this.f14404b = str;
            this.f14405c = alVar;
            this.f14406d = i2;
            this.f14407e = str2;
            this.f14408f = j2;
        }

        public final void run() {
            long j2;
            List<TimeLineEvent> list;
            LynxView lynxView = (LynxView) this.f14403a.f14391a.b();
            if (!(lynxView == null || TextUtils.isEmpty(this.f14404b))) {
                al alVar = this.f14405c;
                if (alVar == null || (list = alVar.f35618c) == null) {
                    j2 = 0;
                } else {
                    j2 = 0;
                    for (T t : list) {
                        if (t != null && l.a((Object) TimeLineEvent.b.ar, (Object) t.getLabel())) {
                            j2 = t.getElapsedTimestamp();
                        }
                    }
                }
                h hVar = new h();
                hVar.f23482b = this.f14404b;
                hVar.f23483c = a.a(this.f14406d);
                hVar.f23484d = this.f14407e;
                hVar.f23487g = j2;
                if (hVar.f23487g != 0) {
                    hVar.f23488h = this.f14408f;
                    hVar.f23486f = hVar.f23488h - hVar.f23487g;
                }
                com.bytedance.android.monitor.lynx.b.f23580f.a(lynxView, hVar);
                g gVar = new g();
                gVar.f23479e = this.f14404b;
                gVar.f23477c = a.a(this.f14406d);
                gVar.f23478d = this.f14407e;
                com.bytedance.android.monitor.lynx.b.f23580f.a(lynxView, gVar);
            }
        }
    }

    public a(com.bytedance.ies.web.jsbridge2.a aVar) {
        l.d(aVar, "");
        this.f14391a = aVar;
    }

    @Override // com.bytedance.ies.web.jsbridge2.q
    public final void a(String str) {
        com.bytedance.android.monitor.f.a.a(new b(this, str, SystemClock.elapsedRealtime()));
    }

    @Override // com.bytedance.ies.web.jsbridge2.q
    public final void a(String str, al alVar) {
        com.bytedance.android.monitor.f.a.a(new c(this, str, alVar, SystemClock.elapsedRealtime()));
    }

    @Override // com.bytedance.ies.web.jsbridge2.q
    public final void a(String str, String str2, int i2) {
        b(str, str2, i2);
    }

    @Override // com.bytedance.ies.web.jsbridge2.q
    public final void b(String str, String str2, int i2) {
        com.bytedance.android.monitor.f.a.a(new d(this, str2, i2, SystemClock.elapsedRealtime()));
    }

    @Override // com.bytedance.ies.web.jsbridge2.q
    public final void a(String str, String str2, int i2, String str3, al alVar) {
        com.bytedance.android.monitor.f.a.a(new e(this, str2, alVar, i2, str3, SystemClock.elapsedRealtime()));
    }
}
