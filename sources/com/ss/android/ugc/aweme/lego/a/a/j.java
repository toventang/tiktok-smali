package com.ss.android.ugc.aweme.lego.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.a.c;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.lego.w;
import h.f.b.l;
import java.util.List;

public final class j extends v implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public c f107339a = new c(this);

    /* renamed from: c  reason: collision with root package name */
    private boolean f107340c;

    static {
        Covode.recordClassIndex(68695);
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v, com.ss.android.ugc.e.a
    public final void a() {
        this.f107340c = true;
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v, com.ss.android.ugc.e.a
    public final void b() {
        this.f107340c = false;
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v
    public final ae c() {
        return ae.IDLE;
    }

    static final class b implements MessageQueue.IdleHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f107343a;

        static {
            Covode.recordClassIndex(68697);
        }

        b(j jVar) {
            this.f107343a = jVar;
        }

        public final boolean queueIdle() {
            if (!com.ss.android.ugc.aweme.lego.a.b.b()) {
                return true;
            }
            this.f107343a.d();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f107341a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f107342b;

        static {
            Covode.recordClassIndex(68696);
        }

        a(j jVar, w wVar) {
            this.f107341a = jVar;
            this.f107342b = wVar;
        }

        public final void run() {
            f.f107537b.b(this.f107342b);
            this.f107341a.f107339a.a(1200, 0);
        }
    }

    public j() {
        Looper.myQueue().addIdleHandler(new b(this));
    }

    public final void d() {
        w b2 = f.f107537b.b(ae.IDLE);
        if (b2 != null) {
            p.a(false).execute(new a(this, b2));
        }
    }

    public final boolean handleMessage(Message message) {
        l.d(message, "");
        d();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v, com.ss.android.ugc.e.a
    public final void a(List<? extends n> list) {
        l.d(list, "");
        super.a(list);
        if (f.f107537b.a(ae.IDLE)) {
            this.f107339a.a(1200, 0);
        }
    }
}
