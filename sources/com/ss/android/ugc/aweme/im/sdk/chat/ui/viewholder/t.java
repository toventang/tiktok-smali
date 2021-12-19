package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import com.bytedance.covode.number.Covode;
import h.f.a.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements b {

    /* renamed from: a  reason: collision with root package name */
    private final s f101465a;

    static {
        Covode.recordClassIndex(64883);
    }

    t(s sVar) {
        this.f101465a = sVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        s sVar = this.f101465a;
        Boolean bool = (Boolean) obj;
        if (sVar.x == null) {
            return null;
        }
        if (!bool.booleanValue()) {
            sVar.x.clearAnimation();
            sVar.x.setVisibility(8);
            return null;
        } else if (sVar.x.getVisibility() == 0) {
            return null;
        } else {
            sVar.x.setVisibility(0);
            sVar.x.startAnimation(sVar.A);
            return null;
        }
    }
}
