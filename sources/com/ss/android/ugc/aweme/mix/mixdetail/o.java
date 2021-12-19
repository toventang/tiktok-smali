package com.ss.android.ugc.aweme.mix.mixdetail;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.MixStruct;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.da;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public final class o extends Fragment implements com.bytedance.assem.arch.viewModel.h, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: i  reason: collision with root package name */
    public static final c f110025i = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Aweme f110026a;

    /* renamed from: b  reason: collision with root package name */
    public String f110027b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f110028c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f110029d = "";

    /* renamed from: e  reason: collision with root package name */
    public boolean f110030e = true;

    /* renamed from: f  reason: collision with root package name */
    public int f110031f;

    /* renamed from: g  reason: collision with root package name */
    public String f110032g = "";

    /* renamed from: h  reason: collision with root package name */
    public Long f110033h;

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f110034j;

    /* renamed from: k  reason: collision with root package name */
    private String f110035k = "";

    /* renamed from: l  reason: collision with root package name */
    private String f110036l = "";

    /* renamed from: m  reason: collision with root package name */
    private String f110037m = "";
    private TuxNavBar.a n;
    private SparseArray o;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.d, com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.d> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(70543);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.d invoke(com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.d dVar) {
            h.f.b.l.c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(70541);
    }

    public final View a(int i2) {
        if (this.o == null) {
            this.o = new SparseArray();
        }
        View view = (View) this.o.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.o.put(i2, findViewById);
        return findViewById;
    }

    public final MixVideosViewModel a() {
        return (MixVideosViewModel) this.f110034j.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final androidx.lifecycle.m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.d getReceiverForHostVM() {
        return null;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(331, new org.greenrobot.eventbus.g(o.class, "onMixNameChangeEvent", com.ss.android.ugc.aweme.mix.b.c.class, ThreadMode.MAIN, 0, false));
        hashMap.put(332, new org.greenrobot.eventbus.g(o.class, "onMixDeleteEvent", com.ss.android.ugc.aweme.mix.b.f.class, ThreadMode.MAIN, 0, false));
        hashMap.put(333, new org.greenrobot.eventbus.g(o.class, "onMixManageEvent", com.ss.android.ugc.aweme.mix.b.g.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public static final class c {
        static {
            Covode.recordClassIndex(70544);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.tiktok.proxy.f
    public final androidx.lifecycle.m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.h
    public final com.bytedance.tiktok.proxy.d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.h<com.bytedance.tiktok.proxy.d> getActualReceiverHolder() {
        return this;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(70542);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(70546);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
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
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.mix.mixdetail.o r0 = r2.this$0
                androidx.fragment.app.e r0 = r0.getActivity()
                boolean r0 = r0 instanceof com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity
                if (r0 != 0) goto L_0x0013
                com.ss.android.ugc.aweme.mix.mixdetail.o r0 = r2.this$0
                com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel r0 = r0.a()
                r0.m()
            L_0x0013:
                com.ss.android.ugc.aweme.mix.mixdetail.o r1 = r2.this$0
                r0 = 0
                r1.f110030e = r0
                com.ss.android.ugc.aweme.mix.mixdetail.o r0 = r2.this$0
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                h.z r0 = h.z.f158842a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.mixdetail.o.e.invoke():java.lang.Object");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (!(getActivity() instanceof MixVideoDetailActivity)) {
            a().m();
        }
        this.f110030e = false;
        SparseArray sparseArray = this.o;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, com.bytedance.assem.arch.extensions.a<? extends Aweme>, z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(70552);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(o oVar) {
            super(2);
            this.this$0 = oVar;
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RecyclerView.i f110040a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ k f110041b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ com.bytedance.tiktok.proxy.d f110042c;

            static {
                Covode.recordClassIndex(70553);
            }

            a(RecyclerView.i iVar, k kVar, com.bytedance.tiktok.proxy.d dVar) {
                this.f110040a = iVar;
                this.f110041b = kVar;
                this.f110042c = dVar;
            }

            public final void run() {
                int i2 = this.f110041b.this$0.f110031f;
                double b2 = (double) com.bytedance.common.utility.n.b(this.f110041b.this$0.getContext(), 101.0f);
                Double.isNaN(b2);
                ((LinearLayoutManager) this.f110040a).a(i2, (int) (b2 * 1.5d));
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
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
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.tiktok.proxy.d r22, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r23) {
            /*
            // Method dump skipped, instructions count: 425
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.mixdetail.o.k.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public o() {
        h.k.c a2 = ab.a(MixVideosViewModel.class);
        this.f110034j = new com.bytedance.assem.arch.viewModel.b(a2, new a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((ag) this, true), u.c.f25670a, b.INSTANCE);
    }

    static final class g extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(70548);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Aweme aweme;
            int i2;
            o oVar = this.this$0;
            Context context = oVar.getContext();
            if ((context instanceof androidx.fragment.app.e) && (aweme = oVar.f110026a) != null) {
                h.f.b.l.d(aweme, "");
                Bundle bundle = new Bundle();
                bundle.putSerializable("key_current_aweme", aweme);
                n nVar = new n();
                nVar.setArguments(bundle);
                a.C1112a a2 = new a.C1112a().a(1);
                Resources resources = context.getResources();
                h.f.b.l.a((Object) resources, "");
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                if (displayMetrics != null) {
                    i2 = displayMetrics.heightPixels;
                } else {
                    i2 = 0;
                }
                a2.b((int) (((float) i2) * 0.2f)).a(nVar).f45299a.show(((androidx.fragment.app.e) context).getSupportFragmentManager(), "MixOptionsDialog");
            }
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(70547);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: com.bytedance.tux.sheet.a.a$d[] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0099, code lost:
            if (r1 == null) goto L_0x009b;
         */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke() {
            /*
            // Method dump skipped, instructions count: 168
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.mixdetail.o.f.invoke():java.lang.Object");
        }
    }

    public static final class j extends com.bytedance.s.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f110039a;

        static {
            Covode.recordClassIndex(70551);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(o oVar) {
            this.f110039a = oVar;
        }

        @Override // com.bytedance.s.a.a
        public final void a(Exception exc) {
            super.a(exc);
            DmtStatusView dmtStatusView = (DmtStatusView) this.f110039a.a(R.id.e_o);
            if (dmtStatusView != null) {
                dmtStatusView.h();
            }
        }

        @Override // com.bytedance.s.a.a
        public final void a(boolean z) {
            super.a(z);
            DmtStatusView dmtStatusView = (DmtStatusView) this.f110039a.a(R.id.e_o);
            if (dmtStatusView != null) {
                dmtStatusView.setVisibility(8);
            }
        }
    }

    public static final class n implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f110043a;

        static {
            Covode.recordClassIndex(70556);
        }

        public n(o oVar) {
            this.f110043a = oVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            com.ss.android.ugc.aweme.mix.a.a.a(this.f110043a.f110026a, this.f110043a.f110027b, this.f110043a.f110029d);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f110038a;

        static {
            Covode.recordClassIndex(70545);
        }

        d(o oVar) {
            this.f110038a = oVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            o oVar = this.f110038a;
            if (oVar.f110027b != null) {
                MixVideosViewModel a2 = oVar.a();
                Aweme aweme = oVar.f110026a;
                String str = oVar.f110027b;
                if (str == null) {
                    h.f.b.l.b();
                }
                a2.a(aweme, str);
            }
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
    @org.greenrobot.eventbus.r(a = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMixManageEvent(com.ss.android.ugc.aweme.mix.b.g r2) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r2, r0)
            androidx.fragment.app.e r0 = r1.getActivity()
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.detail.ui.DetailActivity
            if (r0 == 0) goto L_0x0017
            androidx.fragment.app.e r0 = r1.getActivity()
            if (r0 == 0) goto L_0x0016
            r0.finish()
        L_0x0016:
            return
        L_0x0017:
            r0 = r1
            com.bytedance.tux.sheet.sheet.a.b.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.mixdetail.o.onMixManageEvent(com.ss.android.ugc.aweme.mix.b.g):void");
    }

    static final class r extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(70560);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(o oVar) {
            super(1);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            CharSequence text = this.this$0.getText(R.string.b5l);
            h.f.b.l.b(text, "");
            bVar2.c(text, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.mix.mixdetail.o.r.AnonymousClass1 */
                final /* synthetic */ r this$0;

                static {
                    Covode.recordClassIndex(70561);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    com.ss.android.ugc.aweme.mix.a.a.a(this.this$0.this$0.f110027b, this.this$0.this$0.f110029d);
                    this.this$0.this$0.a().h();
                    return z.f158842a;
                }
            });
            CharSequence text2 = this.this$0.getText(R.string.a9e);
            h.f.b.l.b(text2, "");
            bVar2.b(text2, AnonymousClass2.f110047a);
            return z.f158842a;
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
    @org.greenrobot.eventbus.r(a = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMixDeleteEvent(com.ss.android.ugc.aweme.mix.b.f r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r4, r0)
            java.lang.String r0 = r4.f109818b
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            java.lang.String r1 = r3.f110027b
            java.lang.String r0 = r4.f109818b
            boolean r0 = h.f.b.l.a(r1, r0)
            if (r0 == 0) goto L_0x0028
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f109817a
            if (r0 == 0) goto L_0x0024
            r2 = 0
            r0.playlist_info = r2
            com.ss.android.ugc.aweme.mix.b.j r1 = new com.ss.android.ugc.aweme.mix.b.j
            r0 = 0
            r1.<init>(r0, r2)
            com.ss.android.ugc.d.a.c.a(r1)
        L_0x0024:
            r0 = r3
            com.bytedance.tux.sheet.sheet.a.b.a(r0)
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.mixdetail.o.onMixDeleteEvent(com.ss.android.ugc.aweme.mix.b.f):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$o  reason: collision with other inner class name */
    static final class View$OnClickListenerC2819o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f110044a;

        static {
            Covode.recordClassIndex(70557);
        }

        View$OnClickListenerC2819o(o oVar) {
            this.f110044a = oVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.common.r.a("edit_playlist", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f110044a.f110029d).a("playlist_id", this.f110044a.f110027b).f66730a);
            Bundle bundle = new Bundle();
            bundle.putString("key_mix_id", this.f110044a.f110027b);
            bundle.putString("key_mix_name", this.f110044a.f110028c);
            bundle.putString("enter_from", this.f110044a.f110029d);
            IMixFeedService k2 = MixFeedService.k();
            androidx.fragment.app.e activity = this.f110044a.getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            k2.a(activity, bundle);
        }
    }

    static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f110045a;

        static {
            Covode.recordClassIndex(70558);
        }

        p(o oVar) {
            this.f110045a = oVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context context = this.f110045a.getContext();
            if (context != null) {
                IMixFeedService k2 = MixFeedService.k();
                h.f.b.l.b(context, "");
                k2.a(context, new Bundle(), this.f110045a.f110028c, this.f110045a.f110027b, this.f110045a.f110033h, this.f110045a.f110029d);
                com.ss.android.ugc.aweme.mix.a.a.d(this.f110045a.f110029d, "manage_video");
                com.ss.android.ugc.aweme.common.r.a("rename_playlist", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f110045a.f110029d).a("enter_method", "manage_video").a("playlist_id", this.f110045a.f110027b).f66730a);
            }
        }
    }

    static final class q implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f110046a;

        static {
            Covode.recordClassIndex(70559);
        }

        q(o oVar) {
            this.f110046a = oVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            o oVar = this.f110046a;
            Context context = oVar.getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(context, "");
            com.bytedance.tux.dialog.b bVar = new com.bytedance.tux.dialog.b(context);
            Context context2 = oVar.getContext();
            if (context2 == null) {
                h.f.b.l.b();
            }
            com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) bVar.b(context2.getString(R.string.b62, oVar.f110028c)).b(R.string.b63), new r(oVar)).a().b().show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String string;
        MixStruct mixInfo;
        super.onCreate(bundle);
        this.f110031f = 0;
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("key_positioned_aweme");
        } else {
            serializable = null;
        }
        Aweme aweme = (Aweme) serializable;
        this.f110026a = aweme;
        String str7 = "";
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = str7;
        }
        this.f110032g = str;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str2 = arguments2.getString("key_mix_id", str7)) == null) {
            str2 = str7;
        }
        this.f110027b = str2;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str3 = arguments3.getString("key_mix_name", str7)) == null) {
            str3 = str7;
        }
        this.f110028c = str3;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str4 = arguments4.getString("key_video_from", str7)) == null) {
            str4 = str7;
        }
        this.f110037m = str4;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (str5 = arguments5.getString("key_mix_uid", str7)) == null) {
            str5 = str7;
        }
        this.f110035k = str5;
        Bundle arguments6 = getArguments();
        if (arguments6 == null || (str6 = arguments6.getString("key_mix_secuid", str7)) == null) {
            str6 = str7;
        }
        this.f110036l = str6;
        Aweme aweme2 = this.f110026a;
        if (aweme2 != null) {
            String authorUid = aweme2.getAuthorUid();
            if (authorUid == null) {
                authorUid = str7;
            }
            this.f110035k = authorUid;
            String secAuthorUid = aweme2.getSecAuthorUid();
            if (secAuthorUid == null) {
                secAuthorUid = str7;
            }
            this.f110036l = secAuthorUid;
        }
        MixVideosViewModel a2 = a();
        String str8 = this.f110035k;
        if (str8 == null) {
            str8 = str7;
        }
        a2.u = str8;
        MixVideosViewModel a3 = a();
        String str9 = this.f110036l;
        if (str9 == null) {
            str9 = str7;
        }
        a3.v = str9;
        Aweme aweme3 = this.f110026a;
        if (!(aweme3 == null || (mixInfo = aweme3.getMixInfo()) == null)) {
            String str10 = mixInfo.mixName;
            h.f.b.l.b(str10, str7);
            this.f110028c = str10;
        }
        Bundle arguments7 = getArguments();
        if (!(arguments7 == null || (string = arguments7.getString("key_mix_dialog_enter_from", str7)) == null)) {
            str7 = string;
        }
        this.f110029d = str7;
        EventBus.a(EventBus.a(), this);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onMixNameChangeEvent(com.ss.android.ugc.aweme.mix.b.c cVar) {
        String str;
        PlayListInfo playListInfo;
        String str2;
        UrlModel urlModel;
        String str3;
        com.ss.android.ugc.aweme.mix.model.b bVar;
        h.f.b.l.d(cVar, "");
        if (h.f.b.l.a((Object) this.f110027b, (Object) cVar.f109810b)) {
            MixVideosViewModel a2 = a();
            String str4 = cVar.f109809a;
            String str5 = cVar.f109810b;
            h.f.b.l.d(str4, "");
            h.f.b.l.d(str5, "");
            com.ss.android.ugc.aweme.mix.model.d dVar = ((com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.d) a2.d().a()).f110147g;
            com.ss.android.ugc.aweme.mix.model.c cVar2 = null;
            if (dVar != null) {
                str = dVar.mixId;
            } else {
                str = null;
            }
            int i2 = 0;
            if (h.m.p.a(str, str5, false)) {
                com.ss.android.ugc.aweme.mix.model.d dVar2 = new com.ss.android.ugc.aweme.mix.model.d();
                com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.d dVar3 = (com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.d) a2.d().a();
                com.ss.android.ugc.aweme.mix.model.d dVar4 = dVar3.f110147g;
                if (dVar4 != null) {
                    str2 = dVar4.mixId;
                } else {
                    str2 = null;
                }
                dVar2.mixId = str2;
                dVar2.setMixName(str4);
                com.ss.android.ugc.aweme.mix.model.d dVar5 = dVar3.f110147g;
                if (dVar5 != null) {
                    urlModel = dVar5.icon;
                } else {
                    urlModel = null;
                }
                dVar2.icon = urlModel;
                com.ss.android.ugc.aweme.mix.model.d dVar6 = dVar3.f110147g;
                if (dVar6 != null) {
                    str3 = dVar6.extra;
                } else {
                    str3 = null;
                }
                dVar2.extra = str3;
                com.ss.android.ugc.aweme.mix.model.d dVar7 = dVar3.f110147g;
                if (dVar7 != null) {
                    bVar = dVar7.statis;
                } else {
                    bVar = null;
                }
                dVar2.statis = bVar;
                com.ss.android.ugc.aweme.mix.model.d dVar8 = dVar3.f110147g;
                if (dVar8 != null) {
                    i2 = dVar8.mixType;
                }
                dVar2.mixType = i2;
                com.ss.android.ugc.aweme.mix.model.d dVar9 = dVar3.f110147g;
                if (dVar9 != null) {
                    cVar2 = dVar9.status;
                }
                dVar2.status = cVar2;
                a2.a(new MixVideosViewModel.aa(dVar2));
                a2.b(new MixVideosViewModel.ab(str5, str4));
            }
            Aweme aweme = this.f110026a;
            if (!(aweme == null || (playListInfo = aweme.playlist_info) == null)) {
                playListInfo.setMixName(cVar.f109809a);
            }
            new com.bytedance.tux.g.b(this).e(R.string.gj0).b();
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.mix.b.j(true, this.f110026a));
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, Integer, z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(70555);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(o oVar) {
            super(2);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(dVar, "");
            if (intValue == 1) {
                DmtStatusView dmtStatusView = (DmtStatusView) this.this$0.a(R.id.e_o);
                h.f.b.l.b(dmtStatusView, "");
                dmtStatusView.setVisibility(8);
            } else if (intValue == 3) {
                ((DmtStatusView) this.this$0.a(R.id.e_o)).g();
            }
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, com.ss.android.ugc.aweme.mix.model.d, z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(70549);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(o oVar) {
            super(2);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, com.ss.android.ugc.aweme.mix.model.d dVar2) {
            com.ss.android.ugc.aweme.mix.model.d dVar3 = dVar2;
            h.f.b.l.d(dVar, "");
            if (dVar3 != null) {
                o oVar = this.this$0;
                String mixName = dVar3.getMixName();
                h.f.b.l.b(mixName, "");
                oVar.f110028c = mixName;
                ((TuxNavBar) this.this$0.a(R.id.csl)).a(new com.bytedance.tux.navigation.a.g().a(dVar3.getMixName() + " (" + dVar3.statis.total + ')'));
                this.this$0.f110033h = Long.valueOf(dVar3.moderatedRenameTimestamp);
            }
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(70550);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(o oVar) {
            super(2);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            h.f.b.l.d(dVar, "");
            if (aVar2 != null) {
                if (!aVar2.f25631b.booleanValue()) {
                    new com.bytedance.tux.g.b(this.this$0).e(R.string.g21).b();
                } else if (!(this.this$0.getActivity() instanceof MixVideoDetailActivity)) {
                    androidx.fragment.app.e activity = this.this$0.getActivity();
                    if (activity != null) {
                        h.f.b.l.b(activity, "");
                        new com.bytedance.tux.g.b(activity).a().e(R.string.gj2).b();
                    }
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.mix.b.f(this.this$0.f110026a, this.this$0.f110027b));
                }
            }
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, List<? extends Aweme>, z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(70554);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(o oVar) {
            super(2);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, List<? extends Aweme> list) {
            List<? extends Aweme> list2 = list;
            h.f.b.l.d(dVar, "");
            if (list2 != null) {
                PowerList powerList = (PowerList) this.this$0.a(R.id.d7z);
                h.f.b.l.b(powerList, "");
                com.bytedance.ies.powerlist.f<com.bytedance.ies.powerlist.b.a> state = powerList.getState();
                ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.ss.android.ugc.aweme.mix.mixdetail.viewholder.b(it.next()));
                }
                state.b(arrayList);
            }
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        DmtStatusView.a a2 = DmtStatusView.a.a(getContext()).a(R.string.g21, new d(this));
        a2.f33605g = 0;
        ((DmtStatusView) a(R.id.e_o)).setBuilder(a2);
        this.f110030e = true;
        TuxNavBar.a aVar = new TuxNavBar.a();
        this.n = aVar;
        com.bytedance.tux.navigation.a.b a3 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark);
        a3.f45194b = true;
        aVar.a(a3.a((h.f.a.a<z>) new e(this)));
        String str = this.f110035k;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        User curUser = g2.getCurUser();
        h.f.b.l.b(curUser, "");
        if (h.m.p.a(str, curUser.getUid(), false)) {
            com.bytedance.tux.navigation.a.b a4 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_ellipsis_horizontal);
            a4.f45194b = true;
            aVar.b(a4.a((h.f.a.a<z>) new f(this)));
        } else {
            com.bytedance.tux.navigation.a.b a5 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_ellipsis_horizontal);
            a5.f45194b = true;
            aVar.b(a5.a((h.f.a.a<z>) new g(this)));
        }
        aVar.a(new com.bytedance.tux.navigation.a.g().a(this.f110028c));
        f.a.a(this, a(), p.f110048a, (com.bytedance.assem.arch.viewModel.k) null, new h(this), 6);
        TuxNavBar tuxNavBar = (TuxNavBar) a(R.id.csl);
        TuxNavBar.a aVar2 = this.n;
        if (aVar2 == null) {
            h.f.b.l.a("navActions");
        }
        tuxNavBar.setNavActions(aVar2);
        ((TuxNavBar) a(R.id.csl)).a(true);
        if (!b.a()) {
            da.a.a("mix_video_dialog").a((RecyclerView) a(R.id.d7z));
        }
        ((PowerList) a(R.id.d7z)).a(MixFeedCell.class);
        ((PowerList) a(R.id.d7z)).a(a().g());
        ((RecyclerView) a(R.id.d7z)).a(new a());
        ((PowerList) a(R.id.d7z)).a(new j(this));
        f.a.a(this, a(), q.f110049a, com.bytedance.assem.arch.viewModel.l.a(), new k(this), 4);
        f.a.a(this, a(), r.f110050a, com.bytedance.assem.arch.viewModel.l.a(), new l(this), 4);
        f.a.a(this, a(), s.f110051a, (com.bytedance.assem.arch.viewModel.k) null, new m(this), 6);
        f.a.a(this, a(), t.f110052a, com.bytedance.assem.arch.viewModel.l.a(), new i(this), 4);
        a().a(this.f110026a, this.f110027b);
        DmtStatusView dmtStatusView = (DmtStatusView) a(R.id.e_o);
        h.f.b.l.b(dmtStatusView, "");
        dmtStatusView.setVisibility(0);
        ((DmtStatusView) a(R.id.e_o)).f();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.aky, viewGroup, false);
        if (a2 == null) {
            h.f.b.l.b();
        }
        return a2;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, com.bytedance.assem.arch.viewModel.k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.assem.arch.viewModel.k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(kVar5, "");
        h.f.b.l.d(sVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
