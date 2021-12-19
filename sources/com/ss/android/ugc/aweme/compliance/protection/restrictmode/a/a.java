package com.ss.android.ugc.aweme.compliance.protection.restrictmode.a;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.b;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.c.h;
import com.ss.android.ugc.aweme.homepage.ui.experiment.SpecialTopicEntry;
import com.ss.android.ugc.aweme.utils.in;

public final class a implements h {
    static {
        Covode.recordClassIndex(48349);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.h
    public final void a(Object obj, View view, View view2, View view3) {
        if (com.ss.android.ugc.aweme.compliance.api.a.o().a()) {
            o.a(false, view3);
            view.setVisibility(0);
            b bVar = (b) obj;
            AnimatedImageView animatedImageView = (AnimatedImageView) view2;
            SpecialTopicEntry i2 = bVar.i();
            if (i2 != null && i2.getEnable() && !TextUtils.isEmpty(i2.getLandingRoute()) && !TextUtils.isEmpty(i2.getIconUrl())) {
                if (!in.d() || i2.getChildViewable()) {
                    o.b(true, animatedImageView);
                    e.b(animatedImageView, i2.getIconUrl(), -1, -1);
                    r.a("topic_entrance_show", new d().a("enter_from", bVar.g()).a(StringSet.type, i2.getEventName()).a("url", i2.getLandingRoute()).f66730a);
                    animatedImageView.setOnClickListener(new b(bVar, i2));
                }
            }
        }
    }
}
