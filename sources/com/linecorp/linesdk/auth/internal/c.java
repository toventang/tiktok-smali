package com.linecorp.linesdk.auth.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import androidx.browser.a.c;
import com.bytedance.covode.number.Covode;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.a.a.d;
import com.linecorp.linesdk.a.e;
import com.linecorp.linesdk.a.f;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.auth.internal.a;
import com.linecorp.linesdk.auth.internal.d;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

final class c {

    /* renamed from: a  reason: collision with root package name */
    final LineAuthenticationActivity f55020a;

    /* renamed from: b  reason: collision with root package name */
    final LineAuthenticationConfig f55021b;

    /* renamed from: c  reason: collision with root package name */
    final com.linecorp.linesdk.a.a.b f55022c;

    /* renamed from: d  reason: collision with root package name */
    final d f55023d;

    /* renamed from: e  reason: collision with root package name */
    final a f55024e;

    /* renamed from: f  reason: collision with root package name */
    final com.linecorp.linesdk.a.a f55025f;

    /* renamed from: g  reason: collision with root package name */
    final String[] f55026g;

    /* renamed from: h  reason: collision with root package name */
    final d f55027h;

    static {
        Covode.recordClassIndex(34543);
    }

    class b implements Runnable {
        static {
            Covode.recordClassIndex(34545);
        }

        public final void run() {
            if (c.this.f55027h.f55034d != d.a.f55037c && !c.this.f55020a.isFinishing()) {
                c.this.f55020a.a(LineLoginResult.f54996a);
            }
        }

        private b() {
        }

        /* synthetic */ b(c cVar, byte b2) {
            this();
        }
    }

    class a extends AsyncTask<String, Void, LineLoginResult> {
        static {
            Covode.recordClassIndex(34544);
        }

        private a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(LineLoginResult lineLoginResult) {
            c.this.f55027h.f55034d = d.a.f55038d;
            c.this.f55020a.a(lineLoginResult);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ LineLoginResult doInBackground(String[] strArr) {
            String str;
            String[] strArr2 = strArr;
            if (strArr2 == null || strArr2.length != 1) {
                str = null;
            } else {
                str = strArr2[0];
            }
            f fVar = c.this.f55027h.f55031a;
            String str2 = c.this.f55027h.f55032b;
            if (TextUtils.isEmpty(str) || fVar == null || TextUtils.isEmpty(str2)) {
                return new LineLoginResult(com.linecorp.linesdk.b.INTERNAL_ERROR, new LineApiError("Requested data is missing."));
            }
            com.linecorp.linesdk.a.a.b bVar = c.this.f55022c;
            String str3 = c.this.f55021b.f54986a;
            Uri build = bVar.f54961f.buildUpon().appendPath("oauth").appendPath("accessToken").build();
            HashMap hashMap = new HashMap(5);
            hashMap.put("grant_type", "authorization_code");
            hashMap.put("code", str);
            hashMap.put("redirect_uri", str2);
            hashMap.put("client_id", str3);
            hashMap.put("otp", fVar.f54980b);
            com.linecorp.linesdk.a a2 = bVar.f54962g.a(build, Collections.emptyMap(), hashMap, com.linecorp.linesdk.a.a.b.f54957b);
            if (!a2.a()) {
                return c.a(a2);
            }
            e eVar = (e) a2.b();
            com.linecorp.linesdk.a.d dVar = eVar.f54977a;
            com.linecorp.linesdk.a.a.d dVar2 = c.this.f55023d;
            Uri build2 = dVar2.f54965b.buildUpon().appendPath("profile").build();
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("Authorization", "Bearer " + dVar.f54973a);
            com.linecorp.linesdk.a b2 = dVar2.f54966c.b(build2, hashMap2, Collections.emptyMap(), com.linecorp.linesdk.a.a.d.f54964a);
            if (!b2.a()) {
                return c.a(b2);
            }
            com.linecorp.linesdk.a.a aVar = c.this.f55025f;
            com.ss.android.ugc.aweme.bf.d.a(aVar.f54942a, aVar.f54943b, 0).edit().putString("accessToken", aVar.a(dVar.f54973a)).putString("expiresIn", aVar.a(dVar.f54974b)).putString("issuedClientTime", aVar.a(dVar.f54975c)).putString("refreshToken", aVar.a(dVar.f54976d)).apply();
            return new LineLoginResult((LineProfile) b2.b(), new LineCredential(new LineAccessToken(dVar.f54973a, dVar.f54974b, dVar.f54975c), eVar.f54978b));
        }

        /* synthetic */ a(c cVar, byte b2) {
            this();
        }
    }

