package com.ss.android.ugc.aweme.tools.mvtemplate;

import com.bytedance.covode.number.Covode;
import java.util.List;

final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final MvTemplateView f140861a;

    /* renamed from: b  reason: collision with root package name */
    private final int f140862b;

    /* renamed from: c  reason: collision with root package name */
    private final List f140863c;

    static {
        Covode.recordClassIndex(91974);
    }

    k(MvTemplateView mvTemplateView, int i2, List list) {
        this.f140861a = mvTemplateView;
        this.f140862b = i2;
        this.f140863c = list;
    }

    public final void run() {
        MvTemplateView mvTemplateView = this.f140861a;
        int i2 = this.f140862b;
        List list = this.f140863c;
        if (i2 == 0) {
            mvTemplateView.q.notifyDataSetChanged();
        } else {
            mvTemplateView.q.notifyItemRangeInserted(i2 + 1, list.size());
        }
    }
}
