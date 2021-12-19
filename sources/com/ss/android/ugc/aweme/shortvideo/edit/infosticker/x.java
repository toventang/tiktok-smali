package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import androidx.core.g.a;
import com.bytedance.covode.number.Covode;
import dmt.av.video.t;

/* access modifiers changed from: package-private */
public final /* synthetic */ class x implements a {

    /* renamed from: a  reason: collision with root package name */
    private final i f127792a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f127793b;

    static {
        Covode.recordClassIndex(83768);
    }

    x(i iVar, boolean z) {
        this.f127792a = iVar;
        this.f127793b = z;
    }

    @Override // androidx.core.g.a
    public final void a(Object obj) {
        i iVar = this.f127792a;
        boolean z = this.f127793b;
        boolean z2 = !z;
        iVar.f127155d.setVisibility(z2 ? 0 : 4);
        if (z2) {
            iVar.f127155d.c();
        }
        if (z) {
            iVar.f127155d.f127078l = InfoStickerEditView.f127066m;
            iVar.s.a(true);
            return;
        }
        iVar.f127155d.f127078l = 0;
        iVar.t.a().setValue(t.b(0));
        iVar.s.a(true);
        iVar.t.a().setValue(t.a());
    }
}
