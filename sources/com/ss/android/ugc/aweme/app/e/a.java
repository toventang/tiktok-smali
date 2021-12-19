package com.ss.android.ugc.aweme.app.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.share.ah;
import h.f.b.l;
import h.m.p;
import okhttp3.HttpUrl;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66690a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(41059);
    }

    public static final String a(Aweme aweme, String str) {
        if (!(aweme == null || aweme.getVideo() == null)) {
            Video video = aweme.getVideo();
            l.b(video, "");
            if (video.isNeedSetCookie() && str != null && !TextUtils.isEmpty(str)) {
                Video video2 = aweme.getVideo();
                l.b(video2, "");
                if (!video2.isNeedSetCookie() || !p.b(str, "http://", false)) {
                    HttpUrl parse = HttpUrl.parse(str);
                    if (parse != null && parse.queryParameter("ss_is_p_v_ss") == null) {
                        HttpUrl.Builder newBuilder = parse.newBuilder();
                        newBuilder.setQueryParameter("ss_is_p_v_ss", "1");
                        return newBuilder.toString();
                    }
                } else {
                    ah.f123353b.a(str);
                    return str;
                }
            }
        }
        return str;
    }
}
