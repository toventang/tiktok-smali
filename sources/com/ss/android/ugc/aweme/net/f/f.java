package com.ss.android.ugc.aweme.net.f;

import android.content.Context;
import android.os.Build;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.b.c.c;
import com.bytedance.ttnet.d.d;
import com.ss.android.common.b.a;
import com.ss.android.ugc.aweme.net.interceptor.ApiCheckInterceptorTTNet;
import com.ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptorTTNet;
import com.ss.android.ugc.aweme.net.interceptor.UrlTransformInterceptorTTNet;
import com.ss.android.ugc.aweme.net.j;
import com.ss.android.ugc.aweme.net.n;
import com.ss.android.ugc.aweme.utils.InterceptorHolder;
import com.ss.android.ugc.aweme.utils.SecUidInterceptorTTNet;
import java.util.Collection;
import java.util.List;

public final class f extends b {

    /* renamed from: c  reason: collision with root package name */
    private static String f112323c;

    static {
        Covode.recordClassIndex(72175);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.net.f.b
    public final synchronized a a() {
        MethodCollector.i(5586);
        j.a().a();
        if (Build.VERSION.SDK_INT == 18) {
            f112323c = "SsOkhttp3Client";
            c cVar = new c(new n());
            MethodCollector.o(5586);
            return cVar;
        }
        f112323c = "CronetClient";
        a aVar = new a();
        if (aVar.f112315a == null) {
            aVar.f112315a = new d();
        }
        aVar.f112315a.f28942c = 60000;
        if (aVar.f112315a == null) {
            aVar.f112315a = new d();
        }
        aVar.f112315a.f28943d = 60000;
        if (aVar.f112315a == null) {
            aVar.f112315a = new d();
        }
        aVar.f112315a.f28944e = 60000;
        aVar.a(j.a().c());
        aVar.a(new ApiCheckInterceptorTTNet());
        aVar.a(new DevicesNullInterceptorTTNet());
        aVar.a(new UrlTransformInterceptorTTNet());
        aVar.a(new SecUidInterceptorTTNet());
        List<com.bytedance.retrofit2.c.a> b2 = InterceptorHolder.e().b();
        if (!b.a((Collection) b2)) {
            for (com.bytedance.retrofit2.c.a aVar2 : b2) {
                aVar.a(aVar2);
            }
        }
        aVar.f112316b = new c();
        if (SettingsManager.a().a("change_network_client", 1) == 0) {
            MethodCollector.o(5586);
            return aVar;
        }
        g gVar = new g(aVar);
        MethodCollector.o(5586);
        return gVar;
    }

    public f(Context context) {
        super(context);
    }
}
