package com.ss.android.ugc.aweme.ad.feed.reminder;

import android.content.Context;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f66015a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(40604);
    }

    public static final e a(Context context) {
        e eVar = null;
        if (!(context instanceof e)) {
            if (context instanceof ContextThemeWrapper) {
                ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) context;
                if (contextThemeWrapper.getBaseContext() instanceof e) {
                    Context baseContext = contextThemeWrapper.getBaseContext();
                    if (baseContext instanceof e) {
                        eVar = baseContext;
                    }
                    return eVar;
                }
            }
            context = f.j();
            if (!(context instanceof e)) {
                context = null;
            }
        }
        return (e) context;
    }
}
