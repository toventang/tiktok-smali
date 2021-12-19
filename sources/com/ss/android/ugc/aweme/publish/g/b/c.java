package com.ss.android.ugc.aweme.publish.g.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.d.a;
import com.ss.android.ugc.aweme.shortvideo.publish.o;
import com.ss.android.ugc.aweme.shortvideo.upload.y;
import h.f.b.l;
import java.io.File;

public final class c extends d {

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f118794b;

    /* renamed from: c  reason: collision with root package name */
    private final String f118795c;

    static {
        Covode.recordClassIndex(77148);
    }

    @Override // com.ss.android.ugc.aweme.publish.g.b.d
    public final int a() {
        Throwable th = this.f118794b;
        if (th instanceof y) {
            return (int) ((y) th).getErrorCode();
        }
        return 14;
    }

    @Override // com.ss.android.ugc.aweme.publish.g.b.d
    public final o b() {
        File file = new File(this.f118795c);
        if (this.f118794b instanceof a) {
            return o.CLIENT;
        }
        if (!file.exists() || file.length() == 0) {
            return o.CLIENT;
        }
        if (this.f118794b instanceof y) {
            return o.UPLOAD_SDK;
        }
        return o.CLIENT;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Throwable th, String str) {
        super(th);
        l.d(th, "");
        l.d(str, "");
        this.f118794b = th;
        this.f118795c = str;
    }
}
