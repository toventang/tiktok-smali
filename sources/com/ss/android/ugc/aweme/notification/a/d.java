package com.ss.android.ugc.aweme.notification.a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.c;
import com.ss.android.ugc.aweme.notification.h.p;
import com.ss.android.ugc.aweme.notification.utils.g;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class d extends p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static final a f113046a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private BaseNotice f113047b;

    /* renamed from: c  reason: collision with root package name */
    private final View f113048c;

    /* renamed from: d  reason: collision with root package name */
    private final AvatarImageView f113049d;

    /* renamed from: e  reason: collision with root package name */
    private final TextView f113050e;

    /* renamed from: f  reason: collision with root package name */
    private final View f113051f;
    private final View q;
    private final NotificationDetailVM r;

    static {
        Covode.recordClassIndex(72687);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72688);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final void bY_() {
        super.bY_();
        BaseNotice baseNotice = this.f113047b;
        this.r.a(baseNotice, new b(this, baseNotice));
    }

    private final boolean h() {
        c cVar;
        String str;
        BaseNotice baseNotice = this.f113047b;
        if (baseNotice == null || (cVar = baseNotice.businessAccountNotice) == null || (str = cVar.f112840c) == null || !hl.a(str)) {
            return false;
        }
        return true;
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ BaseNotice $notice;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(72689);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, BaseNotice baseNotice) {
            super(0);
            this.this$0 = dVar;
            this.$notice = baseNotice;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String str;
            Long l2;
            Long l3;
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "notification_page").a("tab_name", "all");
            BaseNotice baseNotice = this.$notice;
            String str2 = null;
            if (baseNotice != null) {
                str = baseNotice.templateId;
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("template_id", str).a("is_together", 0);
            BaseNotice baseNotice2 = this.$notice;
            if (baseNotice2 != null) {
                l2 = Long.valueOf(baseNotice2.createTime);
            } else {
                l2 = null;
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("message_time", l2).a("client_order", this.this$0.getLayoutPosition()).a("action_type", "show").a("account_type", "business_account_assistant");
            BaseNotice baseNotice3 = this.$notice;
            if (baseNotice3 != null) {
                l3 = Long.valueOf(baseNotice3.taskId);
            } else {
                l3 = null;
            }
            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("task_id", l3);
            BaseNotice baseNotice4 = this.$notice;
            if (baseNotice4 != null) {
                str2 = baseNotice4.nid;
            }
            r.a("official_message_inner_message", a5.a("content_id", str2).f66730a);
            return z.f158842a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r8 != null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r8) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.a.d.a(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice):void");
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
        String str;
        Long l2;
        Long l3;
        c cVar;
        String str2;
        ClickAgent.onClick(view);
        if (h()) {
            com.bytedance.ies.ugc.appcontext.d.a();
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = c();
            }
            String str3 = "";
            if (!j.f107229h) {
                View view2 = this.itemView;
                l.b(view2, str3);
                new com.bytedance.tux.g.b(view2).e(R.string.de8).b();
            } else if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                Context context = this.f113647i;
                BaseNotice baseNotice = this.f113047b;
                if (!(baseNotice == null || (cVar = baseNotice.businessAccountNotice) == null || (str2 = cVar.f112840c) == null)) {
                    str3 = str2;
                }
                SmartRouter.buildRoute(context, str3).open();
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "notification_page").a("tab_name", "all");
                BaseNotice baseNotice2 = this.f113047b;
                String str4 = null;
                if (baseNotice2 != null) {
                    str = baseNotice2.templateId;
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.app.f.d a3 = a2.a("template_id", str).a("is_together", 0);
                BaseNotice baseNotice3 = this.f113047b;
                if (baseNotice3 != null) {
                    l2 = Long.valueOf(baseNotice3.createTime);
                } else {
                    l2 = null;
                }
                com.ss.android.ugc.aweme.app.f.d a4 = a3.a("message_time", l2).a("client_order", getLayoutPosition()).a("action_type", "click").a("account_type", "business_account_assistant");
                BaseNotice baseNotice4 = this.f113047b;
                if (baseNotice4 != null) {
                    l3 = Long.valueOf(baseNotice4.taskId);
                } else {
                    l3 = null;
                }
                com.ss.android.ugc.aweme.app.f.d a5 = a4.a("task_id", l3);
                BaseNotice baseNotice5 = this.f113047b;
                if (baseNotice5 != null) {
                    str4 = baseNotice5.nid;
                }
                r.a("official_message_inner_message", a5.a("content_id", str4).f66730a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view, NotificationDetailVM notificationDetailVM) {
        super(view);
        l.d(view, "");
        l.d(notificationDetailVM, "");
        this.r = notificationDetailVM;
        View findViewById = view.findViewById(R.id.cxx);
        l.b(findViewById, "");
        this.f113048c = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        l.b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f113049d = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cwx);
        l.b(findViewById3, "");
        this.f113050e = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bzg);
        l.b(findViewById4, "");
        this.f113051f = findViewById4;
        View findViewById5 = view.findViewById(R.id.cwr);
        l.b(findViewById5, "");
        this.q = findViewById5;
        findViewById.setOnClickListener(this);
        avatarImageView.setOnClickListener(this);
        g.a(findViewById);
        com.ss.android.ugc.aweme.notification.g.a.a(avatarImageView);
    }
}
