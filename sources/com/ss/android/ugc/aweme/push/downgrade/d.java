package com.ss.android.ugc.aweme.push.downgrade;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static volatile a f118880a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile Boolean f118881b = false;

    static {
        Covode.recordClassIndex(77232);
    }

    public static boolean a(Context context, Intent intent) {
        if (f118880a != null) {
            return f118880a.a(context, intent);
        }
        return false;
    }
}
