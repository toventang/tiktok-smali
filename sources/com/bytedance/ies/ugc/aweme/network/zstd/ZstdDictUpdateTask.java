package com.bytedance.ies.ugc.aweme.network.zstd;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.zstd.b;
import com.google.gson.f;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.io.File;
import java.util.List;
import java.util.Map;

public final class ZstdDictUpdateTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final a f35035a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f35036b = i.a((h.f.a.a) d.f35040a);

    static {
        Covode.recordClassIndex(21020);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    public final b.C0789b c() {
        return (b.C0789b) this.f35036b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21021);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static final class c extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f35039a = new c();

        static {
            Covode.recordClassIndex(21023);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
            if (com.ss.android.ugc.aweme.lancet.d.f107194b == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                com.ss.android.ugc.aweme.lancet.d.f107194b = a2.getCacheDir();
            }
            return new File(com.ss.android.ugc.aweme.lancet.d.f107194b, "zstd").getAbsolutePath();
        }
    }

    static final class d extends m implements h.f.a.a<b.C0789b> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f35040a = new d();

        static {
            Covode.recordClassIndex(21024);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b.C0789b invoke() {
            b.c cVar = (b.c) SettingsManager.a().a("tiktok_zstd_dict_cfg", b.c.class, b.f35042a);
            if (cVar != null) {
                return cVar.f35048a;
            }
            return null;
        }
    }

    public static final class b extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ZstdDictUpdateTask f35037a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f35038b;

        static {
            Covode.recordClassIndex(21022);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onStart(DownloadInfo downloadInfo) {
            if (downloadInfo != null) {
                downloadInfo.getUrl();
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            if (downloadInfo != null) {
                downloadInfo.getUrl();
                c cVar = c.f35049a;
                String str = this.f35038b;
                String targetFilePath = downloadInfo.getTargetFilePath();
                l.b(targetFilePath, "");
                cVar.a(str, targetFilePath);
            }
        }

        b(ZstdDictUpdateTask zstdDictUpdateTask, String str) {
            this.f35037a = zstdDictUpdateTask;
            this.f35038b = str;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            Integer num;
            if (downloadInfo != null) {
                downloadInfo.getUrl();
            }
            String.valueOf(baseException);
            com.ss.android.ugc.aweme.app.f.c a2 = new com.ss.android.ugc.aweme.app.f.c().a("dict_id", this.f35038b).a("params", new f().b(this.f35037a.c()));
            String str = null;
            if (baseException != null) {
                num = Integer.valueOf(baseException.getErrorCode());
            } else {
                num = null;
            }
            com.ss.android.ugc.aweme.app.f.c a3 = a2.a("err_code", num);
            if (baseException != null) {
                str = baseException.getErrorMessage();
            }
            o.a("zstd_dict_download_error", a3.a("err_msg", str).a());
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        Map<String, b.a> map;
        b.C0789b c2 = c();
        Map<String, String> map2 = null;
        if (c2 != null) {
            map2 = c2.f35046a;
        }
        c.f35049a.a(map2);
        b.C0789b c3 = c();
        if (!(c3 == null || (map = c3.f35047b) == null)) {
            for (Map.Entry<String, b.a> entry : map.entrySet()) {
                String key = entry.getKey();
                b.a value = entry.getValue();
                if (value != null) {
                    Downloader.with(com.bytedance.ies.ugc.appcontext.d.a()).url(value.f35044a).md5(value.f35045b).savePath((String) i.a((h.f.a.a) c.f35039a).getValue()).name(key + ".dict").monitorScene("zstd_dict_download").subThreadListener(new b(this, key)).download();
                }
            }
        }
    }
}
