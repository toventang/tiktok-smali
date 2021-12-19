package com.ss.android.ugc.aweme.feed.u;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.app.api.b.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public class p extends u {

    /* renamed from: a  reason: collision with root package name */
    private Aweme f94059a;

    /* renamed from: b  reason: collision with root package name */
    private int f94060b;

    /* renamed from: c  reason: collision with root package name */
    private int f94061c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f94062d;

    /* renamed from: f  reason: collision with root package name */
    private Activity f94063f;

    static {
        Covode.recordClassIndex(59789);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.u.p.c():void");
    }

    public p(Activity activity) {
        this.f94063f = activity;
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public void a_(Exception exc) {
        Throwable a2 = a.a((Throwable) exc);
        if (a2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) a2;
            if (!TextUtils.isEmpty(aVar.getErrorMsg())) {
                new b(this.f94063f).a(aVar.getErrorMsg()).b();
                return;
            }
        }
        super.a_(exc);
    }

    @Override // com.ss.android.ugc.aweme.feed.u.u
    public final void a(Aweme aweme, int i2) {
        this.f94059a = aweme;
        this.f94061c = aweme.getStatus().getPrivateStatus();
        this.f94060b = i2;
    }
}
