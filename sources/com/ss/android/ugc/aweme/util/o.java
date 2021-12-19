package com.ss.android.ugc.aweme.util;

import android.content.Context;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.core.g.e;
import com.bytedance.common.utility.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.util.b;
import com.ss.android.e.f;
import h.f.b.l;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final String f142524a = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath();

    /* renamed from: b  reason: collision with root package name */
    public WeakReference<Context> f142525b;

    /* renamed from: c  reason: collision with root package name */
    public CountDownLatch f142526c = new CountDownLatch(1);

    /* renamed from: d  reason: collision with root package name */
    public boolean f142527d;

    /* renamed from: e  reason: collision with root package name */
    public Throwable f142528e;

    public interface a {
        static {
            Covode.recordClassIndex(93217);
        }

        void a();

        void a(String str);

        void b();
    }

    static {
        Covode.recordClassIndex(93214);
    }

    public o(WeakReference<Context> weakReference) {
        this.f142525b = weakReference;
    }

    public final e<Boolean, String> a(final String str, final a aVar) {
        MethodCollector.i(4911);
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            new RuntimeException("Image url is empty.");
            aVar.b();
            e<Boolean, String> eVar = new e<>(false, null);
            MethodCollector.o(4911);
            return eVar;
        }
        aVar.a();
        final String str3 = d.b(str) + ".png";
        String path = new File(this.f142524a, str3).getPath();
        if (com.ss.android.ugc.aweme.video.e.b(path)) {
            this.f142527d = true;
        }
        if (!this.f142527d) {
            com.ss.android.b.a.a.a.a(new Runnable() {
                /* class com.ss.android.ugc.aweme.util.o.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(93215);
                }

                public final void run() {
                    try {
                        if (o.this.f142525b.get() != null) {
                            o oVar = o.this;
                            String str = str;
                            String str2 = o.this.f142524a;
                            String str3 = str3;
                            oVar.f142527d = com.ss.android.e.d.a(oVar.f142525b.get(), f.extractImageUrlList(str, null), str2, str3, new b<String>() {
                                /* class com.ss.android.ugc.aweme.util.o.AnonymousClass1.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(93216);
                                }
                            }, str3);
                        } else {
                            o.this.f142528e = new RuntimeException("Context is null");
                            o.this.f142527d = false;
                        }
                    } catch (Throwable th) {
                        o.this.f142526c.countDown();
                        throw th;
                    }
                    o.this.f142526c.countDown();
                }
            });
            try {
                this.f142526c.await();
            } catch (InterruptedException unused) {
            }
        }
        if (this.f142527d && !TextUtils.isEmpty(path) && this.f142525b.get() != null) {
            File file = new File(path);
            Context context = this.f142525b.get();
            l.d(file, "");
            l.d(context, "");
            try {
                ParcelFileDescriptor openFileDescriptor = com.bytedance.ies.ugc.appcontext.d.a().getContentResolver().openFileDescriptor(c.b.e.a(context, file.getName(), "image/*", Environment.DIRECTORY_PICTURES + "/tiktok/"), "w");
                if (openFileDescriptor != null) {
                    c.b.d.a(file, new FileOutputStream(openFileDescriptor.getFileDescriptor()));
                }
            } catch (Throwable unused2) {
            }
        }
        if (this.f142527d) {
            aVar.a(path);
        } else {
            aVar.b();
        }
        Boolean valueOf = Boolean.valueOf(this.f142527d);
        if (this.f142527d) {
            str2 = path;
        }
        e<Boolean, String> eVar2 = new e<>(valueOf, str2);
        this.f142527d = false;
        MethodCollector.o(4911);
        return eVar2;
    }
}
