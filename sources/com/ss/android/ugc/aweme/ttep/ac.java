package com.ss.android.ugc.aweme.ttep;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ac {
    static {
        Covode.recordClassIndex(92246);
    }

    public static final boolean a(Intent intent) {
        l.d(intent, "");
        return intent.getBooleanExtra("extra_ttep_enter_preview_page", false);
    }
}
