package com.ss.android.ugc.aweme.services.external;

import android.content.Context;
import android.graphics.Typeface;
import com.bytedance.covode.number.Covode;

public interface IAVTypeFaceService {
    static {
        Covode.recordClassIndex(79625);
    }

    Typeface getTypefaceByFontName(String str);

    void prefetch(Context context);
}
