package com.ss.android.ugc.aweme.shortvideo.mvtemplate.a;

import android.graphics.Bitmap;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.vesdk.VEListener;
import java.nio.ByteBuffer;
import java.util.ArrayList;

final /* synthetic */ class h implements VEListener.w {

    /* renamed from: a  reason: collision with root package name */
    private final c f128805a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f128806b;

    static {
        Covode.recordClassIndex(84503);
    }

    h(c cVar, int[] iArr) {
        this.f128805a = cVar;
        this.f128806b = iArr;
    }

    @Override // com.ss.android.vesdk.VEListener.w
    public final int a(byte[] bArr, int i2, int i3) {
        MethodCollector.i(8529);
        c cVar = this.f128805a;
        int[] iArr = this.f128806b;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        cVar.f128781c.add(createBitmap);
        iArr[0] = iArr[0] + 1;
        if (iArr[0] == 1) {
            ArrayList arrayList = new ArrayList(cVar.f128782d);
            for (int i4 = 0; i4 < cVar.f128782d; i4++) {
                arrayList.add(createBitmap);
            }
            Message message = new Message();
            message.obj = arrayList;
            message.what = 1002;
            cVar.f128788j.sendMessage(message);
        }
        cVar.f128786h.sendEmptyMessage(1001);
        MethodCollector.o(8529);
        return 0;
    }
}
