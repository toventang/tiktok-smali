package com.ss.android.ugc.tiktok.deeplink.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tiktok.deeplink.b;
import h.q;
import h.r;
import h.z;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f148998a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(98116);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.tiktok.deeplink.a f148999a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f149000b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f149001c;

        static {
            Covode.recordClassIndex(98117);
        }

        a(com.ss.android.ugc.tiktok.deeplink.a aVar, boolean z, b bVar) {
            this.f148999a = aVar;
            this.f149000b = z;
            this.f149001c = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public q<? extends z> call() {
            Object obj;
            try {
                Uri uri = this.f148999a.f148971a;
                z zVar = null;
                if (uri != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("scheme", uri.getScheme());
                    jSONObject.put("host", uri.getHost());
                    jSONObject.put("uri", uri);
                    if (TextUtils.isEmpty(uri.getPath())) {
                        jSONObject.put("schema", uri.getScheme() + "://" + uri.getHost());
                    } else {
                        jSONObject.put("schema", uri.getScheme() + "://" + uri.getHost() + '/' + uri.getPath());
                        jSONObject.put("path", uri.getPath());
                    }
                    jSONObject.put("intercepted", this.f149000b);
                    jSONObject.put("allow", this.f149001c.f148981i);
                    com.bytedance.apm.b.a("monitor_deeplink_intercept", jSONObject, (JSONObject) null, (JSONObject) null);
                    zVar = z.f158842a;
                }
                obj = q.m223constructorimpl(zVar);
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            return q.m222boximpl(obj);
        }
    }

    static boolean a(String str, String str2) {
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Exception unused) {
            return false;
        }
    }
}
