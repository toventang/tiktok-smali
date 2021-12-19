package com.ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.util.a;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f132281a;

    /* renamed from: b  reason: collision with root package name */
    private final String f132282b;

    /* renamed from: c  reason: collision with root package name */
    private final String f132283c;

    /* renamed from: d  reason: collision with root package name */
    private final String f132284d;

    static {
        Covode.recordClassIndex(86640);
    }

    d(Context context, String str, String str2, String str3) {
        this.f132281a = context;
        this.f132282b = str;
        this.f132283c = str2;
        this.f132284d = str3;
    }

    public final void run() {
        Context context = this.f132281a;
        String str = this.f132282b;
        String str2 = this.f132283c;
        String str3 = this.f132284d;
        a b2 = a.b(context, str);
        a.b a2 = b2.a(b2.f132189d, "leaving");
        if (a2 != null && b2.f132186a != null) {
            if (b2.f132186a == null) {
                l.b();
            }
            bj.d("\n".concat("av-performance\n"));
            String str4 = b2.f132190e;
            int i2 = b2.f132187b;
            a.b bVar = b2.f132186a;
            if (bVar == null) {
                l.b();
            }
            long j2 = bVar.f132191a;
            long j3 = a2.f132191a;
            a.b bVar2 = b2.f132186a;
            if (bVar2 == null) {
                l.b();
            }
            long j4 = bVar2.f132193c;
            long j5 = a2.f132193c;
            a.b bVar3 = b2.f132186a;
            if (bVar3 == null) {
                l.b();
            }
            long j6 = bVar3.f132192b;
            long j7 = a2.f132192b;
            l.d(str4, "");
            com.ss.android.ugc.aweme.utils.d.a("scene_memory_usage", new b().a("creation_id", str3).a("shoot_way", str2).a("scene_name", str4 + "_page").a("finish_count", i2).a("app_memory_end", j3).a("app_memory_start", j2).a("app_memory_change", j2 - j3).a("available_memory_start", j4).a("available_memory_end", j5).a("available_memory_change", j4 - j5).a("used_memory_start", j6).a("used_memory_end", j7).a("used_memory_change", j6 - j7).f149193a);
        }
    }
}
