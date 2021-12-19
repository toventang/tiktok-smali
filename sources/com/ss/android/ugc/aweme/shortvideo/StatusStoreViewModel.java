package com.ss.android.ugc.aweme.shortvideo;

import androidx.c.a;
import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public class StatusStoreViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f124772a = new a();

    static {
        Covode.recordClassIndex(81984);
    }

    @Override // androidx.lifecycle.ac
    public void onCleared() {
        super.onCleared();
        this.f124772a.clear();
    }

    public final <T> void a(String str, T t) {
        this.f124772a.put(str, t);
    }
}
