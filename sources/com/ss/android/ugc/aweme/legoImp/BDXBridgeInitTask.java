package com.ss.android.ugc.aweme.legoImp;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.bytedance.sdk.xbridge.protocol.c;
import com.bytedance.sdk.xbridge.protocol.impl.a.a;
import com.bytedance.sdk.xbridge.registry.core_api.a;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class BDXBridgeInitTask implements w {

    /* renamed from: a  reason: collision with root package name */
    private final ae f107657a;

    static {
        Covode.recordClassIndex(68862);
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
        return this.f107657a;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public static final class a implements a.AbstractC1074a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.sdk.xbridge.registry.core_api.a f107658a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.C1070a f107659b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f107660c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f107661d;

        static {
            Covode.recordClassIndex(68863);
        }

        @Override // com.bytedance.sdk.xbridge.registry.core_api.a.AbstractC1074a
        public final void a() {
            boolean z;
            Context a2 = d.a();
            a.C1070a aVar = this.f107659b;
            List list = this.f107660c;
            List list2 = this.f107661d;
            l.c(a2, "");
            l.c(aVar, "");
            l.c(list, "");
            l.c(list2, "");
            l.c(a2, "");
            l.c(aVar, "");
            l.c(list, "");
            l.c(list2, "");
            boolean z2 = false;
            if (c.f43951b.compareAndSet(false, true)) {
                c.f43952c = new com.bytedance.sdk.xbridge.protocol.impl.a.a(a2, aVar, list, list2);
            }
            if (Keva.getRepo("ab_repo_cold_boot").getInt("use_BDXBridgeSDK", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            com.bytedance.sdk.xbridge.registry.core_api.a.f44053d = z;
            if (Keva.getRepo("ab_repo_cold_boot").getInt("use_BDXBridgeSDK_lynx", 0) == 1) {
                z2 = true;
            }
            com.bytedance.sdk.xbridge.registry.core_api.a.f44054e = z2;
        }

        a(com.bytedance.sdk.xbridge.registry.core_api.a aVar, a.C1070a aVar2, List list, List list2) {
            this.f107658a = aVar;
            this.f107659b = aVar2;
            this.f107660c = list;
            this.f107661d = list2;
        }
    }

    public BDXBridgeInitTask(ae aeVar) {
        l.d(aeVar, "");
        this.f107657a = aeVar;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        boolean z;
        com.bytedance.sdk.xbridge.registry.core_api.a aVar = new com.bytedance.sdk.xbridge.registry.core_api.a();
        String deviceId = DeviceRegisterManager.getDeviceId();
        l.b(deviceId, "");
        a aVar2 = new a(aVar, new a.C1070a(deviceId, String.valueOf(d.n), String.valueOf(d.h()), String.valueOf(d.d()), d.s, (byte) 0), n.a("https://mon.isnssdk.com/monitor/collect/"), n.a("https://mon.isnssdk.com/monitor/appmonitor/v2/settings"));
        l.c(aVar2, "");
        com.bytedance.sdk.xbridge.registry.core_api.a.f44052c = aVar2;
        boolean z2 = false;
        if (Keva.getRepo("ab_repo_cold_boot").getInt("use_BDXBridgeSDK", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        com.bytedance.sdk.xbridge.registry.core_api.a.f44053d = z;
        if (Keva.getRepo("ab_repo_cold_boot").getInt("use_BDXBridgeSDK_lynx", 0) == 1) {
            z2 = true;
        }
        com.bytedance.sdk.xbridge.registry.core_api.a.f44054e = z2;
    }
}
