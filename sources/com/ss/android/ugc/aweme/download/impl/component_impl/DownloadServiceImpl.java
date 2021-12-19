package com.ss.android.ugc.aweme.download.impl.component_impl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.h;
import com.ss.android.socialbase.downloader.g.j;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.download.component_api.a;
import com.ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend;
import com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend;
import com.ss.android.ugc.aweme.download.component_api.depend.IMonitorLogSendDepend;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.download.impl.component_impl.c;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class DownloadServiceImpl implements IDownloadService {

    /* renamed from: b  reason: collision with root package name */
    static IMonitorLogSendDepend f83101b;

    /* renamed from: c  reason: collision with root package name */
    private static IDownloadConfigDepend f83102c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f83103d;

    /* renamed from: e  reason: collision with root package name */
    private static final int f83104e;

    /* renamed from: a  reason: collision with root package name */
    public Context f83105a;

    static {
        Covode.recordClassIndex(51812);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f83103d = availableProcessors;
        f83104e = Math.max(2, Math.min(availableProcessors - 1, 4));
    }

    public static IDownloadService b() {
        MethodCollector.i(8052);
        Object a2 = b.a(IDownloadService.class, false);
        if (a2 != null) {
            IDownloadService iDownloadService = (IDownloadService) a2;
            MethodCollector.o(8052);
            return iDownloadService;
        }
        if (b.be == null) {
            synchronized (IDownloadService.class) {
                try {
                    if (b.be == null) {
                        b.be = new DownloadServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8052);
                    throw th;
                }
            }
        }
        DownloadServiceImpl downloadServiceImpl = (DownloadServiceImpl) b.be;
        MethodCollector.o(8052);
        return downloadServiceImpl;
    }

    public static JSONObject a() {
        String str;
        JSONObject jSONObject;
        IDownloadConfigDepend iDownloadConfigDepend = f83102c;
        if (iDownloadConfigDepend != null) {
            str = iDownloadConfigDepend.getSettingString();
        } else {
            str = "";
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject = new JSONObject(str);
            } else {
                jSONObject = new JSONObject();
            }
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("switch_not_auto_boot_service", 1);
            jSONObject.put("download_completed_event_tag", "draw_ad");
            jSONObject.put("landing_page_progressbar_visible", 1);
            jSONObject.put("is_enable_show_retry_download_dialog", 1);
            jSONObject.put("save_path_security", 1);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IDownloadService
    public final boolean a(int i2) {
        return Downloader.getInstance(this.f83105a).isDownloading(i2);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public void cancel(int i2) {
        Downloader.getInstance(this.f83105a).cancel(i2);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public DownloadInfo getDownloadInfo(int i2) {
        return Downloader.getInstance(this.f83105a).getDownloadInfo(i2);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public a getDownloadTask(int i2) {
        return e.a().f83122a.get(i2);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public void restart(int i2) {
        Downloader.getInstance(this.f83105a).restart(i2);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IDownloadService
    public final void a(IDownloadSdkMonitorDepend iDownloadSdkMonitorDepend) {
        l.d(iDownloadSdkMonitorDepend, "");
        try {
            com.ss.android.socialbase.a.a a2 = com.ss.android.socialbase.a.a.a();
            c.a aVar = new c.a(iDownloadSdkMonitorDepend);
            if (a2.f60258a == null) {
                a2.f60258a = aVar;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public a with(String str) {
        if (this.f83105a == null) {
            this.f83105a = d.a();
        }
        return new d(this.f83105a, str);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public com.ss.android.ugc.aweme.download.component_api.a.a getPageLifeMonitor(int i2) {
        final a downloadTask = getDownloadTask(i2);
        if (downloadTask == null || !downloadTask.T) {
            return new com.ss.android.ugc.aweme.download.component_api.a.a() {
                /* class com.ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(51814);
                }
            };
        }
        if (downloadTask.W != null) {
            return downloadTask.W;
        }
        downloadTask.W = new com.ss.android.ugc.aweme.download.component_api.a.a() {
            /* class com.ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(51813);
            }

            @Override // com.ss.android.ugc.aweme.download.component_api.a.a, com.bytedance.ies.uikit.a.e
            public final void a() {
                com.ss.android.ugc.aweme.download.component_api.c.c.a(DownloadServiceImpl.this.f83105a, downloadTask);
            }
        };
        return downloadTask.W;
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public com.ss.android.ugc.aweme.download.component_api.a.b getViewLifeMonitor(int i2) {
        final a downloadTask = getDownloadTask(i2);
        if (downloadTask == null || !downloadTask.U) {
            return new com.ss.android.ugc.aweme.download.component_api.a.b() {
                /* class com.ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(51816);
                }
            };
        }
        if (downloadTask.V != null) {
            return downloadTask.V;
        }
        downloadTask.V = new com.ss.android.ugc.aweme.download.component_api.a.b() {
            /* class com.ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl.AnonymousClass3 */

            static {
                Covode.recordClassIndex(51815);
            }
        };
        return downloadTask.V;
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public int getDownloadId(String str, String str2) {
        return Downloader.getInstance(this.f83105a).getDownloadId(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IBaseDownloadService
    public DownloadInfo getDownloadInfo(String str, String str2) {
        return Downloader.getInstance(this.f83105a).getDownloadInfo(str, str2);
    }

    private static ExecutorService a(int i2, String str, ExecutorService executorService) {
        ThreadPoolExecutor threadPoolExecutor = executorService;
        MethodCollector.i(7942);
        if (i2 > 0) {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(i2, i2, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.ss.android.socialbase.downloader.j.a("DownloadThreadPool-" + str + "-fixed", true));
            try {
                threadPoolExecutor2.allowCoreThreadTimeOut(true);
                threadPoolExecutor = threadPoolExecutor2;
            } catch (Exception e2) {
                e2.printStackTrace();
                threadPoolExecutor = threadPoolExecutor2;
            }
        }
        MethodCollector.o(7942);
        return threadPoolExecutor;
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.service.IDownloadService
    public final void a(Context context, IMonitorLogSendDepend iMonitorLogSendDepend, IDownloadConfigDepend iDownloadConfigDepend) {
        j jVar;
        boolean z;
        this.f83105a = context;
        f83101b = iMonitorLogSendDepend;
        f83102c = iDownloadConfigDepend;
        boolean z2 = false;
        int optInt = a().optInt("download_exp_switch_temp", 0);
        h hVar = new h(context);
        hVar.n = new a(this);
        IDownloadConfigDepend iDownloadConfigDepend2 = f83102c;
        if (iDownloadConfigDepend2 != null) {
            jVar = iDownloadConfigDepend2.getTTNetDownloadHttpService();
        } else {
            jVar = null;
        }
        hVar.f60484f = jVar;
        hVar.B = optInt;
        IDownloadConfigDepend iDownloadConfigDepend3 = f83102c;
        if (iDownloadConfigDepend3 != null) {
            z = iDownloadConfigDepend3.needAutoRefreshUnSuccessTask();
        } else {
            z = false;
        }
        hVar.A = z;
        hVar.f60490l = b.f83116a;
        if (a().optInt("enable_thread_opt") == 1) {
            JSONObject a2 = a();
            int optInt2 = a2.optInt("cpu_thread_count", -1);
            int optInt3 = a2.optInt("io_thread_count", -1);
            int optInt4 = a2.optInt("mix_default_thread_count", -1);
            int optInt5 = a2.optInt("mix_frequent_thread_count", -1);
            int optInt6 = a2.optInt("mix_apk_thread_count", 4);
            int optInt7 = a2.optInt("db_thread_count", -1);
            int optInt8 = a2.optInt("chunk_thread_count", -1);
            if (a2.optInt("use_default_okhttp_executor", 0) == 1) {
                z2 = true;
            }
            hVar.o = a(optInt2, "cpu", g.b());
            hVar.p = a(optInt3, "io", g.a());
            hVar.q = a(optInt4, "mix-default", g.a());
            hVar.r = a(optInt5, "mix-frequent", g.a());
            hVar.s = a(optInt6, "mix-apk", g.a());
            hVar.t = a(optInt7, "db", g.a());
            hVar.u = a(optInt8, "chunk", g.a());
            if (!z2) {
                hVar.v = g.a();
            }
        }
        Downloader.init(hVar);
    }
}
