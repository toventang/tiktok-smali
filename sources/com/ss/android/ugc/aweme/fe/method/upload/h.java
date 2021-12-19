package com.ss.android.ugc.aweme.fe.method.upload;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.fe.method.a;
import com.ss.android.ugc.aweme.fe.method.m;
import com.ss.android.ugc.aweme.fe.method.upload.GetUploadConfigService;
import com.ss.android.ugc.aweme.fe.method.upload.config.UploadAuthConfig;
import com.ss.android.ugc.aweme.fe.method.upload.config.UploadConfig;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.port.in.bb;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.bduploader.BDVideoInfo;
import com.ss.bduploader.BDVideoUploader;
import com.ss.bduploader.BDVideoUploaderListener;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Objects;
import org.apache.commons.codec.binary.Base64;
import org.json.JSONArray;
import org.json.JSONObject;

public class h implements b {

    /* renamed from: h  reason: collision with root package name */
    public static final a f91417h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private GetUploadConfigService.UploadConfigService f91418a = new GetUploadConfigService().f91322a;

    /* renamed from: d  reason: collision with root package name */
    protected BDVideoUploader f91419d;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<Activity> f91420e;

    /* renamed from: f  reason: collision with root package name */
    public a.C2200a f91421f;

    /* renamed from: g  reason: collision with root package name */
    public m f91422g;

    static {
        Covode.recordClassIndex(57523);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57524);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final BDVideoUploader b() {
        BDVideoUploader bDVideoUploader = this.f91419d;
        if (bDVideoUploader == null) {
            l.a("uploader");
        }
        return bDVideoUploader;
    }

    static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(57526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            h hVar = this.this$0;
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            Activity activity = hVar.f91420e.get();
            if (activity != null) {
                activity.startActivityForResult(intent, 800);
            }
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(57527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            h hVar = this.this$0;
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("video/*");
            Activity activity = hVar.f91420e.get();
            if (activity != null) {
                activity.startActivityForResult(intent, 700);
            }
            return z.f158842a;
        }
    }

    public static final class e implements bb.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f91424a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f91425b;

        static {
            Covode.recordClassIndex(57528);
        }

        @Override // com.ss.android.ugc.aweme.port.in.bb.a
        public final void onSuccess() {
            String str;
            h hVar = this.f91424a;
            Intent intent = this.f91425b;
            if (intent != null) {
                str = a(intent, "filePath");
            } else {
                str = null;
            }
            hVar.a(str);
        }

