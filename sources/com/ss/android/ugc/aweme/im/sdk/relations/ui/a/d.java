package com.ss.android.ugc.aweme.im.sdk.relations.ui.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.f;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.c.c;
import com.ss.android.ugc.aweme.im.sdk.share.a.a;
import com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class d extends b<IMContact> {

    /* renamed from: i  reason: collision with root package name */
    public static final a f103214i = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public boolean f103215d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f103216e;

    /* renamed from: f  reason: collision with root package name */
    public LinearLayoutManager f103217f;

    /* renamed from: g  reason: collision with root package name */
    final SharePackage f103218g;

    /* renamed from: h  reason: collision with root package name */
    public final ShareDialogViewModel f103219h;

    /* renamed from: j  reason: collision with root package name */
    private q<? super Integer, ? super Integer, ? super View, z> f103220j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f103221k;
    private final boolean w;

    static {
        Covode.recordClassIndex(66172);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66173);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.q<? super java.lang.Integer, ? super java.lang.Integer, ? super android.view.View, h.z>, h.f.a.q<java.lang.Integer, java.lang.Integer, android.view.View, h.z> */
    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.a.b
    public final q<Integer, Integer, View, z> o() {
        return this.f103220j;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.a.b
    public final SharePackage p() {
        return this.f103218g;
    }

    public final void a(boolean z) {
        if (z != this.f103215d) {
            this.f103215d = z;
            notifyDataSetChanged();
        }
    }

    public final void e(boolean z) {
        if (z != this.f103216e) {
            this.f103216e = z;
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        this.f103217f = (LinearLayoutManager) layoutManager;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean b(IMContact iMContact) {
        l.d(iMContact, "");
        if (!this.f103215d) {
            return false;
        }
        if ((!(iMContact instanceof IMUser) || !IMUser.isFriend(((IMUser) iMContact).getFollowStatus())) && !(iMContact instanceof com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.a)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.im.sdk.relations.ui.a.b
    public final int c(int i2) {
        List n = n();
        if (n == null || n.isEmpty() || i2 < m()) {
            return super.c(i2);
        }
        Integer valueOf = Integer.valueOf(i2 - m());
        int intValue = valueOf.intValue();
        if (intValue < 0 || intValue >= n.size() || valueOf == null) {
            return super.c(i2);
        }
        if (n.get(valueOf.intValue()) instanceof com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.a) {
            return 2;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        IMUser iMUser = null;
        if (!(viewHolder instanceof com.ss.android.ugc.aweme.im.sdk.relations.ui.c.d)) {
            viewHolder = null;
        }
        com.ss.android.ugc.aweme.im.sdk.relations.ui.c.d dVar = (com.ss.android.ugc.aweme.im.sdk.relations.ui.c.d) viewHolder;
        if (dVar != null) {
            boolean z = this.w;
            SharePackage sharePackage = this.f103218g;
            if (!dVar.f103282l.b()) {
                IMContact iMContact = dVar.f103280j;
                if (iMContact instanceof com.ss.android.ugc.aweme.social.c.a) {
                    IMUser iMUser2 = (IMUser) iMContact;
                    if (!dVar.f103282l.a().contains(iMUser2.getUid())) {
                        Set<String> a2 = dVar.f103282l.a();
                        String uid = iMUser2.getUid();
                        l.b(uid, "");
                        a2.add(uid);
                        String uid2 = iMUser2.getUid();
                        l.b(uid2, "");
                        com.ss.android.ugc.aweme.im.sdk.share.a.a.a("vertical", "show", uid2);
                        return;
                    }
                }
                IMContact iMContact2 = dVar.f103280j;
                if (iMContact2 instanceof IMUser) {
                    iMUser = iMContact2;
                }
                IMUser iMUser3 = iMUser;
                if (iMUser3 != null) {
                    if (!dVar.f103282l.a().contains(iMUser3.getUid())) {
                        com.ss.android.ugc.aweme.im.sdk.share.a.a.a(iMUser3, dVar.f103281k, "column", sharePackage, z, a.C2623a.f103354a);
                        Set<String> a3 = dVar.f103282l.a();
                        String uid3 = iMUser3.getUid();
                        l.b(uid3, "");
                        a3.add(uid3);
                    }
                }
            }
        }
    }

    public /* synthetic */ d(SharePackage sharePackage, ShareDialogViewModel shareDialogViewModel) {
        this(sharePackage, shareDialogViewModel, true, false);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.a.b
    public final com.ss.android.ugc.aweme.im.sdk.relations.ui.c.a<IMContact> b(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        if (i2 != 2) {
            return new com.ss.android.ugc.aweme.im.sdk.relations.ui.c.d(viewGroup, this.f103219h, this.f103221k);
        }
        return new c(viewGroup, this.f103219h);
    }

    public final boolean a(IMContact iMContact, View view) {
        IMUser a2;
        if ((iMContact instanceof IMConversation) || (a2 = f.a(iMContact)) == null || l.a((Object) a2.getUid(), (Object) com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b().toString()) || a2.getFollowStatus() == 2) {
            return true;
        }
        String str = this.f103218g.f124590d;
        int hashCode = str.hashCode();
        if (hashCode != 102340) {
            if (hashCode == 110986 && str.equals("pic")) {
                new com.bytedance.tux.g.b(view).e(R.string.cgo).b();
                return false;
            }
        } else if (str.equals("gif")) {
            new com.bytedance.tux.g.b(view).e(R.string.cem).b();
            return false;
        }
        return true;
    }

    static final class b extends m implements q<Integer, Integer, View, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(66174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(3);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
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
        @Override // h.f.a.q
        public final /* synthetic */ h.z invoke(java.lang.Integer r12, java.lang.Integer r13, android.view.View r14) {
            /*
            // Method dump skipped, instructions count: 347
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.d.b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public d(SharePackage sharePackage, ShareDialogViewModel shareDialogViewModel, boolean z, boolean z2) {
        l.d(sharePackage, "");
        l.d(shareDialogViewModel, "");
        this.f103218g = sharePackage;
        this.f103219h = shareDialogViewModel;
        this.f103221k = z;
        this.w = z2;
        this.f103220j = new b(this);
    }
}
