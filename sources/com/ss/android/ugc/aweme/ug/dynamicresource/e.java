package com.ss.android.ugc.aweme.ug.dynamicresource;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import h.f.a.b;

public final class e {
    static {
        Covode.recordClassIndex(92680);
    }

    public static final class a implements a<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageView f141797a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f141798b = null;

        static {
            Covode.recordClassIndex(92681);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.aweme.ug.dynamicresource.a
        public final /* synthetic */ void a(Bitmap bitmap) {
            boolean z;
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                this.f141797a.setImageBitmap(bitmap2);
            }
            b bVar = this.f141798b;
            if (bVar != null) {
                if (bitmap2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                bVar.invoke(Boolean.valueOf(z));
            }
        }

        a(ImageView imageView, b bVar) {
            this.f141797a = imageView;
        }
    }
}
