package com.bytedance.android.livesdk.usercard;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bytedance.android.live.core.f.y;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.a;
import f.a.d.f;

final /* synthetic */ class s implements f {

    /* renamed from: a  reason: collision with root package name */
    private final p f21877a;

    static {
        Covode.recordClassIndex(12880);
    }

    s(p pVar) {
        this.f21877a = pVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        p pVar = this.f21877a;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null && pVar.f21866i) {
            pVar.z.setBackgroundDrawable(new BitmapDrawable(bitmap));
            n.a(pVar.z, -3, (int) n.b(y.e(), 106.0f));
            n.a(pVar.z, (int) n.b(y.e(), 25.0f), -3, -3);
            pVar.z.setVisibility(0);
            a aVar = (a) pVar.z.getHierarchy();
            aVar.a(q.b.f47436b);
            pVar.z.setHierarchy(aVar);
            n.a(pVar.A, (int) n.b(y.e(), 75.0f), -3, -3);
            pVar.A.setVisibility(0);
            pVar.A.setBackgroundColor(-1);
        }
    }
}
