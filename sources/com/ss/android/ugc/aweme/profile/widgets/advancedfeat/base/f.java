package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.q;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.AdvancedFeaturesHorizontalScrollView;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.w;
import h.z;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class f extends com.bytedance.assem.arch.d.a implements c {

    /* renamed from: m  reason: collision with root package name */
    public static final b f117600m = new b((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public int f117601j;

    /* renamed from: k  reason: collision with root package name */
    final com.bytedance.assem.arch.extensions.i f117602k = new com.bytedance.assem.arch.extensions.i(bQ_(), new a(this, null));

    /* renamed from: l  reason: collision with root package name */
    public final Map<Integer, Boolean> f117603l = new LinkedHashMap();
    private Context n;
    private AdvancedFeaturesHorizontalScrollView o;
    private LinearLayout p;
    private final Set<Integer> q = new LinkedHashSet();
    private final Map<Integer, Integer> r = new LinkedHashMap();
    private final Map<Integer, Integer> s = new LinkedHashMap();
    private final List<Map.Entry<Integer, Integer>> t = new ArrayList();
    private final h.h u = h.i.a((h.f.a.a) new d(this));
    private boolean v;
    private final h.f.a.a<z> w = new e(this);

    /* access modifiers changed from: package-private */
    public final /* synthetic */ class i implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f117604a;

        static {
            Covode.recordClassIndex(76042);
        }

        i(h.f.a.a aVar) {
            this.f117604a = aVar;
        }

        public final /* synthetic */ void onGlobalLayout() {
            l.b(this.f117604a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(76032);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(76034);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.v();
            return z.f158842a;
        }
    }

    public static final class k implements AdvancedFeaturesHorizontalScrollView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f117605a;

        static {
            Covode.recordClassIndex(76044);
        }

        @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.AdvancedFeaturesHorizontalScrollView.a
        public final void a() {
            this.f117605a.v();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(f fVar) {
            this.f117605a = fVar;
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.b
    public final /* synthetic */ b e() {
        return new b();
    }

    public final void u() {
        w();
        x();
        z();
    }

    public static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.a> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76033);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.widgets.h.a.a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.ss.android.ugc.aweme.profile.widgets.h.a.a.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.f.a.invoke():java.lang.Object");
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76037);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            com.ss.android.ugc.aweme.profile.widgets.h.a.a aVar = (com.ss.android.ugc.aweme.profile.widgets.h.a.a) this.this$0.f117602k.getValue();
            if (aVar != null) {
                z = aVar.f117878c;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    private final void z() {
        AdvancedFeaturesHorizontalScrollView advancedFeaturesHorizontalScrollView = this.o;
        if (advancedFeaturesHorizontalScrollView == null) {
            l.a("scrollView");
        }
        advancedFeaturesHorizontalScrollView.setOnScrollListener(new k(this));
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void l() {
        this.f117603l.clear();
        this.v = false;
        this.q.clear();
        super.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.f$i] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p() {
        /*
            r3 = this;
            super.p()
            com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.AdvancedFeaturesHorizontalScrollView r1 = r3.o
            if (r1 != 0) goto L_0x000c
            java.lang.String r0 = "scrollView"
            h.f.b.l.a(r0)
        L_0x000c:
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            h.f.a.a<h.z> r1 = r3.w
            if (r1 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.f$i r0 = new com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.f$i
            r0.<init>(r1)
            r1 = r0
        L_0x001a:
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r1
            r2.removeOnGlobalLayoutListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.f.p():void");
    }

    private final void x() {
        this.t.clear();
        for (Map.Entry<Integer, Integer> entry : this.r.entrySet()) {
            this.t.add(entry);
        }
        List<Map.Entry<Integer, Integer>> list = this.t;
        if (list.size() > 1) {
            n.a((List) list, (Comparator) new h());
        }
    }

    private final void w() {
        User user;
        List<Integer> userAdvancedFeaturesOrder;
        int intValue;
        MethodCollector.i(9631);
        com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
        if (iVar == null || (user = iVar.f117705a) == null || (userAdvancedFeaturesOrder = user.getUserAdvancedFeaturesOrder()) == null) {
            MethodCollector.o(9631);
            return;
        }
        l.b(userAdvancedFeaturesOrder, "");
        int size = userAdvancedFeaturesOrder.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = userAdvancedFeaturesOrder.get(i3);
            if (num != null) {
                int intValue2 = num.intValue();
                Integer num2 = this.r.get(Integer.valueOf(intValue2));
                if (num2 != null) {
                    int intValue3 = num2.intValue();
                    if (intValue3 != i3) {
                        LinearLayout linearLayout = this.p;
                        if (linearLayout == null) {
                            l.a("linearLayout");
                        }
                        View childAt = linearLayout.getChildAt(intValue3);
                        LinearLayout linearLayout2 = this.p;
                        if (linearLayout2 == null) {
                            l.a("linearLayout");
                        }
                        linearLayout2.removeViewAt(intValue3);
                        this.r.put(Integer.valueOf(intValue2), Integer.valueOf(i2));
                        LinearLayout linearLayout3 = this.p;
                        if (linearLayout3 == null) {
                            l.a("linearLayout");
                        }
                        linearLayout3.addView(childAt, i2);
                        for (Map.Entry<Integer, Integer> entry : this.r.entrySet()) {
                            if (entry.getKey().intValue() != intValue2 && i2 <= (intValue = entry.getValue().intValue()) && intValue3 > intValue) {
                                this.r.put(entry.getKey(), Integer.valueOf(entry.getValue().intValue() + 1));
                            }
                        }
                    }
                    i2++;
                }
            }
        }
        MethodCollector.o(9631);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: java.util.Map<java.lang.Integer, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void v() {
        String str;
        for (T t2 : this.t) {
            Integer num = this.r.get(t2.getKey());
            if (num != null) {
                int intValue = num.intValue();
                LinearLayout linearLayout = this.p;
                if (linearLayout == null) {
                    l.a("linearLayout");
                }
                if (intValue < linearLayout.getChildCount() && !l.a((Object) this.f117603l.get(t2.getKey()), (Object) true)) {
                    LinearLayout linearLayout2 = this.p;
                    if (linearLayout2 == null) {
                        l.a("linearLayout");
                    }
                    if (linearLayout2.getChildAt(intValue).getLocalVisibleRect(new Rect())) {
                        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                        if (((Boolean) this.u.getValue()).booleanValue()) {
                            str = "personal_homepage";
                        } else {
                            str = "others_homepage";
                        }
                        r.a("profile_creator_tools_show", dVar.a("enter_from", str).a("target", e.a(((Number) t2.getKey()).intValue())).a("index", this.t.indexOf(t2) + 1).f66730a);
                        this.f117603l.put(t2.getKey(), true);
                        a(((Number) t2.getKey()).intValue());
                    }
                }
            }
        }
    }

    private final void y() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.q.isEmpty()) {
            AdvancedFeaturesHorizontalScrollView advancedFeaturesHorizontalScrollView = this.o;
            if (advancedFeaturesHorizontalScrollView == null) {
                l.a("scrollView");
            }
            advancedFeaturesHorizontalScrollView.setVisibility(8);
            return;
        }
        AdvancedFeaturesHorizontalScrollView advancedFeaturesHorizontalScrollView2 = this.o;
        if (advancedFeaturesHorizontalScrollView2 == null) {
            l.a("scrollView");
        }
        advancedFeaturesHorizontalScrollView2.setVisibility(0);
        Iterator<T> it = this.q.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            Integer num = this.r.get(Integer.valueOf(intValue));
            if (num != null) {
                int intValue2 = num.intValue();
                LinearLayout linearLayout = this.p;
                if (linearLayout == null) {
                    l.a("linearLayout");
                }
                View childAt = linearLayout.getChildAt(intValue2);
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    int minWidth = textView.getMinWidth();
                    Resources system = Resources.getSystem();
                    l.a((Object) system, "");
                    if (minWidth != h.g.a.a(TypedValue.applyDimension(1, 88.0f, system.getDisplayMetrics()))) {
                        Integer num2 = this.s.get(Integer.valueOf(intValue));
                        if (num2 != null) {
                            i5 = num2.intValue();
                        } else {
                            i5 = 0;
                        }
                        textView.setWidth(i5);
                        Resources system2 = Resources.getSystem();
                        l.a((Object) system2, "");
                        textView.setMinWidth(h.g.a.a(TypedValue.applyDimension(1, 88.0f, system2.getDisplayMetrics())));
                        Map<Integer, Integer> map = this.s;
                        Integer valueOf = Integer.valueOf(intValue);
                        Resources system3 = Resources.getSystem();
                        l.a((Object) system3, "");
                        int a2 = h.g.a.a(TypedValue.applyDimension(1, 88.0f, system3.getDisplayMetrics()));
                        Integer num3 = this.s.get(Integer.valueOf(intValue));
                        if (num3 != null) {
                            i6 = num3.intValue();
                        } else {
                            i6 = 0;
                        }
                        map.put(valueOf, Integer.valueOf(Math.max(a2, i6)));
                    }
                }
            } else {
                return;
            }
        }
        if (this.q.size() == 1) {
            Integer num4 = this.r.get(n.c((Iterable) this.q));
            if (num4 != null) {
                int intValue3 = num4.intValue();
                LinearLayout linearLayout2 = this.p;
                if (linearLayout2 == null) {
                    l.a("linearLayout");
                }
                View childAt2 = linearLayout2.getChildAt(intValue3);
                if (childAt2 instanceof TextView) {
                    TextView textView2 = (TextView) childAt2;
                    int minWidth2 = textView2.getMinWidth();
                    Resources system4 = Resources.getSystem();
                    l.a((Object) system4, "");
                    if (minWidth2 != h.g.a.a(TypedValue.applyDimension(1, 154.0f, system4.getDisplayMetrics()))) {
                        Resources system5 = Resources.getSystem();
                        l.a((Object) system5, "");
                        textView2.setMinWidth(h.g.a.a(TypedValue.applyDimension(1, 154.0f, system5.getDisplayMetrics())));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        Context context = this.n;
        if (context == null) {
            l.a("notNullContext");
        }
        Resources resources = context.getResources();
        l.a((Object) resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            i2 = displayMetrics.widthPixels;
        } else {
            i2 = 0;
        }
        int size = i2 / this.q.size();
        int i7 = -2;
        Iterator<T> it2 = this.q.iterator();
        while (it2.hasNext()) {
            int intValue4 = it2.next().intValue();
            Integer num5 = this.s.get(Integer.valueOf(intValue4));
            if (num5 != null) {
                i3 = num5.intValue();
            } else {
                i3 = 0;
            }
            if (i3 < size) {
                Integer num6 = this.s.get(Integer.valueOf(intValue4));
                if (num6 != null) {
                    i4 = num6.intValue();
                } else {
                    i4 = 0;
                }
                i7 = Math.max(i7, i4);
            } else {
                return;
            }
        }
        Iterator<T> it3 = this.q.iterator();
        while (it3.hasNext()) {
            Integer num7 = this.r.get(Integer.valueOf(it3.next().intValue()));
            if (num7 != null) {
                int intValue5 = num7.intValue();
                LinearLayout linearLayout3 = this.p;
                if (linearLayout3 == null) {
                    l.a("linearLayout");
                }
                View childAt3 = linearLayout3.getChildAt(intValue5);
                if (childAt3 instanceof TextView) {
                    TextView textView3 = (TextView) childAt3;
                    textView3.setWidth(i7);
                    Resources system6 = Resources.getSystem();
                    l.a((Object) system6, "");
                    textView3.setMaxWidth(h.g.a.a(TypedValue.applyDimension(1, 288.0f, system6.getDisplayMetrics())));
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76040);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            this.this$0.u();
            return z.f158842a;
        }
    }

    public static final class c extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ List $features;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76035);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(f fVar, List list) {
            super(1);
            this.this$0 = fVar;
            this.$features = list;
        }

        static final class a extends m implements h.f.a.b<q, z> {
            final /* synthetic */ a $feature;

            static {
                Covode.recordClassIndex(76036);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(a aVar) {
                super(1);
                this.$feature = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(q qVar) {
                q qVar2 = qVar;
                l.d(qVar2, "");
                qVar2.a(this.$feature.f117597b);
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            for (a aVar : this.$features) {
                assembler2.b(this.this$0, new a(aVar));
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.f$f  reason: collision with other inner class name */
    public static final class C2984f extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76039);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2984f(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            if (aVar2 != null && !aVar2.f25631b.booleanValue()) {
                this.this$0.f117603l.clear();
                this.this$0.v();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends m implements h.f.a.b<b, b> {
        final /* synthetic */ int $featureId;

        static {
            Covode.recordClassIndex(76043);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(int i2) {
            super(1);
            this.$featureId = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ b invoke(b bVar) {
            if (bVar != null) {
                return new b(new com.bytedance.assem.arch.extensions.a(Integer.valueOf(this.$featureId)));
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.c
    public final View c(com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a aVar) {
        l.d(aVar, "");
        Integer num = this.r.get(Integer.valueOf(aVar.getId()));
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        LinearLayout linearLayout = this.p;
        if (linearLayout == null) {
            l.a("linearLayout");
        }
        return linearLayout.getChildAt(intValue);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.c
    public final boolean d(com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a aVar) {
        l.d(aVar, "");
        Integer num = this.r.get(Integer.valueOf(aVar.getId()));
        if (num == null) {
            return false;
        }
        int intValue = num.intValue();
        LinearLayout linearLayout = this.p;
        if (linearLayout == null) {
            l.a("linearLayout");
        }
        return linearLayout.getChildAt(intValue).getLocalVisibleRect(new Rect());
    }

    private void a(int i2) {
        j jVar = new j(i2);
        Class<f> cls = f.class;
        Class<?>[] interfaces = cls.getInterfaces();
        l.a((Object) interfaces, "");
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls2 : interfaces) {
            if (com.bytedance.assem.arch.service.b.class.isAssignableFrom(cls2)) {
                arrayList.add(cls2);
            }
        }
        while (true) {
            ArrayList arrayList2 = arrayList;
            if (arrayList2.isEmpty()) {
                cls = cls.getSuperclass();
                if (cls != null) {
                    Class<?>[] interfaces2 = cls.getInterfaces();
                    l.a((Object) interfaces2, "");
                    arrayList = new ArrayList();
                    for (Class<?> cls3 : interfaces2) {
                        if (com.bytedance.assem.arch.service.b.class.isAssignableFrom(cls3)) {
                            arrayList.add(cls3);
                        }
                    }
                } else {
                    return;
                }
            } else {
                com.bytedance.assem.arch.core.e eVar = bx_().f25534g;
                Object g2 = n.g((List) arrayList2);
                if (g2 != null) {
                    eVar.a((Class) g2, jVar);
                    return;
                }
                throw new w("null cannot be cast to non-null type");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.f$i] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.assem.arch.core.p
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.view.View r4) {
        /*
            r3 = this;
            java.lang.String r1 = ""
            h.f.b.l.d(r4, r1)
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.AdvancedFeaturesHorizontalScrollView
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            android.content.Context r0 = r3.ar_()
            if (r0 == 0) goto L_0x0061
            r3.n = r0
            r0 = r4
            com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.AdvancedFeaturesHorizontalScrollView r0 = (com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.AdvancedFeaturesHorizontalScrollView) r0
            r3.o = r0
            r0 = 2131362115(0x7f0a0143, float:1.8344001E38)
            android.view.View r0 = r4.findViewById(r0)
            h.f.b.l.b(r0, r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.p = r0
            java.lang.Class<com.ss.android.ugc.aweme.profile.ui.v2.x> r0 = com.ss.android.ugc.aweme.profile.ui.v2.x.class
            h.k.c r2 = h.f.b.ab.a(r0)
            h.k.k r1 = com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.g.f117606a
            com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.f$f r0 = new com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.f$f
            r0.<init>(r3)
            com.bytedance.assem.arch.service.d.a(r3, r2, r1, r0)
            java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.common.j> r0 = com.ss.android.ugc.aweme.profile.widgets.common.j.class
            h.k.c r2 = h.f.b.ab.a(r0)
            h.k.k r1 = com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.h.f117607a
            com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.f$g r0 = new com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.f$g
            r0.<init>(r3)
            com.bytedance.assem.arch.service.d.a(r3, r2, r1, r0)
            com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.AdvancedFeaturesHorizontalScrollView r1 = r3.o
            if (r1 != 0) goto L_0x004e
            java.lang.String r0 = "scrollView"
            h.f.b.l.a(r0)
        L_0x004e:
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            h.f.a.a<h.z> r1 = r3.w
            if (r1 == 0) goto L_0x005c
            com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.f$i r0 = new com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.f$i
            r0.<init>(r1)
            r1 = r0
        L_0x005c:
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r1
            r2.addOnGlobalLayoutListener(r1)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.f.b(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.c
    public final void b(com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a aVar) {
        l.d(aVar, "");
        if (this.q.contains(Integer.valueOf(aVar.getId()))) {
            this.q.remove(Integer.valueOf(aVar.getId()));
            Integer num = this.r.get(Integer.valueOf(aVar.getId()));
            if (num != null) {
                int intValue = num.intValue();
                LinearLayout linearLayout = this.p;
                if (linearLayout == null) {
                    l.a("linearLayout");
                }
                View childAt = linearLayout.getChildAt(intValue);
                l.b(childAt, "");
                childAt.setVisibility(8);
                if (this.v) {
                    y();
                }
            }
        } else if (!this.v && aVar.getId() == this.f117601j) {
            this.v = true;
            y();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.c
    public final void a(com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a aVar) {
        l.d(aVar, "");
        v();
        if (!this.q.contains(Integer.valueOf(aVar.getId()))) {
            this.q.add(Integer.valueOf(aVar.getId()));
            Integer num = this.r.get(Integer.valueOf(aVar.getId()));
            if (num != null) {
                int intValue = num.intValue();
                LinearLayout linearLayout = this.p;
                if (linearLayout == null) {
                    l.a("linearLayout");
                }
                View childAt = linearLayout.getChildAt(intValue);
                l.b(childAt, "");
                childAt.setVisibility(0);
                if (!this.v && aVar.getId() == this.f117601j) {
                    this.v = true;
                }
                if (this.v) {
                    y();
                }
            }
        }
    }

    public static final class h<T> implements Comparator {
        static {
            Covode.recordClassIndex(76041);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a((Integer) t.getValue(), (Integer) t2.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.c
    public final void a(View.OnClickListener onClickListener, com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a aVar) {
        l.d(onClickListener, "");
        l.d(aVar, "");
        Integer num = this.r.get(Integer.valueOf(aVar.getId()));
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.p;
            if (linearLayout == null) {
                l.a("linearLayout");
            }
            linearLayout.getChildAt(intValue).setOnClickListener(onClickListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.c
    public final void b(String str, com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a aVar) {
        l.d(str, "");
        l.d(aVar, "");
        Integer num = this.r.get(Integer.valueOf(aVar.getId()));
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.p;
            if (linearLayout == null) {
                l.a("linearLayout");
            }
            View childAt = linearLayout.getChildAt(intValue);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                int measureText = (int) textView.getPaint().measureText(str);
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                int a2 = measureText + h.g.a.a(TypedValue.applyDimension(1, 46.0f, system.getDisplayMetrics()));
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                if (a2 < h.g.a.a(TypedValue.applyDimension(1, 88.0f, system2.getDisplayMetrics()))) {
                    Resources system3 = Resources.getSystem();
                    l.a((Object) system3, "");
                    a2 = h.g.a.a(TypedValue.applyDimension(1, 88.0f, system3.getDisplayMetrics()));
                }
                Resources system4 = Resources.getSystem();
                l.a((Object) system4, "");
                if (a2 > h.g.a.a(TypedValue.applyDimension(1, 288.0f, system4.getDisplayMetrics()))) {
                    Resources system5 = Resources.getSystem();
                    l.a((Object) system5, "");
                    a2 = h.g.a.a(TypedValue.applyDimension(1, 288.0f, system5.getDisplayMetrics()));
                }
                this.s.put(Integer.valueOf(aVar.getId()), Integer.valueOf(a2));
                textView.setText(str);
            }
            y();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.c
    public final void a(String str, com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a aVar) {
        l.d(str, "");
        l.d(aVar, "");
        Integer num = this.r.get(Integer.valueOf(aVar.getId()));
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.p;
            if (linearLayout == null) {
                l.a("linearLayout");
            }
            View childAt = linearLayout.getChildAt(intValue);
            l.b(childAt, "");
            childAt.setContentDescription(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.c
    public final void a(View view, int i2, com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a aVar) {
        MethodCollector.i(9298);
        l.d(view, "");
        l.d(aVar, "");
        Map<Integer, Integer> map = this.r;
        Integer valueOf = Integer.valueOf(aVar.getId());
        LinearLayout linearLayout = this.p;
        if (linearLayout == null) {
            l.a("linearLayout");
        }
        map.put(valueOf, Integer.valueOf(linearLayout.getChildCount()));
        this.s.put(Integer.valueOf(aVar.getId()), Integer.valueOf(i2));
        LinearLayout linearLayout2 = this.p;
        if (linearLayout2 == null) {
            l.a("linearLayout");
        }
        linearLayout2.addView(view);
        if (aVar.getId() == this.f117601j) {
            u();
        }
        MethodCollector.o(9298);
    }
}
