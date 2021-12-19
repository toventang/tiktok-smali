package com.ss.ttm.player;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.ttm.a.e;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AJVoice implements AudioTrack.OnPlaybackPositionUpdateListener {
    private static boolean B = false;
    private static String C = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f151924a = AJVoice.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private static final int f151925c = Build.VERSION.SDK_INT;
    private long A = -9223372036854775807L;
    private long D;
    private int E = 3;
    private d F;
    private int G = -1;
    private int H;
    private int I = -1;

    /* renamed from: b  reason: collision with root package name */
    public ConditionVariable f151926b;

    /* renamed from: d  reason: collision with root package name */
    private AudioTrack f151927d;

    /* renamed from: e  reason: collision with root package name */
    private TTPlayer f151928e;

    /* renamed from: f  reason: collision with root package name */
    private int f151929f = 2048;

    /* renamed from: g  reason: collision with root package name */
    private int f151930g = 44100;

    /* renamed from: h  reason: collision with root package name */
    private int f151931h = 2;

    /* renamed from: i  reason: collision with root package name */
    private int f151932i = 2;

    /* renamed from: j  reason: collision with root package name */
    private int f151933j;

    /* renamed from: k  reason: collision with root package name */
    private int f151934k;

    /* renamed from: l  reason: collision with root package name */
    private AudioManager f151935l;

    /* renamed from: m  reason: collision with root package name */
    private int f151936m;
    private long mNativeObject;
    private int n = 2;
    private float o = -1.0f;
    private int p;
    private volatile boolean q = true;
    private byte[] r;
    private int s = -1;
    private Method t;
    private int u;
    private int v;
    private int w;
    private long x;
    private long y;
    private long z;

    public void onMarkerReached(AudioTrack audioTrack) {
    }

    public void onPeriodicNotification(AudioTrack audioTrack) {
    }

    public int getMaxVolume() {
        return this.p;
    }

    public int getTrackBufferSize() {
        return this.u;
    }

    public int getSessionId() {
        AudioTrack audioTrack;
        int i2 = this.I;
        if (i2 != -1 || (audioTrack = this.f151927d) == null) {
            return i2;
        }
        return audioTrack.getAudioSessionId();
    }

    public void pause() {
        try {
            d dVar = this.F;
            if (dVar != null) {
                dVar.a();
            }
            this.f151927d.pause();
        } catch (Throwable unused) {
        }
    }

    static {
        Covode.recordClassIndex(101291);
    }

    private long e() {
        return ((this.y / ((long) a(this.n, this.f151931h))) * 1000) / ((long) this.f151930g);
    }

    public void close() {
        final AudioTrack audioTrack = this.f151927d;
        if (audioTrack != null) {
            this.f151927d = null;
            try {
                b.a(new Runnable() {
                    /* class com.ss.ttm.player.AJVoice.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(101292);
                    }

                    public final void run() {
                        AJVoice.this.a(audioTrack);
                    }
                });
            } catch (Throwable unused) {
                a(audioTrack);
            }
        }
    }

    public void flush() {
        try {
            d dVar = this.F;
            if (dVar != null) {
                dVar.b();
            }
            this.G = -1;
            this.f151927d.flush();
            if (this.y > 0) {
                this.y = 0;
            }
        } catch (Throwable unused) {
        }
    }

    public void resume() {
        try {
            d dVar = this.F;
            if (dVar != null) {
                AudioTrack audioTrack = this.f151927d;
                int i2 = this.n;
                dVar.a(audioTrack, i2, a(i2, this.f151931h), this.u);
                this.F.f152045c.a();
            }
            this.f151927d.play();
        } catch (Throwable unused) {
        }
    }

    public void stop() {
        if (!this.q) {
            this.q = true;
            try {
                d dVar = this.F;
                if (dVar != null) {
                    dVar.a();
                }
                this.f151927d.pause();
            } catch (Throwable unused) {
            }
        }
    }

    public AJVoice() {
        if (C == null) {
            String str = Build.DEVICE;
            C = str;
            if (str.equals("OnePlus6T")) {
                B = true;
            }
        }
    }

    private int b() {
        this.y = 0;
        this.v = 0;
        this.A = -9223372036854775807L;
        this.x = 0;
        this.z = 0;
        this.o = -1.0f;
        AudioTrack audioTrack = this.f151927d;
        this.f151927d = null;
        try {
            audioTrack.flush();
            audioTrack.release();
        } catch (Exception unused) {
        } catch (Throwable th) {
            a();
            throw th;
        }
        return a();
    }

    private boolean c() {
        if (this.A == -9223372036854775807L || this.y <= 0 || SystemClock.elapsedRealtime() - this.A < 200) {
            return false;
        }
        return true;
    }

    private long d() {
        int playState = this.f151927d.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) this.f151927d.getPlaybackHeadPosition());
        if (playbackHeadPosition == 0 && this.z > 0 && playState == 3) {
            if (this.A == -9223372036854775807L) {
                this.A = SystemClock.elapsedRealtime();
            }
            return this.z;
        }
        this.A = -9223372036854775807L;
        this.z = playbackHeadPosition;
        return playbackHeadPosition;
    }

    public int getEOSDelayMs() {
        long j2;
        long e2 = e();
        long d2 = (d() * 1000) / ((long) this.f151930g);
        if (getLatency() > 0) {
            j2 = (long) (this.v - this.w);
        } else {
            j2 = 0;
        }
        return (int) ((e2 - d2) + j2);
    }

    public float getVolume() {
        AudioManager audioManager;
        int i2 = 0;
        if (!(this.f151928e == null || this.o != -1.0f || (audioManager = this.f151935l) == null)) {
            try {
                int streamMaxVolume = audioManager.getStreamMaxVolume(this.E);
                try {
                    i2 = this.f151935l.getStreamVolume(this.E);
                } catch (Exception unused) {
                }
                if (i2 < 0) {
                    if (streamMaxVolume > 0) {
                        return (float) (streamMaxVolume / 4);
                    }
                    return 10.0f;
                }
            } catch (Exception unused2) {
            }
        }
        return (float) i2;
    }

    public int start() {
        if (this.f151927d == null) {
            return -2;
        }
        this.q = false;
        try {
            d dVar = this.F;
            if (dVar != null) {
                AudioTrack audioTrack = this.f151927d;
                int i2 = this.n;
                dVar.a(audioTrack, i2, a(i2, this.f151931h), this.u);
            }
            this.f151927d.play();
            this.s = -1;
            if (B) {
                this.D = SystemClock.elapsedRealtime();
            }
            return 0;
        } catch (Throwable unused) {
            return -3;
        }
    }

    public int getLatency() {
        Object invoke;
        d();
        if (this.t != null) {
            long nanoTime = System.nanoTime() / 1000000;
            if (nanoTime - this.x > 500) {
                try {
                    Method method = this.t;
                    AudioTrack audioTrack = this.f151927d;
                    Pair<Boolean, Object> a2 = a.a(method, new Object[]{audioTrack, null}, 110000, "java.lang.Object", true, "com_ss_ttm_player_AJVoice_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a2.first).booleanValue()) {
                        invoke = a2.second;
                    } else {
                        invoke = method.invoke(audioTrack, null);
                        a.a(invoke, method, new Object[]{audioTrack, null}, "com_ss_ttm_player_AJVoice_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    }
                    int intValue = ((Integer) invoke).intValue();
                    this.v = intValue;
                    int max = Math.max(intValue, 0);
                    this.v = max;
                    if (max > 5000) {
                        this.v = 0;
                    }
                } catch (Exception unused) {
                    this.t = null;
                }
                this.x = nanoTime;
            }
        }
        return this.v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 21) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int a() {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJVoice.a():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ea, code lost:
        if (r14 != false) goto L_0x00ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentPositionMs() {
        /*
        // Method dump skipped, instructions count: 373
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJVoice.getCurrentPositionMs():int");
    }

    public void setAudioTrackSmoothClock(int i2) {
        if (e.f151888a >= 21) {
            this.H = i2;
            if (i2 > 0) {
                this.F = new d();
                this.f151926b = new ConditionVariable(true);
            }
        }
    }

    public void setSessionId(int i2) {
        this.I = i2;
        if (this.f151928e != null && b() == 0) {
            start();
        }
    }

    public void setStreamType(int i2) {
        this.E = i2;
        if (this.f151928e != null && b() == 0) {
            start();
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.media.AudioTrack r7) {
        /*
            r6 = this;
            r5 = 212(0xd4, float:2.97E-43)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            if (r7 != 0) goto L_0x000b
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return
        L_0x000b:
            boolean r0 = com.ss.ttm.player.AJVoice.B     // Catch:{ Exception -> 0x0020 }
            if (r0 == 0) goto L_0x0020
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0020 }
            long r0 = r6.D     // Catch:{ Exception -> 0x0020 }
            long r3 = r3 - r0
            r1 = 80
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0020
            long r1 = r1 - r3
            java.lang.Thread.sleep(r1)     // Catch:{ Exception -> 0x0020 }
        L_0x0020:
            r7.release()     // Catch:{ Exception -> 0x0027 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return
        L_0x0027:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJVoice.a(android.media.AudioTrack):void");
    }

    public void setTrackVolume(float f2, float f3) {
        AudioTrack audioTrack = this.f151927d;
        if (audioTrack != null) {
            audioTrack.setStereoVolume(f2, f3);
        }
    }

    private static int a(int i2, int i3) {
        if (i2 == 2) {
            return i3 * 2;
        }
        if (i2 == 3) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    public int open(long j2, TTPlayer tTPlayer) {
        this.f151928e = tTPlayer;
        int a2 = a();
        if (a2 == 0) {
            float f2 = this.o;
            if (f2 != -1.0f) {
                setVolume(f2, f2);
            }
            int i2 = Build.VERSION.SDK_INT;
            try {
                this.t = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        return a2;
    }

    public void setVolume(float f2, float f3) {
        AudioTrack audioTrack;
        try {
            int i2 = this.p;
            if (((float) i2) < f2) {
                f2 = (float) i2;
            }
            if (f3 != -1048575.0f || (audioTrack = this.f151927d) == null) {
                AudioManager audioManager = this.f151935l;
                if (audioManager != null) {
                    audioManager.setStreamVolume(this.E, (int) f2, 0);
                }
            } else {
                audioTrack.setStereoVolume(f2, f3);
            }
            this.o = f2;
        } catch (Exception unused) {
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(221);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(221);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public int write(byte[] bArr, int i2, int i3, int i4) {
        int start;
        if (bArr == null || bArr.length == 0) {
            com.ss.ttm.a.b.b(f151924a, "buffer is nullpoint");
            return -10;
        } else if (this.q) {
            return 0;
        } else {
            if (this.s != i4) {
                this.s = i4;
                if (this.y > 0) {
                    this.f151927d.flush();
                }
            }
            try {
                int write = this.f151927d.write(bArr, i2, i3);
                if (write < 0) {
                    return write;
                }
                this.y += (long) write;
                if (!c() || b() != 0 || (start = start()) == 0) {
                    return write;
                }
                return start;
            } catch (Exception e2) {
                e2.printStackTrace();
                return -1;
            }
        }
    }

    public int write(byte[] bArr, int i2, int i3, int i4, long j2) {
        if (bArr == null || bArr.length == 0) {
            com.ss.ttm.a.b.b(f151924a, "buffer is nullpoint");
            return -10;
        } else if (this.q) {
            return 0;
        } else {
            if (this.s != i4) {
                this.s = i4;
                d dVar = this.F;
                if (dVar == null || this.f151926b == null) {
                    if (this.y > 0) {
                        this.f151927d.flush();
                    }
                } else if (this.y > 0) {
                    if (dVar.f152044b.getPlayState() == 3) {
                        this.f151927d.pause();
                    }
                    this.F.b();
                    this.G = -1;
                    this.f151926b.close();
                    this.y = 0;
                    final AudioTrack audioTrack = this.f151927d;
                    this.f151927d = null;
                    b.a(new Runnable() {
                        /* class com.ss.ttm.player.AJVoice.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(101293);
                        }

                        public final void run() {
                            try {
                                audioTrack.flush();
                                audioTrack.release();
                            } finally {
                                AJVoice.this.f151926b.open();
                            }
                        }
                    });
                    this.f151926b.block();
                    a();
                    start();
                    this.s = i4;
                }
            }
            int i5 = this.G;
            if (i5 == -1) {
                this.G = (int) Math.max(0L, j2);
            } else {
                long e2 = ((long) i5) + e();
                if (Math.abs(e2 - j2) > 200) {
                    this.G = (int) (((long) this.G) + (j2 - e2));
                }
            }
            try {
                int write = this.f151927d.write(bArr, i2, i3);
                if (write < 0) {
                    return write;
                }
                this.y += (long) write;
                if (c() && b() == 0) {
                    int start = start();
                    this.s = i4;
                    if (start == 0) {
                        return write;
                    }
                    return start;
                }
                return write;
            } catch (Exception e3) {
                e3.printStackTrace();
                return -1;
            }
        }
    }

    public void setSampleInfo(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f151930g = i3;
        this.f151931h = i4;
        this.f151929f = i5;
        this.f151932i = i7;
        this.f151933j = i2;
        this.f151934k = i6;
    }
}
