package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.c.a.j;
import com.ss.android.ugc.aweme.df.f;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b;
import f.a.v;
import f.a.w;

final /* synthetic */ class ba implements w {

    /* renamed from: a  reason: collision with root package name */
    private final av f124992a;

    /* renamed from: b  reason: collision with root package name */
    private final ShortVideoContext f124993b;

    /* renamed from: c  reason: collision with root package name */
    private final String f124994c;

    static {
        Covode.recordClassIndex(82107);
    }

    ba(av avVar, ShortVideoContext shortVideoContext, String str) {
        this.f124992a = avVar;
        this.f124993b = shortVideoContext;
        this.f124994c = str;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        av avVar = this.f124992a;
        ShortVideoContext shortVideoContext = this.f124993b;
        String str = this.f124994c;
        b.a(shortVideoContext);
        if (avVar.f124971a.i()) {
            f.a("fail to stopRecord before goNext(Normal)");
        }
        vVar.a(j.fromNullable(av.a(shortVideoContext, str)));
        vVar.a();
    }
}
