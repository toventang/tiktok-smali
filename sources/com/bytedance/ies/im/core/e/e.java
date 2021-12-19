package com.bytedance.ies.im.core.e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.internal.utils.s;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final am f34059a = an.a(bf.f159040a);

    /* renamed from: b  reason: collision with root package name */
    static volatile long f34060b;

    /* renamed from: c  reason: collision with root package name */
    public static final e f34061c = new e();

    /* renamed from: d  reason: collision with root package name */
    private static Handler f34062d;

    public enum a {
        HEART_BEAT,
        IM_BIZ,
        NET,
        WS;

        static {
            Covode.recordClassIndex(20281);
        }
    }

    private e() {
    }

    static {
        Covode.recordClassIndex(20280);
    }

    public static void a() {
        com.bytedance.ies.im.core.api.a.b().b("SDKMessagePuller", "tokenPullMessage");
        if (b() && SystemClock.uptimeMillis() - f34060b > 5000) {
            com.bytedance.ies.im.core.api.a.b().b("SDKMessagePuller", "tokenPullMessage real");
            f34060b = SystemClock.uptimeMillis();
            com.bytedance.im.core.a.d.a().e();
        }
    }

    public static boolean b() {
        int[] iArr = com.bytedance.ies.im.core.api.a.f().a().f33962a;
        for (int i2 : iArr) {
            if (com.bytedance.im.core.a.d.a().f37561a != null) {
                com.bytedance.im.core.a.d.a();
                s.a();
                if (s.g(i2)) {
                }
            }
            return false;
        }
        return true;
    }

    private final Handler c() {
        MethodCollector.i(910);
        if (f34062d == null) {
            synchronized (this) {
                try {
                    if (f34062d == null) {
                        f34062d = new b(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(910);
                    throw th;
                }
            }
        }
        Handler handler = f34062d;
        if (handler == null) {
            l.b();
        }
        MethodCollector.o(910);
        return handler;
    }

    public static final class b extends Handler {
        static {
            Covode.recordClassIndex(20282);
        }

        b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            l.d(message, "");
            super.handleMessage(message);
            if (message.what == 10) {
                e.a(a.HEART_BEAT);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.im.core.e.e$e  reason: collision with other inner class name */
    public static final class C0752e extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ int $reason;
        int label;

        static {
            Covode.recordClassIndex(20285);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0752e(int i2, h.c.d dVar) {
            super(2, dVar);
            this.$reason = i2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new C0752e(this.$reason, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((C0752e) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                com.bytedance.im.core.a.d.a().a(this.$reason);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final class c extends k implements m<am, h.c.d<? super z>, Object> {
        int label;

        static {
            Covode.recordClassIndex(20283);
        }

        public c(h.c.d dVar) {
            super(2, dVar);
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new c(dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                if (!e.b() || SystemClock.uptimeMillis() - e.f34060b <= 10000) {
                    e.f34061c.a(false);
                } else {
                    e.f34060b = SystemClock.uptimeMillis();
                    e.a(4);
                    e.f34061c.a(true);
                }
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends k implements m<am, h.c.d<? super z>, Object> {
        int label;

        static {
            Covode.recordClassIndex(20284);
        }

        d(h.c.d dVar) {
            super(2, dVar);
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new d(dVar);
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
                if (!e.b() || SystemClock.uptimeMillis() - e.f34060b <= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                    e.f34061c.a(false);
                } else {
                    e.f34060b = SystemClock.uptimeMillis();
                    e.a(3);
                    e.f34061c.a(true);
                }
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static void a(int i2) {
        com.bytedance.ies.im.core.api.a.b().b("SDKMessagePuller", "realPullMessage: " + com.bytedance.ies.im.core.c.a.a());
        if (com.bytedance.ies.im.core.c.a.a()) {
            bz unused = i.a(f34059a, null, null, new C0752e(i2, null), 3);
        } else {
            com.bytedance.im.core.a.d.a().a(i2);
        }
    }

    public static void a(a aVar) {
        l.d(aVar, "");
        com.bytedance.ies.im.core.api.a.b().b("SDKMessagePuller", "pullMessage: ".concat(String.valueOf(aVar)));
        bz unused = i.a(f34059a, null, null, new d(null), 3);
    }

    public final void a(boolean z) {
        Handler handler = f34062d;
        if (handler != null) {
            if (z || !handler.hasMessages(10)) {
                Handler handler2 = f34062d;
                if (handler2 == null) {
                    l.b();
                }
                handler2.removeMessages(10);
            } else {
                return;
            }
        }
        if (com.bytedance.ies.im.core.i.a.f34189a.a() || !com.bytedance.ies.im.core.api.a.c().a()) {
            com.bytedance.ies.im.core.api.a.b().a("SDKMessagePuller", "ws connected or net unavailable");
            return;
        }
        com.bytedance.ies.im.core.api.a.c();
        int a2 = com.bytedance.ies.abmock.b.a().a(true, "im_api_hb_when_ws_disable", 15000);
        if (a2 < 0) {
            com.bytedance.ies.im.core.api.a.b().b("SDKMessagePuller", "api hb disable");
        } else if (a2 == 0) {
            com.bytedance.ies.im.core.api.a.b().b("SDKMessagePuller", "ab test not config");
        } else {
            if (a2 < 10000) {
                a2 = 10000;
            }
            com.bytedance.ies.im.core.api.a.b().b("SDKMessagePuller", "delayNetPullMsg interval=".concat(String.valueOf(a2)));
            Message obtainMessage = c().obtainMessage(10);
            l.b(obtainMessage, "");
            c().sendMessageDelayed(obtainMessage, (long) a2);
        }
    }
}
