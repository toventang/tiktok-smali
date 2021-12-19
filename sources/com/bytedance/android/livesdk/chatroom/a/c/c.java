package com.bytedance.android.livesdk.chatroom.a.c;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.model.FansClubData;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.d.f;

final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f14912a;

    /* renamed from: b  reason: collision with root package name */
    private final FansClubData f14913b;

    static {
        Covode.recordClassIndex(8261);
    }

    c(a aVar, FansClubData fansClubData) {
        this.f14912a = aVar;
        this.f14913b = fansClubData;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        MethodCollector.i(4220);
        a aVar = this.f14912a;
        FansClubData fansClubData = this.f14913b;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null || bitmap.isRecycled()) {
            aVar.f14901e.setVisibility(8);
            aVar.f14902f.setVisibility(8);
            MethodCollector.o(4220);
            return;
        }
        aVar.f14901e.setImageBitmap(bitmap.copy(Bitmap.Config.ARGB_8888, true));
        aVar.f14902f.setText(fansClubData.clubName);
        aVar.f14901e.setVisibility(0);
        aVar.f14902f.setVisibility(0);
        if (aVar.f14898b != null) {
            aVar.f14898b.a(aVar.f14897a);
        }
        MethodCollector.o(4220);
    }
}
