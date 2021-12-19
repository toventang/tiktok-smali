package com.google.android.play.core.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bk;

public final class t implements bk<s> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<Context> f52732a;

    /* renamed from: b  reason: collision with root package name */
    private final bk<u> f52733b;

    static {
        Covode.recordClassIndex(32654);
    }

    public t(bk<Context> bkVar, bk<u> bkVar2) {
        this.f52732a = bkVar;
        this.f52733b = bkVar2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ s a() {
        return new s(((l) this.f52732a).a(), this.f52733b.a());
    }
}
