package com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.hometab;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.ar;
import com.ss.android.ugc.aweme.language.d;
import com.zhiliaoapp.musically.R;

public final class a {
    static {
        Covode.recordClassIndex(63514);
    }

    public static ar a(Context context) {
        String string;
        if (!d.i() || !b.a().a(true, "for_you_new_translations", false)) {
            string = context.getResources().getString(R.string.d1n);
        } else {
            string = context.getResources().getString(R.string.cb4);
        }
        return new ar(context, "HOME", string, R.id.ck3, 0, true, 0, 0);
    }
}
