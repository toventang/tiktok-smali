package com.ss.android.ugc.aweme.ecommerce.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.a.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.utils.hw;
import com.ss.android.ugc.tiktok.security.a.a;
import h.f.b.l;
import h.m.p;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f87584a = new m();

    private m() {
    }

    static {
        Covode.recordClassIndex(55055);
    }

    public static boolean a(String str) {
        l.d(str, "");
        if (p.a((CharSequence) str)) {
            return false;
        }
        return hw.a(d.a(), str);
    }

    public static boolean a(Context context, String str, String str2) {
        l.d(context, "");
        l.d(str, "");
        l.d(str2, "");
        if (!hw.a(d.a(), str)) {
            return false;
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                c.a aVar = new c.a();
                aVar.a().f1776a.setPackage(str);
                aVar.a().a(context, Uri.parse(str2));
            } else {
                Intent a2 = f.a(context, str);
                a.a(a2, context);
                context.startActivity(a2);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
