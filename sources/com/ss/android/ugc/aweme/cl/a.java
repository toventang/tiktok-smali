package com.ss.android.ugc.aweme.cl;

import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ui.FeedInterceptTouchLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final SimpleDateFormat f71185a = new SimpleDateFormat("yyyy-MM-dd h:mm a", Locale.getDefault());

    /* renamed from: b  reason: collision with root package name */
    public static final a f71186b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(43814);
    }

    public static void a(FrameLayout frameLayout, boolean z) {
        l.d(frameLayout, "");
        FeedInterceptTouchLayout feedInterceptTouchLayout = (FeedInterceptTouchLayout) frameLayout.findViewById(R.id.b23);
        if (feedInterceptTouchLayout != null) {
            feedInterceptTouchLayout.setGroupClickable(z);
        }
        FeedInterceptTouchLayout feedInterceptTouchLayout2 = (FeedInterceptTouchLayout) frameLayout.findViewById(R.id.am5);
        if (feedInterceptTouchLayout2 != null) {
            feedInterceptTouchLayout2.setGroupClickable(z);
        }
        FeedInterceptTouchLayout feedInterceptTouchLayout3 = (FeedInterceptTouchLayout) frameLayout.findViewById(R.id.a_k);
        if (feedInterceptTouchLayout3 != null) {
            feedInterceptTouchLayout3.setGroupClickable(z);
        }
    }
}
