package com.bytedance.android.livesdk.usermanage;

import android.content.DialogInterface;
import com.bytedance.android.live.s.e;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f22007a;

    static {
        Covode.recordClassIndex(12963);
    }

    c(b bVar) {
        this.f22007a = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        b bVar = this.f22007a;
        if (!j.f107226e || !j.b() || j.c()) {
            j.f107226e = b.b();
        }
        if (!j.f107226e) {
            ao.a(bVar.S, (int) R.string.efp);
        } else {
            ((e) a.a(e.class)).kickOut(bVar, true, bVar.Q, bVar.R);
        }
        if (bVar.T != null) {
            bVar.T.a();
        }
        b.a.a("blocked_list_toast_click").a(bVar.c()).b("relation").d("live_detail").c("click").f("yes").b();
    }
}
