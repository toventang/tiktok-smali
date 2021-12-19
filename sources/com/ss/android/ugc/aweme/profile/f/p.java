package com.ss.android.ugc.aweme.profile.f;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import c.b.e;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.dialog.o;
import com.bytedance.ies.uikit.dialog.b;
import com.bytedance.tux.sheet.a.a;
import com.ss.android.common.c.c;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.service.h;
import com.ss.android.ugc.aweme.utils.cp;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhihu.matisse.internal.entity.Item;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class p {

    /* renamed from: a  reason: collision with root package name */
    private int f116439a = 250;

    /* renamed from: b  reason: collision with root package name */
    protected final Activity f116440b;

    /* renamed from: c  reason: collision with root package name */
    protected final Resources f116441c;

    /* renamed from: d  reason: collision with root package name */
    protected final Fragment f116442d;

    /* renamed from: e  reason: collision with root package name */
    public final String f116443e;

    /* renamed from: f  reason: collision with root package name */
    protected final String f116444f;

    /* renamed from: g  reason: collision with root package name */
    protected final WeakHandler f116445g;

    /* renamed from: h  reason: collision with root package name */
    protected final a f116446h;

    /* renamed from: i  reason: collision with root package name */
    public int f116447i = 1;

    /* renamed from: j  reason: collision with root package name */
    private int f116448j = 250;

    /* renamed from: k  reason: collision with root package name */
    private o f116449k;

    public interface a {
        static {
            Covode.recordClassIndex(75171);
        }

        void b(String str);

        void c();
    }

    static {
        Covode.recordClassIndex(75166);
    }

    public static int b(int i2) {
        if (i2 == 0) {
            return 10003;
        }
        if (i2 == 1) {
            return 10006;
        }
        if (i2 == 2) {
            return 10007;
        }
        if (i2 == 3) {
            return 10008;
        }
        if (i2 == 5) {
            return 10010;
        }
        if (i2 != 6) {
            return i2 != 7 ? 10003 : 10014;
        }
        return 10013;
    }

    public static int c(int i2) {
        if (i2 == 0) {
            return 10004;
        }
        if (i2 != 3) {
            return i2 != 5 ? 10004 : 10011;
        }
        return 10009;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Activity activity, View view, String str, User user) {
        if (!f()) {
            h.f116622a.startHeaderDetailActivity(activity, view, str, user);
        }
    }

    public boolean a(int i2, int i3, Intent intent) {
        Uri uri;
        Uri uri2;
        Uri data;
        String a2;
        if (i2 == 10004 || i2 == 10009 || i2 == 10011) {
            h.f116622a.getNotificationManagerHandleSystemCamera().invoke(false);
        }
        if (i3 != -1) {
            return false;
        }
        if (i2 != 10003 && i2 != 10008 && i2 != 10006 && i2 != 10010) {
            if (i2 == 10007 || i2 == 10014) {
                if (intent == null) {
                    return false;
                }
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_result_selection");
                if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
                    uri2 = intent.getData();
                } else {
                    uri2 = (Uri) parcelableArrayListExtra.get(0);
                }
                String a3 = c.d.a.a(this.f116440b, uri2);
                if (m.a(a3)) {
                    new com.bytedance.tux.g.b(this.f116440b).b(2131231585).e(R.string.dq2).b();
                    return false;
                } else if (!new File(a3).exists()) {
                    new com.bytedance.tux.g.b(this.f116440b).b(2131231585).e(R.string.dq2).b();
                    return false;
                } else {
                    a aVar = this.f116446h;
                    if (aVar != null) {
                        aVar.b(a3);
                    }
                }
            } else if (i2 == 10004 || i2 == 10009 || i2 == 10011) {
                try {
                    a(b(b()), true, i2);
                    return true;
                } catch (Exception unused) {
                }
            } else if (i2 != 10002 || intent == null || (data = intent.getData()) == null || (a2 = c.d.a.a(this.f116440b, data)) == null) {
                return false;
            } else {
                File file = new File(a2);
                if (!file.exists()) {
                    return false;
                }
                if (v.a(file.getAbsolutePath(), this.f116439a, this.f116448j)) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.f116440b).a(R.string.dqn).a();
                    return true;
                }
                a aVar2 = this.f116446h;
                if (aVar2 != null) {
                    aVar2.b(file.getAbsolutePath());
                }
                return true;
            }
            return false;
        } else if (intent == null) {
            return false;
        } else {
            ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("extra_result_selection");
            if (parcelableArrayListExtra2 == null || parcelableArrayListExtra2.isEmpty()) {
                uri = intent.getData();
            } else {
                uri = (Uri) parcelableArrayListExtra2.get(0);
            }
            if (!e.c(this.f116440b, uri)) {
                new com.bytedance.tux.g.b(this.f116440b).b(2131231585).e(R.string.dq2).b();
                return false;
            }
            a(uri, false, i2);
            return true;
        }
    }

    public final String h() {
        return b();
    }

    public static class b extends com.zhihu.matisse.a.a {

        /* renamed from: a  reason: collision with root package name */
        private int f116459a = 250;

        /* renamed from: b  reason: collision with root package name */
        private int f116460b = 250;

        static {
            Covode.recordClassIndex(75172);
        }

        public b() {
        }

        public b(int i2, int i3) {
            this.f116459a = i2;
            this.f116460b = i3;
        }

        @Override // com.zhihu.matisse.a.a
        public final com.zhihu.matisse.internal.entity.b a(Context context, Item item) {
            Uri uri = item.f156423c;
            if (SettingsManager.a().a("head_upload_filter_settings", false) && !e.c(context, uri)) {
                return new com.zhihu.matisse.internal.entity.b(context.getString(R.string.dq6), (byte) 0);
            }
            if (v.a(context, uri, this.f116459a, this.f116460b)) {
                return new com.zhihu.matisse.internal.entity.b(context.getString(R.string.dqn), (byte) 0);
            }
            return null;
        }
    }

    public final void g() {
        o oVar = this.f116449k;
        if (oVar != null && oVar.isShowing()) {
            this.f116449k.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j() {
        c.a(this.f116440b, "live_image_popup", "cancel");
    }

    public final void e() {
        new b.a(this.f116440b).a(a(this.f116441c, 0, 1, 4), new DialogInterface.OnClickListener(0) {
            /* class com.ss.android.ugc.aweme.profile.f.p.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f116450a = 0;

            static {
                Covode.recordClassIndex(75167);
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (TextUtils.isEmpty(p.this.f116443e)) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(p.this.f116440b).a(R.string.fhb).a();
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("SD card is not available"));
                } else if (i2 == 0) {
                    p.this.e(this.f116450a);
                } else if (i2 != 1) {
                    c.a(p.this.f116440b, "live_image_popup", "cancel");
                } else {
                    p.this.a(this.f116450a);
                }
            }
        }).b().show();
    }

    /* access modifiers changed from: protected */
    public final boolean f() {
        if (!TextUtils.isEmpty(this.f116443e)) {
            return false;
        }
        new com.bytedance.tux.g.b(this.f116440b).e(R.string.fhb).b();
        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("SD card is not available"));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i() {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + this.f116440b.getPackageName()));
            intent.addFlags(268435456);
            Activity activity = this.f116440b;
            com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
            activity.startActivity(intent);
        } catch (Exception unused) {
            cp.a(this.f116440b);
        }
    }

    /* access modifiers changed from: protected */
    public String b() {
        return this.f116443e + "/" + this.f116444f;
    }

    private static File a(Context context) {
        File b2 = b(context);
        if (b2 != null) {
            return b2;
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        com.bytedance.services.apm.api.a.a("HeadUploadHelper: cache dir == null");
        return externalStorageDirectory;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(int i2) {
        if (!f()) {
            a(i2);
        }
    }

    private static File b(Context context) {
        if (d.f107193a != null && d.f107197e) {
            return d.f107193a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        d.f107193a = externalCacheDir;
        return externalCacheDir;
    }

    public final File a(String str) {
        if (!com.ss.android.ugc.aweme.video.e.d() || !com.ss.android.ugc.aweme.video.e.e() || TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(a(this.f116440b), str);
        com.ss.android.ugc.aweme.video.e.a(file);
        return file;
    }

    private Uri b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            try {
                File file2 = new File(this.f116443e);
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

    public final void a(final int i2) {
        if (androidx.core.content.c.a(this.f116440b, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            try {
                com.ss.android.ugc.aweme.ce.b.a(this.f116440b, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new b.AbstractC1579b() {
                    /* class com.ss.android.ugc.aweme.profile.f.p.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(75168);
                    }

                    @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
                    public final void a(String[] strArr, int[] iArr) {
                        if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                            c.a(p.this.f116440b, "live_image_popup", "album");
                            p.this.d(p.b(i2));
                        } else if (!androidx.core.app.a.a(p.this.f116440b, "android.permission.READ_EXTERNAL_STORAGE")) {
                            p.this.a(R.string.axi, R.string.aj2);
                        } else {
                            new com.ss.android.ugc.aweme.tux.a.i.a(p.this.f116440b).a(p.this.f116440b.getString(R.string.doy)).a();
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        } else {
            c.a(this.f116440b, "live_image_popup", "album");
            d(b(i2));
        }
    }

    public final void e(final int i2) {
        if (com.ss.android.ugc.aweme.utils.permission.e.a()) {
            com.ss.android.ugc.aweme.ce.b.a(this.f116440b, new String[]{"android.permission.CAMERA"}, new b.AbstractC1579b() {
                /* class com.ss.android.ugc.aweme.profile.f.p.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(75169);
                }

                @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
                public final void a(String[] strArr, int[] iArr) {
                    if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                        c.a(p.this.f116440b, "live_image_popup", "take_photo");
                        h.f116622a.getStartCameraActivity().invoke(p.this.f116440b, p.this.f116442d, Integer.valueOf(p.c(i2)), p.this.f116443e, p.this.f116444f);
                    } else if (!androidx.core.app.a.a(p.this.f116440b, "android.permission.CAMERA")) {
                        p.this.a(R.string.ght, R.string.a9p);
                    } else {
                        new com.ss.android.ugc.aweme.tux.a.i.a(p.this.f116440b).a(p.this.f116440b.getString(R.string.dow)).a();
                    }
                }
            });
        } else if (com.ss.android.ugc.aweme.utils.permission.e.a(this.f116440b) != -1) {
            c.a(this.f116440b, "live_image_popup", "take_photo");
            h.f116622a.getStartCameraActivity().invoke(this.f116440b, this.f116442d, Integer.valueOf(c(i2)), this.f116443e, this.f116444f);
        } else if (!androidx.core.app.a.a(this.f116440b, "android.permission.CAMERA")) {
            a(R.string.ght, R.string.a9p);
        } else {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f116440b).a(this.f116440b.getString(R.string.dow)).a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(int i2) {
        c.a(this.f116440b, "live_image_popup", "album");
        try {
            Fragment fragment = this.f116442d;
            if (fragment != null) {
                com.zhihu.matisse.a.a(fragment).a(com.zhihu.matisse.b.ofImage()).a().c().a(this.f116447i).d().b().e().a(new b(this.f116439a, this.f116448j)).b(i2);
            } else {
                com.zhihu.matisse.a.a(this.f116440b).a(com.zhihu.matisse.b.ofImage()).a().c().a(this.f116447i).d().b().e().a(new b(this.f116439a, this.f116448j)).b(i2);
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            com.ss.android.newmedia.d.a(this.f116440b, this.f116442d, i2);
        }
    }

    public final void b(String str, List<com.ss.android.http.a.b.d> list) {
        a aVar = this.f116446h;
        if (aVar != null) {
            aVar.c();
        }
        a(0, str, list);
    }

    private static String[] a(Resources resources, short... sArr) {
        String[] stringArray = resources.getStringArray(R.array.ad);
        String[] strArr = new String[sArr.length];
        for (int i2 = 0; i2 < sArr.length; i2++) {
            strArr[i2] = stringArray[sArr[i2]];
        }
        return strArr;
    }

    public final void a(int i2, int i3) {
        ((com.bytedance.tux.dialog.e) new com.bytedance.tux.dialog.e(this.f116440b).a(i2).b(i3)).a((DialogInterface.OnClickListener) null).a(R.string.c5g, new u(this)).a().b().show();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Activity activity, int i2) {
        if (!f()) {
            if (activity == null || !MSAdaptionService.c().b(activity)) {
                e(i2);
                return;
            }
            Toast makeText = Toast.makeText(activity, activity.getString(R.string.bey), 0);
            if (Build.VERSION.SDK_INT == 25) {
                ic.a(makeText);
            }
            makeText.show();
        }
    }

    private void a(Uri uri, boolean z, int i2) {
        Context context;
        int i3;
        boolean z2;
        float f2;
        if (uri != null) {
            if (!z) {
                String lastPathSegment = uri.getLastPathSegment();
                int i4 = Build.VERSION.SDK_INT;
                if (!m.a(lastPathSegment) && lastPathSegment.contains(":")) {
                    lastPathSegment = lastPathSegment.split(":")[1];
                }
                try {
                    ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Long.parseLong(lastPathSegment));
                } catch (NumberFormatException unused) {
                }
            }
            Fragment fragment = this.f116442d;
            if (fragment != null) {
                context = fragment.getContext();
            } else {
                context = this.f116440b;
            }
            if (context != null) {
                if (i2 == 10003 || i2 == 10004) {
                    z2 = true;
                    i3 = 0;
                } else {
                    z2 = false;
                    i3 = -1;
                }
                if (z2 || i2 == 10009 || i2 == 10008 || i2 == 10010 || i2 == 10011) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.5625f;
                }
                if (Math.abs(f2 - 1.0f) < Float.MIN_NORMAL) {
                    n.b(context, 30.0f);
                } else {
                    n.b(context, 16.0f);
                }
                int b2 = (int) n.b(context, 16.0f);
                if (this.f116442d == null) {
                    h.f116622a.gotoCropActivity(this.f116440b, uri.toString(), z2, f2, b2, 10002, this.f116439a, this.f116448j, i3);
                } else {
                    h.f116622a.gotoCropActivity(this.f116442d, uri.toString(), z2, f2, b2, 10002, this.f116439a, this.f116448j, i3);
                }
            }
        }
    }

    public final void a(int i2, final String str, final List<com.ss.android.http.a.b.d> list) {
        com.ss.android.b.a.a.a.a(new Runnable() {
            /* class com.ss.android.ugc.aweme.profile.f.p.AnonymousClass4 */

            static {
                Covode.recordClassIndex(75170);
            }

            public final void run() {
                int i2;
                try {
                    File file = new File(str);
                    if (file.exists() && file.length() > 4194304) {
                        com.ss.android.ugc.aweme.framework.a.a.a("upload file size: " + file.length());
                        i2 = (((int) (file.length() / 1024)) + 1) * 1024;
                        com.ss.android.ugc.aweme.account.b.g().uploadAvatar(p.this.f116445g, Api.f66570e + "?uid=" + com.ss.android.ugc.aweme.account.b.g().getCurUserId(), i2, str, list);
                    }
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                }
                i2 = 4194304;
                com.ss.android.ugc.aweme.account.b.g().uploadAvatar(p.this.f116445g, Api.f66570e + "?uid=" + com.ss.android.ugc.aweme.account.b.g().getCurUserId(), i2, str, list);
            }
        }, i2);
    }

    public p(Activity activity, Fragment fragment, WeakHandler weakHandler, a aVar) {
        this.f116440b = activity;
        this.f116442d = fragment;
        this.f116445g = weakHandler;
        this.f116446h = aVar;
        File a2 = a("head");
        if (a2 != null) {
            this.f116443e = a2.getPath();
        } else {
            this.f116443e = "";
        }
        this.f116444f = "head.data";
        this.f116441c = activity.getResources();
    }

    public final void a(Activity activity, View view, User user, String str) {
        String str2;
        String str3;
        String[] a2 = a(this.f116441c, 0, 1, 3, 4);
        a.b a3 = new a.b().a(new q(this));
        a.e[] eVarArr = new a.e[3];
        a.e eVar = new a.e();
        String str4 = "";
        if (a2.length > 0) {
            str2 = a2[0];
        } else {
            str2 = str4;
        }
        eVarArr[0] = eVar.a(str2).a(new r(this, activity, 0));
        a.e eVar2 = new a.e();
        if (a2.length >= 2) {
            str3 = a2[1];
        } else {
            str3 = str4;
        }
        eVarArr[1] = eVar2.a(str3).a(new s(this, 0));
        a.e eVar3 = new a.e();
        if (a2.length >= 3) {
            str4 = a2[2];
        }
        eVarArr[2] = eVar3.a(str4).a(new t(this, activity, view, str, user));
        a3.a(eVarArr).b().show(this.f116442d.getFragmentManager(), "Click Avatar Image");
    }
}
