package com.ss.android.ugc.aweme.qrcode.c;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final List<d> f119722a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public static final b f119723b = new b();

    @Override // com.ss.android.ugc.aweme.qrcode.c.d
    public final String a() {
        return "web";
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(77772);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.c.d
    public final boolean a(String str, int i2) {
        ArrayList<d> arrayList = new ArrayList();
        arrayList.addAll(f119722a);
        for (d dVar : arrayList) {
            dVar.a(str, i2);
        }
        return false;
    }
}
