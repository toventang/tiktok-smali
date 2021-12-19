package com.ss.android.ugc.aweme.awemeservice;

import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.dsp.service.MusicDspServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.b;

public class AwemeService implements IAwemeService {
    static {
        Covode.recordClassIndex(41627);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void a() {
        i.b(new c(b.a()), i.f4824a);
    }

    public static IAwemeService b() {
        MethodCollector.i(11978);
        Object a2 = b.a(IAwemeService.class, false);
        if (a2 != null) {
            IAwemeService iAwemeService = (IAwemeService) a2;
            MethodCollector.o(11978);
            return iAwemeService;
        }
        if (b.R == null) {
            synchronized (IAwemeService.class) {
                try {
                    if (b.R == null) {
                        b.R = new AwemeService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11978);
                    throw th;
                }
            }
        }
        AwemeService awemeService = (AwemeService) b.R;
        MethodCollector.o(11978);
        return awemeService;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme b(String str) {
        return b.a().a(str);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme d(String str) {
        return a.a().a(str);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme a(Aweme aweme) {
        b a2 = b.a();
        if (aweme == null || TextUtils.isEmpty(aweme.getAid()) || aweme.getUserStory() != null) {
            return aweme;
        }
        if (b.a(aweme) || b.b(aweme) || b.c(aweme)) {
            return a.a().a(aweme);
        }
        return b.a(aweme, a2.f67649a);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void c(String str) {
        b a2 = b.a();
        AwemeStatistics b2 = a.a().b(str);
        if (b2 != null) {
            b2.setCommentCount(b2.getCommentCount() + 1);
        }
        Aweme b3 = a2.b(str);
        AwemeStatistics d2 = b.d(b3);
        if (d2 != null) {
            d2.setCommentCount(d2.getCommentCount() + 1);
            a2.f67649a.a(b3.getAid(), b3);
        }
        MusicDspServiceImpl.g().a(str);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme e(String str) {
        for (Aweme aweme : a.a().f67619b.values()) {
            if (TextUtils.equals(aweme.getAwemeRawAdIdStr(), str)) {
                return aweme;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme a(String str) {
        b a2 = b.a();
        String str2 = str + "type0";
        String str3 = str + "type1";
        if (a2.f67649a.b(str2)) {
            return a2.f67649a.a(str2);
        }
        if (a2.f67649a.b(str3)) {
            return a2.f67649a.a(str3);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void a(long j2) {
        for (Aweme aweme : b.a().f67649a.a()) {
            aweme.setFeedCount(j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme a(String str, int i2) {
        return b.a().a(str, i2);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void c(Aweme aweme, int i2) {
        VideoControl videoControl;
        b.a();
        if (aweme != null && (videoControl = aweme.getVideoControl()) != null) {
            videoControl.preventDownloadType = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void b(Aweme aweme, int i2) {
        b.a();
        if (aweme != null) {
            aweme.setCommentSetting(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme a(Aweme aweme, int i2) {
        b a2 = b.a();
        if (aweme == null || TextUtils.isEmpty(aweme.getAid())) {
            return aweme;
        }
        if (b.a(aweme) || b.b(aweme) || b.c(aweme)) {
            return a.a().a(aweme);
        }
        String str = aweme.getAid() + StringSet.type + i2;
        if (a2.f67649a.b(str)) {
            Aweme a3 = a2.f67649a.a(str);
            if (a3 != null) {
                a3.update(aweme);
                return a3;
            }
            a2.f67649a.a(str, aweme);
        } else {
            a2.f67649a.a(str, aweme);
        }
        return aweme;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void b(String str, int i2) {
        Aweme a2;
        b a3 = b.a();
        if (!TextUtils.isEmpty(str)) {
            a a4 = a.a();
            if (!TextUtils.isEmpty(str) && (a2 = a4.a(str)) != null) {
                a2.setUserDigg(i2);
                if (i2 == 0) {
                    AwemeStatistics b2 = a4.b(str);
                    if (b2 != null) {
                        b2.setDiggCount(b2.getDiggCount() - 1);
                    }
                } else {
                    AwemeStatistics b3 = a4.b(str);
                    if (b3 != null) {
                        b3.setDiggCount(b3.getDiggCount() + 1);
                    }
                }
            }
            Aweme b4 = a3.b(str);
            if (b4 == null) {
                Aweme a5 = a3.a(str, 0);
                if (a5 != null) {
                    a3.a(a5, i2);
                }
                Aweme a6 = a3.a(str, 1);
                if (a6 != null) {
                    a3.a(a6, i2);
                    return;
                }
                return;
            }
            a3.a(b4, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void c(String str, int i2) {
        b a2 = b.a();
        Aweme a3 = a2.a(str);
        if (a3 != null) {
            a3.setCollectStatus(i2);
            a2.f67649a.a(a3.getAid(), a3);
        }
        if (i2 == 1) {
            MainServiceImpl.createIMainServicebyMonsterPlugin(false).trackAppsFlyerEvent("collect_video", str);
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void a(String str, long j2) {
        b a2 = b.a();
        AwemeStatistics b2 = a.a().b(str);
        if (b2 != null) {
            b2.setCommentCount(j2);
        }
        Aweme b3 = a2.b(str);
        AwemeStatistics d2 = b.d(b3);
        if (d2 != null) {
            d2.setCommentCount(j2);
            a2.f67649a.a(b3.getAid(), b3);
        }
        MusicDspServiceImpl.g().a(str, j2);
    }
}
