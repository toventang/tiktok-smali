package com.ss.android.ugc.aweme.hybridkit.b;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.a.g;
import com.bytedance.hybrid.spark.a.h;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public g f99735a;

    /* renamed from: b  reason: collision with root package name */
    private DmtStatusView f99736b;

    static {
        Covode.recordClassIndex(63573);
    }

    @Override // com.bytedance.hybrid.spark.a.h
    public final View a() {
        DmtStatusView dmtStatusView = this.f99736b;
        if (dmtStatusView == null) {
            l.a("statusView");
        }
        dmtStatusView.f();
        DmtStatusView dmtStatusView2 = this.f99736b;
        if (dmtStatusView2 == null) {
            l.a("statusView");
        }
        return dmtStatusView2;
    }

    /* renamed from: com.ss.android.ugc.aweme.hybridkit.b.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC2443a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99737a;

        static {
            Covode.recordClassIndex(63574);
        }

        View$OnClickListenerC2443a(a aVar) {
            this.f99737a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            g gVar = this.f99737a.f99735a;
            if (gVar != null) {
                gVar.b();
            }
        }
    }

    @Override // com.bytedance.hybrid.spark.a.h
    public final View a(g gVar) {
        l.d(gVar, "");
        this.f99735a = gVar;
        DmtStatusView dmtStatusView = this.f99736b;
        if (dmtStatusView == null) {
            l.a("statusView");
        }
        dmtStatusView.h();
        DmtStatusView dmtStatusView2 = this.f99736b;
        if (dmtStatusView2 == null) {
            l.a("statusView");
        }
        return dmtStatusView2;
    }

    @Override // com.bytedance.hybrid.spark.a.h
    public final void a(Context context) {
        l.d(context, "");
        this.f99736b = new DmtStatusView(context);
        DmtStatusView.a a2 = DmtStatusView.a.a(context).a(R.string.h2z, R.string.h2y, R.string.h35, new View$OnClickListenerC2443a(this));
        DmtStatusView dmtStatusView = this.f99736b;
        if (dmtStatusView == null) {
            l.a("statusView");
        }
        dmtStatusView.setBuilder(a2);
    }
}
