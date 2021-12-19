package com.ss.android.ugc.aweme.account.login.trusted;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.account.login.q;
import com.ss.android.ugc.aweme.bn;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.s;
import com.ss.android.ugc.aweme.user.e;
import com.ss.android.ugc.aweme.user.f;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class b implements r {

    /* renamed from: a  reason: collision with root package name */
    public static final a f63692a = new a((byte) 0);

    static {
        Covode.recordClassIndex(39273);
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

    static final class a {
        static {
            Covode.recordClassIndex(39274);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.trusted.b$b  reason: collision with other inner class name */
    public static final class C1427b implements DeviceRegisterManager.a {
        static {
            Covode.recordClassIndex(39275);
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(boolean z) {
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(boolean z, boolean z2) {
        }

        C1427b() {
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.trusted.b$b$a */
        static final class a extends m implements h.f.a.b<j, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f63693a = new a();

            static {
                Covode.recordClassIndex(39276);
            }

            a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* bridge */ /* synthetic */ z invoke(j jVar) {
                return z.f158842a;
            }
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(String str, String str2) {
            TrustedEnvApi.a(a.f63693a);
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

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static final class c extends m implements h.f.a.b<j, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f63694a = new c();

        static {
            Covode.recordClassIndex(39277);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ z invoke(j jVar) {
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<Integer, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f63695a = new d();

        static {
            Covode.recordClassIndex(39278);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int i2;
            int intValue = num.intValue();
            if (intValue != -1 && intValue == 0) {
                boolean saveLoginStatus = cj.f71084b.k().getSaveLoginStatus();
                bn k2 = cj.f71084b.k();
                if (saveLoginStatus) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                k2.updateLoginHistoryState(i2, null);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final void a(Context context, boolean z) {
        l.d(context, "");
        if (!q.b() && i.a().getLong("last_success_fetch", 0) <= 0) {
            if (TextUtils.isEmpty(DeviceRegisterManager.getDeviceId())) {
                DeviceRegisterManager.addOnDeviceConfigUpdateListener(new C1427b());
            } else {
                TrustedEnvApi.a(c.f63694a);
            }
        }
        if (f.a(e.f142364k.a())) {
            bn k2 = cj.f71084b.k();
            l.b(k2, "");
            int a2 = com.ss.android.ugc.aweme.user.a.a(e.f142364k.e());
            if (a2 == 0 || a2 == -1) {
                k2.fetchLoginHistoryState(null, d.f63695a);
            }
        }
    }
}
