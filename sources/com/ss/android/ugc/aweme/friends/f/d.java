package com.ss.android.ugc.aweme.friends.f;

import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.friends.f.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f96840a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96841b;

    /* renamed from: c  reason: collision with root package name */
    private final c.b f96842c;

    static {
        Covode.recordClassIndex(61451);
    }

    d(c cVar, String str, c.b bVar) {
        this.f96840a = cVar;
        this.f96841b = str;
        this.f96842c = bVar;
    }

    public final void run() {
        String str;
        c cVar = this.f96840a;
        String str2 = this.f96841b;
        c.b bVar = this.f96842c;
        try {
            str = cVar.f96837a.shortenUrl(str2).getUrl();
        } catch (Exception e2) {
            e2.printStackTrace();
            str = null;
        }
        if (!m.a(str)) {
            str2 = str;
        }
        a.b(new e(bVar, str2));
    }
}
