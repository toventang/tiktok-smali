package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bt;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(84581);
    }

    public static final boolean a(MediaModel mediaModel, Context context) {
        l.d(mediaModel, "");
        l.d(context, "");
        double d2 = (double) mediaModel.f109400l;
        double d3 = (double) mediaModel.f109401m;
        Double.isNaN(d3);
        if (d2 <= d3 * 2.4d) {
            double d4 = (double) mediaModel.f109401m;
            double d5 = (double) mediaModel.f109400l;
            Double.isNaN(d5);
            if (d4 <= d5 * 2.4d) {
                return true;
            }
        }
        bt.a(0, 1);
        new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.ftk).a();
        q.a("aweme_movie_import_error_rate", 1, new ar().a("errorCode", (Integer) -9).a("errorMsg", "").a());
        return false;
    }
}
