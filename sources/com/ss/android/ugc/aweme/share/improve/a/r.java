package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.utils.hh;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class r implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Aweme f123807a;

    static {
        Covode.recordClassIndex(81254);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.cnl;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "insight";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_line_chart;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        return R.raw.icon_line_chart;
    }

    public r(Aweme aweme) {
        l.d(aweme, "");
        this.f123807a = aweme;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(ImageView imageView) {
        l.d(imageView, "");
        l.d(imageView, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(TextView textView) {
        l.d(textView, "");
        h.a.a(this, textView);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        String aid = this.f123807a.getAid();
        if (aid != null && aid.length() != 0) {
            StringBuilder append = new StringBuilder("https://www.tiktok.com/insight/?hide_nav_bar=1&full_screen=1&status_bar_height=").append(hh.c()).append("#/video/");
            Aweme aweme = this.f123807a;
            if (aweme == null) {
                l.b();
            }
            String sb = append.append(aweme.getAid()).toString();
            if (!TextUtils.isEmpty(sb)) {
                com.ss.android.ugc.aweme.common.r.a("click_insight", new d().a("enter_from", "video_more").f66730a);
                com.ss.android.ugc.aweme.common.r.a("enter_insight_detail", new d().a("enter_from", "video_more").f66730a);
                if (sb == null) {
                    l.b();
                }
                ShareDependService.a.a().a(sb, context);
            }
        }
    }
}
