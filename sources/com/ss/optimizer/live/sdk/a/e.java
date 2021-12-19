package com.ss.optimizer.live.sdk.a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Set<a> f151674a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f151675b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public final a f151676c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.optimizer.live.sdk.a.a.a f151677d = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f151678e = false;

    /* renamed from: f  reason: collision with root package name */
    public int f151679f = 0;

    /* renamed from: g  reason: collision with root package name */
    public long f151680g = 10000;

    /* renamed from: h  reason: collision with root package name */
    public int f151681h = 5;

    /* renamed from: i  reason: collision with root package name */
    private final f f151682i;

    public interface a {
        static {
            Covode.recordClassIndex(101187);
        }

        void a(com.ss.optimizer.live.sdk.a.a.a aVar);
    }

    static {
        Covode.recordClassIndex(101183);
    }

    public final void a() {
        if (!this.f151678e) {
            this.f151678e = true;
            this.f151682i.a(new Runnable() {
                /* class com.ss.optimizer.live.sdk.a.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(101184);
                }

                public final void run() {
                    final com.ss.optimizer.live.sdk.a.a.a aVar;
                    try {
                        a aVar2 = e.this.f151676c;
                        aVar = new com.ss.optimizer.live.sdk.a.a.a(new JSONObject(aVar2.f151641b.a(a.a(aVar2.f151640a + "/video/live/qos/v2/ipSettings", aVar2.f151642c))));
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        aVar = null;
                    }
                    e.this.f151675b.post(new Runnable() {
                        /* class com.ss.optimizer.live.sdk.a.e.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(101185);
                        }

                        public final void run() {
                            e.this.f151678e = false;
                            if (aVar == null) {
                                e eVar = e.this;
                                int i2 = eVar.f151679f + 1;
                                eVar.f151679f = i2;
                                if (i2 <= e.this.f151681h) {
                                    e eVar2 = e.this;
                                    long j2 = e.this.f151680g;
                                    eVar2.f151675b.removeCallbacksAndMessages(null);
                                    eVar2.f151675b.postDelayed(new Runnable() {
                                        /* class com.ss.optimizer.live.sdk.a.e.AnonymousClass2 */

                                        static {
                                            Covode.recordClassIndex(101186);
                                        }

                                        public final void run() {
                                            e.this.a();
                                        }
                                    }, j2);
                                    return;
                                }
                                return;
                            }
                            e.this.f151679f = 0;
                            e.this.f151677d = aVar;
                            for (a aVar : e.this.f151674a) {
                                aVar.a(e.this.f151677d);
                            }
                        }
                    });
                }
            });
        }
    }

    e(f fVar, a aVar, long j2, int i2) {
        this.f151682i = fVar;
        this.f151676c = aVar;
        this.f151680g = j2;
        this.f151681h = i2;
    }
}
