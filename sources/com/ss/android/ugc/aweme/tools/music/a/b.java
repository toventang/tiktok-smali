package com.ss.android.ugc.aweme.tools.music.a;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f140308a = d.a(AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getApplicationService().c(), "ai_music", 0);

    public static long a() {
        return f140308a.getLong("ai_music_time", 0);
    }

    public static String b() {
        return f140308a.getString("ai_music_url", "");
    }

    static {
        Covode.recordClassIndex(91669);
    }
}
