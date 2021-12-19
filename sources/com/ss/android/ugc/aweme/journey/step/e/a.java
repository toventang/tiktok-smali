package com.ss.android.ugc.aweme.journey.step.e;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.journey.ac;
import com.ss.android.ugc.aweme.journey.d;
import com.ss.android.ugc.aweme.journey.e;
import com.ss.android.ugc.aweme.journey.g;
import com.ss.android.ugc.aweme.journey.ui.c;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.Objects;

public final class a extends g {

    /* renamed from: b  reason: collision with root package name */
    public Integer f104981b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f104982c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ac> f104983d;

    /* renamed from: e  reason: collision with root package name */
    public final String f104984e;

    /* renamed from: f  reason: collision with root package name */
    public final String f104985f;

    /* renamed from: g  reason: collision with root package name */
    public final b<Integer, z> f104986g;

    static {
        Covode.recordClassIndex(67308);
    }

    @Override // com.ss.android.ugc.aweme.journey.g
    public final int a() {
        return this.f104983d.size();
    }

    @Override // com.ss.android.ugc.aweme.journey.g
    public final RecyclerView.ViewHolder b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.abo, viewGroup, false);
        l.b(a2, "");
        return new C2677a(this, a2);
    }

    @Override // com.ss.android.ugc.aweme.journey.g
    public final e a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        String str = this.f104858a;
        if (str == null) {
            str = "";
        }
        String str2 = this.f104985f;
        if (str2 == null) {
            str2 = "";
        }
        d a2 = d.a.a(viewGroup, str, str2);
        View view = a2.itemView;
        l.b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        View view2 = a2.itemView;
        l.b(view2, "");
        marginLayoutParams.bottomMargin = (int) n.b(view2.getContext(), 48.0f);
        View view3 = a2.itemView;
        l.b(view3, "");
        view3.setLayoutParams(marginLayoutParams);
        return a2;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.e.a$a  reason: collision with other inner class name */
    public final class C2677a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f104987a;

        /* renamed from: b  reason: collision with root package name */
        private final com.ss.android.ugc.aweme.journey.ui.a f104988b;

        /* renamed from: c  reason: collision with root package name */
        private final c f104989c;

        static {
            Covode.recordClassIndex(67309);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2677a(a aVar, final View view) {
            super(view);
            l.d(view, "");
            this.f104987a = aVar;
            Context context = view.getContext();
            l.b(context, "");
            l.d(context, "");
            com.ss.android.ugc.aweme.journey.ui.a aVar2 = new com.ss.android.ugc.aweme.journey.ui.a(n.b(context, 8.0f), BlurMaskFilter.Blur.NORMAL, n.b(context, 2.0f), Color.parseColor("#1f000000"), n.b(context, 2.0f));
            this.f104988b = aVar2;
            View view2 = this.itemView;
            l.b(view2, "");
            Context context2 = view2.getContext();
            l.b(context2, "");
            c cVar = new c(context2.getResources().getColor(R.color.f159928l), aVar2);
            this.f104989c = cVar;
            View view3 = this.itemView;
            l.b(view3, "");
            Context context3 = view3.getContext();
            l.b(context3, "");
            cVar.a(context3.getResources().getColor(R.color.b6));
            view.setBackground(cVar);
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.journey.step.e.a.C2677a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C2677a f104990a;

                static {
                    Covode.recordClassIndex(67310);
                }

                {
                    this.f104990a = r1;
                }

                public final void onClick(View view) {
                    Integer num;
                    ClickAgent.onClick(view);
                    int adapterPosition = this.f104990a.getAdapterPosition() - 1;
                    ImageView imageView = (ImageView) view.findViewById(R.id.a5y);
                    l.b(imageView, "");
                    boolean z = !imageView.isSelected();
                    if (adapterPosition >= 0) {
                        a aVar = this.f104990a.f104987a;
                        Integer num2 = null;
                        if (z) {
                            num = this.f104990a.f104987a.f104983d.get(adapterPosition).f104816a;
                        } else {
                            num = null;
                        }
                        aVar.f104981b = num;
                        a aVar2 = this.f104990a.f104987a;
                        if (z) {
                            num2 = Integer.valueOf(adapterPosition);
                        }
                        aVar2.f104982c = num2;
                        this.f104990a.f104987a.notifyDataSetChanged();
                        this.f104990a.f104987a.f104986g.invoke(this.f104990a.f104987a.f104981b);
                    }
                }
            });
            view.setLayerType(1, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if (viewHolder instanceof C2677a) {
            C2677a aVar = (C2677a) viewHolder;
            boolean z = true;
            int adapterPosition = aVar.getAdapterPosition() - 1;
            View view = aVar.itemView;
            l.b(view, "");
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.b_v);
            l.b(tuxTextView, "");
            tuxTextView.setText(aVar.f104987a.f104983d.get(adapterPosition).f104817b);
            View view2 = aVar.itemView;
            l.b(view2, "");
            ImageView imageView = (ImageView) view2.findViewById(R.id.a5y);
            l.b(imageView, "");
            Integer num = aVar.f104987a.f104982c;
            if (num == null || num.intValue() != adapterPosition) {
                z = false;
            }
            imageView.setSelected(z);
            View view3 = aVar.itemView;
            l.b(view3, "");
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (adapterPosition == 0) {
                marginLayoutParams.topMargin = 0;
            } else {
                View view4 = aVar.itemView;
                l.b(view4, "");
                marginLayoutParams.topMargin = -((int) n.b(view4.getContext(), 8.0f));
            }
            View view5 = aVar.itemView;
            l.b(view5, "");
            view5.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(List<ac> list, String str, String str2, b<? super Integer, z> bVar) {
        super(str);
        l.d(list, "");
        l.d(bVar, "");
        this.f104983d = list;
        this.f104984e = str;
        this.f104985f = str2;
        this.f104986g = bVar;
    }
}
