package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.compliance.api.c.i;
import com.ss.android.ugc.aweme.compliance.api.model.u;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.utils.r;
import h.f.b.l;
import java.util.List;

public final class FetchUltimateComplianceSettingsTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static Context f107769a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f107770b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static final DeviceRegisterManager.a f107771c = new b();

    public static final class a {
        static {
            Covode.recordClassIndex(68974);
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.FetchUltimateComplianceSettingsTask$a$a  reason: collision with other inner class name */
        public static final class C2772a implements i {
            static {
                Covode.recordClassIndex(68975);
            }

            C2772a() {
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.c.i
            public final void a() {
                a.a(true, true);
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.c.i
            public final void a(u uVar) {
                l.d(uVar, "");
                a.a(uVar.f76700a, uVar.f76701b);
            }
        }

        private a() {
        }

        public static void a() {
            com.ss.android.ugc.aweme.compliance.api.a.j().a(new C2772a());
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(boolean z, boolean z2) {
            r.f143180b = true;
            r.f143181c = z;
            r.f143182d = z2;
            r.a();
        }
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

    public static final class b implements DeviceRegisterManager.a {
        static {
            Covode.recordClassIndex(68976);
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(String str, String str2) {
        }

        b() {
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(boolean z) {
            if (!TextUtils.isEmpty(DeviceRegisterManager.getDeviceId())) {
                a.a();
            }
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(boolean z, boolean z2) {
            a.a();
        }
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

    static {
        Covode.recordClassIndex(68973);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        f107769a = context;
        if (TextUtils.isEmpty(DeviceRegisterManager.getDeviceId())) {
            DeviceRegisterManager.addOnDeviceConfigUpdateListener(f107771c);
        } else {
            a.a();
        }
    }
}
