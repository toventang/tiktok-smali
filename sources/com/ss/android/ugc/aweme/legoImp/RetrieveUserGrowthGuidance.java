package com.ss.android.ugc.aweme.legoImp;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.ui.progressguidance.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import java.util.List;

public final class RetrieveUserGrowthGuidance implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final a f107669a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private static final DeviceRegisterManager.a f107670b = new b();

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

    public static final class a {
        static {
            Covode.recordClassIndex(68877);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements DeviceRegisterManager.a {
        static {
            Covode.recordClassIndex(68878);
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(boolean z, boolean z2) {
        }

        b() {
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(boolean z) {
            if (z) {
                a.C2284a.b();
            }
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            a.C2284a.b();
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
        Covode.recordClassIndex(68876);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        l.d(context, "");
        DeviceRegisterManager.addOnDeviceConfigUpdateListener(f107670b);
    }
}
