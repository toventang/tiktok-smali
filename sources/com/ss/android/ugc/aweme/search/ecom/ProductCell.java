package com.ss.android.ugc.aweme.search.ecom;

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
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.ecom.a.a;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.List;

public final class ProductCell extends PowerCell<c> {

    /* renamed from: a  reason: collision with root package name */
    public SmartImageView f121021a;

    /* renamed from: b  reason: collision with root package name */
    TextView f121022b;

    /* renamed from: j  reason: collision with root package name */
    TextView f121023j;

    /* renamed from: k  reason: collision with root package name */
    ViewGroup f121024k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f121025l;

    /* renamed from: m  reason: collision with root package name */
    private SmartImageView f121026m;

    static {
        Covode.recordClassIndex(78842);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void l() {
        e eVar;
        super.l();
        c cVar = (c) this.f34234d;
        if (cVar != null && (eVar = cVar.f121060c) != null) {
            eVar.a(cVar.f121058a, getBindingAdapterPosition());
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProductCell f121027a;

        static {
            Covode.recordClassIndex(78843);
        }

        a(ProductCell productCell) {
            this.f121027a = productCell;
        }

        public final void onClick(View view) {
            a aVar;
            ClickAgent.onClick(view);
            c cVar = (c) this.f121027a.f34234d;
            if (cVar != null && (aVar = cVar.f121059b) != null) {
                aVar.a(cVar.f121058a, this.f121027a.getBindingAdapterPosition());
            }
        }
    }

    static int a(View view) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 == null) {
            return 0;
        }
        return marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ax9, viewGroup, false);
        l.b(a2, "");
        View findViewById = a2.findViewById(R.id.d_5);
        l.b(findViewById, "");
        this.f121021a = (SmartImageView) findViewById;
        View findViewById2 = a2.findViewById(R.id.d__);
        l.b(findViewById2, "");
        this.f121022b = (TextView) findViewById2;
        View findViewById3 = a2.findViewById(R.id.d_6);
        l.b(findViewById3, "");
        this.f121023j = (TextView) findViewById3;
        View findViewById4 = a2.findViewById(R.id.d_7);
        l.b(findViewById4, "");
        this.f121024k = (ViewGroup) findViewById4;
        View findViewById5 = a2.findViewById(R.id.d_9);
        l.b(findViewById5, "");
        this.f121025l = (TextView) findViewById5;
        View findViewById6 = a2.findViewById(R.id.d_8);
        l.b(findViewById6, "");
        this.f121026m = (SmartImageView) findViewById6;
        a2.setOnClickListener(new a(this));
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(c cVar) {
        String str;
        String str2;
        c cVar2 = cVar;
        l.d(cVar2, "");
        super.a((com.bytedance.ies.powerlist.b.a) cVar2);
        TextView textView = this.f121022b;
        if (textView == null) {
            l.a("titleText");
        }
        textView.setText(cVar2.f121058a.f121034b);
        TextView textView2 = this.f121023j;
        if (textView2 == null) {
            l.a("priceText");
        }
        textView2.setText(cVar2.f121058a.f121038f);
        List<String> list = cVar2.f121058a.f121037e;
        if (!(list == null || (str2 = (String) n.b((List) list, 0)) == null)) {
            v a2 = r.a(str2);
            SmartImageView smartImageView = this.f121021a;
            if (smartImageView == null) {
                l.a("coverImage");
            }
            a2.E = smartImageView;
            a2.c();
        }
        a.C3132a aVar = cVar2.f121058a.f121039g;
        UrlModel urlModel = null;
        if (aVar != null) {
            str = aVar.f121046a;
        } else {
            str = null;
        }
        a.C3132a aVar2 = cVar2.f121058a.f121039g;
        if (aVar2 != null) {
            urlModel = aVar2.f121047b;
        }
        if (!(str == null || urlModel == null)) {
            ViewGroup viewGroup = this.f121024k;
            if (viewGroup == null) {
                l.a("tagLayout");
            }
            viewGroup.setVisibility(0);
            TextView textView3 = this.f121025l;
            if (textView3 == null) {
                l.a("tagText");
            }
            textView3.setText(str);
            v a3 = r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
            SmartImageView smartImageView2 = this.f121026m;
            if (smartImageView2 == null) {
                l.a("tagIconImage");
            }
            a3.E = smartImageView2;
            a3.c();
            if (z.f158842a != null) {
                return;
            }
        }
        ViewGroup viewGroup2 = this.f121024k;
        if (viewGroup2 == null) {
            l.a("tagLayout");
        }
        viewGroup2.setVisibility(8);
    }
}
