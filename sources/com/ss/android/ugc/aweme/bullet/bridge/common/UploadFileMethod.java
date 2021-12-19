package com.ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.appcompat.widget.ai;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import b.j;
import c.b.d;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.h;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.a.b;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.fe.method.e;
import com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity;
import com.ss.android.ugc.aweme.fe.method.upload.c;
import com.ss.android.ugc.aweme.fe.method.upload.f;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.ae;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.utils.cs;
import com.zhiliaoapp.musically.R;
import h.f.a.a;
import h.z;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UploadFileMethod extends BaseBridgeMethod implements au, b, c {

    /* renamed from: b  reason: collision with root package name */
    protected WeakReference<Context> f69047b;

    /* renamed from: c  reason: collision with root package name */
    public int f69048c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f69049d;

    /* renamed from: e  reason: collision with root package name */
    public BaseBridgeMethod.a f69050e;

    /* renamed from: f  reason: collision with root package name */
    public SparseArray<AvatarUri> f69051f;

    /* renamed from: g  reason: collision with root package name */
    public List<String> f69052g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public AtomicInteger f69053h;

    /* renamed from: i  reason: collision with root package name */
    public AtomicInteger f69054i;

    /* renamed from: j  reason: collision with root package name */
    public a<z> f69055j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f69056k;

    /* renamed from: l  reason: collision with root package name */
    public int f69057l;

    /* renamed from: m  reason: collision with root package name */
    public String f69058m;
    public long n = Long.MAX_VALUE;
    public boolean o = false;
    private String p = "";
    private String q;
    private boolean r;
    private boolean s;
    private List<String> t = new ArrayList();
    private List<WeakHandler.IHandler> u;
    private boolean v = false;
    private float w = 1.0f;
    private int x = 0;
    private int y = 0;
    private com.bytedance.ies.bullet.c.e.a.b z;

    static {
        Covode.recordClassIndex(42582);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return "uploadFile";
    }

    @Override // com.ss.android.ugc.aweme.fe.method.upload.c
    public final void l() {
        this.f69055j = null;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.method.upload.c
    public final void k() {
        this.f69050e.a(0, "H5_uploadFileCancel");
        this.f69056k = true;
    }

    private b.i<String> m() {
        j jVar = new j();
        try {
            if (this.r || d.a(com.bytedance.ies.ugc.appcontext.d.a(), Uri.parse(this.q)) == null) {
                jVar.a((Object) null);
            } else {
                AVExternalServiceImpl.a().abilityService().processService().compressPhoto(this.q, 216, 384, new b(jVar));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            jVar.a((Object) null);
        } catch (Throwable th) {
            this.r = false;
            this.q = "";
            throw th;
        }
        this.r = false;
        this.q = "";
        return jVar.f4869a;
    }

    private void a(int i2) {
        this.u = new ArrayList();
        for (final int i3 = 0; i3 < i2; i3++) {
            this.u.add(new WeakHandler.IHandler() {
                /* class com.ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(42585);
                }

                @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
                public final void handleMsg(Message message) {
                    if (UploadFileMethod.this.f69051f != null && UploadFileMethod.this.f69054i != null && UploadFileMethod.this.f69053h != null && UploadFileMethod.this.f69052g != null && UploadFileMethod.this.f69050e != null && UploadFileMethod.this.f69047b != null && !UploadFileMethod.this.f69056k) {
                        if (message.obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                            Activity a2 = com.bytedance.tux.h.c.a(UploadFileMethod.this.f69047b.get());
                            if (a2 != null) {
                                new com.bytedance.tux.g.b(a2).a(((com.ss.android.ugc.aweme.base.api.a.b.a) message.obj).getErrorMsg()).b();
                            }
                            UploadFileMethod.this.f69051f.put(i3, new AvatarUri());
                            UploadFileMethod.this.f69054i.incrementAndGet();
                        } else if (message.obj instanceof AvatarUri) {
                            AvatarUri avatarUri = (AvatarUri) message.obj;
                            if (com.ss.android.ugc.aweme.base.utils.d.b(avatarUri.urlList)) {
                                UploadFileMethod.this.f69051f.put(i3, avatarUri);
                                UploadFileMethod.this.f69053h.incrementAndGet();
                            } else {
                                UploadFileMethod.this.f69051f.put(i3, new AvatarUri());
                                UploadFileMethod.this.f69054i.incrementAndGet();
                            }
                        } else {
                            UploadFileMethod.this.f69051f.put(i3, new AvatarUri());
                            UploadFileMethod.this.f69054i.incrementAndGet();
                        }
                        if (UploadFileMethod.this.f69054i.get() + UploadFileMethod.this.f69053h.get() == UploadFileMethod.this.f69052g.size()) {
                            if (UploadFileMethod.this.f69054i.get() == UploadFileMethod.this.f69052g.size()) {
                                UploadFileMethod uploadFileMethod = UploadFileMethod.this;
                                uploadFileMethod.a(uploadFileMethod.f69051f);
                                UploadFileMethod.this.f69050e.a(0, "H5_uploadFileFailed");
                            } else {
                                UploadFileMethod uploadFileMethod2 = UploadFileMethod.this;
                                UploadFileMethod.this.f69050e.a(uploadFileMethod2.a(uploadFileMethod2.f69051f), 1, "H5_uploadFile");
                            }
                            if (UploadFileMethod.this.f69055j != null) {
                                UploadFileMethod.this.f69055j.invoke();
                            }
                            com.ss.android.ugc.aweme.feedback.d.a(UploadFileMethod.this.f69057l);
                        }
                    }
                }
            });
        }
    }

    public UploadFileMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        this.z = bVar;
        if (e() != null) {
            this.f69047b = new WeakReference<>(e());
        }
    }

    public final JSONArray a(SparseArray<AvatarUri> sparseArray) {
        String str;
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            JSONObject jSONObject = new JSONObject();
            String str2 = "";
            if (sparseArray.get(i2) == null || !com.ss.android.ugc.aweme.base.utils.d.b(sparseArray.get(i2).urlList)) {
                str = str2;
            } else {
                str = sparseArray.get(i2).uri;
                str2 = sparseArray.get(i2).urlList.get(0);
            }
            try {
                jSONObject.put("url", str2);
                jSONObject.put("uri", str);
                if (i2 < this.t.size()) {
                    jSONObject.put("img_base64", this.t.get(i2));
                }
                jSONArray.put(jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONArray;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        Context context = this.f69047b.get();
        if (context != null) {
            Activity a2 = com.bytedance.tux.h.c.a(context);
            if ((message.obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && a2 != null) {
                new com.bytedance.tux.g.b(a2).a(((com.ss.android.ugc.aweme.base.api.a.b.a) message.obj).getErrorMsg()).b();
                a(0, "", "");
            } else if (message.obj instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) message.obj;
                if (avatarUri.urlList == null || avatarUri.urlList.isEmpty()) {
                    a(0, "", "");
                    try {
                        this.f69050e.a(0, "H5_uploadFileFailed");
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    try {
                        this.f69050e.a(a(1, avatarUri.urlList.get(0), avatarUri.uri), 1, "H5_uploadFile");
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            } else {
                a(0, "", "");
                try {
                    this.f69050e.a(0, "H5_uploadFileFailed");
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.method.upload.c
    public final void a(List<f> list, a<z> aVar) {
        if (!com.ss.android.ugc.aweme.base.utils.d.a(list)) {
            this.f69055j = aVar;
            this.f69053h = new AtomicInteger(0);
            this.f69054i = new AtomicInteger(0);
            this.f69052g.clear();
            this.t.clear();
            for (int i2 = 0; i2 < list.size(); i2++) {
                this.f69052g.add(list.get(i2).f91415a);
                this.t.add(list.get(i2).f91416b);
            }
            this.f69051f = new SparseArray<>();
            a(this.f69052g.size());
            for (int i3 = 0; i3 < this.f69052g.size(); i3++) {
                String str = this.f69052g.get(i3);
                if (com.bytedance.common.utility.m.a(str)) {
                    this.f69051f.put(i3, new AvatarUri());
                    this.f69054i.incrementAndGet();
                } else {
                    try {
                        if (d.a(com.bytedance.ies.ugc.appcontext.d.a(), Uri.parse(str)) == null) {
                            this.f69051f.put(i3, new AvatarUri());
                            this.f69054i.incrementAndGet();
                        }
                    } catch (FileNotFoundException e2) {
                        e2.printStackTrace();
                    }
                    String str2 = Api.f66570e + "?uid=" + com.ss.android.ugc.aweme.account.b.g().getCurUserId();
                    if (!TextUtils.isEmpty(this.p)) {
                        str2 = str2 + "&source=" + this.p;
                    }
                    String a2 = c.d.a.a(e(), Uri.parse(str));
                    if (a2 != null && !a2.isEmpty()) {
                        com.ss.android.ugc.aweme.account.b.a();
                        com.ss.android.ugc.aweme.account.b.f62864a.e().uploadAvatar(new WeakHandler(this.u.get(i3)), str2, 4194304, com.ss.android.ugc.aweme.feedback.d.a(a2, new File(a2), this.f69057l), null);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        Context context;
        if (h() == com.bytedance.ies.bullet.service.f.a.b.b.WEB) {
            h a2 = a(jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject("res");
            com.bytedance.ies.web.a.a aVar2 = (com.bytedance.ies.web.a.a) this.z.c(com.bytedance.ies.web.a.a.class);
            if (this.f69047b != null && aVar2 != null) {
                try {
                    new e(this.f69047b, aVar2).call(a2, optJSONObject);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } else {
            this.f69050e = aVar;
            String optString = jSONObject.optString(StringSet.type);
            this.p = jSONObject.optString("source");
            this.r = jSONObject.optBoolean("skip_img_base64", false);
            this.f69048c = jSONObject.optInt("maxSelectNum", 1);
            this.s = jSONObject.optBoolean("isMultiSelect", false);
            this.f69049d = jSONObject.optBoolean("shouldWithCamera", false);
            this.f69057l = jSONObject.optInt("image_width", -1);
            this.f69058m = jSONObject.optString("from", "");
            long optLong = jSONObject.optLong("maxFileSize", Long.MAX_VALUE);
            this.n = optLong;
            if (optLong == 0) {
                this.n = Long.MAX_VALUE;
            }
            this.o = jSONObject.optBoolean("needBase64Response", false);
            this.v = jSONObject.optBoolean("isNeedCut", false);
            this.x = jSONObject.optInt("minImageWidth");
            this.y = jSONObject.optInt("minImageHeight");
            int optInt = jSONObject.optInt("cropRatioWidth", 0);
            int optInt2 = jSONObject.optInt("cropRatioHeight", 0);
            if (optInt * optInt2 != 0) {
                this.w = (((float) optInt2) * 1.0f) / ((float) optInt);
            }
            if ("image".equals(optString)) {
                WeakReference<Context> weakReference = this.f69047b;
                if (weakReference != null) {
                    context = weakReference.get();
                } else {
                    context = null;
                }
                if (context instanceof com.ss.android.ugc.aweme.base.a.f) {
                    ((com.ss.android.ugc.aweme.base.a.f) context).setActivityResultListener(this);
                } else if (context instanceof ai) {
                    context = ((ai) context).getBaseContext();
                    if (context instanceof com.ss.android.ugc.aweme.base.a.f) {
                        ((com.ss.android.ugc.aweme.base.a.f) context).setActivityResultListener(this);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                this.f69056k = false;
                if (this.s) {
                    final Activity activity = (Activity) context;
                    com.ss.android.ugc.aweme.ce.b.a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new b.AbstractC1579b() {
                        /* class com.ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(42584);
                        }

                        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
                        public final void a(String[] strArr, int[] iArr) {
                            if (iArr != null && iArr.length > 0) {
                                if (iArr[0] == 0) {
                                    Intent intent = new Intent(activity, ImageChooseUploadActivity.class);
                                    intent.putExtra("shouldWithCamera", UploadFileMethod.this.f69049d);
                                    intent.putExtra("maxSelectNum", UploadFileMethod.this.f69048c);
                                    intent.putExtra("maxFileSize", UploadFileMethod.this.n);
                                    intent.putExtra("needBase64Response", UploadFileMethod.this.o);
                                    intent.putExtra("enter_from", UploadFileMethod.this.f69058m);
                                    Activity activity = activity;
                                    com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
                                    activity.startActivity(intent);
                                    r.a("enter_image_choose", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", UploadFileMethod.this.f69058m).f66730a);
                                    ImageChooseUploadActivity.f91325i = UploadFileMethod.this;
                                    return;
                                }
                                new com.bytedance.tux.g.b(activity).a(activity.getString(R.string.doy)).b();
                                UploadFileMethod.this.k();
                            }
                        }
                    });
                    return;
                }
                Activity activity2 = (Activity) context;
                com.ss.android.ugc.aweme.ce.b.a(activity2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new a(this, activity2));
            }
        }
    }

    private JSONObject a(int i2, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        b.i<String> m2 = m();
        try {
            m2.f();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        String d2 = m2.d();
        if (d2 != null) {
            try {
                d2 = cs.b(d2);
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        try {
            jSONObject.put("code", i2);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("url", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("uri", str2);
            }
            if (!TextUtils.isEmpty(d2)) {
                jSONObject.put("img_base64", d2);
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.ss.android.ugc.aweme.base.a.b
    public final boolean a(int i2, int i3, Intent intent) {
        Uri uri;
        int i4;
        if (i2 != 10003) {
            if (i2 == 10004) {
                if (i3 == 0 || intent == null) {
                    k();
                } else {
                    Context context = this.f69047b.get();
                    if (context == null) {
                        return true;
                    }
                    String a2 = c.d.a.a(context, intent.getData());
                    if (com.bytedance.common.utility.m.a(a2)) {
                        n.a(context, 2131231585, (int) R.string.dq2);
                        return true;
                    } else if (!new File(a2).exists()) {
                        n.a(context, 2131231585, (int) R.string.dq2);
                        return true;
                    } else {
                        String str = Api.f66570e + "?uid=" + com.ss.android.ugc.aweme.account.b.g().getCurUserId();
                        if (!TextUtils.isEmpty(this.p)) {
                            str = str + "&source=" + this.p;
                        }
                        this.q = a2;
                        String a3 = a(intent, "uri");
                        String a4 = a(intent, "url");
                        if (TextUtils.isEmpty(a3) || TextUtils.isEmpty(a4)) {
                            com.ss.android.ugc.aweme.account.b.a();
                            com.ss.android.ugc.aweme.account.b.f62864a.e().uploadAvatar(new WeakHandler(this), str, 4194304, this.q, null);
                            return true;
                        }
                        this.f69050e.a(a(1, a4, a3), 1, "uploadFile");
                        return true;
                    }
                }
            }
            return true;
        } else if (i3 == 0 || intent == null) {
            k();
            return true;
        } else {
            Context context2 = this.f69047b.get();
            if (context2 == null) {
                return true;
            }
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_result_selection");
            if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
                uri = intent.getData();
            } else {
                uri = (Uri) parcelableArrayListExtra.get(0);
            }
            if (uri == null || com.bytedance.common.utility.m.a(uri.toString())) {
                n.a(context2, 2131231585, (int) R.string.dq2);
                return true;
            }
            try {
                if (d.a(com.bytedance.ies.ugc.appcontext.d.a(), uri) == null) {
                    n.a(context2, 2131231585, (int) R.string.dq2);
                    return true;
                }
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
            }
            if (this.v) {
                if (context2 instanceof Activity) {
                    if (!TextUtils.isEmpty(this.p)) {
                        try {
                            i4 = Integer.parseInt(this.p);
                        } catch (NumberFormatException e3) {
                            e3.printStackTrace();
                        }
                        ae.f115954a.gotoCropActivity((Activity) context2, uri.toString(), false, this.w, (int) n.b(context2, 16.0f), 10004, this.x, this.y, i4, false);
                    }
                    i4 = -1;
                    ae.f115954a.gotoCropActivity((Activity) context2, uri.toString(), false, this.w, (int) n.b(context2, 16.0f), 10004, this.x, this.y, i4, false);
                }
                return true;
            }
            String str2 = Api.f66570e + "?uid=" + com.ss.android.ugc.aweme.account.b.g().getCurUserId();
            if (!TextUtils.isEmpty(this.p)) {
                str2 = str2 + "&source=" + this.p;
            }
            this.q = uri.toString();
            com.ss.android.ugc.aweme.account.b.a();
            com.ss.android.ugc.aweme.account.b.f62864a.e().uploadAvatar(new WeakHandler(this), str2, 4194304, this.q, null);
            return true;
        }
    }
}
