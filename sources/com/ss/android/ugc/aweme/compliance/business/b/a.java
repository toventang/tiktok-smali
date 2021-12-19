package com.ss.android.ugc.aweme.compliance.business.b;

import android.os.Bundle;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.m;
import com.bytedance.crash.runtime.r;
import com.bytedance.geckox.c;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.f;
import com.ss.android.i.d;
import com.ss.android.ugc.aweme.compliance.common.b;
import com.ss.android.ugc.aweme.notice.api.e.q;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.utils.dc;
import com.ss.ttvideoengine.aj;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f76739a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(47437);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.b.a$a  reason: collision with other inner class name */
    public static final class CallableC1749a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f76740a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f76741b;

        static {
            Covode.recordClassIndex(47438);
        }

        public CallableC1749a(boolean z, Runnable runnable) {
            this.f76740a = z;
            this.f76741b = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            List<String> list;
            boolean z = this.f76740a;
            if (z) {
                q.b(q.f112736b);
            }
            AVExternalServiceImpl.a().updateVESDKDeviceId("");
            d dVar = d.a.f59589a;
            l.b(dVar, "");
            com.ss.android.i.a aVar = dVar.f59586g;
            aVar.f59546e = "";
            dVar.a(aVar);
            com.bytedance.ies.ugc.statisticlogger.a.f();
            c b2 = dc.b();
            if (b2 != null) {
                b2.a("");
            }
            com.bytedance.apm.c.a("device_id", "");
            com.bytedance.apm.c.a("install_id", "");
            HashMap hashMap = new HashMap();
            hashMap.put("deviceid", "");
            aj.a(com.bytedance.ies.ugc.appcontext.d.a(), hashMap);
            r b3 = m.b();
            l.b(b3, "");
            b3.a("");
            SecApiImpl.a().updateDeviceIdAndInstallId("", "");
            AppLog.clearWhenSwitchChildMode(z);
            Bundle bundle = new Bundle();
            bundle.putInt("is_kids_mode", this.f76740a ? 1 : 0);
            AppLog.setCustomerHeader(bundle);
            if (this.f76740a) {
                list = b.p();
            } else {
                list = null;
            }
            AppLog.setWhiteEventFilterForChildMode(list);
            AppLog.resetDidWhenSwitchChildMode(com.bytedance.ies.ugc.appcontext.d.a(), this.f76740a, 30000, new f(this) {
                /* class com.ss.android.ugc.aweme.compliance.business.b.a.CallableC1749a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ CallableC1749a f76742a;

                static {
                    Covode.recordClassIndex(47439);
                }

                /* renamed from: com.ss.android.ugc.aweme.compliance.business.b.a$a$1$a  reason: collision with other inner class name */
                static final class CallableC1750a<V> implements Callable {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f76743a;

                    static {
                        Covode.recordClassIndex(47440);
                    }

                    CallableC1750a(AnonymousClass1 r1) {
                        this.f76743a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        Runnable runnable = this.f76743a.f76742a.f76741b;
                        if (runnable == null) {
                            return null;
                        }
                        runnable.run();
                        return z.f158842a;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.compliance.business.b.a$a$1$b */
                static final class b<V> implements Callable {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f76744a;

                    static {
                        Covode.recordClassIndex(47441);
                    }

                    b(AnonymousClass1 r1) {
                        this.f76744a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        Runnable runnable = this.f76744a.f76742a.f76741b;
                        if (runnable == null) {
                            return null;
                        }
                        runnable.run();
                        return z.f158842a;
                    }
                }

                @Override // com.ss.android.deviceregister.f
                public final void a() {
                    i.b(new b(this), i.f4826c);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f76742a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.HashMap */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.ss.android.deviceregister.f
                public final void a(String str, String str2) {
                    String str3;
                    String str4;
                    String str5;
                    com.bytedance.apm.c.a("device_id", str);
                    com.bytedance.apm.c.a("install_id", str2);
                    r b2 = m.b();
                    l.b(b2, "");
                    b2.a(str);
                    HashMap hashMap = new HashMap();
                    if (str == null) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    hashMap.put("deviceid", str3);
                    aj.a(com.bytedance.ies.ugc.appcontext.d.a(), hashMap);
                    c b3 = dc.b();
                    if (b3 != null) {
                        b3.a(str);
                    }
                    IExternalService a2 = AVExternalServiceImpl.a();
                    if (str == null) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    a2.updateVESDKDeviceId(str4);
                    d dVar = d.a.f59589a;
                    l.b(dVar, "");
                    com.ss.android.i.a aVar = dVar.f59586g;
                    if (str == null) {
                        str5 = "";
                    } else {
                        str5 = str;
                    }
                    aVar.f59546e = str5;
                    dVar.a(aVar);
                    com.bytedance.ies.ugc.statisticlogger.a.f();
                    ISecApi a3 = SecApiImpl.a();
                    if (str == null) {
                        str = "";
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    a3.updateDeviceIdAndInstallId(str, str2);
                    i.b(new CallableC1750a(this), i.f4826c);
                }
            });
            return z.f158842a;
        }
    }
}
