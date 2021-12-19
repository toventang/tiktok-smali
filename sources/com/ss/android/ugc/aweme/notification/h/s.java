package com.ss.android.ugc.aweme.notification.h;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice;
import com.ss.android.ugc.aweme.notification.e.c;
import com.ss.android.ugc.aweme.notification.utils.e;
import com.ss.android.ugc.aweme.notification.utils.g;
import com.ss.android.ugc.aweme.notification.utils.n;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.em;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class s extends w implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f113692a;

    /* renamed from: b  reason: collision with root package name */
    private final AvatarImageWithVerify f113693b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f113694c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f113695d;

    /* renamed from: e  reason: collision with root package name */
    private final RemoteImageView f113696e;

    /* renamed from: f  reason: collision with root package name */
    private DuetNotice f113697f;

    static {
        Covode.recordClassIndex(73089);
    }

    private static boolean h() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k
    public final void f() {
        super.g();
        this.f113487h.a(this.f113648j, new a(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.w
    public final User c() {
        Aweme aweme;
        DuetNotice duetNotice = this.f113697f;
        if (duetNotice == null || (aweme = duetNotice.getAweme()) == null) {
            return null;
        }
        return aweme.getAuthor();
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(73090);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(s sVar) {
            super(0);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            int i2 = this.this$0.f113649k;
            String str = this.this$0.f113650l;
            l.b(str, "");
            e.a("duet", i2, str, this.this$0.f113487h.a(), this.this$0.f113648j.templateId);
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.cxx);
        l.b(findViewById, "");
        this.f113692a = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        l.b(findViewById2, "");
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) findViewById2;
        this.f113693b = avatarImageWithVerify;
        View findViewById3 = view.findViewById(R.id.cxm);
        l.b(findViewById3, "");
        this.f113694c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cwx);
        l.b(findViewById4, "");
        this.f113695d = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cwz);
        l.b(findViewById5, "");
        RemoteImageView remoteImageView = (RemoteImageView) findViewById5;
        this.f113696e = remoteImageView;
        g.a(findViewById);
        com.ss.android.ugc.aweme.notification.g.a.a(avatarImageWithVerify);
        com.ss.android.ugc.aweme.notification.g.a.a(remoteImageView);
        remoteImageView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageWithVerify.setOnClickListener(this);
        avatarImageWithVerify.setRequestImgSize(em.a(101));
    }

    @Override // com.ss.android.ugc.aweme.notification.h.p
    public final void c(int i2) {
        UrlModel urlModel;
        Bundle bundle = new Bundle();
        bundle.putInt("from_where", i2);
        bundle.putString("username", this.f113694c.getText().toString());
        DuetNotice duetNotice = this.f113697f;
        if (duetNotice != null) {
            User fromUser = duetNotice.getFromUser();
            if (fromUser != null) {
                urlModel = fromUser.getAvatarThumb();
            } else {
                urlModel = null;
            }
            bundle.putString("content", this.f113647i.getString(R.string.dk2));
            bundle.putSerializable("avatar_thumb", urlModel);
        }
        this.n = bundle;
        this.f113674m = true;
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
    public final void a(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r8) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.h.s.a(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice):void");
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
        Aweme aweme;
        Integer num;
        String str;
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
        DuetNotice duetNotice = this.f113697f;
        if (duetNotice != null && (aweme = duetNotice.getAweme()) != null) {
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            if (num != null) {
                if (num.intValue() == R.id.cx6) {
                    User author = aweme.getAuthor();
                    l.b(author, "");
                    String uid = author.getUid();
                    User author2 = aweme.getAuthor();
                    l.b(author2, "");
                    k.b(uid, author2.getSecUid(), "message");
                    User author3 = aweme.getAuthor();
                    l.b(author3, "");
                    k.a(author3.getUid(), "notification_page", "click_head");
                } else if (num.intValue() == R.id.cxx || num.intValue() == R.id.cwz) {
                    a("duet", getLayoutPosition());
                    c.HandlerC2905c b2 = c.b();
                    if (b2 != null) {
                        b2.b(this.f113648j);
                    }
                    if (this.f113674m) {
                        n.a(this.n, getAdapterPosition());
                    }
                    t a2 = t.a();
                    u a3 = u.a("aweme://aweme/detail/" + aweme.getAid()).a("refer", "message");
                    l.b(a3, "");
                    t.a(a2, c.a(a3, "aweme://aweme/detail/").a());
                    String aid = aweme.getAid();
                    if (!TextUtils.isEmpty(aid)) {
                        MobClick value = new MobClick().setEventName("video_play").setLabelName("message").setValue(aid);
                        com.ss.android.ugc.aweme.app.f.c cVar = new com.ss.android.ugc.aweme.app.f.c();
                        User author4 = aweme.getAuthor();
                        l.b(author4, "");
                        com.ss.android.ugc.aweme.app.f.c a4 = cVar.a("request_id", author4.getRequestId());
                        if (aweme.getAllowGift()) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        r.onEvent(value.setJsonObject(a4.a("is_giftable", str).a()));
                    }
                }
            }
        }
    }
}
