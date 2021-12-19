package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.facebook.j;
import com.facebook.l;
import com.facebook.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    private static final String f48699a = y.class.getName();

    /* renamed from: b  reason: collision with root package name */
    private static final List<e> f48700b = e();

    /* renamed from: c  reason: collision with root package name */
    private static final List<e> f48701c = f();

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, List<e>> f48702d = g();

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicBoolean f48703e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private static final List<Integer> f48704f = Arrays.asList(20170417, 20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101);

    /* access modifiers changed from: package-private */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        TreeSet<Integer> f48705a;

        static {
            Covode.recordClassIndex(29365);
        }

        /* access modifiers changed from: protected */
        public abstract String a();

        /* access modifiers changed from: protected */
        public abstract String b();

        private e() {
        }

        /* synthetic */ e(byte b2) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
            if (r0.isEmpty() == false) goto L_0x0013;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void a(boolean r2) {
            /*
                r1 = this;
                monitor-enter(r1)
                if (r2 != 0) goto L_0x000d
                java.util.TreeSet<java.lang.Integer> r0 = r1.f48705a     // Catch:{ all -> 0x0015 }
                if (r0 == 0) goto L_0x000d
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0015 }
                if (r0 == 0) goto L_0x0013
            L_0x000d:
                java.util.TreeSet r0 = com.facebook.internal.y.a(r1)     // Catch:{ all -> 0x0015 }
                r1.f48705a = r0     // Catch:{ all -> 0x0015 }
            L_0x0013:
                monitor-exit(r1)
                return
            L_0x0015:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.y.e.a(boolean):void");
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public e f48706a;

        /* renamed from: b  reason: collision with root package name */
        public int f48707b;

        static {
            Covode.recordClassIndex(29366);
        }

        f() {
        }

        public static f a() {
            f fVar = new f();
            fVar.f48707b = -1;
            return fVar;
        }
    }

    static /* synthetic */ TreeSet a(e eVar) {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return null;
        }
        try {
            return b(eVar);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    private static Intent a(e eVar, String str, Collection<String> collection, String str2, boolean z, com.facebook.login.b bVar, String str3, String str4, boolean z2) {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return null;
        }
        try {
            String b2 = eVar.b();
            if (b2 == null) {
                return null;
            }
            Intent putExtra = new Intent().setClassName(eVar.a(), b2).putExtra("client_id", str);
            putExtra.putExtra("facebook_sdk_version", "9.0.0");
            if (!ad.a(collection)) {
                putExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!ad.a(str2)) {
                putExtra.putExtra("e2e", str2);
            }
            putExtra.putExtra("state", str3);
            putExtra.putExtra("response_type", "token,signed_request,graph_domain");
            putExtra.putExtra("return_scopes", "true");
            if (z) {
                putExtra.putExtra("default_audience", bVar.getNativeProtocolAudience());
            }
            putExtra.putExtra("legacy_override", m.e());
            putExtra.putExtra("auth_type", str4);
            if (z2) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            return putExtra;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    public static List<Intent> a(String str, Collection<String> collection, String str2, boolean z, com.facebook.login.b bVar, String str3, String str4, boolean z2) {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (e eVar : f48700b) {
                Intent a2 = a(eVar, str, collection, str2, z, bVar, str3, str4, z2);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    public static boolean a(int i2) {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return false;
        }
        try {
            return f48704f.contains(Integer.valueOf(i2)) && i2 >= 20140701;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return false;
        }
    }

    public static UUID a(Intent intent) {
        String str;
        if (com.facebook.internal.a.b.a.a(y.class) || intent == null) {
            return null;
        }
        try {
            if (a(e(intent))) {
                Bundle a2 = a(intent, "com.facebook.platform.protocol.BRIDGE_ARGS");
                str = a2 != null ? a2.getString("action_id") : null;
            } else {
                str = b(intent, "com.facebook.platform.protocol.CALL_ID");
            }
            if (str == null) {
                return null;
            }
            try {
                return UUID.fromString(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    public static j a(Bundle bundle) {
        if (com.facebook.internal.a.b.a.a(y.class) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            if (string == null || !string.equalsIgnoreCase("UserCanceled")) {
                return new j(string2);
            }
            return new l(string2);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    public static Bundle a(j jVar) {
        if (com.facebook.internal.a.b.a.a(y.class) || jVar == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", jVar.toString());
            if (jVar instanceof l) {
                bundle.putString("error_type", "UserCanceled");
            }
            return bundle;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    public static f a(String str, int[] iArr) {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return null;
        }
        try {
            return a(f48702d.get(str), iArr);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    private static f a(List<e> list, int[] iArr) {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return null;
        }
        try {
            b();
            if (list == null) {
                return f.a();
            }
            for (e eVar : list) {
                if (eVar.f48705a == null || eVar.f48705a.isEmpty()) {
                    eVar.a(false);
                }
                int a2 = a(eVar.f48705a, a(), iArr);
                if (a2 != -1) {
                    f fVar = new f();
                    fVar.f48706a = eVar;
                    fVar.f48707b = a2;
                    return fVar;
                }
            }
            return f.a();
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    private static Bundle a(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        return bundleExtra;
    }

    public static void a(Intent intent, String str, String str2, int i2, Bundle bundle) {
        if (!com.facebook.internal.a.b.a.a(y.class)) {
            try {
                ae.a();
                String str3 = m.f48915a;
                ae.a();
                String str4 = m.f48916b;
                intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i2).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", str3);
                if (a(i2)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("action_id", str);
                    ad.a(bundle2, "app_name", str4);
                    intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle);
                    return;
                }
                intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
                if (!ad.a(str4)) {
                    intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", str4);
                }
                intent.putExtras(bundle);
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, y.class);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class a extends e {
        static {
            Covode.recordClassIndex(29361);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.y.e
        public final String a() {
            return "com.facebook.arstudio.player";
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.y.e
        public final String b() {
            return null;
        }

        private a() {
            super((byte) 0);
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    static class b extends e {
        static {
            Covode.recordClassIndex(29362);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.y.e
        public final String a() {
            return "com.facebook.lite";
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.y.e
        public final String b() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends e {
        static {
            Covode.recordClassIndex(29363);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.y.e
        public final String a() {
            return "com.facebook.katana";
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.y.e
        public final String b() {
            return "com.facebook.katana.ProxyAuth";
        }

        private c() {
            super((byte) 0);
        }

        /* synthetic */ c(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static class d extends e {
        static {
            Covode.recordClassIndex(29364);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.y.e
        public final String a() {
            return "com.facebook.orca";
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.y.e
        public final String b() {
            return null;
        }

        private d() {
            super((byte) 0);
        }

        /* synthetic */ d(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static class g extends e {
        static {
            Covode.recordClassIndex(29367);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.y.e
        public final String a() {
            return "com.facebook.wakizashi";
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.y.e
        public final String b() {
            return "com.facebook.katana.ProxyAuth";
        }

        private g() {
            super((byte) 0);
        }

        /* synthetic */ g(byte b2) {
            this();
        }
    }

    public static final int a() {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return 0;
        }
        try {
            return f48704f.get(0).intValue();
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return 0;
        }
    }

    static /* synthetic */ List c() {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return null;
        }
        try {
            return f48700b;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    static /* synthetic */ AtomicBoolean d() {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return null;
        }
        try {
            return f48703e;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    private static List<e> e() {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new c((byte) 0));
            arrayList.add(new g((byte) 0));
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    private static List<e> f() {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList(e());
            arrayList.add(0, new a((byte) 0));
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    private static Map<String, List<e>> g() {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new d((byte) 0));
            List<e> list = f48700b;
            hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f48701c);
            hashMap.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return hashMap;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    static {
        Covode.recordClassIndex(29359);
    }

    public static void b() {
        if (!com.facebook.internal.a.b.a.a(y.class)) {
            try {
                if (f48703e.compareAndSet(false, true)) {
                    m.c().execute(new Runnable() {
                        /* class com.facebook.internal.y.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(29360);
                        }

                        public final void run() {
                            if (!com.facebook.internal.a.b.a.a(this)) {
                                try {
                                    for (e eVar : y.c()) {
                                        eVar.a(true);
                                    }
                                    y.d().set(false);
                                } catch (Throwable th) {
                                    com.facebook.internal.a.b.a.a(th, this);
                                }
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, y.class);
            }
        }
    }

    private static Bundle g(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static int b(int i2) {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return 0;
        }
        try {
            return a(f48700b, new int[]{i2}).f48707b;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return 0;
        }
    }

    private static int e(Intent intent) {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return 0;
        }
        try {
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return 0;
        }
    }

    public static Intent a(Context context) {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return null;
        }
        try {
            for (e eVar : f48700b) {
                Intent b2 = b(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(eVar.a()).addCategory("android.intent.category.DEFAULT"));
                if (b2 != null) {
                    return b2;
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    private static Uri c(e eVar) {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return null;
        }
        try {
            return Uri.parse("content://" + eVar.a() + ".provider.PlatformProvider/versions");
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    public static Bundle d(Intent intent) {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return null;
        }
        try {
            if (!h(intent)) {
                return null;
            }
            Bundle f2 = f(intent);
            if (f2 != null) {
                return f2.getBundle("error");
            }
            return g(intent);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    private static Bundle f(Intent intent) {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return null;
        }
        try {
            if (!a(e(intent))) {
                return null;
            }
            return a(intent, "com.facebook.platform.protocol.BRIDGE_ARGS");
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    private static boolean h(Intent intent) {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return false;
        }
        try {
            Bundle f2 = f(intent);
            if (f2 != null) {
                return f2.containsKey("error");
            }
            return intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return false;
        }
    }

    public static Bundle b(Intent intent) {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return null;
        }
        try {
            if (!a(e(intent))) {
                return g(intent);
            }
            return a(intent, "com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    public static Bundle c(Intent intent) {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return null;
        }
        try {
            int e2 = e(intent);
            Bundle g2 = g(intent);
            if (!a(e2) || g2 == null) {
                return g2;
            }
            return g2.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.TreeSet<java.lang.Integer> b(com.facebook.internal.y.e r13) {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.y.b(com.facebook.internal.y$e):java.util.TreeSet");
    }

    private static String b(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Intent b(Context context, Intent intent) {
        if (com.facebook.internal.a.b.a.a(y.class) || intent == null) {
            return null;
        }
        try {
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null && m.a(context, resolveService.serviceInfo.packageName)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    private static Intent a(Context context, Intent intent) {
        if (com.facebook.internal.a.b.a.a(y.class) || intent == null) {
            return null;
        }
        try {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity != null && m.a(context, resolveActivity.activityInfo.packageName)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    private static int a(TreeSet<Integer> treeSet, int i2, int[] iArr) {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return 0;
        }
        try {
            int length = iArr.length - 1;
            Iterator<Integer> descendingIterator = treeSet.descendingIterator();
            int i3 = -1;
            while (true) {
                if (!descendingIterator.hasNext()) {
                    break;
                }
                int intValue = descendingIterator.next().intValue();
                i3 = Math.max(i3, intValue);
                while (length >= 0) {
                    if (iArr[length] > intValue) {
                        length--;
                    } else if (iArr[length] == intValue) {
                        if (length % 2 == 0) {
                            return Math.min(i3, i2);
                        }
                    }
                }
                return -1;
            }
            return -1;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return 0;
        }
    }

    public static Intent a(Intent intent, Bundle bundle, j jVar) {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return null;
        }
        try {
            UUID a2 = a(intent);
            if (a2 == null) {
                return null;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", e(intent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", a2.toString());
            if (jVar != null) {
                bundle2.putBundle("error", a(jVar));
            }
            intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent2;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    public static Intent a(Context context, String str, String str2, f fVar, Bundle bundle) {
        Intent a2;
        if (com.facebook.internal.a.b.a.a(y.class) || fVar == null) {
            return null;
        }
        try {
            e eVar = fVar.f48706a;
            if (eVar == null || (a2 = a(context, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(eVar.a()).addCategory("android.intent.category.DEFAULT"))) == null) {
                return null;
            }
            a(a2, str, str2, fVar.f48707b, bundle);
            return a2;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }

    public static Intent a(Context context, String str, Collection<String> collection, String str2, boolean z, com.facebook.login.b bVar, String str3, String str4) {
        if (com.facebook.internal.a.b.a.a(y.class)) {
            return null;
        }
        try {
            return a(context, a(new b((byte) 0), str, collection, str2, z, bVar, str3, str4, false));
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, y.class);
            return null;
        }
    }
}
