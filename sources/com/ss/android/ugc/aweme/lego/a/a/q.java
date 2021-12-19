package com.ss.android.ugc.aweme.lego.a.a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.a.c;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.lego.r;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class q extends r implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public c f107355a = new c(this);

    /* renamed from: b  reason: collision with root package name */
    public boolean f107356b;

    static {
        Covode.recordClassIndex(68712);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f107359a;

        static {
            Covode.recordClassIndex(68714);
        }

        b(r rVar) {
            this.f107359a = rVar;
        }

        public final void run() {
            f.f107538c.a(this.f107359a, com.ss.android.ugc.aweme.lego.a.b.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.r, com.ss.android.ugc.e.a
    public final void a() {
        this.f107355a.a(1203, 1000);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f107357a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f107358b;

        static {
            Covode.recordClassIndex(68713);
        }

        a(q qVar, List list) {
            this.f107357a = qVar;
            this.f107358b = list;
        }

        public final void run() {
            for (n nVar : this.f107358b) {
                Objects.requireNonNull(nVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoRequest");
                r rVar = (r) nVar;
                aa b2 = rVar.b();
                com.ss.android.ugc.aweme.lego.e.b bVar = f.f107538c;
                l.b(b2, "");
                bVar.a(b2, rVar);
            }
            if (this.f107357a.f107356b && !this.f107357a.f107355a.hasMessages(1203) && f.f107538c.a(aa.SPARSE)) {
                this.f107357a.f107355a.a(1203, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            }
        }
    }

    @Override // com.ss.android.ugc.e.a
    public final void a(List<? extends n> list) {
        l.d(list, "");
        if (!list.isEmpty()) {
            p.a(aa.P0).execute(new a(this, list));
        }
    }

    public final boolean handleMessage(Message message) {
        r b2;
        l.d(message, "");
        if (f.f107538c.a(aa.SPARSE) && (b2 = f.f107538c.b(aa.SPARSE)) != null) {
            p.a(aa.SPARSE).execute(new b(b2));
        }
        if (!f.f107538c.a(aa.SPARSE)) {
            return true;
        }
        this.f107355a.a(1203, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        return true;
    }
}
