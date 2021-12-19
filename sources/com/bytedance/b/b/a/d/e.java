package com.bytedance.b.b.a.d;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.b.b.a.g;
import com.bytedance.b.e.a.a;
import com.bytedance.b.k.b.b;
import com.bytedance.b.k.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

public final class e {

    /* renamed from: f  reason: collision with root package name */
    private static HashMap<f, e> f25952f = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private String f25953a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f25954b;

    /* renamed from: c  reason: collision with root package name */
    private int f25955c;

    /* renamed from: d  reason: collision with root package name */
    private String f25956d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f25957e;

    /* renamed from: g  reason: collision with root package name */
    private List<String> f25958g;

    static {
        Covode.recordClassIndex(15128);
    }

    private String a() {
        List<String> list = this.f25958g;
        if (!TextUtils.isEmpty(this.f25953a)) {
            if (list != null && list.size() > 0) {
                try {
                    return "https://" + this.f25953a + new URL(list.get(0)).getPath();
                } catch (Throwable unused) {
                }
            }
            return null;
        } else if (!TextUtils.isEmpty(this.f25956d)) {
            return this.f25956d;
        } else {
            if (this.f25954b) {
                this.f25955c++;
            }
            int size = list.size();
            int i2 = this.f25955c;
            if (size > i2 && i2 >= 0) {
                return list.get(i2);
            }
            this.f25955c = 0;
            return list.get(0);
        }
    }

    private e(f fVar) {
        this.f25958g = fVar.b();
    }

    public static e a(f fVar) {
        if (f25952f.containsKey(fVar)) {
            return f25952f.get(fVar);
        }
        f25952f.put(fVar, new e(fVar));
        return f25952f.get(fVar);
    }

    private static byte[] b(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                d.a(gZIPOutputStream);
                return byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                d.a(gZIPOutputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream2 = gZIPOutputStream;
                d.a(gZIPOutputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            gZIPOutputStream = null;
            d.a(gZIPOutputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            d.a(gZIPOutputStream2);
            throw th;
        }
    }

    private static JSONObject a(c cVar) {
        String str;
        g gVar;
        try {
            JSONObject jSONObject = new JSONObject(new String(cVar.f44102c));
            Map<String, String> map = cVar.f44101b;
            if (map == null || map.isEmpty()) {
                str = null;
            } else {
                str = map.get("ran");
            }
            boolean z = true;
            try {
                String optString = jSONObject.optString("data");
                if (!optString.isEmpty()) {
                    if (!TextUtils.isEmpty(str)) {
                        String a2 = a(optString.getBytes(), str);
                        jSONObject = new JSONObject(a2);
                        z = true ^ TextUtils.isEmpty(a2);
                    } else {
                        jSONObject = new JSONObject(new String(optString.getBytes()));
                    }
                }
                if (!com.bytedance.b.k.e.a(jSONObject)) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("configs");
                    if (!com.bytedance.b.k.e.a(optJSONObject) && (gVar = (g) com.bytedance.b.j.c.a(g.class)) != null) {
                        gVar.a(optJSONObject);
                    }
                }
                if (z) {
                    return jSONObject;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "success");
                return jSONObject2;
            } catch (Throwable unused) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("message", "success");
                return jSONObject3;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6 A[Catch:{ all -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b2 A[Catch:{ all -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0116 A[Catch:{ all -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012c A[Catch:{ all -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0138 A[Catch:{ all -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0142 A[Catch:{ all -> 0x022f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(byte[] r13) {
        /*
        // Method dump skipped, instructions count: 568
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.b.b.a.d.e.a(byte[]):boolean");
    }

    private static String a(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/NoPadding");
            instance.init(2, secretKeySpec);
            String str2 = new String(instance.doFinal(Base64.decode(bArr, 0)));
            int indexOf = str2.indexOf("$");
            if (indexOf != -1) {
                return str2.substring(0, indexOf);
            }
            return str2;
        } catch (Throwable th) {
            if (a.r()) {
                b.a(com.bytedance.b.b.a.a.f25847a, "decodeData", th);
            }
            return "";
        }
    }
}
