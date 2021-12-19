package com.ss.android.ugc.aweme.out;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.services.external.IAbnormalExitLogService;
import com.ss.android.ugc.aweme.shortvideo.p.c;
import com.ss.android.ugc.aweme.shortvideo.p.d;
import com.ss.android.ugc.tools.f.b;

public final class a implements IAbnormalExitLogService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f114572a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(73756);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAbnormalExitLogService
    public final void logAppAbnormalExit() {
        d.a(c.f129554a).f();
        d.b(c.f129554a).f();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAbnormalExitLogService
    public final void logRestoreDialogShow() {
        r.a("continue_popup_show", new b().a("last_status", d.b(c.f129554a).b()).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAbnormalExitLogService
    public final void logRestoreDialogClick(boolean z) {
        String str;
        b a2 = new b().a("last_status", d.b(c.f129554a).b());
        if (z) {
            str = "confirm";
        } else {
            str = "cancel";
        }
        r.a("continue_popup_click", a2.a("click_position", str).f149193a);
    }
}
