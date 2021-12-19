package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements u {

    /* renamed from: a  reason: collision with root package name */
    private final i f98087a;

    static {
        Covode.recordClassIndex(62347);
    }

    n(i iVar) {
        this.f98087a = iVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        i iVar = this.f98087a;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            iVar.f();
        }
    }
}
