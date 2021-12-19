package com.squareup.b;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import com.bytedance.covode.number.Covode;
import com.squareup.b.j;
import com.squareup.b.t;
import com.squareup.b.y;
import java.io.IOException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
public final class r extends y {

    /* renamed from: a  reason: collision with root package name */
    private final j f58070a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f58071b;

    static {
        Covode.recordClassIndex(36073);
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.b.y
    public final int a() {
        return 2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.b.y
    public final boolean b() {
        return true;
    }

    static class a extends IOException {
        static {
            Covode.recordClassIndex(36074);
        }

        public a(String str) {
            super(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.b.y
    public final boolean a(NetworkInfo networkInfo) {
        if (networkInfo == null || networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    @Override // com.squareup.b.y
    public final boolean a(w wVar) {
        String scheme = wVar.f58115d.getScheme();
        if ("http".equals(scheme) || "https".equals(scheme)) {
            return true;
        }
        return false;
    }

    @Override // com.squareup.b.y
    public final y.a b(w wVar) {
        t.d dVar;
        j.a a2 = this.f58070a.a(wVar.f58115d, wVar.f58114c);
        if (a2.f58048c) {
            dVar = t.d.DISK;
        } else {
            dVar = t.d.NETWORK;
        }
        Bitmap bitmap = a2.f58047b;
        if (bitmap != null) {
            return new y.a(bitmap, dVar);
        }
        InputStream inputStream = a2.f58046a;
        if (inputStream == null) {
            return null;
        }
        if (dVar == t.d.DISK && a2.f58049d == 0) {
            ae.a(inputStream);
            throw new a("Received response with 0 content-length header.");
        }
        if (dVar == t.d.NETWORK && a2.f58049d > 0) {
            aa aaVar = this.f58071b;
            aaVar.f57970c.sendMessage(aaVar.f57970c.obtainMessage(4, Long.valueOf(a2.f58049d)));
        }
        return new y.a(inputStream, dVar);
    }

    public r(j jVar, aa aaVar) {
        this.f58070a = jVar;
        this.f58071b = aaVar;
    }
}
