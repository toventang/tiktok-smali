package com.ss.android.ugc.aweme.app;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class u {
    static {
        Covode.recordClassIndex(41201);
    }

    public enum a {
        PRIVATE,
        AUDITING,
        SDCARD,
        AWEME,
        NETWORK,
        DOWNLOAD_URL,
        SUFFIX_LOGO_DOWNLOAD_URL,
        PLAY_URL,
        PREVENT_DOWNLOAD,
        UI_ALIKE_WATERMARK_DOWNLOAD_URL,
        SUFFIX_SCREEN_DOWNLOAD_URL;

        static {
            Covode.recordClassIndex(41202);
        }
    }

    public static void a(String str, String str2) {
        com.ss.android.ugc.aweme.app.f.a.a("aweme_movie_download_error_message", "download", str, str2);
    }

    public static final void a(a aVar, Aweme aweme) {
        StringBuilder sb = new StringBuilder("ForbidDownload:");
        sb.append("ForbidType:").append(aVar);
        if (aweme != null) {
            sb.append(",");
            sb.append("aweme_id").append(aweme.getAid());
        }
        a(sb.toString(), "");
    }
}
