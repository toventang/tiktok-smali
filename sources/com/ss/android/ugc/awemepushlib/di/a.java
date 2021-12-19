package com.ss.android.ugc.awemepushlib.di;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.MultiProcessSharedProvider;

public final class a implements com.ss.android.push.window.oppo.a {
    static {
        Covode.recordClassIndex(95061);
    }

    @Override // com.ss.android.push.window.oppo.a
    public final String a(Context context, String str, String str2) {
        return MultiProcessSharedProvider.a(context).a(str, str2);
    }
}
