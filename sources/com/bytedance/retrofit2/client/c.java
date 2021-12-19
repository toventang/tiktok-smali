package com.bytedance.retrofit2.client;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f42473a;

    /* renamed from: b  reason: collision with root package name */
    public final int f42474b;

    /* renamed from: c  reason: collision with root package name */
    public final String f42475c;

    /* renamed from: d  reason: collision with root package name */
    public final List<b> f42476d;

    /* renamed from: e  reason: collision with root package name */
    public final TypedInput f42477e;

    /* renamed from: f  reason: collision with root package name */
    public Object f42478f;

    static {
        Covode.recordClassIndex(26012);
    }

    public final boolean a() {
        int i2 = this.f42474b;
        if (i2 < 200 || i2 >= 300) {
            return false;
        }
        return true;
    }

    public final b a(String str) {
        List<b> list = this.f42476d;
        if (list == null) {
            return null;
        }
        for (b bVar : list) {
            if (str.equalsIgnoreCase(bVar.f42471a)) {
                return bVar;
            }
        }
        return null;
    }

    public final List<b> b(String str) {
        List<b> list;
        ArrayList arrayList = null;
        if (!(str == null || (list = this.f42476d) == null)) {
            for (b bVar : list) {
                if (str.equalsIgnoreCase(bVar.f42471a)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    public c(String str, int i2, String str2, List<b> list, TypedInput typedInput) {
        if (str == null) {
            throw new IllegalArgumentException("url == null");
        } else if (i2 < 200) {
            throw new IllegalArgumentException("Invalid status code: ".concat(String.valueOf(i2)));
        } else if (str2 == null) {
            throw new IllegalArgumentException("reason == null");
        } else if (list != null) {
            this.f42473a = str;
            this.f42474b = i2;
            this.f42475c = str2;
            this.f42476d = Collections.unmodifiableList(new ArrayList(list));
            this.f42477e = typedInput;
        } else {
            throw new IllegalArgumentException("headers == null");
        }
    }
}
