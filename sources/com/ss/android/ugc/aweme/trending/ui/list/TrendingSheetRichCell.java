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
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.search.l;
import com.ss.android.ugc.aweme.trending.ui.f;
import com.ss.android.ugc.aweme.trending.ui.list.c;
import com.ss.android.ugc.aweme.utils.hv;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.m;
import h.z;

public final class TrendingSheetRichCell extends PowerCell<c> {

    /* renamed from: a  reason: collision with root package name */
    public static final int f141129a;

    /* renamed from: m  reason: collision with root package name */
    private static final b f141130m = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private TextView f141131b;

    /* renamed from: j  reason: collision with root package name */
    private TextView f141132j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f141133k;

    /* renamed from: l  reason: collision with root package name */
    private SmartImageView f141134l;

    static final class b {
        static {
            Covode.recordClassIndex(92155);
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
        c cVar;
        c.a aVar;
        super.l();
        c cVar2 = (c) this.f34234d;
        if (cVar2 != null && (lVar = cVar2.f141158a) != null && (cVar = (c) this.f34234d) != null && (aVar = cVar.f141160c) != null) {
            aVar.a(true, lVar);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void m() {
        l lVar;
        c cVar;
        c.a aVar;
        super.m();
        c cVar2 = (c) this.f34234d;
        if (cVar2 != null && (lVar = cVar2.f141158a) != null && (cVar = (c) this.f34234d) != null && (aVar = cVar.f141160c) != null) {
            aVar.a(false, lVar);
        }
    }

    static {
        Covode.recordClassIndex(92153);
        Resources system = Resources.getSystem();
        h.f.b.l.a((Object) system, "");
        f141129a = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f141135a;

        static {
            Covode.recordClassIndex(92156);
        }

        c(c cVar) {
            this.f141135a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            c.a aVar = this.f141135a.f141160c;
            if (aVar != null) {
                h.f.b.l.b(view, "");
                aVar.a(view, this.f141135a);
            }
        }
    }

    static final class a extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ int $resId;
        final /* synthetic */ TextView $this_apply$inlined;

        static {
            Covode.recordClassIndex(92154);
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
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b53, viewGroup, false);
        h.f.b.l.b(a2, "");
        View findViewById = a2.findViewById(R.id.er_);
        h.f.b.l.b(findViewById, "");
        this.f141131b = (TextView) findViewById;
        View findViewById2 = a2.findViewById(R.id.era);
        h.f.b.l.b(findViewById2, "");
        this.f141132j = (TextView) findViewById2;
        View findViewById3 = a2.findViewById(R.id.erb);
        h.f.b.l.b(findViewById3, "");
        this.f141133k = (TextView) findViewById3;
        View findViewById4 = a2.findViewById(R.id.er9);
        h.f.b.l.b(findViewById4, "");
        this.f141134l = (SmartImageView) findViewById4;
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(c cVar) {
        int i2;
        long j2;
        c cVar2 = cVar;
        h.f.b.l.d(cVar2, "");
        TextView textView = this.f141131b;
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
        TextView textView2 = this.f141132j;
        if (textView2 == null) {
            h.f.b.l.a("titleText");
        }
        Integer a2 = f.a(Integer.valueOf(cVar2.f141158a.getIconType()));
        if (a2 != null) {
            com.bytedance.tux.c.a a3 = com.bytedance.tux.c.c.a(new a(a2.intValue(), textView2));
            Context context = textView2.getContext();
            h.f.b.l.b(context, "");
            com.bytedance.tux.c.b a4 = a3.a(context);
            int i3 = f141129a;
            a4.setBounds(0, 0, i3, i3);
            hv.a(textView2, cVar2.f141158a.getTrendingName(), a4);
        } else {
            textView2.setText(cVar2.f141158a.getTrendingName());
        }
        TextView textView3 = this.f141133k;
        if (textView3 == null) {
            h.f.b.l.a("viewCountText");
        }
        Long heatValue = cVar2.f141158a.getHeatValue();
        if (heatValue != null) {
            j2 = heatValue.longValue();
        } else {
            j2 = 0;
        }
        textView3.setText(com.ss.android.ugc.aweme.i18n.b.a(j2));
        SmartImageView smartImageView = this.f141134l;
        if (smartImageView == null) {
            h.f.b.l.a("coverImage");
        }
        v a5 = r.a(new com.ss.android.ugc.aweme.base.l(cVar2.f141158a.getCoverUrl(), n.a(cVar2.f141158a.getCoverUrl())));
        a5.n = androidx.core.content.b.a(smartImageView.getContext(), (int) R.drawable.bn9);
        a5.E = smartImageView;
        a5.c();
        View view = this.itemView;
        h.f.b.l.b(view, "");
        view.setSelected(cVar2.f141159b);
        this.itemView.setOnClickListener(new c(cVar2));
    }
}
