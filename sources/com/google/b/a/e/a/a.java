package com.google.b.a.e.a;

import com.bytedance.covode.number.Covode;
import com.google.b.a.e.b;
import com.google.b.a.e.c;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public final class a extends b {
    static {
        Covode.recordClassIndex(33155);
    }

    @Override // com.google.b.a.e.b
    public final c a(OutputStream outputStream, Charset charset) {
        return new b(this, new com.google.gson.c.c(new OutputStreamWriter(outputStream, charset)));
    }
}
