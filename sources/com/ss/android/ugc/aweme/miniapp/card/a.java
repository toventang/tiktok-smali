package com.ss.android.ugc.aweme.miniapp.card;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.framework.d.b;
import com.zhiliaoapp.musically.R;

public final class a implements com.ss.android.ugc.aweme.commercialize.feed.a.a {

    /* renamed from: a  reason: collision with root package name */
    MicroAppVideoCardView f109647a;

    /* renamed from: b  reason: collision with root package name */
    View f109648b;

    /* renamed from: c  reason: collision with root package name */
    private Context f109649c;

    /* renamed from: d  reason: collision with root package name */
    private String f109650d;

    static {
        Covode.recordClassIndex(70168);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.a.a
    public final void b() {
        this.f109648b.setVisibility(0);
        MicroAppVideoCardView microAppVideoCardView = this.f109647a;
        microAppVideoCardView.setAlpha(0.0f);
        microAppVideoCardView.setVisibility(8);
        microAppVideoCardView.setTranslationX(0.0f);
        microAppVideoCardView.setTranslationY(0.0f);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.a.a
    public final void a() {
        int i2;
        MicroAppVideoCardView microAppVideoCardView = this.f109647a;
        if (microAppVideoCardView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) microAppVideoCardView.getLayoutParams();
            if (c.b.f66221a.q) {
                i2 = c.a();
            } else {
                i2 = 0;
            }
            int a2 = b.a(this.f109649c, 58.0f) - i2;
            if (c.f66194d) {
                a2 += c.f66195e;
            }
            marginLayoutParams.bottomMargin = a2;
            this.f109647a.setLayoutParams(marginLayoutParams);
        }
    }

    public a(View view, String str) {
        this.f109649c = view.getContext();
        this.f109648b = view.findViewById(R.id.q0);
        this.f109647a = (MicroAppVideoCardView) view.findViewById(R.id.cm8);
        this.f109650d = str;
    }
}
