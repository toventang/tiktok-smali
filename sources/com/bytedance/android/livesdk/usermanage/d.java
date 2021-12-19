package com.bytedance.android.livesdk.usermanage;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f22008a;

    static {
        Covode.recordClassIndex(12964);
    }

    d(b bVar) {
        this.f22008a = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        b bVar = this.f22008a;
        b.a.a("blocked_list_toast_click").a(bVar.c()).b("relation").d("live_detail").c("click").f("no").b();
        if (bVar.isShowing()) {
            bVar.dismiss();
        }
        a.a().a(new e(1));
    }
}
