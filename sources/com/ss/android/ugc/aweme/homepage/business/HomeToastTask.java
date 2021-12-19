package com.ss.android.ugc.aweme.homepage.business;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class HomeToastTask implements w {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f99165a = false;

    static {
        Covode.recordClassIndex(63178);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
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

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f99166a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f99167b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f99168c;

        static {
            Covode.recordClassIndex(63179);
        }

        a(Context context, long j2, Context context2) {
            this.f99166a = context;
            this.f99167b = j2;
            this.f99168c = context2;
        }

        public final void run() {
            String string;
            Context context = this.f99166a;
            if (context != null && (string = context.getString(R.string.faj, Long.valueOf(this.f99167b))) != null) {
                l.b(string, "");
                Context context2 = this.f99168c;
                if (!(context2 instanceof e)) {
                    context2 = null;
                }
                e eVar = (e) context2;
                if (eVar != null) {
                    new b(eVar).a(string).b();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        com.ss.android.ugc.aweme.framework.a.a.a("ToastTask");
        long e2 = com.ss.android.ugc.aweme.co.b.b().e(context, "red_point_count");
        if (e2 > 0) {
            if (!in.d()) {
                Context j2 = f.j();
                if (j2 == null) {
                    j2 = context;
                }
                new Handler(Looper.getMainLooper()).post(new a(j2, e2, context));
            }
            n.a("log_red_badge", "click", new c().a("count", String.valueOf(e2)).a());
            r.onEvent(MobClick.obtain().setEventName("red_badge").setLabelName("click").setValue(String.valueOf(e2)));
            com.ss.android.ugc.aweme.co.b.b().a(context, "red_point_count", 0L);
        }
    }
}
