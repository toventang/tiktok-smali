package com.ss.android.ugc.aweme.commercialize.utils;

import android.os.Handler;
import android.os.Looper;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.ad.feed.b.b;
import com.ss.android.ugc.aweme.ad.feed.b.e;
import com.ss.android.ugc.aweme.commercialize.feed.az;
import com.ss.android.ugc.aweme.commercialize.feed.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.video.v;

public class bk {

    /* renamed from: g  reason: collision with root package name */
    private static volatile bk f75672g;

    /* renamed from: a  reason: collision with root package name */
    public Handler f75673a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public Aweme f75674b;

    /* renamed from: c  reason: collision with root package name */
    public int f75675c;

    /* renamed from: d  reason: collision with root package name */
    public int f75676d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f75677e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f75678f;

    /* renamed from: h  reason: collision with root package name */
    private int f75679h;

    static {
        Covode.recordClassIndex(46673);
    }

    private bk() {
    }

    public static bk a() {
        MethodCollector.i(10494);
        if (f75672g == null) {
            synchronized (bk.class) {
                try {
                    if (f75672g == null) {
                        f75672g = new bk();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10494);
                    throw th;
                }
            }
        }
        bk bkVar = f75672g;
        MethodCollector.o(10494);
        return bkVar;
    }

    public final void a(int i2) {
        this.f75675c = i2;
        a.a("played:%d, target:%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(this.f75679h)});
        if (this.f75675c == this.f75679h) {
            AnonymousClass1 r1 = new Runnable() {
                /* class com.ss.android.ugc.aweme.commercialize.utils.bk.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final Aweme f75680a;

                /* renamed from: b  reason: collision with root package name */
                long f75681b;

                static {
                    Covode.recordClassIndex(46674);
                }

                public final void run() {
                    long n;
                    if (this.f75680a == bk.this.f75674b) {
                        e a2 = b.a();
                        az a3 = c.a.a();
                        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aW(bk.this.f75674b) && a2 != null) {
                            n = a2.f();
                        } else if (!com.ss.android.ugc.aweme.commercialize.e.a.b.aw(bk.this.f75674b) || a3 == null) {
                            n = v.O().n();
                        } else {
                            n = a3.d();
                        }
                        if (n < 0) {
                            n = 0;
                        }
                        a.a("pos: %d, targetDelay: %d", new Object[]{Long.valueOf(n), Integer.valueOf(bk.this.f75676d)});
                        if (n >= ((long) bk.this.f75676d) || (n < this.f75681b && bk.this.f75675c > 0)) {
                            Runnable runnable = bk.this.f75677e;
                            if (runnable != null) {
                                try {
                                    runnable.run();
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                            bk.this.f75677e = null;
                            return;
                        }
                        this.f75681b = n;
                        bk.this.f75673a.postDelayed(this, 1000);
                    }
                }

                {
                    this.f75680a = bk.this.f75674b;
                }
            };
            this.f75678f = r1;
            this.f75673a.post(r1);
        }
    }

    public final void a(int i2, Runnable runnable) {
        long j2;
        Aweme aweme = this.f75674b;
        if (aweme != null) {
            e a2 = b.a();
            az a3 = c.a.a();
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.aW(this.f75674b) && a2 != null) {
                j2 = a2.g();
            } else if (!com.ss.android.ugc.aweme.commercialize.e.a.b.aw(aweme) || a3 == null) {
                j2 = v.O().j();
                if (j2 <= 0) {
                    if (aweme.getVideo() == null || aweme.getVideo().getDuration() <= 0) {
                        j2 = 1;
                    } else {
                        j2 = (long) aweme.getVideo().getDuration();
                    }
                }
            } else {
                j2 = a3.c();
            }
            long j3 = (long) i2;
            this.f75679h = (int) (j3 / j2);
            this.f75676d = (int) (j3 % j2);
            this.f75677e = runnable;
            a.a("milliseconds:%d, duration:%d", new Object[]{Integer.valueOf(i2), Long.valueOf(j2)});
            a(0);
        }
    }
}
