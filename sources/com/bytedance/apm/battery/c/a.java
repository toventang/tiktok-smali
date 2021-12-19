package com.bytedance.apm.battery.c;

import android.text.TextUtils;
import com.bytedance.apm.battery.a;
import com.bytedance.apm.battery.d.g;
import com.bytedance.apm.c;
import com.bytedance.apm.p.b;
import com.bytedance.apm.q.h;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f24477a;

    /* renamed from: b  reason: collision with root package name */
    public String f24478b;

    /* renamed from: c  reason: collision with root package name */
    String f24479c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedList<com.bytedance.apm.e.a> f24480d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.apm.battery.dao.a.a f24481e;

    static {
        Covode.recordClassIndex(14432);
    }

    /* renamed from: com.bytedance.apm.battery.c.a$a  reason: collision with other inner class name */
    public static class C0525a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f24485a = new a((byte) 0);

        static {
            Covode.recordClassIndex(14435);
        }
    }

    private a() {
        this.f24478b = "";
        this.f24480d = new LinkedList<>();
    }

    /* access modifiers changed from: package-private */
    public final com.bytedance.apm.battery.dao.a.a b() {
        if (this.f24481e == null) {
            this.f24481e = com.bytedance.apm.battery.dao.a.a.c();
        }
        return this.f24481e;
    }

    public final void a() {
        b.a.f25210a.a(new Runnable() {
            /* class com.bytedance.apm.battery.c.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(14434);
            }

            public final void run() {
                LinkedList linkedList;
                boolean z;
                a aVar = a.this;
                if (c.b()) {
                    b bVar = new b();
                    List<com.bytedance.apm.e.a> a2 = aVar.a(true, 0L);
                    if (!h.a(a2)) {
                        try {
                            z = a.a(bVar, a2);
                        } catch (Exception unused) {
                            z = false;
                        }
                        com.bytedance.apm.e.a aVar2 = a2.get(a2.size() - 1);
                        long j2 = aVar2.f24904a;
                        long j3 = aVar2.f24906c;
                        if (!z) {
                            if (c.e()) {
                                new String[]{"report main process data failed, clean data and stop calc data of other process"};
                            }
                            aVar.a(j2);
                        } else {
                            if (c.e()) {
                                new String[]{"report main process data over, begin handle other process data"};
                            }
                            List<com.bytedance.apm.e.a> a3 = aVar.a(false, j3);
                            HashMap hashMap = new HashMap(4);
                            for (com.bytedance.apm.e.a aVar3 : a3) {
                                String str = aVar3.f24913j;
                                List list = (List) hashMap.get(str);
                                if (list != null) {
                                    list.add(aVar3);
                                } else {
                                    LinkedList linkedList2 = new LinkedList();
                                    linkedList2.add(aVar3);
                                    hashMap.put(str, linkedList2);
                                }
                            }
                            try {
                                for (List list2 : hashMap.values()) {
                                    a.a(bVar, list2);
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            bVar.f24491f = (long) bVar.r;
                            bVar.f24488c = (long) bVar.u;
                            bVar.f24489d = (long) bVar.s;
                            bVar.f24492g = bVar.v;
                            bVar.f24490e = (long) bVar.t;
                            bVar.f24486a = bVar.p;
                            bVar.f24496k = (long) bVar.w;
                            bVar.f24493h = (long) bVar.z;
                            bVar.f24494i = (long) bVar.x;
                            bVar.f24497l = bVar.A;
                            bVar.f24495j = (long) bVar.y;
                            bVar.f24487b = bVar.q;
                            bVar.f24498m = false;
                            bVar.n = "all_process";
                            try {
                                bVar.a(false);
                            } catch (Exception unused2) {
                            }
                            aVar.a(j2);
                        }
                    }
                }
                a.this.f24477a = true;
                synchronized (a.this.f24480d) {
                    linkedList = new LinkedList(a.this.f24480d);
                    a.this.f24480d.clear();
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    a.this.a((com.bytedance.apm.e.a) it.next());
                }
            }
        });
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        try {
            b().a(j2);
        } catch (Exception unused) {
        }
    }

    public final void a(final com.bytedance.apm.e.a aVar) {
        if (aVar != null) {
            if (c.e()) {
                String[] strArr = new String[1];
                String str = "record batteryLog: " + aVar.toString();
            }
            b.a.f25210a.a(new Runnable() {
                /* class com.bytedance.apm.battery.c.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(14433);
                }

                public final void run() {
                    a aVar = a.this;
                    com.bytedance.apm.e.a aVar2 = aVar;
                    if (c.e()) {
                        String[] strArr = new String[1];
                        String str = "record batteryLog: " + aVar2.toString() + " , mReportedInMainProcess: " + aVar.f24477a;
                    }
                    if (aVar.f24477a || !c.b()) {
                        if (TextUtils.isEmpty(aVar.f24479c)) {
                            aVar.f24479c = String.valueOf(System.currentTimeMillis());
                        }
                        aVar2.f24914k = c.b();
                        aVar2.f24913j = c.a();
                        aVar2.f24915l = aVar.f24479c;
                        if (TextUtils.isEmpty(aVar2.f24909f)) {
                            aVar2.f24909f = aVar.f24478b;
                        }
                        try {
                            if (c.e()) {
                                String[] strArr2 = new String[1];
                                "saveBatteryLog into db: ".concat(String.valueOf(aVar2));
                            }
                            aVar.b().a(aVar2);
                        } catch (Exception unused) {
                        }
                    } else {
                        aVar2.f24909f = aVar.f24478b;
                        synchronized (aVar.f24480d) {
                            if (aVar.f24480d.size() > 100) {
                                aVar.f24480d.poll();
                            }
                            aVar.f24480d.add(aVar2);
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public final List<com.bytedance.apm.e.a> a(boolean z, long j2) {
        try {
            return b().a(z, j2);
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    static boolean a(b bVar, List<com.bytedance.apm.e.a> list) {
        Map<String, g> map = a.C0523a.f24435a.f24430a;
        StringBuilder sb = new StringBuilder();
        String str = null;
        for (com.bytedance.apm.e.a aVar : list) {
            if (str == null || !str.equals(aVar.f24915l)) {
                str = aVar.f24915l;
                sb.append(str);
            }
            if (!"ground_record".equals(aVar.f24907d)) {
                g gVar = map.get(aVar.f24907d);
                if (gVar != null) {
                    gVar.a(bVar, aVar);
                }
            } else if (aVar.f24905b) {
                bVar.f24486a += aVar.f24910g;
            } else {
                bVar.f24487b += aVar.f24910g;
            }
        }
        com.bytedance.apm.e.a aVar2 = list.get(0);
        bVar.f24498m = aVar2.f24914k;
        if (!bVar.f24498m || (bVar.b() && bVar.c())) {
            bVar.n = aVar2.f24913j;
            bVar.o = sb.toString();
            return bVar.a(true);
        }
        bVar.a();
        if (c.e()) {
            new String[]{"main process front or back duration is not valid, stop report "};
        }
        return false;
    }
}
