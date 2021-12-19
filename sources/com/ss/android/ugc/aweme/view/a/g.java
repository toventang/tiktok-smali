package com.ss.android.ugc.aweme.view.a;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.model.t;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class g extends RecyclerView.a<c> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f144081b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<t> f144082a;

    /* renamed from: c  reason: collision with root package name */
    private final b f144083c;

    public interface b {
        static {
            Covode.recordClassIndex(94287);
        }

        void a(t tVar);
    }

    static {
        Covode.recordClassIndex(94285);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ c onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94286);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        List<t> list = this.f144082a;
        if (list == null) {
            return 22;
        }
        return list.size() + 2;
    }

    public static final class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final SmartImageView f144084a;

        static {
            Covode.recordClassIndex(94288);
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f144085a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ t f144086b;

            static {
                Covode.recordClassIndex(94289);
            }

            a(b bVar, t tVar) {
                this.f144085a = bVar;
                this.f144086b = tVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f144085a.a(this.f144086b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            l.d(view, "");
            this.f144084a = (SmartImageView) view.findViewById(R.id.e_5);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (i2 < 2) {
            return 0;
        }
        if (this.f144082a == null) {
            return 2;
        }
        return 1;
    }

    public g(List<t> list, b bVar) {
        l.d(bVar, "");
        this.f144082a = list;
        this.f144083c = bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(c cVar, int i2) {
        List<t> list;
        t tVar;
        c cVar2 = cVar;
        l.d(cVar2, "");
        if (getItemViewType(i2) == 1 && (list = this.f144082a) != null && (tVar = list.get(i2 - 2)) != null) {
            b bVar = this.f144083c;
            l.d(tVar, "");
            l.d(bVar, "");
            cVar2.itemView.setOnClickListener(new c.a(bVar, tVar));
            View view = cVar2.itemView;
            l.b(view, "");
            if (view.getBackground() instanceof AnimationDrawable) {
                View view2 = cVar2.itemView;
                l.b(view2, "");
                Drawable background = view2.getBackground();
                Objects.requireNonNull(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                ((AnimationDrawable) background).stop();
            }
            v a2 = r.a(Uri.parse(tVar.f110818a));
            SmartImageView smartImageView = cVar2.f144084a;
            l.b(smartImageView, "");
            a2.f39906b = smartImageView.getContext();
            a2.E = cVar2.f144084a;
            a2.c();
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        View a2;
        boolean a3;
        MethodCollector.i(3491);
        l.d(viewGroup, "");
        if (i2 == 0) {
            a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.apx, viewGroup, false);
            l.b(a2, "");
        } else if (i2 != 2) {
            a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.apy, viewGroup, false);
            l.b(a2, "");
        } else {
            a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.apy, viewGroup, false);
            l.b(a2, "");
            Drawable background = a2.getBackground();
            if (background != null) {
                AnimationDrawable animationDrawable = (AnimationDrawable) background;
                animationDrawable.setEnterFadeDuration(10);
                animationDrawable.setExitFadeDuration(300);
                animationDrawable.setOneShot(false);
                animationDrawable.start();
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                MethodCollector.o(3491);
                throw nullPointerException;
            }
        }
        c cVar = new c(a2);
        try {
            if (cVar.itemView.getParent() != null) {
                try {
                    a3 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a3) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(cVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = cVar.getClass().getName();
        MethodCollector.o(3491);
        return cVar;
    }
}
