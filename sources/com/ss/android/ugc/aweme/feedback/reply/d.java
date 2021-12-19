package com.ss.android.ugc.aweme.feedback.reply;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f95393a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static Keva f95394b;

    private d() {
    }

    static {
        Covode.recordClassIndex(60411);
    }

    public static Keva a() {
        if (f95394b == null) {
            f95394b = Keva.getRepo("HasFeedbackKeva");
        }
        return f95394b;
    }
}
