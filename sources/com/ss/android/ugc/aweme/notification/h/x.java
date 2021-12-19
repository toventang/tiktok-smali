package com.ss.android.ugc.aweme.notification.h;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.notice.api.bean.j;
import com.ss.android.ugc.aweme.notice.api.bean.n;
import com.ss.android.ugc.aweme.notice.repo.list.a.f;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.e;
import com.ss.android.ugc.aweme.notice.repo.list.bean.h;
import com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.ss.android.ugc.aweme.notification.e.c;
import com.ss.android.ugc.aweme.notification.h.p;
import com.ss.android.ugc.aweme.notification.utils.i;
import com.ss.android.ugc.aweme.notification.utils.m;
import com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateBottomView;
import com.ss.android.ugc.aweme.notification.view.template.c;
import com.ss.android.ugc.aweme.notification.view.template.g;
import com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.q;
import h.r;
import h.z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class x extends w implements View.OnClickListener, com.ss.android.ugc.aweme.notification.h.a.a {

    /* renamed from: a  reason: collision with root package name */
    public NotificationDetailVM f113738a;

    /* renamed from: b  reason: collision with root package name */
    public final h.f.a.b<Integer, z> f113739b;

    /* renamed from: c  reason: collision with root package name */
    private MusNotice f113740c;

    /* renamed from: d  reason: collision with root package name */
    private String f113741d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f113742e;

    /* renamed from: f  reason: collision with root package name */
    private String f113743f;
    private int v;
    private String w;
    private List<? extends c> x;

    static {
        Covode.recordClassIndex(73115);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.notification.view.template.c>, java.util.List<com.ss.android.ugc.aweme.notification.view.template.c> */
    @Override // com.ss.android.ugc.aweme.notification.h.a.a
    public final List<c> h() {
        return this.x;
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a.a
    public final String i() {
        return this.f113743f;
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a.a
    public final String j() {
        return this.f113741d;
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a.a
    public final boolean k() {
        return this.f113742e;
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a.a
    public final int l() {
        return this.v;
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a.a
    public final String m() {
        return this.w;
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a.a
    public final View.OnLongClickListener p() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a.a
    public final void o() {
        a(m.Click);
    }

    static final class a extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(73116);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(x xVar) {
            super(0);
            this.this$0 = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a(m.Show);
            return z.f158842a;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(73117);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(x xVar) {
            super(0);
            this.this$0 = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a(m.Show);
            return z.f158842a;
        }
    }

    private final String s() {
        e eVar;
        MusNotice musNotice = this.f113740c;
        if (musNotice == null || (eVar = musNotice.templateNotice) == null) {
            return null;
        }
        return eVar.f112850h;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final boolean e() {
        e eVar;
        MusNotice musNotice = this.f113740c;
        if (musNotice == null || (eVar = musNotice.templateNotice) == null || eVar.f112852j) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a.a
    public final void r() {
        h.f.a.b<Integer, z> bVar = this.f113739b;
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(getAdapterPosition()));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.w
    public final User c() {
        e eVar;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar;
        f fVar;
        List<User> list;
        MusNotice musNotice = this.f113740c;
        if (musNotice == null || (eVar = musNotice.templateNotice) == null || (cVar = eVar.f112844b) == null || (fVar = cVar.f112805d) == null || (list = fVar.f112824a) == null || list.size() != 1) {
            return null;
        }
        return list.get(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k
    public final void f() {
        super.g();
        BaseNotificationVM baseNotificationVM = this.f113487h;
        if (baseNotificationVM != null) {
            baseNotificationVM.a(this.f113740c, new a(this));
            return;
        }
        NotificationDetailVM notificationDetailVM = this.f113738a;
        if (notificationDetailVM != null) {
            notificationDetailVM.a(this.f113740c, new b(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a.a
    public final void n() {
        e eVar;
        Object obj;
        com.ss.android.ugc.aweme.notice.repo.list.bean.a aVar;
        MusNotice musNotice = this.f113740c;
        if (musNotice != null && (eVar = musNotice.templateNotice) != null) {
            try {
                if (!(eVar.f112843a == null || (aVar = eVar.f112853k) == null || !aVar.f112830a)) {
                    Long l2 = eVar.f112843a;
                    if (l2 == null) {
                        l.b();
                    }
                    MusNotificationApiManager.a(l2.longValue(), h.NOTICE_ACTION_CLICK, eVar.f112854l);
                }
                obj = q.m223constructorimpl(z.f158842a);
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            q.m222boximpl(obj);
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a.a
    public final String q() {
        e eVar;
        Object obj;
        JSONObject jSONObject;
        e eVar2;
        String str;
        MusNotice musNotice = this.f113740c;
        if (!(musNotice == null || (eVar = musNotice.templateNotice) == null)) {
            if (eVar.n == null) {
                try {
                    MusNotice musNotice2 = this.f113740c;
                    if (musNotice2 == null || (eVar2 = musNotice2.templateNotice) == null || (str = eVar2.f112851i) == null) {
                        jSONObject = new JSONObject();
                    } else {
                        jSONObject = new JSONObject(str);
                    }
                    eVar.n = jSONObject.optString("account_type");
                    obj = q.m223constructorimpl(z.f158842a);
                } catch (Throwable th) {
                    obj = q.m223constructorimpl(r.a(th));
                }
                q.m222boximpl(obj);
            }
            String str2 = eVar.n;
            if (str2 == null) {
                return "";
            }
            return str2;
        }
        return "";
    }

    public /* synthetic */ x(View view) {
        this(view, null);
    }

    @Override // com.ss.android.ugc.aweme.notification.h.p
    public final void a(View view) {
        l.d(view, "");
        n();
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a.a
    public final void d(int i2) {
        com.ss.android.ugc.aweme.notice.api.bean.c cVar;
        j e2 = com.ss.android.ugc.aweme.notification.redpoint.f.e(i2);
        if (e2 != null) {
            cVar = e2.f112691a;
        } else {
            cVar = null;
        }
        if (cVar == com.ss.android.ugc.aweme.notice.api.bean.c.AfterClick) {
            if (com.ss.android.ugc.aweme.notice.api.b.c(i2)) {
                com.ss.android.ugc.aweme.notice.api.b.d(i2);
                com.ss.android.ugc.d.a.c.a(new n());
            }
        }
    }

    private void b(m mVar) {
        u.a aVar;
        User user;
        JSONObject jSONObject;
        String str;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar;
        f fVar;
        List<User> list;
        l.d(mVar, "");
        MusNotice musNotice = this.f113740c;
        if (musNotice != null && musNotice.type == 225) {
            u uVar = new u();
            if (mVar == m.Show) {
                aVar = u.a.SHOW;
            } else {
                aVar = u.a.ENTER_PROFILE;
            }
            uVar.f109597b = aVar;
            u a2 = uVar.a("notification_page");
            a2.f109596a = u.c.INBOX_NOTICE;
            e eVar = musNotice.templateNotice;
            if (eVar == null || (cVar = eVar.f112844b) == null || (fVar = cVar.f112805d) == null || (list = fVar.f112824a) == null) {
                user = null;
            } else {
                user = (User) h.a.n.h((List) list);
            }
            u a3 = a2.a(user);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            e eVar2 = musNotice.templateNotice;
            if (eVar2 == null || (str = eVar2.f112851i) == null) {
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
                    q.m223constructorimpl(r.a(th));
                }
            }
            a3.a(linkedHashMap).f();
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
        Integer valueOf;
        int i2;
        e eVar;
        e eVar2;
        ClickAgent.onClick(view);
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            n();
            c.HandlerC2905c b2 = com.ss.android.ugc.aweme.notification.e.c.b();
            if (b2 != null) {
                b2.b(this.f113740c);
            }
            if (view != null && (valueOf = Integer.valueOf(view.getId())) != null && valueOf.intValue() == R.id.cxx) {
                MusNotice musNotice = this.f113740c;
                if (!(musNotice == null || (eVar2 = musNotice.templateNotice) == null)) {
                    String s = s();
                    com.ss.android.ugc.aweme.notification.view.template.h hVar = com.ss.android.ugc.aweme.notification.view.template.h.Root;
                    int i3 = this.v;
                    String str = this.w;
                    String str2 = this.f113741d;
                    String str3 = this.f113743f;
                    if (str3 == null) {
                        str3 = "";
                    }
                    com.ss.android.ugc.aweme.notification.view.template.f fVar = new com.ss.android.ugc.aweme.notification.view.template.f(eVar2, view, s, hVar, i3, str, str2, str3, this.f113742e);
                    List<? extends com.ss.android.ugc.aweme.notification.view.template.c> list = this.x;
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (it.next().a(fVar)) {
                                a(m.Click);
                                return;
                            }
                        }
                    }
                }
                String s2 = s();
                if (s2 != null) {
                    a(m.Click);
                    MusNotice musNotice2 = this.f113740c;
                    if (musNotice2 == null || (eVar = musNotice2.templateNotice) == null) {
                        i2 = -1;
                    } else {
                        i2 = eVar.f112855m;
                    }
                    d(i2);
                    t a2 = t.a();
                    com.ss.android.ugc.aweme.ck.u a3 = com.ss.android.ugc.aweme.ck.u.a(s2);
                    l.b(a3, "");
                    t.a(a2, com.ss.android.ugc.aweme.notification.e.c.a(a3, s2).f71178a.a());
                }
            }
        }
    }

    public final void a(m mVar) {
        JSONObject jSONObject;
        String str;
        Long l2;
        String str2;
        int i2;
        Integer num;
        e eVar;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar;
        f fVar;
        com.ss.android.ugc.aweme.notice.repo.list.a.a aVar;
        User c2;
        e eVar2;
        String str3;
        e eVar3;
        e eVar4;
        String str4;
        b(mVar);
        try {
            MusNotice musNotice = this.f113740c;
            if (musNotice == null || (eVar4 = musNotice.templateNotice) == null || (str4 = eVar4.f112851i) == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str4);
            }
            String optString = jSONObject.optString("notification_type");
            if (optString == null) {
                optString = "";
            }
            d a2 = new d().a("enter_from", "notification_page").a("account_type", jSONObject.optString("account_type")).a("tab_name", this.f113741d);
            MusNotice musNotice2 = this.f113740c;
            if (musNotice2 != null) {
                str = musNotice2.nid;
            } else {
                str = null;
            }
            d a3 = a2.a("content_id", str).a("action_type", mVar.getValue()).a("client_order", String.valueOf(this.v));
            MusNotice musNotice3 = this.f113740c;
            if (musNotice3 == null || (eVar3 = musNotice3.templateNotice) == null) {
                l2 = null;
            } else {
                l2 = eVar3.f112845c;
            }
            d a4 = a3.a("message_time", l2);
            MusNotice musNotice4 = this.f113740c;
            if (musNotice4 != null) {
                str2 = musNotice4.templateId;
            } else {
                str2 = null;
            }
            d a5 = a4.a("template_id", str2);
            MusNotice musNotice5 = this.f113740c;
            if (musNotice5 == null || !musNotice5.hasRead) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            d a6 = a5.a("is_read", i2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
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
                            String optString2 = jSONObject2.optString(next2);
                            l.b(optString2, "");
                            linkedHashMap.put(next2, optString2);
                        }
                    } else if (!linkedHashMap.containsKey(next)) {
                        l.b(next, "");
                        String optString3 = jSONObject.optString(next);
                        l.b(optString3, "");
                        linkedHashMap.put(next, optString3);
                    }
                    q.m223constructorimpl(z.f158842a);
                } catch (Throwable th) {
                    q.m223constructorimpl(r.a(th));
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                a6.a((String) entry.getKey(), (String) entry.getValue());
            }
            String s = s();
            if (s == null) {
                s = "";
            }
            String queryParameter = Uri.parse(s).getQueryParameter("event_keyword");
            if (queryParameter == null) {
                queryParameter = "";
            }
            l.b(queryParameter, "");
            if (queryParameter.length() != 0) {
                a6.a("event_keyword", queryParameter);
            }
            CharSequence charSequence = (CharSequence) linkedHashMap.get("group_id");
            if (!(charSequence == null || charSequence.length() == 0)) {
                MusNotice musNotice6 = this.f113740c;
                if (musNotice6 == null || musNotice6.type != 219) {
                    str3 = UGCMonitor.TYPE_POST;
                } else {
                    str3 = "story";
                }
                a6.a("story_type", str3);
            }
            String optString4 = jSONObject.optString("from_user_id");
            if (!(optString4 == null || optString4.length() == 0)) {
                a6.a("from_user_id", jSONObject.optString("from_user_id"));
            }
            MusNotice musNotice7 = this.f113740c;
            if (musNotice7 == null || (eVar2 = musNotice7.templateNotice) == null) {
                num = null;
            } else {
                num = eVar2.f112847e;
            }
            if (num != null && num.intValue() == 216) {
                try {
                    a6.a("button_type", new JSONObject(jSONObject.optString("business_extra")).optString("button_type"));
                } catch (Exception unused) {
                }
            }
            MusNotice musNotice8 = this.f113740c;
            if (!(musNotice8 == null || (eVar = musNotice8.templateNotice) == null || (cVar = eVar.f112844b) == null || (fVar = cVar.f112805d) == null || (aVar = fVar.f112828e) == null || aVar.f112793a != 2 || (c2 = c()) == null || c2.getFollowStatus() != 0)) {
                if (c2.getFollowerStatus() == 0) {
                    a6.a("with_follow_button", "follow");
                } else {
                    a6.a("with_follow_button", "follow_back");
                }
            }
            if (!this.f113742e) {
                a6.a("timeline", this.w).a("is_together", jSONObject.optString("is_together"));
                if (l.a((Object) "official", (Object) optString)) {
                    com.ss.android.ugc.aweme.common.r.a("official_message_inner_message", a6.f66730a);
                    return;
                }
                a6.a("group_id", jSONObject.optString("group_id"));
                com.ss.android.ugc.aweme.common.r.a("notification_message_inner_message", a6.f66730a);
            } else if (l.a((Object) "official", (Object) optString)) {
                com.ss.android.ugc.aweme.common.r.a("official_message_folded_message", a6.f66730a);
            } else {
                a6.a("group_id", jSONObject.optString("group_id"));
                View view = this.itemView;
                l.b(view, "");
                a6.a("button_type", i.a(view.getContext(), c()));
                com.ss.android.ugc.aweme.common.r.a("notification_message_folded_message", a6.f66730a);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(View view, h.f.a.b<? super Integer, z> bVar) {
        super(view);
        l.d(view, "");
        this.f113739b = bVar;
        this.v = -1;
        this.w = "";
        this.x = h.a.z.INSTANCE;
        view.setOnClickListener(this);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.cxx);
        l.b(relativeLayout, "");
        com.ss.android.ugc.aweme.notification.utils.j.b(relativeLayout);
        view.setOnLongClickListener(this);
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a.a
    public final void a(User user, String str) {
        String str2;
        l.d(str, "");
        d a2 = new d().a("enter_from", "notification_page");
        if (user != null) {
            str2 = user.getUid();
        } else {
            str2 = null;
        }
        com.ss.android.ugc.aweme.common.r.a("enter_personal_detail", a2.a("to_user_id", str2).a("enter_method", str).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a.a
    public final void c(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        p.a.a(str, str2, false, str3, null, 32);
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a.a
    public final void b(TextView textView, List<? extends User> list, Integer num, BaseNotice baseNotice, String str) {
        l.d(textView, "");
        a(textView, list, num, baseNotice, str);
    }

    public final void a(MusNotice musNotice, int i2, String str, String str2, String str3, boolean z, List<? extends com.ss.android.ugc.aweme.notification.view.template.c> list) {
        e eVar;
        com.ss.android.ugc.aweme.notification.view.template.a aVar;
        String str4 = "";
        l.d(musNotice, str4);
        l.d(str, str4);
        l.d(str3, str4);
        l.d(list, str4);
        this.f113740c = musNotice;
        this.f113741d = str2;
        this.f113742e = z;
        this.f113743f = str3;
        this.w = str;
        this.v = i2;
        this.x = list;
        View view = this.itemView;
        l.b(view, str4);
        ((g) view.findViewById(R.id.cxd)).a(musNotice, this);
        View view2 = this.itemView;
        l.b(view2, str4);
        ((g) view2.findViewById(R.id.cxl)).a(musNotice, this);
        View view3 = this.itemView;
        l.b(view3, str4);
        ((g) view3.findViewById(R.id.cxw)).a(musNotice, this);
        View view4 = this.itemView;
        l.b(view4, str4);
        NoticeTemplateBottomView noticeTemplateBottomView = (NoticeTemplateBottomView) view4.findViewById(R.id.cwv);
        l.d(musNotice, str4);
        l.d(this, str4);
        noticeTemplateBottomView.f113982a = this;
        noticeTemplateBottomView.setVisibility(com.ss.android.ugc.aweme.notification.view.template.e.a(musNotice));
        Integer num = null;
        if (noticeTemplateBottomView.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams = noticeTemplateBottomView.getLayoutParams();
            layoutParams.height = -2;
            noticeTemplateBottomView.setLayoutParams(layoutParams);
            noticeTemplateBottomView.setAlpha(1.0f);
            l.d(musNotice, str4);
            if (com.ss.android.ugc.aweme.notification.view.template.e.a(musNotice, "video_link")) {
                aVar = new com.ss.android.ugc.aweme.notification.view.template.c.a();
            } else if (com.ss.android.ugc.aweme.notification.view.template.e.b(musNotice)) {
                aVar = new com.ss.android.ugc.aweme.notification.view.template.a.a();
            } else {
                aVar = null;
            }
            noticeTemplateBottomView.f113983b = aVar;
            com.ss.android.ugc.aweme.notification.view.template.a aVar2 = noticeTemplateBottomView.f113983b;
            if (aVar2 != null) {
                aVar2.a(musNotice, noticeTemplateBottomView);
            }
        }
        MusNotice musNotice2 = this.f113740c;
        if (musNotice2 != null) {
            int i3 = this.v;
            String str5 = this.w;
            String str6 = this.f113741d;
            String str7 = this.f113743f;
            if (str7 != null) {
                str4 = str7;
            }
            com.ss.android.ugc.aweme.notification.view.template.d dVar = new com.ss.android.ugc.aweme.notification.view.template.d(musNotice2, i3, str5, str6, str4, this.f113742e);
            Iterator<T> it = this.x.iterator();
            while (it.hasNext()) {
                it.next().a(dVar);
            }
        }
        MusNotice musNotice3 = this.f113740c;
        if (!(musNotice3 == null || (eVar = musNotice3.templateNotice) == null)) {
            num = eVar.f112847e;
        }
        a(h.a.i.a(new Integer[]{219, 84, 228, 250}, num));
    }
}
