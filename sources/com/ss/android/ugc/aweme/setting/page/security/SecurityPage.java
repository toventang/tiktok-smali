package com.ss.android.ugc.aweme.setting.page.security;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.ss.android.ugc.aweme.bn;
import com.ss.android.ugc.aweme.profile.f.ai;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONException;

@com.bytedance.ies.powerpage.a.a
public final class SecurityPage extends com.ss.android.ugc.aweme.setting.page.a implements i, j {

    /* renamed from: e  reason: collision with root package name */
    public static final a f122533e = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private final h f122534f = h.i.a((h.f.a.a) new d(this));

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f122535g;

    static {
        Covode.recordClassIndex(80379);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final View a(int i2) {
        if (this.f122535g == null) {
            this.f122535g = new SparseArray();
        }
        View view = (View) this.f122535g.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f122535g.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final void br_() {
        SparseArray sparseArray = this.f122535g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final int c() {
        return R.layout.az4;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(61, new g(SecurityPage.class, "onJsBroadCastEvent", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80380);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<SecurityViewModel> {
        final /* synthetic */ SecurityPage this$0;

        static {
            Covode.recordClassIndex(80389);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SecurityPage securityPage) {
            super(0);
            this.this$0 = securityPage;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SecurityViewModel invoke() {
            return ae.a(this.this$0, (ad.b) null).a(SecurityViewModel.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        t<Boolean> tVar;
        super.onResume();
        SecurityViewModel securityViewModel = (SecurityViewModel) this.f122534f.getValue();
        if (securityViewModel != null && (tVar = securityViewModel.f122548a) != null) {
            tVar.setValue(true);
        }
    }

    static final class b extends m implements h.f.a.b<BaseFragmentViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f122536a = new b();

        static {
            Covode.recordClassIndex(80381);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            l.d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(AnonymousClass1.f122537a);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(b.f122536a);
    }

    @r(a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(com.ss.android.ugc.aweme.fe.method.j jVar) {
        l.d(jVar, "");
        try {
            if (TextUtils.equals("incomePlusVerificationSuccess", jVar.f91311b.getString("eventName"))) {
                new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(R.string.fjp).a();
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    static final class c extends m implements h.f.a.b<com.ss.android.ugc.aweme.setting.page.base.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f122538a = new c();

        static {
            Covode.recordClassIndex(80383);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.setting.page.base.a aVar) {
            com.ss.android.ugc.aweme.setting.page.base.a aVar2 = aVar;
            l.d(aVar2, "");
            if (!ai.d()) {
                com.ss.android.ugc.aweme.setting.page.base.a.a(aVar2, new a(), SecurityAlertsCell.class, AnonymousClass1.f122539a, null, 8);
                aVar2.a(new b(), AnonymousClass2.f122540a);
                d dVar = new d();
                l.d(dVar, "");
                aVar2.f122439a.add(dVar);
                com.ss.android.ugc.aweme.setting.page.base.a.a(aVar2, new f(), SecurityVerificationCell.class, null, null, 12);
            }
            com.ss.android.ugc.aweme.account.b.a();
            final bn k2 = com.ss.android.ugc.aweme.account.b.f62864a.k();
            e eVar = new e();
            AnonymousClass3 r0 = new h.f.a.b<e, Boolean>() {
                /* class com.ss.android.ugc.aweme.setting.page.security.SecurityPage.c.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(80386);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ Boolean invoke(e eVar) {
                    boolean z;
                    l.d(eVar, "");
                    if (!k2.isOneKeyLoginExprimentEnable() || k2.isCurrentMethodAvaliable()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            };
            AnonymousClass4 r1 = new h.f.a.b<e, z>() {
                /* class com.ss.android.ugc.aweme.setting.page.security.SecurityPage.c.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(80387);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(e eVar) {
                    e eVar2 = eVar;
                    l.d(eVar2, "");
                    eVar2.f122450c = k2.getSaveLoginStatus();
                    return z.f158842a;
                }
            };
            l.d(eVar, "");
            l.d(r0, "");
            l.d(r1, "");
            if (((Boolean) r0.invoke(eVar)).booleanValue()) {
                r1.invoke(eVar);
                aVar2.f122439a.add(eVar);
            }
            aVar2.a(new c(), AnonymousClass5.f122541a);
            return z.f158842a;
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
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r2 = ""
            h.f.b.l.d(r7, r2)
            super.onViewCreated(r7, r8)
            r0 = 2131829528(0x7f112318, float:1.9292028E38)
            com.ss.android.ugc.aweme.setting.page.base.b.a(r6, r0)
            r5 = 2131365970(0x7f0a1052, float:1.835182E38)
            android.view.View r4 = r6.a(r5)
            com.bytedance.ies.powerlist.PowerList r4 = (com.bytedance.ies.powerlist.PowerList) r4
            r0 = 6
            java.lang.Class[] r3 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.setting.page.security.SecurityAlertsCell> r0 = com.ss.android.ugc.aweme.setting.page.security.SecurityAlertsCell.class
            r3[r1] = r0
            r1 = 1
            java.lang.Class<com.ss.android.ugc.aweme.setting.page.security.SecurityDeviceCell> r0 = com.ss.android.ugc.aweme.setting.page.security.SecurityDeviceCell.class
            r3[r1] = r0
            r1 = 2
            java.lang.Class<com.ss.android.ugc.aweme.setting.page.security.SecurityVerificationCell> r0 = com.ss.android.ugc.aweme.setting.page.security.SecurityVerificationCell.class
            r3[r1] = r0
            r1 = 3
            java.lang.Class<com.ss.android.ugc.aweme.setting.page.security.SecuritySaveInfoCell> r0 = com.ss.android.ugc.aweme.setting.page.security.SecuritySaveInfoCell.class
            r3[r1] = r0
            r1 = 4
            java.lang.Class<com.ss.android.ugc.aweme.setting.page.security.SecurityIncomeCell> r0 = com.ss.android.ugc.aweme.setting.page.security.SecurityIncomeCell.class
            r3[r1] = r0
            r1 = 5
            java.lang.Class<com.ss.android.ugc.aweme.setting.page.security.SecurityPermissionsCell> r0 = com.ss.android.ugc.aweme.setting.page.security.SecurityPermissionsCell.class
            r3[r1] = r0
            r4.a(r3)
            android.view.View r3 = r6.a(r5)
            com.bytedance.ies.powerlist.PowerList r3 = (com.bytedance.ies.powerlist.PowerList) r3
            h.f.b.l.b(r3, r2)
            com.ss.android.ugc.aweme.setting.page.security.SecurityPage$c r0 = com.ss.android.ugc.aweme.setting.page.security.SecurityPage.c.f122538a
            h.f.b.l.d(r3, r2)
            h.f.b.l.d(r0, r2)
            com.ss.android.ugc.aweme.setting.page.base.a r2 = new com.ss.android.ugc.aweme.setting.page.base.a
            r2.<init>()
            r0.invoke(r2)
            com.bytedance.ies.powerlist.f r1 = r3.getState()
            java.util.List<com.bytedance.ies.powerlist.b.a> r0 = r2.f122439a
            r1.a(r0)
            java.util.HashMap<java.lang.Class<? extends com.bytedance.ies.powerlist.PowerCell<?>>, java.lang.Object> r0 = r2.f122440b
            r3.setViewTypeMap(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.page.security.SecurityPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
