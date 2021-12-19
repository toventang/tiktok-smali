package com.ss.android.ugc.aweme.cell;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.ss.android.ugc.aweme.be.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class DisclosureCell extends TuxCell<d, c.f> {

    /* renamed from: b  reason: collision with root package name */
    private TuxSpinner f69821b;

    /* renamed from: j  reason: collision with root package name */
    private View f69822j;

    static {
        Covode.recordClassIndex(43054);
    }

    private final View a() {
        View view;
        d dVar = (d) this.f34234d;
        if ((dVar == null || (view = dVar.f68564e) == null) && (view = this.f69821b) == null) {
            l.a("spinner");
        }
        return view;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void k() {
        super.k();
        View view = this.itemView;
        l.b(view, "");
        View findViewById = ((TuxTextCell) view.findViewById(R.id.a3i)).findViewById(R.id.euh).findViewById(R.id.icon_iv);
        l.b(findViewById, "");
        this.f69822j = findViewById;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DisclosureCell f69823a;

        static {
            Covode.recordClassIndex(43055);
        }

        a(DisclosureCell disclosureCell) {
            this.f69823a = disclosureCell;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            d dVar = (d) this.f69823a.f34234d;
            if (dVar != null && (onClickListener = dVar.f68562c) != null) {
                View view2 = this.f69823a.itemView;
                l.b(view2, "");
                onClickListener.onClick(view2.findViewById(R.id.a3i));
            }
        }
    }

    /* Return type fixed from 'com.bytedance.tux.table.cell.c$b' to match base method */
    @Override // com.ss.android.ugc.aweme.cell.TuxCell
    public final /* synthetic */ c.f a(Context context) {
        l.d(context, "");
        TuxSpinner tuxSpinner = new TuxSpinner(context, null, 0, 6);
        tuxSpinner.a(R.raw.icon_spinner_thin, R.attr.bj);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        int a2 = h.g.a.a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, h.g.a.a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics())));
        layoutParams.gravity = 17;
        tuxSpinner.setLayoutParams(layoutParams);
        tuxSpinner.setVisibility(8);
        this.f69821b = tuxSpinner;
        c.f fVar = new c.f(context);
        fVar.a(new a(this));
        return fVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        if (h.z.f158842a == null) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.ss.android.ugc.aweme.be.d r6) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.cell.DisclosureCell.a(com.ss.android.ugc.aweme.be.d):void");
    }
}
