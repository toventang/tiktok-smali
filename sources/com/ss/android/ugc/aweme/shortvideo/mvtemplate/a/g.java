package com.ss.android.ugc.aweme.shortvideo.mvtemplate.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.r;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements r {

    /* renamed from: a  reason: collision with root package name */
    private final c f128804a;

    static {
        Covode.recordClassIndex(84502);
    }

    g(c cVar) {
        this.f128804a = cVar;
    }

    @Override // com.ss.android.vesdk.r
    public final void onCallback(int i2, int i3, float f2, String str) {
        c cVar = this.f128804a;
        if (i2 != 4101) {
            return;
        }
        if (cVar.f128781c.size() >= cVar.f128782d) {
            cVar.f128788j.sendEmptyMessage(1003);
        } else {
            cVar.f128786h.sendEmptyMessage(1001);
        }
    }
}
