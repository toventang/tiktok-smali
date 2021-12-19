package com.ss.android.ugc.aweme.view.a;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.ss.android.ugc.aweme.base.ui.SmartRoundImageView;
import com.ss.android.ugc.aweme.common.ag;
import com.ss.android.ugc.aweme.model.e;
import com.ss.android.ugc.aweme.model.g;
import com.ss.android.ugc.aweme.model.i;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends RecyclerView.a<C3832a> {

    /* renamed from: a  reason: collision with root package name */
    public final g f144039a;

    /* renamed from: b  reason: collision with root package name */
    public final b f144040b;

    static {
        Covode.recordClassIndex(94268);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ C3832a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f144039a.f110763a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.view.a.a$a  reason: collision with other inner class name */
    public static final class C3832a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final SmartRoundImageView f144041a;

        /* renamed from: b  reason: collision with root package name */
        final RoundedFrameLayout f144042b;

        /* renamed from: c  reason: collision with root package name */
        final View f144043c;

        /* renamed from: d  reason: collision with root package name */
        final float f144044d;

        static {
            Covode.recordClassIndex(94269);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3832a(View view) {
            super(view);
            l.d(view, "");
            this.f144041a = (SmartRoundImageView) view.findViewById(R.id.d_t);
            this.f144042b = (RoundedFrameLayout) view.findViewById(R.id.d_v);
            this.f144043c = view.findViewById(R.id.d_u);
            Context context = view.getContext();
            l.b(context, "");
            this.f144044d = ag.a.a(context, 22.0f);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f144045a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f144046b;

        static {
            Covode.recordClassIndex(94270);
        }

        b(a aVar, int i2) {
            this.f144045a = aVar;
            this.f144046b = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f144045a.notifyDataSetChanged();
            b bVar = this.f144045a.f144040b;
            e eVar = this.f144045a.f144039a.f110763a.get(this.f144046b);
            l.b(eVar, "");
            bVar.a(eVar);
        }
    }

    public a(g gVar, b bVar) {
        l.d(gVar, "");
        l.d(bVar, "");
        this.f144039a = gVar;
        this.f144040b = bVar;
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(3797);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.apk, viewGroup, false);
        l.b(a3, "");
        C3832a aVar = new C3832a(a3);
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar.getClass().getName();
        MethodCollector.o(3797);
        return aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(C3832a aVar, int i2) {
        C3832a aVar2 = aVar;
        l.d(aVar2, "");
        e eVar = this.f144039a.f110763a.get(i2);
        l.b(eVar, "");
        e eVar2 = eVar;
        boolean a2 = l.a(eVar2, this.f144039a.f110764b);
        l.d(eVar2, "");
        RoundedFrameLayout roundedFrameLayout = aVar2.f144042b;
        l.b(roundedFrameLayout, "");
        roundedFrameLayout.setRotation(0.0f);
        RoundedFrameLayout roundedFrameLayout2 = aVar2.f144042b;
        l.b(roundedFrameLayout2, "");
        roundedFrameLayout2.setVisibility(0);
        SmartRoundImageView smartRoundImageView = aVar2.f144041a;
        l.b(smartRoundImageView, "");
        smartRoundImageView.setVisibility(8);
        View view = aVar2.f144043c;
        l.b(view, "");
        view.setVisibility(8);
        if (a2) {
            View view2 = aVar2.f144043c;
            l.b(view2, "");
            view2.setVisibility(0);
        }
        aVar2.f144042b.setRadius((int) aVar2.f144044d);
        e.a aVar3 = new e.a();
        aVar3.f39827a = true;
        aVar3.f39831e = aVar2.f144044d;
        com.bytedance.lighten.a.e a3 = aVar3.a();
        aVar2.f144041a.setCircleOptions(a3);
        if (eVar2 instanceof i) {
            i iVar = (i) eVar2;
            GradientDrawable gradientDrawable = new GradientDrawable();
            int[] iArr = new int[iVar.f110769e.size()];
            int size = iVar.f110769e.size();
            for (int i3 = 0; i3 < size; i3++) {
                com.ss.android.ugc.aweme.model.e eVar3 = iVar.f110769e.get(i3);
                l.b(eVar3, "");
                com.ss.android.ugc.aweme.model.e eVar4 = eVar3;
                if (eVar4.f110758a != null) {
                    iArr[i3] = Color.parseColor(eVar4.f110758a);
                }
            }
            gradientDrawable.setColors(iArr);
            RoundedFrameLayout roundedFrameLayout3 = aVar2.f144042b;
            l.b(roundedFrameLayout3, "");
            roundedFrameLayout3.setBackground(gradientDrawable);
            RoundedFrameLayout roundedFrameLayout4 = aVar2.f144042b;
            l.b(roundedFrameLayout4, "");
            roundedFrameLayout4.setRotation((float) iVar.f110768d);
        } else if (eVar2.f110759b != null) {
            SmartRoundImageView smartRoundImageView2 = aVar2.f144041a;
            l.b(smartRoundImageView2, "");
            smartRoundImageView2.setVisibility(0);
            RoundedFrameLayout roundedFrameLayout5 = aVar2.f144042b;
            l.b(roundedFrameLayout5, "");
            roundedFrameLayout5.setVisibility(8);
            v a4 = r.a(Uri.parse(eVar2.f110759b));
            SmartRoundImageView smartRoundImageView3 = aVar2.f144041a;
            l.b(smartRoundImageView3, "");
            a4.f39906b = smartRoundImageView3.getContext();
            a4.E = aVar2.f144041a;
            a4.w = a3;
            a4.c();
        } else if (eVar2.f110758a != null) {
            SmartRoundImageView smartRoundImageView4 = aVar2.f144041a;
            l.b(smartRoundImageView4, "");
            smartRoundImageView4.setVisibility(8);
            RoundedFrameLayout roundedFrameLayout6 = aVar2.f144042b;
            l.b(roundedFrameLayout6, "");
            roundedFrameLayout6.setVisibility(0);
            aVar2.f144042b.setBackgroundColor(Color.parseColor(eVar2.f110758a));
        }
        aVar2.itemView.setOnClickListener(new b(this, i2));
    }
}
