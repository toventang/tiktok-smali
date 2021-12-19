package com.ss.android.ugc.aweme.im.sdk.privacy.a;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f102913a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(65971);
    }

    public static String a(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "everyone";
            }
            if (num.intValue() == 2) {
                return "friends";
            }
            if (num.intValue() == 3) {
                return "no_one";
            }
        }
        return "chat_set value ".concat(String.valueOf(num));
    }
}
