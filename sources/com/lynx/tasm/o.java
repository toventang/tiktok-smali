package com.lynx.tasm;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.f;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.xml.transform.Transformer;

public abstract class o implements f {
    static {
        Covode.recordClassIndex(35374);
    }

    public void a() {
    }

    @Override // com.lynx.tasm.behavior.f
    public void a(Context context, String str, String str2, float f2, float f3, Transformer transformer, f.a aVar) {
    }

    public void a(LynxPerfMetric lynxPerfMetric) {
    }

    public void a(h hVar) {
    }

    public void a(j jVar) {
    }

    public void a(a aVar) {
    }

    public void a(b bVar) {
    }

    public void a(String str) {
    }

    public void a(String str, String str2, int i2) {
    }

    public void a(HashMap<String, Object> hashMap) {
    }

    public void a(Map<String, Object> map) {
    }

    public void a(Set<String> set) {
    }

    public void b() {
    }

    public void b(LynxPerfMetric lynxPerfMetric) {
    }

    public void b(j jVar) {
    }

    public void b(b bVar) {
    }

    public void b(String str) {
    }

    public void c() {
    }

    public void c(j jVar) {
    }

    public void c(String str) {
    }

    @Override // com.lynx.tasm.behavior.f
    public String d(String str) {
        return null;
    }

    public void d() {
    }

    public void d(j jVar) {
    }

    public void e() {
    }

    public void f() {
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f56803a;

        /* renamed from: b  reason: collision with root package name */
        public final long f56804b;

        /* renamed from: c  reason: collision with root package name */
        public final long f56805c;

        static {
            Covode.recordClassIndex(35375);
        }

        public final String toString() {
            return com.a.a("FlushInfo is sync:" + this.f56803a + ", begin timing:" + this.f56804b + ", end timing:" + this.f56805c, new Object[0]);
        }

        public a(boolean z, long j2, long j3) {
            this.f56803a = z;
            this.f56804b = j2;
            this.f56805c = j3;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f56806a;

        /* renamed from: b  reason: collision with root package name */
        public String f56807b;

        /* renamed from: c  reason: collision with root package name */
        public String f56808c;

        static {
            Covode.recordClassIndex(35376);
        }

        public final String toString() {
            return com.a.a("ViewInfo @%d view %s, name %s, monitor-name %s", new Object[]{Integer.valueOf(hashCode()), this.f56806a.getClass().getSimpleName(), this.f56807b, this.f56808c});
        }

        public b(View view, String str, String str2) {
            this.f56806a = view;
            this.f56807b = str;
            this.f56808c = str2;
        }
    }
}
