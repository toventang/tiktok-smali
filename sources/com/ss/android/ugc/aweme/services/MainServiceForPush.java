package com.ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.ii;
import com.ss.android.ugc.awemepushapi.a;

public class MainServiceForPush implements a {
    static {
        Covode.recordClassIndex(79521);
    }

    public String filterUrl(Context context, String str) {
        return str;
    }

    @Override // com.ss.android.ugc.awemepushapi.a
    public String getDefaultUninstallQuestionUrl() {
        return ii.a().toString();
    }
}
