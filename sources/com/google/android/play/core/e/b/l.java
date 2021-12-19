package com.google.android.play.core.e.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bk;
import com.google.android.play.core.e.al;
import com.google.android.play.core.e.av;
import java.io.File;

public final class l implements bk<a> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<Context> f53309a;

    /* renamed from: b  reason: collision with root package name */
    private final bk<File> f53310b;

    /* renamed from: c  reason: collision with root package name */
    private final bk<al> f53311c;

    static {
        Covode.recordClassIndex(32929);
    }

    public l(bk<Context> bkVar, bk<File> bkVar2, bk<al> bkVar3) {
        this.f53309a = bkVar;
        this.f53310b = bkVar2;
        this.f53311c = bkVar3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ a a() {
        return new a(((av) this.f53309a).a(), this.f53310b.a(), this.f53311c.a());
    }
}
