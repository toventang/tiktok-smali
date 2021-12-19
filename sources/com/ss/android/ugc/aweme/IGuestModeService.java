package com.ss.android.ugc.aweme;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public interface IGuestModeService {
    static {
        Covode.recordClassIndex(38377);
    }

    void a(Context context, Bundle bundle);

    boolean a();

    boolean b();

    boolean c();
}
