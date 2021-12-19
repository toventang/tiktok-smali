package com.ss.android.ugc.aweme.detail.h;

import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;

final /* synthetic */ class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final y f79648a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewGroup f79649b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f79650c;

    static {
        Covode.recordClassIndex(49488);
    }

    aa(y yVar, ViewGroup viewGroup, TextView textView) {
        this.f79648a = yVar;
        this.f79649b = viewGroup;
        this.f79650c = textView;
    }

    public final void run() {
        ViewGroup viewGroup = this.f79649b;
        TextView textView = this.f79650c;
        int width = viewGroup.getWidth();
        int a2 = n.a(150.0d);
        if (width > a2) {
            int width2 = width - textView.getWidth();
            if (y.a(textView, a2, width2, 13) && y.a(textView, a2, width2, 12)) {
                textView.setMaxWidth(a2 - width2);
            }
        }
    }
}
