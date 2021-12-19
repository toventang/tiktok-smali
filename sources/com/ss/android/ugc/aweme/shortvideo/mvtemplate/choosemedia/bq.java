package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.u;
import java.util.List;

public final class bq {

    /* renamed from: a  reason: collision with root package name */
    public static final bq f129077a = new bq();

    private bq() {
    }

    static {
        Covode.recordClassIndex(84716);
    }

    public static u<Boolean, Integer, Long> a(Context context, List<? extends MediaModel> list, long j2, long j3) {
        l.d(context, "");
        l.d(list, "");
        int size = list.size();
        long j4 = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (((long) ((int) ((MediaModel) list.get(i3)).f109396h)) <= j2) {
                if (context instanceof Activity) {
                    new b((Activity) context).a(context.getString(R.string.h6v, Long.valueOf(j2 / 1000))).b();
                }
                bt.a(1, 0);
                return new u<>(false, -1, -1L);
            }
            j4 += (long) ((int) ((MediaModel) list.get(i3)).f109396h);
            if (((MediaModel) list.get(i3)).f109395g == 4) {
                i2++;
            }
        }
        if (j4 <= j2) {
            if (context instanceof Activity) {
                new b((Activity) context).a(context.getString(R.string.h6v, Long.valueOf(j2 / 1000))).b();
            }
            bt.a(1, 0);
            return new u<>(false, -1, -1L);
        } else if (1 > j3 || j4 <= j3) {
            return new u<>(true, Integer.valueOf(i2), Long.valueOf(j4));
        } else {
            if (context instanceof Activity) {
                new b((Activity) context).e(R.string.d6e).b();
            }
            bt.a(2, 0);
            return new u<>(false, -1, -1L);
        }
    }
}
