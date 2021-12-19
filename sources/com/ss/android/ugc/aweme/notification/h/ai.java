package com.ss.android.ugc.aweme.notification.h;

import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice;
import com.ss.android.ugc.aweme.notification.g.a;
import com.ss.android.ugc.aweme.notification.utils.g;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ai extends w implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f113520a;

    /* renamed from: b  reason: collision with root package name */
    private final AvatarImageWithVerify f113521b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f113522c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f113523d;

    /* renamed from: e  reason: collision with root package name */
    private FollowApproveNotice f113524e;

    static {
        Covode.recordClassIndex(72988);
    }

    private static boolean h() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.w
    public final User c() {
        FollowApproveNotice followApproveNotice = this.f113524e;
        if (followApproveNotice != null) {
            return followApproveNotice.getUser();
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ai(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.cxx);
        l.b(findViewById, "");
        this.f113520a = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        l.b(findViewById2, "");
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) findViewById2;
        this.f113521b = avatarImageWithVerify;
        View findViewById3 = view.findViewById(R.id.cxm);
        l.b(findViewById3, "");
        this.f113522c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cwx);
        l.b(findViewById4, "");
        this.f113523d = (TextView) findViewById4;
        g.a(findViewById);
        a.a(avatarImageWithVerify);
        findViewById.setOnClickListener(this);
        avatarImageWithVerify.setOnClickListener(this);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
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
    public final void a(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r8) {
        /*
            r7 = this;
            java.lang.String r6 = ""
            h.f.b.l.d(r8, r6)
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice r0 = r8.followApproveNotice
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice r0 = r8.followApproveNotice
            r7.f113524e = r0
            if (r0 == 0) goto L_0x005e
            com.ss.android.ugc.aweme.profile.model.User r5 = r0.getUser()
            if (r5 == 0) goto L_0x005e
            com.ss.android.ugc.aweme.utils.UserVerify r4 = new com.ss.android.ugc.aweme.utils.UserVerify
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r5.getAvatarThumb()
            java.lang.String r2 = r5.getCustomVerify()
            java.lang.String r1 = r5.getEnterpriseVerifyReason()
            int r0 = r5.getVerificationType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.<init>(r3, r2, r1, r0)
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r0 = r7.f113521b
            r0.setUserData(r4)
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r0 = r7.f113521b
            r0.a()
            android.widget.TextView r0 = r7.f113522c
            com.ss.android.ugc.aweme.notification.h.p.a(r7, r0, r5)
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>()
            android.content.Context r0 = r7.f113647i
            h.f.b.l.b(r0, r6)
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131826494(0x7f11173e, float:1.9285874E38)
            java.lang.String r0 = r1.getString(r0)
            r2.append(r0)
            r7.a(r2, r8)
            android.widget.TextView r0 = r7.f113523d
            r0.setText(r2)
        L_0x005e:
            com.ss.android.ugc.aweme.notification.h.w.a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.h.ai.a(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice):void");
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
        User user;
        ClickAgent.onClick(view);
        d.a();
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = h();
        }
        if (!j.f107229h) {
            View view2 = this.itemView;
            l.b(view2, "");
            new b(view2).e(R.string.de8).b();
            return;
        }
        FollowApproveNotice followApproveNotice = this.f113524e;
        if (followApproveNotice != null && (user = followApproveNotice.getUser()) != null) {
            k.b(user.getUid(), user.getSecUid(), "message");
            k.a(user.getUid(), "notification_page", "click_head");
        }
    }
}
