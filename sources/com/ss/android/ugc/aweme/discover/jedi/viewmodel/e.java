package com.ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.o;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import h.f.b.l;

public final class e extends o {

    /* renamed from: c  reason: collision with root package name */
    public final String f81385c;

    /* renamed from: d  reason: collision with root package name */
    public final SearchApiResult f81386d;

    static {
        Covode.recordClassIndex(50585);
    }

    public /* synthetic */ e() {
        this("", true, 0, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(String str, boolean z, int i2, SearchApiResult searchApiResult) {
        super(z, i2);
        l.d(str, "");
        this.f81385c = str;
        this.f81386d = searchApiResult;
    }
}
