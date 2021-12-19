package com.ss.android.ugc.aweme.feed.guide;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.dw;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private CopyOnWriteArrayList<String> f93248a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f93249b;

    static {
        Covode.recordClassIndex(59132);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final h f93250a = new h((byte) 0);

        static {
            Covode.recordClassIndex(59133);
        }
    }

    private h() {
        SharedPreferences a2 = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "sp_show_share_guide_cache", 0);
        this.f93249b = a2;
        try {
            this.f93248a = (CopyOnWriteArrayList) dw.b(a2.getString("cached_video_id", ""), String.class);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (this.f93248a == null) {
            this.f93248a = new CopyOnWriteArrayList<>();
        }
    }

    /* synthetic */ h(byte b2) {
        this();
    }

    public final boolean a(String str) {
        return this.f93248a.contains(str);
    }

    public final void b(String str) {
        if (!TextUtils.isEmpty(str) && !this.f93248a.contains(str)) {
            if (this.f93248a.size() >= 20) {
                this.f93248a.remove(0);
            }
            this.f93248a.add(str);
            try {
                this.f93249b.edit().putString("cached_video_id", dw.a(this.f93248a)).apply();
            } catch (NullPointerException unused) {
            }
        }
    }

    public final void a(List<Aweme> list) {
        if (!(b.a((Collection) list) || list.size() < 3 || this.f93249b.getBoolean("sp_cached_first_three_video", false))) {
            for (Aweme aweme : list.subList(0, 3)) {
                b(aweme.getAid());
            }
            this.f93249b.edit().putBoolean("sp_cached_first_three_video", true).apply();
        }
    }
}
