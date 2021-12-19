package com.ss.android.ugc.aweme.setting.services;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.setting.services.IPrivacySettingService;

final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final IPrivacySettingService.a f122667a;

    static {
        Covode.recordClassIndex(80516);
    }

    b(IPrivacySettingService.a aVar) {
        this.f122667a = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        IPrivacySettingService.a aVar = this.f122667a;
        if (aVar != null) {
            aVar.a();
        }
    }
}
