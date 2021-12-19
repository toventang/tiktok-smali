package com.ss.android.ugc.aweme.detail.vm;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.i;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.detail.operators.ad;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseDetailShareVM<S extends com.bytedance.ext_power_list.i<S, ITEM>, ITEM extends com.bytedance.ies.powerlist.b.a, Cursor> extends AssemListViewModel<S, ITEM, Cursor> implements com.ss.android.ugc.aweme.detail.i.k, aa {

    /* renamed from: k  reason: collision with root package name */
    public boolean f79999k;

    /* renamed from: l  reason: collision with root package name */
    public ad f80000l;

    static {
        Covode.recordClassIndex(49782);
    }

    public abstract int a(String str);

    public abstract Cursor a(com.ss.android.ugc.aweme.feed.param.b bVar);

    public abstract Aweme b(ITEM item);

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean cannotLoadMore() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public Object getViewModel() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean init(Fragment fragment) {
        h.f.b.l.d(fragment, "");
        return true;
    }

    public static final class j extends m implements h.f.a.a<androidx.lifecycle.m> {
        final /* synthetic */ androidx.lifecycle.m $owner;

        static {
            Covode.recordClassIndex(49805);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(androidx.lifecycle.m mVar) {
            super(0);
            this.$owner = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ androidx.lifecycle.m invoke() {
            return this.$owner;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean isLoading() {
        return this.f79999k;
    }

    public static final class k extends m implements h.f.a.a<com.bytedance.assem.arch.viewModel.g<S>> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f80020a = new k();

        static {
            Covode.recordClassIndex(49806);
        }

        k() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b((byte) 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public void unInit() {
        this.f80000l = null;
        this.f79999k = false;
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ ad $detailFragmentPanel;
        final /* synthetic */ BaseDetailShareVM this$0;

        static {
            Covode.recordClassIndex(49785);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(BaseDetailShareVM baseDetailShareVM, ad adVar) {
            super(0);
            this.this$0 = baseDetailShareVM;
            this.$detailFragmentPanel = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (this.this$0.f80000l != null) {
                this.this$0.f79999k = true;
                com.ss.android.ugc.aweme.base.utils.m.a(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f80003a;

                    static {
                        Covode.recordClassIndex(49786);
                    }

                    {
                        this.f80003a = r1;
                    }

                    public final void run() {
                        this.f80003a.$detailFragmentPanel.aO_();
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ ad $detailFragmentPanel;
        final /* synthetic */ BaseDetailShareVM this$0;

        static {
            Covode.recordClassIndex(49792);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(BaseDetailShareVM baseDetailShareVM, ad adVar) {
            super(0);
            this.this$0 = baseDetailShareVM;
            this.$detailFragmentPanel = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (this.this$0.f80000l != null) {
                this.this$0.f79999k = true;
                com.ss.android.ugc.aweme.base.utils.m.a(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM.e.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ e f80009a;

                    static {
                        Covode.recordClassIndex(49793);
                    }

                    {
                        this.f80009a = r1;
                    }

                    public final void run() {
                        this.f80009a.$detailFragmentPanel.b();
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.a<z> {
        final /* synthetic */ ad $detailFragmentPanel;
        final /* synthetic */ BaseDetailShareVM this$0;

        static {
            Covode.recordClassIndex(49800);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(BaseDetailShareVM baseDetailShareVM, ad adVar) {
            super(0);
            this.this$0 = baseDetailShareVM;
            this.$detailFragmentPanel = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (this.this$0.f80000l != null) {
                this.this$0.f79999k = true;
                com.ss.android.ugc.aweme.base.utils.m.a(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM.h.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ h f80016a;

                    static {
                        Covode.recordClassIndex(49801);
                    }

                    {
                        this.f80016a = r1;
                    }

                    public final void run() {
                        this.f80016a.$detailFragmentPanel.bh_();
                    }
                });
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean isDataEmpty() {
        List<ITEM> c2 = ((com.bytedance.ext_power_list.i) d().a()).c();
        if (c2 == null || c2.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (r0 != null) goto L_0x0040;
     */
    @Override // com.ss.android.ugc.aweme.detail.i.k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> a() {
        /*
            r4 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0 = r4
            com.bytedance.assem.arch.viewModel.g r0 = r0.d()
            com.bytedance.assem.arch.viewModel.j r0 = r0.a()
            com.bytedance.ext_power_list.i r0 = (com.bytedance.ext_power_list.i) r0
            java.util.List r0 = r0.c()
            if (r0 == 0) goto L_0x003e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x001f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r1.next()
            com.bytedance.ies.powerlist.b.a r0 = (com.bytedance.ies.powerlist.b.a) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.b(r0)
            if (r0 == 0) goto L_0x001f
            r2.add(r0)
            goto L_0x001f
        L_0x0035:
            java.util.List r2 = (java.util.List) r2
            java.util.List r0 = h.a.n.k(r2)
            if (r0 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            h.a.z r0 = h.a.z.INSTANCE
        L_0x0040:
            r3.addAll(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM.a():java.util.List");
    }

    public static final class l extends m implements h.f.a.b<S, S> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f80021a = new l();

        static {
            Covode.recordClassIndex(49807);
        }

        l() {
            super(1);
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Object obj) {
            h.f.b.l.d(obj, "");
            return obj;
        }
    }

    static final class a extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ ad $detailFragmentPanel;
        final /* synthetic */ BaseDetailShareVM this$0;

        static {
            Covode.recordClassIndex(49783);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(BaseDetailShareVM baseDetailShareVM, ad adVar) {
            super(1);
            this.this$0 = baseDetailShareVM;
            this.$detailFragmentPanel = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            final Throwable th2 = th;
            h.f.b.l.d(th2, "");
            this.this$0.f79999k = false;
            com.ss.android.ugc.aweme.base.utils.m.a(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f80001a;

                static {
                    Covode.recordClassIndex(49784);
                }

                {
                    this.f80001a = r1;
                }

                public final void run() {
                    this.f80001a.$detailFragmentPanel.c(new Exception(th2));
                }
            });
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<com.bytedance.ext_power_list.l, z> {
        final /* synthetic */ ad $detailFragmentPanel;
        final /* synthetic */ BaseDetailShareVM this$0;

        static {
            Covode.recordClassIndex(49787);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(BaseDetailShareVM baseDetailShareVM, ad adVar) {
            super(1);
            this.this$0 = baseDetailShareVM;
            this.$detailFragmentPanel = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ext_power_list.l lVar) {
            h.f.b.l.d(lVar, "");
            if (this.this$0.f80000l != null) {
                this.this$0.f79999k = false;
                this.this$0.b((h.f.a.b) new h.f.a.b<S, z>(this) {
                    /* class com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM.c.AnonymousClass1 */
                    final /* synthetic */ c this$0;

                    static {
                        Covode.recordClassIndex(49788);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(Object obj) {
                        final boolean z;
                        final ArrayList arrayList;
                        com.bytedance.ext_power_list.i iVar = (com.bytedance.ext_power_list.i) obj;
                        h.f.b.l.d(iVar, "");
                        com.bytedance.ext_power_list.l a2 = iVar.e().a();
                        if (a2 != null) {
                            z = a2.f28712b;
                        } else {
                            z = false;
                        }
                        List<ITEM> c2 = iVar.c();
                        if (c2 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (ITEM item : c2) {
                                Aweme b2 = this.this$0.this$0.b((com.bytedance.ies.powerlist.b.a) item);
                                if (b2 != null) {
                                    arrayList2.add(b2);
                                }
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        com.ss.android.ugc.aweme.base.utils.m.a(new Runnable(this) {
                            /* class com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM.c.AnonymousClass1.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f80004a;

                            static {
                                Covode.recordClassIndex(49789);
                            }

                            {
                                this.f80004a = r1;
                            }

                            public final void run() {
                                this.f80004a.this$0.$detailFragmentPanel.b(arrayList, z);
                            }
                        });
                        return z.f158842a;
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ ad $detailFragmentPanel;
        final /* synthetic */ BaseDetailShareVM this$0;

        static {
            Covode.recordClassIndex(49790);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(BaseDetailShareVM baseDetailShareVM, ad adVar) {
            super(1);
            this.this$0 = baseDetailShareVM;
            this.$detailFragmentPanel = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            final Throwable th2 = th;
            h.f.b.l.d(th2, "");
            this.this$0.f79999k = false;
            com.ss.android.ugc.aweme.base.utils.m.a(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f80007a;

                static {
                    Covode.recordClassIndex(49791);
                }

                {
                    this.f80007a = r1;
                }

                public final void run() {
                    this.f80007a.$detailFragmentPanel.b(new Exception(th2));
                }
            });
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.b<com.bytedance.ext_power_list.l, z> {
        final /* synthetic */ ad $detailFragmentPanel;
        final /* synthetic */ BaseDetailShareVM this$0;

        static {
            Covode.recordClassIndex(49794);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(BaseDetailShareVM baseDetailShareVM, ad adVar) {
            super(1);
            this.this$0 = baseDetailShareVM;
            this.$detailFragmentPanel = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ext_power_list.l lVar) {
            h.f.b.l.d(lVar, "");
            if (this.this$0.f80000l != null) {
                this.this$0.f79999k = false;
                this.this$0.b((h.f.a.b) new h.f.a.b<S, z>(this) {
                    /* class com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM.f.AnonymousClass1 */
                    final /* synthetic */ f this$0;

                    static {
                        Covode.recordClassIndex(49795);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(Object obj) {
                        final boolean z;
                        com.bytedance.ext_power_list.i iVar = (com.bytedance.ext_power_list.i) obj;
                        h.f.b.l.d(iVar, "");
                        com.bytedance.ext_power_list.l a2 = iVar.b().a();
                        if (a2 != null) {
                            z = a2.f28712b;
                        } else {
                            z = false;
                        }
                        List<ITEM> c2 = iVar.c();
                        if (c2 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (ITEM item : c2) {
                                Aweme b2 = this.this$0.this$0.b((com.bytedance.ies.powerlist.b.a) item);
                                if (b2 != null) {
                                    arrayList.add(b2);
                                }
                            }
                            final ArrayList arrayList2 = arrayList;
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                com.ss.android.ugc.aweme.base.utils.m.a(new Runnable(this) {
                                    /* class com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM.f.AnonymousClass1.AnonymousClass2 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ AnonymousClass1 f80011a;

                                    static {
                                        Covode.recordClassIndex(49797);
                                    }

                                    {
                                        this.f80011a = r1;
                                    }

                                    public final void run() {
                                        this.f80011a.this$0.$detailFragmentPanel.a(arrayList2, z);
                                    }
                                });
                                return z.f158842a;
                            }
                        }
                        com.ss.android.ugc.aweme.base.utils.m.a(new Runnable(this) {
                            /* class com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM.f.AnonymousClass1.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f80010a;

                            static {
                                Covode.recordClassIndex(49796);
                            }

                            {
                                this.f80010a = r1;
                            }

                            public final void run() {
                                this.f80010a.this$0.$detailFragmentPanel.f();
                            }
                        });
                        return z.f158842a;
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ ad $detailFragmentPanel;
        final /* synthetic */ BaseDetailShareVM this$0;

        static {
            Covode.recordClassIndex(49798);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(BaseDetailShareVM baseDetailShareVM, ad adVar) {
            super(1);
            this.this$0 = baseDetailShareVM;
            this.$detailFragmentPanel = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            final Throwable th2 = th;
            h.f.b.l.d(th2, "");
            this.this$0.f79999k = false;
            com.ss.android.ugc.aweme.base.utils.m.a(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM.g.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f80014a;

                static {
                    Covode.recordClassIndex(49799);
                }

                {
                    this.f80014a = r1;
                }

                public final void run() {
                    this.f80014a.$detailFragmentPanel.a(new Exception(th2));
                }
            });
            return z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.b<com.bytedance.ext_power_list.l, z> {
        final /* synthetic */ ad $detailFragmentPanel;
        final /* synthetic */ BaseDetailShareVM this$0;

        static {
            Covode.recordClassIndex(49802);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(BaseDetailShareVM baseDetailShareVM, ad adVar) {
            super(1);
            this.this$0 = baseDetailShareVM;
            this.$detailFragmentPanel = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ext_power_list.l lVar) {
            h.f.b.l.d(lVar, "");
            if (this.this$0.f80000l != null) {
                this.this$0.f79999k = false;
                this.this$0.b((h.f.a.b) new h.f.a.b<S, z>(this) {
                    /* class com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM.i.AnonymousClass1 */
                    final /* synthetic */ i this$0;

                    static {
                        Covode.recordClassIndex(49803);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(Object obj) {
                        final boolean z;
                        final ArrayList arrayList;
                        com.bytedance.ext_power_list.i iVar = (com.bytedance.ext_power_list.i) obj;
                        h.f.b.l.d(iVar, "");
                        com.bytedance.ext_power_list.l a2 = iVar.d().a();
                        if (a2 != null) {
                            z = a2.f28711a;
                        } else {
                            z = false;
                        }
                        List<ITEM> c2 = iVar.c();
                        if (c2 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (ITEM item : c2) {
                                Aweme b2 = this.this$0.this$0.b((com.bytedance.ies.powerlist.b.a) item);
                                if (b2 != null) {
                                    arrayList2.add(b2);
                                }
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        com.ss.android.ugc.aweme.base.utils.m.a(new Runnable(this) {
                            /* class com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM.i.AnonymousClass1.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f80017a;

                            static {
                                Covode.recordClassIndex(49804);
                            }

                            {
                                this.f80017a = r1;
                            }

                            public final void run() {
                                this.f80017a.this$0.$detailFragmentPanel.c(arrayList, z);
                            }
                        });
                        return z.f158842a;
                    }
                });
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public boolean deleteItem(String str) {
        h.f.b.l.d(str, "");
        int a2 = a(str);
        if (a2 < 0) {
            return false;
        }
        ad adVar = this.f80000l;
        if (adVar == null) {
            return true;
        }
        adVar.b(a2);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public void bindView(ad adVar) {
        h.f.b.l.d(adVar, "");
        this.f80000l = adVar;
        a(a.f80022a, com.bytedance.assem.arch.viewModel.l.a(), new d(this, adVar), new e(this, adVar), new f(this, adVar));
        a(b.f80023a, com.bytedance.assem.arch.viewModel.l.a(), new g(this, adVar), new h(this, adVar), new i(this, adVar));
        a(c.f80024a, com.bytedance.assem.arch.viewModel.l.a(), new a(this, adVar), new b(this, adVar), new c(this, adVar));
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        h.f.b.l.d(bVar, "");
        Cursor a2 = a(bVar);
        if (i2 == 1) {
            g();
        } else if (i2 == 2) {
            b((Object) a2);
        } else if (i2 == 4) {
            a((Object) a2);
        }
    }
}
