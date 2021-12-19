package com.ss.android.ugc.aweme.specact.pendant.h;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.ActivityStack;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f134288a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(87822);
    }

    public static androidx.fragment.app.e a() {
        Activity topActivity = ActivityStack.getTopActivity();
        if (!(topActivity instanceof androidx.fragment.app.e)) {
            topActivity = null;
        }
        return (androidx.fragment.app.e) topActivity;
    }
}
