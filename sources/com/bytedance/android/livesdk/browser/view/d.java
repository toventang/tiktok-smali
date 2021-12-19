package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ah.b.d;
import com.bytedance.android.livesdk.ah.f;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.util.HashMap;

final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f14855a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f14856b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14857c;

    static {
        Covode.recordClassIndex(8228);
    }

    d(b bVar, Context context, String str) {
        this.f14855a = bVar;
        this.f14856b = context;
        this.f14857c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        b bVar = this.f14855a;
        Context context = this.f14856b;
        String str = this.f14857c;
        if (context != null && !TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            if (com.ss.android.ugc.aweme.lancet.d.f107194b == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                com.ss.android.ugc.aweme.lancet.d.f107194b = context.getCacheDir();
            }
            String sb2 = sb.append(com.ss.android.ugc.aweme.lancet.d.f107194b.getAbsolutePath()).append("/webview/").toString();
            Downloader.with(context).url(str).name("long_click_img.tmp").savePath(sb2).mainThreadListener(new AbsDownloadListener(context, str, sb2, "long_click_img.tmp") {
                /* class com.bytedance.android.livesdk.browser.view.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Context f14845a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f14846b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ String f14847c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ String f14848d;

                static {
                    Covode.recordClassIndex(8225);
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
                public final void onSuccessed(DownloadInfo downloadInfo) {
                    if (downloadInfo != null && downloadInfo.getTargetFilePath() != null) {
                        if (TextUtils.isEmpty(downloadInfo.getTargetFilePath())) {
                            ao.a(y.e(), "Failed to save image", 0);
                            return;
                        }
                        b bVar = b.this;
                        Context context = this.f14845a;
                        String str = this.f14846b;
                        String str2 = this.f14847c + this.f14848d;
                        e a2 = p.a(context);
                        if (a2 == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                            ao.a(y.e(), "Failed to save image", 0);
                        } else {
                            f.a(a2).a(new d(str2, str, context) {
                                /* class com.bytedance.android.livesdk.browser.view.b.AnonymousClass2 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ String f14850a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ String f14851b;

                                /* renamed from: c  reason: collision with root package name */
                                final /* synthetic */ Context f14852c;

                                static {
                                    Covode.recordClassIndex(8226);
                                }

                                @Override // com.bytedance.android.livesdk.ah.b.d
                                public final void b(String... strArr) {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("refuse_permission", strArr);
                                    c.a("ttlive_replay_permission", 1, hashMap);
                                }

                                private static boolean a(File file) {
                                    MethodCollector.i(9822);
                                    try {
                                        e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                                        if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                                            com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
                                        }
                                        if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                                            com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                                            MethodCollector.o(9822);
                                            return false;
                                        }
                                    } catch (Throwable unused) {
                                    }
                                    boolean delete = file.delete();
                                    MethodCollector.o(9822);
                                    return delete;
                                }

                                /* JADX WARNING: Code restructure failed: missing block: B:11:0x0090, code lost:
                                    if (r4 != null) goto L_0x0092;
                                 */
                                /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
                                    r4.close();
                                 */
                                /* JADX WARNING: Failed to process nested try/catch */
                                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0089 */
                                @Override // com.bytedance.android.livesdk.ah.b.d
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                public final void a(java.lang.String... r10) {
                                    /*
                                    // Method dump skipped, instructions count: 185
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.view.b.AnonymousClass2.a(java.lang.String[]):void");
                                }

                                {
                                    this.f14850a = r2;
                                    this.f14851b = r3;
                                    this.f14852c = r4;
                                }
                            }, "android.permission.WRITE_EXTERNAL_STORAGE");
                        }
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    ao.a(y.e(), "Failed to save image", 0);
                }

                {
                    this.f14845a = r2;
                    this.f14846b = r3;
                    this.f14847c = r4;
                    this.f14848d = r5;
                }
            }).download();
        }
    }
}
