package com.ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.experiment.dm;
import com.ss.android.ugc.aweme.fe.a.f;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.utils.dc;
import f.a.z;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class GeckoCheckInRequest implements w {
    static {
        Covode.recordClassIndex(78615);
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
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f120684a = new b();

        static {
            Covode.recordClassIndex(78617);
        }

        b() {
        }

        public final void run() {
            if (!TextUtils.isEmpty(AppLog.getServerDeviceId())) {
                dc.c();
                HashMap hashMap = new HashMap();
                hashMap.put("gecko_version", "3.0.0-rc.2-mt");
                Npth.addTags(hashMap);
            }
        }
    }

    public static final class a implements z<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GeckoCheckInRequest f120682a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f120683b;

        static {
            Covode.recordClassIndex(78616);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(Boolean bool) {
            if (bool.booleanValue()) {
                GeckoCheckInRequest.b(this.f120683b);
            }
        }

        a(GeckoCheckInRequest geckoCheckInRequest, Context context) {
            this.f120682a = geckoCheckInRequest;
            this.f120683b = context;
        }
    }

    public static void b(Context context) {
        l.d(context, "");
        try {
            new Handler(Looper.getMainLooper()).postDelayed(b.f120684a, SettingsManager.a().a("gecko_normal_request_time", 60000L));
            dc.f();
        } catch (Exception e2) {
            f.a(e2);
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        l.d(context, "");
        if (!dc.f142812a) {
            if (dm.a()) {
                com.bytedance.ies.ugc.appcontext.f.g().b(new a(this, context));
            } else {
                b(context);
            }
        }
    }
}
