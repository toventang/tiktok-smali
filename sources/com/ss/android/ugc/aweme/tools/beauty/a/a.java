package com.ss.android.ugc.aweme.tools.beauty.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.h.v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.tools.beauty.a.d;
import com.ss.android.ugc.aweme.tools.beauty.a.e;
import com.ss.android.ugc.aweme.tools.beauty.a.g;
import com.ss.android.ugc.aweme.tools.beauty.a.h;
import com.ss.android.ugc.aweme.tools.beauty.a.l;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.utils.hx;
import com.ss.android.ugc.aweme.views.CircleDraweeView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.m;
import h.f.a.q;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final ArrayList<ComposerBeauty> f138761a = new ArrayList<>();

    /* renamed from: b */
    public m<? super ComposerBeauty, ? super Integer, z> f138762b;

    /* renamed from: c */
    public q<? super String, ? super Boolean, ? super String, z> f138763c;

    /* renamed from: d */
    public h.f.a.b<? super String, Boolean> f138764d;

    /* renamed from: e */
    public boolean f138765e = true;

    /* renamed from: f */
    public boolean f138766f;

    /* renamed from: g */
    public h.f.a.a<z> f138767g;

    /* renamed from: h */
    public m<? super String, ? super Boolean, z> f138768h;

    /* renamed from: i */
    public boolean f138769i;

    /* renamed from: j */
    public h.f.a.b<? super String, String> f138770j;

    /* renamed from: k */
    public final com.ss.android.ugc.aweme.tools.beauty.b.a.d f138771k;

    /* renamed from: l */
    public final RecyclerView f138772l;

    /* renamed from: m */
    private final List<b> f138773m = new ArrayList();
    private final m<ComposerBeauty, Integer, z> n = new d(this);
    private final m<ComposerBeauty, Integer, z> o = new C3661a(this);
    private final m<String, Boolean, z> p = new e(this);
    private final h.f.a.b<Boolean, z> q = new c(this);
    private final m<String, Boolean, z> r = new b(this);

    static {
        Covode.recordClassIndex(90767);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f138773m.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return this.f138773m.get(i2).f138775a;
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(90770);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                h.f.a.a<z> aVar = this.this$0.f138767g;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.this$0.b(true);
                this.this$0.notifyDataSetChanged();
            }
            return z.f158842a;
        }
    }

    public final void b(boolean z) {
        for (T t : this.f138773m) {
            if (t instanceof k) {
                t.f138826c = z;
            }
        }
    }

    public final void a(ComposerBeauty composerBeauty) {
        l.d(composerBeauty, "");
        int i2 = 0;
        for (b bVar : this.f138773m) {
            if (!(bVar instanceof c) || !l.a(((c) bVar).f138776c, composerBeauty)) {
                i2++;
            } else if (i2 >= 0 && i2 < this.f138773m.size()) {
                notifyItemChanged(i2);
                return;
            } else {
                return;
            }
        }
    }

    public final void a(boolean z) {
        this.f138765e = z;
        if (this.f138771k.q) {
            for (T t : this.f138773m) {
                if (t instanceof f) {
                    t.f138795d = z;
                } else if (t instanceof c) {
                    t.f138777d = z;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.a$a */
    public static final class C3661a extends h.f.b.m implements m<ComposerBeauty, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(90768);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3661a(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(ComposerBeauty composerBeauty, Integer num) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            int intValue = num.intValue();
            l.d(composerBeauty2, "");
            m<? super ComposerBeauty, ? super Integer, z> mVar = this.this$0.f138762b;
            if (mVar != null) {
                mVar.invoke(composerBeauty2, Integer.valueOf(intValue));
            }
            this.this$0.a(false, composerBeauty2.getCategoryExtra().getCategoryId());
            this.this$0.notifyDataSetChanged();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements m<String, Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(90769);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Boolean bool) {
            String str2 = str;
            boolean booleanValue = bool.booleanValue();
            l.d(str2, "");
            m<? super String, ? super Boolean, z> mVar = this.this$0.f138768h;
            if (mVar != null) {
                mVar.invoke(str2, Boolean.valueOf(booleanValue));
            }
            this.this$0.a(true, str2);
            this.this$0.notifyDataSetChanged();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements m<String, Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(90772);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(str, "");
            q<? super String, ? super Boolean, ? super String, z> qVar = this.this$0.f138763c;
            if (qVar != null) {
                qVar.invoke(str, Boolean.valueOf(booleanValue), "user");
            }
            this.this$0.a(booleanValue);
            hx.a(0, new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.tools.beauty.a.a.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(90773);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    RecyclerView.i layoutManager = this.this$0.this$0.f138772l.getLayoutManager();
                    if (layoutManager != null && !layoutManager.q() && !this.this$0.this$0.f138772l.l()) {
                        this.this$0.this$0.notifyDataSetChanged();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements m<ComposerBeauty, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(90771);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(ComposerBeauty composerBeauty, Integer num) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            int intValue = num.intValue();
            l.d(composerBeauty2, "");
            m<? super ComposerBeauty, ? super Integer, z> mVar = this.this$0.f138762b;
            if (mVar != null) {
                mVar.invoke(composerBeauty2, Integer.valueOf(intValue));
            }
            if (!this.this$0.f138765e) {
                q<? super String, ? super Boolean, ? super String, z> qVar = this.this$0.f138763c;
                if (qVar != null) {
                    qVar.invoke(composerBeauty2.getCategoryId(), true, "auto");
                }
                this.this$0.a(true);
            }
            this.this$0.notifyDataSetChanged();
            return z.f158842a;
        }
    }

    public a(com.ss.android.ugc.aweme.tools.beauty.b.a.d dVar, RecyclerView recyclerView) {
        l.d(dVar, "");
        l.d(recyclerView, "");
        this.f138771k = dVar;
        this.f138772l = recyclerView;
    }

    public static /* synthetic */ void a(a aVar, List list) {
        ComposerBeauty composerBeauty;
        String invoke;
        ComposerBeauty composerBeauty2;
        Boolean invoke2;
        String str = "";
        l.d(list, str);
        aVar.f138761a.clear();
        aVar.f138761a.addAll(list);
        aVar.f138773m.clear();
        boolean z = true;
        aVar.f138765e = true;
        if (aVar.f138771k.q && (composerBeauty2 = (ComposerBeauty) n.h(list)) != null && !com.ss.android.ugc.aweme.tools.beauty.d.b(composerBeauty2) && composerBeauty2.getCategoryExtra() != null && composerBeauty2.getCategoryExtra().getShowSwitch()) {
            h.f.a.b<? super String, Boolean> bVar = aVar.f138764d;
            if (!(bVar == null || (invoke2 = bVar.invoke(composerBeauty2.getCategoryId())) == null)) {
                z = invoke2.booleanValue();
            }
            aVar.f138765e = z;
            aVar.f138773m.add(0, new f(composerBeauty2.getCategoryId(), aVar.f138765e));
        }
        if (aVar.f138771k.r && (composerBeauty = (ComposerBeauty) n.h(list)) != null && composerBeauty.getCategoryExtra() != null && composerBeauty.isBeautyMode()) {
            List<b> list2 = aVar.f138773m;
            h.f.a.b<? super String, String> bVar2 = aVar.f138770j;
            if (!(bVar2 == null || (invoke = bVar2.invoke(composerBeauty.getCategoryId())) == null)) {
                str = invoke;
            }
            list2.add(0, new j(str));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ComposerBeauty composerBeauty3 = (ComposerBeauty) it.next();
            if (composerBeauty3.isBeautyMode()) {
                aVar.f138773m.add(new i(composerBeauty3));
            } else {
                aVar.f138773m.add(new c(composerBeauty3, aVar.f138765e));
            }
        }
        aVar.notifyDataSetChanged();
    }

    public final void a(boolean z, String str) {
        l.d(str, "");
        this.f138769i = z;
        for (T t : this.f138773m) {
            if (t instanceof j) {
                T t2 = t;
                t2.f138825d = z;
                if (str.length() > 0) {
                    l.d(str, "");
                    t2.f138824c = str;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String b2;
        l.d(viewHolder, "");
        boolean z8 = false;
        this.f138766f = false;
        f fVar = null;
        if (viewHolder instanceof g) {
            b bVar = this.f138773m.get(i2);
            if (bVar instanceof f) {
                fVar = bVar;
            }
            f fVar2 = fVar;
            if (fVar2 != null) {
                g gVar = (g) viewHolder;
                l.d(fVar2, "");
                gVar.f138801e = fVar2;
                gVar.f138797a.setCheckedNoEvent(fVar2.f138795d);
                TextView textView = gVar.f138798b;
                l.b(textView, "");
                if (fVar2.f138795d) {
                    b2 = gVar.a();
                } else {
                    b2 = gVar.b();
                }
                textView.setText(b2);
                gVar.f138797a.setOnCheckedChangeListener(new g.b(gVar));
                com.ss.android.ugc.tools.a.c.a(gVar.f138797a);
                v.a(gVar.f138799c, new g.c(gVar));
            }
        } else if (viewHolder instanceof d) {
            b bVar2 = this.f138773m.get(i2);
            if (bVar2 instanceof i) {
                fVar = bVar2;
            }
            i iVar = fVar;
            if (iVar != null) {
                d dVar = (d) viewHolder;
                if (i2 == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (this.f138773m.size() <= 1 || i2 != this.f138773m.size() - 1) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                l.d(iVar, "");
                ComposerBeauty composerBeauty = iVar.f138823c;
                UrlModel urlModel = new UrlModel();
                urlModel.setUri(composerBeauty.getCategoryExtra().getPrimaryPanelIcon());
                urlModel.setUrlList(composerBeauty.getCategoryExtra().getPrimaryPanelIconList());
                dVar.f138779a.setCustomSelected(composerBeauty.getSelected());
                if (!composerBeauty.isLocalItem() || composerBeauty.getLocalIconResId() <= 0) {
                    com.ss.android.ugc.tools.c.a.a(dVar.f138779a.getImageView(), urlModel);
                } else {
                    dVar.f138779a.getImageView().setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    dVar.f138779a.getImageView().setImageResource(composerBeauty.getLocalIconResId());
                }
                if (composerBeauty.isBeautyMode()) {
                    dVar.f138779a.setText(composerBeauty.getCategoryExtra().getPrimaryPanelName());
                    com.ss.android.ugc.aweme.tools.beauty.views.b bVar3 = dVar.f138779a;
                    if (composerBeauty.getSelected()) {
                        bVar3.f139255a.setVisibility(0);
                    } else {
                        bVar3.f139255a.setVisibility(4);
                    }
                }
                dVar.f138779a.setOnClickListener(new d.b(composerBeauty, dVar, z6, z7));
                com.ss.android.ugc.tools.a.c.a(dVar.f138779a);
                dVar.a(z6, z7);
            }
        } else if (viewHolder instanceof e) {
            b bVar4 = this.f138773m.get(i2);
            if (bVar4 instanceof j) {
                fVar = bVar4;
            }
            j jVar = fVar;
            if (jVar != null) {
                e eVar = (e) viewHolder;
                if (i2 == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (this.f138773m.size() > 1 && i2 == this.f138773m.size() - 1) {
                    z8 = true;
                }
                l.d(jVar, "");
                eVar.f138789b = jVar;
                eVar.a(z5, z8);
                eVar.f138788a.setCustomSelected(jVar.f138825d);
                eVar.f138788a.setOnClickListener(new e.b(eVar, jVar));
            }
        } else if (viewHolder instanceof l) {
            b bVar5 = this.f138773m.get(i2);
            if (bVar5 instanceof k) {
                fVar = bVar5;
            }
            k kVar = fVar;
            if (kVar != null) {
                l lVar = (l) viewHolder;
                if (i2 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.f138773m.size() > 1 && i2 == this.f138773m.size() - 1) {
                    z8 = true;
                }
                l.d(kVar, "");
                lVar.a(kVar.f138826c);
                lVar.a(z4, z8);
                lVar.f138828a.setOnClickListener(new l.b(lVar, kVar));
            }
        } else if (viewHolder instanceof h) {
            b bVar6 = this.f138773m.get(i2);
            if (bVar6 instanceof c) {
                fVar = bVar6;
            }
            c cVar = fVar;
            if (cVar != null) {
                h hVar = (h) viewHolder;
                if (i2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f138773m.size() <= 1 || i2 != this.f138773m.size() - 1) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                h.f.b.l.d(cVar, "");
                ComposerBeauty composerBeauty2 = cVar.f138776c;
                UrlModel urlModel2 = new UrlModel();
                Effect effect = composerBeauty2.getEffect();
                if (effect.getIconUrl() != null) {
                    urlModel2.setUri(composerBeauty2.getEffect().getIconUrl().getUri());
                    urlModel2.setUrlList(composerBeauty2.getEffect().getIconUrl().getUrlList());
                }
                hVar.f138810e.setCustomSelected(composerBeauty2.getSelected());
                com.ss.android.ugc.aweme.tools.beauty.views.b bVar7 = hVar.f138810e;
                if (!hVar.f138816k.f138853k || !composerBeauty2.getShowDot()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                bVar7.a(z3);
                hVar.a(cVar.f138777d);
                if (cVar.f138777d) {
                    hVar.f138810e.a(cVar.f138776c.getEnable(), cVar.f138776c.getSelected());
                }
                View view = hVar.f138812g;
                h.f.b.l.b(view, "");
                if (composerBeauty2.getShowRedDot()) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                view.setVisibility(i3);
                if (!composerBeauty2.isLocalItem() || composerBeauty2.getLocalIconResId() <= 0) {
                    com.ss.android.ugc.tools.c.a.a(hVar.f138810e.getImageView(), urlModel2);
                } else {
                    hVar.f138810e.getImageView().setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    hVar.f138810e.getImageView().setImageResource(composerBeauty2.getLocalIconResId());
                }
                hVar.f138810e.setText(effect.getName());
                hVar.f138810e.setOnClickListener(new h.b(urlModel2, composerBeauty2, hVar, cVar, z, z2));
                com.ss.android.ugc.tools.a.c.a(hVar.f138810e);
                int downloadState = composerBeauty2.getDownloadState();
                hVar.f138813h = downloadState;
                if (com.ss.android.ugc.aweme.tools.beauty.d.c(composerBeauty2)) {
                    ImageView imageView = hVar.f138811f;
                    h.f.b.l.b(imageView, "");
                    imageView.setVisibility(8);
                } else {
                    if (downloadState != 4) {
                        if (downloadState == 8) {
                            ImageView imageView2 = hVar.f138811f;
                            h.f.b.l.b(imageView2, "");
                            imageView2.setVisibility(0);
                            hVar.f138811f.setImageResource(2131230948);
                            if (!hVar.a().isRunning()) {
                                hVar.a().start();
                            }
                            ImageView imageView3 = hVar.f138811f;
                            h.f.b.l.b(imageView3, "");
                            imageView3.setVisibility(0);
                        } else if (downloadState != 16) {
                            hVar.b();
                            ImageView imageView4 = hVar.f138811f;
                            h.f.b.l.b(imageView4, "");
                            imageView4.setVisibility(0);
                        }
                    }
                    hVar.b();
                    ImageView imageView5 = hVar.f138811f;
                    h.f.b.l.b(imageView5, "");
                    imageView5.setVisibility(8);
                }
                hVar.a(z, z2);
            }
        }
        this.f138766f = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: com.ss.android.ugc.aweme.tools.beauty.a.d */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: com.ss.android.ugc.aweme.tools.beauty.a.e */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: com.ss.android.ugc.aweme.tools.beauty.a.l */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: com.ss.android.ugc.aweme.tools.beauty.a.h */
    /* JADX WARN: Multi-variable type inference failed */
    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        g gVar;
        MethodCollector.i(12516);
        h.f.b.l.d(viewGroup, "");
        boolean z = true;
        if (i2 == 1) {
            h.f.b.l.d(viewGroup, "");
            h.f.b.l.d(aVar, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.dw, viewGroup, false);
            h.f.b.l.b(a2, "");
            g gVar2 = new g(a2, aVar);
            gVar2.f138800d = aVar.p;
            gVar = gVar2;
        } else if (i2 == 2) {
            com.ss.android.ugc.aweme.tools.beauty.b.a.d dVar = aVar.f138771k;
            h.f.b.l.d(viewGroup, "");
            h.f.b.l.d(dVar, "");
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.dt, viewGroup, false);
            h.f.b.l.b(a3, "");
            com.ss.android.ugc.aweme.tools.beauty.views.b a4 = h.a.a(a3, dVar);
            a4.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            a4.setId(R.id.bt1);
            CircleDraweeView imageView = a4.getImageView();
            Context context = a3.getContext();
            h.f.b.l.b(context, "");
            imageView.setBackground(h.a.a(context, dVar.f138847e, dVar.f138846d));
            TextView textView = a4.getTextView();
            if (textView != null) {
                textView.setTextSize(1, dVar.f138843a);
            }
            ((FrameLayout) a3.findViewById(R.id.b5i)).addView(a4, 0);
            a3.findViewById(R.id.bt2).setBackgroundResource(dVar.f138854l);
            d dVar2 = new d(a3, dVar);
            dVar2.f138780b = aVar.o;
            gVar = dVar2;
        } else if (i2 == 3) {
            com.ss.android.ugc.aweme.tools.beauty.b.a.d dVar3 = aVar.f138771k;
            h.f.b.l.d(viewGroup, "");
            h.f.b.l.d(dVar3, "");
            View a5 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.du, viewGroup, false);
            h.f.b.l.b(a5, "");
            com.ss.android.ugc.aweme.tools.beauty.views.b a6 = h.a.a(a5, dVar3);
            a6.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            a6.setId(R.id.bt1);
            CircleDraweeView imageView2 = a6.getImageView();
            Context context2 = a5.getContext();
            h.f.b.l.b(context2, "");
            imageView2.setBackground(h.a.a(context2, dVar3.f138847e, dVar3.f138846d));
            a6.getImageView().setActualImageResource(2131232179);
            TextView textView2 = a6.getTextView();
            if (textView2 != null) {
                textView2.setTextSize(1, dVar3.f138843a);
            }
            TextView textView3 = a6.getTextView();
            if (textView3 != null) {
                Context context3 = a5.getContext();
                h.f.b.l.b(context3, "");
                textView3.setText(context3.getResources().getString(0));
            }
            ((FrameLayout) a5.findViewById(R.id.b5i)).addView(a6, 0);
            e eVar = new e(a5, dVar3);
            eVar.f138790c = aVar.r;
            gVar = eVar;
        } else if (i2 != 4) {
            com.ss.android.ugc.aweme.tools.beauty.b.a.d dVar4 = aVar.f138771k;
            h.f.b.l.d(viewGroup, "");
            h.f.b.l.d(dVar4, "");
            View a7 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.dt, viewGroup, false);
            h.f.b.l.b(a7, "");
            com.ss.android.ugc.aweme.tools.beauty.views.b a8 = h.a.a(a7, dVar4);
            a8.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            a8.setId(R.id.bt1);
            CircleDraweeView imageView3 = a8.getImageView();
            Context context4 = a7.getContext();
            h.f.b.l.b(context4, "");
            imageView3.setBackground(h.a.a(context4, dVar4.f138847e, dVar4.f138846d));
            TextView textView4 = a8.getTextView();
            if (textView4 != null) {
                textView4.setTextSize(1, dVar4.f138843a);
            }
            ((FrameLayout) a7.findViewById(R.id.b5i)).addView(a8, 0);
            a7.findViewById(R.id.bt2).setBackgroundResource(dVar4.f138854l);
            h hVar = new h(a7, dVar4);
            hVar.f138814i = aVar.n;
            gVar = hVar;
        } else {
            com.ss.android.ugc.aweme.tools.beauty.b.a.d dVar5 = aVar.f138771k;
            h.f.b.l.d(viewGroup, "");
            h.f.b.l.d(dVar5, "");
            View a9 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.dv, viewGroup, false);
            h.f.b.l.b(a9, "");
            com.ss.android.ugc.aweme.tools.beauty.views.b a10 = h.a.a(a9, dVar5);
            a10.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            a10.setId(R.id.bt1);
            CircleDraweeView imageView4 = a10.getImageView();
            Context context5 = a9.getContext();
            h.f.b.l.b(context5, "");
            imageView4.setBackground(h.a.a(context5, dVar5.f138847e, dVar5.f138846d));
            a10.getImageView().setActualImageResource(2131232180);
            TextView textView5 = a10.getTextView();
            if (textView5 != null) {
                textView5.setTextSize(1, dVar5.f138843a);
            }
            TextView textView6 = a10.getTextView();
            if (textView6 != null) {
                Context context6 = a9.getContext();
                h.f.b.l.b(context6, "");
                textView6.setText(context6.getResources().getString(0));
            }
            ((FrameLayout) a9.findViewById(R.id.b5i)).addView(a10, 0);
            l lVar = new l(a9, dVar5);
            lVar.f138829b = aVar.q;
            gVar = lVar;
        }
        try {
            if (gVar.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(gVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) gVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(gVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = gVar.getClass().getName();
        MethodCollector.o(12516);
        return gVar;
    }
}
