package com.ss.android.ugc.aweme.ecommerce.common.a;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.jedi.ext.adapter.a.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f85726a;

    /* renamed from: b  reason: collision with root package name */
    public final h.f.a.a<z> f85727b;

    /* renamed from: c  reason: collision with root package name */
    private final DmtLoadingLayout f85728c;

    /* renamed from: d  reason: collision with root package name */
    private final View f85729d;

    static {
        Covode.recordClassIndex(53610);
    }

    @Override // com.bytedance.jedi.ext.adapter.a.e
    public final View a() {
        return this.f85729d;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f85730a;

        static {
            Covode.recordClassIndex(53611);
        }

        a(c cVar) {
            this.f85730a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f85730a.f85727b.invoke();
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.a.e
    public final void a(int i2) {
        if (i2 == 241) {
            this.f85728c.setVisibility(8);
            DmtTextView dmtTextView = (DmtTextView) this.f85729d.findViewById(R.id.ci7);
            l.b(dmtTextView, "");
            dmtTextView.setVisibility(8);
        } else if (i2 == 242) {
            this.f85728c.setVisibility(0);
            DmtTextView dmtTextView2 = (DmtTextView) this.f85729d.findViewById(R.id.ci7);
            l.b(dmtTextView2, "");
            dmtTextView2.setVisibility(8);
        } else if (i2 == 243) {
            this.f85728c.setVisibility(8);
            DmtTextView dmtTextView3 = (DmtTextView) this.f85729d.findViewById(R.id.ci7);
            l.b(dmtTextView3, "");
            dmtTextView3.setVisibility(8);
        } else if (i2 == 244) {
            this.f85728c.setVisibility(8);
            DmtTextView dmtTextView4 = (DmtTextView) this.f85729d.findViewById(R.id.ci7);
            l.b(dmtTextView4, "");
            dmtTextView4.setVisibility(0);
            this.f85729d.setOnClickListener(new a(this));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ c(android.view.ViewGroup r4, h.f.a.a r5) {
        /*
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131558974(0x7f0d023e, float:1.8743279E38)
            r0 = 0
            android.view.View r1 = com.a.a(r2, r1, r4, r0)
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
            r3.<init>(r4, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.common.a.c.<init>(android.view.ViewGroup, h.f.a.a):void");
    }

    private c(ViewGroup viewGroup, h.f.a.a<z> aVar, View view) {
        l.d(viewGroup, "");
        l.d(aVar, "");
        l.d(view, "");
        this.f85726a = viewGroup;
        this.f85727b = aVar;
        this.f85729d = view;
        View findViewById = view.findViewById(R.id.ci9);
        l.b(findViewById, "");
        this.f85728c = (DmtLoadingLayout) findViewById;
    }
}
