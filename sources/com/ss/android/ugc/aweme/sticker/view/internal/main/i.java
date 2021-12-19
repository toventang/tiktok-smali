package com.ss.android.ugc.aweme.sticker.view.internal.main;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.sticker.view.internal.d;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.p;
import h.v;
import h.z;

public final class i implements d {

    /* renamed from: a  reason: collision with root package name */
    private final View f136305a;

    /* renamed from: b  reason: collision with root package name */
    private final View f136306b;

    /* renamed from: c  reason: collision with root package name */
    private final FrameLayout f136307c;

    static {
        Covode.recordClassIndex(89024);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f136308a;

        static {
            Covode.recordClassIndex(89025);
        }

        a(h.f.a.a aVar) {
            this.f136308a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f136308a.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.d
    public final void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f136306b.setOnClickListener(new a(aVar));
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.d
    public final void a(boolean z) {
        int i2;
        int i3;
        int childCount = this.f136307c.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = this.f136307c.getChildAt(i4);
            if (childAt == this.f136305a) {
                if (z) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                childAt.setVisibility(i3);
            } else {
                l.b(childAt, "");
                if (!z) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                childAt.setVisibility(i2);
            }
        }
    }

    public i(FrameLayout frameLayout, b<? super ViewGroup, ? extends p<? extends View, ? extends View>> bVar) {
        p pVar;
        l.d(frameLayout, "");
        MethodCollector.i(9239);
        this.f136307c = frameLayout;
        if (bVar == null || (pVar = (p) bVar.invoke(frameLayout)) == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(frameLayout.getContext());
            appCompatTextView.setText(R.string.bpc);
            appCompatTextView.setTextColor(-1);
            appCompatTextView.setGravity(17);
            pVar = v.a(appCompatTextView, appCompatTextView);
        }
        frameLayout.addView((View) pVar.getFirst(), -1, -1);
        this.f136305a = (View) pVar.component1();
        this.f136306b = (View) pVar.component2();
        MethodCollector.o(9239);
    }
}
