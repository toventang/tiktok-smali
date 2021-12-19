package com.ss.android.ugc.aweme.notification.followrequest.b;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.f.y;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.friends.ui.TikTokFollowUserBtn;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.ss.android.ugc.aweme.notification.adapter.j;
import com.ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import com.ss.android.ugc.aweme.notification.h.k;
import com.ss.android.ugc.aweme.notification.h.w;
import com.ss.android.ugc.aweme.notification.utils.c;
import com.ss.android.ugc.aweme.notification.utils.g;
import com.ss.android.ugc.aweme.notification.utils.h;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.hl;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class b extends w implements a.d {
    private final SmartImageView A;

    /* renamed from: a  reason: collision with root package name */
    public User f113458a;

    /* renamed from: b  reason: collision with root package name */
    public final TuxTextView f113459b;

    /* renamed from: c  reason: collision with root package name */
    public final TikTokFollowUserBtn f113460c;

    /* renamed from: d  reason: collision with root package name */
    public String f113461d = "follow_request_page";

    /* renamed from: e  reason: collision with root package name */
    public final j f113462e;

    /* renamed from: f  reason: collision with root package name */
    public final c f113463f;
    private com.ss.android.ugc.aweme.follow.widet.a v;
    private final com.ss.android.ugc.aweme.following.ui.view.a w;
    private final View x;
    private final View y;
    private final TuxTextView z;

    static {
        Covode.recordClassIndex(72956);
    }

    @Override // com.ss.android.ugc.aweme.follow.widet.a.d
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.follow.widet.a.d
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.notification.h.w
    public final User c() {
        return this.f113458a;
    }

    private final void h() {
        ViewGroup.LayoutParams buttonLayoutParams = this.f113460c.getButtonLayoutParams();
        View view = this.itemView;
        l.b(view, "");
        buttonLayoutParams.width = h.g.a.a(n.b(view.getContext(), 80.0f));
        View view2 = this.itemView;
        l.b(view2, "");
        buttonLayoutParams.height = h.g.a.a(n.b(view2.getContext(), 28.0f));
        if (l.a((Object) this.f113461d, (Object) "notification_page")) {
            buttonLayoutParams.width = g.a(this.f113647i);
        }
        this.f113460c.setButtonLayoutParams(buttonLayoutParams);
        this.f113460c.setButtonHorizontalPadding(6);
    }

    @Override // com.ss.android.ugc.aweme.follow.widet.a.d
    public final void a(FollowStatus followStatus) {
        if (followStatus != null) {
            IMService.createIIMServicebyMonsterPlugin(false).storeFollowStatus(followStatus);
        }
    }

    private static boolean b(User user) {
        if (user.getFollowFrom() != 29 || !hl.a(user.getFollowFromMsg())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final class a implements a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f113471a;

        static {
            Covode.recordClassIndex(72964);
        }

        a(b bVar) {
            this.f113471a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.c
        public final boolean a(int i2) {
            View view = this.f113471a.itemView;
            l.b(view, "");
            return h.a(view.getContext(), this.f113471a.f113458a, null, null, this.f113471a.f113461d, TikTokFollowUserBtn.b(), 12);
        }
    }

    public final void a(boolean z2, User user) {
        if (z2) {
            this.x.setVisibility(8);
            this.y.setVisibility(8);
            this.f113460c.setVisibility(0);
            user.setFollowerStatus(1);
            h();
            if (user.getFollowStatus() == 1) {
                user.setFollowStatus(2);
            }
            com.ss.android.ugc.aweme.follow.widet.a aVar = this.v;
            if (aVar != null) {
                aVar.a(user);
            }
            com.ss.android.ugc.aweme.follow.widet.a aVar2 = this.v;
            if (aVar2 != null) {
                aVar2.f96288e = new a(this);
                return;
            }
            return;
        }
        this.x.setVisibility(0);
        this.y.setVisibility(0);
        this.f113460c.setVisibility(8);
    }

    public final void a(User user, String str) {
        l.d(user, "");
        l.d(str, "");
        this.f113458a = user;
        this.f113461d = str;
        if (user.getFollowerStatus() == 1) {
            a(true, user);
        } else {
            a(false, user);
        }
        this.z.setText(in.b(user));
        if (b(user)) {
            TuxTextView tuxTextView = this.f113459b;
            tuxTextView.setText(user.getFollowFromMsg());
            tuxTextView.setSingleLine(false);
            tuxTextView.setMaxLines(Integer.MAX_VALUE);
        } else {
            this.f113459b.setText(user.getNickname());
        }
        View view = this.itemView;
        l.b(view, "");
        io.a(view.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.z);
        v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(user.getAvatarMedium()));
        a2.E = this.A;
        a2.f39916l = R.color.f159922f;
        e.a aVar = new e.a();
        aVar.f39827a = true;
        a2.w = aVar.a();
        a2.c();
        w.a(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view, j jVar, c cVar) {
        super(view);
        l.d(view, "");
        l.d(jVar, "");
        l.d(cVar, "");
        this.f113462e = jVar;
        this.f113463f = cVar;
        View findViewById = this.itemView.findViewById(R.id.x_);
        l.b(findViewById, "");
        com.ss.android.ugc.aweme.following.ui.view.a aVar = (com.ss.android.ugc.aweme.following.ui.view.a) findViewById;
        this.w = aVar;
        View findViewById2 = this.itemView.findViewById(R.id.x4);
        l.b(findViewById2, "");
        this.x = findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.x8);
        l.b(findViewById3, "");
        this.y = findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.f_d);
        l.b(findViewById4, "");
        this.z = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.f3g);
        l.b(findViewById5, "");
        this.f113459b = (TuxTextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.bxk);
        l.b(findViewById6, "");
        this.A = (SmartImageView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.x_);
        l.b(findViewById7, "");
        this.f113460c = (TikTokFollowUserBtn) findViewById7;
        com.ss.android.ugc.aweme.follow.widet.a aVar2 = new com.ss.android.ugc.aweme.follow.widet.a(aVar, new a.g(this) {
            /* class com.ss.android.ugc.aweme.notification.followrequest.b.b.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f113464a;

            static {
                Covode.recordClassIndex(72957);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f113464a = r1;
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
            public final void a(int i2, User user) {
                int i3;
                if (user == null) {
                    return;
                }
                if (2 == i2 || 1 == i2 || 4 == i2) {
                    String str = this.f113464a.f113461d;
                    l.d(user, "");
                    l.d(str, "");
                    com.ss.android.ugc.aweme.common.r.a("follow", new d().a("to_user_id", user.getUid()).a("enter_from", str).a("previous_page", "notification_page").a("is_private", user.isSecret() ? 1 : 0).a("follow_type", "mutual").f66730a);
                } else if (i2 == 0) {
                    if (user.getFollowStatus() == 4) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    String str2 = this.f113464a.f113461d;
                    l.d(user, "");
                    l.d(str2, "");
                    com.ss.android.ugc.aweme.common.r.a("follow_cancel", new d().a("to_user_id", user.getUid()).a("enter_from", str2).a("previous_page", "notification_page").a("is_private", user.isSecret() ? 1 : 0).a("cancel_type", i3 ^ 1).a("follow_type", "mutual").f66730a);
                }
            }
        });
        this.v = aVar2;
        aVar2.f96287d = this;
        this.itemView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.notification.followrequest.b.b.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f113465a;

            static {
                Covode.recordClassIndex(72958);
            }

            {
                this.f113465a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                User user = this.f113465a.f113458a;
                if (user != null) {
                    t a2 = t.a();
                    View view2 = this.f113465a.itemView;
                    l.b(view2, "");
                    Context context = view2.getContext();
                    Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                    t.a(a2, (Activity) context, u.a("aweme://user/profile/" + user.getUid()).a("sec_user_id", user.getSecUid()).a("enter_from", "follow_request_page").a());
                    LogHelper a3 = LogHelperImpl.a();
                    String str = this.f113465a.f113461d;
                    String uid = user.getUid();
                    l.b(uid, "");
                    a3.a(str, uid, "click_card");
                }
            }
        });
        this.itemView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.ss.android.ugc.aweme.notification.followrequest.b.b.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f113466a;

            static {
                Covode.recordClassIndex(72959);
            }

            public final void onViewDetachedFromWindow(View view) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f113466a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                if (this.f113466a.f113458a != null) {
                    c cVar = this.f113466a.f113463f;
                    User user = this.f113466a.f113458a;
                    if (user == null) {
                        l.b();
                    }
                    String uid = user.getUid();
                    l.b(uid, "");
                    String str = this.f113466a.f113461d;
                    l.d(uid, "");
                    l.d(str, "");
                    if (!cVar.f113871a.contains(uid)) {
                        cVar.f113871a.add(uid);
                        com.ss.android.ugc.aweme.common.r.a("follow_request_message", new d().a("user_id", uid).a("enter_from", str).f66730a);
                    }
                }
            }
        });
        findViewById3.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.notification.followrequest.b.b.AnonymousClass4 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f113467a;

            static {
                Covode.recordClassIndex(72960);
            }

            {
                this.f113467a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                User user = this.f113467a.f113458a;
                if (user != null && this.f113467a.getAbsoluteAdapterPosition() >= 0) {
                    this.f113467a.f113462e.d(this.f113467a.getAbsoluteAdapterPosition());
                    FollowRequestApiManager.a(new WeakHandler(AnonymousClass1.f113468a), user.getUid());
                    LogHelper a2 = LogHelperImpl.a();
                    String str = this.f113467a.f113461d;
                    String uid = user.getUid();
                    l.b(uid, "");
                    a2.d(str, uid);
                }
            }
        });
        findViewById2.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.notification.followrequest.b.b.AnonymousClass5 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f113469a;

            static {
                Covode.recordClassIndex(72962);
            }

            {
                this.f113469a = r1;
            }

            public final void onClick(View view) {
                String str;
                ClickAgent.onClick(view);
                User user = this.f113469a.f113458a;
                if (user != null && this.f113469a.getAbsoluteAdapterPosition() >= 0) {
                    this.f113469a.a(true, user);
                    if (l.a((Object) this.f113469a.f113461d, (Object) "notification_page")) {
                        TuxTextView tuxTextView = this.f113469a.f113459b;
                        a.C0730a aVar = new a.C0730a();
                        String a2 = y.a((int) R.string.dkb);
                        if (a2 == null) {
                            a2 = "";
                        }
                        a.C0730a b2 = aVar.b(a2);
                        String a3 = k.a(System.currentTimeMillis() / 1000, this.f113469a.f113647i);
                        l.b(a3, "");
                        tuxTextView.setText(b2.a(a3).f33382a.toString());
                    }
                    FollowRequestApiManager.a(new WeakHandler(AnonymousClass1.f113470a), user.getUid(), com.ss.android.ugc.aweme.inbox.b.c.i() ? 1 : 0);
                    d a4 = new d().a("to_user_id", user.getUid()).a("enter_from", this.f113469a.f113461d);
                    if (user.getFollowStatus() == 1) {
                        str = "mutual";
                    } else {
                        str = "single";
                    }
                    com.ss.android.ugc.aweme.common.r.a("follow_approve", a4.a("follow_type", str).f66730a);
                }
            }
        });
    }
}
