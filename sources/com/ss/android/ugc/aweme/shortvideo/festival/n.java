package com.ss.android.ugc.aweme.shortvideo.festival;

import android.text.TextUtils;
import com.bytedance.common.utility.d;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.utils.cs;
import com.ss.android.ugc.aweme.y.a;
import com.ss.android.ugc.aweme.y.c;
import com.ss.android.ugc.tools.utils.u;
import java.io.File;

public class n extends AbsDownloadListener {

    /* renamed from: a  reason: collision with root package name */
    private static volatile n f128510a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f128511b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f128512c;

    /* renamed from: d  reason: collision with root package name */
    private String f128513d = "";

    /* renamed from: e  reason: collision with root package name */
    private boolean f128514e;

    private static a.C3862a f() {
        c cVar = f.f128496a.f128495b;
        if (cVar == null) {
            return null;
        }
        return cVar.f145306f;
    }

    public final String c() {
        if (g.a()) {
            return this.f128513d;
        }
        return "";
    }

    static {
        Covode.recordClassIndex(84260);
        String shareDir = AVExternalServiceImpl.a().configService().cacheConfig().shareDir();
        f128511b = shareDir;
        f128512c = shareDir + "water" + File.separator;
    }

    public static n a() {
        MethodCollector.i(6185);
        if (f128510a == null) {
            synchronized (n.class) {
                try {
                    if (f128510a == null) {
                        f128510a = new n();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6185);
                    throw th;
                }
            }
        }
        n nVar = f128510a;
        MethodCollector.o(6185);
        return nVar;
    }

    private boolean d() {
        String e2 = e();
        if (TextUtils.isEmpty(e2)) {
            return false;
        }
        File file = new File(a(e2));
        if (!file.exists() || !file.isDirectory() || file.listFiles().length <= 0) {
            return false;
        }
        this.f128513d = file.getPath();
        return true;
    }

    private static String e() {
        UrlModel urlModel;
        a.C3862a f2 = f();
        if (f2 == null || f2.f145293a == null || (urlModel = f2.f145293a) == null || h.a(urlModel.getUrlList())) {
            return null;
        }
        return urlModel.getUrlList().get(0);
    }

    public final void b() {
        if (!g.a()) {
            cs.c(f128512c);
        } else if (!d() && !this.f128514e) {
            this.f128514e = true;
            this.f128513d = "";
            String str = f128512c;
            cs.c(str);
            cs.a(str, false);
            b(e());
        }
    }

    private static String a(String str) {
        return f128512c + a(str, false);
    }

    private void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            com.ss.android.ugc.aweme.download.component_api.a with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
            with.f83078c = a(str, true);
            with.f83081f = f128512c;
            com.ss.android.ugc.aweme.download.component_api.a a2 = with.a(DownloadServiceManager.INSTANCE.getRetryExpCount());
            a2.D = this;
            a2.f();
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(6227);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(6227);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(6227);
        return delete;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        String url = downloadInfo.getUrl();
        StringBuilder sb = new StringBuilder();
        String str = f128512c;
        File file = new File(sb.append(str).append(a(url, true)).toString());
        if (f() != null) {
            String str2 = f().f145294b;
            if (file.exists() && TextUtils.equals(d.a(file), str2)) {
                String a2 = a(downloadInfo.getUrl());
                cs.a(a2, false);
                File file2 = new File(a2);
                if (!file2.exists() || !file2.isDirectory() || file2.listFiles().length <= 0) {
                    try {
                        u.a(file, file2);
                        if (file.exists()) {
                            a(file);
                        }
                        this.f128513d = file2.getPath();
                        return;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return;
                    }
                } else {
                    this.f128513d = file2.getPath();
                    return;
                }
            }
        }
        cs.c(str);
    }

    private static String a(String str, boolean z) {
        String b2 = d.b(str);
        if (z) {
            return b2 + ".zip";
        }
        return b2;
    }
}
