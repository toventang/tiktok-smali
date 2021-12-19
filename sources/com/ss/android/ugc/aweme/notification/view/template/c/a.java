package com.ss.android.ugc.aweme.notification.view.template.c;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateBottomButton;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;

public final class a implements com.ss.android.ugc.aweme.notification.view.template.a {
    static {
        Covode.recordClassIndex(73309);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.view.template.c.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC2920a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNotice f114012a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.notice.repo.a.a f114013b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NoticeTemplateBottomButton f114014c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.notification.view.template.b f114015d;

        /* renamed from: com.ss.android.ugc.aweme.notification.view.template.c.a$a$b */
        static final class b<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            public static final b f114017a = new b();

            static {
                Covode.recordClassIndex(73312);
            }

            b() {
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(73310);
        }

        View$OnClickListenerC2920a(MusNotice musNotice, com.ss.android.ugc.aweme.notice.repo.a.a aVar, NoticeTemplateBottomButton noticeTemplateBottomButton, com.ss.android.ugc.aweme.notification.view.template.b bVar) {
            this.f114012a = musNotice;
            this.f114013b = aVar;
            this.f114014c = noticeTemplateBottomButton;
            this.f114015d = bVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.view.template.c.a$a$a  reason: collision with other inner class name */
        static final class C2921a implements f.a.d.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ View$OnClickListenerC2920a f114016a;

            static {
                Covode.recordClassIndex(73311);
            }

            C2921a(View$OnClickListenerC2920a aVar) {
                this.f114016a = aVar;
            }

            @Override // f.a.d.a
            public final void a() {
                new com.bytedance.tux.g.b(this.f114016a.f114014c).e(R.string.cwf).b();
            }
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            User d2 = com.ss.android.ugc.aweme.notification.view.template.b.a.d(this.f114012a);
            if (d2 == null || (str = d2.getUid()) == null) {
                str = "";
            }
            String c2 = com.ss.android.ugc.aweme.notification.view.template.b.a.c(this.f114012a);
            if (c2 == null) {
                c2 = "";
            }
            l.d(str, "");
            l.d(c2, "");
            r.a("click_ignore", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "message").a("account_type", c2).a("to_user_id", str).f66730a);
            com.ss.android.ugc.aweme.notice.repo.a.a aVar = this.f114013b;
            if (aVar != null) {
                MusNotificationApiManager.f113215a.ignoreLinkNotice(aVar.f112782b).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new C2921a(this), b.f114017a);
            }
            this.f114015d.a();
        }
    }

    public static final class b implements a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NoticeTemplateBottomButton f114018a;

        static {
            Covode.recordClassIndex(73313);
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void b() {
        }

        b(NoticeTemplateBottomButton noticeTemplateBottomButton) {
            this.f114018a = noticeTemplateBottomButton;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a(FollowStatus followStatus) {
            if (followStatus != null) {
                this.f114018a.a(followStatus.followStatus, followStatus.followerStatus);
            }
        }
    }

    public static final class d extends a.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusNotice f114023a;

        static {
            Covode.recordClassIndex(73317);
        }

        d(MusNotice musNotice) {
            this.f114023a = musNotice;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
        public final void a(int i2, User user) {
            super.a(i2, user);
            String c2 = com.ss.android.ugc.aweme.notification.view.template.b.a.c(this.f114023a);
            if (c2 == null) {
                c2 = "";
            }
            l.d(c2, "");
            if (user != null) {
                r.a("follow", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "message").a("rec_type", user.getRecType()).a("rec_uid", user.getUid()).a("to_user_id", user.getUid()).a("req_id", user.getRequestId()).a("account_type", c2).a("enter_method", "follow_button").f66730a);
            }
        }
    }

    static final class c implements a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NoticeTemplateBottomButton f114019a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.notification.view.template.b f114020b;

        static {
            Covode.recordClassIndex(73314);
        }

        c(NoticeTemplateBottomButton noticeTemplateBottomButton, com.ss.android.ugc.aweme.notification.view.template.b bVar) {
            this.f114019a = noticeTemplateBottomButton;
            this.f114020b = bVar;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.e
        public final void a(FollowStatus followStatus) {
            if (followStatus == null || followStatus.followStatus != 4) {
                this.f114019a.postDelayed(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.notification.view.template.c.a.c.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f114022a;

                    static {
                        Covode.recordClassIndex(73316);
                    }

                    {
                        this.f114022a = r1;
                    }

                    public final void run() {
                        this.f114022a.f114020b.b();
                    }
                }, 200);
            } else {
                this.f114019a.postDelayed(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.notification.view.template.c.a.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f114021a;

                    static {
                        Covode.recordClassIndex(73315);
                    }

                    {
                        this.f114021a = r1;
                    }

                    public final void run() {
                        this.f114021a.f114020b.b();
                    }
                }, 500);
            }
            l.b(followStatus, "");
            String str = followStatus.userId;
            l.b(str, "");
            int i2 = followStatus.followStatus;
            l.d("notification_page", "");
            l.d(str, "");
            if (i2 == 0) {
                r.a("follow_cancel_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "notification_page").a("to_user_id", str).f66730a);
            } else {
                r.a("follow_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "notification_page").a("to_user_id", str).f66730a);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.a
    public final void a(MusNotice musNotice, com.ss.android.ugc.aweme.notification.view.template.b bVar) {
        l.d(musNotice, "");
        l.d(bVar, "");
        NoticeTemplateBottomButton positiveButton = bVar.getPositiveButton();
        com.ss.android.ugc.aweme.follow.widet.a aVar = new com.ss.android.ugc.aweme.follow.widet.a(positiveButton, new d(musNotice));
        User d2 = com.ss.android.ugc.aweme.notification.view.template.b.a.d(musNotice);
        if (d2 != null) {
            aVar.a(d2);
        }
        aVar.f96287d = new b(positiveButton);
        aVar.f96289f = new c(positiveButton, bVar);
        NoticeTemplateBottomButton negativeButton = bVar.getNegativeButton();
        negativeButton.setOnClickListener(new View$OnClickListenerC2920a(musNotice, com.ss.android.ugc.aweme.notification.view.template.b.a.a(musNotice), negativeButton, bVar));
        negativeButton.setText(R.string.cwg);
        negativeButton.setButtonVariant(1);
    }
}
