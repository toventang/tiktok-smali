package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Base64;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.f.b.l;
import h.f.b.z;
import h.m.p;
import h.q;
import h.r;
import h.z;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class DownloadFileMethod extends BaseCommonJavaMethod implements IDownloadListener, au {

    /* renamed from: e  reason: collision with root package name */
    public static final a f91035e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    String f91036a;

    /* renamed from: b  reason: collision with root package name */
    String f91037b;

    /* renamed from: c  reason: collision with root package name */
    Integer f91038c;

    /* renamed from: d  reason: collision with root package name */
    public String f91039d;

    static {
        Covode.recordClassIndex(57267);
    }

    private DownloadFileMethod(byte b2) {
        this();
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstStart(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstSuccess(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPrepare(DownloadInfo downloadInfo) {
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57268);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ DownloadFileMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    /* access modifiers changed from: package-private */
    public static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DownloadFileMethod f91051a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f91052b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ JSONObject f91053c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f91054d = 3;

        static {
            Covode.recordClassIndex(57272);
        }

        e(DownloadFileMethod downloadFileMethod, String str, JSONObject jSONObject) {
            this.f91051a = downloadFileMethod;
            this.f91052b = str;
            this.f91053c = jSONObject;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            DownloadFileMethod.super.sendEvent(this.f91052b, this.f91053c, this.f91054d);
            return z.f158842a;
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        Integer num = this.f91038c;
        if (num != null) {
            Downloader.getInstance((Context) this.mContextRef.get()).cancel(num.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f91040a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f91041b;

        static {
            Covode.recordClassIndex(57269);
        }

        b(z.e eVar, File file) {
            this.f91040a = eVar;
            this.f91041b = file;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public h.z call() {
            h.z zVar;
            MethodCollector.i(2771);
            try {
                ParcelFileDescriptor openFileDescriptor = com.bytedance.ies.ugc.appcontext.d.a().getContentResolver().openFileDescriptor(this.f91040a.element, "w");
                if (openFileDescriptor != null) {
                    c.b.d.a(this.f91041b, new FileOutputStream(openFileDescriptor.getFileDescriptor()));
                    zVar = h.z.f158842a;
                } else {
                    zVar = null;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                zVar = h.z.f158842a;
            }
            MethodCollector.o(2771);
            return zVar;
        }
    }

    static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DownloadFileMethod f91046a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f91047b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Uri f91048c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f91049d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f91050e;

        static {
            Covode.recordClassIndex(57271);
        }

        d(DownloadFileMethod downloadFileMethod, z.e eVar, Uri uri, List list, String str) {
            this.f91046a = downloadFileMethod;
            this.f91047b = eVar;
            this.f91048c = uri;
            this.f91049d = list;
            this.f91050e = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ParcelFileDescriptor parcelFileDescriptor;
            ContentResolver contentResolver;
            MethodCollector.i(2728);
            FileOutputStream fileOutputStream = null;
            if (this.f91047b.element != null) {
                fileOutputStream = new FileOutputStream((File) this.f91047b.element);
            } else if (this.f91048c != null) {
                Context context = (Context) this.f91046a.mContextRef.get();
                if (context == null || (contentResolver = context.getContentResolver()) == null) {
                    parcelFileDescriptor = null;
                } else {
                    parcelFileDescriptor = contentResolver.openFileDescriptor(this.f91048c, "w");
                }
                if (parcelFileDescriptor != null) {
                    fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                }
            }
            boolean z = false;
            try {
                byte[] decode = Base64.decode((String) this.f91049d.get(1), 0);
                if (fileOutputStream != null) {
                    fileOutputStream.write(decode);
                }
                com.bytedance.common.utility.d.b.a(fileOutputStream);
                z = true;
            } catch (Exception e2) {
                e2.printStackTrace();
                com.bytedance.common.utility.d.b.a(fileOutputStream);
            } catch (Throwable th) {
                com.bytedance.common.utility.d.b.a(fileOutputStream);
                MethodCollector.o(2728);
                throw th;
            }
            if (z) {
                DownloadFileMethod downloadFileMethod = this.f91046a;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(StringSet.type, "success");
                String str = this.f91050e;
                if (str != null) {
                    jSONObject2.put("path", str);
                }
                jSONObject.put("data", jSONObject2);
                jSONObject.put("id", this.f91046a.f91039d);
                jSONObject.put("eventName", "download_status_change");
                downloadFileMethod.a("notification", jSONObject);
                String str2 = this.f91050e;
                if (str2 != null) {
                    this.f91046a.a(str2);
                }
            }
            h.z zVar = h.z.f158842a;
            MethodCollector.o(2728);
            return zVar;
        }
    }

    public DownloadFileMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    public final void a(String str) {
        Context context = (Context) this.mContextRef.get();
        if (context != null) {
            l.b(context, "");
            File file = new File(str);
            z.e eVar = new z.e();
            eVar.element = (T) c.b.e.c(context, file.getName(), null);
            if (eVar.element == null) {
                eVar.element = (T) c.b.e.a(context, file.getName(), "image/jpeg");
            }
            b.i.b(new b(eVar, file), b.i.f4824a);
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        Context context;
        if (!(weakReference == null || (context = weakReference.get()) == null || !(context instanceof m))) {
            ((m) context).getLifecycle().a(this);
        }
        BaseCommonJavaMethod attach = super.attach(weakReference);
        l.b(attach, "");
        return attach;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(StringSet.type, "cancel");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("id", this.f91039d);
        jSONObject.put("eventName", "download_status_change");
        a("notification", jSONObject);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPause(DownloadInfo downloadInfo) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(StringSet.type, "pause");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("id", this.f91039d);
        jSONObject.put("eventName", "download_status_change");
        a("notification", jSONObject);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("progress", downloadInfo);
        jSONObject2.put(StringSet.type, "progress");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("id", this.f91039d);
        jSONObject.put("eventName", "download_status_change");
        a("notification", jSONObject);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(StringSet.type, "start");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("id", this.f91039d);
        jSONObject.put("eventName", "download_status_change");
        a("notification", jSONObject);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        if (downloadInfo != null && downloadInfo.getSavePath() != null && downloadInfo.getName() != null) {
            String str = null;
            String savePath = downloadInfo.getSavePath();
            l.b(savePath, "");
            if (p.b(savePath, "content://", false)) {
                try {
                    str = c.d.a.a((Context) this.mContextRef.get(), Uri.parse(downloadInfo.getSavePath()));
                    q.m223constructorimpl(h.z.f158842a);
                } catch (Throwable th) {
                    q.m223constructorimpl(r.a(th));
                }
            } else {
                str = new File(downloadInfo.getSavePath(), downloadInfo.getName()).getPath();
                if (TextUtils.equals(this.f91037b, "image") && str != null) {
                    a(str);
                }
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.type, "success");
            if (str != null) {
                jSONObject2.put("path", str);
            }
            jSONObject.put("data", jSONObject2);
            jSONObject.put("id", this.f91039d);
            jSONObject.put("eventName", "download_status_change");
            a("notification", jSONObject);
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        b.i.b(new e(this, str, jSONObject), b.i.f4826c);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        Context actContext = getActContext();
        if (!(actContext instanceof Activity)) {
            actContext = null;
        }
        Activity activity = (Activity) actContext;
        if (activity != null) {
            com.ss.android.ugc.aweme.ce.b.a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new c(this, jSONObject, aVar, activity));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(StringSet.type, "error");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("id", this.f91039d);
        jSONObject.put("eventName", "download_status_change");
        a("notification", jSONObject);
        if (TextUtils.equals(this.f91037b, "image")) {
            this.mContextRef.get();
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(StringSet.type, "restart");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("id", this.f91039d);
        jSONObject.put("eventName", "download_status_change");
        a("notification", jSONObject);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(StringSet.type, "restart");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("id", this.f91039d);
        jSONObject.put("eventName", "download_status_change");
        a("notification", jSONObject);
    }

    static final class c implements b.AbstractC1579b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DownloadFileMethod f91042a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f91043b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f91044c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Activity f91045d;

        static {
            Covode.recordClassIndex(57270);
        }

        c(DownloadFileMethod downloadFileMethod, JSONObject jSONObject, BaseCommonJavaMethod.a aVar, Activity activity) {
            this.f91042a = downloadFileMethod;
            this.f91043b = jSONObject;
            this.f91044c = aVar;
            this.f91045d = activity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:47:0x00f0  */
        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.String[] r20, int[] r21) {
            /*
            // Method dump skipped, instructions count: 573
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.DownloadFileMethod.c.a(java.lang.String[], int[]):void");
        }
    }
}
