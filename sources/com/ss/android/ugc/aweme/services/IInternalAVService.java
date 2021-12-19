package com.ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface IInternalAVService extends IFoundationAVService {
    static {
        Covode.recordClassIndex(79466);
    }

    boolean isPublishing(Context context);
}
