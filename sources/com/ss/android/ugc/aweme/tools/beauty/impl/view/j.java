package com.ss.android.ugc.aweme.tools.beauty.impl.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.h;
import com.ss.android.ugc.aweme.tools.beauty.service.f;
import com.ss.android.ugc.tools.view.style.StyleRecyclerView;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.m;
import h.f.a.q;
import h.f.b.l;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.am;
import kotlinx.coroutines.av;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public class j implements com.ss.android.ugc.aweme.tools.beauty.b.c.c {

    /* renamed from: a  reason: collision with root package name */
    public final am f139092a = com.ss.android.ugc.aweme.tools.beauty.h.a.a();

    /* renamed from: b  reason: collision with root package name */
    public final RelativeLayout f139093b;

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f139094c;

    /* renamed from: d  reason: collision with root package name */
    final TextView f139095d;

    /* renamed from: e  reason: collision with root package name */
    ComposerBeauty f139096e;

    /* renamed from: f  reason: collision with root package name */
    ComposerBeauty f139097f;

    /* renamed from: g  reason: collision with root package name */
    boolean f139098g;

    /* renamed from: h  reason: collision with root package name */
    public Map<BeautyCategory, List<ComposerBeauty>> f139099h;

    /* renamed from: i  reason: collision with root package name */
    com.ss.android.ugc.aweme.tools.beauty.a.a f139100i;

    /* renamed from: j  reason: collision with root package name */
    com.ss.android.ugc.aweme.tools.beauty.a.a f139101j;

    /* renamed from: k  reason: collision with root package name */
    public final Context f139102k;

    /* renamed from: l  reason: collision with root package name */
    public final View f139103l;

    /* renamed from: m  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.tools.beauty.b.a.e f139104m;
    public final c n;
    private final StyleRecyclerView o;
    private final FrameLayout p;
    private final StyleRecyclerView q;

    static {
        Covode.recordClassIndex(90968);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.c
    public final ComposerBeauty b() {
        return this.f139096e;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.c
    public final ComposerBeauty c() {
        return this.f139097f;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.c
    public final com.ss.android.ugc.aweme.tools.beauty.a.a d() {
        return this.f139100i;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.c
    public final com.ss.android.ugc.aweme.tools.beauty.a.a e() {
        return this.f139101j;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.c
    public final boolean a() {
        return this.f139098g;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.c
    public final void g() {
        bz unused = kotlinx.coroutines.i.a(this.f139092a, com.ss.android.ugc.aweme.dependence.beauty.b.a.f79582a, null, new i(this, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.c
    public final boolean h() {
        if (!this.f139104m.f138859c.q) {
            return true;
        }
        Set<BeautyCategory> keySet = this.f139099h.keySet();
        if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                if (!this.n.b(it.next().getCategoryResponse().getId())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.c
    public final void i() {
        if (this.f139104m.f138859c.q) {
            this.f139100i.a(true);
            this.f139100i.notifyDataSetChanged();
            Iterator<T> it = this.f139099h.keySet().iterator();
            while (it.hasNext()) {
                this.n.a(it.next().getCategoryResponse().getId(), true);
            }
            this.n.a("auto");
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.c
    public final void f() {
        String str;
        ComposerBeauty composerBeauty = this.f139096e;
        c cVar = this.n;
        if (composerBeauty == null || (str = composerBeauty.getCategoryId()) == null) {
            str = "";
        }
        if (cVar.b(str) && composerBeauty != null) {
            T t = null;
            if (!composerBeauty.isCollectionType()) {
                a(this, composerBeauty, false, true, false, null, 18);
                this.n.e(composerBeauty);
            } else if (this.f139098g) {
                TextView textView = this.f139095d;
                l.b(textView, "");
                textView.setText(composerBeauty.getEffect().getName());
                String d2 = this.n.d(composerBeauty);
                List<ComposerBeauty> childList = composerBeauty.getChildList();
                if (childList != null) {
                    Iterator<T> it = childList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (l.a((Object) next.getEffect().getResourceId(), (Object) d2)) {
                            t = next;
                            break;
                        }
                    }
                    a(this, t, this.f139098g, false, false, null, 20);
                    com.ss.android.ugc.aweme.tools.beauty.a.a.a(this.f139101j, childList);
                }
            } else {
                this.n.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.c
    public final void a(ComposerBeauty composerBeauty) {
        this.f139096e = composerBeauty;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.c
    public final void b(ComposerBeauty composerBeauty) {
        this.f139097f = composerBeauty;
    }

    /* access modifiers changed from: package-private */
    public final void d(ComposerBeauty composerBeauty) {
        c cVar = this.n;
        l.d(composerBeauty, "");
        cVar.f139050a.m(composerBeauty);
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.c.b.a.k implements m<am, h.c.d<? super z>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(90977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(j jVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = jVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            i iVar = new i(this.this$0, dVar);
            iVar.L$0 = obj;
            return iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((i) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* access modifiers changed from: package-private */
        public static final class a extends h.c.b.a.k implements m<am, h.c.d<? super z>, Object> {
            int label;
            final /* synthetic */ i this$0;

            static {
                Covode.recordClassIndex(90978);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(i iVar, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = iVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                l.d(dVar, "");
                return new a(this.this$0, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.j$i$a$a  reason: collision with other inner class name */
            public static final /* synthetic */ class C3673a extends h.f.b.j implements h.f.a.b<ComposerBeauty, Boolean> {
                static {
                    Covode.recordClassIndex(90979);
                }

                C3673a(com.ss.android.ugc.aweme.tools.beauty.g.b bVar) {
                    super(1, bVar, com.ss.android.ugc.aweme.tools.beauty.g.b.class, "isBeautyAvailable", "isBeautyAvailable(Lcom/ss/android/ugc/aweme/beauty/ComposerBeauty;)Z", 0);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ Boolean invoke(ComposerBeauty composerBeauty) {
                    ComposerBeauty composerBeauty2 = composerBeauty;
                    l.d(composerBeauty2, "");
                    return Boolean.valueOf(((com.ss.android.ugc.aweme.tools.beauty.g.b) this.receiver).a(composerBeauty2));
                }
            }

            /* access modifiers changed from: package-private */
            public static final /* synthetic */ class c extends h.f.b.j implements h.f.a.b<ComposerBeauty, Boolean> {
                static {
                    Covode.recordClassIndex(90981);
                }

                c(com.ss.android.ugc.aweme.tools.beauty.g.b bVar) {
                    super(1, bVar, com.ss.android.ugc.aweme.tools.beauty.g.b.class, "isBeautyAvailable", "isBeautyAvailable(Lcom/ss/android/ugc/aweme/beauty/ComposerBeauty;)Z", 0);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ Boolean invoke(ComposerBeauty composerBeauty) {
                    ComposerBeauty composerBeauty2 = composerBeauty;
                    l.d(composerBeauty2, "");
                    return Boolean.valueOf(((com.ss.android.ugc.aweme.tools.beauty.g.b) this.receiver).a(composerBeauty2));
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f1, code lost:
                if (r1 == null) goto L_0x00f3;
             */
            /* JADX WARNING: Removed duplicated region for block: B:84:0x0140 A[SYNTHETIC] */
            @Override // h.c.b.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                // Method dump skipped, instructions count: 361
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.beauty.impl.view.j.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* access modifiers changed from: package-private */
            public static final /* synthetic */ class b extends h.f.b.j implements m<String, String, int[]> {
                static {
                    Covode.recordClassIndex(90980);
                }

                b(c cVar) {
                    super(2, cVar, c.class, "checkComposerNodeExclusion", "checkComposerNodeExclusion(Ljava/lang/String;Ljava/lang/String;)[I", 0);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ int[] invoke(String str, String str2) {
                    String str3 = str;
                    String str4 = str2;
                    l.d(str3, "");
                    l.d(str4, "");
                    return ((c) this.receiver).a(str3, str4);
                }
            }

            /* access modifiers changed from: package-private */
            public static final /* synthetic */ class d extends h.f.b.j implements m<String, String, int[]> {
                static {
                    Covode.recordClassIndex(90982);
                }

                d(c cVar) {
                    super(2, cVar, c.class, "checkComposerNodeExclusion", "checkComposerNodeExclusion(Ljava/lang/String;Ljava/lang/String;)[I", 0);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ int[] invoke(String str, String str2) {
                    String str3 = str;
                    String str4 = str2;
                    l.d(str3, "");
                    l.d(str4, "");
                    return ((c) this.receiver).a(str3, str4);
                }
            }
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                av avVar = kotlinx.coroutines.i.b((am) this.L$0, bf.f159041b, null, new a(this, null), 2);
                this.label = 1;
                if (avVar.a(this) == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (this.this$0.f139098g) {
                this.this$0.f139101j.notifyDataSetChanged();
            } else {
                this.this$0.f139100i.notifyDataSetChanged();
            }
            return z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<String, Boolean> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(90971);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(j jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            return Boolean.valueOf(this.this$0.n.b(str2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.j$j  reason: collision with other inner class name */
    static final /* synthetic */ class C3674j extends h.f.b.j implements h.f.a.b<ComposerBeauty, Boolean> {
        static {
            Covode.recordClassIndex(90983);
        }

        C3674j(com.ss.android.ugc.aweme.tools.beauty.g.b bVar) {
            super(1, bVar, com.ss.android.ugc.aweme.tools.beauty.g.b.class, "isBeautyAvailable", "isBeautyAvailable(Lcom/ss/android/ugc/aweme/beauty/ComposerBeauty;)Z", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            l.d(composerBeauty2, "");
            return Boolean.valueOf(((com.ss.android.ugc.aweme.tools.beauty.g.b) this.receiver).a(composerBeauty2));
        }
    }

    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f139105a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f139106b;

        static {
            Covode.recordClassIndex(90973);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f139106b) {
                RelativeLayout relativeLayout = this.f139105a.f139094c;
                l.b(relativeLayout, "");
                relativeLayout.setVisibility(8);
                return;
            }
            RelativeLayout relativeLayout2 = this.f139105a.f139093b;
            l.b(relativeLayout2, "");
            relativeLayout2.setVisibility(8);
        }

        e(j jVar, boolean z) {
            this.f139105a = jVar;
            this.f139106b = z;
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f139107a;

        static {
            Covode.recordClassIndex(90974);
        }

        f(j jVar) {
            this.f139107a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ComposerBeauty composerBeauty = this.f139107a.f139097f;
            if (composerBeauty != null) {
                this.f139107a.e(composerBeauty);
            }
            j jVar = this.f139107a;
            RelativeLayout relativeLayout = jVar.f139093b;
            l.b(relativeLayout, "");
            relativeLayout.setVisibility(0);
            jVar.f139100i.notifyDataSetChanged();
            jVar.a(true);
            jVar.f139098g = false;
            j.a(jVar, jVar.f139096e, false, false, false, null, 22);
            jVar.n.c(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.c
    public final void a(BeautyCategory beautyCategory) {
        T t;
        l.d(beautyCategory, "");
        com.ss.android.ugc.aweme.tools.beauty.a.a.a(this.f139100i, beautyCategory.getBeautyList());
        Iterator<T> it = this.f139100i.f138761a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.getSelected()) {
                break;
            }
        }
        a(this, t, false, false, false, null, 30);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.c
    public final void c(ComposerBeauty composerBeauty) {
        l.d(composerBeauty, "");
        com.ss.android.ugc.aweme.tools.beauty.d.a(composerBeauty, new C3674j(this.n.b()), new k(this.n));
        if (this.f139098g) {
            this.f139101j.notifyDataSetChanged();
        } else {
            this.f139100i.notifyDataSetChanged();
        }
    }

    public final void e(ComposerBeauty composerBeauty) {
        com.ss.android.ugc.aweme.tools.beauty.b.c.b bVar;
        l.d(composerBeauty, "");
        if (!this.f139104m.f138903m || (bVar = (com.ss.android.ugc.aweme.tools.beauty.b.c.b) this.n.f139053d.a(com.ss.android.ugc.aweme.tools.beauty.b.c.b.class)) == null || bVar.c()) {
            this.n.e(composerBeauty);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.b<ComposerBeauty, z> {
        final /* synthetic */ boolean $isSwitch;
        final /* synthetic */ Map $valueMap;

        static {
            Covode.recordClassIndex(90976);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(boolean z, Map map) {
            super(1);
            this.$isSwitch = z;
            this.$valueMap = map;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ComposerBeauty composerBeauty) {
            float f2;
            ComposerBeautyExtraBeautify.ItemsBean itemsBean;
            ComposerBeauty composerBeauty2 = composerBeauty;
            l.d(composerBeauty2, "");
            Map map = this.$valueMap;
            if (this.$isSwitch) {
                int progressValue = composerBeauty2.getProgressValue();
                l.d(composerBeauty2, "");
                List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty2.getBeautifyExtra().getItems();
                if (items == null || (itemsBean = (ComposerBeautyExtraBeautify.ItemsBean) n.h((List) items)) == null) {
                    f2 = (float) progressValue;
                } else {
                    f2 = com.ss.android.ugc.aweme.tools.beauty.h.a(new h.a(itemsBean.getDoubleDirection(), 0, 0, itemsBean.getMax(), itemsBean.getMin(), 0.0f, progressValue, 334));
                }
            } else {
                f2 = 0.0f;
            }
            map.put(composerBeauty2, Float.valueOf(f2));
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.c
    public final void a(androidx.c.a<String, Integer> aVar) {
        T t;
        T t2;
        if (aVar != null) {
            for (Map.Entry<String, Integer> entry : aVar.entrySet()) {
                Iterator<T> it = this.f139100i.f138761a.iterator();
                while (true) {
                    t = null;
                    if (!it.hasNext()) {
                        t2 = null;
                        break;
                    }
                    t2 = it.next();
                    if (l.a((Object) entry.getKey(), (Object) t2.getEffect().getEffectId())) {
                        break;
                    }
                }
                T t3 = t2;
                if (t3 != null) {
                    Integer value = entry.getValue();
                    l.b(value, "");
                    t3.setDownloadState(value.intValue());
                }
                Iterator<T> it2 = this.f139101j.f138761a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next = it2.next();
                    if (l.a((Object) entry.getKey(), (Object) next.getEffect().getEffectId())) {
                        t = next;
                        break;
                    }
                }
                T t4 = t;
                if (t4 != null) {
                    Integer value2 = entry.getValue();
                    l.b(value2, "");
                    t4.setDownloadState(value2.intValue());
                }
            }
        }
        this.f139100i.notifyDataSetChanged();
        this.f139101j.notifyDataSetChanged();
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.c
    public final void a(List<BeautyCategory> list) {
        l.d(list, "");
        for (T t : list) {
            this.f139099h.put(t, t.getBeautyList());
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.b(0);
        StyleRecyclerView styleRecyclerView = this.o;
        l.b(styleRecyclerView, "");
        styleRecyclerView.setLayoutManager(linearLayoutManager);
        StyleRecyclerView styleRecyclerView2 = this.o;
        l.b(styleRecyclerView2, "");
        styleRecyclerView2.setAdapter(this.f139100i);
        StyleRecyclerView styleRecyclerView3 = this.o;
        l.b(styleRecyclerView3, "");
        RecyclerView.f itemAnimator = styleRecyclerView3.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f3833l = 0;
        }
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager();
        linearLayoutManager2.b(0);
        StyleRecyclerView styleRecyclerView4 = this.q;
        l.b(styleRecyclerView4, "");
        styleRecyclerView4.setLayoutManager(linearLayoutManager2);
        StyleRecyclerView styleRecyclerView5 = this.q;
        l.b(styleRecyclerView5, "");
        styleRecyclerView5.setAdapter(this.f139101j);
        StyleRecyclerView styleRecyclerView6 = this.o;
        l.b(styleRecyclerView6, "");
        RecyclerView.f itemAnimator2 = styleRecyclerView6.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.f3833l = 0;
        }
        if (this.f139098g) {
            a(this, this.f139097f, true, false, false, null, 20);
        } else {
            a(this, this.f139096e, false, false, false, null, 22);
        }
        this.p.setOnClickListener(new f(this));
    }

    public final void a(boolean z) {
        float f2;
        float f3;
        float f4;
        float f5;
        float d2;
        float f6;
        float f7;
        RelativeLayout relativeLayout = this.f139093b;
        float[] fArr = new float[2];
        float f8 = 0.0f;
        if (z) {
            f2 = -com.ss.android.ugc.aweme.dependence.beauty.a.a.d(this.f139102k);
        } else {
            f2 = 0.0f;
        }
        fArr[0] = f2;
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = -com.ss.android.ugc.aweme.dependence.beauty.a.a.d(this.f139102k);
        }
        fArr[1] = f3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "translationX", fArr);
        RelativeLayout relativeLayout2 = this.f139093b;
        float[] fArr2 = new float[2];
        if (z) {
            f4 = 0.0f;
        } else {
            f4 = 1.0f;
        }
        fArr2[0] = f4;
        if (z) {
            f5 = 1.0f;
        } else {
            f5 = 0.0f;
        }
        fArr2[1] = f5;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(relativeLayout2, "alpha", fArr2);
        RelativeLayout relativeLayout3 = this.f139094c;
        float[] fArr3 = new float[2];
        if (z) {
            d2 = 0.0f;
        } else {
            d2 = com.ss.android.ugc.aweme.dependence.beauty.a.a.d(this.f139102k);
        }
        fArr3[0] = d2;
        if (z) {
            f6 = com.ss.android.ugc.aweme.dependence.beauty.a.a.d(this.f139102k);
        } else {
            f6 = 0.0f;
        }
        fArr3[1] = f6;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(relativeLayout3, "translationX", fArr3);
        RelativeLayout relativeLayout4 = this.f139094c;
        float[] fArr4 = new float[2];
        if (z) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        fArr4[0] = f7;
        if (!z) {
            f8 = 1.0f;
        }
        fArr4[1] = f8;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(relativeLayout4, "alpha", fArr4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        animatorSet.addListener(new e(this, z));
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements m<List<? extends ComposerBeauty>, h.f.a.b<? super ComposerBeauty, ? extends z>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f139108a = new g();

        static {
            Covode.recordClassIndex(90975);
        }

        g() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(List<? extends ComposerBeauty> list, h.f.a.b<? super ComposerBeauty, ? extends z> bVar) {
            a(list, bVar);
            return z.f158842a;
        }

        public static void a(List<ComposerBeauty> list, h.f.a.b<? super ComposerBeauty, z> bVar) {
            l.d(bVar, "");
            if (list != null) {
                for (T t : list) {
                    if (t.isCollectionType()) {
                        List<ComposerBeauty> childList = t.getChildList();
                        if (childList != null) {
                            Iterator<T> it = childList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                T next = it.next();
                                T t2 = next;
                                if (t2.getSelected() && !t2.getExtra().isNone()) {
                                    if (next != null) {
                                        bVar.invoke(next);
                                    }
                                }
                            }
                        }
                    } else {
                        bVar.invoke(t);
                    }
                }
            }
        }
    }

    static final /* synthetic */ class k extends h.f.b.j implements m<String, String, int[]> {
        static {
            Covode.recordClassIndex(90984);
        }

        k(c cVar) {
            super(2, cVar, c.class, "checkComposerNodeExclusion", "checkComposerNodeExclusion(Ljava/lang/String;Ljava/lang/String;)[I", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ int[] invoke(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            l.d(str3, "");
            l.d(str4, "");
            return ((c) this.receiver).a(str3, str4);
        }
    }

    static final class d extends h.f.b.m implements m<ComposerBeauty, Integer, z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(90972);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(ComposerBeauty composerBeauty, Integer num) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            num.intValue();
            l.d(composerBeauty2, "");
            j jVar = this.this$0;
            l.d(composerBeauty2, "");
            jVar.d(composerBeauty2);
            jVar.n.a(composerBeauty2);
            j.a(jVar, composerBeauty2, true, true, false, null, 24);
            c cVar = jVar.n;
            l.d(composerBeauty2, "");
            cVar.f139050a.g(composerBeauty2);
            jVar.e(composerBeauty2);
            return z.f158842a;
        }
    }

    static final class a extends h.f.b.m implements m<ComposerBeauty, Integer, z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(90969);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(ComposerBeauty composerBeauty, Integer num) {
            T t;
            ComposerBeauty composerBeauty2 = composerBeauty;
            num.intValue();
            l.d(composerBeauty2, "");
            j jVar = this.this$0;
            String d2 = jVar.n.d(composerBeauty2);
            l.d(composerBeauty2, "");
            jVar.d(composerBeauty2);
            jVar.n.a(composerBeauty2);
            T t2 = null;
            if (composerBeauty2.isCollectionType()) {
                jVar.f139096e = composerBeauty2;
                jVar.n.b(composerBeauty2);
                TextView textView = jVar.f139095d;
                l.b(textView, "");
                textView.setText(composerBeauty2.getEffect().getName());
                RelativeLayout relativeLayout = jVar.f139094c;
                l.b(relativeLayout, "");
                relativeLayout.setVisibility(0);
                jVar.a(false);
                jVar.f139098g = true;
                jVar.n.c(null);
                c cVar = jVar.n;
                l.d(composerBeauty2, "");
                f.b bVar = cVar.f139051b;
                if (bVar != null) {
                    bVar.b(composerBeauty2);
                }
                List<ComposerBeauty> childList = composerBeauty2.getChildList();
                if (childList != null) {
                    com.ss.android.ugc.aweme.tools.beauty.a.a.a(jVar.f139101j, childList);
                    androidx.c.a<String, Integer> value = jVar.n.f139050a.h().getValue();
                    if (value != null) {
                        for (Map.Entry<String, Integer> entry : value.entrySet()) {
                            Iterator<T> it = jVar.f139101j.f138761a.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = null;
                                    break;
                                }
                                t = it.next();
                                if (l.a((Object) t.getEffect().getEffectId(), (Object) entry.getKey())) {
                                    break;
                                }
                            }
                            T t3 = t;
                            if (t3 != null) {
                                t3.getDownloadState();
                                Integer value2 = entry.getValue();
                                if (value2 != null) {
                                    value2.intValue();
                                }
                            }
                        }
                    }
                    jVar.f139101j.notifyDataSetChanged();
                    Iterator<T> it2 = childList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        T next = it2.next();
                        if (l.a((Object) next.getEffect().getResourceId(), (Object) d2)) {
                            t2 = next;
                            break;
                        }
                    }
                    j.a(jVar, t2, true, false, false, null, 28);
                }
            } else {
                jVar.n.b(composerBeauty2);
                j.a(jVar, composerBeauty2, false, true, false, null, 26);
                c cVar2 = jVar.n;
                l.d(composerBeauty2, "");
                cVar2.f139050a.f(composerBeauty2);
                jVar.e(composerBeauty2);
            }
            return z.f158842a;
        }
    }

    public final void a(String str, boolean z) {
        ArrayList arrayList;
        l.d(str, "");
        l.d(str, "");
        Map<BeautyCategory, List<ComposerBeauty>> map = this.f139099h;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<BeautyCategory, List<ComposerBeauty>> entry : map.entrySet()) {
            if (l.a((Object) entry.getKey().getCategoryResponse().getId(), (Object) str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List list = (List) n.d((Iterable) linkedHashMap.values());
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!((ComposerBeauty) obj).getExtra().isNone()) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        g.a(arrayList, new h(z, linkedHashMap2));
        c cVar = this.n;
        l.d(linkedHashMap2, "");
        com.ss.android.ugc.aweme.tools.beauty.b.c.d dVar = (com.ss.android.ugc.aweme.tools.beauty.b.c.d) cVar.f139053d.a(com.ss.android.ugc.aweme.tools.beauty.b.c.d.class);
        if (dVar != null) {
            dVar.a(linkedHashMap2);
        }
    }

    static final class b extends h.f.b.m implements q<String, Boolean, String, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.tools.beauty.a.a $this_apply;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(90970);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.ss.android.ugc.aweme.tools.beauty.a.a aVar, j jVar) {
            super(3);
            this.$this_apply = aVar;
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(String str, Boolean bool, String str2) {
            String str3 = str;
            boolean booleanValue = bool.booleanValue();
            String str4 = str2;
            l.d(str3, "");
            l.d(str4, "");
            this.this$0.n.a(str3, booleanValue);
            if (!booleanValue) {
                Iterator<T> it = this.$this_apply.f138761a.iterator();
                while (it.hasNext()) {
                    it.next().setSelected(false);
                }
                this.this$0.n.a(false);
                m<? super Context, ? super String, z> mVar = com.ss.android.ugc.aweme.tools.beauty.e.a.f138914d;
                if (mVar != null) {
                    Context context = this.this$0.f139102k;
                    String string = this.this$0.f139102k.getString(com.ss.android.ugc.aweme.shortvideo.m.b.f128751e);
                    l.b(string, "");
                    mVar.invoke(context, string);
                }
            }
            this.this$0.n.a();
            com.ss.android.ugc.aweme.dependence.beauty.a.c("setSwitchStatus categoryId = " + str3 + ",value = " + booleanValue);
            this.this$0.a(str3, booleanValue);
            this.this$0.n.a(str4);
            return z.f158842a;
        }
    }

    public j(Context context, View view, com.ss.android.ugc.aweme.tools.beauty.b.a.e eVar, c cVar) {
        b bVar;
        l.d(context, "");
        l.d(view, "");
        l.d(eVar, "");
        l.d(cVar, "");
        this.f139102k = context;
        this.f139103l = view;
        this.f139104m = eVar;
        this.n = cVar;
        this.f139093b = (RelativeLayout) view.findViewById(R.id.do2);
        StyleRecyclerView styleRecyclerView = (StyleRecyclerView) view.findViewById(R.id.dr6);
        this.o = styleRecyclerView;
        this.f139094c = (RelativeLayout) view.findViewById(R.id.do0);
        this.p = (FrameLayout) view.findViewById(R.id.b4s);
        this.f139095d = (TextView) view.findViewById(R.id.ex5);
        StyleRecyclerView styleRecyclerView2 = (StyleRecyclerView) view.findViewById(R.id.dr5);
        this.q = styleRecyclerView2;
        this.f139099h = new LinkedHashMap();
        com.ss.android.ugc.aweme.tools.beauty.b.a.d dVar = eVar.f138859c;
        l.b(styleRecyclerView, "");
        com.ss.android.ugc.aweme.tools.beauty.a.a aVar = new com.ss.android.ugc.aweme.tools.beauty.a.a(dVar, styleRecyclerView);
        aVar.f138762b = new a(this);
        c cVar2 = null;
        if (eVar.f138859c.q) {
            bVar = new b(aVar, this);
        } else {
            bVar = null;
        }
        aVar.f138763c = bVar;
        aVar.f138764d = eVar.f138859c.q ? new c(this) : cVar2;
        this.f139100i = aVar;
        com.ss.android.ugc.aweme.tools.beauty.b.a.d dVar2 = eVar.f138859c;
        l.b(styleRecyclerView2, "");
        com.ss.android.ugc.aweme.tools.beauty.a.a aVar2 = new com.ss.android.ugc.aweme.tools.beauty.a.a(dVar2, styleRecyclerView2);
        aVar2.f138762b = new d(this);
        this.f139101j = aVar2;
    }

    private void a(ComposerBeauty composerBeauty, boolean z, boolean z2, boolean z3, ComposerBeauty composerBeauty2) {
        boolean z4;
        boolean z5;
        if (z3) {
            this.n.c(composerBeauty2);
        }
        if (composerBeauty == null) {
            this.n.a(false);
            return;
        }
        if (z) {
            for (T t : this.f139101j.f138761a) {
                if (!l.a((Object) t, (Object) composerBeauty) || !t.getEnable()) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                t.setSelected(z5);
            }
        } else {
            for (T t2 : this.f139100i.f138761a) {
                if (!l.a((Object) t2, (Object) composerBeauty) || !t2.getEnable()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                t2.setSelected(z4);
            }
        }
        if (composerBeauty.isCollectionType()) {
            this.n.a(false);
            return;
        }
        if (composerBeauty.getExtra().isNone() || !composerBeauty.getEnable()) {
            this.n.a(false);
        } else {
            this.n.a(true);
        }
        if (com.ss.android.ugc.aweme.tools.beauty.d.b(composerBeauty)) {
            this.f139097f = composerBeauty;
        } else {
            this.f139096e = composerBeauty;
        }
        if (com.ss.android.ugc.aweme.tools.beauty.d.g(composerBeauty)) {
            Map<BeautyCategory, List<ComposerBeauty>> map = this.f139099h;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<BeautyCategory, List<ComposerBeauty>> entry : map.entrySet()) {
                if (l.a((Object) entry.getKey().getCategoryResponse().getId(), (Object) composerBeauty.getCategoryId())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            List list = (List) n.d((Iterable) linkedHashMap.values());
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!((ComposerBeauty) obj).getExtra().isNone()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    c cVar = this.n;
                    l.d(arrayList2, "");
                    com.ss.android.ugc.aweme.tools.beauty.b.c.d dVar = (com.ss.android.ugc.aweme.tools.beauty.b.c.d) cVar.f139053d.a(com.ss.android.ugc.aweme.tools.beauty.b.c.d.class);
                    if (dVar != null) {
                        dVar.a(arrayList2);
                    }
                }
            }
        } else {
            c cVar2 = this.n;
            l.d(composerBeauty, "");
            com.ss.android.ugc.aweme.tools.beauty.b.c.e eVar = (com.ss.android.ugc.aweme.tools.beauty.b.c.e) cVar2.f139053d.a(com.ss.android.ugc.aweme.tools.beauty.b.c.e.class);
            if (eVar != null) {
                eVar.a(composerBeauty, z2, true);
            }
        }
        this.n.a();
    }

    public static /* synthetic */ void a(j jVar, ComposerBeauty composerBeauty, boolean z, boolean z2, boolean z3, ComposerBeauty composerBeauty2, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        if ((i2 & 8) != 0) {
            z3 = true;
        }
        if ((i2 & 16) != 0) {
            composerBeauty2 = composerBeauty;
        }
        jVar.a(composerBeauty, z, z2, z3, composerBeauty2);
    }
}
