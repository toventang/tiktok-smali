package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.util.f;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.app.e.a.b;
import com.ss.android.ugc.aweme.commercialize.download.depend.DownloadConfigDepend;
import com.ss.android.ugc.aweme.commercialize.download.depend.DownloadMonitorLogSender;
import com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl;
import java.util.concurrent.atomic.AtomicBoolean;

public final class bx {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f142751a = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(93372);
    }

    public static void a(Context context) {
        IDownloadService b2;
        MethodCollector.i(1645);
        AtomicBoolean atomicBoolean = f142751a;
        if (atomicBoolean.get()) {
            MethodCollector.o(1645);
            return;
        }
        synchronized (atomicBoolean) {
            try {
                if (atomicBoolean.compareAndSet(false, true) && (b2 = DownloadServiceImpl.b()) != null) {
                    b2.a(context, new DownloadMonitorLogSender(), new DownloadConfigDepend());
                    if (f.a(context)) {
                        b2.a(new IDownloadSdkMonitorDepend() {
                            /* class com.ss.android.ugc.aweme.utils.bx.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(93373);
                            }

                            @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final String getChannel() {
                                return d.s;
                            }

                            @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final String[] getMonitorHosts() {
                                return b.f66692a;
                            }

                            @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final String getAppVersionName() {
                                return d.f();
                            }

                            @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final Context getContext() {
                                return d.a();
                            }

                            @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final String getDeviceId() {
                                return DeviceRegisterManager.getDeviceId();
                            }

                            @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final long getUpdateVersionCode() {
                                return d.d();
                            }

                            @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final String getAid() {
                                return new StringBuilder().append(d.n).toString();
                            }

                            @Override // com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final String getPackageName() {
                                return d.a().getPackageName();
                            }
                        });
                    }
                }
            } finally {
                MethodCollector.o(1645);
            }
        }
    }
}
