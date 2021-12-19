package com.bytedance.common.wschannel.c.b;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.wschannel.c.a;
import com.bytedance.common.wschannel.c.c;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Response;

public final class b extends a<a> {

    /* renamed from: b  reason: collision with root package name */
    public c f27032b;

    /* renamed from: c  reason: collision with root package name */
    public AtomicBoolean f27033c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private Handler f27034d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f27035e = new Runnable() {
        /* class com.bytedance.common.wschannel.c.b.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(15961);
        }

        public final void run() {
            if (b.this.f27033c.getAndSet(false)) {
                b.this.d();
                if (b.this.f27032b != null) {
                    b.this.f27032b.a();
                }
            }
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private Runnable f27036f = new Runnable() {
        /* class com.bytedance.common.wschannel.c.b.b.AnonymousClass2 */

        static {
            Covode.recordClassIndex(15962);
        }

        public final void run() {
            if (b.this.f27032b != null) {
                b.this.e();
                b.this.f27032b.b();
            }
        }
    };

    static {
        Covode.recordClassIndex(15960);
    }

    @Override // com.bytedance.common.wschannel.c.d
    public final void c() {
        d();
    }

    @Override // com.bytedance.common.wschannel.c.d
    public final void a() {
        this.f27033c.set(false);
        this.f27034d.removeCallbacks(this.f27035e);
    }

    @Override // com.bytedance.common.wschannel.c.d
    public final void b() {
        this.f27033c.set(true);
        this.f27034d.removeCallbacks(this.f27035e);
        this.f27034d.postDelayed(this.f27035e, ((a) this.f27021a).f27031b);
    }

    public final void d() {
        this.f27034d.removeCallbacks(this.f27035e);
        this.f27034d.removeCallbacks(this.f27036f);
        this.f27033c.set(false);
    }

    public final void e() {
        long j2 = ((a) this.f27021a).f27030a;
        this.f27034d.removeCallbacks(this.f27036f);
        this.f27034d.postDelayed(this.f27036f, j2);
    }

    public b(a aVar) {
        super(aVar);
    }

    @Override // com.bytedance.common.wschannel.c.d
    public final void a(Response response) {
        if (((a) this.f27021a).f27030a == -1) {
            if (response == null) {
                ((a) this.f27021a).f27030a = 270000;
            } else {
                String header = response.header("Handshake-Options");
                if (header != null) {
                    String[] split = header.split(";");
                    int length = split.length;
                    long j2 = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        String str = split[i2];
                        if (!TextUtils.isEmpty(str)) {
                            String[] split2 = str.split("=");
                            if ("ping-interval".equals(split2[0])) {
                                try {
                                    j2 = Long.parseLong(split2[1]) * 1000;
                                    break;
                                } catch (NumberFormatException unused) {
                                    j2 = 270000;
                                }
                            } else {
                                continue;
                            }
                        }
                        i2++;
                    }
                    if (j2 != -1) {
                        ((a) this.f27021a).f27030a = j2;
                    }
                }
                ((a) this.f27021a).f27030a = 270000;
            }
        }
        e();
    }

    @Override // com.bytedance.common.wschannel.c.a
    public final void a(c cVar, Handler handler) {
        this.f27032b = cVar;
        this.f27034d = handler;
    }
}
