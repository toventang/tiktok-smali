package com.ss.android.ugc.aweme.sticker.types.game;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements u {

    /* renamed from: a  reason: collision with root package name */
    private final b f136101a;

    /* renamed from: b  reason: collision with root package name */
    private final o f136102b;

    static {
        Covode.recordClassIndex(88902);
    }

    e(b bVar, o oVar) {
        this.f136101a = bVar;
        this.f136102b = oVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        b bVar = this.f136101a;
        o oVar = this.f136102b;
        if (!c.e(bVar.f136085b)) {
            oVar.b();
        }
    }
}
