package com.ss.android.ugc.aweme.deeplink;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class d {

    /* renamed from: g  reason: collision with root package name */
    public static final a f79460g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, Map<String, Object>> f79461a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, Object> f79462b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public p f79463c = new p();

    /* renamed from: d  reason: collision with root package name */
    public final Activity f79464d;

    /* renamed from: e  reason: collision with root package name */
    public Uri f79465e;

    /* renamed from: f  reason: collision with root package name */
    public final Intent f79466f;

    static {
        Covode.recordClassIndex(49371);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f79464d, dVar.f79464d) && l.a(this.f79465e, dVar.f79465e) && l.a(this.f79466f, dVar.f79466f);
    }

    public final int hashCode() {
        Activity activity = this.f79464d;
        int i2 = 0;
        int hashCode = (activity != null ? activity.hashCode() : 0) * 31;
        Uri uri = this.f79465e;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Intent intent = this.f79466f;
        if (intent != null) {
            i2 = intent.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "DeepLinkData(activity=" + this.f79464d + ", originalUri=" + this.f79465e + ", appendedIntent=" + this.f79466f + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49372);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public d(Activity activity, Uri uri, Intent intent) {
        l.d(activity, "");
        l.d(uri, "");
        l.d(intent, "");
        this.f79464d = activity;
        this.f79465e = uri;
        this.f79466f = intent;
    }
}
