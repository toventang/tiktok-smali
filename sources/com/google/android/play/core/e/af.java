package com.google.android.play.core.e;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bi;
import com.google.android.play.core.b.bk;
import com.google.android.play.core.e.b.a;
import java.io.File;

public final class af implements bk<ae> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<as> f53228a;

    /* renamed from: b  reason: collision with root package name */
    private final bk<a> f53229b;

    /* renamed from: c  reason: collision with root package name */
    private final bk<File> f53230c;

    static {
        Covode.recordClassIndex(32900);
    }

    public af(bk<as> bkVar, bk<a> bkVar2, bk<File> bkVar3) {
        this.f53228a = bkVar;
        this.f53229b = bkVar2;
        this.f53230c = bkVar3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ ae a() {
        return new ae(bi.b(this.f53228a), bi.b(this.f53229b), bi.b(this.f53230c));
    }
}
