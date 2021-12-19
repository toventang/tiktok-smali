package com.bytedance.android.ecommerce.ocr.view;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.ecommerce.ocr.b.a;
import com.bytedance.android.ecommerce.ocr.b.b;
import com.bytedance.android.ecommerce.ocr.view.a;
import com.bytedance.covode.number.Covode;

public class OcrCameraPreview extends a {
    b o;
    a p;
    a.AbstractC0096a q;
    OcrActivity r;

    static {
        Covode.recordClassIndex(3486);
    }

    @Override // com.bytedance.android.ecommerce.ocr.view.a
    public final void c() {
        super.c();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.ecommerce.ocr.view.a
    public final void f() {
        super.f();
        a.AbstractC0096a aVar = this.q;
        if (aVar != null) {
            aVar.b();
        }
    }

    public OcrCameraPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
