package com.ss.android.ugc.aweme.shortvideo.sticker.question;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.g;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.j;
import h.f.b.l;
import java.util.List;

public final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    public float[] f130694a;

    /* renamed from: b  reason: collision with root package name */
    private final g f130695b;

    static {
        Covode.recordClassIndex(85688);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a
    public final List<NormalTrackTimeStamp> a(long j2, InteractStickerStruct interactStickerStruct) {
        l.d(interactStickerStruct, "");
        return c.b(j2, interactStickerStruct);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a
    public final void a(float f2, float f3, b bVar) {
        l.d(bVar, "");
        bVar.a(this.f130388d.a(f2, f3));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, c cVar, InteractStickerStruct interactStickerStruct, j jVar, g gVar) {
        super(context, cVar, interactStickerStruct, jVar);
        long j2;
        l.d(context, "");
        l.d(cVar, "");
        l.d(interactStickerStruct, "");
        this.f130695b = gVar;
        if (gVar != null) {
            j2 = gVar.av();
        } else {
            j2 = 0;
        }
        List<NormalTrackTimeStamp> a2 = a(j2, this.f130389e);
        float[] fArr = null;
        if (!(a2 == null || a2.isEmpty() || a2.get(0) == null)) {
            NormalTrackTimeStamp normalTrackTimeStamp = a2.get(0);
            if (normalTrackTimeStamp == null) {
                l.b();
            }
            RectF a3 = a(normalTrackTimeStamp);
            fArr = new float[]{a3.left, a3.top, a3.right, a3.top, a3.left, a3.bottom, a3.right, a3.bottom};
            Matrix matrix = new Matrix();
            NormalTrackTimeStamp normalTrackTimeStamp2 = a2.get(0);
            if (normalTrackTimeStamp2 == null) {
                l.b();
            }
            matrix.postRotate(normalTrackTimeStamp2.getRotation(), ((fArr[2] - fArr[0]) / 2.0f) + fArr[0], ((fArr[5] - fArr[3]) / 2.0f) + fArr[3]);
            matrix.mapPoints(fArr);
        }
        this.f130694a = fArr;
    }
}
