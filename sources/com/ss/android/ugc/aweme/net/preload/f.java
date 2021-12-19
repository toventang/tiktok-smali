package com.ss.android.ugc.aweme.net.preload;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.b.i;
import com.bytedance.ttnet.d.d;
import h.f.b.l;

public final class f extends d {
    public boolean v;
    public String w;
    public final i x;

    static {
        Covode.recordClassIndex(72310);
    }

    private /* synthetic */ f() {
        this(new i(0, null, false, 7));
    }

    public final String toString() {
        StringBuilder append = new StringBuilder("enable:").append(this.v).append("|strategy:[age:").append(this.x.f34498a).append("]|url:");
        String str = this.x.f34500c;
        if (str == null) {
            str = this.w;
        }
        return append.append(str).append('|').toString();
    }

    public final void a(String str) {
        l.d(str, "");
        this.w = str;
    }

    public f(i iVar) {
        l.d(iVar, "");
        this.x = iVar;
        this.v = true;
        this.w = "";
    }
}
