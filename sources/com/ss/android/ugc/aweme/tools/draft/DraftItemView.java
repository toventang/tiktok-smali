package com.ss.android.ugc.aweme.tools.draft;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.tools.c;

public class DraftItemView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private Scroller f139330a;

    /* renamed from: b  reason: collision with root package name */
    private int f139331b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f139332c;

    /* renamed from: d  reason: collision with root package name */
    private a f139333d;

    public interface a {
        static {
            Covode.recordClassIndex(91084);
        }

        void a(int i2, boolean z);
    }

    static {
        Covode.recordClassIndex(91083);
    }

    public final void b() {
        if (this.f139332c) {
            this.f139332c = false;
            Scroller scroller = this.f139330a;
            int i2 = this.f139331b;
            scroller.startScroll(-i2, 0, i2, 0, 200);
            a aVar = this.f139333d;
            if (aVar != null) {
                aVar.a(this.f139331b, this.f139332c);
            }
        }
    }

    public final void a() {
        if (!this.f139332c) {
            this.f139332c = true;
            this.f139330a.startScroll(0, 0, -this.f139331b, 0, 200);
            a aVar = this.f139333d;
            if (aVar != null) {
                aVar.a(this.f139331b, this.f139332c);
            }
        }
    }

    public void computeScroll() {
        if (this.f139330a.computeScrollOffset()) {
            scrollTo(this.f139330a.getCurrX(), this.f139330a.getCurrY());
            if (this.f139333d != null) {
                this.f139330a.getCurrX();
                this.f139330a.getCurrY();
            }
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(0).getLayoutParams();
        this.f139331b = (int) (((float) (layoutParams.width + (layoutParams.rightMargin * 2))) + n.b(getContext(), 16.0f));
        if (c.a(getContext())) {
            this.f139331b = -this.f139331b;
        }
    }

    public void setOnScrollListener(a aVar) {
        this.f139333d = aVar;
    }

    public DraftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(3511);
        this.f139330a = new Scroller(context);
        MethodCollector.o(3511);
    }
}
