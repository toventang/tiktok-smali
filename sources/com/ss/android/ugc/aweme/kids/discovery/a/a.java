package com.ss.android.ugc.aweme.kids.discovery.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.kids.discovery.a.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class a extends e.b {

    /* renamed from: a  reason: collision with root package name */
    public DmtStatusView f106377a;

    static {
        Covode.recordClassIndex(67986);
    }

    public static final class b implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DmtStatusView f106379a;

        static {
            Covode.recordClassIndex(67988);
        }

        public final void onViewDetachedFromWindow(View view) {
        }

        b(DmtStatusView dmtStatusView) {
            this.f106379a = dmtStatusView;
        }

        public final void onViewAttachedToWindow(View view) {
            if (this.f106379a.j() && view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.a.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC2712a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f106378a;

        static {
            Covode.recordClassIndex(67987);
        }

        View$OnClickListenerC2712a(e eVar) {
            this.f106378a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            e eVar = this.f106378a;
            eVar.b(1);
            eVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.discovery.a.e.b
    public void a(int i2) {
        DmtStatusView dmtStatusView;
        if (i2 == 0) {
            DmtStatusView dmtStatusView2 = this.f106377a;
            if (dmtStatusView2 != null) {
                dmtStatusView2.setStatus(-1);
            }
        } else if (i2 == 1) {
            DmtStatusView dmtStatusView3 = this.f106377a;
            if (dmtStatusView3 != null) {
                dmtStatusView3.setStatus(0);
            }
        } else if (i2 == 2) {
            DmtStatusView dmtStatusView4 = this.f106377a;
            if (dmtStatusView4 != null) {
                dmtStatusView4.setStatus(1);
            }
        } else if (i2 == 3 && (dmtStatusView = this.f106377a) != null) {
            dmtStatusView.setStatus(2);
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.discovery.a.e.b
    public final View a(ViewGroup viewGroup, e eVar) {
        MethodCollector.i(4257);
        l.d(viewGroup, "");
        l.d(eVar, "");
        DmtStatusView dmtStatusView = new DmtStatusView(viewGroup.getContext());
        dmtStatusView.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) n.b(viewGroup.getContext(), 60.0f)));
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bjc, (ViewGroup) null);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            textView.setGravity(17);
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bjc, (ViewGroup) null);
            if (inflate2 != null) {
                TextView textView2 = (TextView) inflate2;
                textView2.setText(R.string.cyt);
                textView2.setOnClickListener(new View$OnClickListenerC2712a(eVar));
                textView2.setGravity(17);
                DmtLoadingLayout dmtLoadingLayout = new DmtLoadingLayout(viewGroup.getContext());
                dmtLoadingLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                dmtLoadingLayout.addOnAttachStateChangeListener(new b(dmtStatusView));
                dmtStatusView.setBuilder(new DmtStatusView.a(viewGroup.getContext()).a(dmtLoadingLayout).b(textView).c(textView2));
                this.f106377a = dmtStatusView;
                MethodCollector.o(4257);
                return dmtStatusView;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            MethodCollector.o(4257);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        MethodCollector.o(4257);
        throw nullPointerException2;
    }
}
