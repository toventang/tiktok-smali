package com.bytedance.lighten.a.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f39811a = new ArrayList();

    static {
        Covode.recordClassIndex(24568);
    }

    public final boolean a() {
        List<String> list = this.f39811a;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public a(List<String> list) {
        if (!(list == null || list.isEmpty())) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    this.f39811a.add(str);
                }
            }
        }
    }
}
