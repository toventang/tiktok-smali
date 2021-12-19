package com.google.android.play.core.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bk;
import java.io.File;

public final class i implements bk<File> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<Context> f53325a;

    static {
        Covode.recordClassIndex(32937);
    }

    public i(bk<Context> bkVar) {
        this.f53325a = bkVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ File a() {
        return au.a(((av) this.f53325a).a());
    }
}
