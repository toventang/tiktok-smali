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

public final class e extends v implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public c f107317a = new c(this);

    /* renamed from: c  reason: collision with root package name */
    private boolean f107318c;

    static {
        Covode.recordClassIndex(68681);
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v, com.ss.android.ugc.e.a
    public final void b() {
        this.f107318c = false;
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v
    public final ae c() {
        return ae.APP_BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v, com.ss.android.ugc.e.a
    public final void a() {
        this.f107318c = true;
        this.f107317a.a(1206, 0);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f107319a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f107320b;

        static {
            Covode.recordClassIndex(68682);
        }

        a(e eVar, String str) {
            this.f107319a = eVar;
            this.f107320b = str;
        }

        public final void run() {
            f.f107539d.a(this.f107320b);
            this.f107319a.f107317a.a(1206, 0);
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f107321a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f107322b;

        static {
            Covode.recordClassIndex(68683);
        }

        b(e eVar, w wVar) {
            this.f107321a = eVar;
            this.f107322b = wVar;
        }

        public final void run() {
            f.f107537b.b(this.f107322b);
            this.f107321a.f107317a.a(1206, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v, com.ss.android.ugc.e.a
    public final void a(List<? extends n> list) {
        l.d(list, "");
        super.a(list);
        if (f.f107537b.a(ae.APP_BACKGROUND) && this.f107318c) {
            this.f107317a.a(1206, 0);
        }
    }

    public final boolean handleMessage(Message message) {
        l.d(message, "");
        if (!this.f107318c) {
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
