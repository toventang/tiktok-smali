package com.bytedance.ies.f;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.bf.d;
import java.util.Objects;
import java.util.Set;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static String f33816b = "default_app_sp";

    /* renamed from: c  reason: collision with root package name */
    private static LruCache<String, b> f33817c;

    /* renamed from: e  reason: collision with root package name */
    private static int f33818e = 3;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f33819a;

    /* renamed from: d  reason: collision with root package name */
    private SharedPreferences.Editor f33820d;

    public final void a() {
        SharedPreferences.Editor editor = this.f33820d;
        if (editor != null) {
            com.bytedance.common.utility.e.a.a(editor);
        }
    }

    static {
        Covode.recordClassIndex(20070);
    }

    private void b() {
        if (this.f33820d == null) {
            this.f33820d = this.f33819a.edit();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.f.b$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f33821a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 20071(0x4e67, float:2.8125E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.ies.f.b$a[] r0 = com.bytedance.ies.f.b.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.ies.f.b.AnonymousClass1.f33821a = r2
                com.bytedance.ies.f.b$a r0 = com.bytedance.ies.f.b.a.STRING     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.ies.f.b.AnonymousClass1.f33821a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.ies.f.b$a r0 = com.bytedance.ies.f.b.a.INTEGER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.ies.f.b.AnonymousClass1.f33821a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.ies.f.b$a r0 = com.bytedance.ies.f.b.a.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.ies.f.b.AnonymousClass1.f33821a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.ies.f.b$a r0 = com.bytedance.ies.f.b.a.FLOAT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.ies.f.b.AnonymousClass1.f33821a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.ies.f.b$a r0 = com.bytedance.ies.f.b.a.LONG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r2 = com.bytedance.ies.f.b.AnonymousClass1.f33821a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bytedance.ies.f.b$a r0 = com.bytedance.ies.f.b.a.STRING_SET     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r2 = com.bytedance.ies.f.b.AnonymousClass1.f33821a     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.bytedance.ies.f.b$a r0 = com.bytedance.ies.f.b.a.ALL     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r0 = 7
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.f.b.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public enum a {
        STRING,
        INTEGER,
        BOOLEAN,
        FLOAT,
        LONG,
        STRING_SET,
        ALL;

        static {
            Covode.recordClassIndex(20072);
        }
    }

    public final void b(String str, Object obj) {
        a(str, obj);
        a();
    }

    private b(Context context, String str) {
        this.f33819a = d.a(context, str, 0);
    }

    public final String a(String str, String str2) {
        return (String) a(str, a.STRING, str2);
    }

    public final int a(String str, int i2) {
        return ((Integer) a(str, a.INTEGER, Integer.valueOf(i2))).intValue();
    }

    public static b a(Context context, String str) {
        Objects.requireNonNull(context, "null context!!");
        if (f33817c == null) {
            f33817c = new LruCache<>(f33818e);
        }
        b bVar = f33817c.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(context, str);
        f33817c.put(str, bVar2);
        return bVar2;
    }

    public final long a(String str, long j2) {
        return ((Long) a(str, a.LONG, Long.valueOf(j2))).longValue();
    }

    public final b a(String str, Object obj) {
        b();
        if (obj instanceof String) {
            this.f33820d.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            this.f33820d.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            this.f33820d.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            this.f33820d.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            this.f33820d.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Set) {
            this.f33820d.putStringSet(str, (Set) obj);
        } else {
            this.f33820d.putString(str, String.valueOf(obj));
        }
        return this;
    }

    public final boolean a(String str, boolean z) {
        return ((Boolean) a(str, a.BOOLEAN, Boolean.valueOf(z))).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    private <T> T a(String str, a aVar, Object obj) {
        switch (AnonymousClass1.f33821a[aVar.ordinal()]) {
            case 1:
                return (T) this.f33819a.getString(str, (String) obj);
            case 2:
                return (T) Integer.valueOf(this.f33819a.getInt(str, ((Integer) obj).intValue()));
            case 3:
                return (T) Boolean.valueOf(this.f33819a.getBoolean(str, ((Boolean) obj).booleanValue()));
            case 4:
                return (T) Float.valueOf(this.f33819a.getFloat(str, ((Float) obj).floatValue()));
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return (T) Long.valueOf(this.f33819a.getLong(str, ((Long) obj).longValue()));
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return (T) this.f33819a.getStringSet(str, (Set) obj);
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return (T) this.f33819a.getAll();
            default:
                return obj;
        }
    }
}
