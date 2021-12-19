package com.ss.android.ugc.aweme.notification.h;

import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice;
import com.ss.android.ugc.aweme.notification.utils.e;
import com.ss.android.ugc.aweme.notification.utils.g;
import com.ss.android.ugc.aweme.notification.utils.k;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class ak extends p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f113531a;

    /* renamed from: b  reason: collision with root package name */
    private final View f113532b;

    /* renamed from: c  reason: collision with root package name */
    private final AvatarImageWithVerify f113533c;

    /* renamed from: d  reason: collision with root package name */
    private final AvatarImageView f113534d;

    /* renamed from: e  reason: collision with root package name */
    private final AvatarImageView f113535e;

    /* renamed from: f  reason: collision with root package name */
    private final TextView f113536f;
    private final TextView q;
    private CheckProfileNotice r;

    static {
        Covode.recordClassIndex(72992);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final boolean e() {
        return false;
    }

    private static boolean c() {
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

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ ak this$0;

        static {
            Covode.recordClassIndex(72993);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ak akVar) {
            super(0);
            this.this$0 = akVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            int i2 = this.this$0.f113649k;
            String str = this.this$0.f113650l;
            l.b(str, "");
            e.a("check_profile", i2, str, this.this$0.f113487h.a(), this.this$0.f113648j.templateId);
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ak(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.cxx);
        l.b(findViewById, "");
        this.f113531a = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        l.b(findViewById2, "");
        this.f113532b = findViewById2;
        View findViewById3 = view.findViewById(R.id.cx8);
        l.b(findViewById3, "");
        this.f113533c = (AvatarImageWithVerify) findViewById3;
        View findViewById4 = view.findViewById(R.id.cx_);
        l.b(findViewById4, "");
        this.f113534d = (AvatarImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cxa);
        l.b(findViewById5, "");
        this.f113535e = (AvatarImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.cxm);
        l.b(findViewById6, "");
        this.f113536f = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.cwx);
        l.b(findViewById7, "");
        this.q = (TextView) findViewById7;
        g.a(findViewById);
        com.ss.android.ugc.aweme.notification.g.a.a(findViewById2);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
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
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.h.ak.a(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice):void");
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
        Integer valueOf;
        ClickAgent.onClick(view);
        d.a();
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = c();
        }
        if (!j.f107229h) {
            View view2 = this.itemView;
            l.b(view2, "");
            new b(view2).e(R.string.de8).b();
            return;
        }
        CheckProfileNotice checkProfileNotice = this.r;
        if (checkProfileNotice != null && view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.cx6) {
                List<User> users = checkProfileNotice.getUsers();
                if (users == null) {
                    return;
                }
                if (users.size() == 1) {
                    k.b(((User) n.g((List) users)).getUid(), ((User) n.g((List) users)).getSecUid(), "message");
                    k.a(((User) n.g((List) users)).getUid(), "notification_page", "click_head");
                    return;
                }
                k.a(view.getContext());
            } else if (valueOf.intValue() == R.id.cxx) {
                a("check_profile", getLayoutPosition());
                k.a(view.getContext());
            }
        }
    }
}
