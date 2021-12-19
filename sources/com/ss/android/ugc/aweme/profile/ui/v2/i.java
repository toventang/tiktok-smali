package com.ss.android.ugc.aweme.profile.ui.v2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.cc.d;
import com.ss.android.ugc.aweme.experiment.fp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.bc;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.metrics.am;
import com.ss.android.ugc.aweme.newfollow.c.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public final class i extends a implements com.ss.android.ugc.aweme.profile.ui.d.d, ab, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    public static final c I = new c((byte) 0);
    public String A;
    public String B;
    public boolean C;
    public Aweme D;
    public String E = "";
    public String F = "";
    public d G = d.LOAD_IDLE;
    public String H = "";
    private int J;
    private String K = "";
    private final com.bytedance.assem.arch.viewModel.b L;
    private bc M;
    private SparseArray N;
    public String u;
    public String v = "";
    public String w = "";
    public String y;
    public MutualStruct z;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.profile.widgets.common.n, com.ss.android.ugc.aweme.profile.widgets.common.n> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(75754);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.profile.widgets.common.n invoke(com.ss.android.ugc.aweme.profile.widgets.common.n nVar) {
            h.f.b.l.c(nVar, "");
            return nVar;
        }
    }

    static {
        Covode.recordClassIndex(75752);
    }

    public final View b(int i2) {
        if (this.N == null) {
            this.N = new SparseArray();
        }
        View view = (View) this.N.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.N.put(i2, findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(77, new org.greenrobot.eventbus.g(i.class, "onUpdateUserEvent", com.ss.android.ugc.aweme.base.d.c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(34, new org.greenrobot.eventbus.g(i.class, "onAntiCrawlerEvent", com.ss.android.ugc.aweme.base.d.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.al
    public final int k() {
        return R.layout.aoe;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.al
    public final boolean l() {
        return false;
    }

    public static final class c {
        static {
            Covode.recordClassIndex(75755);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010d, code lost:
        if (r8.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x010f;
     */
    @Override // com.ss.android.ugc.aweme.profile.ui.d.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r15, java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 359
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.i.a(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0109, code lost:
        if (r8.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x010b;
     */
    @Override // com.ss.android.ugc.aweme.profile.ui.d.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 355
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.i.a(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f2, code lost:
        if (r6.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r0, null)) == false) goto L_0x00f4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0195 A[SYNTHETIC, Splitter:B:77:0x0195] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01c5 A[Catch:{ Exception -> 0x01e9 }] */
    @Override // com.ss.android.ugc.aweme.profile.ui.d.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r16) {
        /*
        // Method dump skipped, instructions count: 648
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.i.a(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.ab
    public final void d() {
        this.G = d.LOAD_IDLE;
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.b
    public final /* synthetic */ ac e() {
        return new ac();
    }

    /* access modifiers changed from: package-private */
    public static final class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f117283a;

        static {
            Covode.recordClassIndex(75786);
        }

        s(i iVar) {
            this.f117283a = iVar;
        }

        public final void run() {
            String str = this.f117283a.f116869a;
            if (str == null) {
                str = "";
            }
            y.a("others_homepage", str, "request");
        }
    }

    static final class w extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(75790);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            ad.b a2 = dagger.hilt.android.internal.b.a.a(this.this$0.getActivity());
            if (a2 == null) {
                h.f.b.l.b();
            }
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.N;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (this.C) {
            n();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        e.a.f112592a.c();
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(75753);
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

    /* access modifiers changed from: package-private */
    public static final class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f117281a;

        static {
            Covode.recordClassIndex(75784);
        }

        q(i iVar) {
            this.f117281a = iVar;
        }

        public final void run() {
            com.ss.android.ugc.aweme.profile.widgets.relations.d dVar = (com.ss.android.ugc.aweme.profile.widgets.relations.d) com.bytedance.assem.arch.service.d.d(this.f117281a, ab.a(com.ss.android.ugc.aweme.profile.widgets.relations.d.class));
            if (dVar != null) {
                dVar.w();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.analysis.c
    public final Analysis F() {
        Analysis labelName = new Analysis().setLabelName("others_homepage");
        h.f.b.l.b(labelName, "");
        return labelName;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.ab
    public final void c() {
        if (TextUtils.equals(this.B, "feed_detail")) {
            bc bcVar = this.M;
            if (bcVar != null) {
                bcVar.a();
                return;
            }
            return;
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            h.f.b.l.b();
        }
        activity.finish();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.al
    public final boolean h() {
        Bundle arguments = getArguments();
        if (arguments == null || !TextUtils.equals(arguments.getString("profile_from", ""), "feed_detail")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.profile.ui.al, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f116876l != null) {
            User user = this.f116876l;
            h.f.b.l.b(user, "");
            if (user.isLive()) {
                c(false);
            }
        }
    }

    public enum d {
        LOAD_IDLE,
        LOAD_ING,
        LOAD_DONE;

        static {
            Covode.recordClassIndex(75756);
        }
    }

    public i() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        w wVar = new w(this);
        h.k.c a2 = ab.a(UserProfileInfoVM.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.m) this, true), com.bytedance.assem.arch.extensions.u.a((ag) this, true), wVar, bVar2, com.bytedance.assem.arch.extensions.u.a((Fragment) this, true), com.bytedance.assem.arch.extensions.u.b((Fragment) this, true));
        } else if (dVar == null || h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.m) this, false), com.bytedance.assem.arch.extensions.u.a((ag) this, false), wVar, bVar2, com.bytedance.assem.arch.extensions.u.a((Fragment) this, false), com.bytedance.assem.arch.extensions.u.b((Fragment) this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.L = bVar;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.ab
    public final void b() {
        j.a.a((com.ss.android.ugc.aweme.profile.widgets.common.j) com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class)), null, 3);
        com.ss.android.ugc.aweme.profile.widgets.b.r rVar = (com.ss.android.ugc.aweme.profile.widgets.b.r) com.bytedance.assem.arch.service.d.d(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.b.r.class));
        if (rVar != null) {
            rVar.R();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0114, code lost:
        if (r12.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x0116;
     */
    @Override // com.ss.android.ugc.aweme.profile.ui.d.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 367
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.i.a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d9, code lost:
        if (r12.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00db, code lost:
        r9 = r4.element;
        r3 = getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e5, code lost:
        if (r3 == java.lang.Object.class) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e7, code lost:
        r14 = r3.getInterfaces();
        h.f.b.l.a((java.lang.Object) r14, "");
        r13 = new java.util.ArrayList();
        r12 = r14.length;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f5, code lost:
        if (r2 >= r12) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f7, code lost:
        r1 = r14[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ff, code lost:
        if (com.bytedance.assem.arch.service.c.class.isAssignableFrom(r1) == false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0101, code lost:
        r13.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0104, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0107, code lost:
        r1 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0111, code lost:
        if (r1.hasNext() == false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0113, code lost:
        r0 = (java.lang.Class) r1.next();
        h.f.b.l.a((java.lang.Object) r0, "");
        r9.a(r0, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012c, code lost:
        r3 = r3.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0130, code lost:
        if (r3 != null) goto L_0x00e3;
     */
    @Override // com.ss.android.ugc.aweme.profile.ui.al, com.ss.android.ugc.aweme.profile.ui.d.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
        // Method dump skipped, instructions count: 358
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.i.j():void");
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.d.d
    public final void a(bc bcVar) {
        h.f.b.l.d(bcVar, "");
        this.M = bcVar;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.d.d
    public final /* synthetic */ void a(Boolean bool) {
        c(bool.booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.ab
    public final void b(User user) {
        String str = this.u;
        if (!(str == null || user == null)) {
            user.setRequestId(str);
        }
        this.f116876l = user;
    }

    static final class h implements AnalysisStayTimeFragmentComponent.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f117278a;

        static {
            Covode.recordClassIndex(75775);
        }

        h(i iVar) {
            this.f117278a = iVar;
        }

        @Override // com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent.a
        public final am a(am amVar) {
            String str;
            h.f.b.l.d(amVar, "");
            amVar.f109501d = this.f117278a.w;
            amVar.f109502e = this.f117278a.f116869a;
            Aweme aweme = this.f117278a.D;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            amVar.f109500c = str;
            return amVar;
        }
    }

    static final class j<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f117279a;

        static {
            Covode.recordClassIndex(75777);
        }

        j(i iVar) {
            this.f117279a = iVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 1) {
                this.f117279a.c(true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.d.d
    public final void b(boolean z2) {
        com.ss.android.ugc.aweme.profile.widgets.b.r rVar = (com.ss.android.ugc.aweme.profile.widgets.b.r) com.bytedance.assem.arch.service.d.d(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.b.r.class));
        if (rVar != null) {
            rVar.a(z2, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.d.d
    public final void e(String str) {
        com.ss.android.ugc.aweme.profile.widgets.b.r rVar = (com.ss.android.ugc.aweme.profile.widgets.b.r) com.bytedance.assem.arch.service.d.d(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.b.r.class));
        if (rVar != null) {
            rVar.b(str);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.profile.ui.al, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        h.f.b.l.d(bundle, "");
        bundle.putString("uid", this.f116869a);
        bundle.putString("sec_user_id", this.f116870b);
        super.onSaveInstanceState(bundle);
    }

    static final class e extends h.f.b.m implements h.f.a.b<ac, ac> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f117276a = new e();

        static {
            Covode.recordClassIndex(75757);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ac invoke(ac acVar) {
            ac acVar2 = acVar;
            if (acVar2 != null) {
                return ac.a(acVar2, null, null, null, null, null, null, null, null, new com.bytedance.assem.arch.extensions.a(z.f158842a), false, null, null, null, null, 16127);
            }
            return null;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<ac, ac> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f117277a = new f();

        static {
            Covode.recordClassIndex(75758);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ac invoke(ac acVar) {
            ac acVar2 = acVar;
            if (acVar2 != null) {
                return ac.a(acVar2, null, null, null, null, null, null, null, null, null, false, null, new com.bytedance.assem.arch.extensions.a(z.f158842a), null, null, 14335);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$i  reason: collision with other inner class name */
    static final class C2980i extends h.f.b.m implements h.f.a.b<ac, ac> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(75776);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2980i(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ac invoke(ac acVar) {
            ac acVar2 = acVar;
            if (acVar2 != null) {
                return ac.a(acVar2, this.this$0.f116869a, this.this$0.f116870b, null, null, null, null, null, null, null, false, null, null, null, null, 16380);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<ac, ac> {
        final /* synthetic */ String $eventType;

        static {
            Covode.recordClassIndex(75778);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(String str) {
            super(1);
            this.$eventType = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ac invoke(ac acVar) {
            ac acVar2 = acVar;
            if (acVar2 != null) {
                return ac.a(acVar2, null, null, null, this.$eventType, null, null, null, null, null, false, null, null, null, null, 16375);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.b<ac, ac> {
        final /* synthetic */ String $aid;

        static {
            Covode.recordClassIndex(75779);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(String str) {
            super(1);
            this.$aid = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ac invoke(ac acVar) {
            ac acVar2 = acVar;
            if (acVar2 != null) {
                return ac.a(acVar2, null, null, null, null, null, null, null, this.$aid, null, false, null, null, null, null, 16255);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.b<ac, ac> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f117280a = new m();

        static {
            Covode.recordClassIndex(75780);
        }

        m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ac invoke(ac acVar) {
            ac acVar2 = acVar;
            if (acVar2 != null) {
                return ac.a(acVar2, null, null, null, null, null, null, null, null, null, false, null, null, null, new com.bytedance.assem.arch.extensions.a(z.f158842a), 8191);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.f.b.m implements h.f.a.b<ac, ac> {
        final /* synthetic */ String $page;

        static {
            Covode.recordClassIndex(75781);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(String str) {
            super(1);
            this.$page = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ac invoke(ac acVar) {
            ac acVar2 = acVar;
            if (acVar2 != null) {
                return ac.a(acVar2, null, null, this.$page, null, null, null, null, null, null, false, null, null, null, null, 16379);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.b<ac, ac> {
        final /* synthetic */ String $pagePosition;

        static {
            Covode.recordClassIndex(75782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(String str) {
            super(1);
            this.$pagePosition = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ac invoke(ac acVar) {
            ac acVar2 = acVar;
            if (acVar2 != null) {
                return ac.a(acVar2, null, null, null, null, null, this.$pagePosition, null, null, null, false, null, null, null, null, 16351);
            }
            return null;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<ac, ac> {
        final /* synthetic */ String $showWindowSource;

        static {
            Covode.recordClassIndex(75783);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(String str) {
            super(1);
            this.$showWindowSource = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ac invoke(ac acVar) {
            ac acVar2 = acVar;
            if (acVar2 != null) {
                return ac.a(acVar2, null, null, null, null, this.$showWindowSource, null, null, null, null, false, null, null, null, null, 16367);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r extends h.f.b.m implements h.f.a.b<ac, ac> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f117282a = new r();

        static {
            Covode.recordClassIndex(75785);
        }

        r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ac invoke(ac acVar) {
            ac acVar2 = acVar;
            if (acVar2 != null) {
                return ac.a(acVar2, null, null, null, null, null, null, null, null, null, false, null, null, new com.bytedance.assem.arch.extensions.a(z.f158842a), null, 12287);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t extends h.f.b.m implements h.f.a.b<ac, ac> {
        final /* synthetic */ String $secUserId;
        final /* synthetic */ String $userId;

        static {
            Covode.recordClassIndex(75787);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(String str, String str2) {
            super(1);
            this.$userId = str;
            this.$secUserId = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ac invoke(ac acVar) {
            ac acVar2 = acVar;
            if (acVar2 != null) {
                return ac.a(acVar2, this.$userId, this.$secUserId, null, null, null, null, null, null, null, false, null, null, null, null, 16380);
            }
            return null;
        }
    }

    static final class u extends h.f.b.m implements h.f.a.b<ac, ac> {
        final /* synthetic */ boolean $visible;

        static {
            Covode.recordClassIndex(75788);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(boolean z) {
            super(1);
            this.$visible = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ac invoke(ac acVar) {
            ac acVar2 = acVar;
            if (acVar2 != null) {
                return ac.a(acVar2, null, null, null, null, null, null, null, null, null, this.$visible, new com.bytedance.assem.arch.extensions.a(Boolean.valueOf(this.$visible)), null, null, null, 14847);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v extends h.f.b.m implements h.f.a.b<ac, ac> {
        final /* synthetic */ Aweme $aweme;

        static {
            Covode.recordClassIndex(75789);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(Aweme aweme) {
            super(1);
            this.$aweme = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ac invoke(ac acVar) {
            ac acVar2 = acVar;
            if (acVar2 != null) {
                return ac.a(acVar2, null, null, null, null, null, null, this.$aweme, null, null, false, null, null, null, null, 16319);
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.ab
    public final void c(User user) {
        h.f.b.l.d(user, "");
        if (ab_()) {
            this.r.a(user);
            this.G = d.LOAD_DONE;
            this.f116876l = user;
            if (!(!com.ss.android.ugc.aweme.friends.e.b() || this.f116876l == null || this.z == null)) {
                User user2 = this.f116876l;
                h.f.b.l.b(user2, "");
                user2.setMutualStruct(this.z);
            }
            a(user.getUid(), user.getSecUid());
        }
    }

    @org.greenrobot.eventbus.r
    public final void onAntiCrawlerEvent(com.ss.android.ugc.aweme.base.d.a aVar) {
        String str;
        if (aVar != null && (str = aVar.f68097a) != null) {
            if (h.m.p.a((CharSequence) str, (CharSequence) "/aweme/v1/user/profile/other/?", false) || h.m.p.a((CharSequence) str, (CharSequence) "/aweme/v1/aweme/post/?", false) || h.m.p.a((CharSequence) str, (CharSequence) "/aweme/v1/aweme/favorite/?", false)) {
                EventBus.a().d(aVar);
                b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.al, com.ss.android.ugc.aweme.profile.ui.v2.a, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (z.a(this.w)) {
            b(this.w);
        }
        if (z.a(this.y)) {
            c(this.y);
        }
        if (z.a(this.F)) {
            a(this.F);
        }
        if (z.a(this.E)) {
            d(this.E);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.profile.ui.al, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        String str;
        d.a.a("new_user_profile");
        com.ss.android.ugc.aweme.cc.d.f69803b = true;
        com.ss.android.ugc.aweme.cc.c.a(com.ss.android.ugc.aweme.cc.d.f69802a);
        String str2 = "";
        if (TextUtils.isEmpty(this.f116869a)) {
            if (bundle == null || (str = bundle.getString("uid")) == null) {
                str = str2;
            }
            this.f116869a = str;
        }
        if (TextUtils.isEmpty(this.f116870b)) {
            if (!(bundle == null || (string = bundle.getString("sec_user_id")) == null)) {
                str2 = string;
            }
            this.f116870b = str2;
        }
        super.onCreate(bundle);
    }

    @org.greenrobot.eventbus.r
    public final void onUpdateUserEvent(com.ss.android.ugc.aweme.base.d.c cVar) {
        if (cVar != null && cVar.f68103a != null) {
            User user = cVar.f68103a;
            h.f.b.l.b(user, "");
            if (TextUtils.equals(user.getUid(), this.f116869a)) {
                b(cVar.f68103a);
                com.ss.android.ugc.aweme.profile.widgets.common.j jVar = (com.ss.android.ugc.aweme.profile.widgets.common.j) com.bytedance.assem.arch.service.d.b(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                if (jVar != null) {
                    j.a.a(jVar, cVar.f68103a, null, false, 6);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.d.d
    public final void a(User user) {
        String str;
        if (ab_()) {
            if (user != null) {
                this.r.a(user);
                b(user);
                com.ss.android.ugc.aweme.profile.widgets.common.j jVar = (com.ss.android.ugc.aweme.profile.widgets.common.j) com.bytedance.assem.arch.service.d.b(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                if (jVar != null) {
                    j.a.a(jVar, user, null, true, 2);
                }
            }
            if (com.bytedance.apm.q.s.a()) {
                com.ss.android.ugc.aweme.profile.widgets.relations.d dVar = (com.ss.android.ugc.aweme.profile.widgets.relations.d) com.bytedance.assem.arch.service.d.d(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.relations.d.class));
                if (dVar != null) {
                    dVar.w();
                }
            } else {
                com.ss.android.ugc.aweme.lego.p.a().post(new q(this));
            }
            if (user == null || (str = user.getUid()) == null) {
                str = "";
            }
            y.a("others_homepage", str, "simple");
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.profile.widgets.h.a.b $initData;
        final /* synthetic */ View $view;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(75759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(i iVar, com.ss.android.ugc.aweme.profile.widgets.h.a.b bVar, View view) {
            super(1);
            this.this$0 = iVar;
            this.$initData = bVar;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            h.f.b.l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>) new h.f.a.b<com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.i.g.AnonymousClass1 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(75760);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar) {
                    com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                    h.f.b.l.d(iVar2, "");
                    iVar2.a(this.this$0.$initData);
                    return z.f158842a;
                }
            });
            if (fp.f90068f) {
                assembler2.b(this.this$0, new h.f.a.b<com.bytedance.assem.arch.core.q, z>(this) {
                    /* class com.ss.android.ugc.aweme.profile.ui.v2.i.g.AnonymousClass8 */
                    final /* synthetic */ g this$0;

                    static {
                        Covode.recordClassIndex(75773);
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
                        qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.b.i.class));
                        qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.b.i();
                        qVar2.f25599e = this.this$0.$view;
                        return z.f158842a;
                    }
                });
            }
            assembler2.b(this.this$0, new h.f.a.b<com.bytedance.assem.arch.core.q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.i.g.AnonymousClass9 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(75774);
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
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.common.k.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.common.k();
                    qVar2.f25599e = (RelativeLayout) this.this$0.this$0.b(R.id.dba);
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<com.bytedance.assem.arch.core.q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.i.g.AnonymousClass10 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(75761);
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
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.navbar.c.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.navbar.c();
                    qVar2.f25599e = (TuxNavBar) this.this$0.this$0.b(R.id.csl);
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<com.bytedance.assem.arch.core.q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.i.g.AnonymousClass11 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(75762);
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
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.g.a.g.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.g.a.g();
                    qVar2.f25599e = this.this$0.$view;
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<com.bytedance.assem.arch.core.q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.i.g.AnonymousClass12 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(75763);
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
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.userId.d.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.userId.d();
                    qVar2.f25599e = (TuxTextView) this.this$0.this$0.b(R.id.fda);
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<com.bytedance.assem.arch.core.q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.i.g.AnonymousClass13 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(75764);
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
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.userId.b.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.userId.b();
                    qVar2.f25599e = (TuxTextView) this.this$0.this$0.b(R.id.fd5);
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<com.bytedance.assem.arch.core.q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.i.g.AnonymousClass14 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(75765);
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
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.relations.b.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.relations.b();
                    qVar2.f25599e = (LinearLayout) this.this$0.this$0.b(R.id.cga);
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<com.bytedance.assem.arch.core.q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.i.g.AnonymousClass15 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(75766);
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
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.c.a.a.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.c.a.a();
                    qVar2.f25599e = (TuxButton) this.this$0.this$0.b(R.id.tb);
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<com.bytedance.assem.arch.core.q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.i.g.AnonymousClass2 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(75767);
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
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.f.a.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.f.a();
                    qVar2.f25599e = (RelativeLayout) this.this$0.this$0.b(R.id.cs3);
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<com.bytedance.assem.arch.core.q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.i.g.AnonymousClass3 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(75768);
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
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.n.a.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.n.a();
                    qVar2.f25599e = this.this$0.$view;
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<com.bytedance.assem.arch.core.q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.i.g.AnonymousClass4 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(75769);
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
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.a.e.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.a.e();
                    qVar2.f25599e = this.this$0.$view;
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<com.bytedance.assem.arch.core.q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.i.g.AnonymousClass5 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(75770);
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
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.follow.f.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.follow.f();
                    qVar2.f25599e = this.this$0.$view;
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<com.bytedance.assem.arch.core.q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.v2.i.g.AnonymousClass6 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(75771);
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
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.recommend.user.f.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.recommend.user.f();
                    qVar2.f25599e = (FrameLayout) this.this$0.this$0.b(R.id.d_k);
                    return z.f158842a;
                }
            });
            if (!fp.f90068f) {
                assembler2.b(this.this$0, new h.f.a.b<com.bytedance.assem.arch.core.q, z>(this) {
                    /* class com.ss.android.ugc.aweme.profile.ui.v2.i.g.AnonymousClass7 */
                    final /* synthetic */ g this$0;

                    static {
                        Covode.recordClassIndex(75772);
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
                        qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.widgets.b.i.class));
                        qVar2.f25596b = new com.ss.android.ugc.aweme.profile.widgets.b.i();
                        qVar2.f25599e = this.this$0.$view;
                        return z.f158842a;
                    }
                });
            }
            return z.f158842a;
        }
    }

    private final void f(String str) {
        androidx.fragment.app.e activity;
        String str2;
        String str3;
        String str4;
        if (com.ss.android.ugc.aweme.feed.o.a.f93623a && (activity = getActivity()) != null) {
            h.f.b.l.b(activity, "");
            Aweme aweme = HomePageDataViewModel.a.a(activity).f99128k;
            if (aweme != null) {
                String aid = aweme.getAid();
                Aweme aweme2 = this.D;
                String str5 = null;
                if (aweme2 != null) {
                    str2 = aweme2.getAid();
                } else {
                    str2 = null;
                }
                if (TextUtils.equals(aid, str2)) {
                    String secAuthorUid = aweme.getSecAuthorUid();
                    Aweme aweme3 = this.D;
                    if (aweme3 != null) {
                        str4 = aweme3.getSecAuthorUid();
                    } else {
                        str4 = null;
                    }
                    if (TextUtils.equals(secAuthorUid, str4)) {
                        return;
                    }
                }
                StringBuilder append = new StringBuilder("I18nUserProfileFragmentV2 ").append(str).append(" invalid aweme, aid: ");
                Aweme aweme4 = this.D;
                if (aweme4 != null) {
                    str3 = aweme4.getAid();
                } else {
                    str3 = null;
                }
                StringBuilder append2 = append.append(str3).append(", aweme_secUid: ");
                Aweme aweme5 = this.D;
                if (aweme5 != null) {
                    str5 = aweme5.getSecAuthorUid();
                }
                com.ss.android.ugc.aweme.framework.a.a.b(4, "feed2profile", append2.append(str5).append(", secUid: ").append(this.f116870b).append("; homepage_aid: ").append(aweme.getAid()).append(", homepage_secUid: ").append(aweme.getSecAuthorUid()).toString());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.al
    public final void b(View view) {
        com.ss.android.ugc.aweme.profile.widgets.h.a.b bVar;
        com.ss.android.ugc.aweme.recommend.g gVar;
        h.f.b.l.d(view, "");
        super.b(view);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.getSerializable("recommend_enter_profile_params") instanceof com.ss.android.ugc.aweme.recommend.g) {
                Serializable serializable = arguments.getSerializable("recommend_enter_profile_params");
                Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.recommend.RecommendEnterProfileParams");
                gVar = (com.ss.android.ugc.aweme.recommend.g) serializable;
            } else {
                gVar = null;
            }
            com.ss.android.ugc.aweme.profile.widgets.follow.b bVar2 = new com.ss.android.ugc.aweme.profile.widgets.follow.b(arguments.getString("request_id", ""), arguments.getString("room_id", ""), arguments.getString("room_owner_id", ""), arguments.getString("user_type", ""), arguments.getString("enter_from", ""), gVar, arguments.getString("position", ""));
            int i2 = arguments.getInt("general_search_card_type", 0);
            boolean z2 = arguments.getBoolean("extra_from_mutual", false);
            boolean z3 = arguments.getBoolean("isFromFeed", true);
            String string = arguments.getString("event_keys");
            if (string == null) {
                string = "";
            }
            h.f.b.l.b(string, "");
            bVar = new com.ss.android.ugc.aweme.profile.widgets.h.a.b(this.f116873e, z3, this.H, this.B, z2, bVar2, i2, string);
        } else {
            bVar = new com.ss.android.ugc.aweme.profile.widgets.h.a.b(this.f116873e, this.H, this.B, null, 242);
        }
        com.bytedance.assem.arch.extensions.d.a(this, new g(this, bVar, view));
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.d.d
    public final void b(Aweme aweme) {
        if (aweme != null && !TextUtils.equals(this.f116869a, aweme.getAuthorUid())) {
            j();
            String authorUid = aweme.getAuthorUid();
            User author = aweme.getAuthor();
            h.f.b.l.b(author, "");
            a(authorUid, author.getSecUid());
            a(aweme);
            a(aweme.getAuthor());
            c(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0109, code lost:
        if (r8.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x010b;
     */
    @Override // com.ss.android.ugc.aweme.profile.ui.d.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 355
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.i.c(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ea, code lost:
        if (r10.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ec, code lost:
        r11 = r4.element;
        r10 = r6.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f6, code lost:
        if (r10 == java.lang.Object.class) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f8, code lost:
        r14 = r10.getInterfaces();
        h.f.b.l.a((java.lang.Object) r14, "");
        r13 = new java.util.ArrayList();
        r3 = r14.length;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0106, code lost:
        if (r2 >= r3) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0108, code lost:
        r1 = r14[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0110, code lost:
        if (com.bytedance.assem.arch.service.c.class.isAssignableFrom(r1) == false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0112, code lost:
        r13.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0115, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0118, code lost:
        r1 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0122, code lost:
        if (r1.hasNext() == false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0124, code lost:
        r0 = (java.lang.Class) r1.next();
        h.f.b.l.a((java.lang.Object) r0, "");
        r11.a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013d, code lost:
        r10 = r10.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0141, code lost:
        if (r10 != null) goto L_0x00f4;
     */
    @Override // com.ss.android.ugc.aweme.profile.ui.d.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 375
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.i.d(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0152, code lost:
        if (r11.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r8, null)) == false) goto L_0x0154;
     */
    @Override // com.ss.android.ugc.aweme.profile.ui.v2.ab
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r16) {
        /*
        // Method dump skipped, instructions count: 494
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.i.a(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0109, code lost:
        if (r8.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x010b;
     */
    @Override // com.ss.android.ugc.aweme.profile.ui.d.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 355
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.i.b(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0161, code lost:
        if (r13.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r8, null)) == false) goto L_0x0163;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(boolean r16) {
        /*
        // Method dump skipped, instructions count: 520
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.i.c(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x030b, code lost:
        if (r3.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x030d, code lost:
        r7 = r8.element;
        r6 = getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0317, code lost:
        if (r6 == java.lang.Object.class) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0319, code lost:
        r5 = r6.getInterfaces();
        h.f.b.l.a((java.lang.Object) r5, "");
        r4 = new java.util.ArrayList();
        r3 = r5.length;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0327, code lost:
        if (r2 >= r3) goto L_0x0339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0329, code lost:
        r1 = r5[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0331, code lost:
        if (com.bytedance.assem.arch.service.c.class.isAssignableFrom(r1) == false) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0333, code lost:
        r4.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0336, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0339, code lost:
        r2 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0343, code lost:
        if (r2.hasNext() == false) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0345, code lost:
        r1 = (java.lang.Class) r2.next();
        h.f.b.l.a((java.lang.Object) r1, "");
        r7.a(r1, r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0360, code lost:
        r6 = r6.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0364, code lost:
        if (r6 != null) goto L_0x0315;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d4, code lost:
        if (r3.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x01d6;
     */
    @Override // com.ss.android.ugc.aweme.profile.ui.al
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r20) {
        /*
        // Method dump skipped, instructions count: 934
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.i.a(android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fe, code lost:
        if (r10.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0100, code lost:
        r10 = r4.element;
        r9 = r6.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010a, code lost:
        if (r9 == java.lang.Object.class) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010c, code lost:
        r13 = r9.getInterfaces();
        h.f.b.l.a((java.lang.Object) r13, "");
        r12 = new java.util.ArrayList();
        r3 = r13.length;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011a, code lost:
        if (r2 >= r3) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011c, code lost:
        r1 = r13[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0124, code lost:
        if (com.bytedance.assem.arch.service.c.class.isAssignableFrom(r1) == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0126, code lost:
        r12.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0129, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012c, code lost:
        r1 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0136, code lost:
        if (r1.hasNext() == false) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0138, code lost:
        r0 = (java.lang.Class) r1.next();
        h.f.b.l.a((java.lang.Object) r0, "");
        r10.a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0151, code lost:
        r9 = r9.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0155, code lost:
        if (r9 != null) goto L_0x0108;
     */
    @Override // com.ss.android.ugc.aweme.profile.ui.d.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.Aweme r15) {
        /*
        // Method dump skipped, instructions count: 395
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.i.a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.profile.ui.al, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i2;
        String string;
        Integer e2;
        h.f.b.l.d(view, "");
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("extra_previous_page")) == null) {
            str = "";
        }
        this.w = str;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("profile_from_scene")) == null || (e2 = h.m.p.e(string)) == null) {
            i2 = 0;
        } else {
            i2 = e2.intValue();
        }
        this.J = i2;
        super.onViewCreated(view, bundle);
        com.ss.android.ugc.aweme.profile.f.z.a(com.ss.android.ugc.aweme.profile.f.z.a(), this.w);
        try {
            f("onViewCreated verify assem");
            ((com.ss.android.ugc.aweme.profile.widgets.common.j) com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class))).a(this.J, com.ss.android.ugc.aweme.profile.widgets.common.g.CHANGE_TAB);
        } catch (Exception e3) {
            com.ss.android.ugc.aweme.framework.a.a.b("I18nUserProfileFragmentV2", "ProfileInfoService can't be find: ".concat(String.valueOf(e3)));
            ((UserProfileInfoVM) this.L.getValue()).a(this.J, com.ss.android.ugc.aweme.profile.widgets.common.g.CHANGE_TAB);
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            h.f.b.l.b(activity, "");
            ScrollSwitchStateManager.a.a(activity).c(this, new j(this));
        }
    }
}
