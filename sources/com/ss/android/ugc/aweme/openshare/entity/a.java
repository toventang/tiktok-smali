package com.ss.android.ugc.aweme.openshare.entity;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public interface a {
    static {
        Covode.recordClassIndex(73732);
    }

    boolean checkArgs();

    void serialize(Bundle bundle);

    int type();

    void unserialize(Bundle bundle);
}
