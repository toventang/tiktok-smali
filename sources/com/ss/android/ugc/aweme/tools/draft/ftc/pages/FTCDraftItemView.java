package com.ss.android.ugc.aweme.tools.draft.ftc.pages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.tools.c;
import h.f.b.l;
import java.util.Objects;

public final class FTCDraftItemView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    Scroller f139570a;

    /* renamed from: b  reason: collision with root package name */
    int f139571b;

    /* renamed from: c  reason: collision with root package name */
    boolean f139572c;

    /* renamed from: d  reason: collision with root package name */
    a f139573d;

    public interface a {
        static {
            Covode.recordClassIndex(91247);
        }

        void a(int i2, boolean z);
    }

    static {
        Covode.recordClassIndex(91246);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View childAt = getChildAt(0);
        l.b(childAt, "");
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        this.f139571b = (int) (((float) (layoutParams2.width + (layoutParams2.rightMargin * 2))) + n.b(getContext(), 16.0f));
        if (c.a(getContext())) {
            this.f139571b = -this.f139571b;
        }
    }

    public final void computeScroll() {
        Scroller scroller = this.f139570a;
        if (scroller == null) {
            l.b();
        }
        if (scroller.computeScrollOffset()) {
            Scroller scroller2 = this.f139570a;
            if (scroller2 == null) {
                l.b();
            }
            int currX = scroller2.getCurrX();
            Scroller scroller3 = this.f139570a;
            if (scroller3 == null) {
                l.b();
            }
            scrollTo(currX, scroller3.getCurrY());
            if (this.f139573d != null) {
                Scroller scroller4 = this.f139570a;
                if (scroller4 == null) {
                    l.b();
                }
                scroller4.getCurrX();
                Scroller scroller5 = this.f139570a;
                if (scroller5 == null) {
                    l.b();
                }
                scroller5.getCurrY();
            }
            invalidate();
        }
    }

    public final void setOnScrollListener(a aVar) {
        this.f139573d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCDraftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(4704);
        this.f139570a = new Scroller(context);
        MethodCollector.o(4704);
    }
}
