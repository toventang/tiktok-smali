package com.ss.android.ugc.aweme.favorites.ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.favorites.c.j;
import com.ss.android.ugc.aweme.favorites.c.l;
import com.ss.android.ugc.aweme.favorites.ui.ah;
import com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel;
import com.ss.android.ugc.aweme.metrics.n;
import com.zhiliaoapp.musically.R;
import h.f.a.r;
import h.f.a.s;
import h.f.b.ab;
import h.f.b.m;
import h.i;
import h.k.k;
import h.z;

public final class ae extends Fragment implements q, j.g, l.c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f90819b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public o f90820a;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f90821c = i.a((h.f.a.a) b.f90823a);

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f90822d;

    public static final class d extends m implements h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.e, com.ss.android.ugc.aweme.favorites.viewmodel.e> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(57073);
        }

        public d() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.favorites.viewmodel.e invoke(com.ss.android.ugc.aweme.favorites.viewmodel.e eVar) {
            h.f.b.l.c(eVar, "");
            return eVar;
        }
    }

    static {
        Covode.recordClassIndex(57069);
    }

    public final f.a.b.a b() {
        return (f.a.b.a) this.f90821c.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57070);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(androidx.fragment.app.e eVar, boolean z, String str, String str2, int i2, o oVar) {
            h.f.b.l.d(eVar, "");
            h.f.b.l.d(oVar, "");
            ae aeVar = new ae();
            aeVar.a(oVar);
            Bundle bundle = new Bundle();
            bundle.putString("excludeId", str);
            bundle.putString("enterFrom", str2);
            bundle.putBoolean("moveToCollection", z);
            bundle.putInt("firstPageCount", i2);
            aeVar.setArguments(bundle);
            new a.C1112a().a(0).a(aeVar).b(false).f45299a.show(eVar.getSupportFragmentManager(), "VideoCollectionChooseCollection");
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final com.bytedance.jedi.arch.ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    static final class b extends m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f90823a = new b();

        static {
            Covode.recordClassIndex(57071);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    public static final class c extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(57072);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        b().a();
        SparseArray sparseArray = this.f90822d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.c.j.g
    public final void a() {
        String str;
        n nVar = new n();
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("enterFrom");
        } else {
            str = null;
        }
        nVar.a(str).f();
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            h.f.b.l.b(activity, "");
            new f(this, new e(this, activity)).invoke();
        }
    }

    static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ h.f.a.b $createCollection;
        final /* synthetic */ ae this$0;

        static {
            Covode.recordClassIndex(57077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ae aeVar, h.f.a.b bVar) {
            super(0);
            this.this$0 = aeVar;
            this.$createCollection = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String string = this.this$0.requireContext().getString(R.string.bt9);
            h.f.b.l.b(string, "");
            String string2 = this.this$0.requireContext().getString(R.string.ffv);
            h.f.b.l.b(string2, "");
            ah a2 = ah.a.a(string, (String) null, string2, false, (ah.b) new a(this));
            ae aeVar = this.this$0;
            h.f.b.l.c(aeVar, "");
            h.f.b.l.c(a2, "");
            com.bytedance.tux.sheet.sheet.a c2 = a.b.c(aeVar);
            if (c2 != null) {
                c2.a(a2);
            }
            return z.f158842a;
        }

        public static final class a implements ah.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f90827a;

            static {
                Covode.recordClassIndex(57078);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(f fVar) {
                this.f90827a = fVar;
            }

            @Override // com.ss.android.ugc.aweme.favorites.ui.ah.b
            public final void a(String str) {
                h.f.b.l.d(str, "");
                this.f90827a.$createCollection.invoke(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.c.l.c
    public final void c() {
        com.bytedance.assem.arch.viewModel.b bVar;
        String str;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(VideoCollectionListViewModel.class);
        c cVar = new c(a2);
        d dVar2 = d.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, cVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((ag) this, true), u.c.f25670a, dVar2, u.a((Fragment) this, true), u.b((Fragment) this, true));
        } else if (dVar == null || h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, cVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, dVar2, u.a((Fragment) this, false), u.b((Fragment) this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        VideoCollectionListViewModel videoCollectionListViewModel = (VideoCollectionListViewModel) bVar.getValue();
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("excludeId");
        } else {
            str = null;
        }
        videoCollectionListViewModel.a(true, str);
    }

    public final void a(o oVar) {
        h.f.b.l.d(oVar, "");
        this.f90820a = oVar;
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ae f90828a;

        static {
            Covode.recordClassIndex(57079);
        }

        g(ae aeVar) {
            this.f90828a = aeVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public final void onClick(android.view.View r2) {
            /*
                r1 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r2)
                com.ss.android.ugc.aweme.favorites.ui.ae r0 = r1.f90828a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.ui.ae.g.onClick(android.view.View):void");
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // com.ss.android.ugc.aweme.favorites.c.j.g
    public final void a(com.ss.android.ugc.aweme.favorites.api.d r3) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r3, r0)
            com.ss.android.ugc.aweme.favorites.ui.o r1 = r2.f90820a
            if (r1 == 0) goto L_0x000d
            r0 = 0
            r1.a(r0, r3)
        L_0x000d:
            r0 = r2
            com.bytedance.tux.sheet.sheet.a.b.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.ui.ae.a(com.ss.android.ugc.aweme.favorites.api.d):void");
    }

    static final class h extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ boolean $moveToCollection;
        final /* synthetic */ View $view;
        final /* synthetic */ ae this$0;

        static {
            Covode.recordClassIndex(57080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(ae aeVar, boolean z, View view) {
            super(1);
            this.this$0 = aeVar;
            this.$moveToCollection = z;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            h.f.b.l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>) new h.f.a.b<com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.ae.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(57081);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar) {
                    String str;
                    com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                    h.f.b.l.d(iVar2, "");
                    boolean z = this.this$0.$moveToCollection;
                    Bundle arguments = this.this$0.this$0.getArguments();
                    if (arguments != null) {
                        str = arguments.getString("excludeId");
                    } else {
                        str = null;
                    }
                    iVar2.a(new j.e(z, str));
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<com.bytedance.assem.arch.core.q, z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.ae.h.AnonymousClass2 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(57082);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.q qVar) {
                    com.bytedance.assem.arch.core.q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.f25599e = this.this$0.$view.findViewById(R.id.a8i);
                    qVar2.a(ab.a(j.class));
                    qVar2.f25596b = new j();
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<com.bytedance.assem.arch.core.q, z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.ae.h.AnonymousClass3 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(57083);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.q qVar) {
                    com.bytedance.assem.arch.core.q qVar2 = qVar;
                    h.f.b.l.d(qVar2, "");
                    qVar2.f25599e = this.this$0.$view.findViewById(R.id.e_o);
                    qVar2.a(ab.a(l.class));
                    qVar2.f25596b = new l();
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<String, z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ ae this$0;

        static {
            Covode.recordClassIndex(57074);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ae aeVar, androidx.fragment.app.e eVar) {
            super(1);
            this.this$0 = aeVar;
            this.$activity = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            final String str2 = str;
            h.f.b.l.d(str2, "");
            f.a.b.b a2 = new com.ss.android.ugc.aweme.favorites.e.j().f90621b.a(new com.ss.android.ugc.aweme.favorites.api.f(1, null, str2, null, null, null, null, null, 250)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.ae.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f90824a;

                static {
                    Covode.recordClassIndex(57075);
                }

                {
                    this.f90824a = r1;
                }

                /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                    java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
                    	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                    	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                    	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                    	at java.base/java.util.Objects.checkIndex(Objects.java:359)
                    	at java.base/java.util.ArrayList.get(ArrayList.java:427)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                    */
                @Override // f.a.d.f
                public final /* synthetic */ void accept(java.lang.Object r9) {
                    /*
                        r8 = this;
                        com.ss.android.ugc.aweme.favorites.api.g r9 = (com.ss.android.ugc.aweme.favorites.api.g) r9
                        com.ss.android.ugc.aweme.metrics.i r2 = new com.ss.android.ugc.aweme.metrics.i
                        r2.<init>()
                        com.ss.android.ugc.aweme.favorites.ui.ae$e r0 = r8.f90824a
                        com.ss.android.ugc.aweme.favorites.ui.ae r0 = r0.this$0
                        android.os.Bundle r1 = r0.getArguments()
                        if (r1 == 0) goto L_0x0048
                        java.lang.String r0 = "enterFrom"
                        java.lang.String r0 = r1.getString(r0)
                    L_0x0017:
                        com.ss.android.ugc.aweme.metrics.i r1 = r2.a(r0)
                        r0 = 0
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        com.ss.android.ugc.aweme.metrics.i r0 = r1.a(r0)
                        r0.f()
                        com.ss.android.ugc.aweme.favorites.ui.ae$e r0 = r8.f90824a
                        com.ss.android.ugc.aweme.favorites.ui.ae r0 = r0.this$0
                        com.ss.android.ugc.aweme.favorites.ui.o r1 = r0.f90820a
                        if (r1 == 0) goto L_0x0040
                        r0 = 1
                        com.ss.android.ugc.aweme.favorites.api.d r2 = new com.ss.android.ugc.aweme.favorites.api.d
                        java.lang.String r3 = r9.f90469a
                        java.lang.String r4 = r7
                        r5 = 0
                        r6 = 0
                        r7 = 28
                        r2.<init>(r3, r4, r5, r6, r7)
                        r1.a(r0, r2)
                    L_0x0040:
                        com.ss.android.ugc.aweme.favorites.ui.ae$e r0 = r8.f90824a
                        com.ss.android.ugc.aweme.favorites.ui.ae r0 = r0.this$0
                        com.bytedance.tux.sheet.sheet.a.b.a(r0)
                        return
                    L_0x0048:
                        r0 = 0
                        goto L_0x0017
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.ui.ae.e.AnonymousClass1.accept(java.lang.Object):void");
                }
            }, new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.favorites.ui.ae.e.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f90826a;

                static {
                    Covode.recordClassIndex(57076);
                }

                {
                    this.f90826a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    new com.bytedance.tux.g.b(this.f90826a.$activity).e(R.string.bp3).b();
                }
            });
            h.f.b.l.b(a2, "");
            f.a.j.a.a(a2, this.this$0.b());
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r0 == null) goto L_0x0018;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.ui.ae.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.zp, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, com.bytedance.jedi.arch.ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, com.bytedance.jedi.arch.ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, com.bytedance.jedi.arch.ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, com.bytedance.jedi.arch.ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, com.bytedance.jedi.arch.ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, com.bytedance.jedi.arch.ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
