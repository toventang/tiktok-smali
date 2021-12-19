package com.ss.android.ugc.aweme.fe.method;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.core.content.FileProvider;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.common.utility.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

public final class OpenPDFMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91123a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57336);
    }

    private OpenPDFMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57337);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ OpenPDFMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public static final class b extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.views.i f91124a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f91125b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f91126c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f91127d;

        static {
            Covode.recordClassIndex(57338);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onStart(DownloadInfo downloadInfo) {
            l.d(downloadInfo, "");
            super.onStart(downloadInfo);
            this.f91124a.show();
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onCanceled(DownloadInfo downloadInfo) {
            l.d(downloadInfo, "");
            super.onCanceled(downloadInfo);
            this.f91124a.dismiss();
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f91127d).a(R.string.g21).a();
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            l.d(downloadInfo, "");
            super.onSuccessed(downloadInfo);
            this.f91124a.dismiss();
            Uri uriForFile = FileProvider.getUriForFile(this.f91127d, this.f91127d.getPackageName() + ".fileprovider", new File(this.f91125b + File.separator + this.f91126c));
            String type = this.f91127d.getContentResolver().getType(uriForFile);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setDataAndType(uriForFile, type);
            intent.addFlags(1);
            Context context = this.f91127d;
            Intent createChooser = Intent.createChooser(intent, "");
            com.ss.android.ugc.tiktok.security.a.a.a(createChooser, context);
            context.startActivity(createChooser);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            l.d(downloadInfo, "");
            l.d(baseException, "");
            super.onFailed(downloadInfo, baseException);
            this.f91124a.dismiss();
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f91127d).a(R.string.g21).a();
        }

        b(com.ss.android.ugc.aweme.views.i iVar, String str, String str2, Context context) {
            this.f91124a = iVar;
            this.f91125b = str;
            this.f91126c = str2;
            this.f91127d = context;
        }
    }

    public OpenPDFMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    private static boolean a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        List<String> list = null;
        if (!(parse == null || parse.getHost() == null)) {
            String host = parse.getHost();
            if (host == null) {
                l.b();
            }
            l.b(host, "");
            String c2 = com.ss.android.ugc.aweme.lancet.b.a.c(host);
            if (c2 != null) {
                try {
                    list = com.bytedance.ttnet.a.a.a(a(context)).d(NetworkUtils.getShareCookieHost());
                    if (list == null) {
                        l.b();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (list.contains(c2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String str;
        if (jSONObject != null) {
            str = jSONObject.optString("url");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        Context context = (Context) this.mContextRef.get();
        if (context == null || a(context) == null) {
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.g21).a();
            return;
        }
        StringBuilder sb = new StringBuilder();
        String b2 = d.b(str);
        l.b(b2, "");
        Objects.requireNonNull(b2, "null cannot be cast to non-null type java.lang.String");
        String substring = b2.substring(8, 24);
        l.b(substring, "");
        String sb2 = sb.append(substring).append(".pdf").toString();
        StringBuilder sb3 = new StringBuilder();
        if (com.ss.android.ugc.aweme.lancet.d.f107195c == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
            com.ss.android.ugc.aweme.lancet.d.f107195c = context.getFilesDir();
        }
        File file = com.ss.android.ugc.aweme.lancet.d.f107195c;
        l.b(file, "");
        String sb4 = sb3.append(file.getAbsolutePath()).append("jsbdownload").toString();
        com.ss.android.ugc.aweme.views.i iVar = new com.ss.android.ugc.aweme.views.i(context);
        ArrayList arrayList = new ArrayList();
        if (a(str, context)) {
            arrayList.add(new HttpHeader("Cookie", CookieManager.getInstance().getCookie(str)));
        }
        Downloader.with(a(context)).extraHeaders(arrayList).url(str).name(sb2).savePath(sb4).retryCount(0).mainThreadListener(new b(iVar, sb4, sb2, context)).download();
    }
}
