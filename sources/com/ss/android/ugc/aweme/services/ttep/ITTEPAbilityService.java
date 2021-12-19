package com.ss.android.ugc.aweme.services.ttep;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.a.b;
import h.z;

public interface ITTEPAbilityService {
    static {
        Covode.recordClassIndex(79837);
    }

    void downloadEffectAndJumpShootPage(e eVar, a<Boolean> aVar, String str, b<? super Integer, z> bVar, b<? super Boolean, z> bVar2);

    void downloadPreviewEffectAndResource(String str, String str2, IDownloadCallback iDownloadCallback);

    void downloadPreviewEffectAndResourceWithoutLogin(String str, String str2, IDownloadCallback iDownloadCallback);
}
