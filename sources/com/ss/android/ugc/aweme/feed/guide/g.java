package com.ss.android.ugc.aweme.feed.guide;

import android.content.Context;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.ss.android.ugc.aweme.feed.widget.RectCornerRelativeLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class g implements GalleryLayoutManager.d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f93247a;

    static {
        Covode.recordClassIndex(59131);
    }

    public g(Context context) {
        l.d(context, "");
        this.f93247a = context;
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager.d
    public final void a(GalleryLayoutManager galleryLayoutManager, View view, float f2) {
        l.d(galleryLayoutManager, "");
        l.d(view, "");
        if (f2 < -1.0f || f2 > 1.0f) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
            view.setAlpha(0.34f);
            return;
        }
        float abs = ((1.0f - Math.abs(f2)) * 0.100000024f) + 0.9f;
        float abs2 = ((1.0f - Math.abs(f2)) * 1.0f) + 7.0f;
        view.setScaleX(abs);
        view.setScaleY(abs);
        view.setAlpha(((1.0f - Math.abs(f2)) * 0.65999997f) + 0.34f);
        view.setTranslationY(n.b(this.f93247a, Math.abs(f2) * 12.0f));
        RectCornerRelativeLayout rectCornerRelativeLayout = (RectCornerRelativeLayout) view.findViewById(R.id.afb);
        if (rectCornerRelativeLayout != null) {
            rectCornerRelativeLayout.setRadius((int) n.b(this.f93247a, abs2));
        }
    }
}
