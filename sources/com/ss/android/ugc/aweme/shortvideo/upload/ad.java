package com.ss.android.ugc.aweme.shortvideo.upload;

import android.app.Application;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.publish.f.e;
import com.ss.android.ugc.tools.utils.q;
import h.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f131976a = new ArrayList();

    static {
        Covode.recordClassIndex(86479);
    }

    private final void c() {
        a("uid", g.a().A().c());
    }

    private final void d() {
        String deviceId = DeviceRegisterManager.getDeviceId();
        if (deviceId == null || deviceId.length() == 0) {
            deviceId = "0";
        }
        a("did", deviceId);
    }

    private final void e() {
        a("appid", String.valueOf(g.a().w().b()));
    }

    private final void h() {
        String c2 = g.a().y().c();
        if (c2 == null) {
            c2 = "";
        }
        a("carrier_region", c2);
    }

    public final void b() {
        e();
        d();
        c();
        f();
        g();
        h();
    }

    private final void f() {
        a("version_code", String.valueOf(g.a().M()));
        a("update_version_code", String.valueOf(g.a().N()));
    }

    private final void g() {
        String str;
        Application application = i.f115645a;
        if (j.f107225d == l.a.UNKNOWN || !j.b() || j.c()) {
            j.f107225d = l.c(application);
        }
        l.a aVar = j.f107225d;
        h.f.b.l.b(aVar, "");
        switch (ae.f131977a[aVar.ordinal()]) {
            case 1:
            case 2:
                str = "null";
                break;
            case 3:
                str = "mobile";
                break;
            case 4:
                str = "2G";
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                str = "3G";
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                str = "4G";
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                str = "5G";
                break;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                str = "wifi";
                break;
            default:
                throw new n();
        }
        a("net_type", str);
    }

    public final String a() {
        if (this.f131976a.isEmpty()) {
            return "";
        }
        Iterator<T> it = this.f131976a.iterator();
        if (it.hasNext()) {
            String next = it.next();
            while (it.hasNext()) {
                next = next + '&' + ((String) it.next());
            }
            String str = next;
            q.a("UploaderServerParam: ".concat(String.valueOf(str)));
            return str;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public final void a(e eVar) {
        h.f.b.l.d(eVar, "");
        String str = eVar.f118736k;
        if (str != null && str.length() != 0) {
            a("store_region", str);
        }
    }

    public final void a(com.ss.android.ugc.aweme.publish.f.g gVar) {
        h.f.b.l.d(gVar, "");
        String str = gVar.p;
        if (str == null || str.length() == 0) {
            str = g.a().y().a();
        }
        h.f.b.l.b(str, "");
        a("Region", str);
        String str2 = gVar.C;
        if (str2 != null && str2.length() != 0) {
            a("StoreRegion", str2);
        }
    }

    private void a(String str, String str2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        this.f131976a.add(str + '=' + str2);
    }
}
