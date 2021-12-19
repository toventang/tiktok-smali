package com.ss.android.ugc.aweme.tools.beauty.impl.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.service.b;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public b f139043a;

    /* renamed from: b  reason: collision with root package name */
    public ComposerBeauty f139044b;

    static {
        Covode.recordClassIndex(90939);
    }

    public final void a(ComposerBeauty composerBeauty) {
        b bVar = this.f139043a;
        if (bVar != null) {
            bVar.b(this.f139044b);
        }
        this.f139044b = composerBeauty;
    }

    public final void a(String str) {
        l.d(str, "");
        b bVar = this.f139043a;
        if (bVar != null) {
            bVar.a(str);
        }
    }
}
