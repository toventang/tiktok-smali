package com.lynx.fresco;

import android.graphics.Bitmap;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.e.k;
import com.lynx.a.a;
import com.lynx.tasm.base.LLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FrescoBitmapPool extends a {
    private final Map<Bitmap, com.facebook.common.h.a<Bitmap>> mReferenceMap = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(34721);
    }

    @Override // com.lynx.a.a
    public void recycle(Bitmap bitmap) {
        com.facebook.common.h.a<Bitmap> aVar;
        if (bitmap != null && (aVar = this.mReferenceMap.get(bitmap)) != null && aVar.d()) {
            aVar.close();
        }
    }

    @Override // com.lynx.a.a
    public Bitmap require(int i2, int i3, Bitmap.Config config) {
        try {
            com.facebook.common.h.a<Bitmap> b2 = k.a().f().b(i2, i3, config);
            Bitmap a2 = b2.a();
            if (a2 == null) {
                return null;
            }
            this.mReferenceMap.put(a2, b2);
            return a2;
        } catch (Exception e2) {
            LLog.a(6, "Image", "maybe oom " + Log.getStackTraceString(e2));
            return null;
        }
    }
}
