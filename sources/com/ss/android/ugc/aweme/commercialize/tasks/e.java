package com.ss.android.ugc.aweme.commercialize.tasks;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.c.a.g;
import com.ss.android.ugc.tiktok.security.a.a;
import h.f.b.l;
import h.m.p;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f75343a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(46492);
    }

    public static boolean a(String str) {
        l.d(str, "");
        if (!m.a(str)) {
            String lowerCase = str.toLowerCase();
            l.b(lowerCase, "");
            if (p.b(lowerCase, "http://", false)) {
                return true;
            }
            String lowerCase2 = str.toLowerCase();
            l.b(lowerCase2, "");
            if (p.b(lowerCase2, "https://", false)) {
                return true;
            }
        }
        return false;
    }

    public static g a(Context context, Intent intent) {
        if (context == null) {
            return new g(false, "context is null");
        }
        if (intent == null) {
            return new g(false, "intent is null");
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            a.a(intent, context);
            context.startActivity(intent);
            return new g(true);
        } catch (SecurityException e2) {
            com.ss.android.ugc.aweme.framework.a.a.a(3, null, "ad start activity failed");
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return new g(false, "ad start activity failed");
        } catch (ActivityNotFoundException e3) {
            com.ss.android.ugc.aweme.framework.a.a.a(3, null, "ad start activity failed");
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e3);
            return new g(false, "ad start activity failed");
        }
    }
}
