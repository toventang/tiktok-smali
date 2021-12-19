package com.ss.android.ugc.aweme.live.alphaplayer.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.live.alphaplayer.a.d;
import com.ss.android.ugc.aweme.live.alphaplayer.d.a;
import java.util.Timer;
import java.util.TimerTask;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    private static final d f108318c = new d() {
        /* class com.ss.android.ugc.aweme.live.alphaplayer.f.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(69394);
        }

        @Override // com.ss.android.ugc.aweme.live.alphaplayer.a.d
        public final void a(long j2) {
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.live.alphaplayer.d.c<a<a>> f108319a;

    /* renamed from: b  reason: collision with root package name */
    public d f108320b = f108318c;

    /* renamed from: d  reason: collision with root package name */
    private long f108321d = 500;

    /* renamed from: e  reason: collision with root package name */
    private Timer f108322e;

    static {
        Covode.recordClassIndex(69393);
    }

    private void d() {
        Timer timer = this.f108322e;
        if (timer != null) {
            timer.cancel();
            this.f108322e.purge();
            this.f108322e = null;
        }
    }

    public final void b() {
        if (this.f108319a != null && this.f108320b != f108318c) {
            d();
        }
    }

    public final void c() {
        d();
        this.f108319a = null;
        this.f108321d = 500;
        this.f108320b = f108318c;
    }

    public final void a() {
        if (this.f108319a != null && this.f108320b != f108318c) {
            d();
            this.f108322e = new Timer();
            this.f108322e.schedule(new TimerTask() {
                /* class com.ss.android.ugc.aweme.live.alphaplayer.f.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(69395);
                }

                public final void run() {
                    if (c.this.f108319a != null && c.this.f108320b != null) {
                        c.this.f108320b.a((long) c.this.f108319a.i());
                    }
                }
            }, this.f108321d - (((long) this.f108319a.i()) % this.f108321d), this.f108321d);
        }
    }

    public final void a(d dVar) {
        if (dVar != null) {
            this.f108320b = dVar;
        } else {
            this.f108320b = f108318c;
        }
        this.f108321d = 5;
    }
}
