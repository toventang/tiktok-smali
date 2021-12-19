package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.g.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

public interface DetailFeedService {
    static {
        Covode.recordClassIndex(38348);
    }

    Fragment a(Activity activity);

    a a(String str);

    a a(String str, String str2, String str3);

    Aweme a(String str, String str2);

    Class<? extends Activity> a();

    Map<String, View> a(View view);
}
