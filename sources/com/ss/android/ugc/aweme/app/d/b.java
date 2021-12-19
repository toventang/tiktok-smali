package com.ss.android.ugc.aweme.app.d;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.librarian.LibrarianUnsatisfiedLinkError;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.common.g.a;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.utils.bq;
import com.ss.android.ugc.playerkit.model.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class b implements AttachUserData {

    /* renamed from: a  reason: collision with root package name */
    Map<String, String> f66686a;

    /* renamed from: b  reason: collision with root package name */
    private AttachUserData f66687b;

    static {
        Covode.recordClassIndex(41055);
    }

    private static Map<String, String> a(Map<String, String> map) {
        if (map != null && !map.containsKey("curUserId") && com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            map.put("curUserId", com.ss.android.ugc.aweme.account.b.g().getCurUserId());
            if (com.ss.android.ugc.aweme.account.b.g().getCurUser() != null) {
                map.put("shortId", com.ss.android.ugc.aweme.account.b.g().getCurUser().getShortId());
                map.put("nickname", com.ss.android.ugc.aweme.account.b.g().getCurUser().getNickname());
            }
        }
        return map;
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        bq.g d2;
        if ((crashType == CrashType.JAVA || crashType == CrashType.LAUNCH || crashType == CrashType.NATIVE) && (d2 = bq.d()) != null) {
            this.f66686a.put("vmPeak", String.valueOf(d2.f142711a));
            this.f66686a.put("vmSize", String.valueOf(d2.f142712b));
            this.f66686a.put("fdCount", String.valueOf(d2.f142714d));
            this.f66686a.put("maxFdCount", String.valueOf(d2.f142713c));
            this.f66686a.put("threadCount", String.valueOf(d2.f142715e));
        }
        this.f66686a.put("root", String.valueOf(bq.e()));
        this.f66686a.put("librarian", Arrays.toString(LibrarianUnsatisfiedLinkError.a()));
        this.f66686a.put("class_loader", getClass().getClassLoader().toString());
        return a(this.f66686a);
    }

    public b(Context context, AttachUserData attachUserData) {
        String str;
        this.f66687b = attachUserData;
        IAVSettingsService avsettingsConfig = AVExternalServiceImpl.a().configService().avsettingsConfig();
        HashMap hashMap = new HashMap();
        this.f66686a = hashMap;
        hashMap.put("git_sha", d.p);
        this.f66686a.put("git_branch", d.o);
        this.f66686a.put("abi", System.getProperty("os.arch"));
        this.f66686a.put("veSdk", avsettingsConfig.getVESDKVersion());
        this.f66686a.put("effectSdk", avsettingsConfig.getEffectVersion());
        this.f66686a.put("player_type", String.valueOf(c.f148702a.getPlayerType()));
        this.f66686a.put("preloader_type", String.valueOf(c.f148702a.getPreloadType()));
        this.f66686a.put("ttplayer_version", "210626190");
        this.f66686a.put("release_build", com.ss.android.deviceregister.a.d.f59410f);
        this.f66686a.put("real_machine", String.valueOf(a.a()));
        com.ss.android.ugc.aweme.app.services.c a2 = com.ss.android.ugc.aweme.app.services.c.a(context);
        String str2 = "";
        if (TextUtils.isEmpty("JENKINS_BUILD_RESULT") || a2.f66887a == null) {
            str = null;
        } else {
            str = a2.f66887a.optString("JENKINS_BUILD_RESULT", str2);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f66686a.put("jenkins_build_result", str);
        }
        AVExternalServiceImpl.a().provideErrorReporter().addCrashEffectIdInfoListener(new c(this));
        this.f66686a.put("device_info", Build.MANUFACTURER + "&&" + Build.BRAND + "&&" + Build.MODEL + "&&" + Build.FINGERPRINT);
        Map<? extends String, ? extends String> userData = this.f66687b.getUserData(CrashType.ALL);
        if (userData != null) {
            this.f66686a.putAll(userData);
        }
        if (f.a(context)) {
            com.ss.android.ugc.aweme.live.d o = LiveOuterService.s().o();
            this.f66686a.put("liveCoreSdk", o != null ? o.a() : str2);
            a(this.f66686a);
        }
    }
}
