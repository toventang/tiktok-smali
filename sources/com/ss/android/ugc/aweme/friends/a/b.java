package com.ss.android.ugc.aweme.friends.a;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.challenge.model.Segment;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.friends.a.a;
import com.ss.android.ugc.aweme.friends.f;
import com.ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.e;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import com.ss.android.ugc.aweme.search.service.SearchUserService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.eu;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.i;
import h.m.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class b extends h {

    /* renamed from: l  reason: collision with root package name */
    public static final c f96718l = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f96719a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends IMUser> f96720b;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends SummonFriendItem> f96721c;

    /* renamed from: d  reason: collision with root package name */
    public List<? extends e> f96722d;

    /* renamed from: e  reason: collision with root package name */
    public LogPbBean f96723e;

    /* renamed from: f  reason: collision with root package name */
    public String f96724f;

    /* renamed from: g  reason: collision with root package name */
    public String f96725g = "";

    /* renamed from: h  reason: collision with root package name */
    public int f96726h = -1;

    /* renamed from: i  reason: collision with root package name */
    public String f96727i = "";

    /* renamed from: j  reason: collision with root package name */
    public a f96728j;

    /* renamed from: k  reason: collision with root package name */
    public List<String> f96729k = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private final h.h f96730m = i.a((h.f.a.a) d.f96752a);

    public interface a {
        static {
            Covode.recordClassIndex(61394);
        }

        String a();
    }

    static {
        Covode.recordClassIndex(61393);
    }

    public final ISearchUserService e() {
        return (ISearchUserService) this.f96730m.getValue();
    }

    public static final class c {
        static {
            Covode.recordClassIndex(61400);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }

        public static String a(String str) {
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = p.b((CharSequence) str).toString();
                for (int i2 = 0; i2 < obj.length(); i2++) {
                    sb.append(com.github.a.a.a.a(obj.charAt(i2)));
                }
                String sb2 = sb.toString();
                if (sb2 == null) {
                    return "";
                }
                return sb2;
            }
            return "";
        }

        public static String b(String str) {
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = p.b((CharSequence) str).toString();
                for (int i2 = 0; i2 < obj.length(); i2++) {
                    sb.append(com.github.a.a.a.a(obj.charAt(i2)).charAt(0));
                }
                String sb2 = sb.toString();
                if (sb2 == null) {
                    return "";
                }
                return sb2;
            }
            return "";
        }
    }

    static final class d extends m implements h.f.a.a<ISearchUserService> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f96752a = new d();

        static {
            Covode.recordClassIndex(61401);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ISearchUserService invoke() {
            return SearchUserService.b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.a.b$b  reason: collision with other inner class name */
    public final class C2332b extends com.bytedance.ies.dmt.ui.a.a<IMUser> {

        /* renamed from: a  reason: collision with root package name */
        public TextView f96731a;

        /* renamed from: b  reason: collision with root package name */
        public FrameLayout f96732b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f96733c;

        /* renamed from: d  reason: collision with root package name */
        public AvatarImageWithVerify f96734d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f96735e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f96736f;

        /* renamed from: g  reason: collision with root package name */
        public TuxIconView f96737g;

        /* renamed from: h  reason: collision with root package name */
        public LinearLayout f96738h;

        /* renamed from: i  reason: collision with root package name */
        public int f96739i = -1;

        /* renamed from: j  reason: collision with root package name */
        public String f96740j = "";

        /* renamed from: k  reason: collision with root package name */
        public String f96741k = "";

        /* renamed from: l  reason: collision with root package name */
        public a f96742l;

        /* renamed from: m  reason: collision with root package name */
        final h.h f96743m = i.a((h.f.a.a) new c(this));
        public final View n;
        public final b o;
        final /* synthetic */ b p;
        private final h.h q = i.a((h.f.a.a) new C2333b(this));
        private final h.h r = i.a((h.f.a.a) new d(this));

        static {
            Covode.recordClassIndex(61395);
        }

        @Override // com.bytedance.ies.dmt.ui.a.a
        public final void a() {
        }

        public final int b() {
            return ((Number) this.q.getValue()).intValue();
        }

        /* access modifiers changed from: package-private */
        public final String c() {
            return (String) this.r.getValue();
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.a.b$b$b  reason: collision with other inner class name */
        static final class C2333b extends m implements h.f.a.a<Integer> {
            final /* synthetic */ C2332b this$0;

            static {
                Covode.recordClassIndex(61397);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2333b(C2332b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Integer invoke() {
                return Integer.valueOf(this.this$0.n.getResources().getColor(R.color.al));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.a.b$b$c */
        static final class c extends m implements h.f.a.a<String> {
            final /* synthetic */ C2332b this$0;

            static {
                Covode.recordClassIndex(61398);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C2332b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ String invoke() {
                String string = this.this$0.n.getResources().getString(R.string.cch);
                l.b(string, "");
                return string;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.a.b$b$d */
        static final class d extends m implements h.f.a.a<String> {
            final /* synthetic */ C2332b this$0;

            static {
                Covode.recordClassIndex(61399);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(C2332b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ String invoke() {
                String string = this.this$0.n.getResources().getString(R.string.bzz);
                l.b(string, "");
                return string;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.friends.a.b$b$a */
        public static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2332b f96744a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ User f96745b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ LogPbBean f96746c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f96747d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ boolean f96748e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f96749f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ Word f96750g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ z.e f96751h;

            static {
                Covode.recordClassIndex(61396);
            }

            a(C2332b bVar, User user, LogPbBean logPbBean, String str, boolean z, String str2, Word word, z.e eVar) {
                this.f96744a = bVar;
                this.f96745b = user;
                this.f96746c = logPbBean;
                this.f96747d = str;
                this.f96748e = z;
                this.f96749f = str2;
                this.f96750g = word;
                this.f96751h = eVar;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                String str3;
                ClickAgent.onClick(view);
                if (this.f96744a.p.f96729k.contains(this.f96745b.getUid())) {
                    View view2 = this.f96744a.itemView;
                    l.b(view2, "");
                    new com.bytedance.tux.g.b(view2).e(R.string.d3f).b();
                } else {
                    String str4 = null;
                    if (this.f96744a.f96739i == 0) {
                        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("search_keyword", this.f96744a.f96741k);
                        ac acVar = ac.a.f91473a;
                        LogPbBean logPbBean = this.f96746c;
                        if (logPbBean == null || (str2 = logPbBean.getImprId()) == null) {
                            a aVar = this.f96744a.f96742l;
                            if (aVar != null) {
                                str2 = aVar.a();
                            } else {
                                str2 = null;
                            }
                        }
                        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("log_pb", acVar.a(str2));
                        LogPbBean logPbBean2 = this.f96746c;
                        if (logPbBean2 == null || (str3 = logPbBean2.getImprId()) == null) {
                            a aVar2 = this.f96744a.f96742l;
                            if (aVar2 != null) {
                                str3 = aVar2.a();
                            } else {
                                str3 = null;
                            }
                        }
                        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("impr_id", str3);
                        String str5 = this.f96747d;
                        if (str5 == null) {
                            str5 = "";
                        }
                        com.ss.android.ugc.aweme.app.f.d a5 = a4.a("search_id", str5).a("relation_tag", this.f96745b.getFollowStatus());
                        l.b(a5, "");
                        r.b("add_video_at", com.ss.android.ugc.aweme.metrics.ac.a(eu.a(a5, this.f96745b).f66730a));
                    }
                    if (this.f96748e) {
                        com.ss.android.ugc.aweme.app.f.d a6 = new com.ss.android.ugc.aweme.app.f.d().a("search_position", this.f96744a.f96740j).a("new_sug_session_id", f.f96835a).a("impr_id", this.f96747d).a("raw_query", this.f96744a.f96741k).a("sug_user_id", this.f96745b.getUid()).a("user_tag", this.f96749f).a("words_position", this.f96744a.getAdapterPosition());
                        Word word = this.f96750g;
                        if (word != null) {
                            str = word.getWordSource();
                        } else {
                            str = null;
                        }
                        com.ss.android.ugc.aweme.app.f.d a7 = a6.a("words_source", str);
                        Word word2 = this.f96750g;
                        if (word2 != null) {
                            str4 = word2.getId();
                        }
                        r.a("trending_words_click", a7.a("group_id", str4).f66730a);
                    }
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g2, "");
                    if (!TextUtils.equals(g2.getCurUserId(), this.f96745b.getUid())) {
                        r.onEvent(MobClick.obtain().setEventName("at_friend").setLabelName("friend_list").setValue(this.f96745b.getUid()));
                        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.friends.c.e(this.f96745b));
                    } else {
                        View view3 = this.f96744a.itemView;
                        l.b(view3, "");
                        new com.bytedance.tux.g.b(view3).e(R.string.dh8).b();
                    }
                }
                r.a("tag_mention_head_click", new com.ss.android.ugc.aweme.app.f.d().a("previous_page", "video_edit_page").a("to_user_id", this.f96745b.getUid()).a("user_type", (String) this.f96751h.element).a("search_keyword", this.f96744a.f96741k).a("function", "mention").a("is_valid", String.valueOf(!this.f96744a.p.f96729k.contains(this.f96745b.getUid()) ? 1 : 0)).a("click_type", "choose").a("enter_from", "video_post_page").f66730a);
            }
        }

        public final void a(int i2, SummonFriendItem summonFriendItem) {
            float f2;
            ArrayList arrayList;
            l.d(summonFriendItem, "");
            View view = this.n;
            if (summonFriendItem.isMentionBlocked) {
                f2 = 0.3f;
            } else {
                f2 = 1.0f;
            }
            view.setAlpha(f2);
            List<Segment> list = summonFriendItem.segments;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(n.a((Iterable) list, 10));
                for (T t : list) {
                    l.b(t, "");
                    arrayList2.add(new Position(t.begin, t.end));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            User user = summonFriendItem.mUser;
            l.b(user, "");
            a(i2, user, arrayList, summonFriendItem.logPbBean, summonFriendItem.searchId, null, null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2332b(b bVar, View view, b bVar2) {
            super(view);
            l.d(view, "");
            l.d(bVar2, "");
            this.p = bVar;
            this.n = view;
            this.o = bVar2;
            View findViewById = view.findViewById(R.id.dwp);
            l.b(findViewById, "");
            this.f96731a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.brw);
            l.b(findViewById2, "");
            this.f96732b = (FrameLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.bnt);
            l.b(findViewById3, "");
            this.f96733c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.or);
            l.b(findViewById4, "");
            this.f96734d = (AvatarImageWithVerify) findViewById4;
            View findViewById5 = view.findViewById(R.id.cs_);
            l.b(findViewById5, "");
            this.f96735e = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.ak7);
            l.b(findViewById6, "");
            this.f96736f = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.dkc);
            l.b(findViewById7, "");
            this.f96737g = (TuxIconView) findViewById7;
            View findViewById8 = view.findViewById(R.id.brx);
            l.b(findViewById8, "");
            this.f96738h = (LinearLayout) findViewById8;
        }

        static SpannableString a(int i2, String str, String str2, int i3) {
            if (p.c((CharSequence) str2, '.')) {
                str2 = p.a(str2, ".", "\\.", false);
            }
            SpannableString spannableString = new SpannableString(str);
            try {
                Pattern compile = Pattern.compile(str2);
                if (compile == null) {
                    l.b();
                }
                Matcher matcher = compile.matcher(spannableString);
                if (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    if (start >= i3) {
                        spannableString.setSpan(new ForegroundColorSpan(i2), start, end, 33);
                    }
                }
                return spannableString;
            } catch (PatternSyntaxException e2) {
                e2.printStackTrace();
                return spannableString;
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(User user, LogPbBean logPbBean, String str, boolean z, String str2, Word word) {
            float f2;
            View view = this.itemView;
            l.b(view, "");
            View view2 = this.itemView;
            l.b(view2, "");
            view.setBackground(com.bytedance.ies.dmt.ui.common.c.c(view2.getContext()));
            FrameLayout frameLayout = this.f96732b;
            if (this.p.f96729k.contains(user.getUid())) {
                f2 = 0.3f;
            } else {
                f2 = 1.0f;
            }
            frameLayout.setAlpha(f2);
            this.n.setAlpha(1.0f);
            this.f96734d.setUserData(new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
            AvatarImageWithVerify avatarImageWithVerify = this.f96734d;
            View view3 = this.itemView;
            l.b(view3, "");
            i.a(avatarImageWithVerify, view3.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f96735e);
            if (MainServiceImpl.createIMainServicebyMonsterPlugin(false).shouldChangeToHandle("Message")) {
                this.f96735e.setVisibility(0);
                this.f96735e.setText(in.b(user));
                if (this.p.f96719a == 1) {
                    this.f96736f.setVisibility(8);
                } else {
                    this.f96736f.setVisibility(0);
                    this.f96736f.setText(in.j(user));
                }
            }
            if (!this.p.e().a() || user.getFollowStatus() != 2 || this.p.f96719a == 1) {
                this.f96737g.setVisibility(8);
            } else {
                this.f96737g.setVisibility(0);
                this.f96737g.setIconRes(R.raw.icon_person_arrow_left_right);
            }
            z.e eVar = new z.e();
            eVar.element = "all_user";
            List<? extends IMUser> list = this.p.f96720b;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (l.a((Object) user.getUid(), (Object) it.next().getUid())) {
                        eVar.element = "follow";
                    }
                }
            }
            this.f96733c.setVisibility(8);
            this.n.setOnClickListener(new a(this, user, logPbBean, str, z, str2, word, eVar));
            r.a("tag_mention_head_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "video_post_page").a("previous_page", "video_edit_page").a("to_user_id", user.getUid()).a("user_type", (String) eVar.element).a("search_keyword", this.f96741k).a("function", "mention").a("is_valid", String.valueOf(!this.p.f96729k.contains(user.getUid()) ? 1 : 0)).f66730a);
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, User user, List<? extends Position> list, LogPbBean logPbBean, String str, String str2, Word word) {
            int i3;
            List<? extends IMUser> list2 = this.o.f96720b;
            if (list2 != null) {
                i3 = list2.size();
            } else {
                i3 = 0;
            }
            if (i2 != i3 || this.p.f96719a == 1) {
                this.f96731a.setVisibility(8);
            } else {
                this.f96731a.setVisibility(0);
                this.f96731a.setText(R.string.vj);
            }
            if (this.p.f96719a == 1) {
                this.f96736f.setVisibility(8);
            } else {
                this.f96736f.setVisibility(0);
                this.f96736f.setText("@" + in.b(user));
            }
            if (this.p.f96719a == 1) {
                this.f96735e.setText(user.getNickname());
            } else {
                SpannableString spannableString = new SpannableString(user.getNickname());
                if (list != null) {
                    for (T t : list) {
                        int begin = t.getBegin();
                        int end = t.getEnd() + 1;
                        if (!TextUtils.isEmpty(spannableString)) {
                            int max = Math.max(0, begin);
                            if (!TextUtils.isEmpty(spannableString) && max <= end && max < spannableString.length() && end <= spannableString.length()) {
                                spannableString.setSpan(new ForegroundColorSpan(b()), max, end, 17);
                            }
                        }
                    }
                }
                this.f96735e.setText(spannableString);
            }
            a(user, logPbBean, str, true, str2, word);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c() {
        int i2;
        Integer valueOf;
        List<? extends IMUser> list = this.f96720b;
        int i3 = 0;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        List list2 = this.f96721c;
        if (!((list2 == null && (list2 = this.f96722d) == null) || (valueOf = Integer.valueOf(list2.size())) == null)) {
            i3 = valueOf.intValue();
        }
        return i2 + i3;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        if (this.f96719a == 1) {
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9n, viewGroup, false);
            l.b(a2, "");
            return new C2332b(this, a2, this);
        }
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9l, viewGroup, false);
        l.b(a3, "");
        return new C2332b(this, a3, this);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        int i3;
        String str;
        float f2;
        List<? extends IMUser> list = this.f96720b;
        if (list != null) {
            i3 = list.size();
        } else {
            i3 = 0;
        }
        if (viewHolder instanceof C2332b) {
            C2332b bVar = (C2332b) viewHolder;
            bVar.f96739i = this.f96726h;
            String str2 = this.f96727i;
            String str3 = "";
            l.d(str2, str3);
            bVar.f96740j = str2;
            String str4 = this.f96725g;
            l.d(str4, str3);
            bVar.f96741k = str4;
            bVar.f96742l = this.f96728j;
            float f3 = 1.0f;
            if (i2 < i3) {
                List<? extends IMUser> list2 = this.f96720b;
                if (list2 != null) {
                    IMUser iMUser = (IMUser) list2.get(i2);
                    l.d(iMUser, str3);
                    bVar.f96735e.setText(iMUser.getNickName());
                    if (i2 != 0 || bVar.p.f96719a == 1) {
                        bVar.f96731a.setVisibility(8);
                    } else {
                        bVar.f96731a.setVisibility(0);
                        bVar.f96731a.setText(R.string.vn);
                    }
                    if (bVar.p.f96719a == 1) {
                        bVar.f96736f.setVisibility(8);
                        bVar.f96735e.setText(iMUser.getDisplayName());
                    } else {
                        TextView textView = bVar.f96735e;
                        String str5 = bVar.o.f96725g;
                        l.d(iMUser, str3);
                        l.d(str5, str3);
                        String lowerCase = str5.toLowerCase();
                        l.b(lowerCase, str3);
                        String nickName = iMUser.getNickName();
                        if (!TextUtils.isEmpty(nickName)) {
                            l.b(nickName, str3);
                            Objects.requireNonNull(nickName, "null cannot be cast to non-null type java.lang.String");
                            String lowerCase2 = nickName.toLowerCase();
                            l.b(lowerCase2, str3);
                            int a2 = p.a((CharSequence) lowerCase2, lowerCase, 0, false, 6);
                            if (a2 != -1 && a2 < nickName.length() && lowerCase.length() + a2 <= nickName.length()) {
                                lowerCase = nickName.substring(a2, lowerCase.length() + a2);
                                l.b(lowerCase, str3);
                            }
                        }
                        int b2 = bVar.b();
                        String displayName = iMUser.getDisplayName();
                        l.b(displayName, str3);
                        textView.setText(C2332b.a(b2, displayName, lowerCase, 0));
                        TextView textView2 = bVar.f96736f;
                        String str6 = bVar.o.f96725g;
                        textView2.setVisibility(0);
                        if (iMUser.getSearchType() == 5) {
                            textView2.setText(iMUser.getSignature());
                        } else {
                            String str7 = "@";
                            if (iMUser.getSearchType() == 3) {
                                if (!TextUtils.isEmpty(iMUser.getRemarkName())) {
                                    textView2.setText(C2332b.a(bVar.b(), bVar.c() + iMUser.getNickName(), IMService.createIIMServicebyMonsterPlugin(false).convertSearchKeyword(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str6), bVar.c().length()));
                                } else if (!com.ss.android.ugc.aweme.language.d.c()) {
                                    textView2.setText(str7 + iMUser.getDisplayId());
                                } else {
                                    textView2.setText(iMUser.getSignature());
                                }
                            } else if (iMUser.getSearchType() == 1) {
                                if (com.ss.android.ugc.aweme.language.d.c()) {
                                    str7 = (String) bVar.f96743m.getValue();
                                }
                                String displayId = iMUser.getDisplayId();
                                textView2.setText(C2332b.a(bVar.b(), str7 + displayId, IMService.createIIMServicebyMonsterPlugin(false).convertSearchKeyword(displayId, c.a(displayId), c.b(displayId), str6), str7.length()));
                            } else if (iMUser.getSearchType() == 2) {
                                textView2.setText(C2332b.a(bVar.b(), str3, IMService.createIIMServicebyMonsterPlugin(false).convertSearchKeyword(iMUser.getContactName(), iMUser.getContactNamePinyin(), iMUser.getContactNameInitial(), str6), 6));
                            } else {
                                textView2.setVisibility(8);
                            }
                        }
                        if (TextUtils.isEmpty(textView2.getText())) {
                            textView2.setVisibility(8);
                        }
                    }
                    View view = bVar.n;
                    if (iMUser.isMentionEnabled()) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.3f;
                    }
                    view.setAlpha(f2);
                    bVar.a(a.b.a(iMUser), null, null, false, null, null);
                    return;
                }
                return;
            }
            List<? extends e> list3 = this.f96722d;
            if (list3 != null) {
                e eVar = (e) list3.get(i2 - i3);
                LogPbBean logPbBean = this.f96723e;
                String str8 = this.f96724f;
                l.d(eVar, str3);
                View view2 = bVar.n;
                if (eVar.f121524g.getMentionBlockType() == 1) {
                    f3 = 0.3f;
                }
                view2.setAlpha(f3);
                com.ss.android.ugc.aweme.search.model.i iVar = eVar.f121524g;
                l.b(iVar, str3);
                User user = new User();
                user.setUid(iVar.getUserId());
                user.setSecUid(iVar.getSecUserId());
                user.setNickname(iVar.getUserNickname());
                UrlModel urlModel = new UrlModel();
                urlModel.setUri(iVar.getUserAvatarUri());
                urlModel.setUrlList(n.b(iVar.getUserAvatarUri(), iVar.getUserAvatarUri()));
                user.setAvatarThumb(urlModel);
                ISearchUserService e2 = bVar.p.e();
                View view3 = bVar.itemView;
                l.b(view3, str3);
                user.setRelationLabel(e2.a(view3.getContext(), iVar.getUserRelationType()));
                user.setUniqueId(iVar.getUsername());
                if (iVar.isVerifiedUser()) {
                    str3 = "verified";
                }
                user.setCustomVerify(str3);
                bVar.a(i2, user, eVar.f121521d, logPbBean, str8, eVar.f121524g.getUserRelationType(), eVar.f121523f);
                com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("search_position", bVar.f96740j).a("new_sug_session_id", f.f96835a).a("impr_id", str8).a("raw_query", bVar.f96741k).a("sug_user_id", eVar.f121524g.getUserId()).a("user_tag", eVar.f121524g.getUserRelationType()).a("words_position", bVar.getAdapterPosition());
                Word word = eVar.f121523f;
                String str9 = null;
                if (word != null) {
                    str = word.getWordSource();
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.app.f.d a4 = a3.a("words_source", str);
                Word word2 = eVar.f121523f;
                if (word2 != null) {
                    str9 = word2.getId();
                }
                r.a("trending_words_show", a4.a("group_id", str9).f66730a);
                return;
            }
            List<? extends SummonFriendItem> list4 = this.f96721c;
            if (list4 != null) {
                bVar.a(i2, (SummonFriendItem) list4.get(i2 - i3));
            }
        }
    }
}
