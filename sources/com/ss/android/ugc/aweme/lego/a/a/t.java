package com.ss.android.ugc.aweme.lego.a.a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.a.c;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.p;
import h.f.b.l;
import java.util.List;

public final class t extends s implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private c f107363a = new c(this);

    /* renamed from: c  reason: collision with root package name */
    private boolean f107364c;

    static {
        Covode.recordClassIndex(68719);
    }

    @Override // com.ss.android.ugc.e.a, com.ss.android.ugc.aweme.lego.a.a.s
    public final void a() {
        this.f107364c = true;
    }

    @Override // com.ss.android.ugc.e.a, com.ss.android.ugc.aweme.lego.a.a.s
    public final void b() {
        this.f107364c = false;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f107365a;

        static {
            Covode.recordClassIndex(68720);
        }

        a(String str) {
            this.f107365a = str;
        }

        public final void run() {
            f.f107539d.a(this.f107365a);
        }
    }

    @Override // com.ss.android.ugc.e.a, com.ss.android.ugc.aweme.lego.a.a.s
    public final void a(List<? extends n> list) {
        l.d(list, "");
        super.a(list);
        if (f.f107539d.a(ae.SPARSE) && !this.f107363a.hasMessages(1202)) {
            this.f107363a.a(1202, 0);
        }
    }

    public final boolean handleMessage(Message message) {
        l.d(message, "");
        String b2 = f.f107539d.b(ae.SPARSE);
        if (b2 != null) {
            p.a(false).execute(new a(b2));
        }
        if (!f.f107539d.a(ae.SPARSE)) {
            return true;
        }
        this.f107363a.a(1202, 50);
        return true;
    }
}
