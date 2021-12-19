package com.ss.android.ugc.aweme.photo;

import com.bytedance.covode.number.Covode;
import f.a.v;
import f.a.w;

final /* synthetic */ class l implements w {

    /* renamed from: a  reason: collision with root package name */
    private final PhotoModule f114875a;

    /* renamed from: b  reason: collision with root package name */
    private final int f114876b;

    /* renamed from: c  reason: collision with root package name */
    private final int f114877c;

    static {
        Covode.recordClassIndex(73892);
    }

    l(PhotoModule photoModule, int i2, int i3) {
        this.f114875a = photoModule;
        this.f114876b = i2;
        this.f114877c = i3;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        PhotoModule photoModule = this.f114875a;
        int i2 = this.f114876b;
        int i3 = this.f114877c;
        String a2 = photoModule.f114829c.a();
        photoModule.f114827a.a(a2, i2, i3, new p(vVar, a2));
    }
}
