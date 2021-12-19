package com.ss.android.ugc.aweme.photo;

import com.bytedance.covode.number.Covode;
import f.a.d.g;
import f.a.t;

final /* synthetic */ class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private final PhotoModule f114868a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f114869b;

    /* renamed from: c  reason: collision with root package name */
    private final int f114870c;

    /* renamed from: d  reason: collision with root package name */
    private final int f114871d;

    static {
        Covode.recordClassIndex(73889);
    }

    i(PhotoModule photoModule, boolean z, int i2, int i3) {
        this.f114868a = photoModule;
        this.f114869b = z;
        this.f114870c = i2;
        this.f114871d = i3;
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        PhotoModule photoModule = this.f114868a;
        boolean z = this.f114869b;
        int i2 = this.f114870c;
        int i3 = this.f114871d;
        String str = (String) obj;
        if (z) {
            return t.a(new m(photoModule, i2, i3)).d(new q(photoModule, str));
        }
        return t.c(new r(str));
    }
}
