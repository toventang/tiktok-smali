package com.ss.android.ugc.aweme.aq.b;

import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.utils.cs;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.y.d;
import com.ss.android.ugc.tools.utils.u;
import java.io.File;
import java.util.Collection;

public class b extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f66969a = (e.c() + File.separator + "festival");

    /* renamed from: d  reason: collision with root package name */
    private static volatile b f66970d;

    /* renamed from: b  reason: collision with root package name */
    public String f66971b;

    /* renamed from: c  reason: collision with root package name */
    public a f66972c;

    /* renamed from: e  reason: collision with root package name */
    private String f66973e;

    public interface a {
        static {
            Covode.recordClassIndex(41277);
        }

        void a();
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.ugc.aweme.aq.b.e, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
    }

    private b() {
        if (!com.ss.android.ugc.aweme.aq.a.a.a()) {
            b(f66969a);
        } else {
            cs.a(f66969a, false);
        }
    }

    static {
        Covode.recordClassIndex(41276);
    }

    public static b a() {
        MethodCollector.i(8328);
        if (f66970d == null) {
            synchronized (b.class) {
                try {
                    if (f66970d == null) {
                        f66970d = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8328);
                    throw th;
                }
            }
        }
        b bVar = f66970d;
        MethodCollector.o(8328);
        return bVar;
    }

    public static String b() {
        UrlModel urlModel;
        d d2 = com.ss.android.ugc.aweme.aq.a.a.d();
        if (d2 == null || (urlModel = d2.f145321b) == null || com.bytedance.common.utility.collection.b.a((Collection) urlModel.getUrlList())) {
            return null;
        }
        return urlModel.getUrlList().get(0);
    }

    private static boolean c() {
        File[] listFiles;
        StringBuilder sb = new StringBuilder();
        String str = f66969a;
        File file = new File(sb.append(str).append(File.separator).append(com.bytedance.common.utility.d.b(b())).append(".zip").toString());
        if (!file.exists()) {
            return false;
        }
        File file2 = new File(str + File.separator + com.bytedance.common.utility.d.b(b()));
        if (!file2.exists() || !file2.isDirectory() || (listFiles = file2.listFiles()) == null || listFiles.length == 0 || com.ss.android.ugc.aweme.aq.a.a.c()) {
            return false;
        }
        return a(file, com.ss.android.ugc.aweme.aq.a.a.b().f145305e.f145320a);
    }

    private void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            String str2 = f66969a;
            this.f66973e = sb.append(str2).append(File.separator).append(com.bytedance.common.utility.d.b(str)).toString();
            cs.a(str2, false);
            com.ss.android.ugc.aweme.download.component_api.a with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
            with.f83078c = com.bytedance.common.utility.d.b(str) + ".zip";
            com.ss.android.ugc.aweme.download.component_api.a a2 = with.a("legacy_festival_res").a(DownloadServiceManager.INSTANCE.getRetryExpCount());
            a2.f83081f = str2;
            a2.D = this;
            a2.f();
        }
    }

    private static void b(String str) {
        try {
            cs.c(str);
        } catch (NoSuchMethodError e2) {
            com.ss.android.ugc.aweme.framework.a.a.b(3, null, "NoSuchMethodError in FestivalResDownloader-deleteFiles, path is " + str + ", error is " + e2.getMessage());
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.ugc.aweme.aq.b.e, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            String targetFilePath = downloadInfo.getTargetFilePath();
            if (!TextUtils.isEmpty(targetFilePath)) {
                File file = new File(targetFilePath);
                if (!com.ss.android.ugc.aweme.aq.a.a.c()) {
                    if (!a(file, com.ss.android.ugc.aweme.aq.a.a.b().f145305e.f145320a)) {
                        b(file.getPath());
                        return;
                    }
                    File file2 = new File(this.f66973e);
                    if (file2.exists() && file2.listFiles().length > 0) {
                        b(file2.getPath());
                    }
                    File a2 = cs.a(this.f66973e, false);
                    try {
                        u.a(new File(targetFilePath), a2);
                        this.f66971b = a2.getPath();
                        if (this.f66972c != null) {
                            i.b(new c(this), i.f4826c);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    public final void a(a aVar) {
        if (!com.ss.android.ugc.aweme.aq.a.a.a()) {
            b(f66969a);
            return;
        }
        this.f66972c = aVar;
        if (c()) {
            this.f66971b = f66969a + File.separator + com.bytedance.common.utility.d.b(b());
            a aVar2 = this.f66972c;
            if (aVar2 != null) {
                aVar2.a();
                return;
            }
        }
        b(f66969a);
        a(b());
    }

    private static boolean a(File file, String str) {
        if (!file.exists()) {
            return false;
        }
        return TextUtils.equals(com.bytedance.common.utility.d.a(file), str);
    }
}
