package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.appcompat.widget.ai;
import b.i;
import b.j;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.a.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity;
import com.ss.android.ugc.aweme.fe.method.upload.c;
import com.ss.android.ugc.aweme.fe.method.upload.f;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.ae;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.utils.fl;
import com.zhihu.matisse.internal.entity.Item;
import com.zhiliaoapp.musically.R;
import h.z;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e implements d, b, c {

    /* renamed from: a  reason: collision with root package name */
    protected WeakReference<Context> f91264a;

    /* renamed from: b  reason: collision with root package name */
    protected a f91265b;

    /* renamed from: c  reason: collision with root package name */
    public long f91266c = Long.MAX_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private String f91267d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f91268e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f91269f;

    /* renamed from: g  reason: collision with root package name */
    private int f91270g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f91271h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f91272i;

    /* renamed from: j  reason: collision with root package name */
    private SparseArray<AvatarUri> f91273j;

    /* renamed from: k  reason: collision with root package name */
    private List<String> f91274k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private List<String> f91275l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private AtomicInteger f91276m;
    private AtomicInteger n;
    private h.f.a.a<z> o;
    private List<WeakHandler.IHandler> p;
    private boolean q;
    private int r;
    private String s;
    private boolean t = false;
    private boolean u = false;
    private float v = 1.0f;
    private int w = 0;
    private int x = 0;

    static {
        Covode.recordClassIndex(57446);
    }

    @Override // com.ss.android.ugc.aweme.fe.method.upload.c
    public final void l() {
        this.o = null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Activity activity, int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                Intent intent = new Intent(activity, ImageChooseUploadActivity.class);
                intent.putExtra("shouldWithCamera", this.f91272i);
                intent.putExtra("maxSelectNum", this.f91270g);
                intent.putExtra("maxFileSize", this.f91266c);
                intent.putExtra("needBase64Response", this.t);
                intent.putExtra("enter_from", this.s);
                com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
                activity.startActivity(intent);
                r.a("enter_image_choose", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.s).f66730a);
                ImageChooseUploadActivity.f91325i = this;
                return;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(activity).a(activity.getString(R.string.doy)).a();
            a("image", "0");
        }
    }

    @Override // com.ss.android.ugc.aweme.base.a.b
    public final boolean a(int i2, int i3, Intent intent) {
        Uri uri;
        int i4;
        if (i2 != 10003) {
            if (i2 == 10004) {
                if (i3 == 0 || intent == null) {
                    a("image", "1");
                } else {
                    Context a2 = a(this.f91264a.get());
                    if (a2 == null) {
                        return true;
                    }
                    String a3 = c.d.a.a(a2, intent.getData());
                    if (m.a(a3)) {
                        new com.bytedance.tux.g.b(this.f91265b.f35513d).b(2131231585).e(R.string.dq2).b();
                        return true;
                    } else if (!new File(a3).exists()) {
                        new com.bytedance.tux.g.b(this.f91265b.f35513d).b(2131231585).e(R.string.dq2).b();
                        return true;
                    } else {
                        this.f91268e = a3;
                        String a4 = a(intent, "uri");
                        String a5 = a(intent, "url");
                        if (TextUtils.isEmpty(a4) || TextUtils.isEmpty(a5)) {
                            String str = Api.f66570e + "?uid=" + com.ss.android.ugc.aweme.account.b.g().getCurUserId();
                            if (!TextUtils.isEmpty(this.f91267d)) {
                                str = str + "&source=" + this.f91267d;
                            }
                            com.ss.android.ugc.aweme.account.b.a();
                            com.ss.android.ugc.aweme.account.b.f62864a.e().uploadAvatar(new WeakHandler(this), str, 4194304, this.f91268e, null);
                            return true;
                        }
                        a("image", a(1, a5, a4));
                        return true;
                    }
                }
            }
            return true;
        } else if (i3 == 0 || intent == null) {
            a("image", "1");
            return true;
        } else {
            Context a6 = a(this.f91264a.get());
            if (a6 == null) {
                return true;
            }
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_result_selection");
            if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
                uri = intent.getData();
            } else {
                uri = (Uri) parcelableArrayListExtra.get(0);
            }
            if (uri == null || m.a(uri.toString())) {
                new com.bytedance.tux.g.b(this.f91265b.f35513d).b(2131231585).e(R.string.dq2).b();
                return true;
            }
            try {
                if (c.b.d.a(com.bytedance.ies.ugc.appcontext.d.a(), uri) == null) {
                    new com.bytedance.tux.g.b(this.f91265b.f35513d).b(2131231585).e(R.string.dq2).b();
                    return true;
                }
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
            }
            if (this.u) {
                if (a6 instanceof Activity) {
                    if (!TextUtils.isEmpty(this.f91267d)) {
                        try {
                            i4 = Integer.parseInt(this.f91267d);
                        } catch (NumberFormatException e3) {
                            e3.printStackTrace();
                        }
                        ae.f115954a.gotoCropActivity((Activity) a6, uri.toString(), false, this.v, (int) n.b(a6, 16.0f), 10004, this.w, this.x, i4, false);
                    }
                    i4 = -1;
                    ae.f115954a.gotoCropActivity((Activity) a6, uri.toString(), false, this.v, (int) n.b(a6, 16.0f), 10004, this.w, this.x, i4, false);
                }
                return true;
            }
            this.f91268e = uri.toString();
            String str2 = Api.f66570e + "?uid=" + com.ss.android.ugc.aweme.account.b.g().getCurUserId();
            if (!TextUtils.isEmpty(this.f91267d)) {
                str2 = str2 + "&source=" + this.f91267d;
            }
            com.ss.android.ugc.aweme.account.b.a();
            com.ss.android.ugc.aweme.account.b.f62864a.e().uploadAvatar(new WeakHandler(this), str2, 4194304, this.f91268e, null);
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.method.upload.c
    public final void a(List<f> list, h.f.a.a<z> aVar) {
        if (!com.ss.android.ugc.aweme.base.utils.d.a(list)) {
            this.o = aVar;
            this.f91276m = new AtomicInteger(0);
            this.n = new AtomicInteger(0);
            this.f91274k.clear();
            this.f91275l.clear();
            for (int i2 = 0; i2 < list.size(); i2++) {
                this.f91274k.add(list.get(i2).f91415a);
                this.f91275l.add(list.get(i2).f91416b);
            }
            this.f91273j = new SparseArray<>();
            a(this.f91274k.size());
            for (int i3 = 0; i3 < this.f91274k.size(); i3++) {
                String str = this.f91274k.get(i3);
                if (m.a(str)) {
                    this.f91273j.put(i3, new AvatarUri());
                    this.n.incrementAndGet();
                } else {
                    try {
                        if (c.b.d.a(com.bytedance.ies.ugc.appcontext.d.a(), Uri.parse(str)) == null) {
                            this.f91273j.put(i3, new AvatarUri());
                            this.n.incrementAndGet();
                        }
                    } catch (FileNotFoundException e2) {
                        e2.printStackTrace();
                    }
                    String str2 = Api.f66570e + "?uid=" + com.ss.android.ugc.aweme.account.b.g().getCurUserId();
                    if (!TextUtils.isEmpty(this.f91267d)) {
                        str2 = str2 + "&source=" + this.f91267d;
                    }
                    String a2 = com.ss.android.ugc.aweme.fe.a.b.a(str);
                    if (a2 != null && !a2.isEmpty()) {
                        com.ss.android.ugc.aweme.account.b.a();
                        com.ss.android.ugc.aweme.account.b.f62864a.e().uploadAvatar(new WeakHandler(this.p.get(i3)), str2, 4194304, com.ss.android.ugc.aweme.feedback.d.a(a2, new File(a2), this.r), null);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i2, Message message) {
        if (this.f91273j != null && this.n != null && this.f91276m != null && this.f91274k != null && this.f91264a != null && !this.q) {
            if (message.obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                Context a2 = a(this.f91264a.get());
                if (a2 != null) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(a2).a(((com.ss.android.ugc.aweme.base.api.a.b.a) message.obj).getErrorMsg()).a();
                }
                this.f91273j.put(i2, new AvatarUri());
                this.n.incrementAndGet();
            } else if (message.obj instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) message.obj;
                if (com.ss.android.ugc.aweme.base.utils.d.b(avatarUri.urlList)) {
                    this.f91273j.put(i2, avatarUri);
                    this.f91276m.incrementAndGet();
                } else {
                    this.f91273j.put(i2, new AvatarUri());
                    this.n.incrementAndGet();
                }
            } else {
                this.f91273j.put(i2, new AvatarUri());
                this.n.incrementAndGet();
            }
            if (this.n.get() + this.f91276m.get() == this.f91274k.size()) {
                if (this.n.get() == this.f91274k.size()) {
                    a("image", a(0, "", ""));
                } else {
                    JSONArray a3 = a(this.f91273j);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(StringSet.type, "image");
                        jSONObject.put("args", a3);
                        jSONObject.put("msg", "H5_uploadFile");
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    a aVar = this.f91265b;
                    if (aVar != null) {
                        aVar.b("H5_uploadFile", jSONObject);
                    }
                }
                h.f.a.a<z> aVar2 = this.o;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                com.ss.android.ugc.aweme.feedback.d.a(this.r);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.method.upload.c
    public final void k() {
        a("image", "1");
        this.q = true;
    }

    private i<String> a() {
        j jVar = new j();
        try {
            if (this.f91269f || c.b.d.a(com.bytedance.ies.ugc.appcontext.d.a(), Uri.parse(this.f91268e)) == null) {
                jVar.a((Object) null);
            } else {
                AVExternalServiceImpl.a().abilityService().processService().compressPhoto(this.f91268e, 216, 384, new h(jVar));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            jVar.a((Object) null);
        } catch (Throwable th) {
            this.f91269f = false;
            this.f91268e = "";
            throw th;
        }
        this.f91269f = false;
        this.f91268e = "";
        return jVar.f4869a;
    }

    private static Context a(Context context) {
        while (context != null) {
            if ((context instanceof Activity) || !(context instanceof ContextWrapper)) {
                return context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private void a(int i2) {
        this.p = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            this.p.add(new i(this, i3));
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        JSONObject a2;
        Context a3 = a(this.f91264a.get());
        if (a3 != null) {
            if (message.obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                new com.ss.android.ugc.aweme.tux.a.i.a(a3).a(((com.ss.android.ugc.aweme.base.api.a.b.a) message.obj).getErrorMsg()).a();
            } else if (message.obj instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) message.obj;
                if (avatarUri.urlList == null || avatarUri.urlList.isEmpty()) {
                    a2 = a(0, "", "");
                } else {
                    a2 = a(1, avatarUri.urlList.get(0), avatarUri.uri);
                }
                a("image", a2);
            }
            a2 = a(0, "", "");
            a("image", a2);
        }
    }

    private JSONArray a(SparseArray<AvatarUri> sparseArray) {
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
                if (i2 < this.f91275l.size()) {
                    jSONObject.put("img_base64", this.f91275l.get(i2));
                }
                jSONArray.put(jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONArray;
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public e(WeakReference<Context> weakReference, a aVar) {
        this.f91264a = weakReference;
        this.f91265b = aVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Activity activity, int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                try {
                    com.zhihu.matisse.a.a(activity).a(com.zhihu.matisse.b.ofImage()).a().c().a(1).d().b().a(new com.zhihu.matisse.a.a() {
                        /* class com.ss.android.ugc.aweme.fe.method.e.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(57447);
                        }

                        @Override // com.zhihu.matisse.a.a
                        public final com.zhihu.matisse.internal.entity.b a(Context context, Item item) {
                            Uri uri = item.f156423c;
                            if (uri == null || m.a(uri.toString())) {
                                return new com.zhihu.matisse.internal.entity.b(context.getString(R.string.dq6), (byte) 0);
                            }
                            try {
                                if (c.b.d.a(com.bytedance.ies.ugc.appcontext.d.a(), uri) == null) {
                                    return new com.zhihu.matisse.internal.entity.b(context.getString(R.string.dq6), (byte) 0);
                                }
                            } catch (FileNotFoundException e2) {
                                e2.printStackTrace();
                            }
                            if (e.this.f91266c == 0 || c.b.e.a(com.bytedance.ies.ugc.appcontext.d.a(), uri) <= e.this.f91266c) {
                                return null;
                            }
                            return new com.zhihu.matisse.internal.entity.b(context.getString(R.string.e0, fl.a(e.this.f91266c)), (byte) 0);
                        }
                    }).b(10003);
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a("", e2);
                    com.ss.android.newmedia.d.a(activity);
                }
            } else {
                new com.ss.android.ugc.aweme.tux.a.i.a(activity).a(activity.getString(R.string.doy)).a();
                k();
            }
        }
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        Context context;
        String string = hVar.f35533d.getString(StringSet.type);
        this.f91267d = "";
        if (TextUtils.equals("image", string)) {
            this.f91267d = hVar.f35533d.optString("source");
            this.f91269f = hVar.f35533d.optBoolean("skip_img_base64", false);
            this.f91270g = hVar.f35533d.optInt("maxSelectNum", 1);
            this.f91271h = hVar.f35533d.optBoolean("isMultiSelect", false);
            this.f91272i = hVar.f35533d.optBoolean("shouldWithCamera", false);
            this.r = hVar.f35533d.optInt("image_width", -1);
            this.s = hVar.f35533d.optString("from", "");
            long optLong = hVar.f35533d.optLong("maxFileSize", Long.MAX_VALUE);
            this.f91266c = optLong;
            if (optLong == 0) {
                this.f91266c = Long.MAX_VALUE;
            }
            this.t = hVar.f35533d.optBoolean("needBase64Response", false);
            this.u = hVar.f35533d.optBoolean("isNeedCut", false);
            this.w = hVar.f35533d.optInt("minImageWidth");
            this.x = hVar.f35533d.optInt("minImageHeight");
            int optInt = hVar.f35533d.optInt("cropRatioWidth", 0);
            int optInt2 = hVar.f35533d.optInt("cropRatioHeight", 0);
            if (optInt * optInt2 != 0) {
                this.v = (((float) optInt2) * 1.0f) / ((float) optInt);
            }
            WeakReference<Context> weakReference = this.f91264a;
            if (weakReference != null) {
                context = a(weakReference.get());
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
            jSONObject.put("code", 1);
            this.q = false;
            if (this.f91271h) {
                Activity activity = (Activity) context;
                com.ss.android.ugc.aweme.ce.b.a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new g(this, activity));
                return;
            }
            Activity activity2 = (Activity) context;
            com.ss.android.ugc.aweme.ce.b.a(activity2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new f(this, activity2));
        }
    }

    private void a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("reason", str2);
            jSONObject.put("code", 1);
            jSONObject2.put(StringSet.type, str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadFileCancel");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a aVar = this.f91265b;
        if (aVar != null) {
            aVar.b("H5_uploadFileCancel", jSONObject2);
        }
    }

    private void a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(StringSet.type, str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadFile");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a aVar = this.f91265b;
        if (aVar != null) {
            aVar.b("H5_uploadFile", jSONObject2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033 A[Catch:{ JSONException -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e A[Catch:{ JSONException -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049 A[Catch:{ JSONException -> 0x004f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject a(int r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            b.i r1 = r3.a()
            r1.f()     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x0011
        L_0x000d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0011:
            java.lang.Object r0 = r1.d()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r1.d()     // Catch:{ IOException -> 0x0022 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x0022 }
            java.lang.String r1 = com.ss.android.ugc.aweme.utils.cs.b(r0)     // Catch:{ IOException -> 0x0022 }
            goto L_0x0028
        L_0x0022:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0026:
            java.lang.String r1 = ""
        L_0x0028:
            java.lang.String r0 = "code"
            r2.put(r0, r4)     // Catch:{ JSONException -> 0x004f }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x004f }
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "url"
            r2.put(r0, r5)     // Catch:{ JSONException -> 0x004f }
        L_0x0038:
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x004f }
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "uri"
            r2.put(r0, r6)     // Catch:{ JSONException -> 0x004f }
        L_0x0043:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x004f }
            if (r0 != 0) goto L_0x0053
            java.lang.String r0 = "img_base64"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0053:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.e.a(int, java.lang.String, java.lang.String):org.json.JSONObject");
    }
}
