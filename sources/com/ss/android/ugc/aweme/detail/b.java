package com.ss.android.ugc.aweme.detail;

import androidx.lifecycle.u;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements u {

    /* renamed from: a  reason: collision with root package name */
    private final a f79612a;

    static {
        Covode.recordClassIndex(49455);
    }

    b(a aVar) {
        this.f79612a = aVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        a aVar = this.f79612a;
        if (((Boolean) obj).booleanValue() && aVar.y != null) {
            aVar.y.setMaxScrollHeight(Integer.MAX_VALUE);
            aVar.y.scrollTo(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        }
    }
}
