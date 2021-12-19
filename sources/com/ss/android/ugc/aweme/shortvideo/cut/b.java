package com.ss.android.ugc.aweme.shortvideo.cut;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.io.InputStream;
import java.io.OutputStream;

public final class b implements c<Bitmap> {
    static {
        Covode.recordClassIndex(82339);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.c
    public final y<Bitmap> a(InputStream inputStream) {
        MethodCollector.i(6783);
        l.d(inputStream, "");
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
        l.b(decodeStream, "");
        y<Bitmap> yVar = new y<>(decodeStream.getWidth(), decodeStream.getHeight(), decodeStream);
        MethodCollector.o(6783);
        return yVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.c
    public final void a(OutputStream outputStream, y<Bitmap> yVar) {
        MethodCollector.i(6784);
        l.d(outputStream, "");
        l.d(yVar, "");
        yVar.f126298c.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
        MethodCollector.o(6784);
    }
}
