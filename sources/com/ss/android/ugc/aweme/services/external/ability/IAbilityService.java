package com.ss.android.ugc.aweme.services.external.ability;

import com.bytedance.covode.number.Covode;

public interface IAbilityService {
    static {
        Covode.recordClassIndex(79666);
    }

    IAVCameraService cameraService();

    IAVEffectService effectService();

    IAVInfoService infoService();

    IAVLoaderService libraryLoaderService();

    IAVProcessService processService();

    IAVTransformService transformService();
}
