package com.ss.android.ugc.aweme.question.c;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.ss.android.ugc.aweme.question.c;
import com.ss.android.ugc.aweme.question.d;
import com.ss.android.ugc.aweme.question.model.QuestionDetailParam;
import com.ss.android.ugc.aweme.views.MultiAvatarView;
import h.a.z;
import h.f.b.l;
import h.g.a;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public c f119924a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.question.h.a.c f119925b;

    /* renamed from: c  reason: collision with root package name */
    public final IQAInvitationService f119926c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f119927d;

    /* renamed from: e  reason: collision with root package name */
    public final Activity f119928e;

    /* renamed from: f  reason: collision with root package name */
    public final View f119929f;

    /* renamed from: g  reason: collision with root package name */
    public final MultiAvatarView f119930g;

    /* renamed from: h  reason: collision with root package name */
    private final QuestionDetailParam f119931h;

    static {
        Covode.recordClassIndex(77915);
    }

    public static final /* synthetic */ c a(b bVar) {
        c cVar = bVar.f119924a;
        if (cVar == null) {
            l.a("mData");
        }
        return cVar;
    }

    public b(Activity activity, View view, MultiAvatarView multiAvatarView, QuestionDetailParam questionDetailParam) {
        l.d(activity, "");
        l.d(view, "");
        l.d(multiAvatarView, "");
        this.f119928e = activity;
        this.f119929f = view;
        this.f119930g = multiAvatarView;
        this.f119931h = questionDetailParam;
        IQAInvitationService b2 = QAInvitationService.b();
        l.b(b2, "");
        this.f119926c = b2;
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        int a2 = a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        multiAvatarView.a(a2, a.a(TypedValue.applyDimension(1, 13.5f, system2.getDisplayMetrics())));
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.question.c.b.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f119932a;

            static {
                Covode.recordClassIndex(77916);
            }

            {
                this.f119932a = r1;
            }

            public final void onClick(View view) {
                long j2;
                List<User> list;
                String uid;
                List<User> inviterList;
                String str;
                List<User> inviterList2;
                User user;
                List<User> inviterList3;
                User user2;
                List<User> inviterList4;
                ClickAgent.onClick(view);
                if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                    d inviteInfo = b.a(this.f119932a).getInviteInfo();
                    if (inviteInfo == null || (inviterList4 = inviteInfo.getInviterList()) == null || !inviterList4.isEmpty()) {
                        d inviteInfo2 = b.a(this.f119932a).getInviteInfo();
                        if (inviteInfo2 == null || (inviterList = inviteInfo2.getInviterList()) == null || inviterList.size() != 1) {
                            try {
                                IQAInvitationService iQAInvitationService = this.f119932a.f119926c;
                                Activity activity = this.f119932a.f119928e;
                                com.ss.android.ugc.aweme.question.h.a.c cVar = this.f119932a.f119925b;
                                if (cVar == null) {
                                    l.a("mHeaderParam");
                                }
                                String str2 = cVar.f119992d;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                Long id = b.a(this.f119932a).getId();
                                long j3 = 0;
                                if (id != null) {
                                    j2 = id.longValue();
                                } else {
                                    j2 = 0;
                                }
                                User creator = b.a(this.f119932a).getCreator();
                                if (!(creator == null || (uid = creator.getUid()) == null)) {
                                    j3 = Long.parseLong(uid);
                                }
                                d inviteInfo3 = b.a(this.f119932a).getInviteInfo();
                                if (inviteInfo3 == null || (list = inviteInfo3.getInviterList()) == null) {
                                    list = z.INSTANCE;
                                }
                                iQAInvitationService.a(activity, "click_invitation", str2, j2, j3, list);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        } else {
                            SmartRoute buildRoute = SmartRouter.buildRoute(com.bytedance.ies.ugc.appcontext.d.a(), "aweme://user/profile/");
                            d inviteInfo4 = b.a(this.f119932a).getInviteInfo();
                            String str3 = null;
                            if (inviteInfo4 == null || (inviterList3 = inviteInfo4.getInviterList()) == null || (user2 = inviterList3.get(0)) == null) {
                                str = null;
                            } else {
                                str = user2.getUid();
                            }
                            SmartRoute withParam = buildRoute.withParam("uid", str);
                            d inviteInfo5 = b.a(this.f119932a).getInviteInfo();
                            if (!(inviteInfo5 == null || (inviterList2 = inviteInfo5.getInviterList()) == null || (user = inviterList2.get(0)) == null)) {
                                str3 = user.getSecUid();
                            }
                            withParam.withParam("sec_user_id", str3).withParam("enter_from", "qa_detail").open();
                        }
                    }
                }
            }
        });
    }
}
