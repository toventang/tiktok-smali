package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.cr;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import h.f.b.l;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    private final ShortVideoContext f132194a;

    static {
        Covode.recordClassIndex(86568);
    }

    public final boolean a() {
        if (!b() || this.f132194a.n == null) {
            return true;
        }
        return false;
    }

    private final boolean b() {
        if (!this.f132194a.c() && cr.a() && !this.f132194a.f124757b.b() && !this.f132194a.f124757b.c()) {
            return true;
        }
        return false;
    }

    public aa(ShortVideoContext shortVideoContext) {
        l.d(shortVideoContext, "");
        this.f132194a = shortVideoContext;
    }
}
