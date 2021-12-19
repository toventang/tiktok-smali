package com.ss.android.ugc.aweme.journey.step.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.journey.d;
import com.ss.android.ugc.aweme.journey.e;
import com.ss.android.ugc.aweme.journey.g;
import com.ss.android.ugc.aweme.journey.ui.c;
import com.ss.android.ugc.aweme.language.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.Objects;

public final class a extends g {

    /* renamed from: b  reason: collision with root package name */
    public b f104943b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f104944c;

    /* renamed from: d  reason: collision with root package name */
    public final h.f.a.b<b, z> f104945d;

    static {
        Covode.recordClassIndex(67276);
    }

    @Override // com.ss.android.ugc.aweme.journey.g
    public final int a() {
        return this.f104944c.size();
    }

    @Override // com.ss.android.ugc.aweme.journey.g
    public final RecyclerView.ViewHolder b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.abm, viewGroup, false);
        l.b(a2, "");
        return new C2673a(this, a2);
    }

    @Override // com.ss.android.ugc.aweme.journey.g
    public final /* synthetic */ e a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        String str = this.f104858a;
        if (str == null) {
            str = "";
        }
        d a2 = d.a.a(viewGroup, str, "");
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

    /* renamed from: com.ss.android.ugc.aweme.journey.step.b.a$a  reason: collision with other inner class name */
    public final class C2673a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f104946a;

        /* renamed from: b  reason: collision with root package name */
        private final com.ss.android.ugc.aweme.journey.ui.a f104947b;

        /* renamed from: c  reason: collision with root package name */
        private final c f104948c;

        static {
            Covode.recordClassIndex(67277);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2673a(a aVar, final View view) {
            super(view);
            l.d(view, "");
            this.f104946a = aVar;
            Context context = view.getContext();
            l.b(context, "");
            com.ss.android.ugc.aweme.journey.ui.a a2 = com.ss.android.ugc.aweme.journey.ui.b.a(context);
            this.f104947b = a2;
            View view2 = this.itemView;
            l.b(view2, "");
            Context context2 = view2.getContext();
            l.b(context2, "");
            c cVar = new c(context2.getResources().getColor(R.color.f159928l), a2);
            this.f104948c = cVar;
            View view3 = this.itemView;
            l.b(view3, "");
            Context context3 = view3.getContext();
            l.b(context3, "");
            cVar.a(context3.getResources().getColor(R.color.b6));
            view.setBackground(cVar);
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.journey.step.b.a.C2673a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C2673a f104949a;

                static {
                    Covode.recordClassIndex(67278);
                }

                {
                    this.f104949a = r1;
                }

                public final void onClick(View view) {
                    b bVar;
                    ClickAgent.onClick(view);
                    ImageView imageView = (ImageView) view.findViewById(R.id.a5y);
                    l.b(imageView, "");
                    ImageView imageView2 = (ImageView) view.findViewById(R.id.a5y);
                    l.b(imageView2, "");
                    imageView.setSelected(!imageView2.isSelected());
                    int adapterPosition = this.f104949a.getAdapterPosition() - 1;
                    if (adapterPosition >= 0) {
                        a aVar = this.f104949a.f104946a;
                        ImageView imageView3 = (ImageView) view.findViewById(R.id.a5y);
                        l.b(imageView3, "");
                        if (imageView3.isSelected()) {
                            bVar = this.f104949a.f104946a.f104944c.get(adapterPosition);
                        } else {
                            bVar = null;
                        }
                        aVar.f104943b = bVar;
                        this.f104949a.f104946a.notifyDataSetChanged();
                        this.f104949a.f104946a.f104945d.invoke(this.f104949a.f104946a.f104943b);
                    }
                }
            });
            view.setLayerType(1, null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006a, code lost:
        if (h.f.b.l.a((java.lang.Object) r1, (java.lang.Object) r0.f()) != false) goto L_0x006c;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r8, int r9) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.journey.step.b.a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.language.b> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.language.b, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(List<? extends b> list, h.f.a.b<? super b, z> bVar, String str) {
        super(str);
        l.d(list, "");
        l.d(bVar, "");
        l.d(str, "");
        this.f104944c = list;
        this.f104945d = bVar;
    }
}
