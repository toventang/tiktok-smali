package com.ss.android.ugc.aweme.follow.c.a.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a implements Cloneable {
    @c(a = "user_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f96215a;
    @c(a = "recommend_item_list")

    /* renamed from: b  reason: collision with root package name */
    public final List<Aweme> f96216b;

    /* renamed from: c  reason: collision with root package name */
    public User f96217c;

    /* renamed from: d  reason: collision with root package name */
    public int f96218d;

    static {
        Covode.recordClassIndex(60954);
    }

    public final String toString() {
        return "RecommendFollowStruct(uid=" + this.f96215a + ", awemeList=" + this.f96216b + ", user=" + this.f96217c + ", index=" + this.f96218d + ")";
    }

    public final int hashCode() {
        return this.f96215a.hashCode();
    }

    /* renamed from: a */
    public final a clone() {
        String str = this.f96215a;
        List<Aweme> a2 = a(this.f96216b);
        User clone = this.f96217c.clone();
        l.b(clone, "");
        return new a(str, a2, clone, this.f96218d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return TextUtils.equals(((a) obj).f96215a, this.f96215a);
    }

    private static List<Aweme> a(List<Aweme> list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AwemeService.b().a(it.next().clone()));
        }
        return arrayList;
    }

    private a(String str, List<Aweme> list, User user, int i2) {
        l.d(str, "");
        l.d(list, "");
        l.d(user, "");
        this.f96215a = str;
        this.f96216b = list;
        this.f96217c = user;
        this.f96218d = i2;
    }
}
