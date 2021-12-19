package com.bytedance.android.livesdk.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentUris;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.appcompat.app.c;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.n.h;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.l.a;
import com.bytedance.android.livesdk.utils.crop.a;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class l implements h {
    private static SimpleDateFormat n;

    /* renamed from: a  reason: collision with root package name */
    Activity f22333a;

    /* renamed from: b  reason: collision with root package name */
    final Fragment f22334b;

    /* renamed from: c  reason: collision with root package name */
    final String f22335c;

    /* renamed from: d  reason: collision with root package name */
    String f22336d;

    /* renamed from: e  reason: collision with root package name */
    final h.a f22337e;

    /* renamed from: f  reason: collision with root package name */
    final Map<String, String> f22338f;

    /* renamed from: g  reason: collision with root package name */
    private final Resources f22339g;

    /* renamed from: h  reason: collision with root package name */
    private final String f22340h;

    /* renamed from: i  reason: collision with root package name */
    private final int f22341i;

    /* renamed from: j  reason: collision with root package name */
    private final int f22342j;

    /* renamed from: k  reason: collision with root package name */
    private final int f22343k;

    /* renamed from: l  reason: collision with root package name */
    private final int f22344l;

    /* renamed from: m  reason: collision with root package name */
    private final String f22345m;
    private boolean o;
    private Dialog p;

    static {
        Covode.recordClassIndex(13190);
    }

    @Override // com.bytedance.android.live.n.h
    public final void b() {
        Dialog dialog = this.p;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    private Uri f() {
        return a(g());
    }

    private String g() {
        return this.f22340h + "_" + this.f22336d + this.f22345m;
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return (this.f22340h + "_" + this.f22336d) + ".jpeg";
    }

    private Uri e() {
        File file = new File(this.f22335c + "/" + d());
        if (!file.exists()) {
            try {
                File file2 = new File(this.f22335c);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException unused) {
                return null;
            }
        }
        return TTLiveFileProvider.getUri(this.f22333a, this.f22333a.getPackageName() + ".ttlive_provider", file);
    }

    @Override // com.bytedance.android.live.n.h
    public final void c() {
        this.f22336d = String.valueOf(System.currentTimeMillis());
        String[] strArr = {this.f22339g.getString(R.string.em5), this.f22339g.getString(R.string.em6), this.f22339g.getString(R.string.em4)};
        c.a aVar = new c.a(this.f22333a);
        aVar.a(strArr, new m(this));
        aVar.a(true);
        aVar.b();
    }

    @Override // com.bytedance.android.live.n.h
    public final void a() {
        if (this.p == null) {
            a.C0382a aVar = new a.C0382a(this.f22333a);
            aVar.f18265b = this.f22333a.getString(R.string.gv7);
            aVar.f18266c = true;
            this.p = aVar.a();
        }
        if (!this.p.isShowing()) {
            this.p.show();
        }
    }

    private void a(int i2) {
        ao.a(this.f22333a, i2);
    }

    private void a(Uri uri) {
        com.bytedance.android.livesdk.utils.crop.a a2 = a.C0486a.a(uri);
        a2.a(new n(this));
        a2.show(this.f22334b.getChildFragmentManager(), this.f22340h);
    }

    private Uri a(String str) {
        if (str == null) {
            str = "";
        }
        File file = new File(this.f22335c + "/" + str);
        if (!file.exists()) {
            try {
                File file2 = new File(this.f22335c);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException unused) {
                return null;
            }
        }
        return Uri.fromFile(file);
    }

    private static String b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            String attribute = new ExifInterface(str).getAttribute("DateTime");
            if (!TextUtils.isEmpty(attribute)) {
                if (n == null) {
                    n = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
                }
                return String.valueOf(n.parse(attribute).getTime());
            }
        } catch (IOException | ParseException unused) {
        }
        return String.valueOf(file.lastModified());
    }

    private void b(Uri uri) {
        com.bytedance.android.live.core.d.c.a("ttlive_upload_cover_want_crop", 0, (JSONObject) null);
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.addFlags(1);
        intent.addFlags(2);
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("scale", true);
        intent.putExtra("aspectX", this.f22341i);
        intent.putExtra("aspectY", this.f22342j);
        intent.putExtra("return-data", false);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", true);
        intent.putExtra("scaleUpIfNeeded", true);
        Uri f2 = f();
        if (f2 != null) {
            intent.putExtra("output", f2);
        }
        try {
            Fragment fragment = this.f22334b;
            if (fragment != null) {
                fragment.startActivityForResult(intent, 40002);
            } else {
                this.f22333a.startActivityForResult(intent, 40002);
            }
        } catch (Exception unused) {
            a(R.string.gxk);
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
            if (this.o) {
                a(uri);
            } else {
                b(uri);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0058, code lost:
        if (0 == 0) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.String r8, int r9, int r10) {
        /*
            r7 = this;
            r6 = 12639(0x315f, float:1.7711E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            r5 = 1
            r1 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0058, all -> 0x0053 }
            r4.<init>(r8)     // Catch:{ FileNotFoundException -> 0x0058, all -> 0x0053 }
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004c }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004c }
            r3.inJustDecodeBounds = r5     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004c }
            android.graphics.BitmapFactory.decodeStream(r4, r1, r3)     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004c }
            int r0 = r3.outWidth     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004c }
            r2 = 0
            if (r9 > r0) goto L_0x003a
            int r0 = r3.outHeight     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004c }
            if (r10 <= r0) goto L_0x0020
            goto L_0x003a
        L_0x0020:
            int r1 = r3.outWidth     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004c }
            int r0 = r3.outHeight     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004c }
            int r1 = r1 * r0
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 <= r0) goto L_0x0036
            r0 = 2131831110(0x7f112946, float:1.9295236E38)
            r7.a(r0)     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004c }
            r4.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r2
        L_0x0036:
            r4.close()     // Catch:{ IOException -> 0x005d }
            goto L_0x005d
        L_0x003a:
            r0 = 2131831111(0x7f112947, float:1.9295238E38)
            r7.a(r0)
            java.lang.String r0 = "ttlive_upload_cover_small_toast"
            com.bytedance.android.live.core.d.c.a(r0, r2, r1)
            r4.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r2
        L_0x004c:
            r0 = move-exception
            r4.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0054
        L_0x0051:
            r1 = r4
            goto L_0x005a
        L_0x0053:
            r0 = move-exception
        L_0x0054:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            throw r0
        L_0x0058:
            if (r1 == 0) goto L_0x005d
        L_0x005a:
            r1.close()
        L_0x005d:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.l.a(java.lang.String, int, int):boolean");
    }

    @Override // com.bytedance.android.live.n.h
    public final boolean a(int i2, int i3, Intent intent) {
        if (i2 == 40003) {
            if (i3 == 0) {
                h.a aVar = this.f22337e;
                if (aVar != null) {
                    aVar.a();
                }
                return false;
            } else if (intent == null) {
                h.a aVar2 = this.f22337e;
                if (aVar2 != null) {
                    aVar2.a();
                }
                return false;
            } else {
                Uri data = intent.getData();
                String a2 = c.a(this.f22333a, data);
                if (m.a(a2)) {
                    h.a aVar3 = this.f22337e;
                    if (aVar3 != null) {
                        aVar3.a();
                    }
                    n.a(this.f22333a, 2131234317, (int) R.string.gxi);
                    return false;
                } else if (!new File(a2).exists()) {
                    h.a aVar4 = this.f22337e;
                    if (aVar4 != null) {
                        aVar4.a();
                    }
                    n.a(this.f22333a, 2131234317, (int) R.string.gxi);
                    return false;
                } else {
                    if ("file".equals(data.getScheme())) {
                        data = c.a(this.f22333a, a2);
                    }
                    this.f22338f.put(this.f22336d, b(a2));
                    a(data, false);
                    return true;
                }
            }
        } else if (i2 != 40004) {
            if (i2 == 40002) {
                if (i3 == 0) {
                    h.a aVar5 = this.f22337e;
                    if (aVar5 != null) {
                        aVar5.a();
                    }
                    return false;
                }
                b.a.a("livesdk_cover_crop_commit").a().c("click").b("live").d("cover_edit").b();
                File file = new File(this.f22335c + "/" + g());
                if (file.exists()) {
                    if (!a(file.getAbsolutePath(), this.f22343k, this.f22344l)) {
                        c.a(this.f22333a, this.f22334b);
                        return true;
                    }
                    String absolutePath = file.getAbsolutePath();
                    String remove = this.f22338f.remove(this.f22336d);
                    h.a aVar6 = this.f22337e;
                    if (aVar6 != null) {
                        aVar6.a(absolutePath, remove);
                    }
                }
                return true;
            }
            return false;
        } else if (i3 == 0) {
            h.a aVar7 = this.f22337e;
            if (aVar7 != null) {
                aVar7.a();
            }
            return false;
        } else {
            try {
                this.f22338f.put(this.f22336d, String.valueOf(System.currentTimeMillis()));
                a(e(), true);
                return true;
            } catch (Exception unused) {
            }
        }
    }

    public static h a(Activity activity, Fragment fragment, String str, int i2, int i3, int i4, int i5, h.a aVar) {
        return new l(activity, fragment, str, i2, i3, i4, i5, aVar);
    }

    private l(Activity activity, Fragment fragment, String str, int i2, int i3, int i4, int i5, h.a aVar) {
        this(activity, fragment, str, i2, i3, i4, i5, aVar, "", false);
    }

    public l(Activity activity, Fragment fragment, String str, int i2, int i3, int i4, int i5, h.a aVar, boolean z) {
        this(activity, fragment, str, i2, i3, i4, i5, aVar, "", z);
    }

    private l(Activity activity, Fragment fragment, String str, int i2, int i3, int i4, int i5, h.a aVar, String str2, boolean z) {
        this.f22338f = new HashMap();
        this.f22333a = activity;
        this.f22334b = fragment;
        this.f22337e = aVar;
        this.f22341i = i2;
        this.f22342j = i3;
        this.f22343k = i4;
        this.f22344l = i5;
        this.o = z;
        this.f22335c = g.a();
        this.f22340h = str + ".data";
        if (this.f22333a == null && fragment != null) {
            this.f22333a = fragment.getActivity();
        }
        this.f22339g = this.f22333a.getResources();
        this.f22345m = str2;
    }
}
