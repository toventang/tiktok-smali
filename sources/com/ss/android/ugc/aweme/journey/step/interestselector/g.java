package com.ss.android.ugc.aweme.journey.step.interestselector;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.interest.b;
import com.ss.android.ugc.aweme.journey.ah;
import com.ss.android.ugc.aweme.journey.ai;
import com.ss.android.ugc.aweme.journey.d;
import com.ss.android.ugc.aweme.journey.e;
import com.ss.android.ugc.aweme.journey.r;
import com.zhiliaoapp.musically.R;
import h.a.i;
import h.f.b.l;
import h.z;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class g extends com.ss.android.ugc.aweme.journey.g {

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<b> f105108b;

    /* renamed from: c  reason: collision with root package name */
    public List<ai> f105109c;

    /* renamed from: d  reason: collision with root package name */
    public final h.f.a.b<Integer, z> f105110d;

    /* renamed from: e  reason: collision with root package name */
    public final r f105111e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayoutManager f105112f;

    static {
        Covode.recordClassIndex(67398);
    }

    @Override // com.ss.android.ugc.aweme.journey.g
    public final int a() {
        return this.f105109c.size();
    }

    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f105113a;

        static {
            Covode.recordClassIndex(67399);
        }

        static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f105116a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ StaggeredGridLayoutManager f105117b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f105118c;

            static {
                Covode.recordClassIndex(67401);
            }

            b(a aVar, StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
                this.f105116a = aVar;
                this.f105117b = staggeredGridLayoutManager;
                this.f105118c = i2;
            }

            public final void onGlobalLayout() {
                int i2;
                f.f105089j = Math.max(f.f105089j, this.f105116a.f105113a.f105112f.m() - 1);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.f105117b;
                int[] b2 = staggeredGridLayoutManager.b(new int[staggeredGridLayoutManager.f3896a]);
                l.b(b2, "");
                Integer c2 = i.c(b2);
                Map<Integer, Integer> map = f.f105090k;
                Integer valueOf = Integer.valueOf(this.f105118c);
                Integer num = f.f105090k.get(Integer.valueOf(this.f105118c));
                int i3 = 0;
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                if (c2 != null) {
                    i3 = c2.intValue();
                }
                map.put(valueOf, Integer.valueOf(Math.max(i2, i3)));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.g$a$a  reason: collision with other inner class name */
        public static final class C2685a extends RecyclerView.n {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ StaggeredGridLayoutManager f105114a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f105115b;

            static {
                Covode.recordClassIndex(67400);
            }

            C2685a(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
                this.f105114a = staggeredGridLayoutManager;
                this.f105115b = i2;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2) {
                int i3;
                l.d(recyclerView, "");
                super.a(recyclerView, i2);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.f105114a;
                int[] b2 = staggeredGridLayoutManager.b(new int[staggeredGridLayoutManager.f3896a]);
                l.b(b2, "");
                Integer c2 = i.c(b2);
                Map<Integer, Integer> map = f.f105090k;
                Integer valueOf = Integer.valueOf(this.f105115b);
                Integer num = f.f105090k.get(Integer.valueOf(this.f105115b));
                int i4 = 0;
                if (num != null) {
                    i3 = num.intValue();
                } else {
                    i3 = 0;
                }
                if (c2 != null) {
                    i4 = c2.intValue();
                }
                map.put(valueOf, Integer.valueOf(Math.max(i3, i4)));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g gVar, View view) {
            super(view);
            l.d(view, "");
            this.f105113a = gVar;
            View view2 = this.itemView;
            l.b(view2, "");
            RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.epm);
            l.b(recyclerView, "");
            recyclerView.setLayoutManager(new TopicInterestAdapter$TopicInterestViewHolder$1());
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.g
    public final RecyclerView.ViewHolder b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.abr, viewGroup, false);
        l.b(a2, "");
        return new a(this, a2);
    }

    @Override // com.ss.android.ugc.aweme.journey.g
    public final e a(ViewGroup viewGroup) {
        String str;
        l.d(viewGroup, "");
        String str2 = this.f104858a;
        if (str2 == null) {
            str2 = "";
        }
        r rVar = this.f105111e;
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

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if (viewHolder instanceof a) {
            a aVar = (a) viewHolder;
            View view = aVar.itemView;
            l.b(view, "");
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.epm);
            int adapterPosition = aVar.getAdapterPosition() - 1;
            ai aiVar = aVar.f105113a.f105109c.get(adapterPosition);
            View view2 = aVar.itemView;
            l.b(view2, "");
            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.text);
            l.b(tuxTextView, "");
            tuxTextView.setText(aiVar.f104838b);
            String str = aVar.f105113a.f105109c.get(aVar.getAdapterPosition() - 1).f104839c;
            if (str == null) {
                str = "";
            }
            v a2 = com.bytedance.lighten.a.r.a(str);
            View view3 = aVar.itemView;
            l.b(view3, "");
            v a3 = a2.a(view3.getContext().getClass().getName());
            View view4 = aVar.itemView;
            l.b(view4, "");
            a3.E = (SmartImageView) view4.findViewById(R.id.bmk);
            a3.a(new com.ss.android.ugc.aweme.bj.a());
            List<ah> list = aiVar.f104840d;
            View view5 = aVar.itemView;
            l.b(view5, "");
            RecyclerView recyclerView2 = (RecyclerView) view5.findViewById(R.id.epm);
            l.b(recyclerView2, "");
            RecyclerView.i layoutManager = recyclerView2.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            j jVar = new j(list, aVar.f105113a.f105110d, aVar.f105113a.f105111e, adapterPosition, aVar.f105113a.f105108b, aVar.getAdapterPosition());
            l.b(recyclerView, "");
            recyclerView.setAdapter(jVar);
            recyclerView.a(new a.C2685a(staggeredGridLayoutManager, adapterPosition));
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new a.b(aVar, staggeredGridLayoutManager, adapterPosition));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(java.util.List<com.ss.android.ugc.aweme.journey.ai> r2, h.f.a.b<? super java.lang.Integer, h.z> r3, com.ss.android.ugc.aweme.journey.r r4, androidx.recyclerview.widget.LinearLayoutManager r5) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r2, r0)
            h.f.b.l.d(r3, r0)
            h.f.b.l.d(r5, r0)
            if (r4 == 0) goto L_0x0022
            java.lang.String r0 = r4.f104906a
        L_0x000f:
            r1.<init>(r0)
            r1.f105109c = r2
            r1.f105110d = r3
            r1.f105111e = r4
            r1.f105112f = r5
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f105108b = r0
            return
        L_0x0022:
            r0 = 0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.journey.step.interestselector.g.<init>(java.util.List, h.f.a.b, com.ss.android.ugc.aweme.journey.r, androidx.recyclerview.widget.LinearLayoutManager):void");
    }
}
