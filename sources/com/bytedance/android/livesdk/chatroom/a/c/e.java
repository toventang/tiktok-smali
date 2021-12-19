package com.bytedance.android.livesdk.chatroom.a.c;

import android.graphics.Bitmap;
import com.bytedance.android.livesdkapi.depend.model.TextImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.d.f;

final /* synthetic */ class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f14915a;

    /* renamed from: b  reason: collision with root package name */
    private final TextImageModel f14916b;

    static {
        Covode.recordClassIndex(8263);
    }

    e(a aVar, TextImageModel textImageModel) {
        this.f14915a = aVar;
        this.f14916b = textImageModel;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        MethodCollector.i(6287);
        a aVar = this.f14915a;
        TextImageModel textImageModel = this.f14916b;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null || bitmap.isRecycled()) {
            aVar.f14903g.setVisibility(8);
            aVar.f14904h.setVisibility(8);
            MethodCollector.o(6287);
            return;
        }
        aVar.f14903g.setImageBitmap(bitmap.copy(Bitmap.Config.ARGB_8888, true));
        aVar.f14904h.setText(textImageModel.f22991a);
        aVar.f14904h.setTextColor(textImageModel.f22992b);
        aVar.f14903g.setVisibility(0);
        aVar.f14904h.setVisibility(0);
        if (aVar.f14898b != null) {
            aVar.f14898b.a(aVar.f14897a);
        }
        MethodCollector.o(6287);
    }
}
