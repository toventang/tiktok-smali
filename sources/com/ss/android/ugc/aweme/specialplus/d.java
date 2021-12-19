package com.ss.android.ugc.aweme.specialplus;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.f.b.z;
import java.io.File;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static String f134646a;

    /* renamed from: b  reason: collision with root package name */
    static final String f134647b = (f134646a + File.separator + "special_plus_icon.png");

    /* renamed from: c  reason: collision with root package name */
    static c f134648c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final d f134649d = new d();

    public static final class a extends AbsDownloadListener {
        static {
            Covode.recordClassIndex(87977);
        }

        a() {
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            String str;
            long j2;
            super.onSuccessed(downloadInfo);
            bj.a("SpecialPlus, downloadSpecialPlusIconUrl onSuccess");
            ar arVar = new ar();
            if (downloadInfo == null || (str = downloadInfo.getUrl()) == null) {
                str = "";
            }
            ar a2 = arVar.a("url", str);
            if (downloadInfo != null) {
                j2 = downloadInfo.getDownloadTime();
            } else {
                j2 = -1;
            }
            q.a("special_plus_download", 0, a2.a("duration", Long.valueOf(j2)).a(StringSet.type, "icon").a());
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            long j2;
            super.onFailed(downloadInfo, baseException);
            bj.a("SpecialPlus, downloadSpecialPlusIconUrl onFail");
            ar arVar = new ar();
            if (downloadInfo == null || (str = downloadInfo.getUrl()) == null) {
                str = "";
            }
            ar a2 = arVar.a("url", str);
            if (downloadInfo != null) {
                j2 = downloadInfo.getDownloadTime();
            } else {
                j2 = -1;
            }
            q.a("special_plus_download", 1, a2.a("duration", Long.valueOf(j2)).a(StringSet.type, "icon").a());
        }
    }

    private d() {
    }

    static {
        Covode.recordClassIndex(87976);
        StringBuilder sb = new StringBuilder();
        Application application = c.f115622a;
        l.b(application, "");
        f134646a = sb.append(application.getFilesDir().toString()).append(File.separator).append("superentrance").toString();
    }

    public static final class b implements IFetchEffectListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f134650a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.d f134651b;

        static {
            Covode.recordClassIndex(87978);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
            l.d(effect, "");
            this.f134651b.element = System.currentTimeMillis();
            bj.a("SpecialPlus, downloadSticker onStart");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            String str = "";
            l.d(effect2, str);
            c cVar = d.f134648c;
            cVar.f134645a.storeInt("special_plus_effect_version", this.f134650a);
            d.f134648c.f134645a.storeString("special_plus_effect", c.f115623b.b(effect2));
            bj.a("SpecialPlus, downloadSticker onSuccess");
            ar arVar = new ar();
            String effectId = effect2.getEffectId();
            if (effectId != null) {
                str = effectId;
            }
            q.a("special_plus_download", 0, arVar.a("sticker_id", str).a("duration", Long.valueOf(System.currentTimeMillis() - this.f134651b.element)).a(StringSet.type, "prop").a());
        }

        b(int i2, z.d dVar) {
            this.f134650a = i2;
            this.f134651b = dVar;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            String str;
            l.d(exceptionResult, "");
            bj.a("SpecialPlus, downloadSticker onFail");
            ar arVar = new ar();
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            q.a("special_plus_download", 1, arVar.a("sticker_id", str).a("duration", Long.valueOf(System.currentTimeMillis() - this.f134651b.element)).a(StringSet.type, "prop").a());
        }
    }

    static boolean a(SpecialPlusConfig specialPlusConfig) {
        SpecialPlusTimePeriod[] validTime = specialPlusConfig.getValidTime();
        if (validTime.length == 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        for (SpecialPlusTimePeriod specialPlusTimePeriod : validTime) {
            long j2 = -1;
            try {
                j2 = Long.parseLong(specialPlusTimePeriod.getEnd());
            } catch (NumberFormatException unused) {
            }
            if (currentTimeMillis <= j2) {
                return true;
            }
        }
        return false;
    }
}
