package com.ss.android.ugc.aweme.feed.x;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.a.m;
import h.f.b.l;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static String f95366a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f95367b;

    /* renamed from: c  reason: collision with root package name */
    public static final v f95368c = new v();

    private v() {
    }

    static {
        Covode.recordClassIndex(60392);
    }

    public static final void a(String str, m<? super String, ? super String, ? extends Object> mVar) {
        String str2;
        l.d(mVar, "");
        if (TextUtils.equals(str, "sticker_profile_detail") && (str2 = f95366a) != null) {
            mVar.invoke("prop_id", str2);
        }
    }

    public static final void b(String str, m<? super String, ? super String, ? extends Object> mVar) {
        String str2;
        l.d(mVar, "");
        if (TextUtils.equals(str, "sticker_profile_detail")) {
            mVar.invoke("enter_method", "profile_tab_anchor");
            if (f95367b) {
                str2 = "personal_homepage";
            } else {
                str2 = "others_homepage";
            }
            mVar.invoke("enter_from", str2);
        }
    }
}
