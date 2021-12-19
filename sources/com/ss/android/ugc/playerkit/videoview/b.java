package com.ss.android.ugc.playerkit.videoview;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.playerkit.model.m;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f148915a = true;

    static {
        Covode.recordClassIndex(98056);
    }

    public static boolean a(Video video, m.e eVar) {
        if (!f148915a || !com.ss.android.ugc.playerkit.b.a(e.a(video.getPlayAddrBytevc1())) || !com.ss.android.ugc.playerkit.b.a(eVar)) {
            return false;
        }
        return true;
    }
}
