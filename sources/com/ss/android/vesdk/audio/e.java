package com.ss.android.vesdk.audio;

import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.monitor.h;
import com.ss.android.vesdk.aj;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.m;
import com.ss.android.vesdk.u;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public int f150966a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f150967b;

    /* renamed from: c  reason: collision with root package name */
    boolean f150968c = ((Boolean) u.a().a("ve_enable_background_strategy", (Object) false)).booleanValue();

    /* renamed from: d  reason: collision with root package name */
    b f150969d;

    /* renamed from: e  reason: collision with root package name */
    public d f150970e;

    /* renamed from: f  reason: collision with root package name */
    AtomicBoolean f150971f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    public int f150972g = 3;

    /* renamed from: h  reason: collision with root package name */
    public int f150973h = 3;

    /* renamed from: i  reason: collision with root package name */
    PrivacyCert f150974i = null;

    /* renamed from: j  reason: collision with root package name */
    ConcurrentHashMap f150975j = new ConcurrentHashMap();

    /* renamed from: k  reason: collision with root package name */
    public i f150976k;

    /* renamed from: l  reason: collision with root package name */
    private Handler f150977l;

    /* renamed from: m  reason: collision with root package name */
    private HandlerThread f150978m;
    private ConditionVariable n = new ConditionVariable();
    private com.ss.android.ttve.b.a o;
    private Object p = new Object();

    static {
        Covode.recordClassIndex(99293);
    }

    private synchronized void b() {
        MethodCollector.i(2568);
        if (this.f150978m != null) {
            int i2 = Build.VERSION.SDK_INT;
            this.f150978m.quitSafely();
            this.f150978m = null;
            this.f150977l = null;
        }
        MethodCollector.o(2568);
    }

    public e() {
        an.b("TEAudioCaptureProxy", "KEY_ENABLE_BACKGROUND_STRATEGY : " + this.f150968c);
    }

    private synchronized Handler a() {
        Looper mainLooper;
        Handler handler;
        MethodCollector.i(2566);
        try {
            HandlerThread handlerThread = this.f150978m;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            HandlerThread handlerThread2 = new HandlerThread("TEAudioCaptureProxy");
            this.f150978m = handlerThread2;
            handlerThread2.start();
            handler = new Handler(this.f150978m.getLooper(), new a(this));
            MethodCollector.o(2566);
        } catch (Exception e2) {
            an.d("TEAudioCaptureProxy", "CreateHandler failed!: " + e2.toString());
            if (Looper.myLooper() != null) {
                mainLooper = Looper.myLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            Handler handler2 = new Handler(mainLooper, new a(this));
            MethodCollector.o(2566);
            return handler2;
        }
        return handler;
    }

    /* access modifiers changed from: package-private */
    public static class a implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<e> f150980a;

        static {
            Covode.recordClassIndex(99295);
        }

        public a(e eVar) {
            this.f150980a = new WeakReference<>(eVar);
        }

        public final boolean handleMessage(Message message) {
            int i2 = message.what;
            Object obj = message.obj;
            e eVar = this.f150980a.get();
            if (eVar == null) {
                an.d("TEAudioCaptureProxy", "audio capture is null");
                return false;
            }
            if (i2 == 0) {
                an.a("TEAudioCaptureProxy", "init mic:".concat(String.valueOf(eVar.a((m) obj))));
            } else if (i2 == 1) {
                PrivacyCert privacyCert = (PrivacyCert) obj;
                long currentTimeMillis = System.currentTimeMillis();
                int i3 = -105;
                if (eVar.f150966a != 1) {
                    an.b("TEAudioCaptureProxy", "start in a error state: " + eVar.f150966a);
                } else if (eVar.f150968c && eVar.f150967b) {
                    an.d("TEAudioCaptureProxy", "in background block start");
                    eVar.f150970e.a(aj.N, -1, 0.0d, null);
                    i3 = -1;
                } else if (eVar.f150969d == null) {
                    an.d("TEAudioCaptureProxy", "mic start error, audio record is null");
                } else {
                    i3 = eVar.f150969d.start(privacyCert);
                    eVar.f150966a = 2;
                    if (i3 == -2 || i3 == 0) {
                        eVar.f150970e.a(aj.N, i3, 0.0d, null);
                        h.a(0, "te_record_audio_mic_start_ret", 0L);
                    } else {
                        eVar.b(eVar.f150974i);
                        if (eVar.f150971f.get() || eVar.f150973h <= 0) {
                            eVar.f150970e.a(aj.M, aj.U, "use up retry start times");
                            h.a(0, "te_record_audio_mic_start_ret", (long) i3);
                        } else {
                            an.d("TEAudioCaptureProxy", "retry start mic times : " + eVar.f150973h + " ret: " + i3);
                            eVar.f150973h--;
                            eVar.a(1, eVar.f150974i, 30);
                        }
                    }
                    int i4 = eVar.f150973h;
                    eVar.f150975j.put("micStartRet".concat(String.valueOf(i4)), Integer.valueOf(i3));
                    eVar.f150975j.put("micStartCost".concat(String.valueOf(i4)), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }
                an.a("TEAudioCaptureProxy", "start mic:".concat(String.valueOf(i3)));
            } else if (i2 == 2) {
                an.a("TEAudioCaptureProxy", "stop mic:".concat(String.valueOf(eVar.b((PrivacyCert) obj))));
            } else if (i2 != 3) {
                an.d("TEAudioCaptureProxy", "mic msg error");
            } else {
                eVar.f150972g = 0;
                eVar.f150973h = 0;
                eVar.a((PrivacyCert) obj);
                an.a("TEAudioCaptureProxy", "release mic");
            }
            return false;
        }
    }

    @Override // com.ss.android.vesdk.audio.a
    public final int start(PrivacyCert privacyCert) {
        if (this.f150977l == null) {
            an.d("TEAudioCaptureProxy", "start, mHandler is null!");
            return -108;
        }
        this.f150974i = privacyCert;
        a(1, privacyCert, 0);
        return 0;
    }

    public final void a(PrivacyCert privacyCert) {
        MethodCollector.i(2557);
        synchronized (this.p) {
            try {
                if (this.f150966a == 2) {
                    b(privacyCert);
                }
                if (this.o != null) {
                    this.o = null;
                }
                b bVar = this.f150969d;
                if (bVar != null) {
                    bVar.release(privacyCert);
                    this.f150969d = null;
                }
                this.f150971f.set(false);
                this.n.open();
                this.f150966a = 0;
            } finally {
                MethodCollector.o(2557);
            }
        }
    }

    @Override // com.ss.android.vesdk.audio.a
    public final synchronized int init(m mVar) {
        MethodCollector.i(2545);
        if (this.f150977l != null) {
            MethodCollector.o(2545);
            return 0;
        }
        this.f150977l = a();
        this.f150972g = 3;
        this.f150973h = 3;
        a(0, mVar, 0);
        MethodCollector.o(2545);
        return 0;
    }

    @Override // com.ss.android.vesdk.audio.a
    public final int stop(PrivacyCert privacyCert) {
        if (this.f150977l == null) {
            an.d("TEAudioCaptureProxy", "stop, mHandler is null!");
            return -108;
        }
        h.a(0, "te_record_audio_mic_start_info", this.f150975j.toString());
        a(2, privacyCert, 0);
        return 0;
    }

    public final int b(PrivacyCert privacyCert) {
        MethodCollector.i(2561);
        synchronized (this.p) {
            try {
                if (this.f150966a != 2) {
                    an.d("TEAudioCaptureProxy", "mic stop in error state: " + this.f150966a);
                    return 0;
                }
                b bVar = this.f150969d;
                if (bVar == null) {
                    an.d("TEAudioCaptureProxy", "mic stop error, audio record is null");
                    MethodCollector.o(2561);
                    return -105;
                }
                int stop = bVar.stop(privacyCert);
                this.f150970e.a(aj.O, stop, 0.0d, null);
                this.f150966a = 1;
                MethodCollector.o(2561);
                return stop;
            } finally {
                MethodCollector.o(2561);
            }
        }
    }

    @Override // com.ss.android.vesdk.audio.a
    public final synchronized void release(PrivacyCert privacyCert) {
        MethodCollector.i(2554);
        if (this.f150977l == null) {
            an.c("TEAudioCaptureProxy", "release, mHandler is null!");
            MethodCollector.o(2554);
            return;
        }
        this.f150971f.set(true);
        long currentTimeMillis = System.currentTimeMillis();
        this.n.close();
        this.f150977l.removeCallbacksAndMessages(null);
        a(3, privacyCert, 0);
        this.n.block(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        an.a("TEAudioCaptureProxy", "mic release cost: " + currentTimeMillis2 + "ms");
        if (currentTimeMillis2 >= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
            an.d("TEAudioCaptureProxy", "mic release timeout");
        }
        if (this.f150971f.get() && this.f150969d != null) {
            a(privacyCert);
        }
        b();
        MethodCollector.o(2554);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008f, code lost:
        if (r7.f150972g == 0) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(com.ss.android.vesdk.m r8) {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.audio.e.a(com.ss.android.vesdk.m):int");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(int i2, Object obj, long j2) {
        MethodCollector.i(2544);
        Handler handler = this.f150977l;
        if (handler == null) {
            an.a("TEAudioCaptureProxy", "send MSG error mHandler is null");
            MethodCollector.o(2544);
            return;
        }
        if (handler.hasMessages(i2)) {
            this.f150977l.removeMessages(i2);
        }
        Message obtain = Message.obtain();
        obtain.obj = obj;
        obtain.what = i2;
        if (j2 <= 0) {
            this.f150977l.sendMessage(obtain);
            MethodCollector.o(2544);
            return;
        }
        this.f150977l.sendMessageDelayed(obtain, j2);
        MethodCollector.o(2544);
    }
}
