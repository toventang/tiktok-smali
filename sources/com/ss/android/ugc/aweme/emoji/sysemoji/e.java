package com.ss.android.ugc.aweme.emoji.sysemoji;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.services.RetrofitService;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ImSysEmojiApi f89381a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f89382b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f89383c;

    static {
        Covode.recordClassIndex(56160);
        String str = "https://" + d.f34604k.f34586a;
        f89382b = str;
        String str2 = str + "/aweme/v1/";
        f89383c = str2;
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);
        if (createIRetrofitServicebyMonsterPlugin != null) {
            f89381a = (ImSysEmojiApi) createIRetrofitServicebyMonsterPlugin.createNewRetrofit(str2).create(ImSysEmojiApi.class);
        }
    }
}
