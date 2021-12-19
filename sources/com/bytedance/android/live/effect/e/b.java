package com.bytedance.android.live.effect.e;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.effect.api.a.j;
import com.bytedance.android.live.effect.g;
import com.bytedance.android.livesdk.j.dw;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class b extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public final List<com.bytedance.android.livesdkapi.depend.model.a> f9790a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f9791b;

    /* renamed from: c  reason: collision with root package name */
    public AbstractC0146b f9792c;

    /* renamed from: d  reason: collision with root package name */
    final h f9793d = i.a((h.f.a.a) d.f9797a);

    /* renamed from: e  reason: collision with root package name */
    private final c f9794e = new c(this);

    /* renamed from: com.bytedance.android.live.effect.e.b$b  reason: collision with other inner class name */
    public interface AbstractC0146b {
        static {
            Covode.recordClassIndex(4993);
        }

        void a(com.bytedance.android.livesdkapi.depend.model.a aVar);
    }

    static {
        Covode.recordClassIndex(4991);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    public static final class c implements j.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f9795a;

        static {
            Covode.recordClassIndex(4994);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f9796a;

            static {
                Covode.recordClassIndex(4995);
            }

            a(c cVar) {
                this.f9796a = cVar;
            }

            public final void run() {
                this.f9796a.f9795a.notifyDataSetChanged();
            }
        }

        @Override // com.bytedance.android.live.effect.api.a.j.b
        public final void a() {
            ((Handler) this.f9795a.f9793d.getValue()).post(new a(this));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(b bVar) {
            this.f9795a = bVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f9790a.size();
    }

    static final class d extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f9797a = new d();

        static {
            Covode.recordClassIndex(4996);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public final void a() {
        T t;
        Iterator<T> it = this.f9790a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.C) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            this.f9791b = this.f9790a.indexOf(t2);
            AbstractC0146b bVar = this.f9792c;
            if (bVar != null) {
                bVar.a(t2);
            }
        }
        notifyDataSetChanged();
    }

    public static final class a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(4992);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.d(view, "");
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f9798a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f9799b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdkapi.depend.model.a f9800c;

        static {
            Covode.recordClassIndex(4997);
        }

        e(b bVar, a aVar, com.bytedance.android.livesdkapi.depend.model.a aVar2) {
            this.f9798a = bVar;
            this.f9799b = aVar;
            this.f9800c = aVar2;
        }

        public final void onClick(View view) {
            int adapterPosition = this.f9799b.getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < this.f9798a.f9790a.size()) {
                if (!g.a(this.f9800c) && !com.bytedance.android.live.effect.f.b.a(this.f9800c)) {
                    return;
                }
                if (com.bytedance.android.live.effect.f.b.b(this.f9800c)) {
                    ao.a(y.e(), (int) R.string.dx2);
                    return;
                }
                this.f9798a.f9791b = adapterPosition;
                AbstractC0146b bVar = this.f9798a.f9792c;
                if (bVar != null) {
                    bVar.a(this.f9800c);
                }
                this.f9798a.notifyDataSetChanged();
            }
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(2409);
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
        MethodCollector.o(2409);
        return aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        a aVar2 = aVar;
        l.d(aVar2, "");
        com.bytedance.android.livesdkapi.depend.model.a aVar3 = this.f9790a.get(i2);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) DataChannelGlobal.f34575d.b(dw.class);
        if (concurrentHashMap != null) {
            String str = aVar3.f22999e;
            if (str == null) {
                l.b();
            }
            concurrentHashMap.put(str, new p(Integer.valueOf(i2), ""));
        }
        if (this.f9791b == i2) {
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
            com.bytedance.android.live.core.f.p.a((ImageView) view5.findViewById(R.id.buf), new ImageModel(bVar.f7375a, bVar.f7376b));
        }
        View view6 = aVar2.itemView;
        l.b(view6, "");
        LiveTextView liveTextView = (LiveTextView) view6.findViewById(R.id.f3c);
        l.b(liveTextView, "");
        liveTextView.setText(aVar3.f22999e);
        if (g.a(aVar3) || com.bytedance.android.live.effect.f.b.a(aVar3)) {
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
            g.a(aVar3.q, this.f9794e);
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
        aVar2.itemView.setOnClickListener(new e(this, aVar2, aVar3));
    }
}
