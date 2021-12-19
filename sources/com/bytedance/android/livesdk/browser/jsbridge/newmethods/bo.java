package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import androidx.fragment.app.Fragment;
import c.b.d;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.android.livesdk.utils.g;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.e;
import com.google.gson.a.c;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.IOException;

public final class bo extends e<a, b> implements com.bytedance.android.livesdk.browser.jsbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    public Fragment f14602a;

    /* renamed from: b  reason: collision with root package name */
    public f.a.b.b f14603b;

    /* renamed from: c  reason: collision with root package name */
    public int f14604c;

    /* renamed from: d  reason: collision with root package name */
    private String f14605d;

    /* renamed from: e  reason: collision with root package name */
    private final String f14606e = "upload_photo";

    /* renamed from: f  reason: collision with root package name */
    private String f14607f;

    /* renamed from: g  reason: collision with root package name */
    private com.bytedance.android.livesdk.l.a f14608g;

    /* renamed from: h  reason: collision with root package name */
    private a f14609h;

    /* renamed from: i  reason: collision with root package name */
    private Uri f14610i;

    static {
        Covode.recordClassIndex(8120);
    }

    /* access modifiers changed from: package-private */
    public static final class a {
        @c(a = "aspect_x")

        /* renamed from: a  reason: collision with root package name */
        int f14614a;
        @c(a = "aspect_y")

        /* renamed from: b  reason: collision with root package name */
        int f14615b;
        @c(a = "min_width")

        /* renamed from: c  reason: collision with root package name */
        int f14616c;
        @c(a = "min_height")

        /* renamed from: d  reason: collision with root package name */
        int f14617d;
        @c(a = "max_size")

        /* renamed from: e  reason: collision with root package name */
        int f14618e;
        @c(a = "action_type")

        /* renamed from: f  reason: collision with root package name */
        int f14619f;

        static {
            Covode.recordClassIndex(8122);
        }

        a() {
        }
    }

    public final void b() {
        a();
        finishWithFailure();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        com.bytedance.android.livesdk.l.a aVar = this.f14608g;
        if (aVar != null && aVar.isShowing()) {
            this.f14608g.dismiss();
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
        f.a.b.b bVar = this.f14603b;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f14602a = null;
        a();
    }

    private void d() {
        Context context = this.callContext.f35646a;
        if (context != null) {
            this.f14610i = d.a(context, e());
        }
    }

    private String e() {
        return "upload_photo_" + this.f14607f + "crop";
    }

    private String f() {
        return g() + ".temp";
    }

    private String g() {
        return "upload_photo_" + this.f14607f;
    }

    private Uri c() {
        File file = new File(this.f14605d + "/" + f());
        if (!file.exists()) {
            try {
                File file2 = new File(this.f14605d);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e2) {
                i.b();
                com.bytedance.android.live.core.c.a.a(6, "ttlive_exception", e2.getStackTrace());
            }
        }
        return TTLiveFileProvider.getUri(this.f14602a.getActivity(), this.f14602a.getActivity().getPackageName() + ".ttlive_provider", file);
    }

    public bo(Fragment fragment) {
        this.f14602a = fragment;
        this.f14605d = g.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r2 = com.bytedance.android.livesdk.utils.g.a(r0, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(final android.net.Uri r8) {
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bo.a(android.net.Uri):void");
    }

    static final class b {
        @c(a = "uri")

        /* renamed from: a  reason: collision with root package name */
        String f14620a;
        @c(a = "url")

        /* renamed from: b  reason: collision with root package name */
        String f14621b;
        @c(a = "image_data")

        /* renamed from: c  reason: collision with root package name */
        String f14622c;

        static {
            Covode.recordClassIndex(8123);
        }

        private b(String str, String str2) {
            this.f14620a = str;
            this.f14621b = str2;
        }

        /* synthetic */ b(String str, String str2, byte b2) {
            this(str, str2);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(a aVar, com.bytedance.ies.web.jsbridge2.g gVar) {
        a aVar2 = aVar;
        this.f14609h = aVar2;
        this.f14607f = String.valueOf(System.currentTimeMillis());
        androidx.fragment.app.e activity = this.f14602a.getActivity();
        if (aVar2.f14619f == 0) {
            com.bytedance.android.livesdk.browser.a.a(activity, this.f14602a, this.f14605d, f());
        } else if (aVar2.f14619f == 1) {
            com.bytedance.android.livesdk.browser.a.a(activity, this.f14602a);
        }
    }

    private void a(Uri uri, boolean z) {
        if (uri != null) {
            Intent intent = new Intent("com.android.camera.action.CROP");
            if (!z) {
                try {
                    String lastPathSegment = uri.getLastPathSegment();
                    int i2 = Build.VERSION.SDK_INT;
                    if (!m.a(lastPathSegment) && lastPathSegment.contains(":")) {
                        lastPathSegment = lastPathSegment.split(":")[1];
                    }
                    try {
                        uri = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Long.parseLong(lastPathSegment));
                    } catch (NumberFormatException unused) {
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            intent.addFlags(1);
            intent.addFlags(2);
            intent.setDataAndType(uri, "image/*");
            intent.putExtra("crop", "true");
            intent.putExtra("scale", true);
            intent.putExtra("aspectX", this.f14609h.f14614a);
            intent.putExtra("aspectY", this.f14609h.f14615b);
            intent.putExtra("return-data", false);
            intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
            intent.putExtra("noFaceDetection", true);
            intent.putExtra("scaleUpIfNeeded", true);
            d();
            Uri uri2 = this.f14610i;
            if (uri2 != null) {
                intent.putExtra("output", uri2);
            }
            try {
                Fragment fragment = this.f14602a;
                if (fragment != null) {
                    fragment.startActivityForResult(intent, 40002);
                }
            } catch (Exception unused2) {
                n.a(this.f14602a.getContext(), (int) R.string.gxk);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.net.Uri r8, int r9, int r10) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bo.a(android.net.Uri, int, int):boolean");
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.c.a
    public final void a(int i2, int i3, Intent intent) {
        MethodCollector.i(7824);
        if (i2 == 40003) {
            if (i3 != -1 || intent == null || intent.getData() == null) {
                b();
                MethodCollector.o(7824);
                return;
            }
            androidx.fragment.app.e activity = this.f14602a.getActivity();
            if (activity == null) {
                b();
                MethodCollector.o(7824);
                return;
            }
            Uri data = intent.getData();
            Bitmap bitmap = null;
            try {
                bitmap = BitmapFactory.decodeStream(activity.getContentResolver().openInputStream(data));
            } catch (Exception unused) {
            }
            if (bitmap == null) {
                n.a(activity, 2131234317, (int) R.string.gxi);
                b();
                MethodCollector.o(7824);
                return;
            }
            a(data, false);
            MethodCollector.o(7824);
        } else if (i2 != 40004) {
            if (i2 == 40002) {
                if (i3 != -1) {
                    b();
                    MethodCollector.o(7824);
                    return;
                }
                androidx.fragment.app.e activity2 = this.f14602a.getActivity();
                if (activity2 == null) {
                    b();
                    MethodCollector.o(7824);
                    return;
                }
                Uri uri = this.f14610i;
                if (uri == null) {
                    n.a(activity2, 2131234317, (int) R.string.gxi);
                    b();
                } else if (!a(uri, this.f14609h.f14616c, this.f14609h.f14617d)) {
                    com.bytedance.android.livesdk.browser.a.a(activity2, this.f14602a);
                    MethodCollector.o(7824);
                    return;
                } else {
                    a(this.f14610i);
                    MethodCollector.o(7824);
                    return;
                }
            }
            MethodCollector.o(7824);
        } else if (i3 != -1) {
            MethodCollector.o(7824);
        } else {
            try {
                a(c(), true);
                MethodCollector.o(7824);
            } catch (Exception e2) {
                i.b();
                com.bytedance.android.live.core.c.a.a(6, "ttlive_exception", e2.getStackTrace());
                MethodCollector.o(7824);
            }
        }
    }
}
