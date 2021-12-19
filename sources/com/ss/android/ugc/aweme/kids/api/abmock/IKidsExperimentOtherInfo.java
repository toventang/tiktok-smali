package com.ss.android.ugc.aweme.kids.api.abmock;

import com.bytedance.covode.number.Covode;

public interface IKidsExperimentOtherInfo {
    static {
        Covode.recordClassIndex(67545);
    }

    String getOwner(String str);

    String getTitle(String str);
}
