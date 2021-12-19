package com.ss.android.ugc.aweme.notification.h;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.notice.api.bean.n;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg;
import com.ss.android.ugc.aweme.notification.redpoint.h;
import com.ss.android.ugc.aweme.notification.utils.g;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class m extends p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static final a f113652a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final View f113653b;

    /* renamed from: c  reason: collision with root package name */
    private final AvatarImageView f113654c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f113655d;

    /* renamed from: e  reason: collision with root package name */
    private final View f113656e;

    /* renamed from: f  reason: collision with root package name */
    private final View f113657f;
    private String q;
    private int r = -1;
    private BaseNotice s;
    private final Fragment t;

    static {
        Covode.recordClassIndex(73068);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final boolean e() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73069);
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

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k
    public final void f() {
        this.f113487h.a(this.f113648j, new b(this));
    }

    static final class b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(73070);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(m mVar) {
            super(0);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            BaseNotice baseNotice = this.this$0.f113648j;
            Objects.requireNonNull(baseNotice, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice");
            MusNotice musNotice = (MusNotice) baseNotice;
            int a2 = this.this$0.f113487h.a();
            int i2 = this.this$0.f113649k;
            l.d(musNotice, "");
            r.a("notification_message_inner_message", new d().a("enter_from", "notification_page").a("tab_name", com.ss.android.ugc.aweme.notification.utils.f.a(Integer.valueOf(a2))).a("template_id", musNotice.templateId).a("is_together", 1).a("message_time", musNotice.createTime).a("client_order", i2).a("action_type", "show").a("account_type", "business_account_assistant").a("task_id", musNotice.taskId).f66730a);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
        String str;
        Long l2;
        String str2;
        ClickAgent.onClick(view);
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            com.bytedance.ies.ugc.appcontext.d.a();
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = c();
            }
            if (!j.f107229h) {
                View view2 = this.itemView;
                l.b(view2, "");
                new com.bytedance.tux.g.b(view2).e(R.string.de8).b();
                return;
            }
            if (h.b().a(82) > 0) {
                c.a(new n());
            }
            Long l3 = null;
            if (view != null) {
                SmartRoute buildRoute = SmartRouter.buildRoute(this.f113647i, "//notice/detail");
                int a2 = h.b().a(82);
                BaseNotice baseNotice = this.f113648j;
                if (baseNotice != null) {
                    str2 = baseNotice.nid;
                } else {
                    str2 = null;
                }
                buildRoute.withNavArg(new MusNotificationDetailArg(88, a2, null, null, str2, 12, null)).open();
            }
            com.ss.android.ugc.aweme.notice.api.b.d(82);
            d a3 = new d().a("enter_from", "notification_page").a("tab_name", this.q);
            BaseNotice baseNotice2 = this.s;
            if (baseNotice2 != null) {
                str = baseNotice2.templateId;
            } else {
                str = null;
            }
            d a4 = a3.a("template_id", str).a("is_together", 1);
            BaseNotice baseNotice3 = this.s;
            if (baseNotice3 != null) {
                l2 = Long.valueOf(baseNotice3.createTime);
            } else {
                l2 = null;
            }
            d a5 = a4.a("message_time", l2).a("client_order", String.valueOf(this.r)).a("action_type", "click").a("account_type", "business_account_assistant");
            BaseNotice baseNotice4 = this.s;
            if (baseNotice4 != null) {
                l3 = Long.valueOf(baseNotice4.taskId);
            }
            r.a("notification_message_inner_message", a5.a("task_id", l3).f66730a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(View view, Fragment fragment) {
        super(view);
        l.d(view, "");
        l.d(fragment, "");
        this.t = fragment;
        View findViewById = view.findViewById(R.id.cxx);
        l.b(findViewById, "");
        this.f113653b = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        l.b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f113654c = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cwx);
        l.b(findViewById3, "");
        this.f113655d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bzg);
        l.b(findViewById4, "");
        this.f113656e = findViewById4;
        View findViewById5 = view.findViewById(R.id.cwr);
        l.b(findViewById5, "");
        this.f113657f = findViewById5;
        findViewById.setOnClickListener(this);
        avatarImageView.setOnClickListener(this);
        g.a(findViewById);
        com.ss.android.ugc.aweme.notification.g.a.a(avatarImageView);
    }

    public final void a(BaseNotice baseNotice, boolean z, int i2, String str) {
        int i3;
        com.ss.android.ugc.aweme.notice.repo.list.bean.c cVar;
        String str2;
        l.d(str, "");
        this.s = baseNotice;
        this.r = i2;
        this.q = str;
        this.f113654c.setImageURI(com.facebook.common.k.g.a(2131231280));
        View view = this.f113656e;
        if (z) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        view.setVisibility(i3);
        this.f113657f.setVisibility(0);
        if (baseNotice == null || (cVar = baseNotice.businessAccountNotice) == null || (str2 = cVar.f112839b) == null) {
            this.f113655d.setText("");
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Context context = this.f113647i;
        l.b(context, "");
        spannableStringBuilder.append((CharSequence) context.getResources().getString(R.string.a7r));
        if (!TextUtils.isEmpty(str2)) {
            spannableStringBuilder.append((CharSequence) ": ");
            spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((char) 8296);
            spannableStringBuilder.append((CharSequence) str2);
            spannableStringBuilder.append((char) 8297);
        } else {
            spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
        }
        q.a(this.f113655d, spannableStringBuilder, baseNotice, 5, com.bytedance.common.utility.n.a(this.f113647i) - ((int) com.bytedance.common.utility.n.b(this.f113647i, 132.0f)));
    }
}
