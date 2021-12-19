package com.ss.android.ugc.aweme.base;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public String f68144a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f68145b = new ArrayList();

    static {
        Covode.recordClassIndex(41984);
    }

    public final boolean a() {
        List<String> list = this.f68145b;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public l(String str, List<String> list) {
        this.f68144a = str;
        if (!(list == null || list.isEmpty())) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    this.f68145b.add(str2);
                }
            }
        }
    }
}
