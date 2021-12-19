package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;

public final class aa {
    static {
        Covode.recordClassIndex(84582);
    }

    public static final void a(Context context, int i2, int i3) {
        Resources resources;
        String string;
        switch (i2) {
            case -8:
                new a(context).a(R.string.h6h).a();
                return;
            case -7:
                new a(context).a(R.string.h6i).a();
                return;
            case -6:
                new a(context).a(R.string.d6e).a();
                return;
            case -5:
                new a(context).a(R.string.h6j).a();
                return;
            case -4:
                new a(context).a(R.string.cd4).a();
                return;
            case -3:
                new a(context).a(R.string.h6s).a();
                return;
            case -2:
                new a(context).a(R.string.h6r).a();
                return;
            case -1:
                if (i3 == -1) {
                    new a(context).a(R.string.h6q).a();
                    return;
                } else if (context != null && (resources = context.getResources()) != null && (string = resources.getString(R.string.h6v, Integer.valueOf(i3 / 1000))) != null) {
                    new a(context).a(string).a();
                    return;
                } else {
                    return;
                }
            default:
                new a(context).a(R.string.h6t).a();
                return;
        }
    }
}
