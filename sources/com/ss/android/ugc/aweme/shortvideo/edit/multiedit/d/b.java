package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.a;
import com.ss.android.vesdk.ad;
import java.nio.ByteBuffer;

final /* synthetic */ class b implements ad {

    /* renamed from: a  reason: collision with root package name */
    private final a.AnonymousClass1 f127878a;

    /* renamed from: b  reason: collision with root package name */
    private final String f127879b;

    static {
        Covode.recordClassIndex(83825);
    }

    b(a.AnonymousClass1 r1, String str) {
        this.f127878a = r1;
        this.f127879b = str;
    }

    @Override // com.ss.android.vesdk.ad
    public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        MethodCollector.i(3612);
        a.AnonymousClass1 r6 = this.f127878a;
        String str = this.f127879b;
        dmt.av.video.a.a("extracting_frame");
        Message message = new Message();
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
        Bundle bundle = new Bundle();
        bundle.putParcelable("bitmap", createBitmap);
        bundle.putString("path", str);
        message.what = 2;
        message.setData(bundle);
        a.this.f127872a.sendMessage(message);
        MethodCollector.o(3612);
        return false;
    }
}
