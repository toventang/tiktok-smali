package com.ss.android.ugc.aweme.report;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.cs;
import java.util.Random;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static String f120581a = "null";

    /* renamed from: b  reason: collision with root package name */
    public static String f120582b = "null";

    /* renamed from: c  reason: collision with root package name */
    public static String f120583c = "null";

    /* renamed from: e  reason: collision with root package name */
    public static boolean f120584e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f120585f = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f120586d;

    /* renamed from: g  reason: collision with root package name */
    private final long[] f120587g = new long[c.values().length];

    /* renamed from: h  reason: collision with root package name */
    private final long[] f120588h = new long[c.values().length];

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f120589a = new d();

        static {
            Covode.recordClassIndex(78514);
        }
    }

    static {
        Covode.recordClassIndex(78513);
    }

    private static boolean c() {
        if (!cs.f89719a || new Random().nextFloat() >= 0.005f) {
            return false;
        }
        return true;
    }

    public final void a() {
        this.f120588h[c.PAGE_SELECT_TOTAL.ordinal()] = 0;
        this.f120588h[c.PAGE_SELECT_BEFORE.ordinal()] = 0;
        this.f120588h[c.PAGE_SELECT_INVOKE_SELECT.ordinal()] = 0;
        this.f120588h[c.PAGE_SELECT_PLAYER.ordinal()] = 0;
        this.f120588h[c.PAGE_SELECT_AFTER.ordinal()] = 0;
        this.f120588h[c.PLAYER_PAUSE.ordinal()] = 0;
        this.f120588h[c.PLAYER_PREPARE.ordinal()] = 0;
        this.f120588h[c.PLAYER_STOP.ordinal()] = 0;
        this.f120588h[c.PLAYER_RENDER_READY.ordinal()] = 0;
        this.f120588h[c.PLAYER_RENDER_FIRST.ordinal()] = 0;
        this.f120588h[c.PLAYER_RENDER_FIRST_DELAY.ordinal()] = 0;
    }

    public final void b() {
        int i2 = 0;
        if (f120585f) {
            f120585f = false;
            this.f120586d = c();
        } else if (this.f120586d && f120584e) {
            long[] jArr = new long[c.values().length];
            String str = f120581a;
            String str2 = f120582b;
            String str3 = f120583c;
            while (true) {
                long[] jArr2 = this.f120588h;
                if (i2 < jArr2.length) {
                    jArr[i2] = jArr2[i2];
                    i2++;
                } else {
                    r.a().execute(new e(jArr, str, str3, str2));
                    return;
                }
            }
        }
    }

    public final void b(c cVar) {
        if (this.f120586d) {
            b(cVar, SystemClock.uptimeMillis());
        }
    }

    public final void a(c cVar) {
        if (this.f120586d) {
            a(cVar, SystemClock.uptimeMillis());
        }
    }

    private void a(c cVar, long j2) {
        if (this.f120586d) {
            this.f120587g[cVar.ordinal()] = j2;
        }
    }

    private void b(c cVar, long j2) {
        if (this.f120586d) {
            Long valueOf = Long.valueOf(this.f120587g[cVar.ordinal()]);
            if (valueOf == null) {
                this.f120587g[cVar.ordinal()] = 0;
                this.f120588h[cVar.ordinal()] = 0;
                return;
            }
            long longValue = j2 - valueOf.longValue();
            this.f120587g[cVar.ordinal()] = longValue;
            this.f120588h[cVar.ordinal()] = longValue;
        }
    }
}
