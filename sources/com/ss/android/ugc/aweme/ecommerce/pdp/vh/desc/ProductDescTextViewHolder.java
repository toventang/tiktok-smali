package com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc;

import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.i;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.pdp.d.f;
import com.ss.android.ugc.aweme.ecommerce.pdp.d.m;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.ecommerce.util.h;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;

public final class ProductDescTextViewHolder extends AbsFullSpanVH<m> implements au {

    /* renamed from: g  reason: collision with root package name */
    public static final int f86760g = ((int) n.b(d.a(), 11.0f));

    /* renamed from: j  reason: collision with root package name */
    public static final int f86761j = ((int) n.b(d.a(), 3.0f));

    /* renamed from: k  reason: collision with root package name */
    public static final int f86762k = ((int) n.b(d.a(), 20.0f));

    /* renamed from: l  reason: collision with root package name */
    public static final a f86763l = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public final b<Integer, Object> f86764f;

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54347);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        View view = this.itemView;
        l.b(view, "");
        a.C2089a.a(view, false);
    }

    static {
        Covode.recordClassIndex(54346);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void g() {
        super.g();
        if (l.a((Object) ((m) aI_()).f86478b, (Object) "title")) {
            a(new com.ss.android.ugc.aweme.ecommerce.pdp.vh.i(aI_(), (byte) 0));
        } else {
            a((com.ss.android.ugc.aweme.ecommerce.pdp.vh.i) null);
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(Object obj) {
        int i2;
        m mVar = (m) obj;
        l.d(mVar, "");
        View view = this.itemView;
        l.b(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.text);
        String str = mVar.f86478b;
        int hashCode = str.hashCode();
        int i3 = 0;
        if (hashCode != 3735) {
            if (hashCode != 3556653) {
                if (hashCode == 110371416 && str.equals("title")) {
                    Object invoke = this.f86764f.invoke(Integer.valueOf(getAdapterPosition() + 1));
                    tuxTextView.setTuxFont(62);
                    if (!(invoke instanceof m) || !l.a((Object) ((m) invoke).f86478b, (Object) "text")) {
                        View view2 = this.itemView;
                        View view3 = this.itemView;
                        l.b(view3, "");
                        int paddingLeft = view3.getPaddingLeft();
                        int i4 = f86762k;
                        View view4 = this.itemView;
                        l.b(view4, "");
                        view2.setPadding(paddingLeft, i4, view4.getPaddingRight(), f86760g);
                    } else {
                        View view5 = this.itemView;
                        View view6 = this.itemView;
                        l.b(view6, "");
                        int paddingLeft2 = view6.getPaddingLeft();
                        int i5 = f86762k;
                        View view7 = this.itemView;
                        l.b(view7, "");
                        view5.setPadding(paddingLeft2, i5, view7.getPaddingRight(), 0);
                    }
                    View view8 = this.itemView;
                    l.b(view8, "");
                    FrameLayout frameLayout = (FrameLayout) view8.findViewById(R.id.aoo);
                    l.b(frameLayout, "");
                    frameLayout.setVisibility(8);
                    tuxTextView.setTextColor(androidx.core.content.b.c(tuxTextView.getContext(), R.color.c5));
                }
            } else if (str.equals("text")) {
                Object invoke2 = this.f86764f.invoke(Integer.valueOf(getAdapterPosition() + 1));
                Object invoke3 = this.f86764f.invoke(Integer.valueOf(getAdapterPosition() - 1));
                tuxTextView.setTuxFont(61);
                tuxTextView.setTextColor(androidx.core.content.b.c(tuxTextView.getContext(), R.color.bx));
                int i6 = h.f87571e;
                int i7 = h.f87571e;
                if ((invoke2 instanceof m) && (l.a((Object) ((m) invoke2).f86478b, (Object) "text") || l.a((Object) ((m) invoke2).f86478b, (Object) "title"))) {
                    i7 = 0;
                }
                if (!(invoke3 instanceof m) || !l.a((Object) ((m) invoke3).f86478b, (Object) "text")) {
                    i3 = i6;
                }
                View view9 = this.itemView;
                View view10 = this.itemView;
                l.b(view10, "");
                int paddingLeft3 = view10.getPaddingLeft();
                View view11 = this.itemView;
                l.b(view11, "");
                view9.setPadding(paddingLeft3, i3, view11.getPaddingRight(), i7);
                View view12 = this.itemView;
                l.b(view12, "");
                FrameLayout frameLayout2 = (FrameLayout) view12.findViewById(R.id.aoo);
                l.b(frameLayout2, "");
                frameLayout2.setVisibility(8);
            }
        } else if (str.equals("ul")) {
            tuxTextView.setTuxFont(61);
            tuxTextView.setTextColor(androidx.core.content.b.c(tuxTextView.getContext(), R.color.bx));
            View view13 = this.itemView;
            l.b(view13, "");
            FrameLayout frameLayout3 = (FrameLayout) view13.findViewById(R.id.aoo);
            l.b(frameLayout3, "");
            frameLayout3.setVisibility(0);
            Object invoke4 = this.f86764f.invoke(Integer.valueOf(getAdapterPosition() - 1));
            Object invoke5 = this.f86764f.invoke(Integer.valueOf(getAdapterPosition() + 1));
            if ((invoke4 instanceof f) || (invoke4 instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.n)) {
                i2 = h.f87571e;
            } else {
                i2 = 0;
            }
            if ((invoke5 instanceof f) || (invoke5 instanceof com.ss.android.ugc.aweme.ecommerce.pdp.d.n) || invoke5 == null) {
                i3 = h.f87571e;
            }
            View view14 = this.itemView;
            View view15 = this.itemView;
            l.b(view15, "");
            int paddingLeft4 = view15.getPaddingLeft();
            View view16 = this.itemView;
            l.b(view16, "");
            view14.setPadding(paddingLeft4, i2, view16.getPaddingRight(), i3);
        }
        View view17 = this.itemView;
        l.b(view17, "");
        TuxTextView tuxTextView2 = (TuxTextView) view17.findViewById(R.id.text);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(mVar.f86477a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super java.lang.Integer, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProductDescTextViewHolder(android.view.ViewGroup r5, h.f.a.b<? super java.lang.Integer, ? extends java.lang.Object> r6) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r5, r3)
            h.f.b.l.d(r6, r3)
            android.content.Context r2 = r5.getContext()
            r1 = 2131559011(0x7f0d0263, float:1.8743354E38)
            r0 = 0
            android.view.View r0 = com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(r2, r1, r5, r0)
            h.f.b.l.b(r0, r3)
            r4.<init>(r0)
            r4.f86764f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescTextViewHolder.<init>(android.view.ViewGroup, h.f.a.b):void");
    }
}
