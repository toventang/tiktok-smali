package com.bytedance.android.live.copyrightreview.helper;

import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements f {

    /* renamed from: a  reason: collision with root package name */
    private final CopyrightViolationHelper f8855a;

    static {
        Covode.recordClassIndex(4529);
    }

    i(CopyrightViolationHelper copyrightViolationHelper) {
        this.f8855a = copyrightViolationHelper;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        CopyrightViolationHelper copyrightViolationHelper = this.f8855a;
        copyrightViolationHelper.f8835e = false;
        copyrightViolationHelper.a(2);
    }
}
