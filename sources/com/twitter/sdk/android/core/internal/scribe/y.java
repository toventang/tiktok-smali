package com.twitter.sdk.android.core.internal.scribe;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.twitter.sdk.android.core.internal.scribe.r;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

final /* synthetic */ class y implements r.c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean[] f156135a;

    /* renamed from: b  reason: collision with root package name */
    private final ByteArrayOutputStream f156136b;

    static {
        Covode.recordClassIndex(103705);
    }

    y(boolean[] zArr, ByteArrayOutputStream byteArrayOutputStream) {
        this.f156135a = zArr;
        this.f156136b = byteArrayOutputStream;
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.r.c
    public final void a(InputStream inputStream, int i2) {
        MethodCollector.i(12195);
        boolean[] zArr = this.f156135a;
        ByteArrayOutputStream byteArrayOutputStream = this.f156136b;
        byte[] bArr = new byte[i2];
        inputStream.read(bArr);
        if (zArr[0]) {
            byteArrayOutputStream.write(ScribeFilesSender.f156024a);
        } else {
            zArr[0] = true;
        }
        byteArrayOutputStream.write(bArr);
        MethodCollector.o(12195);
    }
}
