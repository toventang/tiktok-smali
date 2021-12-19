package com.bytedance.tiktok.homepage;

import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.feed.i.aa;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.d.a.c;

final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f44125a;

    /* renamed from: b  reason: collision with root package name */
    private final MainActivity f44126b;

    static {
        Covode.recordClassIndex(27039);
    }

    e(a aVar, MainActivity mainActivity) {
        this.f44125a = aVar;
        this.f44126b = mainActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        MainActivity mainActivity = this.f44126b;
        if (mainActivity.isUnderMainTab()) {
            IExternalService a2 = AVExternalServiceImpl.a();
            if (a2 != null) {
                a2.publishService().cancelRestoreOnMain(mainActivity);
            }
            if (Hox.a.a(mainActivity).b("HOME")) {
                Bundle bundle = new Bundle();
                bundle.putString(be.f68530b, be.f68532d);
                Hox.a.a(mainActivity).a("HOME", bundle);
            }
        }
        AVExternalServiceImpl.a().abnormalExitLogService().logRestoreDialogClick(false);
        dialogInterface.dismiss();
        c.a(new aa());
    }
}
