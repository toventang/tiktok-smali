package androidx.room.b;

import android.database.Cursor;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f4250a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f4251b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b> f4252c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<C0061d> f4253d;

    static {
        Covode.recordClassIndex(1645);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f4254a;

        /* renamed from: b  reason: collision with root package name */
        public final String f4255b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4256c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f4257d;

        /* renamed from: e  reason: collision with root package name */
        public final int f4258e;

        static {
            Covode.recordClassIndex(1646);
        }

        private boolean a() {
            if (this.f4258e > 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i2;
            int hashCode = ((this.f4254a.hashCode() * 31) + this.f4256c) * 31;
            if (this.f4257d) {
                i2 = 1231;
            } else {
                i2 = 1237;
            }
            return ((hashCode + i2) * 31) + this.f4258e;
        }

        public final String toString() {
            return "Column{name='" + this.f4254a + '\'' + ", type='" + this.f4255b + '\'' + ", affinity='" + this.f4256c + '\'' + ", notNull=" + this.f4257d + ", primaryKeyPosition=" + this.f4258e + '}';
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (Build.VERSION.SDK_INT >= 20) {
                    if (this.f4258e != aVar.f4258e) {
                        return false;
                    }
                } else if (a() != aVar.a()) {
                    return false;
                }
                if (this.f4254a.equals(aVar.f4254a) && this.f4257d == aVar.f4257d && this.f4256c == aVar.f4256c) {
                    return true;
                }
            }
            return false;
        }

        public a(String str, String str2, boolean z, int i2) {
            this.f4254a = str;
            this.f4255b = str2;
            this.f4257d = z;
            this.f4258e = i2;
            int i3 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i3 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i3 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.f4256c = i3;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f4259a;

        /* renamed from: b  reason: collision with root package name */
        public final String f4260b;

        /* renamed from: c  reason: collision with root package name */
        public final String f4261c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f4262d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f4263e;

        static {
            Covode.recordClassIndex(1647);
        }

        public final int hashCode() {
            return (((((((this.f4259a.hashCode() * 31) + this.f4260b.hashCode()) * 31) + this.f4261c.hashCode()) * 31) + this.f4262d.hashCode()) * 31) + this.f4263e.hashCode();
        }

        public final String toString() {
            return "ForeignKey{referenceTable='" + this.f4259a + '\'' + ", onDelete='" + this.f4260b + '\'' + ", onUpdate='" + this.f4261c + '\'' + ", columnNames=" + this.f4262d + ", referenceColumnNames=" + this.f4263e + '}';
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f4259a.equals(bVar.f4259a) && this.f4260b.equals(bVar.f4260b) && this.f4261c.equals(bVar.f4261c) && this.f4262d.equals(bVar.f4262d)) {
                return this.f4263e.equals(bVar.f4263e);
            }
            return false;
        }

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f4259a = str;
            this.f4260b = str2;
            this.f4261c = str3;
            this.f4262d = Collections.unmodifiableList(list);
            this.f4263e = Collections.unmodifiableList(list2);
        }
    }

    /* renamed from: androidx.room.b.d$d  reason: collision with other inner class name */
    public static class C0061d {

        /* renamed from: a  reason: collision with root package name */
        public final String f4268a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f4269b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f4270c;

        static {
            Covode.recordClassIndex(1649);
        }

        public final int hashCode() {
            int hashCode;
            if (this.f4268a.startsWith("index_")) {
                hashCode = -1184239155;
            } else {
                hashCode = this.f4268a.hashCode();
            }
            return (((hashCode * 31) + (this.f4269b ? 1 : 0)) * 31) + this.f4270c.hashCode();
        }

        public final String toString() {
            return "Index{name='" + this.f4268a + '\'' + ", unique=" + this.f4269b + ", columns=" + this.f4270c + '}';
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0061d dVar = (C0061d) obj;
            if (this.f4269b != dVar.f4269b || !this.f4270c.equals(dVar.f4270c)) {
                return false;
            }
            if (this.f4268a.startsWith("index_")) {
                return dVar.f4268a.startsWith("index_");
            }
            return this.f4268a.equals(dVar.f4268a);
        }

        public C0061d(String str, boolean z, List<String> list) {
            this.f4268a = str;
            this.f4269b = z;
            this.f4270c = list;
        }
    }

    public final int hashCode() {
        int i2;
        int i3;
        String str = this.f4250a;
        int i4 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = i2 * 31;
        Map<String, a> map = this.f4251b;
        if (map != null) {
            i3 = map.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        Set<b> set = this.f4252c;
        if (set != null) {
            i4 = set.hashCode();
        }
        return i6 + i4;
    }

    public final String toString() {
        return "TableInfo{name='" + this.f4250a + '\'' + ", columns=" + this.f4251b + ", foreignKeys=" + this.f4252c + ", indices=" + this.f4253d + '}';
    }

    /* access modifiers changed from: package-private */
    public static class c implements Comparable<c> {

        /* renamed from: a  reason: collision with root package name */
        final int f4264a;

        /* renamed from: b  reason: collision with root package name */
        final int f4265b;

        /* renamed from: c  reason: collision with root package name */
        final String f4266c;

        /* renamed from: d  reason: collision with root package name */
        final String f4267d;

        static {
            Covode.recordClassIndex(1648);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(c cVar) {
            c cVar2 = cVar;
            int i2 = this.f4264a - cVar2.f4264a;
            if (i2 == 0) {
                return this.f4265b - cVar2.f4265b;
            }
            return i2;
        }

        c(int i2, int i3, String str, String str2) {
            this.f4264a = i2;
            this.f4265b = i3;
            this.f4266c = str;
            this.f4267d = str2;
        }
    }

    public final boolean equals(Object obj) {
        Set<C0061d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f4250a;
        if (str == null ? dVar.f4250a != null : !str.equals(dVar.f4250a)) {
            return false;
        }
        Map<String, a> map = this.f4251b;
        if (map == null ? dVar.f4251b != null : !map.equals(dVar.f4251b)) {
            return false;
        }
        Set<b> set2 = this.f4252c;
        if (set2 == null ? dVar.f4252c != null : !set2.equals(dVar.f4252c)) {
            return false;
        }
        Set<C0061d> set3 = this.f4253d;
        if (set3 == null || (set = dVar.f4253d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    private static List<c> a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < count; i2++) {
            cursor.moveToPosition(i2);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static d a(androidx.i.a.b bVar, String str) {
        return new d(str, c(bVar, str), b(bVar, str), d(bVar, str));
    }

    private static Map<String, a> c(androidx.i.a.b bVar, String str) {
        boolean z;
        Cursor b2 = bVar.b("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (b2.getColumnCount() > 0) {
                int columnIndex = b2.getColumnIndex(StringSet.name);
                int columnIndex2 = b2.getColumnIndex(StringSet.type);
                int columnIndex3 = b2.getColumnIndex("notnull");
                int columnIndex4 = b2.getColumnIndex("pk");
                while (b2.moveToNext()) {
                    String string = b2.getString(columnIndex);
                    String string2 = b2.getString(columnIndex2);
                    if (b2.getInt(columnIndex3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hashMap.put(string, new a(string, string2, z, b2.getInt(columnIndex4)));
                }
            }
            return hashMap;
        } finally {
            b2.close();
        }
    }

    private static Set<C0061d> d(androidx.i.a.b bVar, String str) {
        Cursor b2 = bVar.b("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = b2.getColumnIndex(StringSet.name);
            int columnIndex2 = b2.getColumnIndex("origin");
            int columnIndex3 = b2.getColumnIndex("unique");
            if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1) {
                return null;
            }
            HashSet hashSet = new HashSet();
            while (b2.moveToNext()) {
                if ("c".equals(b2.getString(columnIndex2))) {
                    String string = b2.getString(columnIndex);
                    boolean z = true;
                    if (b2.getInt(columnIndex3) != 1) {
                        z = false;
                    }
                    C0061d a2 = a(bVar, string, z);
                    if (a2 == null) {
                        b2.close();
                        return null;
                    }
                    hashSet.add(a2);
                }
            }
            b2.close();
            return hashSet;
        } finally {
            b2.close();
        }
    }

    private static Set<b> b(androidx.i.a.b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor b2 = bVar.b("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = b2.getColumnIndex("id");
            int columnIndex2 = b2.getColumnIndex("seq");
            int columnIndex3 = b2.getColumnIndex("table");
            int columnIndex4 = b2.getColumnIndex("on_delete");
            int columnIndex5 = b2.getColumnIndex("on_update");
            List<c> a2 = a(b2);
            int count = b2.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                b2.moveToPosition(i2);
                if (b2.getInt(columnIndex2) == 0) {
                    int i3 = b2.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : a2) {
                        if (cVar.f4264a == i3) {
                            arrayList.add(cVar.f4266c);
                            arrayList2.add(cVar.f4267d);
                        }
                    }
                    hashSet.add(new b(b2.getString(columnIndex3), b2.getString(columnIndex4), b2.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            b2.close();
        }
    }

    /* JADX INFO: finally extract failed */
    private static C0061d a(androidx.i.a.b bVar, String str, boolean z) {
        Cursor b2 = bVar.b("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = b2.getColumnIndex("seqno");
            int columnIndex2 = b2.getColumnIndex("cid");
            int columnIndex3 = b2.getColumnIndex(StringSet.name);
            if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1) {
                b2.close();
                return null;
            }
            TreeMap treeMap = new TreeMap();
            while (b2.moveToNext()) {
                if (b2.getInt(columnIndex2) >= 0) {
                    int i2 = b2.getInt(columnIndex);
                    treeMap.put(Integer.valueOf(i2), b2.getString(columnIndex3));
                }
            }
            ArrayList arrayList = new ArrayList(treeMap.size());
            arrayList.addAll(treeMap.values());
            C0061d dVar = new C0061d(str, z, arrayList);
            b2.close();
            return dVar;
        } catch (Throwable th) {
            b2.close();
            throw th;
        }
    }

    public d(String str, Map<String, a> map, Set<b> set, Set<C0061d> set2) {
        Set<C0061d> unmodifiableSet;
        this.f4250a = str;
        this.f4251b = Collections.unmodifiableMap(map);
        this.f4252c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            unmodifiableSet = null;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set2);
        }
        this.f4253d = unmodifiableSet;
    }
}
