package com.ss.android.ugc.aweme.setting.services;

import com.bytedance.covode.number.Covode;
import java.util.List;

public interface ISettingDependService {
    static {
        Covode.recordClassIndex(80503);
    }

    List<String> a();

    List<String> b();

    String c();
}
