package com.ss.android.ugc.aweme.shortvideo.reaction.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;

public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f129969a;

    static {
        Covode.recordClassIndex(85301);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.reaction.a.a
    public final String b() {
        List<String> list = this.f129969a;
        if (list != null) {
            return TextUtils.join(", ", list);
        }
        return "";
    }

    public b(List<String> list, String str) {
        super(str);
        this.f129969a = list;
    }
}
