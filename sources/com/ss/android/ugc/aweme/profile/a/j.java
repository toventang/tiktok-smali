package com.ss.android.ugc.aweme.profile.a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;

final /* synthetic */ class j implements IAVInfoService.IGetInfoCallback {

    /* renamed from: a  reason: collision with root package name */
    private final e f115847a;

    static {
        Covode.recordClassIndex(74725);
    }

    j(e eVar) {
        this.f115847a = eVar;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
    public final void finish(Object obj) {
        e eVar = this.f115847a;
        Bitmap bitmap = (Bitmap) obj;
        if (eVar.f115837b != null && bitmap != null) {
            eVar.f115837b.setImageBitmap(bitmap);
        }
    }
}
