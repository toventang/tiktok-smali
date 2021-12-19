package com.linecorp.linesdk.a.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.linecorp.linesdk.a.e;
import com.linecorp.linesdk.a.f;
import com.linecorp.linesdk.a.g;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final com.linecorp.linesdk.a.a.a.c<f> f54956a = new C1249b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final com.linecorp.linesdk.a.a.a.c<e> f54957b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public static final com.linecorp.linesdk.a.a.a.c<com.linecorp.linesdk.a.b> f54958c = new d((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public static final com.linecorp.linesdk.a.a.a.c<g> f54959d = new c((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public static final com.linecorp.linesdk.a.a.a.c<?> f54960e = new c();

    /* renamed from: f  reason: collision with root package name */
    public final Uri f54961f;

    /* renamed from: g  reason: collision with root package name */
    public final com.linecorp.linesdk.a.a.a.a f54962g;

    static class a extends a<e> {
        static {
            Covode.recordClassIndex(34516);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: package-private */
        @Override // com.linecorp.linesdk.a.a.a
        public final /* synthetic */ e a(JSONObject jSONObject) {
            List asList;
            String string = jSONObject.getString("token_type");
            if ("Bearer".equals(string)) {
                String optString = jSONObject.optString("scope");
                com.linecorp.linesdk.a.d dVar = new com.linecorp.linesdk.a.d(jSONObject.getString("access_token"), jSONObject.getLong("expires_in") * 1000, System.currentTimeMillis(), jSONObject.getString("refresh_token"));
                if (TextUtils.isEmpty(optString)) {
                    asList = Collections.emptyList();
                } else {
                    asList = Arrays.asList(optString.split(" "));
                }
                return new e(dVar, asList);
            }
            throw new JSONException("Illegal token type. token_type=".concat(String.valueOf(string)));
        }
    }

    /* renamed from: com.linecorp.linesdk.a.a.b$b  reason: collision with other inner class name */
    static class C1249b extends a<f> {
        static {
            Covode.recordClassIndex(34517);
        }

        private C1249b() {
        }

        /* synthetic */ C1249b(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: package-private */
        @Override // com.linecorp.linesdk.a.a.a
        public final /* synthetic */ f a(JSONObject jSONObject) {
            return new f(jSONObject.getString("otpId"), jSONObject.getString("otp"));
        }
    }

    static class c extends a<g> {
        static {
            Covode.recordClassIndex(34518);
        }

        private c() {
        }

        /* synthetic */ c(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: package-private */
        @Override // com.linecorp.linesdk.a.a.a
        public final /* synthetic */ g a(JSONObject jSONObject) {
            String string = jSONObject.getString("token_type");
            if ("Bearer".equals(string)) {
                return new g(jSONObject.getString("access_token"), jSONObject.getLong("expires_in") * 1000, jSONObject.optString("refresh_token"));
            }
            throw new JSONException("Illegal token type. token_type=".concat(String.valueOf(string)));
        }
    }

    static class d extends a<com.linecorp.linesdk.a.b> {
        static {
            Covode.recordClassIndex(34519);
        }

        private d() {
        }

        /* synthetic */ d(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: package-private */
        @Override // com.linecorp.linesdk.a.a.a
        public final /* synthetic */ com.linecorp.linesdk.a.b a(JSONObject jSONObject) {
            List asList;
            String optString = jSONObject.optString("scope");
            String string = jSONObject.getString("client_id");
            long j2 = jSONObject.getLong("expires_in") * 1000;
            if (TextUtils.isEmpty(optString)) {
                asList = Collections.emptyList();
            } else {
                asList = Arrays.asList(optString.split(" "));
            }
            return new com.linecorp.linesdk.a.b(string, j2, asList);
        }
    }

    static {
        Covode.recordClassIndex(34515);
    }

    private b(Uri uri, com.linecorp.linesdk.a.a.a.a aVar) {
        this.f54961f = uri;
        this.f54962g = aVar;
    }

    public b(Context context, Uri uri) {
        this(uri, new com.linecorp.linesdk.a.a.a.a(context, "4.0.8"));
    }
}
