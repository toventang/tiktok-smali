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
import com.ss.android.ugc.aweme.notice.api.bean.n;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.j;
import com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg;
import com.ss.android.ugc.aweme.notification.redpoint.h;
import com.ss.android.ugc.aweme.notification.utils.g;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class an extends p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static final a f113549a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final View f113550b;

    /* renamed from: c  reason: collision with root package name */
    private final AvatarImageView f113551c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f113552d;

    /* renamed from: e  reason: collision with root package name */
    private final View f113553e;

    /* renamed from: f  reason: collision with root package name */
    private j f113554f;
    private BaseNotice q;
    private String r;
    private int s = -1;
    private final Fragment t;

    static {
        Covode.recordClassIndex(72998);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72999);
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
        super.g();
        BaseNotice baseNotice = this.q;
        if (baseNotice != null) {
            this.f113487h.a(baseNotice, new b(this, baseNotice));
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ BaseNotice $notice;
        final /* synthetic */ an this$0;

        static {
            Covode.recordClassIndex(73000);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(an anVar, BaseNotice baseNotice) {
            super(0);
            this.this$0 = anVar;
            this.$notice = baseNotice;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            r.a("notification_message_inner_message", new d().a("enter_from", "notification_page").a("tab_name", com.ss.android.ugc.aweme.notification.utils.f.a(Integer.valueOf(this.this$0.f113487h.a()))).a("template_id", this.$notice.templateId).a("is_together", 1).a("message_time", this.$notice.createTime).a("client_order", this.this$0.f113649k).a("action_type", "show").a("account_type", "promote").a("task_id", this.$notice.taskId).f66730a);
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
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = c();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                View view2 = this.itemView;
                l.b(view2, "");
                new com.bytedance.tux.g.b(view2).e(R.string.de8).b();
                return;
            }
            Long l3 = null;
            if (view != null) {
                if (h.b().a(81) > 0) {
                    c.a(new n());
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(this.f113647i, "//notice/detail");
                int a2 = h.b().a(81);
                BaseNotice baseNotice = this.f113648j;
                if (baseNotice != null) {
                    str2 = baseNotice.nid;
                } else {
                    str2 = null;
                }
                buildRoute.withNavArg(new MusNotificationDetailArg(81, a2, null, null, str2, 12, null)).open();
                com.ss.android.ugc.aweme.notice.api.b.d(81);
            }
            d a3 = new d().a("enter_from", "notification_page").a("tab_name", this.r);
            BaseNotice baseNotice2 = this.q;
            if (baseNotice2 != null) {
                str = baseNotice2.templateId;
            } else {
                str = null;
            }
            d a4 = a3.a("template_id", str).a("is_together", 1);
            BaseNotice baseNotice3 = this.q;
            if (baseNotice3 != null) {
                l2 = Long.valueOf(baseNotice3.createTime);
            } else {
                l2 = null;
            }
            d a5 = a4.a("message_time", l2).a("client_order", String.valueOf(this.s)).a("action_type", "click").a("account_type", "promote");
            BaseNotice baseNotice4 = this.q;
            if (baseNotice4 != null) {
                l3 = Long.valueOf(baseNotice4.taskId);
            }
            r.a("notification_message_inner_message", a5.a("task_id", l3).f66730a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public an(View view, Fragment fragment) {
        super(view);
        l.d(view, "");
        l.d(fragment, "");
        this.t = fragment;
        View findViewById = view.findViewById(R.id.cxx);
        l.b(findViewById, "");
        this.f113550b = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        l.b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f113551c = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cwx);
        l.b(findViewById3, "");
        this.f113552d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bzg);
        l.b(findViewById4, "");
        this.f113553e = findViewById4;
        g.a(findViewById);
        com.ss.android.ugc.aweme.notification.g.a.a(avatarImageView);
        findViewById.setOnClickListener(this);
        avatarImageView.setOnClickListener(this);
    }

    public final void a(BaseNotice baseNotice, boolean z, int i2, String str) {
        l.d(baseNotice, "");
        l.d(str, "");
        this.q = baseNotice;
        this.r = str;
        this.s = i2;
        if (baseNotice.promoteNotice != null) {
            j jVar = baseNotice.promoteNotice;
            this.f113554f = jVar;
            if (jVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Context context = this.f113550b.getContext();
                l.b(context, "");
                spannableStringBuilder.append((CharSequence) context.getResources().getString(R.string.ezo)).append((CharSequence) ": ");
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((char) 8296);
                if (!TextUtils.isEmpty(jVar.f112864a)) {
                    spannableStringBuilder.append((CharSequence) jVar.f112864a);
                } else {
                    spannableStringBuilder.delete(spannableStringBuilder.length() - 2, spannableStringBuilder.length());
                }
                spannableStringBuilder.append((char) 8297);
                if (z) {
                    this.f113553e.setVisibility(8);
                    q.a(this.f113552d, spannableStringBuilder, baseNotice, 5, com.bytedance.common.utility.n.a(this.f113647i) - ((int) com.bytedance.common.utility.n.b(this.f113647i, 132.0f)));
                    this.f113553e.setVisibility(8);
                } else {
                    this.f113552d.setText(spannableStringBuilder);
                    this.f113553e.setVisibility(0);
                }
                this.f113551c.setImageURI(com.facebook.common.k.g.a(2131231272));
            }
        }
    }
}
