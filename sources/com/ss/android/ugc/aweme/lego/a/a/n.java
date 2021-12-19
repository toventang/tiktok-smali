package com.ss.android.ugc.aweme.lego.a.a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.a.c;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.lego.r;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class n extends r implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public c f107346a = new c(this);

    /* renamed from: b  reason: collision with root package name */
    public boolean f107347b;

    static {
        Covode.recordClassIndex(68703);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f107350a;

        static {
            Covode.recordClassIndex(68705);
        }

        b(r rVar) {
            this.f107350a = rVar;
        }

        public final void run() {
            f.f107538c.a(this.f107350a, com.ss.android.ugc.aweme.lego.a.b.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.r, com.ss.android.ugc.e.a
    public final void a() {
        this.f107346a.a(1200, 60000);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f107348a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f107349b;

        static {
            Covode.recordClassIndex(68704);
        }

        a(n nVar, List list) {
            this.f107348a = nVar;
            this.f107349b = list;
        }

        public final void run() {
            for (com.ss.android.ugc.aweme.lego.n nVar : this.f107349b) {
                Objects.requireNonNull(nVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoRequest");
                r rVar = (r) nVar;
                aa b2 = rVar.b();
                com.ss.android.ugc.aweme.lego.e.b bVar = f.f107538c;
                l.b(b2, "");
                bVar.a(b2, rVar);
            }
            if (this.f107348a.f107347b && !this.f107348a.f107346a.hasMessages(1204) && f.f107538c.a(aa.IDLE)) {
                this.f107348a.f107346a.a(1204, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            }
        }
    }

    @Override // com.ss.android.ugc.e.a
    public final void a(List<? extends com.ss.android.ugc.aweme.lego.n> list) {
        l.d(list, "");
        if (!list.isEmpty()) {
            p.a(aa.P0).execute(new a(this, list));
        }
    }

    public final boolean handleMessage(Message message) {
        r b2;
        l.d(message, "");
        this.f107347b = true;
        if (f.f107538c.a(aa.SPARSE)) {
            this.f107346a.a(1204, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        } else {
            if (f.f107538c.a(aa.IDLE) && (b2 = f.f107538c.b(aa.IDLE)) != null) {
                p.a(aa.IDLE).execute(new b(b2));
            }
            if (f.f107538c.a(aa.IDLE)) {
                this.f107346a.a(1204, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            }
        }
        return true;
    }
}
