package com.ss.android.ugc.aweme.qrcode.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bw.a.a;
import com.ss.android.ugc.aweme.bw.a.b;
import com.ss.android.ugc.aweme.common.o;
import java.io.File;

public final class e extends b<com.ss.android.ugc.aweme.qrcode.d.b, a> implements o {
    static {
        Covode.recordClassIndex(77848);
    }

    public final File d() {
        if (this.f69566b != null) {
            return ((com.ss.android.ugc.aweme.qrcode.d.b) this.f69566b).b();
        }
        return null;
    }

    public final boolean a() {
        if (this.f69566b != null) {
            return ((com.ss.android.ugc.aweme.qrcode.d.b) this.f69566b).a();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.o
    public final void c() {
        if (this.f69567c == null) {
            return;
        }
        if (((a) this.f69566b).mData == null) {
            ((a) this.f69567c).a(new Exception());
        } else {
            ((a) this.f69567c).a((com.ss.android.ugc.aweme.qrcode.d.a) ((a) this.f69566b).mData);
        }
    }

    public final void a(String str) {
        if (this.f69566b != null) {
            ((com.ss.android.ugc.aweme.qrcode.d.b) this.f69566b).a(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f69567c != null) {
            ((a) this.f69567c).a(exc);
        }
    }

    public e(com.ss.android.ugc.aweme.qrcode.d.b bVar, a aVar) {
        super(bVar, aVar);
        bVar.addNotifyListener(this);
    }

    public final void a(int i2, String str) {
        ((com.ss.android.ugc.aweme.qrcode.d.b) this.f69566b).a(i2, str);
    }
}
