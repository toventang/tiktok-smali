package com.ss.android.ugc.aweme.video.preload.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.io.File;

public interface i {
    static {
        Covode.recordClassIndex(93970);
    }

    File a(Context context, a aVar);

    boolean a();

    public enum a {
        PREFER_SD_CARD,
        PREFER_EXTERNAL,
        PREFER_PRIVATE;

        static {
            Covode.recordClassIndex(93971);
        }
    }
}
