package com.linecorp.linesdk.auth.internal;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.linecorp.linesdk.LineApiError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

final class a {

    /* renamed from: a  reason: collision with root package name */
    static final b f55004a = new b(6, 9, 0);

    /* renamed from: b  reason: collision with root package name */
    final d f55005b;

    static class c {

        /* renamed from: a  reason: collision with root package name */
        final String f55013a;

        /* renamed from: b  reason: collision with root package name */
        private final String f55014b;

        /* renamed from: c  reason: collision with root package name */
        private final String f55015c;

        /* renamed from: d  reason: collision with root package name */
        private final String f55016d;

        static {
            Covode.recordClassIndex(34541);
        }

        /* access modifiers changed from: package-private */
        public final boolean a() {
            if (!TextUtils.isEmpty(this.f55013a)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final boolean b() {
            if (!TextUtils.isEmpty(this.f55016d) || a()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public final LineApiError c() {
            if (!b()) {
                return new LineApiError(this.f55016d);
            }
            try {
                return new LineApiError(new JSONObject().putOpt("error", this.f55014b).putOpt("error_description", this.f55015c).toString());
            } catch (JSONException e2) {
                return new LineApiError(e2);
            }
        }

        static c a(String str) {
            return new c(null, null, null, str);
        }

        c(String str, String str2, String str3, String str4) {
            this.f55013a = str;
            this.f55014b = str2;
            this.f55015c = str3;
            this.f55016d = str4;
        }
    }

    static {
        Covode.recordClassIndex(34538);
    }

    a(d dVar) {
        this.f55005b = dVar;
    }

    /* renamed from: com.linecorp.linesdk.auth.internal.a$a  reason: collision with other inner class name */
    static class C1250a {

        /* renamed from: a  reason: collision with root package name */
        final Intent f55006a;

        /* renamed from: b  reason: collision with root package name */
        final Bundle f55007b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f55008c;

        static {
            Covode.recordClassIndex(34539);
        }

        C1250a(Intent intent, Bundle bundle, boolean z) {
            this.f55006a = intent;
            this.f55007b = bundle;
            this.f55008c = z;
        }
    }

    static List<Intent> a(Uri uri, Collection<ResolveInfo> collection, Bundle bundle) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (ResolveInfo resolveInfo : collection) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.setPackage(resolveInfo.activityInfo.packageName);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            arrayList.add(intent);
        }
        return arrayList;
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        final Intent f55009a;

        /* renamed from: b  reason: collision with root package name */
        final Bundle f55010b;

        /* renamed from: c  reason: collision with root package name */
        final String f55011c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f55012d;

        static {
            Covode.recordClassIndex(34540);
        }

        b(Intent intent, Bundle bundle, String str, boolean z) {
            this.f55009a = intent;
            this.f55010b = bundle;
            this.f55011c = str;
            this.f55012d = z;
        }
    }
}
