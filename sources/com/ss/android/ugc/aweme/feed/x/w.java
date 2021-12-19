package com.ss.android.ugc.aweme.feed.x;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.List;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f95369a = new w();

    private w() {
    }

    static {
        Covode.recordClassIndex(60393);
    }

    public static final String a(List<? extends Aweme> list) {
        l.d(list, "");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        int i2 = 0;
        while (i2 < list.size() - 1) {
            sb.append(((Aweme) list.get(i2)).getAid());
            sb.append(",");
            i2++;
        }
        sb.append(((Aweme) list.get(i2)).getAid()).append("]");
        return sb.toString();
    }

    public static final boolean a(int i2, List<? extends Aweme> list) {
        int size = list.size();
        for (int i3 = i2 + 1; i3 < size; i3++) {
            if (((Aweme) list.get(i3)).isAd() || ((Aweme) list.get(i3)).isLive()) {
                return true;
            }
        }
        return false;
    }
}
