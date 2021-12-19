package com.ss.android.ugc.aweme.friends.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.c.f;
import com.bytedance.jedi.a.j.b;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import f.a.ab;
import f.a.t;
import java.util.List;

public abstract class a extends b {
    static {
        Covode.recordClassIndex(61456);
    }

    public abstract ab<String> a(String str, String str2);

    public abstract t<f<List<com.ss.android.ugc.aweme.user.repository.b>>> a(int i2);

    public abstract t<RecommendUserDialogList> a(Integer num, Integer num2, String str);

    public abstract t<RecommendList> a(Integer num, Integer num2, String str, int i2, Integer num3, Integer num4, String str2, Integer num5, String str3);

    public abstract t<RecommendList> b(Integer num, Integer num2, String str, int i2, Integer num3, Integer num4, String str2, Integer num5, String str3);
}
