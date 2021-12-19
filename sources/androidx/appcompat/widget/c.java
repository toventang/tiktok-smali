package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Xml;
import com.bytedance.covode.number.Covode;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* access modifiers changed from: package-private */
public class c extends DataSetObservable {

    /* renamed from: a  reason: collision with root package name */
    static final String f1594a = c.class.getSimpleName();

    /* renamed from: g  reason: collision with root package name */
    private static final Object f1595g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private static final Map<String, c> f1596h = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    final Object f1597b;

    /* renamed from: c  reason: collision with root package name */
    final List<a> f1598c;

    /* renamed from: d  reason: collision with root package name */
    final Context f1599d;

    /* renamed from: e  reason: collision with root package name */
    final String f1600e;

    /* renamed from: f  reason: collision with root package name */
    boolean f1601f;

    /* renamed from: i  reason: collision with root package name */
    private final List<C0023c> f1602i;

    /* renamed from: j  reason: collision with root package name */
    private Intent f1603j;

    /* renamed from: k  reason: collision with root package name */
    private b f1604k;

    /* renamed from: l  reason: collision with root package name */
    private int f1605l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1606m;
    private boolean n;
    private boolean o;
    private d p;

    public interface b {
        static {
            Covode.recordClassIndex(485);
        }
    }

    public interface d {
        static {
            Covode.recordClassIndex(487);
        }

        boolean a();
    }

    public static final class a implements Comparable<a> {

        /* renamed from: a  reason: collision with root package name */
        public final ResolveInfo f1607a;

        /* renamed from: b  reason: collision with root package name */
        public float f1608b;

        static {
            Covode.recordClassIndex(484);
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f1608b) + 31;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("resolveInfo:").append(this.f1607a.toString());
            sb.append("; weight:").append(new BigDecimal((double) this.f1608b));
            sb.append("]");
            return sb.toString();
        }

        public a(ResolveInfo resolveInfo) {
            this.f1607a = resolveInfo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(a aVar) {
            return Float.floatToIntBits(aVar.f1608b) - Float.floatToIntBits(this.f1608b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass() && Float.floatToIntBits(this.f1608b) == Float.floatToIntBits(((a) obj).f1608b)) {
                return true;
            }
            return false;
        }
    }

    static {
        Covode.recordClassIndex(483);
    }

    private boolean g() {
        if (!this.f1601f || !this.n || TextUtils.isEmpty(this.f1600e)) {
            return false;
        }
        this.f1601f = false;
        this.f1606m = true;
        i();
        return true;
    }

    private void h() {
        int size = this.f1602i.size() - this.f1605l;
        if (size > 0) {
            this.n = true;
            int i2 = 0;
            do {
                this.f1602i.remove(0);
                i2++;
            } while (i2 < size);
        }
    }

