package com.ss.android.ugc.aweme.notification.h;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.facebook.common.k.g;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg;
import com.ss.android.ugc.aweme.notification.redpoint.h;
import com.ss.android.ugc.aweme.notification.utils.e;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class aj extends p implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public static final a f113525b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f113526a;

    /* renamed from: c  reason: collision with root package name */
    private final View f113527c;

    /* renamed from: d  reason: collision with root package name */
    private final AvatarImageView f113528d;

    /* renamed from: e  reason: collision with root package name */
    private final TextView f113529e;

    /* renamed from: f  reason: collision with root package name */
    private AnnouncementNotice f113530f;
    private UserTextNotice q;
    private String r = "";

    static {
        Covode.recordClassIndex(72989);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final boolean e() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72990);
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
        final /* synthetic */ aj this$0;

        static {
            Covode.recordClassIndex(72991);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(aj ajVar) {
            super(0);
            this.this$0 = ajVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (this.this$0.f113526a) {
                int i2 = this.this$0.f113649k;
                String str = this.this$0.f113650l;
                l.b(str, "");
                e.a("tag", i2, str, this.this$0.f113487h.a(), this.this$0.f113648j.templateId);
            } else {
                r.a("official_message_inner_message", new d().a("action_type", "show").a("account_type", "tiktok_assistant").a("client_order", this.this$0.f113649k).a("scene_id", "1004").a("task_id", this.this$0.f113648j.taskId).a("template_id", this.this$0.f113648j.templateId).a("content_id", this.this$0.f113648j.nid).f66730a);
            }
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
                l.b(view2, "");
                new com.bytedance.tux.g.b(view2).e(R.string.de8).b();
                return;
            }
            if (view != null) {
                SmartRoute buildRoute = SmartRouter.buildRoute(this.f113647i, "//notice/detail");
                int a2 = h.b().a(46);
                BaseNotice baseNotice = this.f113648j;
                if (baseNotice != null) {
                    str = baseNotice.nid;
                } else {
                    str = null;
                }
                buildRoute.withNavArg(new MusNotificationDetailArg(46, a2, null, null, str, 12, null)).open();
            }
            r.a("enter_official_message", new d().a("account_type", "tiktok_assistant").a("client_order", getLayoutPosition()).a("scene_id", "1004").a("template_id", this.r).f66730a);
        }
    }

    public final void a(BaseNotice baseNotice) {
        l.d(baseNotice, "");
        if (baseNotice.announcement != null || baseNotice.textNotice != null) {
            if (baseNotice.announcement != null && this.f113526a) {
                AnnouncementNotice announcementNotice = baseNotice.announcement;
                l.b(announcementNotice, "");
                if (announcementNotice.getChallenge() == null) {
                    return;
                }
            }
            this.r = baseNotice.templateId;
            AnnouncementNotice announcementNotice2 = baseNotice.announcement;
            this.f113530f = announcementNotice2;
            if (announcementNotice2 != null) {
                this.f113528d.setImageURI(g.a(2131231293));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Context context = this.f113647i;
                l.b(context, "");
                spannableStringBuilder.append((CharSequence) context.getResources().getString(R.string.dkd)).append((CharSequence) ": ");
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((char) 8296);
                if (!TextUtils.isEmpty(announcementNotice2.getTitle())) {
                    spannableStringBuilder.append((CharSequence) announcementNotice2.getTitle());
                } else {
                    spannableStringBuilder.delete(spannableStringBuilder.length() - 2, spannableStringBuilder.length());
                }
                spannableStringBuilder.append((char) 8297);
                q.a(this.f113529e, spannableStringBuilder, baseNotice, 5, n.a(this.f113647i) - ((int) n.b(this.f113647i, 132.0f)));
            }
            UserTextNotice userTextNotice = baseNotice.textNotice;
            this.q = userTextNotice;
            if (userTextNotice != null) {
                this.f113528d.setImageURI(g.a(2131231293));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                Context context2 = this.f113647i;
                l.b(context2, "");
                spannableStringBuilder2.append((CharSequence) context2.getResources().getString(R.string.dkd)).append((CharSequence) ": ");
                spannableStringBuilder2.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append((char) 8296);
                if (!TextUtils.isEmpty(userTextNotice.getTitle())) {
                    spannableStringBuilder2.append((CharSequence) userTextNotice.getTitle());
                } else {
                    spannableStringBuilder2.delete(spannableStringBuilder2.length() - 2, spannableStringBuilder2.length());
                }
                spannableStringBuilder2.append((char) 8297);
                q.a(this.f113529e, spannableStringBuilder2, baseNotice, 5, n.a(this.f113647i) - ((int) n.b(this.f113647i, 132.0f)));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aj(View view, boolean z) {
        super(view);
        l.d(view, "");
        this.f113526a = z;
        View findViewById = view.findViewById(R.id.cxx);
        l.b(findViewById, "");
        this.f113527c = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        l.b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f113528d = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cwx);
        l.b(findViewById3, "");
        this.f113529e = (TextView) findViewById3;
        com.ss.android.ugc.aweme.notification.utils.g.a(findViewById);
        com.ss.android.ugc.aweme.notification.g.a.a(avatarImageView);
        findViewById.setOnClickListener(this);
        avatarImageView.setOnClickListener(this);
    }
}
