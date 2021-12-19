package com.ss.android.ugc.aweme.dsp.widget.a;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.e.q;
import h.f.b.l;

public final class b extends q.a {

    /* renamed from: a  reason: collision with root package name */
    public static final q.b f84052a = new b();

    /* renamed from: k  reason: collision with root package name */
    public static final a f84053k = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(52407);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(52406);
    }

    @Override // com.facebook.drawee.e.q.a
    public final void a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3, float f4, float f5) {
        if (rect == null) {
            l.b();
        }
        float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i2) * f4)) * 0.5f);
        float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i3) * f4)) * 0.5f);
        if (matrix == null) {
            l.b();
        }
        matrix.setScale(f4, f4);
        matrix.postTranslate(width + 0.5f, height + 0.5f);
    }
}
