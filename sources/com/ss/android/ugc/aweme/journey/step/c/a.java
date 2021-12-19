package com.ss.android.ugc.aweme.journey.step.c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.journey.d;
import com.ss.android.ugc.aweme.journey.e;
import com.ss.android.ugc.aweme.journey.g;
import com.ss.android.ugc.aweme.journey.i;
import com.ss.android.ugc.aweme.journey.j;
import com.ss.android.ugc.aweme.journey.ui.c;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

public final class a extends g {

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet<Integer> f104956b;

    /* renamed from: c  reason: collision with root package name */
    public final b<Integer, z> f104957c;

    /* renamed from: d  reason: collision with root package name */
    public final j f104958d;

    /* renamed from: e  reason: collision with root package name */
    private final List<i> f104959e;

    static {
        Covode.recordClassIndex(67288);
    }

    @Override // com.ss.android.ugc.aweme.journey.g
    public final int a() {
        return this.f104959e.size();
    }

    @Override // com.ss.android.ugc.aweme.journey.g
    public final RecyclerView.ViewHolder b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.abn, viewGroup, false);
        l.b(a2, "");
        return new C2675a(this, a2);
    }

    @Override // com.ss.android.ugc.aweme.journey.g
    public final /* synthetic */ e a(ViewGroup viewGroup) {
        String str;
        l.d(viewGroup, "");
        String str2 = this.f104858a;
        if (str2 == null) {
            str2 = "";
        }
        j jVar = this.f104958d;
        if (jVar == null || (str = jVar.f104865b) == null) {
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

    /* renamed from: com.ss.android.ugc.aweme.journey.step.c.a$a  reason: collision with other inner class name */
    public final class C2675a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f104960a;

        /* renamed from: b  reason: collision with root package name */
        private final com.ss.android.ugc.aweme.journey.ui.a f104961b;

        /* renamed from: c  reason: collision with root package name */
        private final c f104962c;

        static {
            Covode.recordClassIndex(67289);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2675a(a aVar, View view) {
            super(view);
            l.d(view, "");
            this.f104960a = aVar;
            Context context = view.getContext();
            l.b(context, "");
            com.ss.android.ugc.aweme.journey.ui.a a2 = com.ss.android.ugc.aweme.journey.ui.b.a(context);
            this.f104961b = a2;
            c cVar = new c(view.getResources().getColor(R.color.f159928l), a2);
            this.f104962c = cVar;
            View view2 = this.itemView;
            l.b(view2, "");
            Context context2 = view2.getContext();
            l.b(context2, "");
            cVar.a(context2.getResources().getColor(R.color.b6));
            view.setBackground(cVar);
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.journey.step.c.a.C2675a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C2675a f104963a;

                static {
                    Covode.recordClassIndex(67290);
                }

                {
                    this.f104963a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    int adapterPosition = this.f104963a.getAdapterPosition() - 1;
                    View view2 = this.f104963a.itemView;
                    l.b(view2, "");
                    ImageView imageView = (ImageView) view2.findViewById(R.id.a58);
                    l.b(imageView, "");
                    if (imageView.isSelected()) {
                        this.f104963a.f104960a.f104956b.remove(Integer.valueOf(adapterPosition));
                    } else {
                        this.f104963a.f104960a.f104956b.add(Integer.valueOf(adapterPosition));
                    }
                    View view3 = this.f104963a.itemView;
                    l.b(view3, "");
                    ImageView imageView2 = (ImageView) view3.findViewById(R.id.a58);
                    l.b(imageView2, "");
                    View view4 = this.f104963a.itemView;
                    l.b(view4, "");
                    ImageView imageView3 = (ImageView) view4.findViewById(R.id.a58);
                    l.b(imageView3, "");
                    imageView2.setSelected(!imageView3.isSelected());
                    this.f104963a.f104960a.f104957c.invoke(Integer.valueOf(this.f104963a.f104960a.f104956b.size()));
                }
            });
            view.setLayerType(1, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if (viewHolder instanceof C2675a) {
            C2675a aVar = (C2675a) viewHolder;
            int i3 = i2 - 1;
            i iVar = this.f104959e.get(i3);
            boolean contains = this.f104956b.contains(Integer.valueOf(i3));
            l.d(iVar, "");
            View view = aVar.itemView;
            l.b(view, "");
            ImageView imageView = (ImageView) view.findViewById(R.id.a58);
            l.b(imageView, "");
            imageView.setSelected(contains);
            View view2 = aVar.itemView;
            l.b(view2, "");
            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.awr);
            l.b(tuxTextView, "");
            tuxTextView.setText(iVar.f104862b);
            View view3 = aVar.itemView;
            l.b(view3, "");
            TuxTextView tuxTextView2 = (TuxTextView) view3.findViewById(R.id.cif);
            l.b(tuxTextView2, "");
            tuxTextView2.setText(iVar.f104863c);
            View view4 = aVar.itemView;
            l.b(view4, "");
            ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int adapterPosition = aVar.getAdapterPosition() - 1;
            if (adapterPosition <= 1) {
                marginLayoutParams.topMargin = 0;
            } else {
                View view5 = aVar.itemView;
                l.b(view5, "");
                marginLayoutParams.topMargin = -((int) n.b(view5.getContext(), 8.0f));
            }
            if (adapterPosition % 2 == 0) {
                marginLayoutParams.leftMargin = 0;
            } else {
                View view6 = aVar.itemView;
                l.b(view6, "");
                marginLayoutParams.leftMargin = -((int) n.b(view6.getContext(), 0.0f));
            }
            View view7 = aVar.itemView;
            l.b(view7, "");
            view7.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(java.util.List<com.ss.android.ugc.aweme.journey.i> r2, h.f.a.b<? super java.lang.Integer, h.z> r3, com.ss.android.ugc.aweme.journey.j r4) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r2, r0)
            h.f.b.l.d(r3, r0)
            if (r4 == 0) goto L_0x001d
            java.lang.String r0 = r4.f104864a
        L_0x000c:
            r1.<init>(r0)
            r1.f104959e = r2
            r1.f104957c = r3
            r1.f104958d = r4
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f104956b = r0
            return
        L_0x001d:
            r0 = 0
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.journey.step.c.a.<init>(java.util.List, h.f.a.b, com.ss.android.ugc.aweme.journey.j):void");
    }
}
