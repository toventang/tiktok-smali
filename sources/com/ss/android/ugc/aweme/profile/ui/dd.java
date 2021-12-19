package com.ss.android.ugc.aweme.profile.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.ss.android.ugc.aweme.profile.f.ad;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;

public final class dd {

    /* renamed from: b  reason: collision with root package name */
    public static final a f117124b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final View f117125a;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f117126c = h.i.a((h.f.a.a) new d(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.h f117127d = h.i.a((h.f.a.a) new e(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.h f117128e = h.i.a((h.f.a.a) new j(this));

    /* renamed from: f  reason: collision with root package name */
    private final h.h f117129f = h.i.a((h.f.a.a) new c(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h f117130g = h.i.a((h.f.a.a) new i(this));

    /* renamed from: h  reason: collision with root package name */
    private final h.h f117131h = h.i.a((h.f.a.a) new f(this));

    /* renamed from: i  reason: collision with root package name */
    private final h.h f117132i = h.i.a((h.f.a.a) new h(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f117133j = h.i.a((h.f.a.a) new g(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f117134k = h.i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(75640);
    }

    private static boolean a(int i2, int i3) {
        return i2 == 0 && i3 == 1;
    }

    private final View g() {
        return (View) this.f117131h.getValue();
    }

    private final TextView h() {
        return (TextView) this.f117132i.getValue();
    }

    private final DmtButton i() {
        return (DmtButton) this.f117133j.getValue();
    }

    public final View a() {
        return (View) this.f117126c.getValue();
    }

    public final View b() {
        return (View) this.f117127d.getValue();
    }

    public final TuxButton c() {
        return (TuxButton) this.f117128e.getValue();
    }

    public final TextView d() {
        return (TextView) this.f117129f.getValue();
    }

    public final TextView e() {
        return (TextView) this.f117130g.getValue();
    }

    public final ImageView f() {
        return (ImageView) this.f117134k.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75641);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(User user) {
            l.d(user, "");
            if (user.getAccountType() != 3 || user.isSecret() || user.getBizAccountInfo() == null || !user.getBizAccountInfo().enableDM()) {
                return false;
            }
            return true;
        }
    }

    static final class b extends m implements h.f.a.a<TuxIconView> {
        final /* synthetic */ dd this$0;

        static {
            Covode.recordClassIndex(75642);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(dd ddVar) {
            super(0);
            this.this$0 = ddVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxIconView invoke() {
            return this.this$0.f117125a.findViewById(R.id.anu);
        }
    }

    static final class c extends m implements h.f.a.a<TuxButton> {
        final /* synthetic */ dd this$0;

        static {
            Covode.recordClassIndex(75643);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(dd ddVar) {
            super(0);
            this.this$0 = ddVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxButton invoke() {
            return this.this$0.f117125a.findViewById(R.id.d_g);
        }
    }

    static final class d extends m implements h.f.a.a<TuxButton> {
        final /* synthetic */ dd this$0;

        static {
            Covode.recordClassIndex(75644);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(dd ddVar) {
            super(0);
            this.this$0 = ddVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxButton invoke() {
            return this.this$0.f117125a.findViewById(R.id.b7o);
        }
    }

    static final class e extends m implements h.f.a.a<RelativeLayout> {
        final /* synthetic */ dd this$0;

        static {
            Covode.recordClassIndex(75645);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(dd ddVar) {
            super(0);
            this.this$0 = ddVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RelativeLayout invoke() {
            return this.this$0.f117125a.findViewById(R.id.b7p);
        }
    }

    static final class f extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ dd this$0;

        static {
            Covode.recordClassIndex(75646);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(dd ddVar) {
            super(0);
            this.this$0 = ddVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.this$0.f117125a.findViewById(R.id.bza);
        }
    }

    static final class g extends m implements h.f.a.a<DmtButton> {
        final /* synthetic */ dd this$0;

        static {
            Covode.recordClassIndex(75647);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(dd ddVar) {
            super(0);
            this.this$0 = ddVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DmtButton invoke() {
            return this.this$0.f117125a.findViewById(R.id.cs4);
        }
    }

    static final class h extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ dd this$0;

        static {
            Covode.recordClassIndex(75648);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(dd ddVar) {
            super(0);
            this.this$0 = ddVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.f117125a.findViewById(R.id.ezo);
        }
    }

    static final class i extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ dd this$0;

        static {
            Covode.recordClassIndex(75649);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(dd ddVar) {
            super(0);
            this.this$0 = ddVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.f117125a.findViewById(R.id.dm0);
        }
    }

    static final class j extends m implements h.f.a.a<TuxButton> {
        final /* synthetic */ dd this$0;

        static {
            Covode.recordClassIndex(75650);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(dd ddVar) {
            super(0);
            this.this$0 = ddVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxButton invoke() {
            return this.this$0.f117125a.findViewById(R.id.dyq);
        }
    }

    public dd(View view) {
        l.d(view, "");
        this.f117125a = view;
    }

    public static void a(int i2, User user, boolean z) {
        if (user != null) {
            String uid = user.getUid();
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (!TextUtils.equals(uid, g2.getCurUserId())) {
                boolean z2 = false;
                IMainServiceHelper createIMainServiceHelperbyMonsterPlugin = MainServiceHelperImpl.createIMainServiceHelperbyMonsterPlugin(false);
                if (createIMainServiceHelperbyMonsterPlugin != null && !createIMainServiceHelperbyMonsterPlugin.isChatFunOfflineUnder16()) {
                    if (com.bytedance.ies.abmock.b.a().a(true, "hide_profile_message_button", false) && !user.isShowMessageButton()) {
                        return;
                    }
                    if (!com.ss.android.ugc.aweme.experiment.m.b() || !a.a(user)) {
                        if (((i2 == 1 || i2 == 2) && !z) || (i2 == 0 && z)) {
                            String uid2 = user.getUid();
                            if (user.getAccountType() == 3) {
                                z2 = true;
                            }
                            ad.a(uid2, i2, z2);
                        }
                    } else if (!z) {
                        String uid3 = user.getUid();
                        if (user.getAccountType() == 3) {
                            z2 = true;
                        }
                        ad.a(uid3, i2, z2);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0290, code lost:
        if (r0 == null) goto L_0x0292;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.profile.model.User r15, java.lang.String r16, int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 786
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.dd.a(com.ss.android.ugc.aweme.profile.model.User, java.lang.String, int, int):void");
    }
}
