package com.ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.google.c.a.j;
import com.ss.android.ugc.aweme.df.f;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b;
import f.a.v;
import f.a.w;

final /* synthetic */ class o implements w {

    /* renamed from: a  reason: collision with root package name */
    private final j f121920a;

    /* renamed from: b  reason: collision with root package name */
    private final ShortVideoContext f121921b;

    /* renamed from: c  reason: collision with root package name */
    private final String f121922c;

    static {
        Covode.recordClassIndex(79935);
    }

    o(j jVar, ShortVideoContext shortVideoContext, String str) {
        this.f121920a = jVar;
        this.f121921b = shortVideoContext;
        this.f121922c = str;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        j jVar = this.f121920a;
        ShortVideoContext shortVideoContext = this.f121921b;
        String str = this.f121922c;
        b.a(shortVideoContext);
        if (jVar.f121902a.i()) {
            f.a("fail to stopRecord before goNext(Normal)");
        }
        vVar.a(j.fromNullable(j.a(shortVideoContext, str)));
        vVar.a();
    }
}
