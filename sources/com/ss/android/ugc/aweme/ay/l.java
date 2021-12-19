package com.ss.android.ugc.aweme.ay;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.framework.a.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

final class l {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f67822a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(41744);
    }

    l() {
    }

    private static byte[] b(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = Integer.valueOf(str.substring(i3, i3 + 2), 16).byteValue();
        }
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public final String a(String str) {
        String str2;
        boolean z = true;
        if (str.contains("%%secretKey=")) {
            str2 = str.substring(0, str.indexOf("%%secretKey="));
            String substring = str.substring(str.lastIndexOf("=") + 1, str.length());
            if (!TextUtils.isEmpty(substring)) {
                this.f67822a.put(str2, substring);
            }
        } else {
            str2 = str;
            z = false;
        }
        if ((z || str.contains("secretKey")) && (str.length() == str2.length() || str2.contains("secretKey"))) {
            a(str, str2, Boolean.valueOf(z));
        }
        return str2;
    }

    private static void a(String str, String str2, Boolean bool) {
        int i2;
        a.a("ImageEncryptUtils parse failed: rawUrl=" + str + ", parseUrl=" + str2 + ", contain=" + bool);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("service", "secret_key_parse_error");
            jSONObject.put("raw_url", str);
            jSONObject.put("parse_url", str2);
            if (bool.booleanValue()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_contain", i2);
            b.a("im_error_event", jSONObject);
        } catch (Exception e2) {
            a.a((Throwable) e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final Pair<InputStream, Long> a(InputStream inputStream, String str, long j2) {
        MethodCollector.i(5594);
        if (this.f67822a.containsKey(str)) {
            String str2 = this.f67822a.get(str);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                this.f67822a.remove(str);
                if (byteArray != null) {
                    byte[] b2 = b(str2);
                    byte[] copyOfRange = Arrays.copyOfRange(byteArray, 12, byteArray.length);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(Arrays.copyOfRange(byteArray, 0, 12));
                    SecretKeySpec secretKeySpec = new SecretKeySpec(b2, "AES");
                    Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                    instance.init(2, secretKeySpec, ivParameterSpec);
                    byte[] doFinal = instance.doFinal(copyOfRange);
                    Pair pair = new Pair(doFinal, Integer.valueOf(doFinal.length));
                    inputStream = new ByteArrayInputStream((byte[]) pair.first);
                    j2 = (long) ((Integer) pair.second).intValue();
                }
            } catch (Throwable th) {
                this.f67822a.remove(str);
                MethodCollector.o(5594);
                throw th;
            }
        }
        Pair<InputStream, Long> pair2 = new Pair<>(inputStream, Long.valueOf(j2));
        MethodCollector.o(5594);
        return pair2;
    }
}
