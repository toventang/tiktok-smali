package com.ss.android.ugc.aweme.awemeservice;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.awemeservice.a.a;
import com.ss.android.ugc.aweme.awemeservice.a.c;
import com.ss.android.ugc.aweme.awemeservice.a.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.services.MainServiceImpl;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static b f67648b;

    /* renamed from: a  reason: collision with root package name */
    com.ss.android.ugc.aweme.awemeservice.a.b<String> f67649a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f67650c = MainServiceImpl.createIMainServicebyMonsterPlugin(false).isUseJediAwemelistFragment();

    /* renamed from: d  reason: collision with root package name */
    private boolean f67651d;

    static {
        Covode.recordClassIndex(41651);
    }

    public static b a() {
        if (f67648b == null) {
            f67648b = new b();
        }
        return f67648b;
    }

    private b() {
        com.ss.android.ugc.aweme.awemeservice.a.b<String> cVar;
        boolean isReplaceAwemeCache = MainServiceImpl.createIMainServicebyMonsterPlugin(false).isReplaceAwemeCache();
        this.f67651d = isReplaceAwemeCache;
        if (this.f67650c) {
            cVar = a.f67621b;
        } else if (isReplaceAwemeCache) {
            cVar = new g();
        } else {
            cVar = new c();
        }
        this.f67649a = cVar;
    }

    static boolean b(Aweme aweme) {
        if (aweme == null || aweme.getActivityPendant() == null) {
            return false;
        }
        return true;
    }

    static boolean c(Aweme aweme) {
        if (aweme == null || aweme.getLiveAwesomeSplashInfo() == null) {
            return false;
        }
        return true;
    }

    static boolean a(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        return aweme.isAd();
    }

    static AwemeStatistics d(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            return statistics;
        }
        AwemeStatistics awemeStatistics = new AwemeStatistics();
        aweme.setStatistics(awemeStatistics);
        return awemeStatistics;
    }

    /* access modifiers changed from: package-private */
    public final Aweme b(String str) {
        if (this.f67649a.b(str)) {
            return this.f67649a.a(str);
        }
        return null;
    }

    public final Aweme a(String str) {
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return null;
        }
        if (this.f67649a.b(str)) {
            return this.f67649a.a(str);
        }
        return a.a().a(str);
    }

    public static Aweme a(Aweme aweme, com.ss.android.ugc.aweme.awemeservice.a.b<String> bVar) {
        Aweme a2;
        if (aweme != null && !TextUtils.isEmpty(aweme.getAid()) && bVar != null && !aweme.isProhibited() && !aweme.isSelfSee()) {
            if (bVar.b(aweme.getAid()) && (a2 = bVar.a(aweme.getAid())) != null) {
                a2.update(aweme);
                aweme.getDesc();
                aweme.getDistance();
                aweme = a2;
            }
            bVar.a(aweme.getAid(), aweme);
        }
        return aweme;
    }

    public final Aweme a(String str, int i2) {
        String str2 = str + StringSet.type + i2;
        if (this.f67649a.b(str2)) {
            return this.f67649a.a(str2);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void a(Aweme aweme, int i2) {
        aweme.setUserDigg(i2);
        AwemeStatistics statistics = aweme.getStatistics();
        if (i2 != 0) {
            if (statistics != null) {
                statistics.setDiggCount(statistics.getDiggCount() + 1);
            }
            MainServiceImpl.createIMainServicebyMonsterPlugin(false).trackAppsFlyerEvent("mus_af_like_video_1", aweme.getAid());
            MainServiceImpl.createIMainServicebyMonsterPlugin(false).trackAppsFlyerEvent("mus_af_like_video_5", null);
        } else if (statistics != null) {
            statistics.setDiggCount(statistics.getDiggCount() - 1);
        }
        this.f67649a.a(aweme.getAid(), aweme);
    }
}
