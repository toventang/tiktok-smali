package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.c.c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.kx;
import com.google.android.gms.internal.measurement.mp;
import com.google.android.gms.internal.measurement.pb;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.bf.d;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

public final class jz extends fy {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f51971a = {"firebase_", "google_", "ga_"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f51972b = {"_err"};

    /* renamed from: c  reason: collision with root package name */
    private SecureRandom f51973c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicLong f51974d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    private int f51975e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f51976f;

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.fy
    public final boolean d() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    static boolean a(String str) {
        r.a(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e2) {
            q().f51471f.a("Install referrer url isn't a hierarchical URI", e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, String str2) {
        if (str2 == null) {
            q().f51470e.a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            q().f51470e.a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                q().f51470e.a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    q().f51470e.a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(String str, String str2) {
        if (str2 == null) {
            q().f51470e.a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            q().f51470e.a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        q().f51470e.a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            q().f51470e.a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, String[] strArr, String str2) {
        if (str2 == null) {
            q().f51470e.a("Name is required and can't be null. Type", str);
            return false;
        }
        r.a((Object) str2);
        for (String str3 : f51971a) {
            if (str2.startsWith(str3)) {
                q().f51470e.a("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !a(str2, strArr)) {
            return true;
        }
        q().f51470e.a("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, int i2, String str2) {
        if (str2 == null) {
            q().f51470e.a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i2) {
            return true;
        } else {
            q().f51470e.a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
            return false;
        }
    }

    static boolean a(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, String str2, int i2, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i2) {
                q().f51473h.a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    static boolean a(Bundle bundle, int i2) {
        int i3 = 0;
        if (bundle.size() <= i2) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i3++;
            if (i3 > i2) {
                bundle.remove(str);
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        if (r1 != 0) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.lang.String r22, java.lang.String r23, java.lang.String r24, android.os.Bundle r25, java.util.List<java.lang.String> r26, boolean r27) {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.jz.a(java.lang.String, java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            mp.b();
            if (s().d(null, p.ao) && !TextUtils.isEmpty(str3)) {
                return true;
            }
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(this.z.f51596a)) {
                    q().f51470e.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (j(str2)) {
                return true;
            } else {
                q().f51470e.a("Invalid admob_app_id. Analytics disabled.", eb.a(str2));
                return false;
            }
        } else if (j(str)) {
            return true;
        } else {
            if (TextUtils.isEmpty(this.z.f51596a)) {
                q().f51470e.a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", eb.a(str));
            }
            return false;
        }
    }

    static boolean a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (isEmpty) {
            return isEmpty2 ? (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4) : TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (!isEmpty2) {
            return !str.equals(str2);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* access modifiers changed from: package-private */
    public final Object a(String str, Object obj) {
        int i2 = 256;
        if ("_ev".equals(str)) {
            return a(256, obj, true, true);
        }
        if (!e(str)) {
            i2 = 100;
        }
        return a(i2, obj, false, true);
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(String str, String str2, Bundle bundle, List<String> list, boolean z, boolean z2) {
        Set<String> keySet;
        int i2;
        boolean z3 = z2;
        jz jzVar = this;
        kx.b();
        String str3 = null;
        boolean d2 = s().d(null, p.aI);
        if (d2) {
            z3 = a(str2, ge.f51671c);
        }
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int d3 = s().d();
        if (s().d(str, p.ab)) {
            keySet = new TreeSet<>(bundle.keySet());
        } else {
            keySet = bundle.keySet();
        }
        int i3 = 0;
        for (String str4 : keySet) {
            if ((list == null || !list.contains(str4)) && ((z && (i2 = jzVar.h(str4)) != 0) || (i2 = jzVar.i(str4)) != 0)) {
                if (i2 == 3) {
                    str3 = str4;
                }
                a(bundle2, i2, str4, str3);
                bundle2.remove(str4);
            } else {
                int a2 = a(str, str2, str4, a(bundle, str4), bundle2, list, z, z3);
                if (d2 && a2 == 17) {
                    a(bundle2, a2, str4, (Object) false);
                } else if (a2 != 0 && !"_ev".equals(str4)) {
                    a(bundle2, a2, a2 == 21 ? str2 : str4, a(bundle, str4));
                    bundle2.remove(str4);
                }
                if (a(str4) && (i3 = i3 + 1) > d3) {
                    q().f51470e.a(new StringBuilder(48).append("Event can't contain more than ").append(d3).append(" params").toString(), n().a(str2), n().a(bundle));
                    b(bundle2, 5);
                    bundle2.remove(str4);
                }
            }
            str3 = null;
            jzVar = this;
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    public final void a(eg egVar, int i2) {
        int i3 = 0;
        for (String str : new TreeSet(egVar.f51498b.keySet())) {
            if (a(str) && (i3 = i3 + 1) > i2) {
                q().f51470e.a(new StringBuilder(48).append("Event can't contain more than ").append(i2).append(" params").toString(), n().a(egVar.f51497a), n().a(egVar.f51498b));
                b(egVar.f51498b, 5);
                egVar.f51498b.remove(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    o().a(bundle, str, a(bundle2, str));
                }
            }
        }
    }

    private static void a(Bundle bundle, int i2, String str, Object obj) {
        if (b(bundle, i2)) {
            bundle.putString("_ev", a(str, 40, true));
            if (obj != null) {
                r.a(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int b(String str, Object obj) {
        boolean a2;
        if ("_ldl".equals(str)) {
            a2 = a("user property referrer", str, k(str), obj);
        } else {
            a2 = a("user property", str, k(str), obj);
        }
        return a2 ? 0 : 7;
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else {
                kx.b();
                String str2 = null;
                if (s().d(null, p.aH) && s().d(null, p.aG) && (obj instanceof Bundle[])) {
                    bundle.putParcelableArray(str, (Bundle[]) obj);
                } else if (str != null) {
                    if (obj != null) {
                        str2 = obj.getClass().getSimpleName();
                    }
                    q().f51473h.a("Not putting event parameter. Invalid value type. name, type", n().b(str), str2);
                }
            }
        }
    }

    public final void a(int i2, String str, String str2, int i3) {
        b(i2, str, str2, i3);
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2, String str, String str2, int i3) {
        Bundle bundle = new Bundle();
        b(bundle, i2);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            bundle.putString(str, str2);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", (long) i3);
        }
        this.z.t();
        this.z.d().a("auto", "_err", bundle);
    }

    static boolean a(Context context) {
        r.a(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return b(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return b(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a2 = a(str, a(bundle, str));
                if (a2 == null) {
                    q().f51473h.a("Param value can't be null", n().b(str));
                } else {
                    a(bundle2, str, a2);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    public final zzao a(String str, String str2, Bundle bundle, String str3, long j2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (b(str2) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str3);
            return new zzao(str2, new zzan(a(a(str, str2, bundle2, Collections.singletonList("_o"), false, false))), str3, j2);
        }
        q().f51468c.a("Invalid conditional property event name", n().c(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public final long a(Context context, String str) {
        c();
        r.a(context);
        r.a(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest h2 = h();
        if (h2 == null) {
            q().f51468c.a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!c(context, str)) {
                    PackageInfo b2 = c.f50295a.a(context).b(m().getPackageName(), 64);
                    if (b2.signatures != null && b2.signatures.length > 0) {
                        return a(h2.digest(b2.signatures[0].toByteArray()));
                    }
                    q().f51471f.a("Could not get signatures");
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                q().f51468c.a("Package name not found", e2);
            }
        }
        return 0;
    }

    static byte[] a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    private static boolean a(String str, String[] strArr) {
        r.a(strArr);
        for (String str2 : strArr) {
            if (c(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            q().f51471f.a("Params already contained engagement", Long.valueOf(j3));
        }
        bundle.putLong("_et", j2 + j3);
    }

    public final void a(pb pbVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            pbVar.a(bundle);
        } catch (RemoteException e2) {
            this.z.q().f51471f.a("Error returning string value to wrapper", e2);
        }
    }

    public final void a(pb pbVar, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            pbVar.a(bundle);
        } catch (RemoteException e2) {
            this.z.q().f51471f.a("Error returning long value to wrapper", e2);
        }
    }

    public final void a(pb pbVar, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            pbVar.a(bundle);
        } catch (RemoteException e2) {
            this.z.q().f51471f.a("Error returning int value to wrapper", e2);
        }
    }

    public final void a(pb pbVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            pbVar.a(bundle);
        } catch (RemoteException e2) {
            this.z.q().f51471f.a("Error returning byte array to wrapper", e2);
        }
    }

    public final void a(pb pbVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            pbVar.a(bundle);
        } catch (RemoteException e2) {
            this.z.q().f51471f.a("Error returning boolean value to wrapper", e2);
        }
    }

    public final void a(pb pbVar, Bundle bundle) {
        try {
            pbVar.a(bundle);
        } catch (RemoteException e2) {
            this.z.q().f51471f.a("Error returning bundle value to wrapper", e2);
        }
    }

    public final void a(pb pbVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            pbVar.a(bundle);
        } catch (RemoteException e2) {
            this.z.q().f51471f.a("Error returning bundle list to wrapper", e2);
        }
    }

    public final URL a(String str, String str2, long j2) {
        try {
            r.a(str2);
            r.a(str);
            String a2 = a.a("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{a.a("v%s.%s", new Object[]{31000L, Integer.valueOf(i())}), str2, str, Long.valueOf(j2)});
            if (str.equals(s().a("debug.deferred.deeplink", ""))) {
                a2 = a2.concat("&ddl_test=1");
            }
            return new URL(a2);
        } catch (IllegalArgumentException | MalformedURLException e2) {
            q().f51468c.a("Failed to create BOW URL for Deferred Deep Link. exception", e2.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, double d2) {
        try {
            SharedPreferences.Editor edit = d.a(m(), "google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d2));
            return edit.commit();
        } catch (Exception e2) {
            q().f51468c.a("Failed to persist Deferred Deep Link. exception", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ j k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ e l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ dz n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ jz o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ ex p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ eb q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ em r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ km s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ kl t() {
        return super.t();
    }

    static {
        Covode.recordClassIndex(32356);
    }

    public final int j() {
        return com.google.android.gms.common.c.getInstance().isGooglePlayServicesAvailable(m(), 12451000);
    }

    /* access modifiers changed from: package-private */
    public final String u() {
        byte[] bArr = new byte[16];
        g().nextBytes(bArr);
        return a.a(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final boolean v() {
        try {
            m().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    static MessageDigest h() {
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.fy
    public final void M_() {
        c();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                q().f51471f.a("Utils falling back to Random for random id");
            }
        }
        this.f51974d.set(nextLong);
    }

    /* access modifiers changed from: package-private */
    public final SecureRandom g() {
        c();
        if (this.f51973c == null) {
            this.f51973c = new SecureRandom();
        }
        return this.f51973c;
    }

    public final int i() {
        if (this.f51976f == null) {
            this.f51976f = Integer.valueOf(com.google.android.gms.common.c.getInstance().getApkVersion(m()) / 1000);
        }
        return this.f51976f.intValue();
    }

    public final long f() {
        long andIncrement;
        long j2;
        MethodCollector.i(8287);
        if (this.f51974d.get() == 0) {
            synchronized (this.f51974d) {
                try {
                    long nextLong = new Random(System.nanoTime() ^ l().a()).nextLong();
                    int i2 = this.f51975e + 1;
                    this.f51975e = i2;
                    j2 = nextLong + ((long) i2);
                } finally {
                    MethodCollector.o(8287);
                }
            }
            return j2;
        }
        synchronized (this.f51974d) {
            try {
                this.f51974d.compareAndSet(-1, 1);
                andIncrement = this.f51974d.getAndIncrement();
            } finally {
                MethodCollector.o(8287);
            }
        }
        return andIncrement;
    }

    jz(ff ffVar) {
        super(ffVar);
    }

    private static boolean j(String str) {
        r.a((Object) str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    static boolean e(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("_")) {
            return false;
        }
        return true;
    }

    public static boolean g(String str) {
        for (String str2 : f51972b) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final int h(String str) {
        if (!a("event param", str)) {
            return 3;
        }
        if (!a("event param", (String[]) null, str)) {
            return 14;
        }
        if (!a("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    private final int i(String str) {
        if (!b("event param", str)) {
            return 3;
        }
        if (!a("event param", (String[]) null, str)) {
            return 14;
        }
        if (!a("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int c(String str) {
        if (!b("user property", str)) {
            return 6;
        }
        if (!a("user property", gg.f51672a, str)) {
            return 15;
        }
        if (!a("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String u = s().u();
        t();
        return u.equals(str);
    }

    public static long a(zzan zzan) {
        long j2 = 0;
        if (zzan == null) {
            return 0;
        }
        Iterator<String> it = zzan.iterator();
        while (it.hasNext()) {
            Object a2 = zzan.a(it.next());
            if (a2 instanceof Parcelable[]) {
                j2 += (long) ((Parcelable[]) a2).length;
            }
        }
        return j2;
    }

    private final int k(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        if (!s().d(null, p.al) || !"_lgclid".equals(str)) {
            return 36;
        }
        return 100;
    }

    /* access modifiers changed from: package-private */
    public final boolean d(String str) {
        c();
        if (c.f50295a.a(m()).a(str) == 0) {
            return true;
        }
        q().f51475j.a("Permission not granted", str);
        return false;
    }

    static long a(byte[] bArr) {
        boolean z;
        r.a(bArr);
        int i2 = 0;
        if (bArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        r.a(z);
        long j2 = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j2 += (((long) bArr[length]) & 255) << i2;
            i2 += 8;
            length--;
        }
        return j2;
    }

    public static Bundle b(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object a2 = a(bundle2, str);
            if (a2 instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) a2));
            } else {
                int i2 = 0;
                if (a2 instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) a2;
                    while (i2 < parcelableArr.length) {
                        if (parcelableArr[i2] instanceof Bundle) {
                            parcelableArr[i2] = new Bundle((Bundle) parcelableArr[i2]);
                        }
                        i2++;
                    }
                } else if (a2 instanceof List) {
                    List list = (List) a2;
                    while (i2 < list.size()) {
                        Object obj = list.get(i2);
                        if (obj instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj));
                        }
                        i2++;
                    }
                }
            }
        }
        return bundle2;
    }

    public static Bundle a(List<zzkr> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (zzkr zzkr : list) {
            if (zzkr.f52068d != null) {
                bundle.putString(zzkr.f52065a, zzkr.f52068d);
            } else if (zzkr.f52067c != null) {
                bundle.putLong(zzkr.f52065a, zzkr.f52067c.longValue());
            } else if (zzkr.f52070f != null) {
                bundle.putDouble(zzkr.f52065a, zzkr.f52070f.doubleValue());
            }
        }
        return bundle;
    }

    public static ArrayList<Bundle> b(List<zzw> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzw zzw : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzw.f52086a);
            bundle.putString("origin", zzw.f52087b);
            bundle.putLong("creation_timestamp", zzw.f52089d);
            bundle.putString(StringSet.name, zzw.f52088c.f52065a);
            ga.a(bundle, zzw.f52088c.a());
            bundle.putBoolean("active", zzw.f52090e);
            if (zzw.f52091f != null) {
                bundle.putString("trigger_event_name", zzw.f52091f);
            }
            if (zzw.f52092g != null) {
                bundle.putString("timed_out_event_name", zzw.f52092g.f52061a);
                if (zzw.f52092g.f52062b != null) {
                    bundle.putBundle("timed_out_event_params", zzw.f52092g.f52062b.a());
                }
            }
            bundle.putLong("trigger_timeout", zzw.f52093h);
            if (zzw.f52094i != null) {
                bundle.putString("triggered_event_name", zzw.f52094i.f52061a);
                if (zzw.f52094i.f52062b != null) {
                    bundle.putBundle("triggered_event_params", zzw.f52094i.f52062b.a());
                }
            }
            bundle.putLong("triggered_timestamp", zzw.f52088c.f52066b);
            bundle.putLong("time_to_live", zzw.f52095j);
            if (zzw.f52096k != null) {
                bundle.putString("expired_event_name", zzw.f52096k.f52061a);
                if (zzw.f52096k.f52062b != null) {
                    bundle.putBundle("expired_event_params", zzw.f52096k.f52062b.a());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: android.os.Bundle[] */
    /* JADX WARN: Multi-variable type inference failed */
    static Bundle[] b(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* access modifiers changed from: package-private */
    public final int b(String str) {
        if (!b("event", str)) {
            return 2;
        }
        if (!a("event", ge.f51669a, str)) {
            return 13;
        }
        if (!a("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public static long a(long j2, long j3) {
        return (j2 + (j3 * 60000)) / 86400000;
    }

    static boolean c(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean b(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private static boolean b(Bundle bundle, int i2) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Object c(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return a(k(str), obj, true, false);
        }
        return a(k(str), obj, false, false);
    }

    private final boolean c(Context context, String str) {
        MethodCollector.i(8484);
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b2 = c.f50295a.a(context).b(str, 64);
            if (!(b2 == null || b2.signatures == null || b2.signatures.length <= 0)) {
                boolean equals = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b2.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
                MethodCollector.o(8484);
                return equals;
            }
        } catch (CertificateException e2) {
            q().f51468c.a("Error obtaining certificate", e2);
        } catch (PackageManager.NameNotFoundException e3) {
            q().f51468c.a("Package name not found", e3);
        }
        MethodCollector.o(8484);
        return true;
    }

    public static String a(String str, int i2, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i2) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i2))).concat("...");
        }
        return null;
    }

    private final boolean b(String str, String str2, int i2, Object obj) {
        int size;
        if (obj instanceof Parcelable[]) {
            size = ((Parcelable[]) obj).length;
        } else {
            if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            }
            return true;
        }
        if (size > i2) {
            q().f51473h.a("Parameter array is too long; discarded. Value kind, name, array length", str, str2, Integer.valueOf(size));
            return false;
        }
        return true;
    }

    private final Object a(int i2, Object obj, boolean z, boolean z2) {
        long j2;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            return Long.valueOf(j2);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return a(String.valueOf(obj), i2, z);
            }
            kx.b();
            if (!s().d(null, p.aH) || !s().d(null, p.aG) || !z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable instanceof Bundle) {
                    Bundle a2 = a((Bundle) parcelable);
                    if (!a2.isEmpty()) {
                        arrayList.add(a2);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ad A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.Object r24, android.os.Bundle r25, java.util.List<java.lang.String> r26, boolean r27, boolean r28) {
        /*
        // Method dump skipped, instructions count: 325
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.jz.a(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }
}
