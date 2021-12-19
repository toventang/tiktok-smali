package com.bytedance.android.ecommerce.e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.ecommerce.a.a.d;
import com.bytedance.android.ecommerce.c.f;
import com.bytedance.covode.number.Covode;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final a f7078a;

    /* renamed from: b  reason: collision with root package name */
    public final d f7079b;

    /* renamed from: c  reason: collision with root package name */
    public final f f7080c;

    /* renamed from: d  reason: collision with root package name */
    public int f7081d;

    /* renamed from: e  reason: collision with root package name */
    long f7082e;

    /* renamed from: f  reason: collision with root package name */
    final f f7083f = new f() {
        /* class com.bytedance.android.ecommerce.e.g.AnonymousClass1 */

        static {
            Covode.recordClassIndex(3386);
        }

        @Override // com.bytedance.android.ecommerce.c.f
        public final void a(com.bytedance.android.ecommerce.a.b.d dVar) {
            if (dVar.f6931h != com.bytedance.android.ecommerce.g.a.INIT) {
                g gVar = g.this;
                gVar.a(gVar.f7079b, dVar);
                g.this.f7080c.a(dVar);
            } else if (g.this.f7081d <= 10) {
                g.this.f7078a.sendEmptyMessageDelayed(1, 500);
            } else {
                g gVar2 = g.this;
                gVar2.a(gVar2.f7079b, dVar);
                g.this.f7080c.a(new com.bytedance.android.ecommerce.a.b.d("time_out", "query failed because query order state retry count is to maxRetryCount."));
            }
        }
    };

    /* renamed from: g  reason: collision with root package name */
    private final int f7084g = 10;

    static {
        Covode.recordClassIndex(3385);
    }

    static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private g f7086a;

        static {
            Covode.recordClassIndex(3387);
        }

        public a(g gVar) {
            super(Looper.getMainLooper());
            this.f7086a = gVar;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                g gVar = this.f7086a;
                gVar.f7081d++;
                c.f7063a.c().a(gVar.f7079b, gVar.f7083f);
            }
        }
    }

    public g(d dVar, f fVar) {
        this.f7079b = dVar;
        this.f7080c = fVar;
        this.f7078a = new a(this);
    }

    public final void a(d dVar, com.bytedance.android.ecommerce.a.b.d dVar2) {
        c.f7063a.f().a(dVar.f6899k, dVar.f6896h, dVar2.f6931h, dVar2.f6929f, dVar2.f6930g, this.f7081d, System.currentTimeMillis() - this.f7082e, dVar2.toString());
    }
}
