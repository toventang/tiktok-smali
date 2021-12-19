package com.ss.android.ugc.aweme.app.launch;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.application.g;
import com.ss.android.ugc.aweme.experiment.cx;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.legoImp.task.InitTTNetTask;
import com.ss.android.ugc.aweme.net.h.b.c;
import java.util.Objects;

public final class AppInitProvider extends g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66817a = new a((byte) 0);

    static {
        Covode.recordClassIndex(41134);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41135);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            if (cx.c()) {
                f.e().a(new InitTTNetTask()).a();
            }
            Context context2 = getContext();
            com.ss.android.ugc.aweme.cw.g.a().execute(new c(b.f59141e + "/aweme/v2/feed/", context2));
            return true;
        }
        throw new NullPointerException("context == null");
    }
}
