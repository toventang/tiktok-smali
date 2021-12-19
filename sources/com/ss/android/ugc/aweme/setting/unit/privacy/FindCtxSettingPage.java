package com.ss.android.ugc.aweme.setting.unit.privacy;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.dm;
import com.ss.android.ugc.aweme.friends.model.BackFromSettingEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

@com.bytedance.ies.powerpage.a.a
public final class FindCtxSettingPage extends com.ss.android.ugc.aweme.setting.page.a implements i, j {

    /* renamed from: i  reason: collision with root package name */
    public static final a f122949i = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public f f122950e;

    /* renamed from: f  reason: collision with root package name */
    public g f122951f;

    /* renamed from: g  reason: collision with root package name */
    public d f122952g;

    /* renamed from: h  reason: collision with root package name */
    public e f122953h;

    /* renamed from: j  reason: collision with root package name */
    private final h f122954j = h.i.a((h.f.a.a) new e(this));

    /* renamed from: k  reason: collision with root package name */
    private boolean f122955k;

    /* renamed from: l  reason: collision with root package name */
    private final h f122956l = h.i.a((h.f.a.a) new d(this));

    /* renamed from: m  reason: collision with root package name */
    private SparseArray f122957m;

    static {
        Covode.recordClassIndex(80736);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final View a(int i2) {
        if (this.f122957m == null) {
            this.f122957m = new SparseArray();
        }
        View view = (View) this.f122957m.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f122957m.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final void br_() {
        SparseArray sparseArray = this.f122957m;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final int c() {
        return R.layout.ay4;
    }

    public final FindCtxViewModel d() {
        return (FindCtxViewModel) this.f122954j.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(243, new g(FindCtxSettingPage.class, "onBackFromPermissionSettingEvent", BackFromSettingEvent.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80737);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<dm> {
        final /* synthetic */ FindCtxSettingPage this$0;

        static {
            Covode.recordClassIndex(80742);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(FindCtxSettingPage findCtxSettingPage) {
            super(0);
            this.this$0 = findCtxSettingPage;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ dm invoke() {
            PowerList powerList = (PowerList) this.this$0.a(R.id.cb4);
            l.b(powerList, "");
            return new dm(powerList);
        }
    }

    static final class e extends m implements h.f.a.a<FindCtxViewModel> {
        final /* synthetic */ FindCtxSettingPage this$0;

        static {
            Covode.recordClassIndex(80743);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(FindCtxSettingPage findCtxSettingPage) {
            super(0);
            this.this$0 = findCtxSettingPage;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FindCtxViewModel invoke() {
            ac a2 = ae.a(this.this$0, (ad.b) null).a(FindCtxViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.ss.android.ugc.aweme.setting.page.privacy.a.a.b(false);
        com.ss.android.ugc.aweme.setting.page.privacy.a.a.c(false);
        EventBus.a().b(this);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.a
    public final void h() {
        Intent intent;
        androidx.fragment.app.e activity = getActivity();
        if (!(activity == null || (intent = activity.getIntent()) == null)) {
            intent.putExtra("currentSettingsValue", d().f122960a);
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null) {
                activity2.setResult(-1, intent);
            }
        }
        super.h();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f122955k) {
            if (com.ss.android.ugc.aweme.friends.service.a.f97047a.m()) {
                ((com.ss.android.ugc.aweme.friends.a) com.ss.android.ugc.aweme.base.b.a.b.a(getContext(), com.ss.android.ugc.aweme.friends.a.class)).a(false);
                com.ss.android.ugc.aweme.setting.page.privacy.a.a.a(true);
                FindCtxViewModel d2 = d();
                if (d2 != null) {
                    d2.a(new c(new com.ss.android.ugc.aweme.ufr.d(com.ss.android.ugc.aweme.ufr.g.SYNC_STATUS, new com.ss.android.ugc.aweme.ufr.e(true, 0, 0, null, 14)), "contact"));
                }
            }
            this.f122955k = false;
        }
        if (!com.ss.android.ugc.aweme.friends.service.a.f97047a.m() && d().f122960a) {
            com.ss.android.ugc.aweme.setting.page.privacy.a.a.a(false);
        }
        com.ss.android.ugc.aweme.friends.d g2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.g();
        User c2 = in.c();
        l.b(c2, "");
        if (g2.a(c2.getUid()).length() == 0 && d().f122961b) {
            com.ss.android.ugc.aweme.friends.service.a.f97047a.c(false);
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onBackFromPermissionSettingEvent(BackFromSettingEvent backFromSettingEvent) {
        l.d(backFromSettingEvent, "");
        if (l.a((Object) "privacy_setting", (Object) backFromSettingEvent.enterFrom)) {
            this.f122955k = true;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.a(EventBus.a(), this);
        com.ss.android.ugc.aweme.common.r.a("enter_sync_auth", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "privacy_setting").f66730a);
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindCtxSettingPage f122958a;

        static {
            Covode.recordClassIndex(80738);
        }

        b(FindCtxSettingPage findCtxSettingPage) {
            this.f122958a = findCtxSettingPage;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            final c cVar = (c) obj;
            f fVar = this.f122958a.f122950e;
            if (fVar == null) {
                l.a("syncContactUnit");
            }
            fVar.a(new h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h>(this) {
                /* class com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxSettingPage.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(80739);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
                    com.ss.android.ugc.aweme.be.h hVar2 = hVar;
                    l.d(hVar2, "");
                    boolean z = cVar.f122966a.f141690b.f141691a;
                    this.this$0.f122958a.d().f122960a = z;
                    return com.ss.android.ugc.aweme.be.h.a(hVar2, z, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
                }
            });
            d dVar = this.f122958a.f122952g;
            if (dVar == null) {
                l.a("removeContactsUnit");
            }
            dVar.f122970b = true;
            if (dVar.f122970b) {
                dVar.g();
                dVar.f122970b = false;
            }
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindCtxSettingPage f122959a;

        static {
            Covode.recordClassIndex(80740);
        }

        c(FindCtxSettingPage findCtxSettingPage) {
            this.f122959a = findCtxSettingPage;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            final c cVar = (c) obj;
            g gVar = this.f122959a.f122951f;
            if (gVar == null) {
                l.a("syncFBFriendsUnit");
            }
            gVar.a(new h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h>(this) {
                /* class com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxSettingPage.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(80741);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
                    com.ss.android.ugc.aweme.be.h hVar2 = hVar;
                    l.d(hVar2, "");
                    boolean z = cVar.f122966a.f141690b.f141691a;
                    this.this$0.f122959a.d().f122961b = z;
                    return com.ss.android.ugc.aweme.be.h.a(hVar2, z, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
                }
            });
            e eVar = this.f122959a.f122953h;
            if (eVar == null) {
                l.a("removeFBFriendsUnit");
            }
            eVar.f122993b = true;
            if (eVar.f122993b) {
                eVar.h();
                eVar.f122993b = false;
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
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxSettingPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
