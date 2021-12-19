package com.ss.android.ugc.aweme.main.replace;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;

public class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f109284d;

    static {
        Covode.recordClassIndex(69999);
    }

    @Override // com.ss.android.ugc.aweme.main.replace.a
    public final String a() {
        List<String> list = this.f109284d;
        if (list != null) {
            return TextUtils.join(", ", list);
        }
        return "";
    }

    public b(List<String> list, String str) {
        super(str);
        this.f109284d = list;
    }
}
