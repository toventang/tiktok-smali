package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public interface ax extends Serializable {
    static {
        Covode.recordClassIndex(41656);
    }

    void onChanged(String str, String str2);

    void onExit();
}
