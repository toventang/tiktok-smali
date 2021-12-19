package com.ss.android.ugc.aweme.comment.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.tooltip.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ao implements b.AbstractC0734b {

    /* renamed from: a  reason: collision with root package name */
    private final k f72525a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f72526b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f72527c;

    static {
        Covode.recordClassIndex(44694);
    }

    ao(k kVar, Aweme aweme, String[] strArr) {
        this.f72525a = kVar;
        this.f72526b = aweme;
        this.f72527c = strArr;
    }

    @Override // com.bytedance.ies.dmt.ui.tooltip.b.AbstractC0734b
    public final void a() {
        this.f72525a.a(this.f72526b, this.f72527c[0], "dismiss_gift_tooltip");
    }
}
