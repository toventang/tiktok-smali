package com.ss.android.ugc.aweme.crossplatform;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface ICrossPlatformService {
    static {
        Covode.recordClassIndex(48747);
    }

    Class<? extends Activity> a();

    void a(Context context, Map<String, String> map);

    String b();
}
