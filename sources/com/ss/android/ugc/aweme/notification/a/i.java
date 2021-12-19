package com.ss.android.ugc.aweme.notification.a;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.facebook.common.k.g;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.j;
import com.ss.android.ugc.aweme.notification.h.p;
import com.ss.android.ugc.aweme.notification.h.q;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class i extends p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static final String f113069a = "enter_from";

    /* renamed from: b  reason: collision with root package name */
    public static final String f113070b = "guide_to_invite_third_friends";

    /* renamed from: c  reason: collision with root package name */
    public static final String f113071c = StringSet.type;

    /* renamed from: d  reason: collision with root package name */
    public static final a f113072d = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private final View f113073e;

    /* renamed from: f  reason: collision with root package name */
    private final AvatarImageView f113074f;
    private final TextView q;
    private final RemoteImageView r;
    private final DmtButton s;
    private final TuxIconView t;
    private final TextView u;
    private final ImageView v;
    private j w;
    private BaseNotice x;
    private String y;
    private final NotificationDetailVM z;

    public static final class a {
        static {
            Covode.recordClassIndex(72700);
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

    static {
        Covode.recordClassIndex(72699);
    }

    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final void bY_() {
        super.bY_();
        BaseNotice baseNotice = this.x;
        if (baseNotice != null) {
            this.z.a(baseNotice, new b(this, baseNotice));
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ BaseNotice $notice;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(72701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, BaseNotice baseNotice) {
            super(0);
            this.this$0 = iVar;
            this.$notice = baseNotice;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            r.a("official_message_inner_message", new d().a("enter_from", "notification_page").a("tab_name", "all").a("template_id", this.$notice.templateId).a("is_together", 0).a("message_time", this.$notice.createTime).a("client_order", this.this$0.getLayoutPosition()).a("action_type", "show").a("account_type", "promote").a("task_id", this.$notice.taskId).f66730a);
            return z.f158842a;
        }
    }

    public final void a(BaseNotice baseNotice) {
        boolean z2;
        l.d(baseNotice, "");
        this.x = baseNotice;
        if (baseNotice.promoteNotice != null) {
            this.y = baseNotice.nid;
            this.f113074f.setImageURI(g.a(2131231272));
            j jVar = baseNotice.promoteNotice;
            this.w = jVar;
            if (jVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (this.f113486g) {
                    spannableStringBuilder.append((char) 8296);
                }
                if (!TextUtils.isEmpty(jVar.f112864a)) {
                    spannableStringBuilder.append((CharSequence) jVar.f112864a);
                    if (!TextUtils.isEmpty(jVar.f112865b)) {
                        spannableStringBuilder.append(": ");
                    }
                    spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                }
                if (!TextUtils.isEmpty(jVar.f112865b)) {
                    spannableStringBuilder.append((CharSequence) jVar.f112865b);
                }
                if (this.f113486g) {
                    spannableStringBuilder.append((char) 8297);
                }
                if (jVar.f112866c.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    a(spannableStringBuilder, baseNotice);
                    this.q.setText(spannableStringBuilder);
                    this.t.setVisibility(8);
                    this.r.setVisibility(8);
                    this.u.setVisibility(8);
                    this.v.setVisibility(8);
                    this.s.setVisibility(8);
                    return;
                }
                try {
                    Uri.parse(jVar.f112866c);
                    q.a(this.q, spannableStringBuilder, baseNotice, 10, n.a(this.f113647i) - ((int) n.b(this.f113647i, 132.0f)));
                    this.t.setVisibility(0);
                    this.r.setVisibility(8);
                    this.u.setVisibility(8);
                    this.v.setVisibility(8);
                    this.s.setVisibility(8);
                    if (jVar.f112867d != null) {
                        e.a(this.r, jVar.f112867d);
                        this.r.setVisibility(0);
                        this.t.setVisibility(8);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
        j jVar;
        String str;
        String str2;
        Long l2;
        ClickAgent.onClick(view);
        BaseNotice baseNotice = this.x;
        if (baseNotice != null && (jVar = baseNotice.promoteNotice) != null && (str = jVar.f112866c) != null && hl.a(str)) {
            com.bytedance.ies.ugc.appcontext.d.a();
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = c();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                View view2 = this.itemView;
                l.b(view2, "");
                new com.bytedance.tux.g.b(view2).e(R.string.de8).b();
            } else if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                j jVar2 = this.w;
                if (jVar2 != null) {
                    SmartRouter.buildRoute(this.f113647i, jVar2.f112866c).open();
                }
                d a2 = new d().a("enter_from", "notification_page").a("tab_name", "all");
                BaseNotice baseNotice2 = this.x;
                Long l3 = null;
                if (baseNotice2 != null) {
                    str2 = baseNotice2.templateId;
                } else {
                    str2 = null;
                }
                d a3 = a2.a("template_id", str2).a("is_together", 0);
                BaseNotice baseNotice3 = this.x;
                if (baseNotice3 != null) {
                    l2 = Long.valueOf(baseNotice3.createTime);
                } else {
                    l2 = null;
                }
                d a4 = a3.a("message_time", l2).a("client_order", getLayoutPosition()).a("action_type", "click").a("account_type", "promote");
                BaseNotice baseNotice4 = this.x;
                if (baseNotice4 != null) {
                    l3 = Long.valueOf(baseNotice4.taskId);
                }
                r.a("official_message_inner_message", a4.a("task_id", l3).f66730a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(View view, NotificationDetailVM notificationDetailVM) {
        super(view);
        l.d(view, "");
        l.d(notificationDetailVM, "");
        this.z = notificationDetailVM;
        View findViewById = view.findViewById(R.id.cxx);
        l.b(findViewById, "");
        this.f113073e = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        l.b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f113074f = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cwx);
        l.b(findViewById3, "");
        this.q = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cwz);
        l.b(findViewById4, "");
        this.r = (RemoteImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cww);
        l.b(findViewById5, "");
        DmtButton dmtButton = (DmtButton) findViewById5;
        this.s = dmtButton;
        View findViewById6 = view.findViewById(R.id.cwr);
        l.b(findViewById6, "");
        this.t = (TuxIconView) findViewById6;
        View findViewById7 = view.findViewById(R.id.e9p);
        l.b(findViewById7, "");
        TextView textView = (TextView) findViewById7;
        this.u = textView;
        View findViewById8 = view.findViewById(R.id.e9o);
        l.b(findViewById8, "");
        ImageView imageView = (ImageView) findViewById8;
        this.v = imageView;
        com.ss.android.ugc.aweme.notification.utils.g.a(findViewById);
        com.ss.android.ugc.aweme.notification.utils.g.a(textView);
        com.ss.android.ugc.aweme.notification.utils.g.a(imageView);
        com.ss.android.ugc.aweme.notification.g.a.a(avatarImageView);
        dmtButton.getLayoutParams().width = com.ss.android.ugc.aweme.notification.utils.g.a(this.f113647i);
        dmtButton.setOnClickListener(this);
        imageView.setOnClickListener(this);
        textView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageView.setOnClickListener(this);
        this.f113486g = gb.a(this.f113647i);
    }
}
