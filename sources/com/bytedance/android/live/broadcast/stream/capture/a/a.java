package com.bytedance.android.live.broadcast.stream.capture.a;

import android.text.TextUtils;
import com.bytedance.android.live.effect.model.d;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FileNotFoundException;

public class a extends com.bytedance.android.live.effect.model.a {
    static {
        Covode.recordClassIndex(4379);
    }

    public final void a() {
        if (this.f9874a != null) {
            this.f9874a.a();
        }
    }

    public final void b(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            this.f9874a.a(strArr);
        }
    }

    public final void c(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            this.f9874a.b(strArr);
        }
    }

    public final void a(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("mode is " + i2 + "order type is 0");
        } else if (this.f9874a != null) {
            this.f9874a.a(i2);
        }
    }

    public final void a(boolean z) {
        if (this.f9874a != null) {
            this.f9874a.a(z);
        }
    }

    public final void a(String[] strArr) {
        int i2;
        if (this.f9874a != null) {
            d dVar = this.f9874a;
            if (strArr != null) {
                i2 = strArr.length;
            } else {
                i2 = 0;
            }
            dVar.a(strArr, i2);
        }
    }

    public final void b(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr.length != 0) {
            this.f9874a.a(strArr, strArr2);
        }
    }

    public final void a(String str, String str2) {
        if ("".equals(str)) {
            throw new RuntimeException("renderCacheKey is Null");
        } else if ("".equals(str2)) {
            throw new RuntimeException("resPath is Null");
        } else if (this.f9874a != null) {
            this.f9874a.a(str, str2);
        }
    }

    public final void a(String str, boolean z) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            throw new FileNotFoundException("Filter file not exists:".concat(String.valueOf(str)));
        } else if (this.f9874a != null) {
            this.f9874a.a(str, z);
        }
    }

    public final void a(String[] strArr, String[] strArr2) {
        if (this.f9874a != null) {
            this.f9874a.a(strArr, strArr.length, strArr2);
        }
    }

    public final void a(String str, String str2, int[] iArr) {
        this.f9874a.a(str, str2, iArr);
    }

    public final void a(String str, String str2, float f2) {
        if (this.f9874a != null) {
            this.f9874a.a(str, str2, f2);
        }
    }
}
