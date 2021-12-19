package com.ss.android.ugc.aweme.choosemusic.view;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements u {

    /* renamed from: a  reason: collision with root package name */
    private final c f70828a;

    static {
        Covode.recordClassIndex(43640);
    }

    d(c cVar) {
        this.f70828a = cVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        c cVar = this.f70828a;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            KeyboardUtils.c(cVar.f70819j);
        }
    }
}
