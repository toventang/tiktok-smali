package com.ss.ttm.player;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.ttm.a.e;
import java.lang.reflect.Method;

final class d {

    /* renamed from: a  reason: collision with root package name */
    final long[] f152043a;

    /* renamed from: b  reason: collision with root package name */
    AudioTrack f152044b;

    /* renamed from: c  reason: collision with root package name */
    c f152045c;

    /* renamed from: d  reason: collision with root package name */
    boolean f152046d;

    /* renamed from: e  reason: collision with root package name */
    long f152047e;

    /* renamed from: f  reason: collision with root package name */
    long f152048f;

    /* renamed from: g  reason: collision with root package name */
    long f152049g;

    /* renamed from: h  reason: collision with root package name */
    int f152050h;

    /* renamed from: i  reason: collision with root package name */
    int f152051i;

    /* renamed from: j  reason: collision with root package name */
    private final a f152052j = null;

    /* renamed from: k  reason: collision with root package name */
    private int f152053k;

    /* renamed from: l  reason: collision with root package name */
    private int f152054l;

    /* renamed from: m  reason: collision with root package name */
    private int f152055m;
    private long n;
    private Method o;
    private boolean p;
    private boolean q;
    private long r;
    private long s;
    private long t;
    private long u;
    private long v;
    private long w;
    private long x;
    private long y;

    public interface a {
        static {
            Covode.recordClassIndex(101333);
        }
    }

    static {
        Covode.recordClassIndex(101332);
    }

    private static boolean a(int i2) {
        return i2 == 3 || i2 == 2 || i2 == Integer.MIN_VALUE || i2 == 1073741824 || i2 == 4;
    }

    private void d() {
        this.f152047e = 0;
        this.f152051i = 0;
        this.f152050h = 0;
        this.f152048f = 0;
    }

    /* access modifiers changed from: package-private */
    public final long c() {
        return b(e());
    }

    public d() {
        if (e.f151888a >= 18) {
            try {
                this.o = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f152043a = new long[10];
    }

    public final boolean a() {
        d();
        if (this.v != -9223372036854775807L) {
            return false;
        }
        this.f152045c.a();
        return true;
    }

    public final void b() {
        d();
        this.f152044b = null;
        this.f152045c = null;
    }

    private long e() {
        AudioTrack audioTrack = this.f152044b;
        if (this.v != -9223372036854775807L) {
            return Math.min(this.y, this.x + ((((SystemClock.elapsedRealtime() * 1000) - this.v) * ((long) this.f152055m)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f152046d) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.u = this.s;
            }
            playbackHeadPosition += this.u;
        }
        if (e.f151888a <= 28) {
            if (playbackHeadPosition == 0 && this.s > 0 && playState == 3) {
                if (this.w == -9223372036854775807L) {
                    this.w = SystemClock.elapsedRealtime();
                }
                return this.s;
            }
            this.w = -9223372036854775807L;
        }
        if (this.s > playbackHeadPosition) {
            this.t++;
        }
        this.s = playbackHeadPosition;
        return playbackHeadPosition + (this.t << 32);
    }

    private static boolean b(int i2) {
        if (e.f151888a >= 23) {
            return false;
        }
        if (i2 == 5 || i2 == 6) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long b(long j2) {
        return (j2 * 1000000) / ((long) this.f152055m);
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        Method method;
        Object invoke;
        if (this.q && (method = this.o) != null && j2 - this.r >= 500000) {
            try {
                AudioTrack audioTrack = this.f152044b;
                Object[] objArr = new Object[0];
                Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{audioTrack, objArr}, 110000, "java.lang.Object", true, "com_ss_ttm_player_AudioTrackPositionTracker_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a2.first).booleanValue()) {
                    invoke = a2.second;
                } else {
                    invoke = method.invoke(audioTrack, objArr);
                    com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{audioTrack, objArr}, "com_ss_ttm_player_AudioTrackPositionTracker_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
                long intValue = (((long) ((Integer) invoke).intValue()) * 1000) - this.n;
                this.f152049g = intValue;
                long max = Math.max(intValue, 0L);
                this.f152049g = max;
                if (max > 5000000) {
                    this.f152049g = 0;
                }
            } catch (Exception unused) {
                this.o = null;
            }
            this.r = j2;
        }
    }

    public final void a(AudioTrack audioTrack, int i2, int i3, int i4) {
        long j2;
        this.f152044b = audioTrack;
        this.f152053k = i3;
        this.f152054l = i4;
        this.f152045c = new c(audioTrack);
        this.f152055m = audioTrack.getSampleRate();
        this.f152046d = b(i2);
        boolean a2 = a(i2);
        this.q = a2;
        if (a2) {
            j2 = b((long) (i4 / i3));
        } else {
            j2 = -9223372036854775807L;
        }
        this.n = j2;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.p = false;
        this.v = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.f152049g = 0;
    }
}
