package com.ss.android.ugc.aweme.port.in;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.google.c.a.l;
import com.ss.android.ugc.aweme.shortvideo.ui.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements l {

    /* renamed from: a  reason: collision with root package name */
    static final l f115636a = new d();

    static {
        Covode.recordClassIndex(74586);
    }

    private d() {
    }

    @Override // com.google.c.a.l
    public final boolean a(Object obj) {
        Activity activity = (Activity) obj;
        return (activity instanceof k) && ((k) activity).bs_();
    }
}
