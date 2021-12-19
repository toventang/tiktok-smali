package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.TuxTextCell;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cg implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bm f117064a;

    /* renamed from: b  reason: collision with root package name */
    private final String f117065b;

    /* renamed from: c  reason: collision with root package name */
    private final TuxTextCell f117066c;

    static {
        Covode.recordClassIndex(75588);
    }

    cg(bm bmVar, String str, TuxTextCell tuxTextCell) {
        this.f117064a = bmVar;
        this.f117065b = str;
        this.f117066c = tuxTextCell;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f117064a.a(this.f117065b, this.f117066c);
    }
}
