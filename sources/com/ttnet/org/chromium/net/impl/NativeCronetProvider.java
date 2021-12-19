package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.c;
import com.ttnet.org.chromium.net.e;
import com.ttnet.org.chromium.net.g;
import java.util.Arrays;

public class NativeCronetProvider extends e {
    static {
        Covode.recordClassIndex(103475);
    }

    @Override // com.ttnet.org.chromium.net.e
    public final String b() {
        return "App-Packaged-Cronet-Provider";
    }

    @Override // com.ttnet.org.chromium.net.e
    public final String c() {
        return "77.0.3844.0";
    }

    @Override // com.ttnet.org.chromium.net.e
    public final c.a a() {
        return new g.a(new j(this.f155471a));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{NativeCronetProvider.class, this.f155471a});
    }

    public NativeCronetProvider(Context context) {
        super(context);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NativeCronetProvider) || !this.f155471a.equals(((NativeCronetProvider) obj).f155471a)) {
            return false;
        }
        return true;
    }
}
