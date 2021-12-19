package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class aa implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final EnterpriseTransformLayout f116848a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116849b;

    static {
        Covode.recordClassIndex(75464);
    }

    aa(EnterpriseTransformLayout enterpriseTransformLayout, String str) {
        this.f116848a = enterpriseTransformLayout;
        this.f116849b = str;
    }

    public final boolean onLongClick(View view) {
        return this.f116848a.c(this.f116849b);
    }
}
