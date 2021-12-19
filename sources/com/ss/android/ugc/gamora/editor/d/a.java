package com.ss.android.ugc.gamora.editor.d;

import android.app.Activity;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f145794a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(95796);
    }

    public static final boolean a(Activity activity) {
        l.d(activity, "");
        Resources resources = activity.getResources();
        l.b(resources, "");
        if (resources.getDisplayMetrics().density <= 1.5f) {
            return true;
        }
        return false;
    }
}
