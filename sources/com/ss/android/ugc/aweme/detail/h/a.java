package com.ss.android.ugc.aweme.detail.h;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.j;
import h.f.b.l;
import h.z;

public final class a extends y {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f79646a;
    private RelativeLayout bx;
    private View by;

    /* renamed from: com.ss.android.ugc.aweme.detail.h.a$a  reason: collision with other inner class name */
    final /* synthetic */ class View$OnClickListenerC1858a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f79647a;

        static {
            Covode.recordClassIndex(49486);
        }

        View$OnClickListenerC1858a(h.f.a.b bVar) {
            this.f79647a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            l.b(this.f79647a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(49485);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.y
    public final int o() {
        return R.string.dgs;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.y
    public final void n() {
        Activity activity = this.bv;
        if (activity != null) {
            activity.setResult(-1);
        }
        Activity activity2 = this.bv;
        if (activity2 != null) {
            activity2.finish();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.b, com.ss.android.ugc.aweme.detail.h.y
    public final void m() {
        ViewGroup viewGroup;
        MethodCollector.i(4922);
        if (this.bv != null) {
            Activity activity = this.bv;
            l.b(activity, "");
            if (!activity.isFinishing()) {
                if (az_() == null) {
                    MethodCollector.o(4922);
                    return;
                } else if (this.bx != null) {
                    MethodCollector.o(4922);
                    return;
                } else {
                    Fragment az_ = az_();
                    l.b(az_, "");
                    ViewGroup viewGroup2 = (ViewGroup) az_.getView();
                    if (viewGroup2 != null) {
                        viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.b9a);
                    } else {
                        viewGroup = null;
                    }
                    View a2 = com.a.a(LayoutInflater.from(this.bv), R.layout.we, viewGroup, false);
                    l.b(a2, "");
                    this.by = a2;
                    if (viewGroup != null) {
                        viewGroup.addView(a2);
                    }
                    this.bx = new RelativeLayout(this.bv);
                    if (viewGroup2 == null) {
                        l.b();
                    }
                    viewGroup2.addView(this.bx, new ViewGroup.LayoutParams(-1, -1));
                    this.F = a(this.bx);
                    ViewGroup viewGroup3 = (ViewGroup) this.F.findViewById(R.id.vc);
                    if (viewGroup3 != null) {
                        viewGroup3.setOnClickListener(new View$OnClickListenerC1858a(new b(this)));
                    }
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(12);
                    RelativeLayout relativeLayout = this.bx;
                    if (relativeLayout != null) {
                        relativeLayout.addView(this.F, layoutParams);
                        MethodCollector.o(4922);
                        return;
                    }
                    MethodCollector.o(4922);
                    return;
                }
            }
        }
        MethodCollector.o(4922);
    }

    public a(Bundle bundle) {
        this.f79646a = bundle;
    }

    static final /* synthetic */ class b extends j implements h.f.a.b<View, z> {
        static {
            Covode.recordClassIndex(49487);
        }

        b(a aVar) {
            super(1, aVar, a.class, "clickButton", "clickButton(Landroid/view/View;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            ((a) this.receiver).n();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.y
    public final View a(RelativeLayout relativeLayout) {
        View a2 = com.a.a(LayoutInflater.from(this.bv), R.layout.wd, relativeLayout, false);
        l.b(a2, "");
        return a2;
    }
}
