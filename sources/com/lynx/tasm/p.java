package com.lynx.tasm;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.f;
import com.lynx.tasm.o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.xml.transform.Transformer;

public class p extends o {

    /* renamed from: a  reason: collision with root package name */
    CopyOnWriteArrayList<o> f56809a = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(35377);
    }

    @Override // com.lynx.tasm.o
    public final void a(HashMap<String, Object> hashMap) {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().a(hashMap);
        }
    }

    @Override // com.lynx.tasm.o
    public final void a(Set<String> set) {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().a(set);
        }
    }

    @Override // com.lynx.tasm.o
    public final void a(String str, String str2, int i2) {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().a(str, str2, i2);
        }
    }

    @Override // com.lynx.tasm.o
    public final void a(Map<String, Object> map) {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().a(map);
        }
    }

    @Override // com.lynx.tasm.o
    public final void a() {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // com.lynx.tasm.o
    public final void b() {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // com.lynx.tasm.o
    public final void c() {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    @Override // com.lynx.tasm.o
    public final void e() {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    @Override // com.lynx.tasm.o
    public final void f() {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // com.lynx.tasm.o
    public final void d() {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    public final void a(o oVar) {
        if (!this.f56809a.contains(oVar)) {
            this.f56809a.add(oVar);
        }
    }

    @Override // com.lynx.tasm.behavior.f, com.lynx.tasm.o
    public final String d(String str) {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            String d2 = it.next().d(str);
            if (d2 != null) {
                return d2;
            }
        }
        return null;
    }

    @Override // com.lynx.tasm.o
    public final void b(LynxPerfMetric lynxPerfMetric) {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().b(lynxPerfMetric);
        }
    }

    @Override // com.lynx.tasm.o
    public final void c(j jVar) {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().c(jVar);
        }
    }

    @Override // com.lynx.tasm.o
    public final void a(LynxPerfMetric lynxPerfMetric) {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().a(lynxPerfMetric);
        }
    }

    @Override // com.lynx.tasm.o
    public final void b(j jVar) {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().b(jVar);
        }
    }

    @Override // com.lynx.tasm.o
    public final void c(String str) {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().c(str);
        }
    }

    @Override // com.lynx.tasm.o
    public final void d(j jVar) {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().d(jVar);
        }
    }

    @Override // com.lynx.tasm.o
    public final void a(h hVar) {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().a(hVar);
        }
    }

    @Override // com.lynx.tasm.o
    public final void b(o.b bVar) {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().b(bVar);
        }
    }

    @Override // com.lynx.tasm.o
    public final void a(j jVar) {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().a(jVar);
        }
    }

    @Override // com.lynx.tasm.o
    public final void b(String str) {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().b(str);
        }
    }

    @Override // com.lynx.tasm.o
    public final void a(o.a aVar) {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().a(aVar);
        }
    }

    @Override // com.lynx.tasm.o
    public final void a(o.b bVar) {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    @Override // com.lynx.tasm.o
    public final void a(String str) {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().a(str);
        }
    }

    @Override // com.lynx.tasm.behavior.f, com.lynx.tasm.o
    public final void a(Context context, String str, String str2, float f2, float f3, Transformer transformer, f.a aVar) {
        Iterator<o> it = this.f56809a.iterator();
        while (it.hasNext()) {
            it.next().a(context, str, str2, f2, f3, transformer, aVar);
        }
    }
}
