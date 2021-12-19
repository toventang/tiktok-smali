package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.e;
import com.bytedance.android.live.network.h;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.android.livesdk.ah.f;
import com.bytedance.android.livesdk.l.a;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverCropCustomStyleSetting;
import com.bytedance.android.livesdk.utils.crop.a;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.kakao.usermgmt.StringSet;
import com.zhiliaoapp.musically.R;
import f.a.x;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class t extends e<JSONObject, b> implements com.bytedance.android.livesdk.browser.jsbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    final String f14742a;

    /* renamed from: b  reason: collision with root package name */
    public f.a.b.b f14743b;

    /* renamed from: c  reason: collision with root package name */
    public Fragment f14744c;

    /* renamed from: d  reason: collision with root package name */
    com.bytedance.android.livesdk.l.a f14745d;

    /* renamed from: e  reason: collision with root package name */
    g f14746e;

    /* renamed from: f  reason: collision with root package name */
    public int f14747f;

    /* renamed from: g  reason: collision with root package name */
    public String f14748g;

    /* renamed from: h  reason: collision with root package name */
    public JSONObject f14749h;

    /* renamed from: i  reason: collision with root package name */
    private String f14750i;

    /* renamed from: j  reason: collision with root package name */
    private final String f14751j = "upload_photo";

    /* renamed from: k  reason: collision with root package name */
    private int f14752k;

    /* renamed from: l  reason: collision with root package name */
    private int f14753l;

    /* renamed from: m  reason: collision with root package name */
    private int f14754m;
    private int n;
    private Uri o;

    static {
        Covode.recordClassIndex(8182);
    }

    /* access modifiers changed from: package-private */
    public static final class a {
        @com.google.gson.a.c(a = "uri")

        /* renamed from: a  reason: collision with root package name */
        String f14777a;
        @com.google.gson.a.c(a = "local_url")

        /* renamed from: b  reason: collision with root package name */
        String f14778b;
        @com.google.gson.a.c(a = "local_img")

        /* renamed from: c  reason: collision with root package name */
        String f14779c;

        static {
            Covode.recordClassIndex(8193);
        }

        a() {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {
        @com.google.gson.a.c(a = "code")

        /* renamed from: a  reason: collision with root package name */
        int f14780a;
        @com.google.gson.a.c(a = "status")

        /* renamed from: b  reason: collision with root package name */
        int f14781b;
        @com.google.gson.a.c(a = "status_msg")

        /* renamed from: c  reason: collision with root package name */
        String f14782c;
        @com.google.gson.a.c(a = "data")

        /* renamed from: d  reason: collision with root package name */
        a f14783d;

        static {
            Covode.recordClassIndex(8194);
        }

        public b() {
        }

        private b(int i2, String str, a aVar) {
            this.f14780a = 1;
            this.f14781b = i2;
            this.f14782c = str;
            this.f14783d = aVar;
        }

        /* synthetic */ b(int i2, String str, a aVar, byte b2) {
            this(i2, str, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        com.bytedance.android.livesdk.l.a aVar = this.f14745d;
        if (aVar != null && aVar.isShowing()) {
            this.f14745d.dismiss();
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
        f.a.b.b bVar = this.f14743b;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f14744c = null;
        this.f14746e = null;
    }

    private static boolean d() {
        if (Build.VERSION.SDK_INT > 29 || LiveCoverCropCustomStyleSetting.INSTANCE.enable()) {
            return true;
        }
        return false;
    }

    private Uri e() {
        return a("upload_photo_" + this.f14750i);
    }

    private String g() {
        return h() + ".jpeg";
    }

    private String h() {
        return "upload_photo_" + this.f14750i;
    }

    public final void b() {
        a();
        finishWithResult(new b(1, y.a((int) R.string.gnc), new a(), (byte) 0));
    }

    public final void c() {
        a();
        finishWithResult(new b(1, y.a((int) R.string.gnc), new a(), (byte) 0));
    }

    private Uri f() {
        File file = new File(this.f14742a + "/" + g());
        if (!file.exists()) {
            try {
                File file2 = new File(this.f14742a);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e2) {
                i.b();
                com.bytedance.android.live.core.c.a.a(6, "ttlive_exception", e2.getStackTrace());
            }
        }
        return TTLiveFileProvider.getUri(this.f14744c.getActivity(), this.f14744c.getActivity().getPackageName() + ".ttlive_provider", file);
    }

    public t(Fragment fragment) {
        this.f14744c = fragment;
        this.f14742a = com.bytedance.android.livesdk.utils.g.a();
    }

    private void a(Uri uri) {
        com.bytedance.android.livesdk.utils.crop.a a2 = a.C0486a.a(uri);
        a2.a(new u(this));
        a2.show(this.f14744c.getChildFragmentManager(), "upload_photo");
    }

    private Uri a(String str) {
        if (str == null) {
            str = "";
        }
        File file = new File(this.f14742a + "/" + str);
        if (!file.exists()) {
            try {
                File file2 = new File(this.f14742a);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return Uri.fromFile(file);
    }

    private void b(Uri uri) {
        com.bytedance.android.live.core.d.c.a("ttlive_upload_cover_want_crop", 0, (JSONObject) null);
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.addFlags(1);
        intent.addFlags(2);
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("scale", true);
        intent.putExtra("aspectX", this.f14754m);
        intent.putExtra("aspectY", this.n);
        intent.putExtra("return-data", false);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", true);
        intent.putExtra("scaleUpIfNeeded", true);
        Uri e2 = e();
        if (e2 != null) {
            intent.putExtra("output", e2);
        }
        try {
            Fragment fragment = this.f14744c;
            if (fragment != null) {
                fragment.startActivityForResult(intent, 40002);
                return;
            }
            throw new NullPointerException("getActivity");
        } catch (Exception unused) {
            n.a(this.f14744c.getContext(), (int) R.string.gxk);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r2 = com.bytedance.android.livesdk.utils.g.a(r0, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(final android.net.Uri r4) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.t.c(android.net.Uri):void");
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        public d<com.bytedance.android.live.base.model.user.c> f14784a;

        /* renamed from: b  reason: collision with root package name */
        public String f14785b;

        static {
            Covode.recordClassIndex(8195);
        }

        public c(String str, d<com.bytedance.android.live.base.model.user.c> dVar) {
            this.f14784a = dVar;
            this.f14785b = str;
        }
    }

    private void a(Uri uri, boolean z) {
        if (uri != null) {
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
                } catch (Exception unused2) {
                    return;
                }
            }
            if (d()) {
                a(uri);
            } else {
                b(uri);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(JSONObject jSONObject, final g gVar) {
        JSONObject jSONObject2 = jSONObject;
        this.f14746e = gVar;
        String optString = jSONObject2.optString(StringSet.type);
        final JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
        if (jSONObject3 == null) {
            finishWithResult(new b(4, y.a((int) R.string.gwy), new a(), (byte) 0));
            return;
        }
        int optInt = jSONObject3.optInt("action_type", 0);
        this.f14748g = jSONObject3.optString("url");
        this.f14749h = new JSONObject();
        int i2 = -1;
        if (jSONObject3.getJSONObject("params") != null) {
            JSONObject jSONObject4 = jSONObject3.getJSONObject("params");
            this.f14749h = jSONObject4;
            i2 = jSONObject4.optInt("encrypt", -1);
        }
        if (TextUtils.isEmpty(this.f14748g) || (!this.f14748g.startsWith("https") && i2 == 1)) {
            finishWithResult(new b(5, y.a((int) R.string.gnd), new a(), (byte) 0));
            return;
        }
        androidx.fragment.app.e a2 = p.a(gVar.f35646a);
        if (a2 == null || !TextUtils.equals("video", optString)) {
            if (TextUtils.equals("picture", optString)) {
                this.f14750i = String.valueOf(System.currentTimeMillis());
                this.f14753l = jSONObject3.optInt("min_width");
                this.f14752k = jSONObject3.optInt("min_height");
                this.f14754m = jSONObject3.optInt("aspect_x", 1);
                this.n = jSONObject3.optInt("aspect_y", 1);
                androidx.fragment.app.e activity = this.f14744c.getActivity();
                if (optInt == 0) {
                    com.bytedance.android.livesdk.browser.a.a(activity, this.f14744c, this.f14742a, g());
                } else if (optInt == 1) {
                    com.bytedance.android.livesdk.browser.a.a(activity, this.f14744c);
                }
            }
        } else if (optInt == 0) {
            f.a(a2).a(new com.bytedance.android.livesdk.ah.b.d() {
                /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.t.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(8183);
                }

                @Override // com.bytedance.android.livesdk.ah.b.d
                public final void b(String... strArr) {
                    n.a(gVar.f35646a, 2131234317, (int) R.string.gma);
                    t.this.finishWithFailure();
                }

                @Override // com.bytedance.android.livesdk.ah.b.d
                public final void a(String... strArr) {
                    Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                    intent.putExtra("android.intent.extra.durationLimit", jSONObject3.optInt("duration_limit", 10000) / 1000);
                    intent.putExtra("android.intent.extra.videoQuality", 1);
                    if (t.this.f14744c.getActivity() == null) {
                        t.this.finishWithFailure();
                    } else {
                        t.this.f14744c.startActivityForResult(intent, 9001);
                    }
                }
            }, "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
        } else if (optInt == 1) {
            f.a(a2).a(new com.bytedance.android.livesdk.ah.b.d() {
                /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.t.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(8186);
                }

                @Override // com.bytedance.android.livesdk.ah.b.d
                public final void b(String... strArr) {
                    n.a(gVar.f35646a, 2131234317, (int) R.string.gma);
                    t.this.finishWithFailure();
                }

                @Override // com.bytedance.android.livesdk.ah.b.d
                public final void a(String... strArr) {
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    if (jSONObject3.optInt("duration_limit", -1) != -1) {
                        t.this.finishWithResult(new b(1, "Local video does not support duration_limit parameter", new a(), (byte) 0));
                        return;
                    }
                    intent.setType("video/*");
                    if (t.this.f14744c.getActivity() == null) {
                        t.this.finishWithFailure();
                    } else {
                        t.this.f14744c.startActivityForResult(intent, 9002);
                    }
                }
            }, "android.permission.READ_EXTERNAL_STORAGE");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.net.Uri r8, int r9, int r10) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.t.a(android.net.Uri, int, int):boolean");
    }

    public final d<com.bytedance.android.live.base.model.user.c> a(String str, byte[] bArr, JSONObject jSONObject) {
        MethodCollector.i(9939);
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("data", new TypedByteArray("multipart/form-data", bArr, "upload_photo_" + this.f14750i + "crop"));
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                buildUpon.appendQueryParameter(next, String.valueOf(jSONObject.opt(next)));
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            multipartTypedOutput.writeTo(byteArrayOutputStream);
        } catch (IOException e2) {
            com.bytedance.android.live.core.c.a.b("EncryptedUploadMethod", "uploadFile", e2);
        }
        String uri = buildUpon.build().toString();
        com.bytedance.android.live.core.c.a.a(3, "EncryptedUploadMethod", uri);
        String str2 = new String(h.a().a(-1, uri, new ArrayList(1), multipartTypedOutput.mimeType(), byteArrayOutputStream.toByteArray(), multipartTypedOutput.length(), multipartTypedOutput.md5Stub()).a().f23268e);
        d<com.bytedance.android.live.base.model.user.c> dVar = (d) e.a.f9628b.a(str2, new com.google.gson.b.a<d<com.bytedance.android.live.base.model.user.c>>() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.t.AnonymousClass2 */

            static {
                Covode.recordClassIndex(8185);
            }
        }.type);
        try {
            if (dVar.statusCode != 0) {
                dVar.error = (RequestError) e.a.f9628b.a(new JSONObject(str2).getJSONObject("data").toString(), RequestError.class);
            }
        } catch (JSONException e3) {
            com.bytedance.android.live.core.c.a.b("EncryptedUploadMethod", "uploadFile", e3);
        }
        MethodCollector.o(9939);
        return dVar;
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.c.a
    public final void a(int i2, int i3, final Intent intent) {
        if (9001 == i2 || 9002 == i2) {
            if (-1 != i3) {
                finishWithResult(new b(2, y.a((int) R.string.gnb), new a(), (byte) 0));
            } else if (intent == null || intent.getData() == null) {
                b();
            } else {
                androidx.fragment.app.e activity = this.f14744c.getActivity();
                if (activity == null) {
                    b();
                    return;
                }
                final byte[] a2 = com.bytedance.android.livesdk.utils.g.a(activity, intent.getData());
                a.C0382a aVar = new a.C0382a(activity);
                aVar.f18265b = y.a((int) R.string.gty);
                aVar.f18266c = false;
                com.bytedance.android.livesdk.l.a a3 = aVar.a();
                this.f14745d = a3;
                a3.show();
                f.a(this.f14744c.getActivity()).a(new com.bytedance.android.livesdk.ah.b.d() {
                    /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.t.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(8187);
                    }

                    @Override // com.bytedance.android.livesdk.ah.b.d
                    public final void b(String... strArr) {
                        com.bytedance.android.live.core.c.a.a(3, "EncryptedUploadMethod", "onPermissionDenied: ");
                    }

                    @Override // com.bytedance.android.livesdk.ah.b.d
                    public final void a(String... strArr) {
                        t tVar = t.this;
                        byte[] bArr = a2;
                        Uri data = intent.getData();
                        f.a.t.a(new v(tVar, data)).a((f.a.d.g) new f.a.d.g<String, x<c>>(bArr) {
                            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.t.AnonymousClass8 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ byte[] f14772a;

                            static {
                                Covode.recordClassIndex(8191);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // f.a.d.g
                            public final /* synthetic */ x<c> apply(String str) {
                                return f.a.t.a(new y(this, this.f14772a, str));
                            }

                            {
                                this.f14772a = r2;
                            }
                        }, false).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f<c>(data) {
                            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.t.AnonymousClass5 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ Uri f14768a;

                            static {
                                Covode.recordClassIndex(8188);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // f.a.d.f
                            public final /* synthetic */ void accept(c cVar) {
                                c cVar2 = cVar;
                                t tVar = t.this;
                                com.bytedance.android.live.base.model.user.c cVar3 = (com.bytedance.android.live.base.model.user.c) cVar2.f14784a.data;
                                Uri uri = this.f14768a;
                                String str = cVar2.f14785b;
                                tVar.a();
                                try {
                                    a aVar = new a();
                                    aVar.f14777a = cVar3.f7455a;
                                    com.bytedance.android.livesdk.browser.f.d.a();
                                    aVar.f14778b = com.bytedance.android.livesdk.browser.f.d.a(tVar.callContext.f35646a, uri);
                                    com.bytedance.android.livesdk.browser.f.d.a();
                                    aVar.f14779c = com.bytedance.android.livesdk.browser.f.d.a(str);
                                    b bVar = new b(0, y.a((int) R.string.gne), aVar, (byte) 0);
                                    tVar.f14746e.a("H5_uploadVideoStatus", bVar);
                                    tVar.finishWithResult(bVar);
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }

                            {
                                this.f14768a = r2;
                            }
                        }, new f.a.d.f<Throwable>() {
                            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.t.AnonymousClass6 */

                            static {
                                Covode.recordClassIndex(8189);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // f.a.d.f
                            public final /* synthetic */ void accept(Throwable th) {
                                Context context;
                                Throwable th2 = th;
                                if (!(t.this.f14744c == null || (context = t.this.f14744c.getContext()) == null)) {
                                    com.bytedance.android.live.core.e.b.a.a(context, th2, null);
                                }
                                t.this.b();
                            }
                        }, new f.a.d.a() {
                            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.t.AnonymousClass7 */

                            static {
                                Covode.recordClassIndex(8190);
                            }

                            @Override // f.a.d.a
                            public final void a() {
                            }
                        });
                    }
                }, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
            }
        } else if (i2 == 40003) {
            if (-1 != i3) {
                finishWithResult(new b(2, y.a((int) R.string.gnb), new a(), (byte) 0));
            } else if (intent == null || intent.getData() == null) {
                c();
            } else {
                androidx.fragment.app.e activity2 = this.f14744c.getActivity();
                if (activity2 == null) {
                    c();
                    return;
                }
                Uri data = intent.getData();
                String a4 = com.bytedance.android.livesdk.utils.c.a(activity2, data);
                if (m.a(a4)) {
                    c();
                } else if (!new File(a4).exists()) {
                    c();
                } else {
                    if ("file".equals(data.getScheme())) {
                        data = com.bytedance.android.livesdk.utils.c.a(activity2, a4);
                    }
                    a(data, false);
                }
            }
        } else if (i2 == 40004) {
            if (-1 != i3) {
                finishWithResult(new b(2, y.a((int) R.string.gnb), new a(), (byte) 0));
                return;
            }
            try {
                a(f(), true);
            } catch (Exception unused) {
            }
        } else if (i2 != 40002) {
        } else {
            if (-1 != i3) {
                finishWithResult(new b(2, y.a((int) R.string.gnb), new a(), (byte) 0));
                return;
            }
            androidx.fragment.app.e activity3 = this.f14744c.getActivity();
            if (activity3 == null) {
                c();
                return;
            }
            Uri uri = this.o;
            if (uri == null) {
                n.a(activity3, 2131234317, (int) R.string.gxi);
                c();
            } else if (!a(uri, this.f14753l, this.f14752k)) {
                com.bytedance.android.livesdk.browser.a.a(activity3, this.f14744c);
            } else {
                c(this.o);
            }
        }
    }
}
