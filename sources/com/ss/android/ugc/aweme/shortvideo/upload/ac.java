package com.ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.utils.hn;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.m;
import h.h;
import h.i;
import java.util.concurrent.TimeUnit;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    private final h f131974a = i.a((h.f.a.a) a.f131975a);

    static {
        Covode.recordClassIndex(86477);
    }

    private final o d() {
        return (o) this.f131974a.getValue();
    }

    static final class a extends m implements h.f.a.a<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f131975a = new a();

        static {
            Covode.recordClassIndex(86478);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return o.a(hn.f143067b);
        }
    }

    public final long c() {
        return d().a(TimeUnit.MILLISECONDS);
    }

    public final void b() {
        if (!d().f53699a) {
            a("repeat stop");
        } else {
            d().c();
        }
    }

    public final void a() {
        if (d().f53699a) {
            a("repeat start");
        } else {
            d().b();
        }
    }

    private static void a(String str) {
        String concat = "UploadWaitTimeCounter upload sdk call error: ".concat(String.valueOf(str));
        g.a();
        q.b(concat);
    }
}
