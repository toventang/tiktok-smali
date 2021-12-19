package com.ttnet.org.chromium.net;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.base.ApplicationStatus;
import com.ttnet.org.chromium.base.h;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;

public final class s extends NetworkChangeNotifierAutoDetect.f implements ApplicationStatus.b {

    /* renamed from: b  reason: collision with root package name */
    private boolean f155836b;

    static {
        Covode.recordClassIndex(103552);
    }

    /* access modifiers changed from: protected */
    @Override // com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.f
    public final void c() {
        if (!this.f155836b) {
            h<ApplicationStatus.b> hVar = ApplicationStatus.f155106e;
            int indexOf = hVar.f155241a.indexOf(this);
            if (indexOf != -1) {
                if (hVar.f155242b == 0) {
                    hVar.f155241a.remove(indexOf);
                } else {
                    hVar.f155244d = true;
                    hVar.f155241a.set(indexOf, null);
                }
                hVar.f155243c--;
                if (!h.f155240e && hVar.f155243c < 0) {
                    throw new AssertionError();
                }
            }
            this.f155836b = true;
        }
    }

    @Override // com.ttnet.org.chromium.base.ApplicationStatus.b
    public final void a(int i2) {
        if (i2 == 1) {
            a();
        } else if (i2 == 2) {
            b();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.f
    public final void a(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        super.a(networkChangeNotifierAutoDetect);
        ApplicationStatus.a(this);
        a(ApplicationStatus.getStateForApplication());
    }
}
