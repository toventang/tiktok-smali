package com.ss.android.ugc.aweme.sticker.m;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.util.b;

public final class d implements j {

    /* renamed from: a  reason: collision with root package name */
    private boolean f134962a;

    static {
        Covode.recordClassIndex(88230);
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.j
    public final void a(String str, String str2) {
        b.a.f132249a.start(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.j
    public final void b(String str, String str2) {
        b.a.f132249a.step(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.j
    public final void c(String str, String str2) {
        boolean z;
        if (!this.f134962a) {
            b.a.f132249a.step(str, str2);
            z = true;
        } else {
            b.a.f132249a.end(str, str2);
            z = false;
        }
        this.f134962a = z;
    }
}
