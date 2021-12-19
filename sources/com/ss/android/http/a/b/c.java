package com.ss.android.http.a.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.http.a.c.a;
import com.ss.android.http.a.d.b;
import java.util.ArrayList;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final c f59530a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f59531b = {';', ','};

    static {
        Covode.recordClassIndex(36759);
    }

    private static com.ss.android.http.a.c a(String str, String str2) {
        return new d(str, str2);
    }

    private static com.ss.android.http.a.c c(b bVar, g gVar) {
        return a(bVar, gVar, f59531b);
    }

    private static boolean a(char c2, char[] cArr) {
        if (cArr != null) {
            for (char c3 : cArr) {
                if (c2 == c3) {
                    return true;
                }
            }
        }
        return false;
    }

    private com.ss.android.http.a.c[] b(b bVar, g gVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (gVar != null) {
            int i2 = gVar.f59537c;
            int i3 = gVar.f59536b;
            while (i2 < i3 && a.a(bVar.f59540a[i2])) {
                i2++;
            }
            gVar.a(i2);
            if (gVar.a()) {
                return new com.ss.android.http.a.c[0];
            }
            ArrayList arrayList = new ArrayList();
            while (!gVar.a()) {
                arrayList.add(c(bVar, gVar));
                if (bVar.f59540a[gVar.f59537c - 1] == ',') {
                    break;
                }
            }
            return (com.ss.android.http.a.c[]) arrayList.toArray(new com.ss.android.http.a.c[arrayList.size()]);
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    @Override // com.ss.android.http.a.b.f
    public final com.ss.android.http.a.b[] a(b bVar, g gVar) {
        ArrayList arrayList = new ArrayList();
        while (!gVar.a()) {
            com.ss.android.http.a.c c2 = c(bVar, gVar);
            com.ss.android.http.a.c[] cVarArr = null;
            if (!gVar.a()) {
                if (bVar.f59540a[gVar.f59537c - 1] != ',') {
                    cVarArr = b(bVar, gVar);
                }
            }
            b bVar2 = new b(c2.a(), c2.b(), cVarArr);
            if (bVar2.a().length() != 0 || bVar2.b() != null) {
                arrayList.add(bVar2);
            }
        }
        return (com.ss.android.http.a.b[]) arrayList.toArray(new com.ss.android.http.a.b[arrayList.size()]);
    }

    private static com.ss.android.http.a.c a(b bVar, g gVar, char[] cArr) {
        boolean z;
        boolean z2;
        String b2;
        char c2;
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (gVar != null) {
            int i2 = gVar.f59537c;
            int i3 = gVar.f59537c;
            int i4 = gVar.f59536b;
            while (true) {
                z = true;
                if (i2 >= i4 || (c2 = bVar.f59540a[i2]) == '=') {
                    z2 = false;
                } else if (a(c2, cArr)) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            z2 = false;
            if (i2 == i4) {
                b2 = bVar.b(i3, i4);
            } else {
                b2 = bVar.b(i3, i2);
                i2++;
                if (!z2) {
                    int i5 = i2;
                    boolean z3 = false;
                    boolean z4 = false;
                    while (true) {
                        if (i5 >= i4) {
                            z = false;
                            break;
                        }
                        char c3 = bVar.f59540a[i5];
                        if (c3 == '\"' && !z3) {
                            z4 = !z4;
                        }
                        if (!z4) {
                            if (!z3 && a(c3, cArr)) {
                                break;
                            }
                            z3 = false;
                        } else {
                            if (!z3 && z4 && c3 == '\\') {
                                z3 = true;
                            }
                            z3 = false;
                        }
                        i5++;
                    }
                    while (i2 < i5 && a.a(bVar.f59540a[i2])) {
                        i2++;
                    }
                    int i6 = i5;
                    while (i6 > i2) {
                        if (!a.a(bVar.f59540a[i6 - 1])) {
                            break;
                        }
                        i6--;
                    }
                    if (i6 - i2 >= 2 && bVar.f59540a[i2] == '\"') {
                        if (bVar.f59540a[i6 - 1] == '\"') {
                            i2++;
                            i6--;
                        }
                    }
                    String a2 = bVar.a(i2, i6);
                    if (z) {
                        i5++;
                    }
                    gVar.a(i5);
                    return a(b2, a2);
                }
            }
            gVar.a(i2);
            return a(b2, (String) null);
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }
}
