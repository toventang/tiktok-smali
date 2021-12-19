package com.google.b.a.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.b.a.g.c;
import com.google.b.a.g.j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class a extends j implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public b f53588a;

    static {
        Covode.recordClassIndex(33154);
    }

    /* renamed from: a */
    public a clone() {
        return (a) super.clone();
    }

    public String toString() {
        MethodCollector.i(3431);
        b bVar = this.f53588a;
        if (bVar != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                c a2 = bVar.a(byteArrayOutputStream, c.f53618a);
                a2.a(false, this);
                a2.a();
                String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                MethodCollector.o(3431);
                return byteArrayOutputStream2;
            } catch (IOException e2) {
                RuntimeException a3 = com.google.b.a.f.a.a.a.a.c.a(e2);
                MethodCollector.o(3431);
                throw a3;
            }
        } else {
            String jVar = super.toString();
            MethodCollector.o(3431);
            return jVar;
        }
    }

    @Override // com.google.b.a.g.j
    /* renamed from: a */
    public a b(String str, Object obj) {
        return (a) super.b(str, obj);
    }
}
