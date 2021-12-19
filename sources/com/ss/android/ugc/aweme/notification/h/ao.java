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
import com.ss.android.ugc.aweme.notice.repo.list.bean.l;
import com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg;
import com.ss.android.ugc.aweme.notification.redpoint.h;
import com.ss.android.ugc.aweme.notification.utils.g;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.z;

public final class ao extends p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static final a f113555a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final View f113556b;

    /* renamed from: c  reason: collision with root package name */
    private final AvatarImageView f113557c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f113558d;

    /* renamed from: e  reason: collision with root package name */
    private final View f113559e;

    /* renamed from: f  reason: collision with root package name */
    private l f113560f;
    private String q = "";
    private final Fragment r;

    static {
        Covode.recordClassIndex(73001);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final boolean e() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73002);
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
        this.f113487h.a(this.f113648j, new b(this));
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ ao this$0;

        static {
            Covode.recordClassIndex(73003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ao aoVar) {
            super(0);
            this.this$0 = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            r.a("official_message_inner_message", new d().a("action_type", "show").a("account_type", "starmap_assistant").a("client_order", this.this$0.getLayoutPosition()).a("scene_id", "1004").a("task_id", this.this$0.f113648j.taskId).a("template_id", this.this$0.f113648j.templateId).a("content_id", this.this$0.f113648j.nid).f66730a);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
        String str;
        ClickAgent.onClick(view);
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            com.bytedance.ies.ugc.appcontext.d.a();
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = c();
            }
            if (!j.f107229h) {
                View view2 = this.itemView;
                h.f.b.l.b(view2, "");
                new com.bytedance.tux.g.b(view2).e(R.string.de8).b();
            } else if (view != null) {
                if (h.b().a(61) > 0) {
                    c.a(new n());
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(this.f113647i, "//notice/detail");
                int a2 = h.b().a(62);
                BaseNotice baseNotice = this.f113648j;
                if (baseNotice != null) {
                    str = baseNotice.nid;
                } else {
                    str = null;
                }
                buildRoute.withNavArg(new MusNotificationDetailArg(62, a2, null, null, str, 12, null)).open();
                com.ss.android.ugc.aweme.notice.api.b.d(62, 61);
                r.a("enter_official_message", new d().a("account_type", "starmap_assistant").a("client_order", getLayoutPosition()).a("scene_id", "1004").a("template_id", this.q).f66730a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ao(View view, Fragment fragment) {
        super(view);
        h.f.b.l.d(view, "");
        h.f.b.l.d(fragment, "");
        this.r = fragment;
        View findViewById = view.findViewById(R.id.cxx);
        h.f.b.l.b(findViewById, "");
        this.f113556b = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        h.f.b.l.b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f113557c = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cwx);
        h.f.b.l.b(findViewById3, "");
        this.f113558d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bzg);
        h.f.b.l.b(findViewById4, "");
        this.f113559e = findViewById4;
        g.a(findViewById);
        com.ss.android.ugc.aweme.notification.g.a.a(avatarImageView);
        findViewById.setOnClickListener(this);
        avatarImageView.setOnClickListener(this);
    }

    public final void a(BaseNotice baseNotice, boolean z) {
        h.f.b.l.d(baseNotice, "");
        if (baseNotice.tcmNotice != null) {
            this.q = baseNotice.templateId;
            l lVar = baseNotice.tcmNotice;
            this.f113560f = lVar;
            if (lVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Context context = this.f113647i;
                h.f.b.l.b(context, "");
                spannableStringBuilder.append((CharSequence) context.getResources().getString(R.string.cg1)).append((CharSequence) ": ");
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((char) 8296);
                if (!TextUtils.isEmpty(lVar.f112871a)) {
                    spannableStringBuilder.append((CharSequence) lVar.f112871a);
                } else {
                    spannableStringBuilder.delete(spannableStringBuilder.length() - 2, spannableStringBuilder.length());
                }
                spannableStringBuilder.append((char) 8297);
                if (z) {
                    this.f113559e.setVisibility(8);
                    q.a(this.f113558d, spannableStringBuilder, baseNotice, 5, com.bytedance.common.utility.n.a(this.f113647i) - ((int) com.bytedance.common.utility.n.b(this.f113647i, 132.0f)));
                    this.f113559e.setVisibility(8);
                } else {
                    this.f113558d.setText(spannableStringBuilder);
                    this.f113559e.setVisibility(0);
                }
                this.f113557c.setImageURI(com.facebook.common.k.g.a(2131231277));
            }
        }
    }
}
