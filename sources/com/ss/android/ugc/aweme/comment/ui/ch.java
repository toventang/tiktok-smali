package com.ss.android.ugc.aweme.comment.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.tooltip.b;

public final /* synthetic */ class ch implements b.AbstractC0734b {

    /* renamed from: a  reason: collision with root package name */
    private final bz f72683a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f72684b;

    /* renamed from: c  reason: collision with root package name */
    private final String f72685c;

    static {
        Covode.recordClassIndex(44779);
    }

    public ch(bz bzVar, String[] strArr, String str) {
        this.f72683a = bzVar;
        this.f72684b = strArr;
        this.f72685c = str;
    }

    @Override // com.bytedance.ies.dmt.ui.tooltip.b.AbstractC0734b
    public final void a() {
        bz bzVar = this.f72683a;
        String[] strArr = this.f72684b;
        bz.a(bzVar.S, strArr[0], this.f72685c, "dismiss_gift_tooltip");
    }
}
