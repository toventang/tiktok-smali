package com.ss.android.ugc.aweme.lego.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.p;
import h.f.b.l;
import java.util.List;

public final class a extends s {
    static {
        Covode.recordClassIndex(68672);
    }

    @Override // com.ss.android.ugc.e.a, com.ss.android.ugc.aweme.lego.a.a.s
    public final void a() {
    }

    @Override // com.ss.android.ugc.e.a, com.ss.android.ugc.aweme.lego.a.a.s
    public final void b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.a$a  reason: collision with other inner class name */
    static final class RunnableC2757a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f107303a;

        static {
            Covode.recordClassIndex(68673);
        }

        RunnableC2757a(String str) {
            this.f107303a = str;
        }

        public final void run() {
            f.f107539d.a(this.f107303a);
        }
    }

    @Override // com.ss.android.ugc.e.a, com.ss.android.ugc.aweme.lego.a.a.s
    public final void a(List<? extends n> list) {
        l.d(list, "");
        super.a(list);
        for (String str : f.f107539d.c(ae.BACKGROUND)) {
            p.a(false).execute(new RunnableC2757a(str));
        }
    }
}
