package com.facebook.imagepipeline.n;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.c.a.e;
import com.facebook.common.d.f;
import com.facebook.common.h.a;
import com.facebook.common.k.g;
import com.facebook.imagepipeline.d.j;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.j.c;
import com.facebook.imagepipeline.j.d;
import com.facebook.imagepipeline.o.b;
import java.io.File;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.Executor;

public final class ad implements ak<a<c>> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f48127a;

    /* renamed from: b  reason: collision with root package name */
    private final ContentResolver f48128b;

    static {
        Covode.recordClassIndex(29083);
    }

    public static Bitmap a(b bVar) {
        e a2;
        File file;
        MethodCollector.i(13269);
        try {
            if (bVar.isResizedImageDiskCacheActuallyEnabled()) {
                a2 = j.a().b(bVar);
            } else {
                a2 = j.a().a(bVar);
            }
            com.facebook.b.a a3 = k.a().d().a(a2);
            if (a3 == null) {
                a3 = k.a().h().a(a2);
            }
            if ((a3 instanceof com.facebook.b.b) && (file = ((com.facebook.b.b) a3).f46951a) != null && file.exists()) {
                Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                MethodCollector.o(13269);
                return decodeFile;
            }
        } catch (Exception unused) {
        }
        MethodCollector.o(13269);
        return null;
    }

    public final String b(b bVar) {
        String str;
        String[] strArr;
        MethodCollector.i(13271);
        Uri uri = bVar.mSourceUri;
        if (g.c(uri)) {
            String path = bVar.getSourceFile().getPath();
            MethodCollector.o(13271);
            return path;
        }
        if (g.d(uri)) {
            int i2 = Build.VERSION.SDK_INT;
            if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                String documentId = DocumentsContract.getDocumentId(uri);
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                strArr = new String[]{documentId.split(":")[1]};
                str = "_id=?";
            } else {
                str = null;
                strArr = null;
            }
            Cursor query = this.f48128b.query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        return query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                    MethodCollector.o(13271);
                }
            }
            if (query != null) {
                query.close();
            }
        }
        MethodCollector.o(13271);
        return null;
    }

    public ad(Executor executor, ContentResolver contentResolver) {
        this.f48127a = executor;
        this.f48128b = contentResolver;
    }

    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<a<c>> kVar, al alVar) {
        final an c2 = alVar.c();
        final String b2 = alVar.b();
        final b a2 = alVar.a();
        final AnonymousClass2 r1 = new av<a<c>>(kVar, "VideoThumbnailProducer", c2, b2) {
            /* class com.facebook.imagepipeline.n.ad.AnonymousClass2 */

            static {
                Covode.recordClassIndex(29085);
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public a<c> c() {
                int i2;
                e a2;
                MethodCollector.i(14047);
                String b2 = ad.this.b(a2);
                if (b2 == null) {
                    MethodCollector.o(14047);
                    return null;
                }
                Bitmap a3 = ad.a(a2);
                if (a3 == null) {
                    b bVar = a2;
                    if (bVar.getPreferredWidth() > 96 || bVar.getPreferredHeight() > 96) {
                        i2 = 1;
                    } else {
                        i2 = 3;
                    }
                    a3 = ThumbnailUtils.createVideoThumbnail(b2, i2);
                    if (a3 == null) {
                        MethodCollector.o(14047);
                        return null;
                    }
                    if (!(!a2.isResizedImageDiskCacheActuallyEnabled() || a3.getHeight() == 0 || a2.mResizeOptions.f47748b == 0)) {
                        float width = ((float) a3.getWidth()) / ((float) a3.getHeight());
                        int i3 = a2.mResizeOptions.f47747a;
                        int i4 = a2.mResizeOptions.f47748b;
                        float f2 = (float) i3;
                        float f3 = (float) i4;
                        if (f2 / f3 > width) {
                            i4 = (int) (f2 / width);
                        } else {
                            i3 = (int) (f3 * width);
                        }
                        a3 = Bitmap.createScaledBitmap(a3, i3, i4, true);
                    }
                    ad adVar = ad.this;
                    b bVar2 = a2;
                    try {
                        boolean isResizedImageDiskCacheActuallyEnabled = bVar2.isResizedImageDiskCacheActuallyEnabled();
                        if (isResizedImageDiskCacheActuallyEnabled) {
                            a2 = j.a().b(bVar2);
                        } else {
                            a2 = j.a().a(bVar2);
                        }
                        k.a().d().a(a2, new com.facebook.c.a.k(isResizedImageDiskCacheActuallyEnabled, a3) {
                            /* class com.facebook.imagepipeline.n.ad.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ boolean f48129a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ Bitmap f48130b;

                            static {
                                Covode.recordClassIndex(29084);
                            }

                            @Override // com.facebook.c.a.k
                            public final void a(OutputStream outputStream) {
                                Bitmap.CompressFormat compressFormat;
                                int i2;
                                MethodCollector.i(12678);
                                if (this.f48129a) {
                                    compressFormat = Bitmap.CompressFormat.JPEG;
                                } else {
                                    compressFormat = Bitmap.CompressFormat.PNG;
                                }
                                if (this.f48129a) {
                                    i2 = 85;
                                } else {
                                    i2 = 100;
                                }
                                this.f48130b.compress(compressFormat, i2, outputStream);
                                MethodCollector.o(12678);
                            }

                            {
                                this.f48129a = r2;
                                this.f48130b = r3;
                            }
                        });
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                a<c> a4 = a.a(new d(a3, com.facebook.imagepipeline.c.g.a(), com.facebook.imagepipeline.j.g.f48000a));
                MethodCollector.o(14047);
                return a4;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.facebook.common.b.h, com.facebook.imagepipeline.n.av
            public final /* synthetic */ void b(a<c> aVar) {
                a.c(aVar);
            }

            @Override // com.facebook.common.b.h, com.facebook.imagepipeline.n.av
            public final void a(Exception exc) {
                super.a(exc);
                c2.onUltimateProducerReached(b2, "VideoThumbnailProducer", false);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.n.av
            public final /* synthetic */ Map c(a<c> aVar) {
                boolean z;
                if (aVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                return f.of("createdThumbnail", String.valueOf(z));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.facebook.common.b.h, com.facebook.imagepipeline.n.av
            public final /* synthetic */ void a(a<c> aVar) {
                boolean z;
                super.a(aVar);
                an anVar = c2;
                String str = b2;
                if (aVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                anVar.onUltimateProducerReached(str, "VideoThumbnailProducer", z);
            }
        };
        alVar.a(new e() {
            /* class com.facebook.imagepipeline.n.ad.AnonymousClass3 */

            static {
                Covode.recordClassIndex(29086);
            }

            @Override // com.facebook.imagepipeline.n.am, com.facebook.imagepipeline.n.e
            public final void a() {
                r1.a();
            }
        });
        this.f48127a.execute(r1);
    }
}
