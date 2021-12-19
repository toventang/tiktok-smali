package com.ss.android.ugc.aweme.shortvideo.ui;

import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.core.graphics.drawable.b;
import androidx.core.graphics.drawable.d;
import androidx.fragment.app.e;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.vesdk.ad;
import java.nio.ByteBuffer;

final /* synthetic */ class en implements ad {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131726a;

    static {
        Covode.recordClassIndex(86270);
    }

    en(cj cjVar) {
        this.f131726a = cjVar;
    }

    @Override // com.ss.android.vesdk.ad
    public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        MethodCollector.i(8734);
        cj cjVar = this.f131726a;
        e activity = cjVar.getActivity();
        if (activity == null) {
            MethodCollector.o(8734);
            return false;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
        Bitmap mergeCoverText = cjVar.K.getCoverPublishModel().getEffectTextModel().mergeCoverText(createBitmap);
        b a2 = d.a(activity.getResources(), mergeCoverText);
        a2.a(n.b(c.f115622a, 4.0f));
        cjVar.u.setImageDrawable(a2);
        if (TextUtils.isEmpty(cjVar.K.multiEditVideoRecordData.coverImagePath)) {
            cjVar.K.multiEditVideoRecordData.coverImagePath = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a();
        }
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a(mergeCoverText, cjVar.K.multiEditVideoRecordData.coverImagePath);
        MethodCollector.o(8734);
        return false;
    }
}
