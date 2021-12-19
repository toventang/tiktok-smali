package com.ss.android.ugc.aweme.search;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f121118a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(78892);
    }

    public static Keva a(String str) {
        l.d(str, "");
        Keva repo = Keva.getRepo(str);
        l.b(repo, "");
        return repo;
    }
}
