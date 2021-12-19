package com.ss.android.ugc.aweme.notification.view.template;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.h.q;
import com.ss.android.ugc.aweme.notification.view.FollowTuxTextView;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.hl;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.m;
import h.f.b.j;
import h.f.b.l;
import h.h;
import h.i;
import h.r;
import h.z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class NoticeTemplateMiddleView extends g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f113989a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f113990b;

    /* renamed from: c  reason: collision with root package name */
    private final h f113991c;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f113992d;

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: c  reason: collision with root package name */
        public static final a f113993c = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public int f113994a = Integer.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.notice.repo.list.bean.e f113995b;

        static {
            Covode.recordClassIndex(73291);
        }

        public static final class a {
            static {
                Covode.recordClassIndex(73292);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
            if (r0.f112812k == 11) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x006a, code lost:
            if (r2.intValue() == 10) goto L_0x0063;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(com.ss.android.ugc.aweme.notice.repo.list.bean.e r7, boolean r8) {
            /*
            // Method dump skipped, instructions count: 111
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView.b.<init>(com.ss.android.ugc.aweme.notice.repo.list.bean.e, boolean):void");
        }
    }

    static {
        Covode.recordClassIndex(73289);
    }

    public NoticeTemplateMiddleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.g
    public final View a(int i2) {
        if (this.f113992d == null) {
            this.f113992d = new SparseArray();
        }
        View view = (View) this.f113992d.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f113992d.put(i2, findViewById);
        return findViewById;
    }

    public final int getNormalTextColor() {
        return ((Number) this.f113990b.getValue()).intValue();
    }

    public final int getPressedTextColor() {
        return ((Number) this.f113991c.getValue()).intValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73290);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(a.C0730a aVar, com.ss.android.ugc.aweme.notice.repo.list.a.c cVar, m<? super com.ss.android.ugc.aweme.notice.repo.list.a.e, ? super a.C0730a, z> mVar) {
            l.d(aVar, "");
            l.d(cVar, "");
            String str = cVar.f112807f;
            if (str == null) {
                str = "";
            }
            int i2 = 0;
            if (str.length() != 0) {
                List list = cVar.p;
                if (list == null) {
                    list = h.a.z.INSTANCE;
                }
                int size = list.size();
                Matcher matcher = Pattern.compile("\\[\\[text_link_(\\d)\\]\\]").matcher(str);
                while (matcher.find()) {
                    if (i2 != matcher.start()) {
                        int start = matcher.start();
                        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                        String substring = str.substring(i2, start);
                        l.b(substring, "");
                        aVar.a(substring);
                    }
                    i2 = matcher.end();
                    int intValue = Integer.valueOf(matcher.group(1)).intValue() - 1;
                    if (size > intValue && list.get(intValue) != null) {
                        com.ss.android.ugc.aweme.notice.repo.list.a.e eVar = (com.ss.android.ugc.aweme.notice.repo.list.a.e) list.get(intValue);
                        if (mVar == null) {
                            String str2 = eVar.f112820b;
                            if (str2 != null) {
                                aVar.a(str2);
                            }
                        } else {
                            mVar.invoke(eVar, aVar);
                        }
                    }
                }
                if (i2 < str.length()) {
                    Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                    String substring2 = str.substring(i2);
                    l.b(substring2, "");
                    aVar.a(substring2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.g
    public final h getTemplatePosition() {
        return h.Middle;
    }

    static final class f extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(73296);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(androidx.core.content.b.c(this.$context, R.color.bx));
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(73297);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(androidx.core.content.b.c(this.$context, R.color.c4));
        }
    }

    private final float a() {
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar;
        Integer valueOf;
        com.ss.android.ugc.aweme.notice.repo.list.bean.e templateNotice = getTemplateNotice();
        if (templateNotice == null || (cVar = templateNotice.f112844b) == null || (valueOf = Integer.valueOf(cVar.f112812k)) == null) {
            return 0.0f;
        }
        if (valueOf.intValue() == 10) {
            return 192.0f;
        }
        if (valueOf.intValue() == 11) {
            return 146.0f;
        }
        if (valueOf.intValue() == 12 || valueOf.intValue() == 13) {
            return 132.0f;
        }
        return 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.g
    public final boolean a(View view) {
        String b2 = b(view);
        if (b2 == null) {
            return false;
        }
        a(b2);
        return true;
    }

    private final b c(b bVar) {
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar;
        com.ss.android.ugc.aweme.notice.repo.list.a.b bVar2;
        com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar = bVar.f113995b;
        if (!(eVar == null || (cVar = eVar.f112844b) == null || (bVar2 = cVar.f112806e) == null)) {
            a((MutualRelationView) a(R.id.crv), bVar2);
        }
        return bVar;
    }

    private final b b(b bVar) {
        String str;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar2;
        String str2;
        if (getMBaseNotice() == null) {
            return bVar;
        }
        TuxTextView tuxTextView = (TuxTextView) a(R.id.cwx);
        l.b(tuxTextView, "");
        tuxTextView.setVisibility(0);
        a(a(R.id.cwx), this);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar = bVar.f113995b;
        if (eVar == null || (cVar2 = eVar.f112844b) == null || (str2 = cVar2.f112807f) == null || spannableStringBuilder.append((CharSequence) str2) == null) {
            ((TuxTextView) a(R.id.cwx)).setTextColor(androidx.core.content.b.c(getContext(), R.color.c5));
            com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar2 = bVar.f113995b;
            if (eVar2 == null || (cVar = eVar2.f112844b) == null || (str = cVar.f112808g) == null) {
                str = "";
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.cwx);
        l.b(tuxTextView2, "");
        MusNotice mBaseNotice = getMBaseNotice();
        if (mBaseNotice == null) {
            l.b();
        }
        q.a(tuxTextView2, spannableStringBuilder, mBaseNotice, bVar.f113994a, 0);
        return bVar;
    }

    private final b a(b bVar) {
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar;
        com.ss.android.ugc.aweme.notice.repo.list.a.f fVar;
        com.ss.android.ugc.aweme.notice.repo.list.a.a aVar;
        User user;
        com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar = bVar.f113995b;
        if (!(eVar == null || (cVar = eVar.f112844b) == null || (fVar = cVar.f112805d) == null || (aVar = fVar.f112828e) == null)) {
            FollowTuxTextView followTuxTextView = (FollowTuxTextView) a(R.id.cxq);
            l.b(followTuxTextView, "");
            followTuxTextView.setVisibility(0);
            FollowTuxTextView followTuxTextView2 = (FollowTuxTextView) a(R.id.cxq);
            l.b(followTuxTextView2, "");
            followTuxTextView2.setText(aVar.f112795c);
            int i2 = aVar.f112794b;
            if (i2 == 0) {
                Context context = getContext();
                l.b(context, "");
                ((FollowTuxTextView) a(R.id.cxq)).setTextColor(context.getResources().getColor(R.color.c5));
            } else if (i2 == 1) {
                Context context2 = getContext();
                l.b(context2, "");
                ((FollowTuxTextView) a(R.id.cxq)).setTextColor(context2.getResources().getColor(R.color.b9));
            }
            int i3 = aVar.f112793a;
            if (i3 == 0) {
                ((FollowTuxTextView) a(R.id.cxq)).setOnClickListener(null);
            } else if (i3 == 1) {
                ((FollowTuxTextView) a(R.id.cxq)).setOnClickListener(this);
            } else if (!(i3 != 2 || (user = (User) n.h((List) fVar.f112824a)) == null || fVar.f112828e == null)) {
                ((FollowTuxTextView) a(R.id.cxq)).a(user.getFollowStatus(), user.getFollowerStatus());
                com.ss.android.ugc.aweme.notification.utils.e.a("show", "", "inbox_interaction_message", user, bVar.f113995b.f112851i);
                new com.ss.android.ugc.aweme.follow.widet.a((FollowTuxTextView) a(R.id.cxq), new e(fVar, this, bVar)).a(user);
            }
        }
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.g
    public final String b(View view) {
        Integer valueOf;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar2;
        com.ss.android.ugc.aweme.notice.repo.list.a.f fVar;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar3;
        com.ss.android.ugc.aweme.notice.repo.list.a.b bVar;
        String str;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar4;
        com.ss.android.ugc.aweme.notice.repo.list.a.f fVar2;
        com.ss.android.ugc.aweme.notice.repo.list.a.a aVar;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar5;
        com.ss.android.ugc.aweme.notice.repo.list.a.f fVar3;
        String str2 = null;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null) {
            return null;
        }
        if (valueOf.intValue() == R.id.cwz || valueOf.intValue() == R.id.cwx || valueOf.intValue() == R.id.cxt) {
            com.ss.android.ugc.aweme.notice.repo.list.bean.e templateNotice = getTemplateNotice();
            if (templateNotice == null || (cVar = templateNotice.f112844b) == null) {
                return null;
            }
            return cVar.f112811j;
        } else if (valueOf.intValue() == R.id.cxm) {
            com.ss.android.ugc.aweme.notice.repo.list.bean.e templateNotice2 = getTemplateNotice();
            if (templateNotice2 == null || (cVar5 = templateNotice2.f112844b) == null || (fVar3 = cVar5.f112805d) == null) {
                return null;
            }
            return fVar3.f112826c;
        } else if (valueOf.intValue() == R.id.cxq) {
            com.ss.android.ugc.aweme.notice.repo.list.bean.e templateNotice3 = getTemplateNotice();
            if (templateNotice3 == null || (cVar4 = templateNotice3.f112844b) == null || (fVar2 = cVar4.f112805d) == null || ((aVar = fVar2.f112828e) != null && (str2 = aVar.f112796d) != null)) {
                return str2;
            }
            return fVar2.f112826c;
        } else if (valueOf.intValue() != R.id.crv) {
            return null;
        } else {
            com.ss.android.ugc.aweme.notice.repo.list.bean.e templateNotice4 = getTemplateNotice();
            if (templateNotice4 != null && (cVar3 = templateNotice4.f112844b) != null && (bVar = cVar3.f112806e) != null && (str = bVar.f112800d) != null) {
                return str;
            }
            com.ss.android.ugc.aweme.notice.repo.list.bean.e templateNotice5 = getTemplateNotice();
            if (templateNotice5 == null || (cVar2 = templateNotice5.f112844b) == null || (fVar = cVar2.f112805d) == null) {
                return null;
            }
            return fVar.f112826c;
        }
    }

    public static final class d implements com.ss.android.ugc.aweme.notification.h.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NoticeTemplateMiddleView f113996a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.notice.repo.list.a.e f113997b;

        static {
            Covode.recordClassIndex(73294);
        }

        d(NoticeTemplateMiddleView noticeTemplateMiddleView, com.ss.android.ugc.aweme.notice.repo.list.a.e eVar) {
            this.f113996a = noticeTemplateMiddleView;
            this.f113997b = eVar;
        }

        @Override // com.ss.android.ugc.aweme.notification.h.d
        public final void a(View view, User user) {
            Boolean bool;
            com.ss.android.ugc.aweme.notification.h.a.a mBridge;
            com.ss.android.ugc.aweme.notification.h.a.a mBridge2;
            l.d(view, "");
            com.ss.android.ugc.aweme.notification.h.a.a mBridge3 = this.f113996a.getMBridge();
            if (mBridge3 != null) {
                mBridge3.n();
            }
            com.ss.android.ugc.aweme.notice.repo.list.a.e eVar = this.f113997b;
            if (eVar != null) {
                bool = Boolean.valueOf(eVar.f112823e);
            } else {
                bool = null;
            }
            if (bool.booleanValue() && (mBridge2 = this.f113996a.getMBridge()) != null) {
                mBridge2.o();
            }
            com.ss.android.ugc.aweme.notice.repo.list.a.e eVar2 = this.f113997b;
            if (!(eVar2 == null || eVar2.f112822d != 1 || (mBridge = this.f113996a.getMBridge()) == null)) {
                mBridge.a(user, "click_name");
            }
            t.a(t.a(), this.f113997b.f112821c);
        }
    }

    static final /* synthetic */ class c extends j implements m<com.ss.android.ugc.aweme.notice.repo.list.a.e, a.C0730a, z> {
        static {
            Covode.recordClassIndex(73293);
        }

        c(NoticeTemplateMiddleView noticeTemplateMiddleView) {
            super(2, noticeTemplateMiddleView, NoticeTemplateMiddleView.class, "buildTextLink", "buildTextLink(Lcom/ss/android/ugc/aweme/notice/repo/list/uitemplate/TextLinkConfig;Lcom/bytedance/ies/dmt/ui/text/DmtText$BidiConcat;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.notice.repo.list.a.e eVar, a.C0730a aVar) {
            Integer num;
            com.ss.android.ugc.aweme.notice.repo.list.a.e eVar2 = eVar;
            a.C0730a aVar2 = aVar;
            String str = "";
            l.d(eVar2, str);
            l.d(aVar2, str);
            NoticeTemplateMiddleView noticeTemplateMiddleView = (NoticeTemplateMiddleView) this.receiver;
            com.ss.android.ugc.aweme.notification.view.g gVar = null;
            if (eVar2 != null) {
                num = Integer.valueOf(eVar2.f112819a);
            } else {
                num = null;
            }
            if (num.intValue() == 2) {
                gVar = new com.ss.android.ugc.aweme.notification.view.g(null, 100, true, noticeTemplateMiddleView.getNormalTextColor(), noticeTemplateMiddleView.getPressedTextColor(), new d(noticeTemplateMiddleView, eVar2));
            }
            String str2 = eVar2.f112820b;
            if (str2 != null) {
                str = str2;
            }
            aVar2.a(str, gVar, 33);
            return z.f158842a;
        }
    }

    private final void a(MutualRelationView mutualRelationView, com.ss.android.ugc.aweme.notice.repo.list.a.b bVar) {
        if (mutualRelationView != null && bVar != null) {
            com.ss.android.ugc.aweme.notification.b.b.a(mutualRelationView, bVar.f112801e, bVar.f112797a);
            String str = bVar.f112798b;
            if (str != null && hl.a(str)) {
                mutualRelationView.getTvDesc().setText(str);
                com.ss.android.ugc.aweme.notification.b.a.b(mutualRelationView);
            }
            if (bVar.f112799c != 1) {
                mutualRelationView.setOnClickListener(null);
            } else {
                mutualRelationView.setOnClickListener(this);
            }
            if (bVar.f112801e == null) {
                com.ss.android.ugc.aweme.notification.b.b.a(mutualRelationView, bVar.f112797a, false);
            }
        }
    }

    public static final class e extends a.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.notice.repo.list.a.f f113998a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NoticeTemplateMiddleView f113999b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f114000c;

        static {
            Covode.recordClassIndex(73295);
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
        public final void a(int i2, User user) {
            JSONObject jSONObject;
            super.a(i2, user);
            com.ss.android.ugc.aweme.notification.utils.e.a("follow", "", "inbox_interaction_message", user, this.f114000c.f113995b.f112851i);
            String str = this.f114000c.f113995b.f112851i;
            if (str != null) {
                jSONObject = new JSONObject(str);
            } else {
                jSONObject = new JSONObject();
            }
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
                    h.q.m223constructorimpl(z.f158842a);
                } catch (Throwable th) {
                    h.q.m223constructorimpl(r.a(th));
                }
            }
            com.ss.android.ugc.aweme.notification.utils.e.a(user, linkedHashMap);
        }

        e(com.ss.android.ugc.aweme.notice.repo.list.a.f fVar, NoticeTemplateMiddleView noticeTemplateMiddleView, b bVar) {
            this.f113998a = fVar;
            this.f113999b = noticeTemplateMiddleView;
            this.f114000c = bVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (h.z.f158842a == null) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView.b a(com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView.b r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView.a(com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView$b, boolean):com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView$b");
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.g
    public final void a(MusNotice musNotice, com.ss.android.ugc.aweme.notification.h.a.a aVar) {
        long j2;
        boolean z;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar;
        Integer valueOf;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar2;
        String str;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar3;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar4;
        com.ss.android.ugc.aweme.notice.repo.list.a.f fVar;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar5;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar6;
        Long l2;
        l.d(musNotice, "");
        l.d(aVar, "");
        super.a(musNotice, aVar);
        com.ss.android.ugc.aweme.notice.repo.list.bean.e templateNotice = getTemplateNotice();
        if (templateNotice == null || (l2 = templateNotice.f112845c) == null) {
            j2 = 0;
        } else {
            j2 = l2.longValue();
        }
        musNotice.createTime = j2;
        TuxTextView tuxTextView = (TuxTextView) a(R.id.cxm);
        l.b(tuxTextView, "");
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.cwx);
        l.b(tuxTextView2, "");
        LinearLayout linearLayout = (LinearLayout) a(R.id.cxt);
        l.b(linearLayout, "");
        RemoteRoundImageView remoteRoundImageView = (RemoteRoundImageView) a(R.id.cwz);
        l.b(remoteRoundImageView, "");
        FollowTuxTextView followTuxTextView = (FollowTuxTextView) a(R.id.cxq);
        l.b(followTuxTextView, "");
        MutualRelationView mutualRelationView = (MutualRelationView) a(R.id.crv);
        l.b(mutualRelationView, "");
        View[] viewArr = {tuxTextView, tuxTextView2, linearLayout, remoteRoundImageView, followTuxTextView, mutualRelationView};
        for (int i2 = 0; i2 < 6; i2++) {
            viewArr[i2].setVisibility(8);
        }
        ((TuxTextView) a(R.id.cwx)).setTextColor(androidx.core.content.b.c(getContext(), R.color.bx));
        com.ss.android.ugc.aweme.notice.repo.list.bean.e templateNotice2 = getTemplateNotice();
        com.ss.android.ugc.aweme.notification.h.a.a mBridge = getMBridge();
        if (mBridge != null) {
            z = mBridge.k();
        } else {
            z = false;
        }
        b bVar = new b(templateNotice2, z);
        com.ss.android.ugc.aweme.notice.repo.list.bean.e templateNotice3 = getTemplateNotice();
        String str2 = null;
        r3 = null;
        String str3 = null;
        r3 = null;
        UrlModel urlModel = null;
        str2 = null;
        if (!(templateNotice3 == null || (cVar = templateNotice3.f112844b) == null || (valueOf = Integer.valueOf(cVar.f112804c)) == null)) {
            if (valueOf.intValue() == 0) {
                c(a(bVar, false));
                return;
            } else if (valueOf.intValue() == 1) {
                b(c(a(bVar, true)));
                return;
            } else if (valueOf.intValue() == 2) {
                b b2 = b(c(a(bVar, true)));
                LinearLayout linearLayout2 = (LinearLayout) a(R.id.cxt);
                l.b(linearLayout2, "");
                linearLayout2.setVisibility(0);
                a(a(R.id.cxt), this);
                TuxTextView tuxTextView3 = (TuxTextView) a(R.id.cxu);
                l.b(tuxTextView3, "");
                com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar = b2.f113995b;
                if (!(eVar == null || (cVar6 = eVar.f112844b) == null)) {
                    str3 = cVar6.f112809h;
                }
                tuxTextView3.setText(str3);
                return;
            } else if (valueOf.intValue() == 3) {
                b b3 = b(c(a(bVar, true)));
                RemoteRoundImageView remoteRoundImageView2 = (RemoteRoundImageView) a(R.id.cwz);
                l.b(remoteRoundImageView2, "");
                remoteRoundImageView2.setVisibility(0);
                a(a(R.id.cwz), this);
                RemoteImageView remoteImageView = (RemoteImageView) a(R.id.cwz);
                com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar2 = b3.f113995b;
                if (!(eVar2 == null || (cVar5 = eVar2.f112844b) == null)) {
                    urlModel = cVar5.f112810i;
                }
                com.ss.android.ugc.aweme.base.e.a(remoteImageView, urlModel);
                return;
            } else if (valueOf.intValue() == 4) {
                if (getMBaseNotice() != null) {
                    TuxTextView tuxTextView4 = (TuxTextView) a(R.id.cwx);
                    l.b(tuxTextView4, "");
                    tuxTextView4.setVisibility(0);
                    a(a(R.id.cwx), this);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar3 = bVar.f113995b;
                    if (eVar3 == null || (cVar4 = eVar3.f112844b) == null || (fVar = cVar4.f112805d) == null || (str = fVar.f112827d) == null) {
                        str = "";
                    }
                    spannableStringBuilder.append((CharSequence) str).append((CharSequence) ": ");
                    spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                    com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar4 = bVar.f113995b;
                    if (!(eVar4 == null || (cVar3 = eVar4.f112844b) == null)) {
                        str2 = cVar3.f112807f;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        spannableStringBuilder.append((CharSequence) str2);
                    } else {
                        spannableStringBuilder.delete(spannableStringBuilder.length() - 2, spannableStringBuilder.length());
                    }
                    TuxTextView tuxTextView5 = (TuxTextView) a(R.id.cwx);
                    l.b(tuxTextView5, "");
                    MusNotice mBaseNotice = getMBaseNotice();
                    if (mBaseNotice == null) {
                        l.b();
                    }
                    q.a(tuxTextView5, spannableStringBuilder, mBaseNotice, bVar.f113994a, com.bytedance.common.utility.n.a(getContext()) - ((int) com.bytedance.common.utility.n.b(getContext(), a())));
                    bVar = a(bVar);
                }
                c(bVar);
                return;
            } else if (valueOf.intValue() == 5) {
                if (getMBaseNotice() != null) {
                    TuxTextView tuxTextView6 = (TuxTextView) a(R.id.cwx);
                    l.b(tuxTextView6, "");
                    tuxTextView6.setVisibility(0);
                    TuxTextView tuxTextView7 = (TuxTextView) a(R.id.cwx);
                    l.b(tuxTextView7, "");
                    if (com.ss.android.ugc.aweme.notification.view.b.f113932d == null) {
                        com.ss.android.ugc.aweme.notification.view.b.f113932d = new com.ss.android.ugc.aweme.notification.view.b();
                    }
                    tuxTextView7.setMovementMethod(com.ss.android.ugc.aweme.notification.view.b.f113932d);
                    a.C0730a aVar2 = new a.C0730a();
                    com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar5 = bVar.f113995b;
                    if (!(eVar5 == null || (cVar2 = eVar5.f112844b) == null)) {
                        String str4 = cVar2.f112807f;
                        if (str4 == null || str4.length() == 0) {
                            ((TuxTextView) a(R.id.cwx)).setTextColor(androidx.core.content.b.c(getContext(), R.color.c5));
                            String str5 = cVar2.f112808g;
                            if (str5 == null) {
                                str5 = "";
                            }
                            aVar2.a(str5);
                        } else {
                            a.a(aVar2, cVar2, new c(this));
                        }
                    }
                    TuxTextView tuxTextView8 = (TuxTextView) a(R.id.cwx);
                    l.b(tuxTextView8, "");
                    com.bytedance.ies.dmt.ui.d.a aVar3 = aVar2.f33382a;
                    MusNotice mBaseNotice2 = getMBaseNotice();
                    if (mBaseNotice2 == null) {
                        l.b();
                    }
                    q.a(tuxTextView8, aVar3, mBaseNotice2, bVar.f113994a, com.bytedance.common.utility.n.a(getContext()) - ((int) com.bytedance.common.utility.n.b(getContext(), a())));
                    bVar = a(bVar);
                }
                c(bVar);
                return;
            }
        }
        setVisibility(8);
    }

    private /* synthetic */ NoticeTemplateMiddleView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private NoticeTemplateMiddleView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        com.a.a(LayoutInflater.from(context), R.layout.l8, this, true);
        ((RemoteRoundImageView) a(R.id.cwz)).setOnClickListener(this);
        this.f113990b = i.a((h.f.a.a) new f(context));
        this.f113991c = i.a((h.f.a.a) new g(context));
    }
}
