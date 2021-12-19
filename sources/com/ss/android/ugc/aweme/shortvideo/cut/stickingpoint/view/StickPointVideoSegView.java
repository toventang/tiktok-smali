package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class StickPointVideoSegView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public h f126060a;

    /* renamed from: b  reason: collision with root package name */
    private View f126061b;

    static {
        Covode.recordClassIndex(82793);
    }

    public StickPointVideoSegView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setStickPointVideoSegListener(h hVar) {
        l.d(hVar, "");
        this.f126060a = hVar;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StickPointVideoSegView f126062a;

        static {
            Covode.recordClassIndex(82794);
        }

        a(StickPointVideoSegView stickPointVideoSegView) {
            this.f126062a = stickPointVideoSegView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h hVar = this.f126062a.f126060a;
            if (hVar != null) {
                hVar.a(view);
            }
        }
    }

    public final void setButtonClickable(boolean z) {
        if (this.f126061b == null) {
            l.a("contentView");
            return;
        }
        View view = this.f126061b;
        if (view == null) {
            l.a("contentView");
        }
        View findViewById = view.findViewById(R.id.ef_);
        l.b(findViewById, "");
        findViewById.setClickable(z);
    }

    private /* synthetic */ StickPointVideoSegView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StickPointVideoSegView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(5747);
        View inflate = LayoutInflater.from(context).inflate(R.layout.aij, this);
        l.b(inflate, "");
        this.f126061b = inflate;
        if (inflate == null) {
            l.a("contentView");
        }
        inflate.findViewById(R.id.ef_).setOnClickListener(new a(this));
        MethodCollector.o(5747);
    }
}
