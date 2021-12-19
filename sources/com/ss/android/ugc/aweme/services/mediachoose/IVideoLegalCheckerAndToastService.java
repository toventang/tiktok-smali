package com.ss.android.ugc.aweme.services.mediachoose;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.a.b;
import h.f.a.m;
import h.f.a.r;
import h.z;

public interface IVideoLegalCheckerAndToastService {
    static {
        Covode.recordClassIndex(79738);
    }

    void isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i2, int i3, m<? super String, ? super Long, z> mVar, r<? super String, ? super Long, ? super Integer, ? super String, z> rVar);

    void isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i2, a<z> aVar);

    boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z);

    boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i2, int i3, b<? super Integer, z> bVar);

    boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, b<? super Integer, z> bVar);
}
