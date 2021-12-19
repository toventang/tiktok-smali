package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.a.n;
import java.util.ArrayList;
import java.util.List;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Aweme> f91808a = new ArrayList<>();

    static {
        Covode.recordClassIndex(57789);
    }

    private static List<Aweme> b(List<? extends Aweme> list) {
        if (list != null) {
            return n.g((Iterable) list);
        }
        return null;
    }

    public final void a(List<? extends Aweme> list) {
        this.f91808a.clear();
        j.a(this.f91808a, b(list));
    }

    public final Aweme a(int i2) {
        if (i2 < 0 || i2 >= this.f91808a.size()) {
            return null;
        }
        return this.f91808a.get(i2);
    }
}
