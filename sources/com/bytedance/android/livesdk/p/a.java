package com.bytedance.android.livesdk.p;

import android.text.TextUtils;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static a f20179c;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<Integer, b<Long, Long>> f20180a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, AbstractC0411a> f20181b = new HashMap<>();

    /* renamed from: com.bytedance.android.livesdk.p.a$a  reason: collision with other inner class name */
    public interface AbstractC0411a {
        static {
            Covode.recordClassIndex(11909);
        }

        void a(DownloadInfo downloadInfo);

        void b(DownloadInfo downloadInfo);

        void c(DownloadInfo downloadInfo);

        void d(DownloadInfo downloadInfo);
    }

    static {
        Covode.recordClassIndex(11907);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(9473);
        if (f20179c == null) {
            synchronized (a.class) {
                try {
                    if (f20179c == null) {
                        f20179c = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9473);
                    throw th;
                }
            }
        }
        a aVar = f20179c;
        MethodCollector.o(9473);
        return aVar;
    }

    public static DownloadInfo a(String str) {
        List<DownloadInfo> allDownloadInfo = Downloader.getInstance(y.e()).getAllDownloadInfo();
        if (allDownloadInfo == null) {
            return null;
        }
        for (DownloadInfo downloadInfo : allDownloadInfo) {
            if (downloadInfo != null && TextUtils.equals(downloadInfo.getUrl(), str)) {
                return downloadInfo;
            }
        }
        return null;
    }

    public static String a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    hexString = "0".concat(String.valueOf(hexString));
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e2) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_msg", e2.getMessage());
            c.a("ttlive_replay_MD5_fail", 1, hashMap);
            return null;
        }
    }

    public final void a(String str, AbstractC0411a aVar) {
        this.f20181b.put(str, aVar);
    }

    public class b<F, S> {

        /* renamed from: a  reason: collision with root package name */
        public F f20184a;

        /* renamed from: b  reason: collision with root package name */
        public S f20185b;

        static {
            Covode.recordClassIndex(11910);
        }

        public b(F f2, S s) {
            this.f20184a = f2;
            this.f20185b = s;
        }
    }

    public final int a(final String str, String str2, String str3) {
        return Downloader.with(y.e()).url(str).name(str3).savePath(str2).minProgressTimeMsInterval(1000).mainThreadListener(new AbsDownloadListener() {
            /* class com.bytedance.android.livesdk.p.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(11908);
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
            public final void onProgress(DownloadInfo downloadInfo) {
                super.onProgress(downloadInfo);
                if (a.this.f20181b.get(str) != null) {
                    a.this.f20181b.get(str).a(downloadInfo);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
            public final void onPause(DownloadInfo downloadInfo) {
                super.onPause(downloadInfo);
                if (a.this.f20181b.get(str) != null) {
                    a.this.f20181b.get(str).b(downloadInfo);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("download_url", str);
                c.a("ttlive_live_replay_download_status_all", 2, hashMap);
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                b<Long, Long> bVar;
                super.onSuccessed(downloadInfo);
                int id = downloadInfo.getId();
                if (a.this.f20180a.containsKey(Integer.valueOf(id)) && (bVar = a.this.f20180a.get(Integer.valueOf(id))) != null) {
                    bVar.f20184a = (F) Long.valueOf((bVar.f20184a.longValue() + System.currentTimeMillis()) - bVar.f20185b.longValue());
                    bVar.f20185b = (S) Long.valueOf(System.currentTimeMillis());
                    a.this.f20180a.put(Integer.valueOf(id), bVar);
                }
                if (a.this.f20181b.get(str) != null) {
                    a.this.f20181b.get(str).c(downloadInfo);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("download_url", str);
                c.a("ttlive_live_replay_download_status_all", 0, hashMap);
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                int i2;
                String str;
                super.onFailed(downloadInfo, baseException);
                if (a.this.f20181b.get(str) != null) {
                    a.this.f20181b.get(str).d(downloadInfo);
                }
                int id = downloadInfo.getId();
                if (a.this.f20180a.containsKey(Integer.valueOf(id))) {
                    b<Long, Long> bVar = a.this.f20180a.get(Integer.valueOf(id));
                    if (bVar != null) {
                        bVar.f20184a = (F) Long.valueOf((bVar.f20184a.longValue() + System.currentTimeMillis()) - bVar.f20185b.longValue());
                        bVar.f20185b = (S) Long.valueOf(System.currentTimeMillis());
                        a.this.f20180a.put(Integer.valueOf(id), bVar);
                    }
                } else {
                    a.this.f20180a.remove(Integer.valueOf(id));
                }
                HashMap hashMap = new HashMap();
                int i3 = -1;
                if (baseException != null) {
                    i2 = baseException.getErrorCode();
                } else {
                    i2 = -1;
                }
                hashMap.put("error_code", Integer.valueOf(i2));
                String str2 = "";
                if (baseException != null) {
                    str = baseException.getErrorMessage();
                } else {
                    str = str2;
                }
                hashMap.put("error_msg", str);
                c.a("ttlive_live_replay_download_status_all", 1, hashMap);
                c.a("ttlive_live_replay_download_status_error", 1, hashMap);
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_download_replay_failed");
                if (baseException != null) {
                    i3 = baseException.getErrorCode();
                }
                com.bytedance.android.livesdk.ab.b a3 = a2.a("error_code", i3);
                if (baseException != null) {
                    str2 = baseException.getErrorMessage();
                }
                a3.a("error_msg", str2).b();
                hashMap.put("download_url", str);
            }
        }).download();
    }
}
