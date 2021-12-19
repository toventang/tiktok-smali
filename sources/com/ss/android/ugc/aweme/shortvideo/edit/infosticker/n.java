package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements u {

    /* renamed from: a  reason: collision with root package name */
    private final i f127780a;

    static {
        Covode.recordClassIndex(83758);
    }

    n(i iVar) {
        this.f127780a = iVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        i iVar = this.f127780a;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            iVar.g();
        }
    }
}
