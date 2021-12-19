package com.ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.lego.b.c;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public static final ac f93030a = new ac();

    private ac() {
    }

    static {
        Covode.recordClassIndex(59000);
    }

    private static int c() {
        return b.a().a(true, "ui_down_grade_strategy", 3);
    }

    public static final boolean a() {
        if (c.a() && (c() & 2) != 0) {
            return false;
        }
        return true;
    }

    public static final boolean b() {
        if (c.a() && (c() & 1) != 0) {
            return false;
        }
        return true;
    }
}
