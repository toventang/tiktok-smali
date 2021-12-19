package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.android.live.e;
import com.bytedance.android.live.network.h;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import f.a.b.b;
import f.a.t;
import f.a.z;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class bj extends e<JSONObject, a> {

    /* renamed from: a  reason: collision with root package name */
    public b f14570a;

    /* renamed from: b  reason: collision with root package name */
    String f14571b;

    /* renamed from: c  reason: collision with root package name */
    public int f14572c;

    /* renamed from: d  reason: collision with root package name */
    private JSONObject f14573d;

    static {
        Covode.recordClassIndex(8108);
    }

    /* access modifiers changed from: package-private */
    public static final class a {
        @c(a = "imageList")

        /* renamed from: a  reason: collision with root package name */
        C0316a[] f14577a;

        static {
            Covode.recordClassIndex(8111);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bj$a$a  reason: collision with other inner class name */
        public static final class C0316a {
            @c(a = "path")

            /* renamed from: a  reason: collision with root package name */
            String f14578a;
            @c(a = "status")

            /* renamed from: b  reason: collision with root package name */
            int f14579b = 1;
            @c(a = "url")

            /* renamed from: c  reason: collision with root package name */
            String f14580c;

            static {
                Covode.recordClassIndex(8112);
            }

            C0316a() {
            }
        }

        private a(C0316a[] aVarArr) {
            this.f14577a = aVarArr;
        }

        /* synthetic */ a(C0316a[] aVarArr, byte b2) {
            this(aVarArr);
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
        b bVar = this.f14570a;
        if (bVar != null && !bVar.isDisposed()) {
            this.f14570a.dispose();
        }
    }

    public final void a(a.C0316a[] aVarArr) {
        finishWithResult(new a(aVarArr, (byte) 0));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(JSONObject jSONObject, g gVar) {
        byte[] bArr;
        String str;
        JSONObject jSONObject2 = jSONObject;
        this.f14573d = jSONObject2.getJSONObject("params");
        this.f14571b = jSONObject2.getString("url");
        JSONArray jSONArray = jSONObject2.getJSONArray("imageList");
        String string = jSONObject2.getString(StringSet.type);
        this.f14572c = 0;
        ArrayList arrayList = new ArrayList();
        final a.C0316a[] aVarArr = new a.C0316a[jSONArray.length()];
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                String string2 = jSONArray.getString(i2);
                a.C0316a aVar = new a.C0316a();
                aVar.f14578a = string2;
                aVarArr[i2] = aVar;
                if (string.equals("path")) {
                    JSONObject jSONObject3 = new JSONObject(string2);
                    bArr = com.bytedance.android.livesdk.utils.g.a(new File(jSONObject3.getString("uri")));
                    str = jSONObject3.getString("file_name");
                } else {
                    bArr = Base64.decode(string2, 0);
                    str = "upload_photo_" + i2 + "_" + System.currentTimeMillis();
                }
                if (bArr != null) {
                    arrayList.add(t.a(new bk(this, bArr, str)).d(new bl(string2)));
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        t.b((Iterable) arrayList).a((f.a.d.g) f.a.e.b.a.f157188a, true).a(new f()).b((z) new z<androidx.core.g.e<String, d<com.bytedance.android.live.base.model.user.c>>>() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.bj.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8109);
            }

            @Override // f.a.z
            public final void onComplete() {
                bj.this.a(aVarArr);
            }

            @Override // f.a.z
            public final void onError(Throwable th) {
                bj.this.a(aVarArr);
            }

            @Override // f.a.z
            public final void onSubscribe(b bVar) {
                bj.this.f14570a = bVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.z
            public final /* synthetic */ void onNext(androidx.core.g.e<String, d<com.bytedance.android.live.base.model.user.c>> eVar) {
                androidx.core.g.e<String, d<com.bytedance.android.live.base.model.user.c>> eVar2 = eVar;
                bj.this.f14572c++;
                a.C0316a[] aVarArr = aVarArr;
                int length = aVarArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    a.C0316a aVar = aVarArr[i2];
                    if (!aVar.f14578a.equals(eVar2.f2397a)) {
                        i2++;
                    } else if (eVar2.f2398b != null && ((d) eVar2.f2398b).data != null && !TextUtils.isEmpty(((com.bytedance.android.live.base.model.user.c) ((d) eVar2.f2398b).data).f7455a)) {
                        aVar.f14580c = ((com.bytedance.android.live.base.model.user.c) ((d) eVar2.f2398b).data).f7455a;
                        aVar.f14579b = 0;
                    }
                }
                int i3 = bj.this.f14572c;
                a.C0316a[] aVarArr2 = aVarArr;
                if (i3 == aVarArr2.length) {
                    bj.this.a(aVarArr2);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final d<com.bytedance.android.live.base.model.user.c> a(String str, byte[] bArr, String str2) {
        MethodCollector.i(8512);
        JSONObject jSONObject = this.f14573d;
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("data", new TypedByteArray("multipart/form-data", bArr, str2));
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
        } catch (IOException unused) {
        }
        com.bytedance.android.livesdkapi.model.a a2 = h.a().a(-1, buildUpon.build().toString(), new ArrayList(1), multipartTypedOutput.mimeType(), byteArrayOutputStream.toByteArray(), multipartTypedOutput.length(), multipartTypedOutput.md5Stub()).a();
        String str3 = new String(a2.f23268e);
        if (a2.f23265b == 200) {
            d<com.bytedance.android.live.base.model.user.c> dVar = (d) e.a.f9628b.a(str3, new com.google.gson.b.a<d<com.bytedance.android.live.base.model.user.c>>() {
                /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.bj.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(8110);
                }
            }.type);
            try {
                if (dVar.statusCode != 0) {
                    dVar.error = (RequestError) e.a.f9628b.a(new JSONObject(str3).getJSONObject("data").toString(), RequestError.class);
                }
            } catch (JSONException unused2) {
            }
            MethodCollector.o(8512);
            return dVar;
        }
        Exception exc = new Exception();
        MethodCollector.o(8512);
        throw exc;
    }
}
