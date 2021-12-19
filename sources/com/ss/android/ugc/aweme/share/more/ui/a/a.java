package com.ss.android.ugc.aweme.share.more.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
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
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.i;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

public final class a extends RecyclerView.a<C3231a> {

    /* renamed from: c  reason: collision with root package name */
    public static final b f124141c = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<? extends h> f124142a = z.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sharer.ui.bar.c f124143b;

    static {
        Covode.recordClassIndex(81530);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ C3231a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(81532);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f124142a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.ui.a.a$a  reason: collision with other inner class name */
    public static class C3231a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(81531);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3231a(View view) {
            super(view);
            l.d(view, "");
        }
    }

    public static final class c extends C3231a {
        static {
            Covode.recordClassIndex(81533);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            l.d(view, "");
        }
    }

    public a(com.ss.android.ugc.aweme.sharer.ui.bar.c cVar) {
        l.d(cVar, "");
        this.f124143b = cVar;
    }

    public final void a(List<? extends h> list) {
        l.d(list, "");
        this.f124142a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (this.f124142a.get(i2) instanceof com.ss.android.ugc.aweme.share.more.b.a) {
            return 0;
        }
        return 1;
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f124146a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f124147b;

        static {
            Covode.recordClassIndex(81535);
        }

        e(a aVar, int i2) {
            this.f124146a = aVar;
            this.f124147b = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.sharer.a.b.a(view, 1200)) {
                this.f124146a.f124143b.a((h) this.f124146a.f124142a.get(this.f124147b));
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onViewDetachedFromWindow(C3231a aVar) {
        C3231a aVar2 = aVar;
        l.d(aVar2, "");
        if (aVar2 instanceof d) {
            Animation animation = ((d) aVar2).f124144a.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
            super.onViewDetachedFromWindow(aVar2);
        }
    }

    public static final class d extends C3231a {

        /* renamed from: a  reason: collision with root package name */
        public final ImageView f124144a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f124145b;

        static {
            Covode.recordClassIndex(81534);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(view);
            l.d(view, "");
            View findViewById = view.findViewById(R.id.cnn);
            l.b(findViewById, "");
            this.f124144a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.cno);
            l.b(findViewById2, "");
            this.f124145b = (TextView) findViewById2;
        }
    }

    static final class f extends m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {
        final /* synthetic */ int $id;

        static {
            Covode.recordClassIndex(81536);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(int i2) {
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
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
            return h.z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onViewAttachedToWindow(C3231a aVar) {
        C3231a aVar2 = aVar;
        l.d(aVar2, "");
        if (aVar2 instanceof d) {
            super.onViewAttachedToWindow(aVar2);
            d dVar = (d) aVar2;
            int adapterPosition = dVar.getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < getItemCount()) {
                ((h) this.f124142a.get(adapterPosition)).a(dVar.f124144a);
            }
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        MethodCollector.i(12208);
        l.d(viewGroup, "");
        boolean z = true;
        if (i2 != 1) {
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.azm, viewGroup, false);
            l.b(a2, "");
            viewHolder = new c(a2);
        } else {
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.azr, viewGroup, false);
            l.b(a3, "");
            viewHolder = new d(a3);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(12208);
        return viewHolder;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(C3231a aVar, int i2) {
        Drawable drawable;
        float f2;
        C3231a aVar2 = aVar;
        l.d(aVar2, "");
        if (aVar2 instanceof d) {
            d dVar = (d) aVar2;
            Context context = dVar.f124144a.getContext();
            h hVar = (h) this.f124142a.get(i2);
            if (i.a(com.ss.android.ugc.aweme.sharer.ui.bar.b.f124636a, hVar.c())) {
                int g2 = hVar.g();
                l.b(context, "");
                drawable = com.bytedance.tux.c.c.a(new f(g2)).a(context);
            } else {
                l.b(context, "");
                drawable = context.getResources().getDrawable(hVar.g());
            }
            dVar.f124144a.setImageDrawable(drawable);
            ((h) this.f124142a.get(i2)).a(dVar.f124145b);
            ImageView imageView = dVar.f124144a;
            float f3 = 1.0f;
            if (((h) this.f124142a.get(i2)).f()) {
                f2 = 1.0f;
            } else {
                f2 = 0.34f;
            }
            imageView.setAlpha(f2);
            TextView textView = dVar.f124145b;
            if (!((h) this.f124142a.get(i2)).f()) {
                f3 = 0.34f;
            }
            textView.setAlpha(f3);
            aVar2.itemView.setOnClickListener(new e(this, i2));
        }
    }
}
