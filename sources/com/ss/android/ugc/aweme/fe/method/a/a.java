package com.ss.android.ugc.aweme.fe.method.a;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import b.i;
import b.j;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.fe.method.a;
import com.ss.android.ugc.aweme.fe.method.m;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.TcmImage;
import com.ss.android.ugc.aweme.utils.cs;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements WeakHandler.IHandler, com.ss.android.ugc.aweme.fe.method.upload.b {

    /* renamed from: a  reason: collision with root package name */
    public String f91215a = "";

    /* renamed from: b  reason: collision with root package name */
    public m f91216b;

    /* renamed from: c  reason: collision with root package name */
    private String f91217c = "";

    /* renamed from: d  reason: collision with root package name */
    private c f91218d;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<Activity> f91219e;

    /* renamed from: f  reason: collision with root package name */
    private a.C2200a f91220f;

    /* renamed from: g  reason: collision with root package name */
    private Executor f91221g;

    /* renamed from: h  reason: collision with root package name */
    private Executor f91222h;

    /* renamed from: i  reason: collision with root package name */
    private String f91223i;

    /* renamed from: j  reason: collision with root package name */
    private String f91224j;

    static {
        Covode.recordClassIndex(57411);
    }

    @Override // com.ss.android.ugc.aweme.fe.method.upload.b
    public final void a() {
    }

    /* access modifiers changed from: package-private */
    public static class c extends AsyncTask<Void, Void, File> {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<Activity> f91230a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<a> f91231b;

        static {
            Covode.recordClassIndex(57414);
        }

        /* access modifiers changed from: protected */
        public final void onCancelled() {
            a aVar = this.f91231b.get();
            if (aVar != null) {
                aVar.f91216b.a(0, "uploadCancel");
            }
        }

        private File a() {
            Activity activity = this.f91230a.get();
            if (activity == null) {
                return null;
            }
            try {
                String concat = "Dou_fsm_".concat(String.valueOf(new SimpleDateFormat("yyyy-MMdd_HHmmss").format(new Date())));
                if (d.f107195c == null || !d.f107197e) {
                    d.f107195c = activity.getFilesDir();
                }
                return File.createTempFile(concat, ".jpg", d.f107195c);
            } catch (IOException unused) {
                return null;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ File doInBackground(Void[] voidArr) {
            return a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(File file) {
            File file2 = file;
            a aVar = this.f91231b.get();
            Activity activity = this.f91230a.get();
            if (aVar != null && activity != null) {
                if (file2 == null) {
                    aVar.f91216b.a(0, "uploadFailed");
                    return;
                }
                aVar.f91215a = file2.getAbsolutePath();
                Uri a2 = com.ss.android.newmedia.d.a(activity, file2);
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("output", a2);
                intent.addFlags(3);
                activity.startActivityForResult(intent, 1);
            }
        }

        c(Activity activity, a aVar) {
            this.f91230a = new WeakReference<>(activity);
            this.f91231b = new WeakReference<>(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.a.a$a  reason: collision with other inner class name */
    static class RunnableC2201a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<b> f91225a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<m> f91226b;

        static {
            Covode.recordClassIndex(57412);
        }

        public final void run() {
            b bVar = this.f91225a.get();
            m mVar = this.f91226b.get();
            if (bVar != null && mVar != null) {
                try {
                    mVar.a(a(bVar));
                } catch (JSONException unused) {
                    mVar.a(0, "uploadFailed");
                }
            }
        }

        private static i<String> a(String str) {
            j jVar = new j();
            try {
                AVExternalServiceImpl.a().abilityService().processService().compressPhoto(str, 216, 384, new c(jVar));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return jVar.f4869a;
        }

        private static JSONArray a(b bVar) {
            i<String> a2 = a(bVar.f91229c);
            try {
                a2.f();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            String d2 = a2.d();
            if (d2 != null) {
                try {
                    d2 = cs.b(d2);
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(bVar.f91227a)) {
                jSONObject.put("url", bVar.f91227a);
            }
            if (!TextUtils.isEmpty(bVar.f91228b)) {
                jSONObject.put("uri", bVar.f91228b);
            }
            jSONObject.put("base64", d2);
            jSONArray.put(jSONObject);
            return jSONArray;
        }

        RunnableC2201a(b bVar, m mVar) {
            this.f91225a = new WeakReference<>(bVar);
            this.f91226b = new WeakReference<>(mVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Activity activity) {
        c cVar = this.f91218d;
        if (cVar != null) {
            cVar.cancel(false);
        }
        c cVar2 = new c(activity, this);
        this.f91218d = cVar2;
        cVar2.executeOnExecutor(this.f91221g, new Void[0]);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Activity activity = this.f91219e.get();
        if (activity == null) {
            this.f91216b.a(0, "uploadFailed");
        } else if (message.obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            new com.ss.android.ugc.aweme.tux.a.i.a(activity).a(((com.ss.android.ugc.aweme.base.api.a.b.a) message.obj).getErrorMsg()).a();
            this.f91216b.a(0, "uploadFailed");
        } else if (message.obj instanceof AvatarUri) {
            AvatarUri avatarUri = (AvatarUri) message.obj;
            if (avatarUri == null || avatarUri.urlList == null || avatarUri.urlList.isEmpty()) {
                this.f91216b.a(0, "uploadFailed");
            } else {
                this.f91222h.execute(new RunnableC2201a(new b(avatarUri.urlList.get(0), avatarUri.uri, this.f91215a), this.f91216b));
            }
        } else if (message.obj instanceof TcmImage) {
            TcmImage tcmImage = (TcmImage) message.obj;
            if (!TextUtils.isEmpty(tcmImage.getMid())) {
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("mid", tcmImage.getMid());
                    jSONArray.put(jSONObject);
                    this.f91216b.a(jSONArray);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            } else {
                this.f91216b.a(0, "uploadFailed");
            }
        } else {
            this.f91216b.a(0, "uploadFailed");
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.method.upload.b
    public final void a(JSONObject jSONObject, boolean z) {
        Activity activity = this.f91219e.get();
        if (activity == null) {
            this.f91216b.a(0, "uploadFailed");
            return;
        }
        PackageManager packageManager = activity.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        if (!packageManager.hasSystemFeature("android.hardware.camera.any")) {
            this.f91216b.a(0, "uploadFailed");
        } else if (new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(activity.getPackageManager()) == null) {
            this.f91216b.a(0, "uploadFailed");
        } else {
            this.f91217c = jSONObject.optString("source");
            this.f91223i = jSONObject.optString("encryptURL", "");
            this.f91224j = jSONObject.optString("nameSpace", "");
            if (androidx.core.content.b.a(activity, "android.permission.CAMERA") == 0) {
                a(activity);
            } else {
                com.ss.android.ugc.aweme.ce.b.a(activity, new String[]{"android.permission.CAMERA"}, new b(this, activity));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f91227a;

        /* renamed from: b  reason: collision with root package name */
        public String f91228b;

        /* renamed from: c  reason: collision with root package name */
        public String f91229c;

        static {
            Covode.recordClassIndex(57413);
        }

        b(String str, String str2, String str3) {
            this.f91227a = str;
            this.f91228b = str2;
            this.f91229c = str3;
        }
    }

    public a(WeakReference<Activity> weakReference, a.C2200a aVar, m mVar) {
        l.a a2 = l.a(o.SERIAL);
        a2.f79173b = "takephoto";
        this.f91221g = g.a(a2.a());
        l.a a3 = l.a(o.SERIAL);
        a3.f79173b = "uploadphoto";
        this.f91222h = g.a(a3.a());
        this.f91223i = "";
        this.f91224j = "";
        this.f91220f = aVar;
        this.f91216b = mVar;
        this.f91219e = weakReference;
    }

    @Override // com.ss.android.ugc.aweme.fe.method.upload.b
    public final boolean a(int i2, int i3, Intent intent) {
        if (i3 == 0) {
            this.f91216b.a(0, "uploadCancel");
            return true;
        }
        if (i3 == -1) {
            String str = Api.f66570e + "?uid=" + com.ss.android.ugc.aweme.account.b.g().getCurUserId();
            if (!TextUtils.isEmpty(this.f91217c)) {
                str = str + "&source=" + this.f91217c;
            }
            if (!TextUtils.isEmpty(this.f91223i)) {
                str = new com.ss.android.common.util.g(Api.f66569d + "/" + this.f91223i).a();
            }
            this.f91220f.a();
            Activity activity = this.f91219e.get();
            File file = new File(this.f91215a);
            Intent intent2 = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent2.setData(Uri.fromFile(file));
            activity.sendBroadcast(intent2);
            MediaScannerConnection.scanFile(activity, new String[]{file.toString()}, null, null);
            this.f91220f.a(this.f91219e.get());
            if (!TextUtils.isEmpty(this.f91223i)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new com.ss.android.http.a.b.d("NS", this.f91224j));
                com.ss.android.ugc.aweme.account.b.g().uploadAvatar(new WeakHandler(this), str, 8388608, this.f91215a, arrayList, "image_info");
            } else {
                com.ss.android.ugc.aweme.account.b.g().uploadAvatar(new WeakHandler(this), str, 8388608, this.f91215a, null);
            }
        } else {
            this.f91216b.a(0, "uploadFailed");
        }
        return true;
    }
}
