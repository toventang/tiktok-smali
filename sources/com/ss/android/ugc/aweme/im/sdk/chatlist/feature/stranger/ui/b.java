package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui;

import android.text.TextUtils;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.m.a;

final /* synthetic */ class b implements u {

    /* renamed from: a  reason: collision with root package name */
    private final a f102011a;

    static {
        Covode.recordClassIndex(65276);
    }

    b(a aVar) {
        this.f102011a = aVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        a aVar = this.f102011a;
        String str = (String) obj;
        a.c("DmHelper", "BaseStrangerListAdapter rev:".concat(String.valueOf(str)));
        c cVar = new c(aVar);
        if (aVar.f76354l != null) {
            for (int i2 = 0; i2 < aVar.f76354l.size(); i2++) {
                try {
                    if (TextUtils.equals(((com.ss.android.ugc.aweme.im.service.k.a) aVar.f76354l.get(i2)).bF_(), str)) {
                        cVar.accept(Integer.valueOf(i2));
                        return;
                    }
                } catch (Exception e2) {
                    a.a("BaseStrangerListAdapter", e2);
                    return;
                }
            }
        }
    }
}
