package com.ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import h.p;

public interface IRessoAnchorService {
    static {
        Covode.recordClassIndex(79473);
    }

    p<Long, Integer> getCopyrightLimitMsUninstalledResso(String str);

    boolean showAnchorUninstalledResso(String str, Context context);
}
