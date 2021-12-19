package com.ss.android.ugc.aweme.request_combine.request.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.g;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.s;
import h.f.b.l;
import java.util.List;

public final class c implements r {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f120632a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final a f120633b = new a((byte) 0);

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return s.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "request_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78560);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final aa b() {
        return aa.NORMAL;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f120634a = new b();

        static {
            Covode.recordClassIndex(78561);
        }

        b() {
        }

        public final void run() {
            int i2;
            if (c.f120632a) {
                i2 = 1;
            } else {
                i2 = 5;
            }
            com.ss.android.ugc.aweme.notice.api.b.a(false, i2);
            c.f120632a = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(78559);
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final void a(Context context, boolean z) {
        l.d(context, "");
        Handler handler = new Handler(Looper.getMainLooper());
        b bVar = b.f120634a;
        l.d("fetch_notice_count", "");
        long a2 = g.a("fetch_notice_count");
        if (a2 == 60000) {
            a2 = 0;
        }
        handler.postDelayed(bVar, a2);
    }
}
