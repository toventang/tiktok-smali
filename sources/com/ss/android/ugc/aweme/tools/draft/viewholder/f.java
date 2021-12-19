package com.ss.android.ugc.aweme.tools.draft.viewholder;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.tools.draft.d.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class f extends a<com.ss.android.ugc.aweme.tools.draft.d.a> {

    /* renamed from: a  reason: collision with root package name */
    public DmtStatusView f139920a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f139921b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.tools.draft.f.a f139922c;

    /* renamed from: d  reason: collision with root package name */
    private RelativeLayout f139923d;

    static {
        Covode.recordClassIndex(91437);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f139924a;

        static {
            Covode.recordClassIndex(91438);
        }

        a(f fVar) {
            this.f139924a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f139924a.f139921b.setVisibility(8);
            if (this.f139924a.f139920a.j()) {
                this.f139924a.f139920a.d();
            }
            this.f139924a.f139920a.f();
            this.f139924a.f139922c.e();
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.viewholder.a
    public final void a(com.ss.android.ugc.aweme.tools.draft.d.a aVar) {
        l.d(aVar, "");
        DmtStatusView dmtStatusView = this.f139920a;
        View view = this.itemView;
        l.b(view, "");
        dmtStatusView.setBuilder(DmtStatusView.a.a(view.getContext()));
        int i2 = ((k) aVar).f139507c;
        if (i2 == 0) {
            this.f139921b.setVisibility(8);
            if (this.f139920a.j()) {
                this.f139920a.d();
            }
            this.f139920a.f();
        } else if (i2 == 1) {
            this.f139920a.setVisibility(8);
            this.f139921b.setVisibility(0);
        }
        this.f139923d.setOnClickListener(new a(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(View view, com.ss.android.ugc.aweme.tools.draft.f.a aVar) {
        super(view);
        l.d(view, "");
        l.d(aVar, "");
        this.f139922c = aVar;
        View findViewById = view.findViewById(R.id.e_t);
        l.b(findViewById, "");
        this.f139920a = (DmtStatusView) findViewById;
        View findViewById2 = view.findViewById(R.id.f2l);
        l.b(findViewById2, "");
        this.f139921b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.doi);
        l.b(findViewById3, "");
        this.f139923d = (RelativeLayout) findViewById3;
    }
}
