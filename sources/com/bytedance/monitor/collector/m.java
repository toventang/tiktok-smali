package com.bytedance.monitor.collector;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class m {
    static {
        Covode.recordClassIndex(25428);
    }

    /* access modifiers changed from: package-private */
    public static class a implements Comparable<a> {

        /* renamed from: a  reason: collision with root package name */
        boolean f41567a;

        /* renamed from: b  reason: collision with root package name */
        int f41568b;

        /* renamed from: c  reason: collision with root package name */
        long f41569c;

        /* renamed from: d  reason: collision with root package name */
        long f41570d;

        /* renamed from: e  reason: collision with root package name */
        long f41571e;

        /* renamed from: f  reason: collision with root package name */
        long f41572f;

        /* renamed from: g  reason: collision with root package name */
        long f41573g;

        static {
            Covode.recordClassIndex(25430);
        }

        public final String toString() {
            String str;
            StringBuilder append = new StringBuilder().append(this.f41568b).append(",");
            if (this.f41567a) {
                str = "sys";
            } else {
                str = "app";
            }
            return append.append(str).append(",").append(this.f41569c).append(",").append(this.f41570d).append(",").append(this.f41571e).append(",").append(this.f41572f).toString();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(a aVar) {
            long j2 = this.f41570d;
            long j3 = aVar.f41570d;
            if (j2 > j3) {
                return 1;
            }
            if (j2 == j3) {
                return 0;
            }
            return -1;
        }

        public a(boolean z, int i2, long j2, long j3, long j4, long j5) {
            this.f41567a = z;
            this.f41568b = i2;
            this.f41569c = j2;
            this.f41570d = j3;
            this.f41571e = j4;
            this.f41572f = j5;
            this.f41573g = (j4 - j3) / 1000000;
        }
    }

    private static String a(List<a> list, long j2) {
        StringBuilder sb = new StringBuilder();
        long j3 = (long) (((float) j2) * 0.3f);
        LinkedList linkedList = new LinkedList();
        for (a aVar : list) {
            if (aVar.f41571e - aVar.f41570d >= j3) {
                linkedList.add(aVar);
            }
        }
        Collections.sort(linkedList, new Comparator<a>() {
            /* class com.bytedance.monitor.collector.m.AnonymousClass1 */

            static {
                Covode.recordClassIndex(25429);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
                a aVar3 = aVar;
                a aVar4 = aVar2;
                return Long.compare(((long) (aVar4.f41568b + 1)) * (aVar4.f41571e - aVar4.f41570d), ((long) (aVar3.f41568b + 1)) * (aVar3.f41571e - aVar3.f41570d));
            }
        });
        if (linkedList.isEmpty() && !list.isEmpty()) {
            linkedList.add(list.get(0));
        }
        Iterator it = linkedList.iterator();
        if (it.hasNext()) {
            sb.append(((a) it.next()).f41569c + "\n");
        }
        return sb.toString();
    }

    public static String a(String str, StringBuilder sb, long j2) {
        LinkedList linkedList = new LinkedList();
        for (String str2 : str.split("\n")) {
            String[] split = str2.split(",");
            if (split != null && split.length >= 6) {
                linkedList.add(new a(split[1].startsWith("sys"), Integer.parseInt(split[0]), Long.parseLong(split[2]), Long.parseLong(split[3]), Long.parseLong(split[4]), Long.parseLong(split[5])));
            }
        }
        Collections.sort(linkedList);
        while (linkedList.size() > 1000) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                if (((a) it.next()).f41573g < 21) {
                    it.remove();
                }
            }
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            sb.append(((a) it2.next()).toString()).append('\n');
        }
        if (linkedList.size() == 0) {
            return null;
        }
        return a(linkedList, j2);
    }
}
