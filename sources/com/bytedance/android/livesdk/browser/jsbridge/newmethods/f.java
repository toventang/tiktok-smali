package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.g;
import com.google.gson.a.c;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.lancet.j;

public final class f extends com.bytedance.ies.web.jsbridge2.f<Object, a> {
    static {
        Covode.recordClassIndex(8147);
    }

    /* access modifiers changed from: package-private */
    public static class a {
        @c(a = "appName")

        /* renamed from: a  reason: collision with root package name */
        String f14669a;
        @c(a = "aid")

        /* renamed from: b  reason: collision with root package name */
        int f14670b;
        @c(a = "appVersion")

        /* renamed from: c  reason: collision with root package name */
        String f14671c;
        @c(a = "versionCode")

        /* renamed from: d  reason: collision with root package name */
        String f14672d;
        @c(a = "netType")

        /* renamed from: e  reason: collision with root package name */
        String f14673e;
        @c(a = "orientation")

        /* renamed from: f  reason: collision with root package name */
        String f14674f;
        @c(a = "device_id")

        /* renamed from: g  reason: collision with root package name */
        String f14675g;
        @c(a = "user_id")

        /* renamed from: h  reason: collision with root package name */
        String f14676h;
        @c(a = "screenWidth")

        /* renamed from: i  reason: collision with root package name */
        float f14677i;
        @c(a = "screenHeight")

        /* renamed from: j  reason: collision with root package name */
        float f14678j;

        static {
            Covode.recordClassIndex(8148);
        }

        a() {
        }
    }

    private static a a(g gVar) {
        String str;
        a aVar = new a();
        IHostContext iHostContext = (IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class);
        aVar.f14669a = iHostContext.appName();
        aVar.f14670b = iHostContext.appId();
        try {
            str = gVar.f35646a.getPackageManager().getPackageInfo(gVar.f35646a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = iHostContext.getVersionCode();
        }
        aVar.f14671c = str;
        aVar.f14672d = iHostContext.getVersionCode();
        Context context = iHostContext.context();
        if (TextUtils.isEmpty(j.f107227f) || !j.b() || j.c()) {
            j.f107227f = NetworkUtils.getNetworkAccessType(context);
        }
        aVar.f14673e = j.f107227f;
        e a2 = p.a(gVar.f35646a);
        String str2 = "vertical";
        if (!(a2 == null || a2.getRequestedOrientation() == 1)) {
            str2 = "horizontal";
        }
        aVar.f14674f = str2;
        aVar.f14675g = AppLog.getServerDeviceId();
        aVar.f14676h = String.valueOf(u.a().b().c());
        aVar.f14677i = y.e(y.c());
        aVar.f14678j = y.e(y.b());
        return aVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ a invoke(Object obj, g gVar) {
        return a(gVar);
    }
}
