package com.ss.videoarch.a.c;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public b f154225a;

    /* renamed from: b  reason: collision with root package name */
    public int f154226b;

    /* renamed from: c  reason: collision with root package name */
    private c[] f154227c;

    /* renamed from: d  reason: collision with root package name */
    private String[] f154228d;

    /* renamed from: e  reason: collision with root package name */
    private int f154229e;

    static {
        Covode.recordClassIndex(102849);
    }

    public final boolean a(String str, String str2, long j2) {
        b bVar = this.f154225a;
        if (bVar == null) {
            return false;
        }
        return bVar.a(str, str2, j2);
    }

    public final void b() {
        b bVar = this.f154225a;
        if (bVar != null) {
            bVar.f154244e = 1;
        }
    }

    public final String c() {
        b bVar;
        if (this.f154226b != 2 || (bVar = this.f154225a) == null) {
            return null;
        }
        return bVar.b();
    }

    public final String d() {
        b bVar;
        if (this.f154226b != 2 || (bVar = this.f154225a) == null) {
            return null;
        }
        return bVar.c();
    }

    public final Map<String, String> e() {
        b bVar;
        if (this.f154226b != 2 || (bVar = this.f154225a) == null) {
            return null;
        }
        return bVar.d();
    }

    public final String g() {
        this.f154229e++;
        return i();
    }

    public final void h() {
        this.f154229e = 0;
        this.f154228d = null;
        this.f154225a = null;
        this.f154227c = null;
    }

    private String i() {
        String[] strArr = this.f154228d;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        int i2 = this.f154229e;
        if (i2 >= strArr.length) {
            i2 = 0;
        }
        return strArr[i2];
    }

    public final String a() {
        b bVar;
        if (this.f154226b == 2 && (bVar = this.f154225a) != null) {
            return bVar.f154241b;
        }
        return null;
    }

    public final c f() {
        c[] cVarArr = this.f154227c;
        if (!(cVarArr == null || cVarArr.length == 0)) {
            for (c cVar : cVarArr) {
                if (cVar.f154253a != null) {
                    return cVar;
                }
            }
        }
        return null;
    }

    public final String a(String str) {
        if (this.f154226b != 2 || this.f154225a == null || str == null) {
            return null;
        }
        return b.a(str);
    }

    public final void b(String str) {
        b bVar;
        if (this.f154226b == 2 && (bVar = this.f154225a) != null) {
            bVar.b(str);
        }
    }

    public final boolean c(String str) {
        b bVar = this.f154225a;
        if (bVar == null) {
            return false;
        }
        return bVar.c(str);
    }

    public final c d(String str) {
        c[] cVarArr = this.f154227c;
        if (!(cVarArr == null || cVarArr.length == 0)) {
            for (c cVar : cVarArr) {
                if (str.equals(cVar.a()) && cVar.f154253a != null) {
                    return cVar;
                }
            }
        }
        return null;
    }

    public final void a(b bVar) {
        this.f154225a = bVar;
        this.f154229e = 0;
        this.f154226b = 2;
    }

    public final void a(c[] cVarArr) {
        this.f154227c = cVarArr;
        this.f154229e = 0;
        this.f154226b = 1;
        ArrayList arrayList = new ArrayList();
        for (c cVar : cVarArr) {
            if (cVar.f154253a != null) {
                arrayList.add(cVar.f154253a);
            }
            if (cVar.f154254b != null) {
                arrayList.add(cVar.f154254b);
            }
        }
        String[] strArr = new String[arrayList.size()];
        this.f154228d = strArr;
        arrayList.toArray(strArr);
    }

    public final boolean a(int i2) {
        b bVar = this.f154225a;
        if (bVar == null) {
            return false;
        }
        return bVar.a(i2);
    }

    public final void d(String str, String str2) {
        b bVar = this.f154225a;
        if (bVar != null) {
            bVar.a(str, str2);
        }
    }

    public final int a(String str, String str2) {
        b bVar;
        if (this.f154226b != 2 || (bVar = this.f154225a) == null) {
            return -1;
        }
        return bVar.c(str, str2);
    }

    public final String b(String str, String str2) {
        b bVar;
        if (this.f154226b != 2 || (bVar = this.f154225a) == null) {
            return null;
        }
        return bVar.k(str, str2);
    }

    public final JSONObject f(String str, String str2) {
        b bVar;
        if (this.f154226b != 2 || (bVar = this.f154225a) == null) {
            return null;
        }
        return bVar.j(str, str2);
    }

    public final long c(String str, String str2) {
        b bVar;
        if (this.f154226b != 2 || (bVar = this.f154225a) == null) {
            return 0;
        }
        return bVar.h(str, str2);
    }

    public final JSONObject e(String str, String str2) {
        b bVar;
        if (this.f154226b != 2 || (bVar = this.f154225a) == null) {
            return null;
        }
        return bVar.i(str, str2);
    }

    public final void c(String str, String str2, String str3) {
        b bVar = this.f154225a;
        if (bVar != null) {
            bVar.a(str, str2, str3);
        }
    }

    public final String b(String str, String str2, String str3) {
        b bVar = this.f154225a;
        if (bVar == null) {
            return null;
        }
        return bVar.c(str, str2, str3);
    }

    public final String a(String str, String str2, String str3) {
        b bVar;
        if (this.f154226b != 2 || (bVar = this.f154225a) == null) {
            return null;
        }
        return bVar.b(str, str2, str3);
    }

    public final boolean a(int i2, int i3, float f2) {
        b bVar;
        if (this.f154226b != 2 || (bVar = this.f154225a) == null) {
            return false;
        }
        return bVar.a(i2, i3, f2);
    }
}
