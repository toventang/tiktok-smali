package com.ss.android.ugc.aweme.story.edit.business.shared.toolbar;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.p;
import com.bytedance.jedi.arch.v;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.y;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class f extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a, com.ss.android.ugc.aweme.story.edit.clip.impl.b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f137483a = {new y(f.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0)};

    /* renamed from: g  reason: collision with root package name */
    public static final b f137484g = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public View f137485b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f137486c;

    /* renamed from: d  reason: collision with root package name */
    public ViewGroup f137487d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Integer, com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.a.a> f137488e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public AnimatorSet f137489f;

    /* renamed from: h  reason: collision with root package name */
    private final h.h f137490h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f137491i;

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.o.f f137492j;

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final l f137500a = new l();

        static {
            Covode.recordClassIndex(89944);
        }

        l() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(89931);
    }

    public final StoryEditToolbarViewModel a() {
        return (StoryEditToolbarViewModel) this.f137490h.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(89933);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f137492j;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.v
    public final m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.story.edit.clip.a.h' to match base method */
    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.a
    public final /* synthetic */ VEEditClipCluster cy_() {
        return (VEEditClipCluster) this.f137491i.a(this, f137483a[0]);
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        AnimatorSet animatorSet = this.f137489f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f137493a;

        static {
            Covode.recordClassIndex(89934);
        }

        c(f fVar) {
            this.f137493a = fVar;
        }

        public final void run() {
            AnimatorSet animatorSet;
            Activity activity = this.f137493a.f42913m;
            if ((activity == null || !activity.isFinishing()) && (animatorSet = this.f137493a.f137489f) != null) {
                animatorSet.start();
            }
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<StoryEditToolbarViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(89932);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.StoryEditToolbarViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                com.bytedance.scene.j r5 = r0.o
                h.k.c r0 = r6.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                h.f.b.l.b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.s.a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass$inlined     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                h.f.b.l.b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_story_edit_business_shared_toolbar_StoryEditToolbarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.c.b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a
                androidx.lifecycle.ad r1 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r6.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_story_edit_business_shared_toolbar_StoryEditToolbarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.f.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_story_edit_business_shared_toolbar_StoryEditToolbarScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    private final void d() {
        if (com.ss.android.ugc.aweme.story.base.a.d.a().f136873a > 0) {
            AnimatorSet animatorSet = this.f137489f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Collection<com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.a.a> values = this.f137488e.values();
            ArrayList arrayList = new ArrayList(n.a(values, 10));
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getTextFadeOutAnimation());
            }
            List g2 = n.g((Iterable) arrayList);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(200L);
            animatorSet2.playTogether(g2);
            this.f137489f = animatorSet2;
            ViewGroup viewGroup = this.f137486c;
            if (viewGroup == null) {
                h.f.b.l.a("toolbarContainer");
            }
            viewGroup.postDelayed(new c(this), (long) com.ss.android.ugc.aweme.story.base.a.d.a().f136873a);
        }
    }

    public final void b() {
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new o(4, 2131233901, R.string.g6x));
        arrayList.add(new o(3, 2131233902, R.string.hfg));
        arrayList.add(new o(2, 2131233898, R.string.blj));
        arrayList.add(new o(1, 2131233899, R.string.g8_));
        StoryEditClipModel d2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.d(this);
        if (d2 != null) {
            if (com.ss.android.ugc.aweme.story.edit.model.a.f(d2)) {
                i2 = 2131233900;
                i3 = R.string.g8e;
            }
            i2 = 2131233903;
            i3 = R.string.g8c;
        } else {
            i2 = 2131233903;
            i3 = R.string.g8c;
        }
        arrayList.add(new o(5, i2, i3));
        a().a(arrayList);
    }

    public static final /* synthetic */ ViewGroup a(f fVar) {
        ViewGroup viewGroup = fVar.f137486c;
        if (viewGroup == null) {
            h.f.b.l.a("toolbarContainer");
        }
        return viewGroup;
    }

    public static final /* synthetic */ ViewGroup b(f fVar) {
        ViewGroup viewGroup = fVar.f137487d;
        if (viewGroup == null) {
            h.f.b.l.a("titleLayout");
        }
        return viewGroup;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, List<? extends o>, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(89938);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        public static final class a extends com.ss.android.ugc.aweme.views.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o f137494a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g f137495b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f137496c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List f137497d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Map f137498e;

            static {
                Covode.recordClassIndex(89939);
            }

            @Override // com.ss.android.ugc.aweme.views.d
            public final void a(View view) {
                this.f137495b.this$0.a().a(new n(this.f137494a.f137512a));
            }

            a(o oVar, g gVar, boolean z, List list, Map map) {
                this.f137494a = oVar;
                this.f137495b = gVar;
                this.f137496c = z;
                this.f137497d = list;
                this.f137498e = map;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, List<? extends o> list) {
            boolean z;
            StoryEditClipModel d2;
            boolean z2;
            int i2;
            MethodCollector.i(2117);
            List<? extends o> list2 = list;
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(list2, "");
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            com.ss.android.ugc.aweme.story.base.a.c a2 = com.ss.android.ugc.aweme.story.base.a.d.a();
            Long l2 = 0L;
            Long valueOf = Long.valueOf(com.ss.android.ugc.aweme.story.base.b.a.a().getLong("story_edit_toolbar_last_show_time", l2.longValue()));
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                int i3 = a2.f136874b;
                if (i3 == 0 || (i3 == 1 ? longValue == 0 : i3 != 2 || System.currentTimeMillis() - longValue > 86400000)) {
                    z = true;
                } else {
                    z = false;
                }
                for (T t : list2) {
                    Activity activity = this.this$0.f42913m;
                    if (activity == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(activity, "");
                    f fVar = this.this$0;
                    if (t.f137512a == 5 && ((d2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.d(fVar)) == null || com.ss.android.ugc.aweme.story.edit.model.a.e(d2))) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    int i4 = t.f137514c;
                    int i5 = t.f137513b;
                    h.f.b.l.d(activity, "");
                    com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.a.a aVar = new com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.a.a(activity, (byte) 0);
                    aVar.setText(i4);
                    aVar.setIcon(i5);
                    aVar.setTextEnable(z);
                    if (z2) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    aVar.setVisibility(i2);
                    arrayList.add(aVar);
                    linkedHashMap.put(Integer.valueOf(t.f137512a), aVar);
                    aVar.setOnClickListener(new a(t, this, z, arrayList, linkedHashMap));
                }
                this.this$0.f137488e.clear();
                this.this$0.f137488e.putAll(linkedHashMap);
                f.a(this.this$0).removeAllViews();
                f fVar2 = this.this$0;
                fVar2.a(f.a(fVar2), arrayList);
                if (z) {
                    com.ss.android.ugc.aweme.story.base.b.a.a().storeLong("story_edit_toolbar_last_show_time", Long.valueOf(System.currentTimeMillis()).longValue());
                }
                z zVar = z.f158842a;
                MethodCollector.o(2117);
                return zVar;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            MethodCollector.o(2117);
            throw nullPointerException;
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f137499a;

        static {
            Covode.recordClassIndex(89943);
        }

        k(f fVar) {
            this.f137499a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f137499a.a().a(new n(0));
        }
    }

    public f(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.f137492j = fVar;
        h.k.c a2 = h.f.b.ab.a(StoryEditToolbarViewModel.class);
        this.f137490h = h.i.a((h.f.a.a) new a(this, a2, a2));
        this.f137491i = com.bytedance.o.b.a.a(getDiContainer(), VEEditClipCluster.class);
    }

    static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, p, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(89936);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, p pVar) {
            h.f.b.l.d(bVar, "");
            h.f.b.l.d(pVar, "");
            this.this$0.b();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(89942);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            int i2;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            ViewGroup a2 = f.a(this.this$0);
            if (booleanValue) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            a2.setVisibility(i2);
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(89935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            int i2;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            View view = this.this$0.f137485b;
            if (view == null) {
                h.f.b.l.a("ivBack");
            }
            if (booleanValue) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.f$f  reason: collision with other inner class name */
    static final class C3611f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(89937);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3611f(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            int i2;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.a.a aVar = this.this$0.f137488e.get(5);
            if (aVar != null) {
                if (booleanValue) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                aVar.setVisibility(i2);
            }
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Integer, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(89940);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(bVar, "");
            ViewGroup.LayoutParams layoutParams = f.b(this.this$0).getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = intValue;
                f.b(this.this$0).setLayoutParams(marginLayoutParams);
            }
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(89941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
            int i2;
            int i3;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar, "");
            com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.a.a aVar = this.this$0.f137488e.get(5);
            if (aVar != null) {
                if (booleanValue) {
                    i2 = 2131233900;
                } else {
                    i2 = 2131233903;
                }
                aVar.setIcon(i2);
                if (booleanValue) {
                    i3 = R.string.g8e;
                } else {
                    i3 = R.string.g8c;
                }
                aVar.setText(i3);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.b2u, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a2;
        this.f137487d = viewGroup2;
        if (viewGroup2 == null) {
            h.f.b.l.a("titleLayout");
        }
        return viewGroup2;
    }

    public final void a(ViewGroup viewGroup, List<? extends View> list) {
        MethodCollector.i(2401);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) list.get(i2);
            viewGroup.addView(view);
            if (i2 > 0) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ((LinearLayout.LayoutParams) layoutParams).topMargin = en.a(20.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    MethodCollector.o(2401);
                    throw nullPointerException;
                }
            }
        }
        d();
        MethodCollector.o(2401);
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.a(view, bundle);
        View c2 = c(R.id.q9);
        h.f.b.l.b(c2, "");
        this.f137485b = c2;
        if (c2 == null) {
            h.f.b.l.a("ivBack");
        }
        c2.setOnClickListener(new k(this));
        View c3 = c(R.id.c95);
        h.f.b.l.b(c3, "");
        ViewGroup viewGroup = (ViewGroup) c3;
        this.f137486c = viewGroup;
        if (viewGroup == null) {
            h.f.b.l.a("toolbarContainer");
        }
        viewGroup.setOnClickListener(l.f137500a);
        selectNonNullSubscribe(a(), g.f137501a, new ah(), new g(this));
        selectNonNullSubscribe(a(), j.f137504a, new ah(), new h(this));
        selectNonNullSubscribe(a(), k.f137505a, new ah(), new i(this));
        selectNonNullSubscribe(a(), l.f137506a, new ah(), new j(this));
        selectNonNullSubscribe(a(), m.f137507a, new ah(), new d(this));
        selectNonNullSubscribe(a(), h.f137502a, new ah(), new e(this));
        selectNonNullSubscribe(a(), i.f137503a, new ah(), new C3611f(this));
        b();
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
