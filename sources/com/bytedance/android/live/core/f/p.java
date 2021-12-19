package com.bytedance.android.live.core.f;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.livesdk.chatroom.g.i;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.f.e;
import java.util.Collection;

public final class p {

    public interface b {
        static {
            Covode.recordClassIndex(4661);
        }

        void a();

        void a(Bitmap bitmap);
    }

    static {
        Covode.recordClassIndex(4657);
    }

    public static void a(ImageView imageView, ImageModel imageModel, int i2, a aVar) {
        b(imageView, imageModel, -1, -1, i2, aVar);
    }

    public static boolean a(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                int i2 = Build.VERSION.SDK_INT;
                return !activity.isDestroyed() && !activity.isFinishing();
            } else if ((context instanceof Application) || !(context instanceof ContextWrapper)) {
                return true;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        return false;
    }

    public static void a(ImageView imageView, ImageModel imageModel, i iVar) {
        PointF pointF;
        if (imageModel != null && !com.bytedance.common.utility.collection.b.a((Collection) imageModel.getUrls()) && imageView != null && a(imageView.getContext())) {
            com.bytedance.android.live.core.f.a.a a2 = com.bytedance.android.live.core.f.a.a.a(imageView.getContext()).a(a(imageModel));
            a2.f9019d = imageModel;
            com.bytedance.android.live.core.f.a.a a3 = a2.a(ImageView.ScaleType.CENTER_CROP);
            if (iVar != null) {
                a3.f9020e = z.f9122a;
                int i2 = AnonymousClass1.f9107a[iVar.ordinal()];
                if (i2 == 1) {
                    pointF = new PointF(0.5f, 0.0f);
                } else if (i2 != 2) {
                    pointF = new PointF(0.5f, 0.5f);
                } else {
                    pointF = new PointF(0.5f, 1.0f);
                }
                a3.f9021f = pointF;
            }
            a3.f9017b = new k.b(imageModel, null);
            a3.a(imageView);
        }
    }

    public interface a {
        static {
            Covode.recordClassIndex(4659);
        }

        void a(ImageModel imageModel);

        void a(ImageModel imageModel, int i2, int i3);

        void a(ImageModel imageModel, Exception exc);

        /* renamed from: com.bytedance.android.live.core.f.p$a$a  reason: collision with other inner class name */
        public static class C0135a implements a {

            /* renamed from: a  reason: collision with root package name */
            public long f9108a = -1;

            /* renamed from: b  reason: collision with root package name */
            private long f9109b = -1;

            static {
                Covode.recordClassIndex(4660);
            }

            /* access modifiers changed from: protected */
            public void a(boolean z) {
            }

            private void a() {
                this.f9108a = SystemClock.elapsedRealtime() - this.f9109b;
            }

