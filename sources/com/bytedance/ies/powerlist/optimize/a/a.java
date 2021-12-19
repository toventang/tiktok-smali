package com.bytedance.ies.powerlist.optimize.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<Class<? extends PowerCell>, Integer> f34303a;

    static {
        Covode.recordClassIndex(20497);
    }

    public a() {
        HashMap<Class<? extends PowerCell>, Integer> hashMap = new HashMap<>();
        this.f34303a = hashMap;
        hashMap.put(MixFeedCell.class, Integer.valueOf((int) R.layout.al0));
    }

    public final Integer a(Class<? extends PowerCell> cls) {
        if (this.f34303a.get(cls) != null) {
            return this.f34303a.get(cls);
        }
        return 0;
    }
}