        e(h hVar, Intent intent) {
            this.f91424a = hVar;
            this.f91425b = intent;
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.method.upload.b
    public final void a() {
        try {
            BDVideoUploader bDVideoUploader = this.f91419d;
            if (bDVideoUploader == null) {
                l.a("uploader");
            }
            bDVideoUploader.stop();
            BDVideoUploader bDVideoUploader2 = this.f91419d;
            if (bDVideoUploader2 == null) {
                l.a("uploader");
            }
            bDVideoUploader2.close();
            a(0, "uploadCancel");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public class b implements BDVideoUploaderListener {
        static {
            Covode.recordClassIndex(57525);
        }

        @Override // com.ss.bduploader.BDVideoUploaderListener
        public final String getStringFromExtern(int i2) {
            return "";
        }

        @Override // com.ss.bduploader.BDVideoUploaderListener
        public final void onLog(int i2, int i3, String str) {
        }

        @Override // com.ss.bduploader.BDVideoUploaderListener
        public final void onUploadVideoStage(int i2, long j2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }

        private static NetworkInfo a(ConnectivityManager connectivityManager) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                return com.ss.android.ugc.aweme.net.e.a.a();
            }
        }

        @Override // com.ss.bduploader.BDVideoUploaderListener
        public final int videoUploadCheckNetState(int i2, int i3) {
            if (h.this.f91420e.get() == null) {
                return 0;
            }
            Activity activity = h.this.f91420e.get();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type android.app.Activity");
            Object a2 = a(activity, "connectivity");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.net.ConnectivityManager");
            if (a((ConnectivityManager) a2) != null) {
                return 1;
            }
            return 0;
        }

        private static Object a(Activity activity, String str) {
            Object obj;
            MethodCollector.i(12538);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                        obj = activity.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = activity.getSystemService(str);
            } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = activity.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                            } catch (Exception e2) {
                                com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                    } finally {
                        MethodCollector.o(12538);
                    }
                }
            } else {
                obj = activity.getSystemService(str);
            }
            return obj;
        }

        @Override // com.ss.bduploader.BDVideoUploaderListener
        public final void onNotify(int i2, long j2, BDVideoInfo bDVideoInfo) {
            if (i2 == 0) {
                try {
                    h hVar = h.this;
                    if (bDVideoInfo == null) {
                        l.b();
                    }
                    String str = bDVideoInfo.mVideoId;
                    l.b(str, "");
                    hVar.a(str, 3);
                    h.this.b().close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else if (i2 == 2) {
                h.this.a(0, "uploadFailed");
                try {
                    h.this.b().close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(BDVideoUploader bDVideoUploader) {
        l.d(bDVideoUploader, "");
        this.f91419d = bDVideoUploader;
    }

    /* access modifiers changed from: package-private */
    public static final class f<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f91426a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f91427b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f91428c;

        static {
            Covode.recordClassIndex(57529);
        }

        f(h hVar, int i2, String str) {
            this.f91426a = hVar;
            this.f91427b = i2;
            this.f91428c = str;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            MethodCollector.i(10285);
            if (iVar != null && !iVar.c() && ((com.ss.android.ugc.aweme.fe.method.upload.response.a) iVar.d()).f91443a == 0) {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                com.ss.android.ugc.aweme.fe.method.upload.response.b bVar = ((com.ss.android.ugc.aweme.fe.method.upload.response.a) iVar.d()).f91445c;
                if (bVar != null) {
                    String str = bVar.f91446a;
                    Charset charset = h.m.d.f158808a;
                    if (str != null) {
                        byte[] bytes = str.getBytes(charset);
                        l.b(bytes, "");
                        byte[] decodeBase64 = Base64.decodeBase64(bytes);
                        l.b(decodeBase64, "");
                        jSONObject.put("mainUrl", new String(decodeBase64, h.m.d.f158808a));
                        jSONObject.put("posterUrl", bVar.f91448c);
                        String str2 = bVar.f91447b;
                        Charset charset2 = h.m.d.f158808a;
                        if (str2 != null) {
                            byte[] bytes2 = str2.getBytes(charset2);
                            l.b(bytes2, "");
                            byte[] decodeBase642 = Base64.decodeBase64(bytes2);
                            l.b(decodeBase642, "");
                            jSONObject.put("backupUrl", new String(decodeBase642, h.m.d.f158808a));
                            jSONObject.put("mediaType", bVar.f91449d);
                            jSONArray.put(jSONObject);
                            this.f91426a.f91422g.a(jSONArray);
                        } else {
                            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            MethodCollector.o(10285);
                            throw nullPointerException;
                        }
                    } else {
                        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        MethodCollector.o(10285);
                        throw nullPointerException2;
                    }
                }
            } else if (this.f91427b > 0) {
                Thread.sleep(1000);
                this.f91426a.a(this.f91428c, this.f91427b - 1);
            } else if (iVar == null || iVar.c()) {
                this.f91426a.a(0, "uploadFailed");
            } else if (((com.ss.android.ugc.aweme.fe.method.upload.response.a) iVar.d()).f91443a != 0) {
                this.f91426a.a(((com.ss.android.ugc.aweme.fe.method.upload.response.a) iVar.d()).f91443a, ((com.ss.android.ugc.aweme.fe.method.upload.response.a) iVar.d()).f91444b);
            }
            MethodCollector.o(10285);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        if (str != null) {
            this.f91419d = new BDVideoUploader();
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            l.b(createIAVServiceProxybyMonsterPlugin, "");
            createIAVServiceProxybyMonsterPlugin.getShortVideoPluginService();
            this.f91418a.getUploadAuthConfig().a(new i(this, str), b.i.f4826c, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f91435a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f91436b;

        static {
            Covode.recordClassIndex(57532);
        }

        i(h hVar, String str) {
            this.f91435a = hVar;
            this.f91436b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(b.i<UploadAuthConfig> iVar) {
            String str;
            String str2;
            String str3;
            if (iVar != null) {
                if (!iVar.c() && iVar.d().getCode() == 0) {
                    UploadConfig uploadConfig = iVar.d().getUploadConfig();
                    if (uploadConfig != null) {
                        long a2 = c.b.e.a(this.f91435a.f91420e.get(), Uri.parse(this.f91436b));
                        if (a2 > ((long) uploadConfig.getMaxFileSize())) {
                            new com.ss.android.ugc.aweme.tux.a.i.a(this.f91435a.f91420e.get()).a(R.string.h_q).a();
                            this.f91435a.a(0, "uploadFailed");
                        } else {
                            BDVideoUploader b2 = this.f91435a.b();
                            try {
                                Uri parse = Uri.parse(this.f91436b);
                                l.b(parse, "");
                                b2.setMediaDataReader(new i(this.f91435a.f91420e.get(), parse, a2));
                                UploadConfig.STSAuthConfig authorizationV2 = uploadConfig.getAuthorizationV2();
                                if (authorizationV2 != null) {
                                    str = authorizationV2.getAccessKeyId();
                                } else {
                                    str = null;
                                }
                                b2.setTopAccessKey(str);
                                UploadConfig.STSAuthConfig authorizationV22 = uploadConfig.getAuthorizationV2();
                                if (authorizationV22 != null) {
                                    str2 = authorizationV22.getSecretAccessKey();
                                } else {
                                    str2 = null;
                                }
                                b2.setTopSecretKey(str2);
                                UploadConfig.STSAuthConfig authorizationV23 = uploadConfig.getAuthorizationV2();
                                if (authorizationV23 != null) {
                                    str3 = authorizationV23.getSessionToken();
                                } else {
                                    str3 = null;
                                }
                                b2.setTopSessionToken(str3);
                                b2.setFileRetryCount(uploadConfig.getFileRetryCount());
                                b2.setEnableHttps(uploadConfig.getEnableHttps());
                                b2.setRWTimeout(uploadConfig.getSliceTimeout());
                                b2.setSliceReTryCount(uploadConfig.getSliceRetryCount());
                                b2.setSliceSize(uploadConfig.getSliceSize());
                                b2.setSocketNum(uploadConfig.getSocketNumber());
                                b2.setMaxFailTime(uploadConfig.getMaxFailTime());
                                b2.setUploadDomain(uploadConfig.getVideoHostName());
                                b2.setListener(new b());
                                b2.start();
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            this.f91435a.f91421f.a(this.f91435a.f91420e.get(), this.f91435a);
                        }
                    }
                    return null;
                } else if (!iVar.c()) {
                    if (iVar.d().getCode() != 0) {
                        this.f91435a.a(iVar.d().getCode(), iVar.d().getMessage());
                    }
                    this.f91435a.b().close();
                    return null;
                }
            }
            this.f91435a.a(0, "uploadFailed");
            try {
                this.f91435a.b().close();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, String str) {
        l.d(str, "");
        this.f91422g.a(i2, str);
    }

    public void a(String str, int i2) {
        l.d(str, "");
        this.f91418a.getUploadPlayUrlResponse(str).a(new f(this, i2, str), b.i.f4824a, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.h$h  reason: collision with other inner class name */
    public static final class C2206h implements b.AbstractC1579b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f91432a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f91433b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f91434c;

        static {
            Covode.recordClassIndex(57531);
        }

        C2206h(Activity activity, h hVar, h.f.a.a aVar) {
            this.f91432a = activity;
            this.f91433b = hVar;
            this.f91434c = aVar;
        }

        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
        public final void a(String[] strArr, int[] iArr) {
            if (iArr[0] == 0) {
                this.f91434c.invoke();
                return;
            }
            if (iArr[0] != 0) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f91432a).a(this.f91432a.getString(R.string.doy)).a();
            }
            this.f91433b.f91422g.a(-1, "uploadFailed");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements b.AbstractC1579b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f91429a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f91430b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f91431c;

        static {
            Covode.recordClassIndex(57530);
        }

        g(Activity activity, h hVar, h.f.a.a aVar) {
            this.f91429a = activity;
            this.f91430b = hVar;
            this.f91431c = aVar;
        }

        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
        public final void a(String[] strArr, int[] iArr) {
            if (iArr[0] == 0 && iArr[1] == 0) {
                this.f91431c.invoke();
                return;
            }
            if (iArr[0] != 0) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f91429a).a(this.f91429a.getString(R.string.doy)).a();
            }
            if (iArr[1] != 0) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f91429a).a(this.f91429a.getString(R.string.dow)).a();
            }
            this.f91430b.f91422g.a(-1, "uploadFailed");
        }
    }

    private void a(boolean z, h.f.a.a<z> aVar) {
        l.d(aVar, "");
        if (z) {
            Activity activity = this.f91420e.get();
            if (activity == null) {
                return;
            }
            if (com.ss.android.ugc.aweme.utils.permission.e.a(activity) == 0 && com.ss.android.ugc.aweme.utils.permission.e.c(activity) == 0) {
                aVar.invoke();
            } else {
                com.ss.android.ugc.aweme.ce.b.a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"}, new g(activity, this, aVar));
            }
        } else {
            Activity activity2 = this.f91420e.get();
            if (activity2 == null) {
                return;
            }
            if (com.ss.android.ugc.aweme.utils.permission.e.c(activity2) == 0) {
                aVar.invoke();
            } else {
                com.ss.android.ugc.aweme.ce.b.a(activity2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C2206h(activity2, this, aVar));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.method.upload.b
    public final void a(JSONObject jSONObject, boolean z) {
        l.d(jSONObject, "");
        int optInt = jSONObject.optInt(StringSet.type);
        if (optInt == 700) {
            a(z, new d(this));
        } else if (optInt == 800) {
            a(z, new c(this));
        }
    }

    public h(WeakReference<Activity> weakReference, a.C2200a aVar, m mVar) {
        l.d(weakReference, "");
        l.d(aVar, "");
        l.d(mVar, "");
        this.f91420e = weakReference;
        this.f91421f = aVar;
        this.f91422g = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r10 != 900) goto L_0x0019;
     */
    @Override // com.ss.android.ugc.aweme.fe.method.upload.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r10, int r11, android.content.Intent r12) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.upload.h.a(int, int, android.content.Intent):boolean");
    }
}