    /* renamed from: com.linecorp.linesdk.auth.internal.c$c  reason: collision with other inner class name */
    class AsyncTaskC1251c extends AsyncTask<Void, Void, com.linecorp.linesdk.a<f>> {
        static {
            Covode.recordClassIndex(34546);
        }

        private AsyncTaskC1251c() {
        }

        private static Bundle a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ com.linecorp.linesdk.a<f> doInBackground(Void[] voidArr) {
            com.linecorp.linesdk.a.a.b bVar = c.this.f55022c;
            String str = c.this.f55021b.f54986a;
            Uri build = bVar.f54961f.buildUpon().appendPath("oauth").appendPath("otp").build();
            HashMap hashMap = new HashMap(1);
            hashMap.put("client_id", str);
            return bVar.f54962g.a(build, Collections.emptyMap(), hashMap, com.linecorp.linesdk.a.a.b.f54956a);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(com.linecorp.linesdk.a<f> aVar) {
            a.C1250a aVar2;
            b bVar;
            com.linecorp.linesdk.a<f> aVar3 = aVar;
            if (!aVar3.a()) {
                c.this.f55027h.f55034d = d.a.f55038d;
                c.this.f55020a.a(c.a(aVar3));
                return;
            }
            f b2 = aVar3.b();
            c.this.f55027h.f55031a = b2;
            try {
                a aVar4 = c.this.f55024e;
                LineAuthenticationActivity lineAuthenticationActivity = c.this.f55020a;
                LineAuthenticationConfig lineAuthenticationConfig = c.this.f55021b;
                String[] strArr = c.this.f55026g;
                byte[] bArr = new byte[8];
                long nextLong = new SecureRandom().nextLong();
                int i2 = 0;
                while (true) {
                    bArr[i2] = (byte) ((int) nextLong);
                    nextLong >>= 8;
                    i2++;
                    if (i2 >= 8) {
                        break;
                    }
                }
                String encodeToString = Base64.encodeToString(bArr, 11);
                aVar4.f55005b.f55033c = encodeToString;
                String str = "intent://result#Intent;package=" + lineAuthenticationActivity.getPackageName() + ";scheme=lineauth;end";
                Uri.Builder appendQueryParameter = lineAuthenticationConfig.f54988c.buildUpon().appendQueryParameter("response_type", "code").appendQueryParameter("client_id", lineAuthenticationConfig.f54986a).appendQueryParameter("state", encodeToString).appendQueryParameter("otpId", b2.f54979a).appendQueryParameter("redirect_uri", str);
                if (strArr != null && strArr.length > 0) {
                    appendQueryParameter.appendQueryParameter("scope", TextUtils.join(" ", strArr));
                }
                Uri build = appendQueryParameter.build();
                boolean z = lineAuthenticationConfig.f54989d;
                int i3 = Build.VERSION.SDK_INT;
                c.a aVar5 = new c.a();
                aVar5.f1778a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", androidx.core.content.b.c(lineAuthenticationActivity, 17170443));
                androidx.browser.a.c a2 = aVar5.a();
                Intent data = a2.f1776a.setData(build);
                Bundle bundle = a2.f1777b;
                b a3 = b.a(lineAuthenticationActivity);
                if (a3 == null) {
                    aVar2 = new a.C1250a(data, bundle, false);
                } else if (z || (bVar = a.f55004a) == null || (a3.f55017a == bVar.f55017a ? a3.f55018b == bVar.f55018b ? a3.f55019c < bVar.f55019c : a3.f55018b < bVar.f55018b : a3.f55017a < bVar.f55017a)) {
                    List<Intent> a4 = a.a(build, lineAuthenticationActivity.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0), a(data));
                    int size = a4.size();
                    if (size == 0) {
                        throw new ActivityNotFoundException("Activity for LINE log-in is not found. uri=".concat(String.valueOf(build)));
                    } else if (size == 1) {
                        aVar2 = new a.C1250a(a4.get(0), bundle, false);
                    } else {
                        Intent createChooser = Intent.createChooser(a4.remove(0), null);
                        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) a4.toArray(new Parcelable[a4.size()]));
                        aVar2 = new a.C1250a(createChooser, bundle, false);
                    }
                } else {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(build);
                    intent.setPackage("jp.naver.line.android");
                    aVar2 = new a.C1250a(intent, bundle, true);
                }
                a.b bVar2 = new a.b(aVar2.f55006a, aVar2.f55007b, str, aVar2.f55008c);
                if (bVar2.f55012d) {
                    int i4 = Build.VERSION.SDK_INT;
                    LineAuthenticationActivity lineAuthenticationActivity2 = c.this.f55020a;
                    Intent intent2 = bVar2.f55009a;
                    Bundle bundle2 = bVar2.f55010b;
                    com.ss.android.ugc.tiktok.security.a.a.a(intent2, lineAuthenticationActivity2);
                    lineAuthenticationActivity2.startActivity(intent2, bundle2);
                } else {
                    int i5 = Build.VERSION.SDK_INT;
                    c.this.f55020a.startActivityForResult(bVar2.f55009a, 3, bVar2.f55010b);
                }
                c.this.f55027h.f55032b = bVar2.f55011c;
            } catch (ActivityNotFoundException e2) {
                c.this.f55027h.f55034d = d.a.f55038d;
                c.this.f55020a.a(new LineLoginResult(com.linecorp.linesdk.b.INTERNAL_ERROR, new LineApiError(e2)));
            }
        }

