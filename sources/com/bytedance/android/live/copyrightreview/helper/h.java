package com.bytedance.android.live.copyrightreview.helper;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.model.message.ba;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final CopyrightViolationHelper f8854a;

    static {
        Covode.recordClassIndex(4528);
    }

    h(CopyrightViolationHelper copyrightViolationHelper) {
        this.f8854a = copyrightViolationHelper;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        CopyrightViolationHelper copyrightViolationHelper = this.f8854a;
        d dVar = (d) obj;
        copyrightViolationHelper.f8835e = false;
        if (dVar != null && dVar.data != null && ((ba) dVar.data).f19301a != 0) {
            copyrightViolationHelper.a(2);
        }
    }
}
