package com.bytedance.android.live.copyrightreview.helper;

import com.bytedance.covode.number.Covode;
import f.a.t;
import java.util.concurrent.TimeUnit;

final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final CopyrightViolationHelper f8838a;

    static {
        Covode.recordClassIndex(4521);
    }

    a(CopyrightViolationHelper copyrightViolationHelper) {
        this.f8838a = copyrightViolationHelper;
    }

    public final void run() {
        CopyrightViolationHelper copyrightViolationHelper = this.f8838a;
        copyrightViolationHelper.f8832b.show();
        copyrightViolationHelper.f8833c = t.b(20000, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(f.a.h.a.b(f.a.k.a.f158006c)).d(new c(copyrightViolationHelper));
    }
}
