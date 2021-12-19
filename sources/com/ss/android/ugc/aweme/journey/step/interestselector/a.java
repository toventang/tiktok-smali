package com.ss.android.ugc.aweme.journey.step.interestselector;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.h.i;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.journey.d;
import com.ss.android.ugc.aweme.journey.e;
import com.ss.android.ugc.aweme.journey.g;
import com.ss.android.ugc.aweme.journey.r;
import com.ss.android.ugc.aweme.journey.ui.c;
import com.ss.android.ugc.aweme.journey.w;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

public class a extends g {

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet<Integer> f105041b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet<Integer> f105042c;

    /* renamed from: d  reason: collision with root package name */
    public List<w> f105043d;

    /* renamed from: e  reason: collision with root package name */
    public final b<Integer, z> f105044e;

    /* renamed from: f  reason: collision with root package name */
    public final r f105045f;

    static {
        Covode.recordClassIndex(67357);
    }

    @Override // com.ss.android.ugc.aweme.journey.g
    public final int a() {
        return this.f105043d.size();
    }

    @Override // com.ss.android.ugc.aweme.journey.g
    public final RecyclerView.ViewHolder b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.abp, viewGroup, false);
        l.b(a2, "");
        return new C2682a(this, a2);
    }

    @Override // com.ss.android.ugc.aweme.journey.g
    public e a(ViewGroup viewGroup) {
        String str;
        l.d(viewGroup, "");
        String str2 = this.f104858a;
        if (str2 == null) {
            str2 = "";
        }
        r rVar = this.f105045f;
        if (rVar == null || (str = rVar.f104907b) == null) {
            str = "";
        }
        d a2 = d.a.a(viewGroup, str2, str);
        View view = a2.itemView;
        l.b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        View view2 = a2.itemView;
        l.b(view2, "");
        marginLayoutParams.bottomMargin = (int) n.b(view2.getContext(), 28.0f);
        View view3 = a2.itemView;
        l.b(view3, "");
        view3.setLayoutParams(marginLayoutParams);
        return a2;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.a$a  reason: collision with other inner class name */
    public final class C2682a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final int f105046a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f105047b;

        /* renamed from: c  reason: collision with root package name */
        private final com.ss.android.ugc.aweme.journey.ui.a f105048c;

        /* renamed from: d  reason: collision with root package name */
        private final c f105049d;

        /* renamed from: e  reason: collision with root package name */
        private final c f105050e;

        static {
            Covode.recordClassIndex(67358);
        }

        public final void a(boolean z) {
            View view = this.itemView;
            l.b(view, "");
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bqs);
            l.b(linearLayout, "");
            linearLayout.setSelected(z);
            if (com.ss.android.ugc.aweme.journey.a.b.a()) {
                View view2 = this.itemView;
                l.b(view2, "");
                LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.bqs);
                l.b(linearLayout2, "");
                SmartImageView smartImageView = (SmartImageView) linearLayout2.findViewById(R.id.bmk);
                l.b(smartImageView, "");
                smartImageView.setVisibility(0);
            } else {
                View view3 = this.itemView;
                l.b(view3, "");
                LinearLayout linearLayout3 = (LinearLayout) view3.findViewById(R.id.bqs);
                l.b(linearLayout3, "");
                SmartImageView smartImageView2 = (SmartImageView) linearLayout3.findViewById(R.id.bmk);
                l.b(smartImageView2, "");
                smartImageView2.setVisibility(8);
                View view4 = this.itemView;
                l.b(view4, "");
                LinearLayout linearLayout4 = (LinearLayout) view4.findViewById(R.id.bqs);
                l.b(linearLayout4, "");
                TuxTextView tuxTextView = (TuxTextView) linearLayout4.findViewById(R.id.text);
                l.b(tuxTextView, "");
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                Integer valueOf = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics())));
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                i.b(tuxTextView, valueOf, null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()))), null, false, 26);
            }
            if (z) {
                View view5 = this.itemView;
                l.b(view5, "");
                LinearLayout linearLayout5 = (LinearLayout) view5.findViewById(R.id.bqs);
                l.b(linearLayout5, "");
                linearLayout5.setBackground(this.f105050e);
                View view6 = this.itemView;
                l.b(view6, "");
                LinearLayout linearLayout6 = (LinearLayout) view6.findViewById(R.id.bqs);
                l.b(linearLayout6, "");
                View view7 = this.itemView;
                l.b(view7, "");
                ((TuxTextView) linearLayout6.findViewById(R.id.text)).setTextColor(view7.getResources().getColor(R.color.a9));
                if (com.ss.android.ugc.aweme.journey.a.b.a()) {
                    View view8 = this.itemView;
                    l.b(view8, "");
                    LinearLayout linearLayout7 = (LinearLayout) view8.findViewById(R.id.bqs);
                    l.b(linearLayout7, "");
                    ((SimpleDraweeView) linearLayout7.findViewById(R.id.bmk)).setActualImageResource(2131232213);
                    return;
                }
                return;
            }
            View view9 = this.itemView;
            l.b(view9, "");
            LinearLayout linearLayout8 = (LinearLayout) view9.findViewById(R.id.bqs);
            l.b(linearLayout8, "");
            linearLayout8.setBackground(this.f105049d);
            View view10 = this.itemView;
            l.b(view10, "");
            LinearLayout linearLayout9 = (LinearLayout) view10.findViewById(R.id.bqs);
            l.b(linearLayout9, "");
            View view11 = this.itemView;
            l.b(view11, "");
            Context context = view11.getContext();
            l.b(context, "");
            ((TuxTextView) linearLayout9.findViewById(R.id.text)).setTextColor(context.getResources().getColor(R.color.bx));
            if (com.ss.android.ugc.aweme.journey.a.b.a()) {
                String str = this.f105047b.f105043d.get(getAdapterPosition() - 1).f105211c;
                if (str == null) {
                    str = "";
                }
                v a2 = com.bytedance.lighten.a.r.a(str);
                int i2 = this.f105046a;
                v a3 = a2.a(i2, i2);
                View view12 = this.itemView;
                l.b(view12, "");
                v a4 = a3.a(view12.getContext().getClass().getName());
                View view13 = this.itemView;
                l.b(view13, "");
                LinearLayout linearLayout10 = (LinearLayout) view13.findViewById(R.id.bqs);
                l.b(linearLayout10, "");
                a4.E = (SmartImageView) linearLayout10.findViewById(R.id.bmk);
                a4.a(new com.ss.android.ugc.aweme.bj.a());
                return;
            }
            View view14 = this.itemView;
            l.b(view14, "");
            LinearLayout linearLayout11 = (LinearLayout) view14.findViewById(R.id.bqs);
            l.b(linearLayout11, "");
            SmartImageView smartImageView3 = (SmartImageView) linearLayout11.findViewById(R.id.bmk);
            l.b(smartImageView3, "");
            smartImageView3.setVisibility(8);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2682a(a aVar, View view) {
            super(view);
            l.d(view, "");
            this.f105047b = aVar;
            Context context = view.getContext();
            l.b(context, "");
            com.ss.android.ugc.aweme.journey.ui.a a2 = com.ss.android.ugc.aweme.journey.ui.b.a(context);
            this.f105048c = a2;
            c cVar = new c(view.getResources().getColor(R.color.f159928l), a2);
            this.f105049d = cVar;
            this.f105050e = new c(view.getResources().getColor(R.color.bh), a2);
            View view2 = this.itemView;
            l.b(view2, "");
            this.f105046a = (int) n.b(view2.getContext(), 28.0f);
            View view3 = this.itemView;
            l.b(view3, "");
            Context context2 = view3.getContext();
            l.b(context2, "");
            cVar.a(context2.getResources().getColor(R.color.b6));
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.journey.step.interestselector.a.C2682a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C2682a f105051a;

                static {
                    Covode.recordClassIndex(67359);
                }

                {
                    this.f105051a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    int adapterPosition = this.f105051a.getAdapterPosition() - 1;
                    View view2 = this.f105051a.itemView;
                    l.b(view2, "");
                    LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.bqs);
                    l.b(linearLayout, "");
                    boolean isSelected = linearLayout.isSelected();
                    if (isSelected) {
                        this.f105051a.f105047b.f105042c.remove(Integer.valueOf(adapterPosition));
                    } else {
                        this.f105051a.f105047b.f105042c.add(Integer.valueOf(adapterPosition));
                    }
                    this.f105051a.a(!isSelected);
                    this.f105051a.f105047b.f105044e.invoke(Integer.valueOf(this.f105051a.f105047b.f105042c.size()));
                }
            });
            view.setLayerType(1, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if (viewHolder instanceof C2682a) {
            C2682a aVar = (C2682a) viewHolder;
            int adapterPosition = aVar.getAdapterPosition() - 1;
            View view = aVar.itemView;
            l.b(view, "");
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.text);
            l.b(tuxTextView, "");
            tuxTextView.setText(aVar.f105047b.f105043d.get(adapterPosition).f105210b);
            aVar.a(aVar.f105047b.f105042c.contains(Integer.valueOf(adapterPosition)));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(java.util.List<com.ss.android.ugc.aweme.journey.w> r6, boolean r7, h.f.a.b<? super java.lang.Integer, h.z> r8, com.ss.android.ugc.aweme.journey.r r9) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r6, r0)
            h.f.b.l.d(r8, r0)
            if (r9 == 0) goto L_0x0057
            java.lang.String r0 = r9.f104906a
        L_0x000c:
            r5.<init>(r0)
            r5.f105043d = r6
            r5.f105044e = r8
            r5.f105045f = r9
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r5.f105041b = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r5.f105042c = r0
            if (r7 == 0) goto L_0x0059
            java.util.List<com.ss.android.ugc.aweme.journey.w> r0 = r5.f105043d
            r4 = 0
            java.util.Iterator r3 = r0.iterator()
        L_0x002c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r3.next()
            int r2 = r4 + 1
            if (r4 >= 0) goto L_0x003d
            h.a.n.a()
        L_0x003d:
            com.ss.android.ugc.aweme.journey.w r0 = (com.ss.android.ugc.aweme.journey.w) r0
            java.lang.Boolean r1 = r0.f105214f
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = h.f.b.l.a(r1, r0)
            if (r0 == 0) goto L_0x0055
            java.util.LinkedHashSet<java.lang.Integer> r1 = r5.f105041b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.add(r0)
        L_0x0055:
            r4 = r2
            goto L_0x002c
        L_0x0057:
            r0 = 0
            goto L_0x000c
        L_0x0059:
            java.util.LinkedHashSet<java.lang.Integer> r1 = r5.f105042c
            java.util.LinkedHashSet<java.lang.Integer> r0 = r5.f105041b
            r1.addAll(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.journey.step.interestselector.a.<init>(java.util.List, boolean, h.f.a.b, com.ss.android.ugc.aweme.journey.r):void");
    }
}
