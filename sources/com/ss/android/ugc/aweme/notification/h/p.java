package com.ss.android.ugc.aweme.notification.h;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.ss.android.ugc.aweme.notification.LikeListDetailActivity;
import com.ss.android.ugc.aweme.notification.e.c;
import com.ss.android.ugc.aweme.notification.h.u;
import com.ss.android.ugc.aweme.notification.utils.j;
import com.ss.android.ugc.aweme.notification.utils.k;
import com.ss.android.ugc.aweme.notification.view.g;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.io;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class p extends k {
    public static final boolean o = false;
    public static final a p = new a((byte) 0);

    /* renamed from: a */
    private final h f113671a = i.a((h.f.a.a) new c(this));

    /* renamed from: b */
    private final h f113672b = i.a((h.f.a.a) new e(this));

    /* renamed from: c */
    private final h f113673c = i.a((h.f.a.a) new b(this));

    /* renamed from: m */
    public boolean f113674m;
    public Bundle n;

    private int c() {
        return ((Number) this.f113671a.getValue()).intValue();
    }

    private int h() {
        return ((Number) this.f113672b.getValue()).intValue();
    }

    private String i() {
        return (String) this.f113673c.getValue();
    }

    public void a(View view) {
        l.d(view, "");
    }

    @Override // com.ss.android.ugc.aweme.notification.h.k
    public int bX_() {
        return R.id.cxx;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73078);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static void a(String str, String str2, boolean z, String str3, String str4) {
            l.d(str, "");
            l.d(str2, "");
            k.b(str, str2, "message");
            if (TextUtils.isEmpty(str4)) {
                str4 = "notification_page";
            }
            if (str3 == null) {
                if (z) {
                    str3 = "click_name";
                } else {
                    str3 = "click_head";
                }
            }
            k.a(str, str4, str3);
        }

        public static /* synthetic */ void a(String str, String str2, boolean z, String str3, String str4, int i2) {
            if ((i2 & 8) != 0) {
                z = false;
            }
            if ((i2 & 16) != 0) {
                str3 = null;
            }
            if ((i2 & 32) != 0) {
                str4 = "";
            }
            a(str, str2, z, str3, str4);
        }
    }

    public final void a(TextView textView, User user, BaseNotice baseNotice, String str, String str2) {
        l.d(textView, "");
        l.d(user, "");
        textView.setText(a((p) n.a(user), (List) 0, 1, (int) baseNotice, (BaseNotice) true, (boolean) str, (String) null));
        textView.setMovementMethod(com.ss.android.ugc.aweme.notification.view.d.a());
        io.a(this.f113647i, new UserVerify(null, user.getCustomVerify(), user.getEnterpriseVerifyReason(), null, 9, null), textView);
    }

    public final void a(TextView textView, List<? extends User> list, int i2, int i3, BaseNotice baseNotice, boolean z, String str, String str2) {
        l.d(textView, "");
        textView.setText(a((p) list, (List) i2, i3, (int) baseNotice, (BaseNotice) z, (boolean) str, (String) null));
        textView.setMovementMethod(com.ss.android.ugc.aweme.notification.view.d.a());
        if (list != null && list.size() == 1) {
            io.a(this.f113647i, new UserVerify(null, ((User) list.get(0)).getCustomVerify(), ((User) list.get(0)).getEnterpriseVerifyReason(), null, 9, null), textView);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    public static void a(com.ss.android.ugc.aweme.notification.view.FollowTuxTextView r8, java.lang.String r9, java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r10, android.view.View r11) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.h.p.a(com.ss.android.ugc.aweme.notification.view.FollowTuxTextView, java.lang.String, java.util.List, android.view.View):void");
    }

    public static void a(MutualRelationView mutualRelationView, List<? extends User> list, View view, View view2) {
        l.d(mutualRelationView, "");
        User c2 = list != null ? com.ss.android.ugc.aweme.ao.a.c(list) : null;
        if (c2 == null) {
            com.ss.android.ugc.aweme.notification.b.a.a(mutualRelationView);
            com.ss.android.ugc.aweme.notification.b.b.a(mutualRelationView, view, view2, false);
            return;
        }
        com.ss.android.ugc.aweme.notification.b.b.a(mutualRelationView, c2.getMatchedFriendStruct(), 0);
        com.ss.android.ugc.aweme.notification.b.b.a(mutualRelationView, view, view2, true);
    }

    public final void a(TextView textView, SpannableStringBuilder spannableStringBuilder, int i2, int i3, User user, BaseNotice baseNotice, String str) {
        l.d(textView, "");
        l.d(spannableStringBuilder, "");
        l.d(user, "");
        spannableStringBuilder.setSpan(a(this, user, 0, baseNotice, false, str, 24), i2, i3, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(c()), i2, i3, 33);
        textView.setMovementMethod(com.ss.android.ugc.aweme.notification.view.d.a());
    }

    public final void a(TextView textView, List<? extends User> list, Integer num, BaseNotice baseNotice, String str) {
        l.d(textView, "");
        textView.setText(a(list, 100, num != null ? num.intValue() : 0, baseNotice, false, (String) null, str));
        textView.setMovementMethod(com.ss.android.ugc.aweme.notification.view.d.a());
        if (list != null && list.size() == 1) {
            io.a(this.f113647i, new UserVerify(null, ((User) list.get(0)).getCustomVerify(), ((User) list.get(0)).getEnterpriseVerifyReason(), null, 9, null), textView);
        }
    }

    public static /* synthetic */ void a(p pVar, String str, String str2, Integer num, List list, int i2, int i3) {
        Integer num2 = num;
        int i4 = i2;
        List list2 = null;
        if ((i3 & 4) != 0) {
            num2 = null;
        }
        if ((i3 & 8) == 0) {
            list2 = list;
        }
        if ((i3 & 16) != 0) {
            i4 = 0;
        }
        pVar.a(str, str2, num2, list2, i4);
    }

    public final void a(String str, String str2, Integer num, List<String> list, int i2) {
        l.d(str, "");
        c.HandlerC2905c b2 = com.ss.android.ugc.aweme.notification.e.c.b();
        if (b2 != null) {
            b2.b(this.f113648j);
        }
        BaseNotice baseNotice = this.f113648j;
        String str3 = null;
        Integer valueOf = baseNotice != null ? Integer.valueOf(baseNotice.type) : null;
        BaseNotice baseNotice2 = this.f113648j;
        if (baseNotice2 != null) {
            str3 = baseNotice2.nid;
        }
        com.ss.android.ugc.aweme.inbox.d.h.b(str, valueOf, str3);
        if (MSAdaptionService.c().c(this.f113647i)) {
            SmartRouter.buildRoute(com.bytedance.ies.ugc.appcontext.d.a(), "//duo").withParam("duo_type", "duo_detail").withParam("id", str).withParam("refer", "notification_page").withParam("cid", str2).open();
        } else {
            SmartRoute withParam = SmartRouter.buildRoute(com.bytedance.ies.ugc.appcontext.d.a(), "aweme://aweme/detail/").withParam("id", str).withParam("refer", "notification_page").withParam("cid", str2);
            l.b(withParam, "");
            SmartRoute a2 = com.ss.android.ugc.aweme.notification.e.c.a(withParam, "aweme://aweme/detail/");
            if (num != null) {
                a2.withParam("story_comment_user_follow_status", num.intValue());
            }
            if (list != null && !list.isEmpty()) {
                a2.withParam("like_ids", dg.a().b(list));
                a2.withParam("like_count", i2);
            }
            a2.open();
        }
        Context context = this.f113647i;
        l.b(context, "");
        j.a(context);
    }

    public static void a(String str, String str2, Integer num) {
        l.d(str, "");
        SmartRoute withParam = SmartRouter.buildRoute(com.bytedance.ies.ugc.appcontext.d.a(), "aweme://story/detail").withParam("video_from", "STORY_ENTRANCE_DEFAULT").withParam("enter_from", "notification_page").withParam("id", str).withParam("cid", str2);
        if (num != null) {
            withParam.withParam("story_comment_user_follow_status", num.intValue());
        }
        withParam.open();
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<String> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(73079);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p pVar) {
            super(0);
            this.this$0 = pVar;
        }

        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return this.this$0.f113647i.getString(R.string.dkz);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<Integer> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(73080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(p pVar) {
            super(0);
            this.this$0 = pVar;
        }

        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(androidx.core.content.b.c(this.this$0.f113647i, R.color.bx));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.a<Integer> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(73082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(p pVar) {
            super(0);
            this.this$0 = pVar;
        }

        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(androidx.core.content.b.c(this.this$0.f113647i, R.color.c4));
        }
    }

    static {
        Covode.recordClassIndex(73077);
    }

    public void c(int i2) {
        this.n = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(View view) {
        super(view);
        l.d(view, "");
    }

    protected static int a(User user) {
        l.d(user, "");
        int followStatus = user.getFollowStatus();
        if ((followStatus != 0 && followStatus != 4) || user.getFollowStatus() == 4) {
            return 0;
        }
        if (user.getFollowStatus() == 1 || user.getFollowStatus() == 2 || !user.isSecret()) {
            return 1;
        }
        return 4;
    }

    public static final class d implements d {

        /* renamed from: a */
        final /* synthetic */ p f113675a;

        /* renamed from: b */
        final /* synthetic */ int f113676b;

        /* renamed from: c */
        final /* synthetic */ BaseNotice f113677c;

        /* renamed from: d */
        final /* synthetic */ boolean f113678d;

        /* renamed from: e */
        final /* synthetic */ String f113679e;

        /* renamed from: f */
        final /* synthetic */ String f113680f;

        static {
            Covode.recordClassIndex(73081);
        }

        @Override // com.ss.android.ugc.aweme.notification.h.d
        public final void a(View view, User user) {
            boolean z;
            int i2;
            DiggNotice diggNotice;
            String str;
            String str2 = "";
            l.d(view, str2);
            this.f113675a.a(view);
            int i3 = this.f113676b;
            boolean z2 = false;
            if (i3 == 0) {
                if (TextUtils.equals("notification_page", "fans")) {
                    Context context = this.f113675a.f113647i;
                    l.b(context, str2);
                    BaseNotice baseNotice = this.f113677c;
                    if (baseNotice != null) {
                        i2 = baseNotice.clientOrder;
                    } else {
                        i2 = -1;
                    }
                    j.a(context, "fans", i2);
                }
                if (user != null) {
                    p pVar = this.f113675a;
                    BaseNotice baseNotice2 = this.f113677c;
                    l.d(pVar, str2);
                    l.d(user, str2);
                    pVar.getClass().getSimpleName();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String uid = user.getUid();
                    if (uid == null || uid.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        linkedHashMap.put("invalid_u", "1");
                    }
                    String secUid = user.getSecUid();
                    if (secUid == null || secUid.length() == 0) {
                        linkedHashMap.put("invalid_sec_u", "1");
                    }
                    if (!linkedHashMap.isEmpty()) {
                        String simpleName = pVar.getClass().getSimpleName();
                        if (simpleName == null) {
                            simpleName = str2;
                        }
                        linkedHashMap.put("caller", simpleName);
                        if (baseNotice2 != null) {
                            String str3 = baseNotice2.nid;
                            if (str3 == null) {
                                str3 = str2;
                            }
                            linkedHashMap.put("nid", str3);
                            linkedHashMap.put(StringSet.type, String.valueOf(baseNotice2.type));
                        }
                        r.a("inbox_vh_invalid_user", linkedHashMap);
                        f.c("NameSpanMonitor", "check, invalid user: ".concat(String.valueOf(linkedHashMap)));
                    }
                    String uid2 = user.getUid();
                    if (uid2 == null) {
                        uid2 = str2;
                    }
                    String secUid2 = user.getSecUid();
                    if (secUid2 != null) {
                        str2 = secUid2;
                    }
                    a.a(uid2, str2, true, null, null, 48);
                }
            } else if (i3 == 1) {
                BaseNotice baseNotice3 = this.f113677c;
                if (baseNotice3 != null && (diggNotice = baseNotice3.diggNotice) != null) {
                    String cid = diggNotice.getCid();
                    if (cid == null || cid.length() == 0) {
                        z2 = true;
                    }
                    String str4 = null;
                    ArrayList arrayList = null;
                    if (!z2 || p.b(diggNotice.getDiggType()) || !com.ss.android.ugc.aweme.experiment.f.b()) {
                        int diggType = diggNotice.getDiggType();
                        if (diggType == 0) {
                            p pVar2 = this.f113675a;
                            Aweme aweme = diggNotice.getAweme();
                            l.b(aweme, str2);
                            String aid = aweme.getAid();
                            l.b(aid, str2);
                            p.a(pVar2, aid, diggNotice.getCid(), (Integer) null, (List) null, 0, 28);
                        } else if (diggType == u.a.C2910a.f113722e || diggType == u.a.C2910a.f113723f) {
                            Aweme aweme2 = diggNotice.getAweme();
                            l.b(aweme2, str2);
                            String aid2 = aweme2.getAid();
                            l.b(aid2, str2);
                            p.a(aid2, diggNotice.getCid(), (Integer) null);
                        } else {
                            if (diggNotice.getDiggType() == 3) {
                                Comment comment = diggNotice.getComment();
                                if (comment != null) {
                                    str = comment.getCid();
                                }
                                str = null;
                            } else {
                                Aweme aweme3 = diggNotice.getAweme();
                                if (aweme3 != null) {
                                    str = aweme3.getAid();
                                }
                                str = null;
                            }
                            Context context2 = view.getContext();
                            l.b(context2, str2);
                            BaseNotice baseNotice4 = this.f113675a.f113648j;
                            String str5 = baseNotice4 != null ? baseNotice4.nid : null;
                            Aweme aweme4 = diggNotice.getAweme();
                            if (aweme4 != null) {
                                str4 = aweme4.getAid();
                            }
                            boolean z3 = this.f113678d;
                            int diggType2 = diggNotice.getDiggType();
                            long j2 = this.f113677c.lastReadTime;
                            String a2 = g.a(diggNotice.getComment());
                            Aweme aweme5 = diggNotice.getAweme();
                            l.b(aweme5, str2);
                            Video video = aweme5.getVideo();
                            l.b(video, str2);
                            LikeListDetailActivity.a.a(context2, str5, str4, str, z3, diggType2, j2, a2, video.getOriginCover(), this.f113679e);
                        }
                    } else {
                        p pVar3 = this.f113675a;
                        Aweme aweme6 = diggNotice.getAweme();
                        l.b(aweme6, str2);
                        String aid3 = aweme6.getAid();
                        l.b(aid3, str2);
                        List<User> users = diggNotice.getUsers();
                        if (users != null) {
                            ArrayList arrayList2 = new ArrayList(n.a((Iterable) users, 10));
                            for (T t : users) {
                                l.b(t, str2);
                                arrayList2.add(t.getUid());
                            }
                            arrayList = arrayList2;
                        }
                        pVar3.a(aid3, (String) null, (Integer) null, arrayList, diggNotice.getMergeCount());
                    }
                }
            } else if (i3 == 2) {
                p pVar4 = this.f113675a;
                pVar4.a("check_profile", pVar4.getLayoutPosition());
                k.a(view.getContext());
            } else if (i3 == 100) {
                t.a(t.a(), this.f113680f);
            }
        }

        d(p pVar, int i2, BaseNotice baseNotice, boolean z, String str, String str2) {
            this.f113675a = pVar;
            this.f113676b = i2;
            this.f113677c = baseNotice;
            this.f113678d = z;
            this.f113679e = str;
            this.f113680f = str2;
        }
    }

    private final a.C0730a a(a.C0730a aVar, User user, BaseNotice baseNotice, String str) {
        String a2 = j.a(user);
        if (!TextUtils.isEmpty(a2)) {
            g a3 = a(this, user, 0, baseNotice, false, str, 24);
            l.d(a2, "");
            int length = aVar.f33382a.length();
            a.c.a(aVar.f33382a, a2);
            if (a3 != null) {
                aVar.f33382a.setSpan(a3, length, aVar.f33382a.length(), 33);
            }
        }
        return aVar;
    }

    private final g a(User user, int i2, BaseNotice baseNotice, boolean z, String str, String str2) {
        return new g(user, i2, false, c(), h(), new d(this, i2, baseNotice, z, str2, str));
    }

    private static /* synthetic */ g a(p pVar, User user, int i2, BaseNotice baseNotice, boolean z, String str, int i3) {
        BaseNotice baseNotice2 = baseNotice;
        boolean z2 = z;
        String str2 = null;
        if ((i3 & 4) != 0) {
            baseNotice2 = null;
        }
        if ((i3 & 8) != 0) {
            z2 = true;
        }
        if ((i3 & 32) == 0) {
            str2 = str;
        }
        return pVar.a(user, i2, baseNotice2, z2, (String) null, str2);
    }

    private final com.bytedance.ies.dmt.ui.d.a a(List<? extends User> list, int i2, int i3, BaseNotice baseNotice, boolean z, String str, String str2) {
        g a2;
        a.C0730a aVar = new a.C0730a();
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                a(aVar, (User) list.get(0), baseNotice, str);
            } else if (list.size() == 2 && 1 <= i3 && 3 >= i3) {
                a.C0730a a3 = a(aVar, (User) list.get(0), baseNotice, str).a(" ");
                String i4 = i();
                l.b(i4, "");
                a(a3.a(i4).a(" "), (User) list.get(1), baseNotice, str);
            } else if (list.size() == 3 || (i3 == 3 && list.size() > 3)) {
                a.C0730a a4 = a(a(aVar, (User) list.get(0), baseNotice, str).a(", "), (User) list.get(1), baseNotice, str).a(" ");
                String i5 = i();
                l.b(i5, "");
                a(a4.a(i5).a(" "), (User) list.get(2), baseNotice, str);
            } else if (list.size() > 1) {
                String string = this.f113647i.getString(R.string.dky, Integer.valueOf(Math.max(i3, list.size()) - 2));
                l.b(string, "");
                if (i2 == 2) {
                    a2 = a(this, (User) null, 2, baseNotice, false, str, 24);
                } else if (i2 == 1) {
                    a2 = a(this, (User) null, 1, baseNotice, z, str, 16);
                } else {
                    a2 = a((User) null, 100, baseNotice, z, str2, str);
                }
                a.C0730a a5 = a(a(aVar, (User) list.get(0), baseNotice, str).a(", "), (User) list.get(1), baseNotice, str).a(" ");
                String i6 = i();
                l.b(i6, "");
                a5.a(i6).a(" ").a(string, a2, 33);
            }
        }
        return aVar.f33382a;
    }
}
