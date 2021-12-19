package com.ss.android.ugc.aweme.setting.page.diskmanager;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.dm;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.List;

@com.bytedance.ies.powerpage.a.a
public final class DiskManagerPage extends com.ss.android.ugc.aweme.setting.page.a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f122476f = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    com.ss.android.ugc.aweme.setting.ui.c.b f122477e;

    /* renamed from: g  reason: collision with root package name */
    private final h f122478g = i.a((h.f.a.a) new f(this));

    /* renamed from: h  reason: collision with root package name */
    private final h f122479h = i.a((h.f.a.a) new e(this));

    /* renamed from: i  reason: collision with root package name */
    private SparseArray f122480i;

    static {
        Covode.recordClassIndex(80319);
    }

    private final DiskViewModel d() {
        return (DiskViewModel) this.f122478g.getValue();
    }

    private final dm e() {
        return (dm) this.f122479h.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final View a(int i2) {
        if (this.f122480i == null) {
            this.f122480i = new SparseArray();
        }
        View view = (View) this.f122480i.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f122480i.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final void br_() {
        SparseArray sparseArray = this.f122480i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final int c() {
        return R.layout.ay3;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80320);
        }

        private a() {
        }

        public static long a() {
            try {
                IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                l.b(iESSettingsProxy, "");
                Long showStorageTipSize = iESSettingsProxy.getShowStorageTipSize();
                l.b(showStorageTipSize, "");
                return showStorageTipSize.longValue();
            } catch (Exception unused) {
                return 314572800;
            }
        }

        public static long b() {
            try {
                IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                l.b(iESSettingsProxy, "");
                Long showStorageDotSize = iESSettingsProxy.getShowStorageDotSize();
                l.b(showStorageDotSize, "");
                return showStorageDotSize.longValue();
            } catch (Exception unused) {
                return 1073741824;
            }
        }

        public static long c() {
            List<com.bytedance.u.a> b2 = com.bytedance.u.d.b();
            if (b2 == null) {
                return 0;
            }
            ArrayList arrayList = new ArrayList(n.a((Iterable) b2, 10));
            for (T t : b2) {
                l.b(t, "");
                arrayList.add(Long.valueOf(t.e()));
            }
            return n.v(arrayList);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class f extends m implements h.f.a.a<DiskViewModel> {
        final /* synthetic */ DiskManagerPage this$0;

        static {
            Covode.recordClassIndex(80325);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(DiskManagerPage diskManagerPage) {
            super(0);
            this.this$0 = diskManagerPage;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DiskViewModel invoke() {
            return ae.a(this.this$0, (ad.b) null).a(DiskViewModel.class);
        }
    }

    static final class e extends m implements h.f.a.a<dm> {
        final /* synthetic */ DiskManagerPage this$0;

        static {
            Covode.recordClassIndex(80324);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(DiskManagerPage diskManagerPage) {
            super(0);
            this.this$0 = diskManagerPage;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ dm invoke() {
            PowerList powerList = (PowerList) this.this$0.a(R.id.cb4);
            l.b(powerList, "");
            return new dm(powerList);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.page.a
    public final boolean i() {
        com.ss.android.ugc.aweme.setting.ui.c.b bVar = this.f122477e;
        if (bVar == null || !bVar.isShowing()) {
            return super.i();
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        t<Boolean> tVar;
        super.onResume();
        DiskViewModel d2 = d();
        if (d2 != null && (tVar = d2.f122484a) != null) {
            tVar.setValue(true);
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ h.f.a.b $onClickListener;

        static {
            Covode.recordClassIndex(80323);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h.f.a.b bVar) {
            super(1);
            this.$onClickListener = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.fpb, this.$onClickListener);
            bVar2.b(R.string.a9e, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
            return z.f158842a;
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DiskManagerPage f122481a;

        static {
            Covode.recordClassIndex(80321);
        }

        b(DiskManagerPage diskManagerPage) {
            this.f122481a = diskManagerPage;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.setting.ui.c.b bVar;
            com.ss.android.ugc.aweme.setting.ui.c.b bVar2;
            Integer num = (Integer) obj;
            if (num != null) {
                if (num.intValue() == 0) {
                    DiskManagerPage diskManagerPage = this.f122481a;
                    com.ss.android.ugc.aweme.setting.ui.c.b bVar3 = diskManagerPage.f122477e;
                    if (bVar3 != null && bVar3.isShowing() && (bVar2 = diskManagerPage.f122477e) != null) {
                        bVar2.dismiss();
                    }
                } else if (num.intValue() == 1) {
                    DiskManagerPage diskManagerPage2 = this.f122481a;
                    if (diskManagerPage2.f122477e == null) {
                        androidx.fragment.app.e activity = diskManagerPage2.getActivity();
                        if (activity == null) {
                            l.b();
                        }
                        l.b(activity, "");
                        com.ss.android.ugc.aweme.setting.ui.c.b bVar4 = new com.ss.android.ugc.aweme.setting.ui.c.b(activity);
                        bVar4.setCancelable(false);
                        diskManagerPage2.f122477e = bVar4;
                    }
                    com.ss.android.ugc.aweme.setting.ui.c.b bVar5 = diskManagerPage2.f122477e;
                    if ((bVar5 == null || !bVar5.isShowing()) && (bVar = diskManagerPage2.f122477e) != null) {
                        bVar.show();
                    }
                }
            }
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DiskManagerPage f122482a;

        static {
            Covode.recordClassIndex(80322);
        }

        c(DiskManagerPage diskManagerPage) {
            this.f122482a = diskManagerPage;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            p pVar = (p) obj;
            DiskManagerPage diskManagerPage = this.f122482a;
            int intValue = ((Number) pVar.getFirst()).intValue();
            h.f.a.b bVar = (h.f.a.b) pVar.getSecond();
            Context context = diskManagerPage.getContext();
            if (context != null) {
                l.b(context, "");
                try {
                    ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(context).b(intValue), new d(bVar)).a(true)).a().b().show();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
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
    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final void onViewCreated(android.view.View r4, android.os.Bundle r5) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
