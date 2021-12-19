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
import h.f.b.l;
import java.util.List;

public final class i extends s implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public c f107334a = new c(this);

    /* renamed from: c  reason: collision with root package name */
    private boolean f107335c;

    static {
        Covode.recordClassIndex(68692);
    }

    @Override // com.ss.android.ugc.e.a, com.ss.android.ugc.aweme.lego.a.a.s
    public final void a() {
        this.f107335c = true;
    }

    @Override // com.ss.android.ugc.e.a, com.ss.android.ugc.aweme.lego.a.a.s
    public final void b() {
        this.f107335c = false;
    }

    static final class b implements MessageQueue.IdleHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f107338a;

        static {
            Covode.recordClassIndex(68694);
        }

        b(i iVar) {
            this.f107338a = iVar;
        }

        public final boolean queueIdle() {
            if (!com.ss.android.ugc.aweme.lego.a.b.b()) {
                return true;
            }
            this.f107338a.c();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f107336a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f107337b;

        static {
            Covode.recordClassIndex(68693);
        }

        a(i iVar, String str) {
            this.f107336a = iVar;
            this.f107337b = str;
        }

        public final void run() {
            f.f107539d.a(this.f107337b);
            this.f107336a.f107334a.a(1200, 0);
        }
    }

    public i() {
        Looper.myQueue().addIdleHandler(new b(this));
    }

    public final void c() {
        String b2 = f.f107539d.b(ae.IDLE);
        if (b2 != null) {
            p.a(false).execute(new a(this, b2));
        }
    }

    public final boolean handleMessage(Message message) {
        l.d(message, "");
        c();
        return true;
    }

    @Override // com.ss.android.ugc.e.a, com.ss.android.ugc.aweme.lego.a.a.s
    public final void a(List<? extends n> list) {
        l.d(list, "");
        super.a(list);
        if (f.f107539d.a(ae.IDLE)) {
            this.f107334a.a(1200, 0);
        }
    }
}
