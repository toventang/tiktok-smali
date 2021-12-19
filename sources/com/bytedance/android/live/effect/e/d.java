package com.bytedance.android.live.effect.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.effect.api.a.j;
import com.bytedance.android.live.effect.g;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class d extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public List<com.bytedance.android.livesdkapi.depend.model.a> f9806a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f9807b;

    /* renamed from: c  reason: collision with root package name */
    public b f9808c;

    /* renamed from: d  reason: collision with root package name */
    private final c f9809d = new c(this);

    public interface b {
        static {
            Covode.recordClassIndex(5004);
        }

        void a(com.bytedance.android.livesdkapi.depend.model.a aVar);
    }

    static {
        Covode.recordClassIndex(5002);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    public static final class c implements j.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f9810a;

        static {
            Covode.recordClassIndex(5005);
        }

        @Override // com.bytedance.android.live.effect.api.a.j.b
        public final void a() {
            this.f9810a.notifyDataSetChanged();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(d dVar) {
            this.f9810a = dVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f9806a.size();
    }

    public static final class a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(5003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.d(view, "");
        }
    }

    /* renamed from: com.bytedance.android.live.effect.e.d$d  reason: collision with other inner class name */
    static final class View$OnClickListenerC0148d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f9811a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f9812b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdkapi.depend.model.a f9813c;

        static {
            Covode.recordClassIndex(5006);
        }

        View$OnClickListenerC0148d(d dVar, a aVar, com.bytedance.android.livesdkapi.depend.model.a aVar2) {
            this.f9811a = dVar;
            this.f9812b = aVar;
            this.f9813c = aVar2;
        }

        public final void onClick(View view) {
            int adapterPosition = this.f9812b.getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < this.f9811a.f9806a.size() && g.a(this.f9813c)) {
                if (com.bytedance.android.live.effect.f.b.b(this.f9813c)) {
                    ao.a(y.e(), (int) R.string.dx2);
                    return;
                }
                this.f9811a.f9807b = adapterPosition;
                b bVar = this.f9811a.f9808c;
                if (bVar != null) {
                    bVar.a(this.f9813c);
                }
                this.f9811a.notifyDataSetChanged();
            }
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(305);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b8r, viewGroup, false);
        l.b(a3, "");
        a aVar = new a(a3);
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
        MethodCollector.o(305);
        return aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        a aVar2 = aVar;
        l.d(aVar2, "");
        com.bytedance.android.livesdkapi.depend.model.a aVar3 = this.f9806a.get(i2);
        if (this.f9807b == i2) {
            View view = aVar2.itemView;
            l.b(view, "");
            view.findViewById(R.id.us).setBackgroundResource(R.drawable.box);
            View view2 = aVar2.itemView;
            l.b(view2, "");
            ((LiveTextView) view2.findViewById(R.id.f3c)).setTextColor(y.b((int) R.color.v7));
        } else {
            View view3 = aVar2.itemView;
            l.b(view3, "");
            view3.findViewById(R.id.us).setBackgroundResource(R.drawable.boy);
            View view4 = aVar2.itemView;
            l.b(view4, "");
            ((LiveTextView) view4.findViewById(R.id.f3c)).setTextColor(y.b((int) R.color.xg));
        }
        com.bytedance.android.live.base.model.b bVar = aVar3.f22998d;
        if (bVar != null) {
            View view5 = aVar2.itemView;
            l.b(view5, "");
            p.a((ImageView) view5.findViewById(R.id.buf), new ImageModel(bVar.f7375a, bVar.f7376b));
        }
        View view6 = aVar2.itemView;
        l.b(view6, "");
        LiveTextView liveTextView = (LiveTextView) view6.findViewById(R.id.f3c);
        l.b(liveTextView, "");
        liveTextView.setText(aVar3.f22999e);
        if (g.a(aVar3)) {
            View view7 = aVar2.itemView;
            l.b(view7, "");
            ImageView imageView = (ImageView) view7.findViewById(R.id.byw);
            l.b(imageView, "");
            imageView.setVisibility(8);
        } else {
            View view8 = aVar2.itemView;
            l.b(view8, "");
            ImageView imageView2 = (ImageView) view8.findViewById(R.id.byw);
            l.b(imageView2, "");
            imageView2.setVisibility(0);
            g.a(aVar3.q, this.f9809d);
        }
        if (com.bytedance.android.live.effect.f.b.b(aVar3)) {
            View view9 = aVar2.itemView;
            l.b(view9, "");
            view9.setAlpha(0.4f);
        } else {
            View view10 = aVar2.itemView;
            l.b(view10, "");
            view10.setAlpha(1.0f);
        }
        aVar2.itemView.setOnClickListener(new View$OnClickListenerC0148d(this, aVar2, aVar3));
    }
}