        /* synthetic */ AsyncTaskC1251c(c cVar, byte b2) {
            this();
        }
    }

    private static Context a(LineAuthenticationActivity lineAuthenticationActivity) {
        Context applicationContext = lineAuthenticationActivity.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    static /* synthetic */ LineLoginResult a(com.linecorp.linesdk.a aVar) {
        return new LineLoginResult(aVar.f54939b, aVar.f54940c);
    }

    c(LineAuthenticationActivity lineAuthenticationActivity, LineAuthenticationConfig lineAuthenticationConfig, d dVar, String[] strArr) {
        this(lineAuthenticationActivity, lineAuthenticationConfig, new com.linecorp.linesdk.a.a.b(a(lineAuthenticationActivity), lineAuthenticationConfig.f54987b), new com.linecorp.linesdk.a.a.d(a(lineAuthenticationActivity), lineAuthenticationConfig.f54987b), new a(dVar), new com.linecorp.linesdk.a.a(a(lineAuthenticationActivity), lineAuthenticationConfig.f54986a), dVar, strArr);
    }

    private c(LineAuthenticationActivity lineAuthenticationActivity, LineAuthenticationConfig lineAuthenticationConfig, com.linecorp.linesdk.a.a.b bVar, com.linecorp.linesdk.a.a.d dVar, a aVar, com.linecorp.linesdk.a.a aVar2, d dVar2, String[] strArr) {
        this.f55020a = lineAuthenticationActivity;
        this.f55021b = lineAuthenticationConfig;
        this.f55022c = bVar;
        this.f55023d = dVar;
        this.f55024e = aVar;
        this.f55025f = aVar2;
        this.f55027h = dVar2;
        this.f55026g = strArr;
    }
}
