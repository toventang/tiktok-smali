package com.ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    static List<h> f81875a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f81876b;

    /* renamed from: c  reason: collision with root package name */
    public static final x f81877c = new x();

    private x() {
    }

    public static void a() {
        f81875a = null;
        f81876b = false;
    }

    static {
        Covode.recordClassIndex(50838);
    }

    public static void a(List<h> list) {
        if (list != null && (!list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (h hVar : list) {
                if (hVar.getFeedType() == 65515 && hVar.f81780b.size() < 3) {
                    arrayList.add(hVar);
                }
            }
            if (arrayList.size() > 0) {
                list.removeAll(arrayList);
            }
        }
    }

    public static boolean a(h hVar) {
        Integer valueOf;
        if (hVar == null || (valueOf = Integer.valueOf(hVar.getFeedType())) == null) {
            return false;
        }
        if (valueOf.intValue() == 65280 || valueOf.intValue() == 1048336) {
            return true;
        }
        return false;
    }

    public final void b(List<h> list) {
        int i2;
        if (list != null && (!list.isEmpty())) {
            int i3 = 0;
            if (f81876b) {
                f81876b = false;
                i2 = 1;
            } else {
                i2 = 0;
            }
            Iterator<T> it = list.iterator();
            int i4 = 0;
            int i5 = -1;
            while (true) {
                if (!it.hasNext()) {
                    i3 = i2;
                    break;
                }
                if (a((h) it.next())) {
                    i2++;
                } else {
                    i5 = i4;
                }
                if (i5 != -1) {
                    if (i2 % 2 == 0) {
                        i2 = 0;
                        i5 = -1;
                    } else if (!(i5 == -1 || i2 % 2 == 0)) {
                        int i6 = i4 + 1;
                        if (i6 < list.size()) {
                            Iterator<h> it2 = list.subList(i6, list.size()).iterator();
                            int i7 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if (!a(it2.next())) {
                                    i7++;
                                } else if (i7 != -1) {
                                    list.add(i5, list.remove(i6 + i7));
                                    int i8 = i5 + 2;
                                    if (i8 < list.size()) {
                                        b(list.subList(i8, list.size()));
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        f81875a = arrayList;
                        arrayList.addAll(list.subList(i5, list.size()));
                        List<h> list2 = f81875a;
                        if (list2 == null) {
                            l.b();
                        }
                        list.removeAll(list2);
                    }
                }
                i4++;
            }
            if (i3 % 2 != 0) {
                f81875a = new ArrayList();
            }
        }
    }
}
