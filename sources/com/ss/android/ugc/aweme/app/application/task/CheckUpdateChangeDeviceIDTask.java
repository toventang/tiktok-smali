package com.ss.android.ugc.aweme.app.application.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.utils.in;
import java.util.List;

public final class CheckUpdateChangeDeviceIDTask implements w {
    static {
        Covode.recordClassIndex(40985);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f66652a;

        static {
            Covode.recordClassIndex(40986);
        }

        a(Context context) {
            this.f66652a = context;
        }

        public final void run() {
            com.ss.android.ugc.aweme.compliance.api.a.q().b();
            com.ss.android.ugc.aweme.compliance.api.a.q().c(this.f66652a);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (!com.ss.android.ugc.aweme.compliance.api.a.q().a()) {
            if (in.d()) {
                com.ss.android.ugc.aweme.compliance.api.a.q().a(true, new a(context));
                return;
            }
            com.ss.android.ugc.aweme.compliance.api.a.q().b();
        }
        com.ss.android.ugc.aweme.compliance.api.a.q().c(context);
    }
}
