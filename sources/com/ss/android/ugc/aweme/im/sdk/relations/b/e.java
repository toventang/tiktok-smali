package com.ss.android.ugc.aweme.im.sdk.relations.b;

import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.j.h;
import h.m.p;
import java.util.Objects;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f102973a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(66013);
    }

    private static void b(TextView textView, String str, String str2) {
        l.d(textView, "");
        l.d(str, "");
        l.d(str2, "");
        textView.setText(d.a(b.c(textView.getContext(), R.color.bh), str, str2, 0));
    }

    public static void a(TextView textView, String str, String str2) {
        l.d(textView, "");
        l.d(str2, "");
        if (str2.length() == 0 || str == null || str.length() == 0) {
            textView.setText(str);
            return;
        }
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase();
        l.b(lowerCase, "");
        String lowerCase2 = str2.toLowerCase();
        l.b(lowerCase2, "");
        int a2 = p.a((CharSequence) lowerCase, lowerCase2, 0, false, 6);
        if (a2 == -1) {
            textView.setText(str);
            return;
        }
        int c2 = h.c(str2.length() + a2, str.length());
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(a2, c2);
        l.b(substring, "");
        b(textView, str, substring);
    }
}
