package com.ss.android.ugc.aweme.comment.m;

import android.app.Activity;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.emoji.i.b.b;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.x.y;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.metrics.ae;
import com.ss.android.ugc.aweme.metrics.h;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.eu;
import com.ss.android.ugc.aweme.utils.w;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f72092a = new c();

    public static final void a(Aweme aweme, String str, String str2, String str3, String str4, Comment comment, String str5, String str6, int i2, String str7, String str8, String str9, String str10, boolean z, boolean z2, String str11, String str12, String str13, String str14, String str15, String str16, boolean z3, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29) {
        a(aweme, str, str2, str3, str4, comment, str5, str6, i2, str7, str8, str9, str10, z, z2, str11, str12, str13, str14, str15, str16, z3, str17, str18, str19, 1, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, null, 0, 32);
    }

    private c() {
    }

    public static final void a(String str, String str2, String str3, String str4, String str5, long j2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        d a2 = a(str, str2);
        a2.a("enter_from", str);
        a2.a("group_id", str2);
        a2.a("author_id", str3);
        a2.a("send_user_id", str4);
        a2.a("comment_id", str5);
        a2.a("gift_id", j2);
        r.a("show_gift_comment", a2.f66730a);
    }

    public static final void a(String str, String str2, String str3, String str4, long j2) {
        l.d(str4, "");
        r.a("comment_latency", new d().a("enter_from", str3).a("duration", j2).a("result", str4).a("author_id", str2).a("group_id", str).f66730a);
    }

    public static final void a(String str, String str2, String str3, String str4, int i2) {
        d dVar = new d();
        dVar.a("enter_method", str).a("enter_from", str2).a("group_id", str3).a("author_id", str4).a("is_others_video", i2);
        r.a("reply_via_video_show", dVar.f66730a);
    }

    public static final void a(boolean z, Comment comment, String str, String str2, String str3) {
        String str4;
        l.d(comment, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        if (z) {
            str4 = "pin_comment";
        } else {
            str4 = "unpin_comment";
        }
        d a2 = new d().a("enter_from", str).a("comment_id", comment.getCid()).a("author_id", str2);
        User user = comment.getUser();
        l.b(user, "");
        r.a(str4, a2.a("to_user_id", user.getUid()).a("group_id", str3).f66730a);
    }

    public static final void a(String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        r.a("click_pin_comment_popup", new d().a("enter_from", str).a("target", str2).a("author_id", str3).a("group_id", str4).f66730a);
    }

    static {
        Covode.recordClassIndex(44284);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f72093a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f72094b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f72095c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f72096d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f72097e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f72098f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f72099g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f72100h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f72101i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f72102j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f72103k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ String f72104l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ User f72105m;
        final /* synthetic */ String n;
        final /* synthetic */ int o;
        final /* synthetic */ int p;
        final /* synthetic */ String q;
        final /* synthetic */ String r;

        static {
            Covode.recordClassIndex(44285);
        }

        a(String str, String str2, String str3, long j2, int i2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, User user, String str11, int i3, int i4, String str12, String str13) {
            this.f72093a = str;
            this.f72094b = str2;
            this.f72095c = str3;
            this.f72096d = j2;
            this.f72097e = i2;
            this.f72098f = str4;
            this.f72099g = str5;
            this.f72100h = str6;
            this.f72101i = str7;
            this.f72102j = str8;
            this.f72103k = str9;
            this.f72104l = str10;
            this.f72105m = user;
            this.n = str11;
            this.o = i3;
            this.p = i4;
            this.q = str12;
            this.r = str13;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.bytedance.ies.ugc.appcontext.d.a();
            r.a("comment_duration", this.f72093a, this.f72094b, this.f72095c, new com.ss.android.ugc.aweme.app.f.c().a("duration", Long.valueOf(this.f72096d)).a());
            d a2 = c.a(this.f72093a, this.f72094b).a("parent_comment_id", this.f72095c).a("parent_position", this.f72097e).a("relation_label_type", this.f72098f).a("label_type", this.f72099g).a("duration", this.f72096d).a("relation", this.f72100h);
            String str = this.f72101i;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            d a3 = a2.a("comment_id", str).a("comment_level", this.f72102j).a("comment_author_level", this.f72103k).a("user_level", this.f72104l);
            l.b(a3, str2);
            d a4 = eu.a(a3, this.f72105m);
            if (!TextUtils.isEmpty(this.n)) {
                a4.a("secondary_comment_id", this.n).a("secondary_position", this.o);
            }
            int i2 = this.p;
            if (i2 != 0) {
                a4.a("is_long_item", i2);
            }
            if (ac.a(this.f72093a)) {
                a4.a("log_pb", ac.a.f91473a.a(this.q));
                if (!TextUtils.isEmpty(this.r)) {
                    str2 = this.r;
                }
                a4.a("comment_user_id", str2);
                r.a("comment_duration", com.ss.android.ugc.aweme.metrics.ac.a(a4.f66730a));
            } else {
                r.a("comment_duration", a4.f66730a);
            }
            return z.f158842a;
        }
    }

    public static final void a(String str, int i2) {
        l.d(str, "");
        r.a("tap_video_reply_comment", new d().a("enter_from", str).a("is_others_video", i2).f66730a);
    }

    public static d a(String str, String str2) {
        d dVar = new d();
        dVar.a("enter_from", str).a("group_id", str2);
        Aweme b2 = AwemeService.b().b(str2);
        if (b2 != null) {
            dVar.a("author_id", b2.getAuthorUid());
        }
        l.b(dVar, "");
        return dVar;
    }

    public static final void b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        r.a("delete_video_comment", new d().a("enter_from", str).a("target", str2).a("comment_cnt", 1).f66730a);
    }

    public static final void a(String str, int i2, Comment comment) {
        String str2;
        l.d(str, "");
        l.d(comment, "");
        if (i2 == 1) {
            str2 = "favorite_comment";
        } else {
            str2 = "cancel_favorite_comment";
        }
        d a2 = new d().a("enter_from", str).a("comment_id", comment.getCid());
        User user = comment.getUser();
        l.b(user, "");
        r.a(str2, a2.a("to_user_id", user.getUid()).a("group_id", comment.getAwemeId()).f66730a);
    }

    public static final void a(String str, String str2, int i2, String str3, String str4, String str5) {
        String str6;
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        if (i2 == 1) {
            str6 = "favorite_comment";
        } else {
            str6 = "cancel_favorite_comment";
        }
        r.a(str6, new d().a("enter_from", str).a("enter_method", str2).a("comment_id", str3).a("to_user_id", str4).a("group_id", str5).f66730a);
    }

    public static final void a(String str, String str2, String str3, String str4, String str5, int i2, LogPbBean logPbBean) {
        r.a("click_comment_emoji", a(str, str2, str3, str4, str5, Integer.valueOf(i2), logPbBean).f66730a);
    }

    public static final void b(String str, String str2, String str3, String str4, String str5, int i2, LogPbBean logPbBean) {
        r.a("show_comment_emoji", a(str, str2, str3, str4, str5, Integer.valueOf(i2), logPbBean).f66730a);
    }

    private static d a(String str, String str2, String str3, String str4, String str5, Integer num, LogPbBean logPbBean) {
        d a2 = new d().a("emoji_type", str);
        if (TextUtils.equals(str, "recommend")) {
            a2.a("group_id", str2).a("author_id", str3).a("emoji_uri", str5).a("position", num).a("log_pb", logPbBean);
        } else if (TextUtils.equals(str, "search")) {
            a2.a("group_id", str2).a("author_id", str3).a("search_keyword", str4).a("emoji_uri", str5).a("position", num).a("log_pb", logPbBean);
        }
        l.b(a2, "");
        return a2;
    }

    public static final void a(User user, String str, String str2, String str3, int i2, String str4, int i3, long j2, String str5, int i4, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        l.d(str11, "");
        l.d(str12, "");
        l.d(str13, "");
        i.b(new a(str, str2, str3, j2, i2, str7, str6, str9, str10, str11, str13, str12, user, str4, i3, i4, str5, str8), r.a());
    }

    public static /* synthetic */ void a(Aweme aweme, String str, String str2, String str3, String str4, Comment comment, String str5, String str6, int i2, String str7, String str8, String str9, String str10, boolean z, boolean z2, String str11, String str12, String str13, String str14, String str15, String str16, boolean z3, String str17, String str18, String str19, int i3, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, int i4, int i5) {
        String str31;
        int i6;
        int i7;
        User user;
        String str32;
        int i8 = i2;
        String str33 = str8;
        String str34 = str7;
        String str35 = str4;
        String str36 = str29;
        String str37 = str30;
        String str38 = str16;
        String str39 = str19;
        String str40 = str13;
        String str41 = str25;
        boolean z4 = z;
        String str42 = str21;
        String str43 = str10;
        String str44 = str9;
        boolean z5 = z2;
        String str45 = str17;
        String str46 = str26;
        String str47 = str28;
        int i9 = i3;
        String str48 = str14;
        String str49 = str18;
        String str50 = str27;
        String str51 = str15;
        String str52 = str20;
        String str53 = str11;
        String str54 = str23;
        String str55 = str12;
        String str56 = str24;
        if ((i4 & 256) != 0) {
            i8 = 0;
        }
        String str57 = "";
        if ((i4 & 512) != 0) {
            str34 = str57;
        }
        if ((i4 & 1024) != 0) {
            str33 = str57;
        }
        if ((i4 & 2048) != 0) {
            str44 = str57;
        }
        if ((i4 & 4096) != 0) {
            str43 = str57;
        }
        if ((i4 & 8192) != 0) {
            z4 = false;
        }
        if ((i4 & 16384) != 0) {
            z5 = false;
        }
        if ((32768 & i4) != 0) {
            str53 = str57;
        }
        if ((65536 & i4) != 0) {
            str55 = str57;
        }
        if ((131072 & i4) != 0) {
            str40 = str57;
        }
        if ((262144 & i4) != 0) {
            str48 = str57;
        }
        if ((524288 & i4) != 0) {
            str51 = str57;
        }
        if ((1048576 & i4) != 0) {
            str38 = str57;
        }
        if ((2097152 & i4) != 0) {
            z3 = false;
        }
        if ((4194304 & i4) != 0) {
            str45 = str57;
        }
        if ((16777216 & i4) != 0) {
            str49 = str57;
        }
        if ((33554432 & i4) != 0) {
            str39 = str57;
        }
        if ((67108864 & i4) != 0) {
            i9 = 1;
        }
        if ((134217728 & i4) != 0) {
            str52 = str57;
        }
        if ((268435456 & i4) != 0) {
            str42 = str57;
        }
        if ((536870912 & i4) != 0) {
            str22 = str57;
        }
        if ((1073741824 & i4) != 0) {
            str54 = str57;
        }
        if ((i4 & Integer.MIN_VALUE) != 0) {
            str56 = str57;
        }
        if ((i5 & 1) != 0) {
            str41 = str57;
        }
        if ((i5 & 2) != 0) {
            str46 = str57;
        }
        if ((i5 & 4) != 0) {
            str50 = str57;
        }
        if ((i5 & 8) != 0) {
            str47 = str57;
        }
        if ((i5 & 16) != 0) {
            str36 = str57;
        }
        if ((i5 & 32) != 0) {
            str37 = str57;
        }
        l.d(aweme, str57);
        l.d(str, str57);
        l.d(str2, str57);
        l.d(str3, str57);
        l.d(str6, str57);
        l.d(str45, str57);
        l.d(str49, str57);
        l.d(str39, str57);
        l.d(str52, str57);
        String str58 = "trending_page";
        if (!TextUtils.equals(str2, str58) || str40 == null) {
            str31 = str2;
        } else {
            str31 = str40;
        }
        if (TextUtils.equals(str2, "homepage_fresh_topic")) {
            str31 = "homepage_fresh_topic";
        }
        if (TextUtils.equals(str2, "homepage_fresh_topic") || !z3) {
            str58 = str2;
        }
        ae a2 = new ae().a(str58);
        a2.v = str31;
        a2.f109472d = str34;
        ae f2 = a2.g(aweme);
        if (i9 == 3) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        f2.aa = i6;
        f2.f109470b = str3;
        f2.u = str43;
        f2.t = str44;
        f2.s = str33;
        ae aeVar = (ae) f2.c(str53).d(str55);
        if (str35 == null) {
            str35 = str57;
        }
        aeVar.f109469a = str35;
        if (comment != null) {
            aeVar.f109469a = comment.getCid();
            if (comment.getUser() != null) {
                aeVar.ac = comment.getUser().getUid();
                aeVar.ab = comment.getUser().getFollowStatus();
            }
        }
        aeVar.p = str5;
        aeVar.r = z4;
        aeVar.f109471c = str6;
        aeVar.q = i8;
        int i10 = z5 ? 1 : 0;
        int i11 = z5 ? 1 : 0;
        int i12 = z5 ? 1 : 0;
        aeVar.Z = i10;
        aeVar.ad = str48;
        aeVar.ae = str51;
        ae aeVar2 = (ae) aeVar.o(str38).b(Boolean.valueOf(z3));
        aeVar2.ag = str45;
        aeVar2.ah = 0;
        aeVar2.ai = str49;
        aeVar2.aj = str39;
        aeVar2.f109473e = str52;
        if (str42 == null) {
            str42 = str57;
        }
        h l2 = aeVar2.l(str42);
        if (str22 != null) {
            str57 = str22;
        }
        ae aeVar3 = (ae) l2.f(str57);
        com.bytedance.ies.ugc.appcontext.d.a();
        if (b.c(str) == 1) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        aeVar3.ah = i7;
        aeVar3.ak = str54;
        aeVar3.al = str56;
        aeVar3.af = com.ss.android.ugc.aweme.story.b.h.a(aweme.getAuthor());
        if (comment != null) {
            user = comment.getUser();
        } else {
            user = null;
        }
        aeVar3.an = com.ss.android.ugc.aweme.story.b.h.a(user);
        if (com.ss.android.ugc.aweme.story.d.a.d(aweme)) {
            str32 = "story";
        } else {
            str32 = UGCMonitor.TYPE_POST;
        }
        aeVar3.ao = str32;
        aeVar3.ap = com.ss.android.ugc.aweme.story.d.a.b(aweme);
        aeVar3.ar = str41;
        aeVar3.as = str46;
        aeVar3.au = str47;
        aeVar3.av = str36;
        aeVar3.aw = str37;
        ae aeVar4 = (ae) com.ss.android.ugc.aweme.upvote.event.c.a(aeVar3, aweme, str2);
        if (!(str50 == null || str50.length() == 0)) {
            aeVar4.at = str50;
        }
        Activity j2 = f.j();
        if (j2 != null) {
            aeVar4.n(y.a(str40, FeedParamProvider.a.a(j2).getFromGroupId()));
        }
        aeVar4.a(w.a(aweme, "post_comment", str58)).f();
    }
}
