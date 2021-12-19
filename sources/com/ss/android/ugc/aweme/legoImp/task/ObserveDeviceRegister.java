package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.feed.CommonFeedLaunchServiceImpl;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.List;

public class ObserveDeviceRegister implements w {

    /* renamed from: a  reason: collision with root package name */
    private static DeviceRegisterManager.a f107847a = new DeviceRegisterManager.a() {
        /* class com.ss.android.ugc.aweme.legoImp.task.ObserveDeviceRegister.AnonymousClass1 */

        static {
            Covode.recordClassIndex(69075);
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(boolean z, boolean z2) {
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(boolean z) {
            CommonFeedLaunchServiceImpl.b().a(!z);
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(String str, String str2) {
            b.c().onDeviceRegistrationInfoChanged();
        }
    };

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
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    static {
        Covode.recordClassIndex(69074);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        DeviceRegisterManager.addOnDeviceConfigUpdateListener(f107847a);
    }
}
