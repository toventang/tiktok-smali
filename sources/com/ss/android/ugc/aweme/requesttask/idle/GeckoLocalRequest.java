package com.ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.dm;
import com.ss.android.ugc.aweme.fe.a.f;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.utils.dc;
import f.a.b.b;
import f.a.z;
import h.f.b.l;
import java.util.List;

public final class GeckoLocalRequest implements w {
    static {
        Covode.recordClassIndex(78624);
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
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public static final class a implements z<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GeckoLocalRequest f120691a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f120692b;

        static {
            Covode.recordClassIndex(78625);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            l.d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(Boolean bool) {
            if (bool.booleanValue()) {
                GeckoLocalRequest.b(this.f120692b);
            }
        }

        a(GeckoLocalRequest geckoLocalRequest, Context context) {
            this.f120691a = geckoLocalRequest;
            this.f120692b = context;
        }
    }

    public static void b(Context context) {
        l.d(context, "");
        try {
            dc.e();
        } catch (Exception e2) {
            f.a(e2);
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        l.d(context, "");
        if (dm.a()) {
            com.bytedance.ies.ugc.appcontext.f.g().b(new a(this, context));
        } else {
            b(context);
        }
    }
}
