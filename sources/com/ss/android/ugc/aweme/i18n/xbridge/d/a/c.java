package com.ss.android.ugc.aweme.i18n.xbridge.d.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import b.i;
import b.j;
import c.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.a.e;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.ss.android.ugc.aweme.utils.cs;
import h.a.n;
import h.f.b.l;
import h.z;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

public final class c implements com.ss.android.ugc.aweme.i18n.xbridge.a.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f100021e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.i18n.xbridge.a.b f100022a;

    /* renamed from: b  reason: collision with root package name */
    public Uri f100023b;

    /* renamed from: c  reason: collision with root package name */
    public String f100024c;

    /* renamed from: d  reason: collision with root package name */
    public String f100025d;

    /* renamed from: f  reason: collision with root package name */
    private final WeakReference<Activity> f100026f;

    /* renamed from: g  reason: collision with root package name */
    private final ExecutorService f100027g;

    /* renamed from: h  reason: collision with root package name */
    private final ExecutorService f100028h;

    /* renamed from: i  reason: collision with root package name */
    private AsyncTaskC2454c f100029i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f100030j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f100031k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f100032l;

    static {
        Covode.recordClassIndex(63750);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63751);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static String a(Context context, String str) {
            String a2 = c.d.a.a(context, Uri.parse(str));
            if (a2 == null) {
                a2 = "";
            }
            try {
                String b2 = cs.b(a2);
                l.b(b2, "");
                return b2;
            } catch (IOException unused) {
                return "";
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.c$c  reason: collision with other inner class name */
    public static final class AsyncTaskC2454c extends AsyncTask<z, z, Uri> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f100038a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<Activity> f100039b;

        /* renamed from: c  reason: collision with root package name */
        private final WeakReference<c> f100040c;

        static {
            Covode.recordClassIndex(63754);
        }

        /* access modifiers changed from: protected */
        public final void onCancelled() {
            c cVar = this.f100040c.get();
            if (cVar != null) {
                cVar.f100022a.a(-7, "Take photo cancelled");
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Uri doInBackground(z... zVarArr) {
            l.d(zVarArr, "");
            Activity activity = this.f100039b.get();
            if (activity == null) {
                return null;
            }
            try {
                String concat = "Dou_fsm_".concat(String.valueOf(new SimpleDateFormat("yyyy-MMdd_HHmmss", Locale.ENGLISH).format(new Date())));
                if (this.f100038a) {
                    return e.a(activity, concat + ".jpg", "image/jpeg");
                }
                File createTempFile = File.createTempFile(concat, ".jpg", com.ss.android.ugc.aweme.i18n.xbridge.d.a.a());
                c cVar = this.f100040c.get();
                if (cVar != null) {
                    l.b(createTempFile, "");
                    String absolutePath = createTempFile.getAbsolutePath();
                    l.b(absolutePath, "");
                    cVar.f100024c = absolutePath;
                }
                return com.ss.android.newmedia.d.a(activity, createTempFile);
            } catch (IOException unused) {
                return null;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(Uri uri) {
            Uri uri2 = uri;
            c cVar = this.f100040c.get();
            Activity activity = this.f100039b.get();
            if (cVar != null && activity != null) {
                if (uri2 == null) {
                    cVar.f100022a.a(0, "Take photo failed");
                    return;
                }
                cVar.f100023b = uri2;
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                if (l.a((Object) cVar.f100025d, (Object) "front")) {
                    intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                    intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                    intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                    intent.putExtra("default_camera", "1");
                    intent.putExtra("default_mode", "com.huawei.camera2.mode.photo.PhotoMode");
                    intent.putExtra("camerafacing", "front");
                    intent.putExtra("previous_mode", "front");
                }
                intent.putExtra("output", uri2);
                intent.addFlags(3);
                activity.startActivityForResult(intent, 1);
            }
        }

        public AsyncTaskC2454c(Activity activity, c cVar, boolean z) {
            l.d(activity, "");
            l.d(cVar, "");
            this.f100038a = z;
            this.f100039b = new WeakReference<>(activity);
            this.f100040c = new WeakReference<>(cVar);
        }
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<Activity> f100033a;

        /* renamed from: b  reason: collision with root package name */
        private final String f100034b;

        /* renamed from: c  reason: collision with root package name */
        private final WeakReference<com.ss.android.ugc.aweme.i18n.xbridge.a.b> f100035c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f100036d;

        static {
            Covode.recordClassIndex(63752);
        }

        public final void run() {
            Activity activity;
            String str = this.f100034b;
            if (str != null) {
                i<String> a2 = a(str);
                try {
                    a2.f();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                String d2 = a2.d();
                if (d2 != null) {
                    e.a aVar = new e.a(d2, new File(d2).length(), "image");
                    if (this.f100036d && (activity = this.f100033a.get()) != null) {
                        l.b(activity, "");
                        aVar.f35801a = a.a(activity, d2);
                    }
                    List<e.a> a3 = n.a(aVar);
                    com.ss.android.ugc.aweme.i18n.xbridge.a.b bVar = this.f100035c.get();
                    if (bVar != null) {
                        com.bytedance.ies.xbridge.base.runtime.a.e eVar = new com.bytedance.ies.xbridge.base.runtime.a.e();
                        eVar.f35800a = a3;
                        bVar.a(eVar);
                        if (z.f158842a != null) {
                            return;
                        }
                    }
                }
                com.ss.android.ugc.aweme.i18n.xbridge.a.b bVar2 = this.f100035c.get();
                if (bVar2 != null) {
                    bVar2.a(0, "CompressFilePath is null");
                }
            }
        }

        public static final class a implements IAVProcessService.IProcessCallback<String> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f100037a;

            static {
                Covode.recordClassIndex(63753);
            }

            a(j jVar) {
                this.f100037a = jVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
            public final /* synthetic */ void finish(String str) {
                this.f100037a.a(str);
            }
        }

        private static i<String> a(String str) {
            j jVar = new j();
            try {
                AVExternalServiceImpl.a().abilityService().processService().compressPhoto(str, 216, 384, new a(jVar));
            } catch (Exception e2) {
                e2.printStackTrace();
                jVar.a((Object) null);
            }
            i<TResult> iVar = jVar.f4869a;
            l.b(iVar, "");
            return iVar;
        }

        public b(WeakReference<Activity> weakReference, String str, com.ss.android.ugc.aweme.i18n.xbridge.a.b bVar, boolean z) {
            l.d(weakReference, "");
            l.d(bVar, "");
            this.f100033a = weakReference;
            this.f100036d = z;
            this.f100034b = str;
            this.f100035c = new WeakReference<>(bVar);
        }
    }

    public final void a(Activity activity) {
        AsyncTaskC2454c cVar = this.f100029i;
        if (cVar != null) {
            cVar.cancel(false);
        }
        AsyncTaskC2454c cVar2 = new AsyncTaskC2454c(activity, this, this.f100032l);
        cVar2.executeOnExecutor(this.f100027g, new z[0]);
        this.f100029i = cVar2;
    }

    @Override // com.ss.android.ugc.aweme.i18n.xbridge.a.a
    public final void a(com.bytedance.ies.xbridge.base.runtime.a.d dVar) {
        boolean z;
        String[] strArr;
        l.d(dVar, "");
        Activity activity = this.f100026f.get();
        if (activity == null) {
            this.f100022a.a(0, "Activity not found");
            return;
        }
        PackageManager packageManager = activity.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        if (!packageManager.hasSystemFeature("android.hardware.camera.any")) {
            this.f100022a.a(0, "Camera feature not found");
        } else if (new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(activity.getPackageManager()) == null) {
            this.f100022a.a(0, "Camera app not found");
        } else {
            this.f100025d = dVar.f35796j;
            if (dVar.f35794h || dVar.f35790d) {
                z = true;
            } else {
                z = false;
            }
            this.f100030j = z;
            this.f100031k = dVar.f35790d;
            this.f100032l = dVar.f35795i;
            boolean a2 = a(activity, "android.permission.CAMERA");
            if (!this.f100032l ? !a2 : !a2 || !a(activity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                if (this.f100032l) {
                    strArr = new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
                } else {
                    strArr = new String[]{"android.permission.CAMERA"};
                }
                com.ss.android.ugc.aweme.ce.b.a(activity, strArr, new d(this, activity));
                return;
            }
            a(activity);
        }
    }

    private static boolean a(Activity activity, String str) {
        if (androidx.core.content.b.a(activity, str) == 0) {
            return true;
        }
        return false;
    }

    public c(WeakReference<Activity> weakReference, com.ss.android.ugc.aweme.i18n.xbridge.a.b bVar) {
        l.d(weakReference, "");
        l.d(bVar, "");
        this.f100026f = weakReference;
        this.f100022a = bVar;
        l.a a2 = com.ss.android.ugc.aweme.cw.l.a(o.SERIAL);
        a2.f79173b = "takePhoto";
        this.f100027g = g.a(a2.a());
        l.a a3 = com.ss.android.ugc.aweme.cw.l.a(o.SERIAL);
        a3.f79173b = "compressPhoto";
        this.f100028h = g.a(a3.a());
    }

    static final class d implements b.AbstractC1579b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f100041a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f100042b;

        static {
            Covode.recordClassIndex(63755);
        }

        d(c cVar, Activity activity) {
            this.f100041a = cVar;
            this.f100042b = activity;
        }

        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
        public final void a(String[] strArr, int[] iArr) {
            boolean z;
            h.f.b.l.b(strArr, "");
            if (strArr.length != 0) {
                h.f.b.l.b(iArr, "");
                for (int i2 : iArr) {
                    if (i2 == 0) {
                    }
                }
                this.f100041a.a(this.f100042b);
                return;
            }
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if ((!z) && iArr[0] == -1) {
                this.f100041a.f100022a.a(-6, "Camera permission denied");
            } else if (strArr.length != 0 && iArr.length == 2 && iArr[1] == -1) {
                this.f100041a.f100022a.a(-6, "Storage permission denied");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.i18n.xbridge.a.a
    public final boolean a(int i2, int i3, Intent intent) {
        if (i3 == 0) {
            this.f100022a.a(-7, "User cancel");
            return true;
        }
        if (i3 == -1) {
            if (this.f100030j) {
                this.f100028h.execute(new b(this.f100026f, String.valueOf(this.f100023b), this.f100022a, this.f100031k));
            } else {
                long a2 = c.b.e.a(this.f100026f.get(), this.f100023b);
                String str = this.f100024c;
                if (str == null) {
                    str = String.valueOf(this.f100023b);
                }
                List<e.a> a3 = n.a(new e.a(str, a2, "image"));
                com.ss.android.ugc.aweme.i18n.xbridge.a.b bVar = this.f100022a;
                com.bytedance.ies.xbridge.base.runtime.a.e eVar = new com.bytedance.ies.xbridge.base.runtime.a.e();
                eVar.f35800a = a3;
                bVar.a(eVar);
            }
        }
        return true;
    }
}
