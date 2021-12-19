package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class ea implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f51460a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f51461b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f51462c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Object f51463d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Object f51464e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ eb f51465f;

    static {
        Covode.recordClassIndex(32195);
    }

    public final void run() {
        em b2 = this.f51465f.z.b();
        if (b2.w()) {
            if (this.f51465f.f51466a == 0) {
                if (this.f51465f.s().e()) {
                    eb ebVar = this.f51465f;
                    ebVar.t();
                    ebVar.f51466a = 'C';
                } else {
                    eb ebVar2 = this.f51465f;
                    ebVar2.t();
                    ebVar2.f51466a = 'c';
                }
            }
            if (this.f51465f.f51467b < 0) {
                eb ebVar3 = this.f51465f;
                ebVar3.s();
                ebVar3.f51467b = 31000;
            }
            char charAt = "01VDIWEA?".charAt(this.f51460a);
            char c2 = this.f51465f.f51466a;
            long j2 = this.f51465f.f51467b;
            String a2 = eb.a(true, this.f51461b, this.f51462c, this.f51463d, this.f51464e);
            String sb = new StringBuilder(String.valueOf(a2).length() + 24).append("2").append(charAt).append(c2).append(j2).append(":").append(a2).toString();
            if (sb.length() > 1024) {
                sb = this.f51461b.substring(0, 1024);
            }
            b2.f51521c.a(sb);
        }
    }

    ea(eb ebVar, int i2, String str, Object obj, Object obj2, Object obj3) {
        this.f51465f = ebVar;
        this.f51460a = i2;
        this.f51461b = str;
        this.f51462c = obj;
        this.f51463d = obj2;
        this.f51464e = obj3;
    }
}
