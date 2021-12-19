package com.ss.android.ugc.aweme.notification.h;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.ss.android.ugc.aweme.notification.h.p;
import com.ss.android.ugc.aweme.notification.utils.g;
import com.ss.android.ugc.aweme.notification.utils.h;
import com.ss.android.ugc.aweme.notification.utils.i;
import com.ss.android.ugc.aweme.notification.utils.j;
import com.ss.android.ugc.aweme.notification.utils.n;
import com.ss.android.ugc.aweme.notification.view.NotificationFollowUserBtn;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class t extends w implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public boolean f113698a;

    /* renamed from: b  reason: collision with root package name */
    public final NotificationFollowUserBtn f113699b;

    /* renamed from: c  reason: collision with root package name */
    public FollowNotice f113700c;

    /* renamed from: d  reason: collision with root package name */
    public BaseNotice f113701d;

    /* renamed from: e  reason: collision with root package name */
    public String f113702e;

    /* renamed from: f  reason: collision with root package name */
    public String f113703f;
    private final View v;
    private final AvatarImageWithVerify w;
    private final TextView x;
    private final TextView y;
    private com.ss.android.ugc.aweme.follow.widet.a z;

    static {
        Covode.recordClassIndex(73091);
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
        FollowNotice followNotice = this.f113700c;
        if (followNotice != null) {
            return followNotice.getUser();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k
    public final void f() {
        super.g();
        this.f113487h.a(this.f113648j, new b(this));
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ t this$0;

        static {
            Covode.recordClassIndex(73097);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(t tVar) {
            super(0);
            this.this$0 = tVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            User user;
            t tVar = this.this$0;
            BaseNotice baseNotice = tVar.f113648j;
            String str = this.this$0.f113702e;
            String str2 = this.this$0.f113703f;
            FollowNotice followNotice = this.this$0.f113700c;
            if (followNotice != null) {
                user = followNotice.getUser();
            } else {
                user = null;
            }
            tVar.a("show", "fans", baseNotice, str, str2, user);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseNotice f113709a;

        static {
            Covode.recordClassIndex(73096);
        }

        a(BaseNotice baseNotice) {
            this.f113709a = baseNotice;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.e
        public final void a(FollowStatus followStatus) {
            l.b(followStatus, "");
            if (followStatus.followStatus == 0) {
                d a2 = new d().a("enter_from", "notification_page");
                FollowNotice followNotice = this.f113709a.followNotice;
                l.b(followNotice, "");
                User user = followNotice.getUser();
                l.b(user, "");
                r.a("follow_cancel_finish", a2.a("to_user_id", user.getUid()).f66730a);
                return;
            }
            d a3 = new d().a("enter_from", "notification_page");
            FollowNotice followNotice2 = this.f113709a.followNotice;
            l.b(followNotice2, "");
            User user2 = followNotice2.getUser();
            l.b(user2, "");
            r.a("follow_finish", a3.a("to_user_id", user2.getUid()).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.h.p
    public final void c(int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("from_where", i2);
        bundle.putString("username", this.x.getText().toString());
        FollowNotice followNotice = this.f113700c;
        if (followNotice != null) {
            User user = followNotice.getUser();
            l.b(user, "");
            UrlModel avatarThumb = user.getAvatarThumb();
            bundle.putString("content", this.f113647i.getString(R.string.dkb));
            bundle.putSerializable("avatar_thumb", avatarThumb);
        }
        this.n = bundle;
        this.f113674m = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.cxx);
        l.b(findViewById, "");
        this.v = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        l.b(findViewById2, "");
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) findViewById2;
        this.w = avatarImageWithVerify;
        View findViewById3 = view.findViewById(R.id.cxm);
        l.b(findViewById3, "");
        TextView textView = (TextView) findViewById3;
        this.x = textView;
        View findViewById4 = view.findViewById(R.id.cwx);
        l.b(findViewById4, "");
        this.y = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cww);
        l.b(findViewById5, "");
        NotificationFollowUserBtn notificationFollowUserBtn = (NotificationFollowUserBtn) findViewById5;
        this.f113699b = notificationFollowUserBtn;
        notificationFollowUserBtn.getLayoutParams().width = g.a(this.f113647i);
        j.b(findViewById);
        com.ss.android.ugc.aweme.notification.g.a.a(avatarImageWithVerify);
        com.ss.android.ugc.aweme.notification.g.a.a(notificationFollowUserBtn);
        notificationFollowUserBtn.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageWithVerify.setOnClickListener(this);
        textView.setOnClickListener(this);
        avatarImageWithVerify.setRequestImgSize(em.a(101));
        com.ss.android.ugc.aweme.follow.widet.a aVar = new com.ss.android.ugc.aweme.follow.widet.a(notificationFollowUserBtn, new a.g(this) {
            /* class com.ss.android.ugc.aweme.notification.h.t.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ t f113704a;

            static {
                Covode.recordClassIndex(73092);
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
            public final String getEnterFrom() {
                return "notification_page";
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f113704a = r1;
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
            public final void a(int i2, User user) {
                String str;
                Intent intent;
                String str2;
                super.a(i2, user);
                c.a(new com.ss.android.ugc.aweme.challenge.d.c(i2, user));
                if (user != null) {
                    int i3 = 0;
                    if (i2 == 0) {
                        str = "follow_cancel";
                    } else {
                        Context context = this.f113704a.f113647i;
                        l.b(context, "");
                        FollowNotice followNotice = this.f113704a.f113700c;
                        l.d(context, "");
                        if ((context instanceof Activity) && followNotice != null && (intent = ((Activity) context).getIntent()) != null && intent.getBooleanExtra("from_notification", false)) {
                            String a2 = j.a(intent, "rule_id");
                            if (a2 == null) {
                                a2 = "";
                            }
                            l.b(a2, "");
                            if (!TextUtils.isEmpty(a2)) {
                                LogHelper a3 = LogHelperImpl.a();
                                User user2 = followNotice.getUser();
                                l.b(user2, "");
                                String uid = user2.getUid();
                                l.b(uid, "");
                                a3.a("follow_from_push", "message", uid, "previous_page", "other_places", a2);
                            }
                        }
                        str = "follow";
                    }
                    if (user.getFollowerStatus() == 1) {
                        str2 = "mutual";
                    } else {
                        str2 = "single";
                    }
                    r.onEvent(new MobClick().setEventName(str).setLabelName("message").setValue(user.getUid()));
                    if (l.a((Object) str, (Object) "follow")) {
                        LogHelper a4 = LogHelperImpl.a();
                        String uid2 = user.getUid();
                        l.b(uid2, "");
                        a4.a("notification_page", "", "other_places", "follow_button", uid2, str2, user.isSecret() ? 1 : 0);
                        return;
                    }
                    d a5 = new d().a("enter_from", "message").a("to_user_id", user.getUid()).a("scene_id", "1002").a("previous_page", "message").a("enter_method", "follow_button").a("previous_page_position", "other_places").a("request_id", user.getRequestId()).a("author_id", user.getUid()).a("is_private", user.isSecret() ? 1 : 0);
                    if (user.getFollowStatus() != 4) {
                        i3 = 1;
                    }
                    r.a("follow_cancel", a5.a("cancel_type", i3).f66730a);
                }
            }
        });
        this.z = aVar;
        aVar.f96288e = new a.c(this) {
            /* class com.ss.android.ugc.aweme.notification.h.t.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ t f113705a;

            static {
                Covode.recordClassIndex(73093);
            }

            {
                this.f113705a = r1;
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.c
            public final boolean a(int i2) {
                User user;
                Context context = this.f113705a.f113647i;
                FollowNotice followNotice = this.f113705a.f113700c;
                if (followNotice != null) {
                    user = followNotice.getUser();
                } else {
                    user = null;
                }
                return h.a(context, user, null, null, null, NotificationFollowUserBtn.b(), 28);
            }
        };
        com.ss.android.ugc.aweme.follow.widet.a aVar2 = this.z;
        if (aVar2 != null) {
            aVar2.f96287d = new a.d(this) {
                /* class com.ss.android.ugc.aweme.notification.h.t.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ t f113706a;

                static {
                    Covode.recordClassIndex(73094);
                }

                @Override // com.ss.android.ugc.aweme.follow.widet.a.d
                public final void b() {
                    this.f113706a.f113698a = false;
                }

                @Override // com.ss.android.ugc.aweme.follow.widet.a.d
                public final void a() {
                    User user;
                    this.f113706a.f113698a = true;
                    t tVar = this.f113706a;
                    int layoutPosition = tVar.getLayoutPosition();
                    FollowNotice followNotice = this.f113706a.f113700c;
                    if (followNotice != null) {
                        user = followNotice.getUser();
                    } else {
                        user = null;
                    }
                    tVar.a("fans", layoutPosition, i.a(null, user));
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f113706a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.notification.h.t$3$a */
                public static final class a implements com.ss.android.ugc.aweme.im.service.h.a {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ IIMService f113707a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass3 f113708b;

                    static {
                        Covode.recordClassIndex(73095);
                    }

                    @Override // com.ss.android.ugc.aweme.im.service.h.a
                    public final void a(int i2) {
                        if (i2 != 3) {
                            IIMService iIMService = this.f113707a;
                            Context context = this.f113708b.f113706a.f113647i;
                            l.b(context, "");
                            iIMService.openSessionListActivity(context);
                        }
                    }

                    a(IIMService iIMService, AnonymousClass3 r2) {
                        this.f113707a = iIMService;
                        this.f113708b = r2;
                    }
                }

                @Override // com.ss.android.ugc.aweme.follow.widet.a.d
                public final void a(FollowStatus followStatus) {
                    User user;
                    androidx.fragment.app.i supportFragmentManager;
                    com.ss.android.ugc.aweme.friends.service.a aVar = com.ss.android.ugc.aweme.friends.service.a.f97047a;
                    FollowNotice followNotice = this.f113706a.f113700c;
                    e eVar = null;
                    if (followNotice != null) {
                        user = followNotice.getUser();
                    } else {
                        user = null;
                    }
                    if (aVar.a(user)) {
                        com.ss.android.ugc.aweme.friends.service.a aVar2 = com.ss.android.ugc.aweme.friends.service.a.f97047a;
                        Context context = this.f113706a.f113647i;
                        l.b(context, "");
                        aVar2.a(3, "notification_page", "follow", context);
                    }
                    if (followStatus != null) {
                        if (this.f113706a.f113698a && followStatus.followStatus == 2) {
                            Context context2 = this.f113706a.f113647i;
                            if (context2 instanceof e) {
                                eVar = context2;
                            }
                            e eVar2 = eVar;
                            if (!(eVar2 == null || (supportFragmentManager = eVar2.getSupportFragmentManager()) == null)) {
                                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                                createIIMServicebyMonsterPlugin.tryShowingChatPrivacyPanel("notification_page", supportFragmentManager, new a(createIIMServicebyMonsterPlugin, this));
                            }
                        }
                        IMService.createIIMServicebyMonsterPlugin(false).storeFollowStatus(followStatus);
                    }
                    this.f113706a.f113698a = false;
                }
            };
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
        User user;
        Integer valueOf;
        int i2;
        boolean z2;
        ClickAgent.onClick(view);
        com.bytedance.ies.ugc.appcontext.d.a();
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107229h = h();
        }
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
            View view2 = this.itemView;
            l.b(view2, "");
            new com.bytedance.tux.g.b(view2).e(R.string.de8).b();
            return;
        }
        FollowNotice followNotice = this.f113700c;
        if (followNotice != null && (user = followNotice.getUser()) != null) {
            a("click", "fans", this.f113701d, this.f113702e, this.f113703f, user);
            if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
                if (valueOf.intValue() == R.id.cxx || valueOf.intValue() == R.id.cx6) {
                    if (this.f113674m) {
                        n.a(this.n, getAdapterPosition());
                    }
                    String uid = user.getUid();
                    l.b(uid, "");
                    String secUid = user.getSecUid();
                    l.b(secUid, "");
                    p.a.a(uid, secUid, false, null, null, 56);
                    Context context = this.f113647i;
                    l.b(context, "");
                    BaseNotice baseNotice = this.f113701d;
                    if (baseNotice != null) {
                        i2 = baseNotice.clientOrder;
                    } else {
                        i2 = -1;
                    }
                    j.a(context, "fans", i2);
                } else if (valueOf.intValue() == R.id.cww) {
                    int a2 = a(user);
                    com.ss.android.ugc.aweme.follow.widet.a aVar = this.z;
                    if (aVar != null) {
                        String uid2 = user.getUid();
                        String secUid2 = user.getSecUid();
                        int followerStatus = user.getFollowerStatus();
                        if (user.isSecret() || user.isPrivateAccount()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        aVar.a(uid2, secUid2, a2, followerStatus, z2);
                    }
                    c.a(new com.ss.android.ugc.aweme.challenge.d.c(a2, user));
                } else if (valueOf.intValue() == R.id.cxm && this.f113674m) {
                    n.a(this.n, getAdapterPosition());
                }
            }
        }
    }

    public final void a(BaseNotice baseNotice, String str, String str2) {
        User user;
        l.d(baseNotice, "");
        l.d(str2, "");
        if (baseNotice.followNotice != null) {
            this.f113701d = baseNotice;
            this.f113702e = str;
            this.f113703f = str2;
            this.f113700c = baseNotice.followNotice;
            com.ss.android.ugc.aweme.follow.widet.a aVar = this.z;
            if (aVar != null) {
                aVar.f96289f = new a(baseNotice);
            }
            FollowNotice followNotice = this.f113700c;
            if (!(followNotice == null || (user = followNotice.getUser()) == null)) {
                this.w.setUserData(new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
                this.w.a();
                a(this.x, user, this.f113701d, str, str2);
                this.f113699b.a(user.getFollowStatus(), user.getFollowerStatus(), user.getUid());
                com.ss.android.ugc.aweme.follow.widet.a aVar2 = this.z;
                if (aVar2 != null) {
                    aVar2.a(user);
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f113647i.getString(R.string.dkb));
            a(spannableStringBuilder, baseNotice);
            this.y.setText(spannableStringBuilder);
            w.a(this);
        }
    }
}