            @Override // com.bytedance.android.live.core.f.p.a
            public final void a(ImageModel imageModel) {
                this.f9109b = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.android.live.core.f.p.a
            public final void a(ImageModel imageModel, Exception exc) {
                a();
                a(false);
            }

            @Override // com.bytedance.android.live.core.f.p.a
            public final void a(ImageModel imageModel, int i2, int i3) {
                a();
                a(true);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.core.f.p$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9107a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 4658(0x1232, float:6.527E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdk.chatroom.g.i[] r0 = com.bytedance.android.livesdk.chatroom.g.i.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.live.core.f.p.AnonymousClass1.f9107a = r2
                com.bytedance.android.livesdk.chatroom.g.i r0 = com.bytedance.android.livesdk.chatroom.g.i.TOP     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.live.core.f.p.AnonymousClass1.f9107a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdk.chatroom.g.i r0 = com.bytedance.android.livesdk.chatroom.g.i.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.f.p.AnonymousClass1.<clinit>():void");
        }
    }

    public static String a(ImageModel imageModel) {
        if (imageModel == null || h.a(imageModel.getUrls())) {
            return "";
        }
        return imageModel.getUrls().get(0);
    }

    public static void b(ImageView imageView, ImageModel imageModel) {
        if (imageModel != null && !com.bytedance.common.utility.collection.b.a((Collection) imageModel.getUrls())) {
            a(imageView, imageModel, 0);
        }
    }

    public static void a(ImageView imageView, ImageModel imageModel) {
        if (imageView != null && a(imageView.getContext())) {
            com.bytedance.android.live.core.f.a.a a2 = com.bytedance.android.live.core.f.a.a.a(imageView.getContext());
            a2.f9019d = imageModel;
            com.bytedance.android.live.core.f.a.a a3 = a2.a().a(ImageView.ScaleType.CENTER_CROP);
            a3.f9017b = new k.b(null, null);
            a3.a(imageView);
        }
    }

    public static void a(ImageView imageView, ImageModel imageModel, int i2) {
        b(imageView, imageModel, -1, -1, i2, null);
    }

    public static void a(ImageView imageView, int i2, int i3, int i4) {
        if (imageView != null && a(imageView.getContext())) {
            com.bytedance.android.live.core.f.a.a a2 = com.bytedance.android.live.core.f.a.a.a(imageView.getContext());
            a2.f9018c = new Uri.Builder().scheme("res").path(String.valueOf(i2)).build();
            com.bytedance.android.live.core.f.a.a a3 = a2.a().a(ImageView.ScaleType.CENTER_CROP);
            a3.f9017b = new k.b(null, null);
            if (i3 > 0 && i4 > 0) {
                a3.a(i3, i4);
            }
            a3.a(imageView);
        }
    }

    public static void b(ImageView imageView, ImageModel imageModel, int i2, int i3) {
        if (imageView != null && imageModel != null && a(imageView.getContext())) {
            com.bytedance.android.live.core.f.a.a a2 = com.bytedance.android.live.core.f.a.a.a(imageView.getContext()).a(a(imageModel));
            int a3 = y.a((float) i3);
            if (a2.f9022g == null) {
                a2.f9022g = new e();
            }
            a2.f9022g.a((float) a3);
            a2.f9019d = imageModel;
            com.bytedance.android.live.core.f.a.a a4 = a2.a(ImageView.ScaleType.CENTER_CROP);
            a4.a(i2);
            a4.f9017b = new k.b(imageModel, null);
            a4.a(imageView);
        }
    }

    public static void a(ImageView imageView, ImageModel imageModel, int i2, int i3) {
        if (imageView != null && imageModel != null && !com.bytedance.common.utility.collection.b.a((Collection) imageModel.getUrls()) && a(imageView.getContext())) {
            b(imageView, imageModel, i2, i3, -1, null);
        }
    }

    public static void b(ImageView imageView, ImageModel imageModel, int i2, int i3, int i4, a aVar) {
        a(imageView, imageModel, i2, i3, false, i4, aVar);
    }

    public static void a(ImageView imageView, ImageModel imageModel, int i2, int i3, int i4, a aVar) {
        if (imageView != null && a(imageView.getContext())) {
            com.bytedance.android.live.core.f.a.a a2 = com.bytedance.android.live.core.f.a.a.a(imageView.getContext());
            a2.f9019d = imageModel;
            com.bytedance.android.live.core.f.a.a a3 = a2.a().a(ImageView.ScaleType.CENTER_CROP);
            if (i2 > 0 && i3 > 0) {
                a3.a(i2, i3);
            }
            if (i4 > 0) {
                a3.a(i4);
            }
            if (aVar != null) {
                a3.f9017b = new k.b(imageModel, aVar);
            } else {
                a3.f9017b = new k.b(null, null);
            }
            a3.a(imageView);
        }
    }

    public static void a(ImageView imageView, ImageModel imageModel, int i2, int i3, boolean z, int i4, a aVar) {
        a(imageView, imageModel, i2, i3, z, i4, ImageView.ScaleType.CENTER_CROP, aVar);
    }

    public static void a(ImageView imageView, ImageModel imageModel, int i2, int i3, boolean z, int i4, ImageView.ScaleType scaleType, a aVar) {
        if (imageModel == null) {
            if (aVar != null) {
                aVar.a(imageModel, new IllegalArgumentException("imageModel == null"));
            }
        } else if (com.bytedance.common.utility.collection.b.a((Collection) imageModel.getUrls())) {
            if (aVar != null) {
                aVar.a(imageModel, new IllegalArgumentException("CollectionUtils.isEmpty(imageModel.urls)"));
            }
        } else if (imageView != null && a(imageView.getContext())) {
            com.bytedance.android.live.core.f.a.a a2 = com.bytedance.android.live.core.f.a.a.a(imageView.getContext()).a(a(imageModel));
            a2.f9019d = imageModel;
            com.bytedance.android.live.core.f.a.a a3 = a2.a(scaleType);
            if (i2 > 0 && i3 > 0) {
                a3.a(i2, i3);
            }
            if (i4 > 0) {
                a3.a(i4);
            }
            if (z) {
                a3.f9023h = true;
            }
            a3.f9017b = new k.b(imageModel, aVar);
            a3.a(imageView);
        } else if (aVar != null) {
            aVar.a(imageModel, new IllegalArgumentException("!isActivityOK(view.getContext())"));
        }
    }
}
