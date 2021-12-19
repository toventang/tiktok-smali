package com.bytedance.p.a;

import com.bytedance.apm.block.a.h;
import com.bytedance.apm.block.a.i;
import com.bytedance.apm.c;
import com.bytedance.apm.h.f;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public final class a {

    /* renamed from: com.bytedance.p.a.a$a  reason: collision with other inner class name */
    public interface AbstractC1024a {
        static {
            Covode.recordClassIndex(25544);
        }

        void a(List<h> list, int i2);

        boolean a(long j2, int i2);
    }

    static {
        Covode.recordClassIndex(25542);
    }

    private static boolean a(long j2) {
        return ((j2 >> 63) & 1) == 1;
    }

    private static int b(long j2) {
        return (int) ((j2 >> 43) & 1048575);
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        h f41745a;

        /* renamed from: b  reason: collision with root package name */
        b f41746b;

        /* renamed from: c  reason: collision with root package name */
        LinkedList<b> f41747c = new LinkedList<>();

        static {
            Covode.recordClassIndex(25545);
        }

        public final int a() {
            h hVar = this.f41745a;
            if (hVar == null) {
                return 0;
            }
            return hVar.f24625d;
        }

        public final int b() {
            if (this.f41747c.isEmpty()) {
                return this.f41745a.f24623b;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f41747c.size(); i3++) {
                i2 += this.f41747c.get(i3).f41745a.f24623b;
            }
            return this.f41745a.f24623b - i2;
        }

        public final void a(b bVar) {
            this.f41747c.addFirst(bVar);
        }

        b(h hVar, b bVar) {
            this.f41745a = hVar;
            this.f41746b = bVar;
        }
    }

    public static void a(List<h> list) {
        ListIterator<h> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            h previous = listIterator.previous();
            if (previous != null && previous.f24623b <= 0) {
                listIterator.remove();
            }
        }
    }

    public static void b(List<h> list) {
        ListIterator<h> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (listIterator.previous().f24623b < 5) {
                listIterator.remove();
            }
        }
    }

    public static String c(List<h> list) {
        StringBuilder sb = new StringBuilder();
        HashSet hashSet = new HashSet();
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList, new Comparator<h>() {
            /* class com.bytedance.p.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(25543);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(h hVar, h hVar2) {
                int i2 = hVar2.f24627f;
                int i3 = hVar.f24627f;
                if (i2 < i3) {
                    return -1;
                }
                if (i2 == i3) {
                    return 0;
                }
                return 1;
            }
        });
        for (int i2 = 0; i2 < linkedList.size(); i2++) {
            int i3 = ((h) linkedList.get(i2)).f24622a;
            if (i3 != 1048574) {
                if (((h) linkedList.get(i2)).f24627f < 16 || hashSet.size() >= 5) {
                    break;
                }
                hashSet.add(Integer.valueOf(i3));
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            sb.append(num).append("\n");
            i.a.f24638a.a(num.intValue());
        }
        return sb.toString();
    }

    private static int a(LinkedList<h> linkedList, h hVar) {
        h peek;
        int i2;
        if (linkedList.isEmpty() || (peek = linkedList.peek()) == null || peek.f24622a != hVar.f24622a || peek.f24625d != hVar.f24625d || hVar.f24625d == 0) {
            linkedList.push(hVar);
            return hVar.f24623b;
        }
        if (hVar.f24623b == 5000) {
            i2 = peek.f24623b;
        } else {
            i2 = hVar.f24623b;
        }
        hVar.f24623b = i2;
        peek.a((long) hVar.f24623b);
        return peek.f24623b;
    }

    private static int a(LinkedList<h> linkedList, b bVar) {
        ListIterator<h> listIterator = linkedList.listIterator(0);
        b bVar2 = null;
        int i2 = 0;
        while (listIterator.hasNext()) {
            b bVar3 = new b(listIterator.next(), bVar2);
            i2++;
            if (bVar2 != null || bVar3.a() == 0) {
                int a2 = bVar3.a();
                if (bVar2 == null || a2 == 0) {
                    bVar.a(bVar3);
                } else if (bVar2.a() >= a2) {
                    while (true) {
                        if (bVar2.a() > a2) {
                            bVar2 = bVar2.f41746b;
                            if (bVar2 == null) {
                                break;
                            }
                        } else if (bVar2.f41746b != null) {
                            bVar3.f41746b = bVar2.f41746b;
                            bVar2.f41746b.a(bVar3);
                        }
                    }
                } else {
                    bVar2.a(bVar3);
                }
                bVar2 = bVar3;
            } else {
                if (c.e()) {
                    f.c("[stackToTree] SceneMethodsInfo begin error! why the first node'depth is not 0!", new Object[0]);
                }
                return 0;
            }
        }
        f.a("[stackToTree] count [%d] ", Integer.valueOf(i2));
        return i2;
    }

    public static long a(LinkedList<h> linkedList, StringBuilder sb) {
        Iterator<h> it = linkedList.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            h next = it.next();
            sb.append(next.toString()).append('\n');
            if (j2 < ((long) next.f24623b)) {
                j2 = (long) next.f24623b;
            }
        }
        return j2;
    }

    private static void a(b bVar, LinkedList<h> linkedList) {
        LinkedList linkedList2 = new LinkedList();
        while (bVar != null) {
            if (bVar.f41745a != null) {
                bVar.f41745a.f24627f = bVar.b();
                linkedList.add(bVar.f41745a);
            }
            LinkedList<b> linkedList3 = bVar.f41747c;
            if (!linkedList3.isEmpty()) {
                for (int size = linkedList3.size() - 1; size >= 0; size--) {
                    linkedList2.add(linkedList3.get(size));
                }
            }
            bVar = (b) linkedList2.pollLast();
        }
    }

    public static void a(List<h> list, AbstractC1024a aVar) {
        int size = list.size();
        int i2 = 1;
        while (size > 30) {
            ListIterator<h> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (aVar.a((long) listIterator.previous().f24623b, i2)) {
                    listIterator.remove();
                    size--;
                    if (size <= 30) {
                        return;
                    }
                }
            }
            size = list.size();
            i2++;
            if (60 < i2) {
                break;
            }
        }
        int size2 = list.size();
        if (size2 > 30) {
            aVar.a(list, size2);
        }
    }

    public static void a(long[] jArr, LinkedList<h> linkedList, long j2) {
        b(jArr, linkedList, j2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(long[] r21, java.util.LinkedList<com.bytedance.apm.block.a.h> r22, long r23) {
        /*
        // Method dump skipped, instructions count: 557
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p.a.a.b(long[], java.util.LinkedList, long):void");
    }
}
