package com.ss.android.ugc.aweme.ad.feed.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.a.a;
import h.p;
import h.z;
import java.util.List;

public interface d {
    static {
        Covode.recordClassIndex(40458);
    }

    a a(String str);

    void a(int i2, int i3);

    void a(int i2, List<? extends Aweme> list);

    void a(Context context);

    void a(Aweme aweme, int i2, List<? extends Aweme> list);

    void a(Aweme aweme, a<z> aVar);

    void a(Aweme aweme, boolean z);

    p<Integer, Integer> b();

    void c();
}
