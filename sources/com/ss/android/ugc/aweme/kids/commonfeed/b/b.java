package com.ss.android.ugc.aweme.kids.commonfeed.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<Aweme> f105997a = new ArrayList<>();

    static {
        Covode.recordClassIndex(67811);
    }

    public final Aweme a(int i2) {
        if (i2 < 0 || i2 >= this.f105997a.size()) {
            return null;
        }
        return this.f105997a.get(i2);
    }
}
