package com.ss.android.ugc.aweme.notification.view.template;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.ui.SmartRoundImageView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.metrics.v;
import com.ss.android.ugc.aweme.notice.repo.list.a.c;
import com.ss.android.ugc.aweme.notice.repo.list.a.f;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.e;
import com.ss.android.ugc.aweme.notification.utils.g;
import com.ss.android.ugc.aweme.notification.utils.h;
import com.ss.android.ugc.aweme.notification.utils.i;
import com.ss.android.ugc.aweme.notification.view.NotificationFollowUserBtn;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.q;
import h.z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

public final class NoticeTemplateRightView extends g {

    /* renamed from: a  reason: collision with root package name */
    private a f114001a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f114002b;

    static {
        Covode.recordClassIndex(73298);
    }

    public NoticeTemplateRightView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.g
    public final View a(int i2) {
        if (this.f114002b == null) {
            this.f114002b = new SparseArray();
        }
        View view = (View) this.f114002b.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f114002b.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.g
    public final h getTemplatePosition() {
        return h.Right;
    }

    public final User a() {
        c cVar;
        f fVar;
        List<User> list;
        e templateNotice = getTemplateNotice();
        if (templateNotice == null || (cVar = templateNotice.f112844b) == null || (fVar = cVar.f112805d) == null || (list = fVar.f112824a) == null) {
            return null;
        }
        return (User) n.h((List) list);
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.g
    public final String b(View view) {
        Integer valueOf;
        e templateNotice;
        c cVar;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null || ((valueOf.intValue() != R.id.cww && valueOf.intValue() != R.id.dnj && valueOf.intValue() != R.id.cws) || (templateNotice = getTemplateNotice()) == null || (cVar = templateNotice.f112844b) == null)) {
            return null;
        }
        return cVar.o;
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.g
    public final boolean a(View view) {
        Integer valueOf;
        String b2;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null) {
            return false;
        }
        if ((valueOf.intValue() != R.id.cww && valueOf.intValue() != R.id.dnj && valueOf.intValue() != R.id.cws) || (b2 = b(view)) == null) {
            return false;
        }
        a(b2);
        return true;
    }

    public final void a(int i2, String str) {
        String str2;
        MusNotice mBaseNotice = getMBaseNotice();
        String str3 = null;
        if (mBaseNotice == null || (str2 = mBaseNotice.templateId) == null) {
            str2 = "";
        }
        d a2 = new d().a("action_type", "click");
        com.ss.android.ugc.aweme.notification.h.a.a mBridge = getMBridge();
        if (mBridge != null) {
            str3 = mBridge.q();
        }
        d a3 = a2.a("account_type", str3).a("client_order", String.valueOf(i2)).a("template_id", str2);
        if (!TextUtils.isEmpty(str)) {
            a3.a("button_type", str);
        }
        r.a("notification_message_inner_message", a3.f66730a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f4, code lost:
        if (com.ss.android.ugc.aweme.notice.api.b.c(r3.intValue()) != false) goto L_0x01f6;
     */
    @Override // com.ss.android.ugc.aweme.notification.view.template.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r14, com.ss.android.ugc.aweme.notification.h.a.a r15) {
        /*
        // Method dump skipped, instructions count: 635
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateRightView.a(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice, com.ss.android.ugc.aweme.notification.h.a.a):void");
    }

    private /* synthetic */ NoticeTemplateRightView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private NoticeTemplateRightView(final Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        com.a.a(LayoutInflater.from(context), R.layout.l9, this, true);
        DmtButton dmtButton = (DmtButton) a(R.id.cww);
        l.b(dmtButton, "");
        dmtButton.getLayoutParams().width = g.a(context);
        NotificationFollowUserBtn notificationFollowUserBtn = (NotificationFollowUserBtn) a(R.id.cx5);
        l.b(notificationFollowUserBtn, "");
        notificationFollowUserBtn.getLayoutParams().width = g.a(context);
        com.ss.android.ugc.aweme.notification.g.a.a(a(R.id.cx5));
        ((DmtButton) a(R.id.cww)).setOnClickListener(this);
        ((SmartRoundImageView) a(R.id.dnj)).setOnClickListener(this);
        ((ConstraintLayout) a(R.id.cws)).setOnClickListener(this);
        a aVar = new a((FollowUserBtn) a(R.id.cx5), new a.g(this) {
            /* class com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateRightView.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ NoticeTemplateRightView f114003a;

            static {
                Covode.recordClassIndex(73299);
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
            public final String getEnterFrom() {
                this.f114003a.getMBaseNotice();
                return "notification_page";
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f114003a = r1;
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
            public final void a(int i2, User user) {
                String str;
                String str2;
                JSONObject jSONObject;
                int i3;
                e eVar;
                String str3;
                super.a(i2, user);
                if (user != null) {
                    if (i2 == 0) {
                        str = "follow_cancel";
                    } else {
                        str = "follow";
                    }
                    if (user.getFollowerStatus() == 1) {
                        str2 = "mutual";
                    } else {
                        str2 = "single";
                    }
                    r.onEvent(new MobClick().setEventName(str).setLabelName("message").setValue(user.getUid()));
                    u a2 = new u().a("notification_page");
                    a2.f109596a = u.c.INBOX_NOTICE;
                    u a3 = a2.a(user);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    MusNotice mBaseNotice = this.f114003a.getMBaseNotice();
                    if (mBaseNotice == null || (eVar = mBaseNotice.templateNotice) == null || (str3 = eVar.f112851i) == null) {
                        jSONObject = new JSONObject();
                    } else {
                        jSONObject = new JSONObject(str3);
                    }
                    Iterator<String> keys = jSONObject.keys();
                    l.b(keys, "");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        try {
                            if (l.a((Object) next, (Object) "business_extra")) {
                                JSONObject jSONObject2 = new JSONObject(jSONObject.optString(next));
                                Iterator<String> keys2 = jSONObject2.keys();
                                l.b(keys2, "");
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    l.b(next2, "");
                                    String optString = jSONObject2.optString(next2);
                                    l.b(optString, "");
                                    linkedHashMap.put(next2, optString);
                                }
                            } else if (!linkedHashMap.containsKey(next)) {
                                l.b(next, "");
                                String optString2 = jSONObject.optString(next);
                                l.b(optString2, "");
                                linkedHashMap.put(next, optString2);
                            }
                            q.m223constructorimpl(z.f158842a);
                        } catch (Throwable th) {
                            q.m223constructorimpl(h.r.a(th));
                        }
                    }
                    a3.a(linkedHashMap);
                    String str4 = null;
                    if (l.a((Object) str, (Object) "follow")) {
                        v a4 = new v().a("notification_page");
                        a4.f109605b = "";
                        a4.f109606c = "other_places";
                        a4.s = "follow_button";
                        a4.f109608e = user.getUid();
                        a4.v = str2;
                        com.ss.android.ugc.aweme.notification.h.a.a mBridge = this.f114003a.getMBridge();
                        if (mBridge != null) {
                            str4 = mBridge.q();
                        }
                        a4.ag = str4;
                        a4.aa = user.isSecret() ? 1 : 0;
                        a4.ac = new AwemeRelationRecommendModel(0, "", user.getRecType(), user.getFriendTypeStr());
                        a4.f();
                        MusNotice mBaseNotice2 = this.f114003a.getMBaseNotice();
                        if (mBaseNotice2 != null && mBaseNotice2.type == 225) {
                            a3.f109597b = u.a.FOLLOW;
                            a3.f();
                            return;
                        }
                        return;
                    }
                    d a5 = new d().a("enter_from", "notification_page").a("to_user_id", user.getUid()).a("scene_id", "1002").a("previous_page", "message").a("enter_method", "follow_button").a("previous_page_position", "other_places").a("request_id", user.getRequestId()).a("author_id", user.getUid()).a("is_private", user.isSecret() ? 1 : 0);
                    if (user.getFollowStatus() == 4) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                    d a6 = a5.a("cancel_type", i3);
                    com.ss.android.ugc.aweme.notification.h.a.a mBridge2 = this.f114003a.getMBridge();
                    if (mBridge2 != null) {
                        str4 = mBridge2.q();
                    }
                    r.a("follow_cancel", a6.a("account_type", str4).f66730a);
                    MusNotice mBaseNotice3 = this.f114003a.getMBaseNotice();
                    if (mBaseNotice3 != null && mBaseNotice3.type == 225) {
                        a3.f109597b = u.a.FOLLOW_CANCEL;
                        a3.f();
                    }
                }
            }
        });
        this.f114001a = aVar;
        aVar.f96288e = new a.c(this) {
            /* class com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateRightView.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ NoticeTemplateRightView f114004a;

            static {
                Covode.recordClassIndex(73300);
            }

            {
                this.f114004a = r1;
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.c
            public final boolean a(int i2) {
                NoticeTemplateRightView noticeTemplateRightView = this.f114004a;
                Context context = context;
                User a2 = noticeTemplateRightView.a();
                l.b(this.f114004a.a(R.id.cx5), "");
                return noticeTemplateRightView.a(context, a2, NotificationFollowUserBtn.b());
            }
        };
        a aVar2 = this.f114001a;
        if (aVar2 != null) {
            aVar2.f96287d = new a.d(this) {
                /* class com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateRightView.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ NoticeTemplateRightView f114006a;

                static {
                    Covode.recordClassIndex(73301);
                }

                @Override // com.ss.android.ugc.aweme.follow.widet.a.d
                public final void b() {
                }

                @Override // com.ss.android.ugc.aweme.follow.widet.a.d
                public final void a() {
                    int i2;
                    com.ss.android.ugc.aweme.notification.h.a.a mBridge = this.f114006a.getMBridge();
                    if (mBridge != null) {
                        mBridge.n();
                    }
                    NoticeTemplateRightView noticeTemplateRightView = this.f114006a;
                    com.ss.android.ugc.aweme.notification.h.a.a mBridge2 = noticeTemplateRightView.getMBridge();
                    if (mBridge2 != null) {
                        i2 = mBridge2.l();
                    } else {
                        i2 = -1;
                    }
                    noticeTemplateRightView.a(i2, i.a(context, this.f114006a.a()));
                }

                @Override // com.ss.android.ugc.aweme.follow.widet.a.d
                public final void a(FollowStatus followStatus) {
                    if (followStatus != null) {
                        IMService.createIIMServicebyMonsterPlugin(false).storeFollowStatus(followStatus);
                    }
                }

                {
                    this.f114006a = r1;
                }
            };
        }
        com.ss.android.ugc.aweme.notification.g.a.a(a(R.id.dnj));
    }

    public final boolean a(Context context, User user, boolean z) {
        MusNotice mBaseNotice;
        JSONObject jSONObject;
        e eVar;
        String str;
        boolean a2 = h.a(context, user, null, null, null, z, 28);
        if (a2 && (mBaseNotice = getMBaseNotice()) != null && mBaseNotice.type == 225) {
            com.ss.android.ugc.aweme.notification.h.a.a mBridge = getMBridge();
            if (mBridge != null) {
                mBridge.n();
            }
            u uVar = new u();
            uVar.f109597b = u.a.ENTER_CHAT;
            u a3 = uVar.a("notification_page");
            a3.f109596a = u.c.INBOX_NOTICE;
            u a4 = a3.a(user);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            MusNotice mBaseNotice2 = getMBaseNotice();
            if (mBaseNotice2 == null || (eVar = mBaseNotice2.templateNotice) == null || (str = eVar.f112851i) == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            Iterator<String> keys = jSONObject.keys();
            l.b(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (l.a((Object) next, (Object) "business_extra")) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.optString(next));
                        Iterator<String> keys2 = jSONObject2.keys();
                        l.b(keys2, "");
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            l.b(next2, "");
                            String optString = jSONObject2.optString(next2);
                            l.b(optString, "");
                            linkedHashMap.put(next2, optString);
                        }
                    } else if (!linkedHashMap.containsKey(next)) {
                        l.b(next, "");
                        String optString2 = jSONObject.optString(next);
                        l.b(optString2, "");
                        linkedHashMap.put(next, optString2);
                    }
                    q.m223constructorimpl(z.f158842a);
                } catch (Throwable th) {
                    q.m223constructorimpl(h.r.a(th));
                }
            }
            a4.a(linkedHashMap).f();
        }
        return a2;
    }
}
