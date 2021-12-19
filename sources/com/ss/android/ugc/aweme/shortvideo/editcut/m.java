package com.ss.android.ugc.aweme.shortvideo.editcut;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.utils.db;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.ad;
import h.e.j;
import h.f.b.l;
import h.z;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Callable;

public final class m {
    static {
        Covode.recordClassIndex(84183);
    }

    public static final <T> boolean a(List<T> list, int i2, int i3) {
        l.d(list, "");
        if (i2 == i3 || i2 < 0 || i3 < 0 || i2 > list.size() - 1 || i3 > list.size() - 1) {
            return false;
        }
        list.add(i3, list.remove(i2));
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final class a implements ad {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SimpleDraweeView f128353a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ db f128354b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f128355c;

        static {
            Covode.recordClassIndex(84184);
        }

        a(SimpleDraweeView simpleDraweeView, db dbVar, String str) {
            this.f128353a = simpleDraweeView;
            this.f128354b = dbVar;
            this.f128355c = str;
        }

        @Override // com.ss.android.vesdk.ad
        public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
            MethodCollector.i(3088);
            final Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
            i.b(new Callable(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.editcut.m.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f128356a;

                static {
                    Covode.recordClassIndex(84185);
                }

                {
                    this.f128356a = r1;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    db dbVar = this.f128356a.f128354b;
                    if (dbVar != null) {
                        String str = this.f128356a.f128355c;
                        Bitmap bitmap = createBitmap;
                        l.b(bitmap, "");
                        l.d(str, "");
                        l.d(bitmap, "");
                        if (dbVar.f142810c) {
                            dbVar.f142808a.put(str, bitmap);
                        }
                    }
                    this.f128356a.f128353a.setImageBitmap(createBitmap);
                    return z.f158842a;
                }
            }, i.f4826c);
            MethodCollector.o(3088);
            return false;
        }
    }

    public static final void a(SimpleDraweeView simpleDraweeView, String str, Drawable drawable, int i2, db dbVar) {
        boolean z;
        Bitmap a2;
        l.d(simpleDraweeView, "");
        l.d(str, "");
        l.d(drawable, "");
        simpleDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ((com.facebook.drawee.f.a) simpleDraweeView.getHierarchy()).a(1, drawable);
        Uri d2 = h.d(str);
        boolean a3 = l.a((Object) d2.getScheme(), (Object) "file");
        if (h.b(str) || j.e(new File(str)).length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (h.a(str, z) || !a3) {
            com.ss.android.ugc.tools.c.a.a(simpleDraweeView, d2, i2, i2);
        } else if (dbVar == null || (a2 = dbVar.a(str)) == null || a2.isRecycled()) {
            VEUtils.getVideoFrames(d2.toString(), new int[]{0}, -1, i2, false, new a(simpleDraweeView, dbVar, str));
        } else {
            simpleDraweeView.setImageBitmap(a2);
        }
    }
}
