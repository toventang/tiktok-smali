package com.bytedance.android.live.share;

import android.app.Activity;
import android.app.Dialog;
import com.bytedance.android.livesdkapi.depend.e.b;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.covode.number.Covode;
import f.a.ab;

public interface a {
    static {
        Covode.recordClassIndex(7024);
    }

    ab<Object> a(Activity activity, c cVar);

    void a(Activity activity, c cVar, b bVar);

    Dialog b(Activity activity, c cVar, b bVar);

    Dialog c(Activity activity, c cVar, b bVar);
}
