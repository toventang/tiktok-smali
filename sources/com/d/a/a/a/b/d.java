package com.d.a.a.a.b;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final j f46337a;

    /* renamed from: b  reason: collision with root package name */
    public final WebView f46338b;

    /* renamed from: c  reason: collision with root package name */
    public final List<k> f46339c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, k> f46340d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final String f46341e;

    /* renamed from: f  reason: collision with root package name */
    public final String f46342f;

    /* renamed from: g  reason: collision with root package name */
    public final String f46343g;

    /* renamed from: h  reason: collision with root package name */
    public final e f46344h;

    static {
        Covode.recordClassIndex(28301);
    }

    public d(j jVar, String str, List<k> list, String str2, e eVar) {
        ArrayList arrayList = new ArrayList();
        this.f46339c = arrayList;
        this.f46337a = jVar;
        this.f46338b = null;
        this.f46341e = str;
        this.f46344h = eVar;
        if (list != null) {
            arrayList.addAll(list);
            for (k kVar : list) {
                this.f46340d.put(UUID.randomUUID().toString(), kVar);
            }
        }
        this.f46343g = str2;
        this.f46342f = null;
    }
}
