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

public final class d extends s implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public c f107311a = new c(this);

    /* renamed from: c  reason: collision with root package name */
    private boolean f107312c;

    static {
        Covode.recordClassIndex(68678);
    }

    @Override // com.ss.android.ugc.e.a, com.ss.android.ugc.aweme.lego.a.a.s
    public final void b() {
        this.f107312c = false;
    }

    @Override // com.ss.android.ugc.e.a, com.ss.android.ugc.aweme.lego.a.a.s
    public final void a() {
        this.f107312c = true;
        this.f107311a.a(1206, 0);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f107313a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f107314b;

        static {
            Covode.recordClassIndex(68679);
        }

        a(d dVar, String str) {
            this.f107313a = dVar;
            this.f107314b = str;
        }

        public final void run() {
            f.f107539d.a(this.f107314b);
            this.f107313a.f107311a.a(1206, 0);
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f107315a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f107316b;

        static {
            Covode.recordClassIndex(68680);
        }

        b(d dVar, w wVar) {
            this.f107315a = dVar;
            this.f107316b = wVar;
        }

        public final void run() {
            f.f107537b.b(this.f107316b);
            this.f107315a.f107311a.a(1206, 0);
        }
    }

    @Override // com.ss.android.ugc.e.a, com.ss.android.ugc.aweme.lego.a.a.s
    public final void a(List<? extends n> list) {
        l.d(list, "");
        super.a(list);
        if (f.f107539d.a(ae.APP_BACKGROUND) && this.f107312c) {
            this.f107311a.a(1206, 0);
        }
    }

    public final boolean handleMessage(Message message) {
        l.d(message, "");
        if (!this.f107312c) {
            return true;
        }
        String b2 = f.f107539d.b(ae.APP_BACKGROUND);
        if (b2 != null) {
            p.a(false).execute(new a(this, b2));
        }
        w b3 = f.f107537b.b(ae.APP_BACKGROUND);
        if (b3 == null) {
            return true;
        }
        p.a(false).execute(new b(this, b3));
        return true;
    }
}
