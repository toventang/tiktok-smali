package com.bytedance.android.livesdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.network.b;
import com.bytedance.android.live.network.h;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.d.f;
import f.a.d.g;
import f.a.t;
import h.f.b.l;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public final class ag {

    /* renamed from: a  reason: collision with root package name */
    public static final ag f22230a = new ag();

    private ag() {
    }

    static {
        Covode.recordClassIndex(13125);
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f22235a = new c();

        static {
            Covode.recordClassIndex(13128);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            l.b(th, "");
            com.bytedance.android.live.core.c.a.a(6, "NinePatchUtil", th.getStackTrace());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f22231a;

        static {
            Covode.recordClassIndex(13126);
        }

        a(String str) {
            this.f22231a = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Bitmap apply(Integer num) {
            com.bytedance.android.livesdkapi.model.c<com.bytedance.android.livesdkapi.model.a> downloadFile;
            MethodCollector.i(10756);
            l.d(num, "");
            try {
                h a2 = h.a();
                String str = this.f22231a;
                ArrayList arrayList = new ArrayList();
                if (a2.f12123b != null) {
                    b.a a3 = a2.f12123b.a(new b.a(str, arrayList));
                    downloadFile = ((IHostNetwork) com.bytedance.android.live.t.a.a(IHostNetwork.class)).downloadFile(false, Integer.MAX_VALUE, a3.f12103a, a3.f12104b, null);
                } else {
                    downloadFile = ((IHostNetwork) com.bytedance.android.live.t.a.a(IHostNetwork.class)).downloadFile(false, Integer.MAX_VALUE, str, arrayList, null);
                }
                com.bytedance.android.livesdkapi.model.a a4 = downloadFile.a();
                l.b(a4, "");
                Bitmap decodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(a4.f23268e));
                MethodCollector.o(10756);
                return decodeStream;
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a(6, "NinePatchUtil", e2.getStackTrace());
                com.bytedance.android.live.core.c.a.a(6, "NinePatchUtil", e2.getMessage());
                MethodCollector.o(10756);
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f22232a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f22233b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Runnable f22234c;

        static {
            Covode.recordClassIndex(13127);
        }

        b(boolean z, View view, Runnable runnable) {
            this.f22232a = z;
            this.f22233b = view;
            this.f22234c = runnable;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            Rect rect = null;
            if (bitmap != null) {
                byte[] ninePatchChunk = bitmap.getNinePatchChunk();
                if (ninePatchChunk != null) {
                    ByteBuffer order = ByteBuffer.wrap(ninePatchChunk).order(ByteOrder.nativeOrder());
                    if (order.get() != 0) {
                        order.get();
                        order.get();
                        order.get();
                        l.b(order, "");
                        order.getInt();
                        order.getInt();
                        rect = new Rect();
                        rect.left = order.getInt();
                        rect.right = order.getInt();
                        rect.top = order.getInt();
                        rect.bottom = order.getInt();
                    }
                }
                if (!(bitmap == null || bitmap.getNinePatchChunk() == null || rect == null)) {
                    NinePatchDrawable ninePatchDrawable = new NinePatchDrawable(y.a(), bitmap, bitmap.getNinePatchChunk(), rect, null);
                    int i2 = Build.VERSION.SDK_INT;
                    ninePatchDrawable.setAutoMirrored(this.f22232a);
                    this.f22233b.setBackground(ninePatchDrawable);
                    if (!this.f22232a || !com.bytedance.android.live.uikit.c.a.a(y.e())) {
                        this.f22233b.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                    } else {
                        this.f22233b.setPadding(rect.right, rect.top, rect.left, rect.bottom);
                    }
                    Runnable runnable = this.f22234c;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
            }
            if (bitmap != null) {
                com.bytedance.android.live.core.c.a.a(6, "NinePatchUtil", "downloaded bitmap is null.");
            } else {
                com.bytedance.android.live.core.c.a.a(6, "NinePatchUtil", "no ninepatch chunk found in bitmap.");
            }
        }
    }

    public static void a(ImageModel imageModel, View view, boolean z, Runnable runnable) {
        String str;
        l.d(imageModel, "");
        l.d(view, "");
        if (!com.bytedance.common.utility.h.a(imageModel.getUrls())) {
            List<String> urls = imageModel.getUrls();
            if (urls != null) {
                str = urls.get(0);
            } else {
                str = null;
            }
            t.b((Object) 0).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new a(str)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(z, view, runnable), c.f22235a);
        }
    }
}
