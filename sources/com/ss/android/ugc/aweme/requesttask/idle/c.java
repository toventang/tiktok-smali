package com.ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.g;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.s;
import h.f.b.l;
import java.util.List;

public final class c implements r {
    static {
        Covode.recordClassIndex(78630);
    }

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

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f120697a = new a();

        static {
            Covode.recordClassIndex(78631);
        }

        a() {
        }

        public final void run() {
            AnchorListManager.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final aa b() {
        return aa.SPARSE;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final void a(Context context, boolean z) {
        l.d(context, "");
        long a2 = g.a("anchor_list");
        Handler handler = new Handler(Looper.getMainLooper());
        a aVar = a.f120697a;
        if (!AnchorListManager.f67936a.getBoolean("anchor_local_map_success", false) || !AnchorListManager.e()) {
            a2 = 0;
        }
        handler.postDelayed(aVar, a2);
    }
}
