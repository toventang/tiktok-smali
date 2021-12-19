package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.b;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.widget.AbstractLoadingLayout;
import com.zhiliaoapp.musically.R;

public final class m extends AbstractLoadingLayout {

    /* renamed from: f  reason: collision with root package name */
    private int f80574f;

    static {
        Covode.recordClassIndex(50125);
    }

    public m(Context context) {
        this(context, (byte) 0);
    }

    private m(Context context, byte b2) {
        this(context, (char) 0);
    }

    private m(Context context, char c2) {
        super(context, null);
        this.f80574f = 45;
        a(0, 0);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824), View.MeasureSpec.makeMeasureSpec((int) n.b(getContext(), (float) this.f80574f), 1073741824));
    }

    @Override // com.ss.android.ugc.aweme.common.widget.AbstractLoadingLayout
    public final void a(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        super.a(i2, i3);
        if (this.f76497a != null) {
            View view = this.f76497a;
            if (i3 == 0) {
                i6 = 0;
            } else {
                i6 = 4;
            }
            view.setVisibility(i6);
        }
        View view2 = this.f76498b;
        int i7 = 8;
        if (i3 == 1) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view2.setVisibility(i4);
        View view3 = this.f76500d;
        if (i3 == 2) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        view3.setVisibility(i5);
        View view4 = this.f76499c;
        if (i3 == 3) {
            i7 = 0;
        }
        view4.setVisibility(i7);
        if (i3 == 0) {
            this.f80574f = 0;
        } else {
            this.f80574f = 45;
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, int i3) {
        int i4;
        super.addView(view, i2, i3);
        if (this.f76497a == view) {
            View view2 = this.f76497a;
            if (this.f76501e == 0) {
                i4 = 0;
            } else {
                i4 = 4;
            }
            view2.setVisibility(i4);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.widget.AbstractLoadingLayout
    public final View b(Context context, AttributeSet attributeSet, int i2) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, attributeSet, 0);
        appCompatTextView.setTextSize(15.0f);
        appCompatTextView.setTextColor(b.c(context, R.color.bz));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(R.string.cyu);
        appCompatTextView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.discover.adapter.m.AnonymousClass1 */

            static {
                Covode.recordClassIndex(50126);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
            }
        });
        return appCompatTextView;
    }

    @Override // com.ss.android.ugc.aweme.common.widget.AbstractLoadingLayout
    public final View c(Context context, AttributeSet attributeSet, int i2) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, attributeSet, 0);
        appCompatTextView.setTextSize(15.0f);
        appCompatTextView.setTextColor(b.c(context, R.color.bz));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(R.string.cyv);
        appCompatTextView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.discover.adapter.m.AnonymousClass2 */

            static {
                Covode.recordClassIndex(50127);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
            }
        });
        return appCompatTextView;
    }

    @Override // com.ss.android.ugc.aweme.common.widget.AbstractLoadingLayout
    public final View a(Context context, AttributeSet attributeSet, int i2) {
        MethodCollector.i(5509);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, attributeSet, 0);
        appCompatTextView.setTextSize(13.0f);
        appCompatTextView.setTextColor(b.c(context, R.color.c5));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(R.string.cyw);
        ProgressBar progressBar = new ProgressBar(context, attributeSet, 0);
        progressBar.setId(R.id.ci1);
        progressBar.setIndeterminate(true);
        progressBar.setIndeterminateDrawable(context.getResources().getDrawable(R.drawable.b2l));
        int b2 = (int) n.b(context, 15.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(b2, b2);
        layoutParams.setMargins(0, 0, (int) n.b(context, 5.0f), 0);
        progressBar.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        linearLayout.setGravity(16);
        linearLayout.addView(progressBar);
        linearLayout.addView(appCompatTextView);
        MethodCollector.o(5509);
        return linearLayout;
    }
}
