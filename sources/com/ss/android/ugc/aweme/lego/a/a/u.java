package com.ss.android.ugc.aweme.lego.a.a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.a.c;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.lego.w;
import h.f.b.l;
import java.util.List;

public final class u extends v implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private c f107366a = new c(this);

    /* renamed from: c  reason: collision with root package name */
    private boolean f107367c;

    static {
        Covode.recordClassIndex(68721);
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v, com.ss.android.ugc.e.a
    public final void a() {
        this.f107367c = true;
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v, com.ss.android.ugc.e.a
    public final void b() {
        this.f107367c = false;
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v
    public final ae c() {
        return ae.SPARSE;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f107368a;

        static {
            Covode.recordClassIndex(68722);
        }

        a(w wVar) {
            this.f107368a = wVar;
        }

        public final void run() {
            f.f107537b.b(this.f107368a);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v, com.ss.android.ugc.e.a
    public final void a(List<? extends n> list) {
        l.d(list, "");
        super.a(list);
        if (f.f107537b.a(ae.SPARSE) && !this.f107366a.hasMessages(1202)) {
            this.f107366a.a(1202, 0);
        }
    }

    public final boolean handleMessage(Message message) {
        l.d(message, "");
        w b2 = f.f107537b.b(ae.SPARSE);
        if (b2 != null) {
            p.a(false).execute(new a(b2));
        }
        if (!f.f107537b.a(ae.SPARSE)) {
            return true;
        }
        this.f107366a.a(1202, 50);
        return true;
    }
}
