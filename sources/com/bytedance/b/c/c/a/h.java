package com.bytedance.b.c.c.a;

import android.os.Looper;
import android.os.Process;
import com.bytedance.b.c.b.c;
import com.bytedance.b.c.c.a;
import com.bytedance.b.c.c.c;
import com.bytedance.b.c.c.d;
import com.bytedance.b.c.c.e;
import com.bytedance.b.c.c.i;
import com.bytedance.b.c.d.a;
import com.bytedance.b.j.e.a;
import com.bytedance.b.k.d.b;
import com.bytedance.b.k.f;
import com.bytedance.covode.number.Covode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* access modifiers changed from: package-private */
public final class h extends a {

    /* renamed from: b  reason: collision with root package name */
    private List<Double> f26073b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List<i> f26074c = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    private List<i> f26075d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.b.k.d.a f26076e = new com.bytedance.b.k.d.a() {
        /* class com.bytedance.b.c.c.a.h.AnonymousClass1 */

        static {
            Covode.recordClassIndex(15178);
        }

        public final void run() {
            h.this.b();
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private c f26077f;

    /* renamed from: g  reason: collision with root package name */
    private long f26078g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f26079h;

    static {
        Covode.recordClassIndex(15177);
    }

    @Override // com.bytedance.b.c.c.g, com.bytedance.b.c.c.a
    public final void a() {
        super.a();
        d();
    }

    private void d() {
        this.f26073b.clear();
        this.f26075d.clear();
        this.f26074c.clear();
        this.f26078g = 0;
        b.a(com.bytedance.b.k.d.c.IO).b(this.f26076e);
    }

    public final void b() {
        String a2;
        if (com.bytedance.b.c.c.b.a()) {
            d();
            this.f26051a.c();
            return;
        }
        double a3 = e.a();
        this.f26073b.add(Double.valueOf(a3));
        boolean a4 = com.bytedance.b.c.c.b.a(this.f26077f, a3, this.f26079h);
        if (System.currentTimeMillis() - this.f26078g >= 30000) {
            if (this.f26073b.isEmpty() || this.f26075d.isEmpty()) {
                d();
                this.f26051a.c();
                return;
            }
            double d2 = 0.0d;
            double d3 = 0.0d;
            for (Double d4 : this.f26073b) {
                double doubleValue = d4.doubleValue();
                if (d3 < doubleValue) {
                    d3 = doubleValue;
                }
                d2 += doubleValue;
            }
            this.f26075d.size();
            double size = (double) this.f26073b.size();
            Double.isNaN(size);
            double d5 = d2 / size;
            LinkedList linkedList = new LinkedList();
            String[] split = com.bytedance.b.c.c.b.f26082a.split("#");
            int i2 = 0;
            if (this.f26079h) {
                if (!this.f26077f.f26049g.isEmpty()) {
                    int length = split.length;
                    while (i2 < length) {
                        String str = split[i2];
                        if (this.f26077f.f26049g.containsKey(str)) {
                            double doubleValue2 = this.f26077f.f26049g.get(str).doubleValue();
                            if (doubleValue2 >= 0.0d && d5 > doubleValue2) {
                                linkedList.add(str);
                            }
                        }
                        i2++;
                    }
                }
            } else if (!this.f26077f.f26050h.isEmpty()) {
                int length2 = split.length;
                while (i2 < length2) {
                    String str2 = split[i2];
                    if (this.f26077f.f26050h.containsKey(str2)) {
                        double doubleValue3 = this.f26077f.f26050h.get(str2).doubleValue();
                        if (doubleValue3 >= 0.0d && d5 > doubleValue3) {
                            linkedList.add(str2);
                        }
                    }
                    i2++;
                }
            }
            if (c.a.f26090a.a() && (!linkedList.isEmpty() || ((this.f26079h && d5 > this.f26077f.f26045c) || (!this.f26079h && d5 > this.f26077f.f26046d)))) {
                c.a.f26090a.f26083a = System.currentTimeMillis();
                if (linkedList.isEmpty()) {
                    a2 = (!this.f26079h || d5 <= this.f26077f.f26045c) ? (this.f26079h || d5 <= this.f26077f.f26046d) ? "" : "apm_max_foreground" : "apm_max_background";
                } else {
                    a2 = f.a(linkedList.toArray(), "#");
                    if (this.f26079h && d5 > this.f26077f.f26045c) {
                        a2 = a2 + "#apm_max_background";
                    } else if (!this.f26079h && d5 > this.f26077f.f26046d) {
                        a2 = a2 + "#apm_max_foreground";
                    }
                }
                com.bytedance.b.h.a.a(new b(d5, d3, this.f26075d, a2, this.f26079h));
            }
            d();
            this.f26051a.f();
        } else if (!a4) {
            this.f26074c.clear();
        } else {
            c();
        }
    }

    private void c() {
        i next;
        int i2 = 40;
        char c2 = '\n';
        if (this.f26074c.isEmpty()) {
            int myPid = Process.myPid();
            List<i> list = this.f26074c;
            BufferedReader bufferedReader = null;
            File[] listFiles = new File("/proc/" + myPid + "/task/").listFiles();
            long a2 = com.bytedance.b.k.c.a.a();
            int length = listFiles.length;
            int i3 = 0;
            while (i3 < length) {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(listFiles[i3].getPath() + "/stat")), 1000);
                    try {
                        String readLine = bufferedReader2.readLine();
                        int lastIndexOf = readLine.lastIndexOf(41);
                        String substring = readLine.substring(0, lastIndexOf);
                        String substring2 = readLine.substring(lastIndexOf + 4);
                        int indexOf = substring.indexOf(i2);
                        int intValue = Integer.valueOf(substring.substring(0, indexOf - 1)).intValue();
                        String substring3 = substring.substring(indexOf + 1);
                        String[] split = substring2.split(" ");
                        long parseLong = Long.parseLong(split[c2]) + Long.parseLong(split[11]);
                        if (intValue != 0 && !substring3.isEmpty() && parseLong != 0 && !Thread.currentThread().getName().contains(substring3)) {
                            i iVar = new i();
                            iVar.f26104b = substring3;
                            iVar.f26103a = intValue;
                            iVar.f26105c = parseLong;
                            iVar.f26109g = a2;
                            iVar.f26110h = Integer.parseInt(split[14]);
                            list.add(iVar);
                        }
                        com.bytedance.monitor.a.c.a(bufferedReader2);
                        bufferedReader = bufferedReader2;
                    } catch (Throwable unused) {
                        bufferedReader = bufferedReader2;
                        com.bytedance.monitor.a.c.a(bufferedReader);
                        i3++;
                        i2 = 40;
                        c2 = '\n';
                    }
                } catch (FileNotFoundException unused2) {
                    com.bytedance.monitor.a.c.a(bufferedReader);
                    i3++;
                    i2 = 40;
                    c2 = '\n';
                }
                i3++;
                i2 = 40;
                c2 = '\n';
            }
            this.f26074c.size();
            return;
        }
        com.bytedance.b.c.c.h.a(Process.myPid(), this.f26074c, new LinkedList(), this.f26077f.f26047e);
        this.f26074c.size();
        if (!this.f26074c.isEmpty()) {
            if (this.f26074c.size() > 10) {
                this.f26074c.clear();
                return;
            }
            if (c.a.f26090a.a()) {
                ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
                int activeCount = threadGroup.activeCount();
                int i4 = activeCount + (activeCount / 2);
                Thread[] threadArr = new Thread[i4];
                threadGroup.enumerate(threadArr);
                StringBuilder sb = new StringBuilder();
                for (int i5 = 0; i5 < i4; i5++) {
                    Thread thread = threadArr[i5];
                    if (thread == null) {
                        break;
                    }
                    if (thread != Thread.currentThread()) {
                        ListIterator<i> listIterator = this.f26074c.listIterator();
                        while (true) {
                            if (!listIterator.hasNext()) {
                                break;
                            }
                            next = listIterator.next();
                            if (next == null || (!next.f26104b.equals(thread.getName()) && (thread.getName().length() <= 15 || !next.f26104b.equals(thread.getName().substring(0, 15))))) {
                            }
                        }
                        if (next.f26103a != Process.myPid() || this.f26077f.f26044b) {
                            StackTraceElement[] stackTrace = thread.getStackTrace();
                            int i6 = 0;
                            for (StackTraceElement stackTraceElement : stackTrace) {
                                i6++;
                                sb.append("\tat ").append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(stackTraceElement.getFileName()).append(":").append(stackTraceElement.getLineNumber()).append(")\n");
                                if (i6 > 40) {
                                    break;
                                }
                            }
                            next.f26108f = sb.toString();
                            next.f26107e = com.a.a("%.2f", new Object[]{Double.valueOf(next.f26106d / this.f26077f.f26047e)});
                            this.f26075d.add(next);
                            sb.setLength(0);
                        }
                    }
                }
            }
            Collections.sort(this.f26074c, new Comparator<i>() {
                /* class com.bytedance.b.c.c.a.h.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(15179);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // java.util.Comparator
                public final /* bridge */ /* synthetic */ int compare(i iVar, i iVar2) {
                    return (int) ((iVar2.f26106d * 100.0d) - (iVar.f26106d * 100.0d));
                }
            });
            LinkedList<a.C0560a> linkedList = new LinkedList<>();
            for (i iVar2 : this.f26074c) {
                linkedList.add(new a.C0560a(iVar2.f26104b, iVar2.f26106d, iVar2.f26103a));
            }
            a.C0557a.f26115a.b(linkedList);
            this.f26074c.clear();
        }
    }

    @Override // com.bytedance.b.c.c.g, com.bytedance.b.c.c.a
    public final void a(boolean z) {
        super.a(z);
        d();
        this.f26051a.b();
    }

    public h(d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.b.c.c.g, com.bytedance.b.c.c.a
    public final void a(com.bytedance.b.c.b.c cVar, boolean z) {
        super.a(cVar, z);
        this.f26077f = cVar;
        this.f26078g = System.currentTimeMillis();
        this.f26079h = z;
        b.a(com.bytedance.b.k.d.c.IO).a(this.f26076e);
    }
}
