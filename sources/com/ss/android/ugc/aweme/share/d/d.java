package com.ss.android.ugc.aweme.share.d;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.b;
import androidx.lifecycle.u;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView;
import com.ss.android.ugc.aweme.share.d.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;

public final class d implements u<a> {
    static {
        Covode.recordClassIndex(81060);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(a aVar) {
        Activity j2;
        MethodCollector.i(11109);
        if (aVar == null || (j2 = f.j()) == null) {
            MethodCollector.o(11109);
        } else if (c.c() || c.d()) {
            MethodCollector.o(11109);
        } else {
            Aweme aweme = a.f123439c;
            int i2 = a.f123437a;
            if (i2 != 4) {
                if (i2 == 5 && aweme != null) {
                    g gVar = g.f123464c;
                    l.d(j2, "");
                    l.d(aweme, "");
                    gVar.b();
                    View findViewById = j2.findViewById(16908290);
                    l.b(findViewById, "");
                    FrameLayout frameLayout = (FrameLayout) findViewById;
                    l.d(j2, "");
                    NoticeButtonView noticeButtonView = g.f123462a;
                    if (noticeButtonView == null) {
                        NoticeButtonView noticeButtonView2 = new NoticeButtonView(j2);
                        g.f123462a = noticeButtonView2;
                        noticeButtonView2.setTitleText(R.string.bvb);
                        noticeButtonView2.setContextText(R.string.bvc);
                        String string = j2.getString(R.string.bvf);
                        l.b(string, "");
                        noticeButtonView2.setItemText(string);
                        noticeButtonView2.setIconImage(R.raw.icon_exclamation_mark_circle);
                        noticeButtonView2.setButtonTextColor(-16777216);
                        Drawable a2 = b.a(j2, (int) R.drawable.a0n);
                        if (a2 == null) {
                            l.b();
                        }
                        l.b(a2, "");
                        noticeButtonView2.setButtonBackgroundDrawable(a2);
                        noticeButtonView2.setOnInternalClickListener(new g.a(j2, aweme));
                        g.f123463b.sendEmptyMessageDelayed(1, 8000);
                        noticeButtonView = g.f123462a;
                        if (noticeButtonView == null) {
                            l.b();
                        }
                    }
                    int b2 = (int) n.b(com.bytedance.ies.ugc.appcontext.d.a(), 12.0f);
                    z.e eVar = new z.e();
                    eVar.element = (T) new LinearLayout.LayoutParams(-1, -2);
                    eVar.element.setMargins(b2, 0, b2, 0);
                    noticeButtonView.getViewTreeObserver().addOnGlobalLayoutListener(new g.c(noticeButtonView, frameLayout, eVar, b2));
                    noticeButtonView.setVisibility(4);
                    frameLayout.addView(noticeButtonView, eVar.element);
                    Aweme aweme2 = c.f123453e;
                    if (aweme2 != null) {
                        r.a("download_failure_window_show", new com.ss.android.ugc.aweme.app.f.d().a("group_id", aweme2.getAid()).a("author_id", aweme2.getAuthorUid()).f66730a);
                        MethodCollector.o(11109);
                        return;
                    }
                    MethodCollector.o(11109);
                    return;
                }
                MethodCollector.o(11109);
            } else if (aweme != null) {
                new com.bytedance.tux.g.b(j2).a(R.style.o1).e(R.string.h_v).b();
                MethodCollector.o(11109);
            } else {
                MethodCollector.o(11109);
            }
        }
    }
}
