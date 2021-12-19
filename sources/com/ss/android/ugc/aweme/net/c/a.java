package com.ss.android.ugc.aweme.net.c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.ttnet.d.b;
import com.bytedance.ttnet.d.d;
import org.json.JSONObject;

public abstract class a implements e.i<b> {

    /* renamed from: a  reason: collision with root package name */
    protected Context f112246a;

    static {
        Covode.recordClassIndex(72133);
    }

    /* access modifiers changed from: protected */
    public abstract void a(long j2, long j3, String str, String str2, String str3, b bVar, Throwable th, JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public abstract void a(long j2, long j3, String str, String str2, String str3, b bVar, JSONObject jSONObject);

    public abstract void a(b bVar, JSONObject jSONObject);

    public a(Context context) {
        b.b();
        this.f112246a = context;
    }

    private static void a(Throwable th, JSONObject jSONObject) {
        if (th != null) {
            try {
                String message = th.getMessage();
                if (!m.a(message)) {
                    int length = message.length();
                    int indexOf = message.indexOf("ErrorCode=");
                    if (indexOf != -1) {
                        StringBuilder sb = new StringBuilder();
                        for (int i2 = indexOf + 10; i2 < length; i2++) {
                            char charAt = message.charAt(i2);
                            if (!Character.isSpaceChar(charAt)) {
                                if (!(charAt == '-' || Character.isDigit(charAt))) {
                                    break;
                                }
                                sb.append(charAt);
                            }
                        }
                        if (sb.length() > 0) {
                            jSONObject.put("cronet_error_code", sb.toString());
                        }
                    }
                    int indexOf2 = message.indexOf("InternalErrorCode=");
                    if (indexOf2 != -1) {
                        StringBuilder sb2 = new StringBuilder();
                        for (int i3 = indexOf2 + 18; i3 < length; i3++) {
                            char charAt2 = message.charAt(i3);
                            if (!Character.isSpaceChar(charAt2)) {
                                if (!(charAt2 == '-' || Character.isDigit(charAt2))) {
                                    break;
                                }
                                sb2.append(charAt2);
                            }
                        }
                        if (sb2.length() > 0) {
                            jSONObject.put("cronet_internal_error_code", sb2.toString());
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, java.lang.String, java.lang.String, com.bytedance.frameworks.baselib.network.http.a] */
    @Override // com.bytedance.frameworks.baselib.network.http.e.i
    public final /* synthetic */ void a(long j2, long j3, String str, String str2, b bVar) {
        b bVar2 = bVar;
        try {
            String[] strArr = new String[1];
            JSONObject jSONObject = new JSONObject();
            if (str.contains("&config_retry=b")) {
                jSONObject.put("log_config_retry", 1);
            }
            if (TextUtils.isEmpty(strArr[0]) && bVar2 != null) {
                strArr[0] = bVar2.f28913a;
                if (bVar2.f28914b != null) {
                    if (((d) bVar2.f28914b).s > 0) {
                        jSONObject.put("index", ((d) bVar2.f28914b).s);
                    }
                    if (((d) bVar2.f28914b).r > 0) {
                        jSONObject.put("httpIndex", ((d) bVar2.f28914b).r);
                    }
                }
            }
            try {
                a(bVar2, jSONObject);
                a(j2, j3, str, str2, strArr[0], bVar2, jSONObject);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, java.lang.String, java.lang.String, com.bytedance.frameworks.baselib.network.http.a, java.lang.Throwable] */
    @Override // com.bytedance.frameworks.baselib.network.http.e.i
    public final /* synthetic */ void a(long j2, long j3, String str, String str2, b bVar, Throwable th) {
        b bVar2 = bVar;
        try {
            String[] strArr = new String[1];
            JSONObject jSONObject = new JSONObject();
            if (TextUtils.isEmpty(strArr[0]) && bVar2 != null) {
                strArr[0] = bVar2.f28913a;
                if (bVar2.f28914b != null) {
                    if (((d) bVar2.f28914b).s > 0) {
                        jSONObject.put("index", ((d) bVar2.f28914b).s);
                    }
                    if (((d) bVar2.f28914b).r > 0) {
                        jSONObject.put("httpIndex", ((d) bVar2.f28914b).r);
                    }
                }
            }
            a(th, jSONObject);
            try {
                a(bVar2, jSONObject);
                a(j2, j3, str, str2, strArr[0], bVar2, th, jSONObject);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
        }
    }
}
