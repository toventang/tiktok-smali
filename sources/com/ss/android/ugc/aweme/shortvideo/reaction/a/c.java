package com.ss.android.ugc.aweme.shortvideo.reaction.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.e.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f129970a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(85302);
    }

    public static final List<String> a(List<String> list, Aweme aweme) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            String a2 = a.a(aweme, str);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
