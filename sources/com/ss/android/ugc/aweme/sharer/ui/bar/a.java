package com.ss.android.ugc.aweme.sharer.ui.bar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.c.f;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.i;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

public final class a extends RecyclerView.a<C3258a> {

    /* renamed from: c  reason: collision with root package name */
    public static final b f124627c = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<? extends h> f124628a = z.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    public final c f124629b;

    static {
        Covode.recordClassIndex(81892);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ C3258a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(81894);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f124628a.size();
    }

    public a(c cVar) {
        l.d(cVar, "");
        this.f124629b = cVar;
    }

    public final void a(List<? extends h> list) {
        l.d(list, "");
        this.f124628a = list;
        notifyDataSetChanged();
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f124633a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f124634b;

        static {
            Covode.recordClassIndex(81895);
        }

        c(a aVar, int i2) {
            this.f124633a = aVar;
            this.f124634b = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.sharer.a.b.a(view, 1200)) {
                this.f124633a.f124629b.a((h) this.f124633a.f124628a.get(this.f124634b));
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onViewDetachedFromWindow(C3258a aVar) {
        C3258a aVar2 = aVar;
        l.d(aVar2, "");
        Animation animation = aVar2.f124630a.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        super.onViewDetachedFromWindow(aVar2);
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.a$a  reason: collision with other inner class name */
    public static final class C3258a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final ImageView f124630a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f124631b;

        /* renamed from: c  reason: collision with root package name */
        public final View f124632c;

        static {
            Covode.recordClassIndex(81893);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3258a(View view) {
            super(view);
            l.d(view, "");
            View findViewById = view.findViewById(R.id.e0c);
            l.b(findViewById, "");
            this.f124630a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.e0e);
            l.b(findViewById2, "");
            this.f124631b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.e0d);
            l.b(findViewById3, "");
            this.f124632c = findViewById3;
        }
    }

    static final class e extends m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {
        final /* synthetic */ int $id;

        static {
            Covode.recordClassIndex(81897);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(int i2) {
            super(1);
            this.$id = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = this.$id;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 32.0f, system2.getDisplayMetrics()));
            return h.z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onViewAttachedToWindow(C3258a aVar) {
        C3258a aVar2 = aVar;
        l.d(aVar2, "");
        super.onViewAttachedToWindow(aVar2);
        int adapterPosition = aVar2.getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < getItemCount()) {
            ((h) this.f124628a.get(adapterPosition)).a(aVar2.f124630a);
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.tux.c.e, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f124635a = new d();

        static {
            Covode.recordClassIndex(81896);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.e eVar) {
            com.bytedance.tux.c.e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44776b = Integer.valueOf((int) R.attr.f159897h);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44777c = Float.valueOf(TypedValue.applyDimension(1, 23.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            eVar2.f44782h = h.g.a.a(TypedValue.applyDimension(1, 46.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            eVar2.f44781g = h.g.a.a(TypedValue.applyDimension(1, 46.0f, system3.getDisplayMetrics()));
            return h.z.f158842a;
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(10245);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ahg, viewGroup, false);
        l.b(a3, "");
        C3258a aVar = new C3258a(a3);
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
        MethodCollector.o(10245);
        return aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(C3258a aVar, int i2) {
        Drawable drawable;
        float f2;
        C3258a aVar2 = aVar;
        l.d(aVar2, "");
        Context context = aVar2.f124630a.getContext();
        h hVar = (h) this.f124628a.get(i2);
        int i3 = 0;
        if (i.a(b.f124636a, hVar.c())) {
            int ch_ = hVar.ch_();
            l.b(context, "");
            drawable = new LayerDrawable(new Drawable[]{com.bytedance.tux.c.c.a(new e(ch_)).a(context), f.a(d.f124635a).a(context)});
        } else {
            l.b(context, "");
            drawable = context.getResources().getDrawable(hVar.ch_());
        }
        aVar2.f124630a.setImageDrawable(drawable);
        ((h) this.f124628a.get(i2)).a(aVar2.f124631b);
        View view = aVar2.f124632c;
        if (!((h) this.f124628a.get(i2)).d()) {
            i3 = 8;
        }
        view.setVisibility(i3);
        ImageView imageView = aVar2.f124630a;
        float f3 = 1.0f;
        if (((h) this.f124628a.get(i2)).f()) {
            f2 = 1.0f;
        } else {
            f2 = 0.34f;
        }
        imageView.setAlpha(f2);
        TextView textView = aVar2.f124631b;
        if (!((h) this.f124628a.get(i2)).f()) {
            f3 = 0.34f;
        }
        textView.setAlpha(f3);
        aVar2.itemView.setOnClickListener(new c(this, i2));
    }
}
