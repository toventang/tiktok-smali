package com.ss.android;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f59521a;

    /* renamed from: b  reason: collision with root package name */
    public final int f59522b;

    /* renamed from: c  reason: collision with root package name */
    public final List<g> f59523c;

    /* renamed from: d  reason: collision with root package name */
    public final String f59524d;

    static {
        Covode.recordClassIndex(36749);
    }

    public h(String str, int i2, List<g> list, String str2) {
        this.f59521a = str;
        this.f59522b = i2;
        this.f59523c = Collections.unmodifiableList(new ArrayList(list));
        this.f59524d = str2;
    }
}
