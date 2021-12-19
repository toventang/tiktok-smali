package com.ss.android.ugc.aweme.internal;

import android.content.Context;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import h.f.a.a;
import h.z;
import java.util.List;

public interface IAVCommentService {
    static {
        Covode.recordClassIndex(67176);
    }

    void a(Context context, String str, Aweme aweme, int i2, List<InteractionTagUserInfo> list, OnActivityResultCallback onActivityResultCallback);

    void a(e eVar, boolean z, a<z> aVar);

    boolean a(boolean z);
}
