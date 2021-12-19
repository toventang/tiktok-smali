package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tiktok.security.a.a;

public final class ee {

    /* renamed from: a  reason: collision with root package name */
    public static final ee f142849a = new ee();

    private ee() {
    }

    static {
        Covode.recordClassIndex(93464);
    }

    public static boolean a(Context context, Intent intent) {
        if (!(context == null || intent == null)) {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                a.a(intent, context);
                context.startActivity(intent);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