    public final int a() {
        int size;
        synchronized (this.f1597b) {
            c();
            size = this.f1598c.size();
        }
        return size;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        boolean f2 = f() | g();
        h();
        if (f2) {
            e();
            notifyChanged();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    public static final class C0023c {

        /* renamed from: a  reason: collision with root package name */
        public final ComponentName f1609a;

        /* renamed from: b  reason: collision with root package name */
        public final long f1610b;

        /* renamed from: c  reason: collision with root package name */
        public final float f1611c;

        static {
            Covode.recordClassIndex(486);
        }

        public final int hashCode() {
            int hashCode;
            ComponentName componentName = this.f1609a;
            if (componentName == null) {
                hashCode = 0;
            } else {
                hashCode = componentName.hashCode();
            }
            long j2 = this.f1610b;
            return ((((hashCode + 31) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Float.floatToIntBits(this.f1611c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("; activity:").append(this.f1609a);
            sb.append("; time:").append(this.f1610b);
            sb.append("; weight:").append(new BigDecimal((double) this.f1611c));
            sb.append("]");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0023c cVar = (C0023c) obj;
            ComponentName componentName = this.f1609a;
            if (componentName == null) {
                if (cVar.f1609a != null) {
                    return false;
                }
            } else if (!componentName.equals(cVar.f1609a)) {
                return false;
            }
            if (this.f1610b == cVar.f1610b && Float.floatToIntBits(this.f1611c) == Float.floatToIntBits(cVar.f1611c)) {
                return true;
            }
            return false;
        }

        public C0023c(String str, long j2, float f2) {
            this(ComponentName.unflattenFromString(str), j2, f2);
        }

        public C0023c(ComponentName componentName, long j2, float f2) {
            this.f1609a = componentName;
            this.f1610b = j2;
            this.f1611c = f2;
        }
    }

    private void d() {
        if (!this.f1606m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.n) {
            this.n = false;
            if (!TextUtils.isEmpty(this.f1600e)) {
                new e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f1602i), this.f1600e);
            }
        }
    }

    private boolean e() {
        if (this.f1604k == null || this.f1603j == null || this.f1598c.isEmpty() || this.f1602i.isEmpty()) {
            return false;
        }
        Collections.unmodifiableList(this.f1602i);
        return true;
    }

    private boolean f() {
        if (!this.o || this.f1603j == null) {
            return false;
        }
        this.o = false;
        this.f1598c.clear();
        List<ResolveInfo> queryIntentActivities = this.f1599d.getPackageManager().queryIntentActivities(this.f1603j, 0);
        int size = queryIntentActivities.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1598c.add(new a(queryIntentActivities.get(i2)));
        }
        return true;
    }

    public final ResolveInfo b() {
        synchronized (this.f1597b) {
            c();
            if (this.f1598c.isEmpty()) {
                return null;
            }
            return this.f1598c.get(0).f1607a;
        }
    }

    private void i() {
        try {
            FileInputStream openFileInput = this.f1599d.openFileInput(this.f1600e);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                while (true) {
                    int next = newPullParser.next();
                    if (next == 1 || next == 2) {
                    }
                }
                if ("historical-records".equals(newPullParser.getName())) {
                    List<C0023c> list = this.f1602i;
                    list.clear();
                    while (true) {
                        int next2 = newPullParser.next();
                        if (next2 != 1) {
                            if (!(next2 == 3 || next2 == 4)) {
                                if ("historical-record".equals(newPullParser.getName())) {
                                    list.add(new C0023c(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                                } else {
                                    throw new XmlPullParserException("Share records file not well-formed.");
                                }
                            }
                        } else if (openFileInput != null) {
                            try {
                                openFileInput.close();
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
            } catch (XmlPullParserException unused2) {
                if (openFileInput != null) {
                    openFileInput.close();
                }
            } catch (IOException unused3) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused4) {
                    }
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused6) {
        }
    }

    /* access modifiers changed from: package-private */
    public final class e extends AsyncTask<Object, Void, Void> {
        static {
            Covode.recordClassIndex(488);
        }

        e() {
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006b, code lost:
            if (r5 != null) goto L_0x008d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
            if (r5 == null) goto L_0x0090;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
            if (r5 == null) goto L_0x0090;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
            if (r5 == null) goto L_0x0090;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
            r5.close();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
            // Method dump skipped, instructions count: 145
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.e.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    public final int a(ResolveInfo resolveInfo) {
        synchronized (this.f1597b) {
            c();
            List<a> list = this.f1598c;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (list.get(i2).f1607a == resolveInfo) {
                    return i2;
                }
            }
            return -1;
        }
    }

    public final ResolveInfo a(int i2) {
        ResolveInfo resolveInfo;
        synchronized (this.f1597b) {
            c();
            resolveInfo = this.f1598c.get(i2).f1607a;
        }
        return resolveInfo;
    }

    public final Intent b(int i2) {
        synchronized (this.f1597b) {
            if (this.f1603j == null) {
                return null;
            }
            c();
            a aVar = this.f1598c.get(i2);
            ComponentName componentName = new ComponentName(aVar.f1607a.activityInfo.packageName, aVar.f1607a.activityInfo.name);
            Intent intent = new Intent(this.f1603j);
            intent.setComponent(componentName);
            if (this.p != null) {
                new Intent(intent);
                if (this.p.a()) {
                    return null;
                }
            }
            a(new C0023c(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(C0023c cVar) {
        boolean add = this.f1602i.add(cVar);
        if (add) {
            this.n = true;
            h();
            d();
            e();
            notifyChanged();
        }
        return add;
    }
}
