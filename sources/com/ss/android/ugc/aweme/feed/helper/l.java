package com.ss.android.ugc.aweme.feed.helper;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private static final int f93405a = R.id.e42;

    /* renamed from: b  reason: collision with root package name */
    private static volatile l f93406b;

    private static String a(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? "" : "share_highlight_click" : "comment_highlight_click" : "like_highlight_click";
    }

    private l() {
    }

    static {
        Covode.recordClassIndex(59186);
    }

    public static l a() {
        MethodCollector.i(9858);
        if (f93406b == null) {
            synchronized (l.class) {
                try {
                    if (f93406b == null) {
                        f93406b = new l();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9858);
                    throw th;
                }
            }
        }
        l lVar = f93406b;
        MethodCollector.o(9858);
        return lVar;
    }

    private static boolean a(ImageView imageView) {
        Boolean bool = (Boolean) imageView.getTag(f93405a);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void b(ImageView imageView, String str, String str2, String str3) {
        a(imageView, 1, str, str2, str3, null);
    }

    public static void a(ImageView imageView, String str, String str2, String str3) {
        View findViewById = imageView.getRootView().findViewById(R.id.bwy);
        boolean z = false;
        if (findViewById != null && findViewById.getVisibility() == 0) {
            z = true;
        }
        a(imageView, 2, str, str2, str3, Boolean.valueOf(z));
        if (z) {
            findViewById.setVisibility(8);
        }
    }

    private static void a(ImageView imageView, int i2, String str, String str2, String str3, Boolean bool) {
        if (a(imageView)) {
            d a2 = new d().a("enter_from", str).a("group_id", str2).a("author_id", str3).a("show_content", "");
            if (i2 == 2) {
                a2.a("is_pop_up", bool.booleanValue() ? 1 : 0);
            }
            r.a(a(i2), a2.f66730a);
        }
    }
}
