package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa;

import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.compliance.privacy.a.a;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends f {

    /* renamed from: a  reason: collision with root package name */
    public final t<Integer> f77765a;

    /* renamed from: b  reason: collision with root package name */
    private UrlModel f77766b;

    static {
        Covode.recordClassIndex(48162);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f
    public final int b() {
        return R.layout.ut;
    }

    public d(t<Integer> tVar) {
        l.d(tVar, "");
        this.f77765a = tVar;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c
    public final void a(h hVar, int i2) {
        int i3;
        l.d(hVar, "");
        View view = hVar.itemView;
        l.b(view, "");
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.dep);
        l.b(linearLayout, "");
        Integer value = this.f77765a.getValue();
        if (value != null && value.intValue() == 1) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        linearLayout.setVisibility(i3);
        View view2 = hVar.itemView;
        l.b(view2, "");
        SmartCircleImageView smartCircleImageView = (SmartCircleImageView) view2.findViewById(R.id.or);
        l.b(smartCircleImageView, "");
        User e2 = a.e();
        if (!l.a(this.f77766b, e2.getAvatarThumb())) {
            UrlModel avatarThumb = e2.getAvatarThumb();
            this.f77766b = avatarThumb;
            v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(avatarThumb));
            a2.E = smartCircleImageView;
            a2.c();
        }
    }
}
