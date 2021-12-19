package com.ss.android.ugc.aweme.feedback.runtime.behavior;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface IRuntimeBehaviorService {
    static {
        Covode.recordClassIndex(60414);
    }

    void a(Context context);

    void a(String str);

    void a(String str, String str2);

    boolean a();

    Map<String, String> b();
}
