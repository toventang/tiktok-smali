package com.ss.android.ugc.aweme.trending.ui.list;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.search.l;
import com.ss.android.ugc.aweme.trending.ui.f;
import com.ss.android.ugc.aweme.trending.ui.list.b;
import com.ss.android.ugc.aweme.utils.hv;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.z;

public final class TrendingSheetCell extends PowerCell<b> {

    /* renamed from: a  reason: collision with root package name */
    public static final int f141123a;

    /* renamed from: l  reason: collision with root package name */
    private static final b f141124l = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private TextView f141125b;

    /* renamed from: j  reason: collision with root package name */
    private TextView f141126j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f141127k;

    static final class b {
        static {
            Covode.recordClassIndex(92151);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void l() {
        l lVar;
        b bVar;
        b.a aVar;
        super.l();
        b bVar2 = (b) this.f34234d;
        if (bVar2 != null && (lVar = bVar2.f141155a) != null && (bVar = (b) this.f34234d) != null && (aVar = bVar.f141157c) != null) {
            aVar.a(true, lVar);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void m() {
        l lVar;
        b bVar;
        b.a aVar;
        super.m();
        b bVar2 = (b) this.f34234d;
        if (bVar2 != null && (lVar = bVar2.f141155a) != null && (bVar = (b) this.f34234d) != null && (aVar = bVar.f141157c) != null) {
            aVar.a(false, lVar);
        }
    }

    static {
        Covode.recordClassIndex(92149);
        Resources system = Resources.getSystem();
        h.f.b.l.a((Object) system, "");
        f141123a = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f141128a;

        static {
            Covode.recordClassIndex(92152);
        }

        c(b bVar) {
            this.f141128a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            b.a aVar = this.f141128a.f141157c;
            if (aVar != null) {
                h.f.b.l.b(view, "");
                aVar.a(view, this.f141128a);
            }
        }
    }

    static final class a extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ int $resId;
        final /* synthetic */ TextView $this_apply$inlined;

        static {
            Covode.recordClassIndex(92150);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2, TextView textView) {
            super(1);
            this.$resId = i2;
            this.$this_apply$inlined = textView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = this.$resId;
            aVar2.f44752d = Integer.valueOf(androidx.core.content.b.c(this.$this_apply$inlined.getContext(), R.color.bh));
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b52, viewGroup, false);
        h.f.b.l.b(a2, "");
        View findViewById = a2.findViewById(R.id.eqt);
        h.f.b.l.b(findViewById, "");
        this.f141125b = (TextView) findViewById;
        View findViewById2 = a2.findViewById(R.id.eqv);
        h.f.b.l.b(findViewById2, "");
        this.f141126j = (TextView) findViewById2;
        View findViewById3 = a2.findViewById(R.id.eqw);
        h.f.b.l.b(findViewById3, "");
        this.f141127k = (TextView) findViewById3;
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(b bVar) {
        int i2;
        long j2;
        b bVar2 = bVar;
        h.f.b.l.d(bVar2, "");
        TextView textView = this.f141125b;
        if (textView == null) {
            h.f.b.l.a("numberText");
        }
        int adapterPosition = getAdapterPosition();
        if (adapterPosition >= 0 && 2 >= adapterPosition) {
            i2 = R.color.bh;
        } else {
            i2 = R.color.bz;
        }
        textView.setText(String.valueOf(adapterPosition + 1));
        textView.setTextColor(androidx.core.content.b.c(textView.getContext(), i2));
        TextView textView2 = this.f141126j;
        if (textView2 == null) {
            h.f.b.l.a("titleText");
        }
        Integer a2 = f.a(Integer.valueOf(bVar2.f141155a.getIconType()));
        if (a2 != null) {
            com.bytedance.tux.c.a a3 = com.bytedance.tux.c.c.a(new a(a2.intValue(), textView2));
            Context context = textView2.getContext();
            h.f.b.l.b(context, "");
            com.bytedance.tux.c.b a4 = a3.a(context);
            int i3 = f141123a;
            a4.setBounds(0, 0, i3, i3);
            hv.a(textView2, bVar2.f141155a.getTrendingName(), a4);
        } else {
            textView2.setText(bVar2.f141155a.getTrendingName());
        }
        TextView textView3 = this.f141127k;
        if (textView3 == null) {
            h.f.b.l.a("viewCountText");
        }
        Long heatValue = bVar2.f141155a.getHeatValue();
        if (heatValue != null) {
            j2 = heatValue.longValue();
        } else {
            j2 = 0;
        }
        textView3.setText(com.ss.android.ugc.aweme.i18n.b.a(j2));
        View view = this.itemView;
        h.f.b.l.b(view, "");
        view.setSelected(bVar2.f141156b);
        this.itemView.setOnClickListener(new c(bVar2));
    }
}
