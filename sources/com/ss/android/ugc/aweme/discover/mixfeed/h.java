package com.ss.android.ugc.aweme.discover.mixfeed;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.discover.mixfeed.d.g;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.discover.model.SearchOperationInfo;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.newfollow.b.a;
import java.util.List;

public class h extends a {

    /* renamed from: a  reason: collision with root package name */
    public String f81779a;
    @c(a = "user_list")

    /* renamed from: b  reason: collision with root package name */
    public List<SearchUser> f81780b;
    @c(a = "music_list")

    /* renamed from: c  reason: collision with root package name */
    public List<Music> f81781c;
    @c(a = "challenge_list")

    /* renamed from: d  reason: collision with root package name */
    public List<SearchChallenge> f81782d;
    @c(a = "has_top_user")

    /* renamed from: e  reason: collision with root package name */
    public boolean f81783e;
    @c(a = "related_word_list")

    /* renamed from: f  reason: collision with root package name */
    public List<g> f81784f;
    @c(a = "card_info")

    /* renamed from: g  reason: collision with root package name */
    public g f81785g;
    @c(a = "dynamic_patch")

    /* renamed from: h  reason: collision with root package name */
    public d f81786h;
    @c(a = "feature_account_title")

    /* renamed from: i  reason: collision with root package name */
    String f81787i;
    @c(a = "card_title")

    /* renamed from: j  reason: collision with root package name */
    String f81788j;
    @c(a = "activity_info")

    /* renamed from: k  reason: collision with root package name */
    public SearchOperationInfo f81789k;
    @c(a = "view_more")

    /* renamed from: l  reason: collision with root package name */
    public boolean f81790l = true;
    @c(a = "words_query_record")

    /* renamed from: m  reason: collision with root package name */
    public RecommendWordMob f81791m;
    @c(a = "hotspot_info")
    public q n;
    @c(a = "collection_live")
    public c o;
    public int p = -1;
    public LogPbBean q;
    public transient boolean r;
    public transient boolean s;
    public transient int t;
    @c(a = StringSet.type)
    private int u;
    @c(a = "aweme_info")
    private Aweme v;

    static {
        Covode.recordClassIndex(50802);
    }

    @Override // com.ss.android.ugc.aweme.newfollow.b.a
    public Aweme getAweme() {
        return this.v;
    }

    public final boolean a() {
        if (this.u == 1) {
            return true;
        }
        return false;
    }

    public final String b() {
        if (TextUtils.isEmpty(this.f81788j)) {
            return "";
        }
        return this.f81788j;
    }

    @Override // com.ss.android.ugc.aweme.newfollow.b.a
    public int getFeedType() {
        int i2 = this.u;
        if (i2 == 1) {
            return 65280;
        }
        if (i2 == 2) {
            return 65456;
        }
        if (i2 == 3) {
            return 65457;
        }
        if (i2 == 4) {
            return 65458;
        }
        if (i2 == 6) {
            return 1048336;
        }
        if (i2 == 12) {
            return 65467;
        }
        if (i2 == 46) {
            return 65515;
        }
        if (i2 != 998) {
            if (i2 != 999) {
                return i2;
            }
            return 65514;
        } else if (this.f81785g != null) {
            return 998;
        } else {
            return -1;
        }
    }

    public int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = this.u * 31;
        Aweme aweme = this.v;
        int i12 = 0;
        if (aweme != null) {
            i2 = aweme.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (i11 + i2) * 31;
        List<SearchUser> list = this.f81780b;
        if (list != null) {
            i3 = list.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 31;
        List<Music> list2 = this.f81781c;
        if (list2 != null) {
            i4 = list2.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 31;
        List<SearchChallenge> list3 = this.f81782d;
        if (list3 != null) {
            i5 = list3.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 31;
        List<g> list4 = this.f81784f;
        if (list4 != null) {
            i6 = list4.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (i16 + i6) * 31;
        d dVar = this.f81786h;
        if (dVar != null) {
            i7 = dVar.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 31;
        String str = this.f81787i;
        if (str != null) {
            i8 = str.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 31;
        g gVar = this.f81785g;
        if (gVar != null) {
            i9 = gVar.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 31;
        q qVar = this.n;
        if (qVar != null) {
            i10 = qVar.hashCode();
        } else {
            i10 = 0;
        }
        int i21 = (i20 + i10) * 31;
        c cVar = this.o;
        if (cVar != null) {
            i12 = cVar.hashCode();
        }
        return i21 + i12;
    }

    @Override // com.ss.android.ugc.aweme.newfollow.b.a
    public void setAweme(Aweme aweme) {
        this.v = aweme;
    }

    @Override // com.ss.android.ugc.aweme.newfollow.b.a
    public void setFeedType(int i2) {
        this.u = i2;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d, com.ss.android.ugc.aweme.newfollow.b.a
    public void setRequestId(String str) {
        super.setRequestId(str);
        Aweme aweme = this.v;
        if (aweme != null) {
            aweme.setRequestId(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.u == hVar.u && com.ss.android.ugc.aweme.base.utils.g.a(this.v, hVar.v) && com.ss.android.ugc.aweme.base.utils.g.a(this.f81780b, hVar.f81780b) && com.ss.android.ugc.aweme.base.utils.g.a(this.f81781c, hVar.f81781c) && com.ss.android.ugc.aweme.base.utils.g.a(this.f81782d, hVar.f81782d) && com.ss.android.ugc.aweme.base.utils.g.a(this.f81784f, hVar.f81784f) && com.ss.android.ugc.aweme.base.utils.g.a(this.f81786h, hVar.f81786h) && com.ss.android.ugc.aweme.base.utils.g.a(this.f81787i, hVar.f81787i) && com.ss.android.ugc.aweme.base.utils.g.a(this.n, hVar.n)) {
            return com.ss.android.ugc.aweme.base.utils.g.a(this.o, hVar.o);
        }
        return false;
    }
}
