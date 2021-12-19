package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import androidx.core.g.a;
import com.bytedance.covode.number.Covode;
import dmt.av.video.t;

/* access modifiers changed from: package-private */
public final /* synthetic */ class x implements a {

    /* renamed from: a  reason: collision with root package name */
    private final i f98099a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f98100b;

    static {
        Covode.recordClassIndex(62357);
    }

    x(i iVar, boolean z) {
        this.f98099a = iVar;
        this.f98100b = z;
    }

    @Override // androidx.core.g.a
    public final void a(Object obj) {
        i iVar = this.f98099a;
        boolean z = this.f98100b;
        boolean z2 = !z;
        iVar.f98069d.setVisibility(z2 ? 0 : 4);
        if (z2) {
            iVar.f98069d.b();
        }
        if (z) {
            iVar.f98069d.f98004k = i.O;
            iVar.r.a(true);
        } else {
            iVar.f98069d.f98004k = 0;
            iVar.s.a().setValue(t.b(0));
            iVar.r.a(true);
            iVar.s.a().setValue(t.a());
        }
        iVar.f98071f.getTranslationY();
        iVar.f98073h.getTranslationY();
        iVar.f98073h.getVisibility();
    }
}
