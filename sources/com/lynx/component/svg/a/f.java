package com.lynx.component.svg.a;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public ac f55232a;

    /* renamed from: b  reason: collision with root package name */
    public String f55233b = "";

    /* renamed from: c  reason: collision with root package name */
    public float f55234c = 96.0f;

    /* renamed from: d  reason: collision with root package name */
    public e f55235d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, ag> f55236e = new HashMap();

    /* access modifiers changed from: package-private */
    public interface ae {
        static {
            Covode.recordClassIndex(34652);
        }

        void a(ai aiVar);

        List<ai> b();
    }

    interface m {
        static {
            Covode.recordClassIndex(34674);
        }

        void a(Matrix matrix);
    }

    interface q {
        static {
            Covode.recordClassIndex(34678);
        }
    }

    interface u {
        static {
            Covode.recordClassIndex(34682);
        }

        void a();

        void a(float f2, float f3);

        void a(float f2, float f3, float f4, float f5);

        void a(float f2, float f3, float f4, float f5, float f6, float f7);

        void a(float f2, float f3, float f4, boolean z, boolean z2, float f5, float f6);

        void b(float f2, float f3);
    }

    static {
        Covode.recordClassIndex(34640);
    }

    static class aa extends ag implements ae {

        /* renamed from: a  reason: collision with root package name */
        Float f55242a;

        static {
            Covode.recordClassIndex(34643);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.a.f.ai
        public final String a() {
            return "stop";
        }

        @Override // com.lynx.component.svg.a.f.ae
        public final void a(ai aiVar) {
        }

        aa() {
        }

        @Override // com.lynx.component.svg.a.f.ae
        public final List<ai> b() {
            return Collections.emptyList();
        }
    }

    static class ab implements Cloneable {
        e A;
        d B;

        /* renamed from: a  reason: collision with root package name */
        long f55243a;

        /* renamed from: b  reason: collision with root package name */
        aj f55244b;

        /* renamed from: c  reason: collision with root package name */
        a f55245c;

        /* renamed from: d  reason: collision with root package name */
        Float f55246d;

        /* renamed from: e  reason: collision with root package name */
        aj f55247e;

        /* renamed from: f  reason: collision with root package name */
        Float f55248f;

        /* renamed from: g  reason: collision with root package name */
        o f55249g;

        /* renamed from: h  reason: collision with root package name */
        b f55250h;

        /* renamed from: i  reason: collision with root package name */
        c f55251i;

        /* renamed from: j  reason: collision with root package name */
        Float f55252j;

        /* renamed from: k  reason: collision with root package name */
        o[] f55253k;

        /* renamed from: l  reason: collision with root package name */
        o f55254l;

        /* renamed from: m  reason: collision with root package name */
        Float f55255m;
        e n;
        Boolean o;
        b p;
        Boolean q;
        Boolean r;
        aj s;
        Float t;
        String u;
        a v;
        aj w;
        Float x;
        aj y;
        Float z;

        static {
            Covode.recordClassIndex(34644);
        }

        ab() {
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.Object
        public final Object clone() {
            ab abVar = (ab) super.clone();
            o[] oVarArr = this.f55253k;
            if (oVarArr != null) {
                abVar.f55253k = (o[]) oVarArr.clone();
            }
            return abVar;
        }

        public enum a {
            NonZero,
            EvenOdd;

            static {
                Covode.recordClassIndex(34645);
            }
        }

        public enum b {
            Butt,
            Round,
            Square;

            static {
                Covode.recordClassIndex(34646);
            }
        }

        public enum c {
            Miter,
            Round,
            Bevel;

            static {
                Covode.recordClassIndex(34647);
            }
        }

        public enum d {
            auto,
            optimizeQuality,
            optimizeSpeed;

            static {
                Covode.recordClassIndex(34648);
            }
        }

        public enum e {
            None,
            NonScalingStroke;

            static {
                Covode.recordClassIndex(34649);
            }
        }

        static ab a() {
            ab abVar = new ab();
            abVar.f55243a = -1;
            abVar.f55244b = e.f55305b;
            abVar.f55245c = a.NonZero;
            Float valueOf = Float.valueOf(1.0f);
            abVar.f55246d = valueOf;
            abVar.f55247e = null;
            abVar.f55248f = valueOf;
            abVar.f55249g = new o();
            abVar.f55250h = b.Butt;
            abVar.f55251i = c.Miter;
            abVar.f55252j = Float.valueOf(4.0f);
            abVar.f55253k = null;
            abVar.f55254l = new o();
            abVar.f55255m = valueOf;
            abVar.n = e.f55305b;
            abVar.o = true;
            abVar.p = null;
            abVar.q = Boolean.TRUE;
            abVar.r = Boolean.TRUE;
            abVar.s = e.f55305b;
            abVar.t = valueOf;
            abVar.u = null;
            abVar.v = a.NonZero;
            abVar.w = null;
            abVar.x = valueOf;
            abVar.y = null;
            abVar.z = valueOf;
            abVar.A = e.None;
            abVar.B = d.auto;
            return abVar;
        }

        /* access modifiers changed from: package-private */
        public final void a(boolean z2) {
            Boolean bool;
            this.q = Boolean.TRUE;
            if (z2) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            this.o = bool;
            this.p = null;
            this.u = null;
            this.f55255m = Float.valueOf(1.0f);
            this.s = e.f55305b;
            this.t = Float.valueOf(1.0f);
            this.w = null;
            this.x = Float.valueOf(1.0f);
            this.y = null;
            this.z = Float.valueOf(1.0f);
            this.A = e.None;
        }
    }

    public static class ac extends am {

        /* renamed from: a  reason: collision with root package name */
        o f55261a;

        /* renamed from: b  reason: collision with root package name */
        o f55262b;

        /* renamed from: c  reason: collision with root package name */
        public o f55263c;

        /* renamed from: d  reason: collision with root package name */
        public o f55264d;

        /* renamed from: e  reason: collision with root package name */
        public String f55265e;

        static {
            Covode.recordClassIndex(34650);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.a.f.ai
        public final String a() {
            return "svg";
        }

        ac() {
        }
    }

    static abstract class ad extends af implements ae {

        /* renamed from: i  reason: collision with root package name */
        List<ai> f55266i = new ArrayList();

        static {
            Covode.recordClassIndex(34651);
        }

        @Override // com.lynx.component.svg.a.f.ae
        public final List<ai> b() {
            return this.f55266i;
        }

        ad() {
        }

        @Override // com.lynx.component.svg.a.f.ae
        public final void a(ai aiVar) {
            this.f55266i.add(aiVar);
        }
    }

    static abstract class af extends ag {

        /* renamed from: j  reason: collision with root package name */
        a f55267j;

        static {
            Covode.recordClassIndex(34653);
        }

        af() {
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class ag extends ai {

        /* renamed from: k  reason: collision with root package name */
        String f55268k;

        /* renamed from: l  reason: collision with root package name */
        Boolean f55269l;

        /* renamed from: m  reason: collision with root package name */
        ab f55270m;
        ab n;

        static {
            Covode.recordClassIndex(34654);
        }

        ag() {
        }

        public String toString() {
            return a();
        }
    }

    static class ah extends i {

        /* renamed from: f  reason: collision with root package name */
        o f55271f;

        /* renamed from: g  reason: collision with root package name */
        o f55272g;

        /* renamed from: h  reason: collision with root package name */
        o f55273h;

        /* renamed from: i  reason: collision with root package name */
        o f55274i;

        static {
            Covode.recordClassIndex(34655);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.a.f.ai
        public final String a() {
            return "linearGradient";
        }

        ah() {
        }
    }

    /* access modifiers changed from: package-private */
    public static class ai {
        f o;
        ae p;

        static {
            Covode.recordClassIndex(34656);
        }

        /* access modifiers changed from: package-private */
        public String a() {
            return "";
        }

        ai() {
        }
    }

    static abstract class aj implements Cloneable {
        static {
            Covode.recordClassIndex(34657);
        }

        aj() {
        }
    }

    static abstract class ak extends ad {
        d q;

        static {
            Covode.recordClassIndex(34658);
        }

        ak() {
        }
    }

    static class al extends i {

        /* renamed from: f  reason: collision with root package name */
        o f55275f;

        /* renamed from: g  reason: collision with root package name */
        o f55276g;

        /* renamed from: h  reason: collision with root package name */
        o f55277h;

        /* renamed from: i  reason: collision with root package name */
        o f55278i;

        /* renamed from: j  reason: collision with root package name */
        o f55279j;

        static {
            Covode.recordClassIndex(34659);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.a.f.ai
        public final String a() {
            return "radialGradient";
        }

        al() {
        }
    }

    public static abstract class am extends ak {
        public a r;

        static {
            Covode.recordClassIndex(34660);
        }

        am() {
        }
    }

    static class ao extends l {

        /* renamed from: a  reason: collision with root package name */
        String f55292a;

        /* renamed from: c  reason: collision with root package name */
        o f55293c;

        /* renamed from: d  reason: collision with root package name */
        o f55294d;

        /* renamed from: e  reason: collision with root package name */
        o f55295e;

        /* renamed from: f  reason: collision with root package name */
        o f55296f;

        static {
            Covode.recordClassIndex(34662);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.a.f.ai, com.lynx.component.svg.a.f.l
        public final String a() {
            return "use";
        }

        ao() {
        }
    }

    static class c extends k {

        /* renamed from: a  reason: collision with root package name */
        o f55301a;

        /* renamed from: b  reason: collision with root package name */
        o f55302b;

        /* renamed from: c  reason: collision with root package name */
        o f55303c;

        static {
            Covode.recordClassIndex(34664);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.a.f.ai
        public final String a() {
            return "circle";
        }

        c() {
        }
    }

    static class d extends l implements q {

        /* renamed from: a  reason: collision with root package name */
        Boolean f55304a;

        static {
            Covode.recordClassIndex(34665);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.a.f.ai, com.lynx.component.svg.a.f.l
        public final String a() {
            return "clipPath";
        }

        d() {
        }
    }

    /* renamed from: com.lynx.component.svg.a.f$f  reason: collision with other inner class name */
    static class C1255f extends aj {

        /* renamed from: a  reason: collision with root package name */
        static C1255f f55308a = new C1255f();

        private C1255f() {
        }

        static {
            Covode.recordClassIndex(34667);
        }
    }

    static class g extends l implements q {
        static {
            Covode.recordClassIndex(34668);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.a.f.ai, com.lynx.component.svg.a.f.l
        public final String a() {
            return "defs";
        }

        g() {
        }
    }

    static class h extends k {

        /* renamed from: a  reason: collision with root package name */
        o f55309a;

        /* renamed from: b  reason: collision with root package name */
        o f55310b;

        /* renamed from: c  reason: collision with root package name */
        o f55311c;

        /* renamed from: d  reason: collision with root package name */
        o f55312d;

        static {
            Covode.recordClassIndex(34669);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.a.f.ai
        public final String a() {
            return "ellipse";
        }

        h() {
        }
    }

    static abstract class i extends ag implements ae {

        /* renamed from: a  reason: collision with root package name */
        List<ai> f55313a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        Boolean f55314b;

        /* renamed from: c  reason: collision with root package name */
        Matrix f55315c;

        /* renamed from: d  reason: collision with root package name */
        j f55316d;

        /* renamed from: e  reason: collision with root package name */
        String f55317e;

        static {
            Covode.recordClassIndex(34670);
        }

        @Override // com.lynx.component.svg.a.f.ae
        public final List<ai> b() {
            return this.f55313a;
        }

        i() {
        }

        @Override // com.lynx.component.svg.a.f.ae
        public final void a(ai aiVar) {
            if (aiVar instanceof aa) {
                this.f55313a.add(aiVar);
                return;
            }
            throw new h("Gradient elements cannot contain " + aiVar + " elements.");
        }
    }

    static abstract class k extends af implements m {

        /* renamed from: e  reason: collision with root package name */
        Matrix f55322e;

        static {
            Covode.recordClassIndex(34672);
        }

        k() {
        }

        @Override // com.lynx.component.svg.a.f.m
        public final void a(Matrix matrix) {
            this.f55322e = matrix;
        }
    }

    static class l extends ad implements m {

        /* renamed from: b  reason: collision with root package name */
        Matrix f55323b;

        static {
            Covode.recordClassIndex(34673);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.a.f.ai
        public String a() {
            return "group";
        }

        l() {
        }

        @Override // com.lynx.component.svg.a.f.m
        public final void a(Matrix matrix) {
            this.f55323b = matrix;
        }
    }

    static class n extends ak implements m {

        /* renamed from: a  reason: collision with root package name */
        String f55324a;

        /* renamed from: b  reason: collision with root package name */
        o f55325b;

        /* renamed from: c  reason: collision with root package name */
        o f55326c;

        /* renamed from: d  reason: collision with root package name */
        o f55327d;

        /* renamed from: e  reason: collision with root package name */
        o f55328e;

        /* renamed from: f  reason: collision with root package name */
        Matrix f55329f;

        static {
            Covode.recordClassIndex(34675);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.a.f.ai
        public final String a() {
            return "image";
        }

        n() {
        }

        @Override // com.lynx.component.svg.a.f.m
        public final void a(Matrix matrix) {
            this.f55329f = matrix;
        }
    }

    static class p extends k {

        /* renamed from: a  reason: collision with root package name */
        o f55332a;

        /* renamed from: b  reason: collision with root package name */
        o f55333b;

        /* renamed from: c  reason: collision with root package name */
        o f55334c;

        /* renamed from: d  reason: collision with root package name */
        o f55335d;

        static {
            Covode.recordClassIndex(34677);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.a.f.ai
        public final String a() {
            return "line";
        }

        p() {
        }
    }

    static class s extends k {

        /* renamed from: a  reason: collision with root package name */
        t f55338a;

        /* renamed from: b  reason: collision with root package name */
        Float f55339b;

        static {
            Covode.recordClassIndex(34680);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.a.f.ai
        public final String a() {
            return "path";
        }

        s() {
        }
    }

    static class v extends am implements q {

        /* renamed from: a  reason: collision with root package name */
        Boolean f55344a;

        /* renamed from: b  reason: collision with root package name */
        Boolean f55345b;

        /* renamed from: c  reason: collision with root package name */
        Matrix f55346c;

        /* renamed from: d  reason: collision with root package name */
        o f55347d;

        /* renamed from: e  reason: collision with root package name */
        o f55348e;

        /* renamed from: f  reason: collision with root package name */
        o f55349f;

        /* renamed from: g  reason: collision with root package name */
        o f55350g;

        /* renamed from: h  reason: collision with root package name */
        String f55351h;

        static {
            Covode.recordClassIndex(34683);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.a.f.ai
        public final String a() {
            return "pattern";
        }

        v() {
        }
    }

    static class w extends k {

        /* renamed from: a  reason: collision with root package name */
        float[] f55352a;

        static {
            Covode.recordClassIndex(34684);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.a.f.ai
        public String a() {
            return "polyline";
        }

        w() {
        }
    }

    static class x extends w {
        static {
            Covode.recordClassIndex(34685);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.a.f.w, com.lynx.component.svg.a.f.ai
        public final String a() {
            return "polygon";
        }

        x() {
        }
    }

    static class y extends k {

        /* renamed from: a  reason: collision with root package name */
        o f55353a;

        /* renamed from: b  reason: collision with root package name */
        o f55354b;

        /* renamed from: c  reason: collision with root package name */
        o f55355c;

        /* renamed from: d  reason: collision with root package name */
        o f55356d;

        /* renamed from: f  reason: collision with root package name */
        o f55357f;

        /* renamed from: g  reason: collision with root package name */
        o f55358g;

        static {
            Covode.recordClassIndex(34686);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.a.f.ai
        public final String a() {
            return "rect";
        }

        y() {
        }
    }

    static class z extends ag implements ae {
        static {
            Covode.recordClassIndex(34687);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.a.f.ai
        public final String a() {
            return "solidColor";
        }

        @Override // com.lynx.component.svg.a.f.ae
        public final void a(ai aiVar) {
        }

        z() {
        }

        @Override // com.lynx.component.svg.a.f.ae
        public final List<ai> b() {
            return Collections.emptyList();
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        float f55238a;

        /* renamed from: b  reason: collision with root package name */
        float f55239b;

        /* renamed from: c  reason: collision with root package name */
        public float f55240c;

        /* renamed from: d  reason: collision with root package name */
        public float f55241d;

        static {
            Covode.recordClassIndex(34642);
        }

        public final float b() {
            return this.f55239b + this.f55241d;
        }

        public final float a() {
            return this.f55238a + this.f55240c;
        }

        public final String toString() {
            return "[" + this.f55238a + " " + this.f55239b + " " + this.f55240c + " " + this.f55241d + "]";
        }

        a(a aVar) {
            this.f55238a = aVar.f55238a;
            this.f55239b = aVar.f55239b;
            this.f55240c = aVar.f55240c;
            this.f55241d = aVar.f55241d;
        }

        /* access modifiers changed from: package-private */
        public final void a(a aVar) {
            float f2 = aVar.f55238a;
            if (f2 < this.f55238a) {
                this.f55238a = f2;
            }
            float f3 = aVar.f55239b;
            if (f3 < this.f55239b) {
                this.f55239b = f3;
            }
            if (aVar.a() > a()) {
                this.f55240c = aVar.a() - this.f55238a;
            }
            if (aVar.b() > b()) {
                this.f55241d = aVar.b() - this.f55239b;
            }
        }

        static a a(float f2, float f3, float f4, float f5) {
            return new a(f2, f3, f4 - f2, f5 - f3);
        }

        a(float f2, float f3, float f4, float f5) {
            this.f55238a = f2;
            this.f55239b = f3;
            this.f55240c = f4;
            this.f55241d = f5;
        }
    }

    static class t implements u {

        /* renamed from: a  reason: collision with root package name */
        int f55340a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f55341b = new byte[8];

        /* renamed from: c  reason: collision with root package name */
        private float[] f55342c = new float[16];

        /* renamed from: d  reason: collision with root package name */
        private int f55343d;

        static {
            Covode.recordClassIndex(34681);
        }

        @Override // com.lynx.component.svg.a.f.u
        public final void a() {
            a((byte) 8);
        }

        t() {
        }

        private void a(int i2) {
            float[] fArr = this.f55342c;
            if (fArr.length < this.f55343d + i2) {
                float[] fArr2 = new float[(fArr.length * 2)];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f55342c = fArr2;
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(byte b2) {
            int i2 = this.f55340a;
            byte[] bArr = this.f55341b;
            if (i2 == bArr.length) {
                byte[] bArr2 = new byte[(bArr.length * 2)];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f55341b = bArr2;
            }
            byte[] bArr3 = this.f55341b;
            int i3 = this.f55340a;
            this.f55340a = i3 + 1;
            bArr3[i3] = b2;
        }

        /* access modifiers changed from: package-private */
        public final void a(u uVar) {
            boolean z;
            boolean z2;
            int i2 = 0;
            for (int i3 = 0; i3 < this.f55340a; i3++) {
                byte b2 = this.f55341b[i3];
                if (b2 == 0) {
                    float[] fArr = this.f55342c;
                    int i4 = i2 + 1;
                    float f2 = fArr[i2];
                    i2 = i4 + 1;
                    uVar.a(f2, fArr[i4]);
                } else if (b2 == 1) {
                    float[] fArr2 = this.f55342c;
                    int i5 = i2 + 1;
                    float f3 = fArr2[i2];
                    i2 = i5 + 1;
                    uVar.b(f3, fArr2[i5]);
                } else if (b2 == 2) {
                    float[] fArr3 = this.f55342c;
                    int i6 = i2 + 1;
                    float f4 = fArr3[i2];
                    int i7 = i6 + 1;
                    float f5 = fArr3[i6];
                    int i8 = i7 + 1;
                    float f6 = fArr3[i7];
                    int i9 = i8 + 1;
                    float f7 = fArr3[i8];
                    int i10 = i9 + 1;
                    i2 = i10 + 1;
                    uVar.a(f4, f5, f6, f7, fArr3[i9], fArr3[i10]);
                } else if (b2 == 3) {
                    float[] fArr4 = this.f55342c;
                    int i11 = i2 + 1;
                    float f8 = fArr4[i2];
                    int i12 = i11 + 1;
                    float f9 = fArr4[i11];
                    int i13 = i12 + 1;
                    i2 = i13 + 1;
                    uVar.a(f8, f9, fArr4[i12], fArr4[i13]);
                } else if (b2 != 8) {
                    if ((b2 & 2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((b2 & 1) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    float[] fArr5 = this.f55342c;
                    int i14 = i2 + 1;
                    float f10 = fArr5[i2];
                    int i15 = i14 + 1;
                    float f11 = fArr5[i14];
                    int i16 = i15 + 1;
                    float f12 = fArr5[i15];
                    int i17 = i16 + 1;
                    i2 = i17 + 1;
                    uVar.a(f10, f11, f12, z, z2, fArr5[i16], fArr5[i17]);
                } else {
                    uVar.a();
                }
            }
        }

        @Override // com.lynx.component.svg.a.f.u
        public final void b(float f2, float f3) {
            a((byte) 1);
            a(2);
            float[] fArr = this.f55342c;
            int i2 = this.f55343d;
            int i3 = i2 + 1;
            this.f55343d = i3;
            fArr[i2] = f2;
            this.f55343d = i3 + 1;
            fArr[i3] = f3;
        }

        @Override // com.lynx.component.svg.a.f.u
        public final void a(float f2, float f3) {
            a((byte) 0);
            a(2);
            float[] fArr = this.f55342c;
            int i2 = this.f55343d;
            int i3 = i2 + 1;
            this.f55343d = i3;
            fArr[i2] = f2;
            this.f55343d = i3 + 1;
            fArr[i3] = f3;
        }

        @Override // com.lynx.component.svg.a.f.u
        public final void a(float f2, float f3, float f4, float f5) {
            a((byte) 3);
            a(4);
            float[] fArr = this.f55342c;
            int i2 = this.f55343d;
            int i3 = i2 + 1;
            this.f55343d = i3;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            this.f55343d = i4;
            fArr[i3] = f3;
            int i5 = i4 + 1;
            this.f55343d = i5;
            fArr[i4] = f4;
            this.f55343d = i5 + 1;
            fArr[i5] = f5;
        }

        @Override // com.lynx.component.svg.a.f.u
        public final void a(float f2, float f3, float f4, float f5, float f6, float f7) {
            a((byte) 2);
            a(6);
            float[] fArr = this.f55342c;
            int i2 = this.f55343d;
            int i3 = i2 + 1;
            this.f55343d = i3;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            this.f55343d = i4;
            fArr[i3] = f3;
            int i5 = i4 + 1;
            this.f55343d = i5;
            fArr[i4] = f4;
            int i6 = i5 + 1;
            this.f55343d = i6;
            fArr[i5] = f5;
            int i7 = i6 + 1;
            this.f55343d = i7;
            fArr[i6] = f6;
            this.f55343d = i7 + 1;
            fArr[i7] = f7;
        }

        @Override // com.lynx.component.svg.a.f.u
        public final void a(float f2, float f3, float f4, boolean z, boolean z2, float f5, float f6) {
            int i2;
            if (z) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            a((byte) (i2 | 4 | (z2 ? 1 : 0)));
            a(5);
            float[] fArr = this.f55342c;
            int i3 = this.f55343d;
            int i4 = i3 + 1;
            this.f55343d = i4;
            fArr[i3] = f2;
            int i5 = i4 + 1;
            this.f55343d = i5;
            fArr[i4] = f3;
            int i6 = i5 + 1;
            this.f55343d = i6;
            fArr[i5] = f4;
            int i7 = i6 + 1;
            this.f55343d = i7;
            fArr[i6] = f5;
            this.f55343d = i7 + 1;
            fArr[i7] = f6;
        }
    }

    public static class o implements Cloneable {

        /* renamed from: a  reason: collision with root package name */
        public float f55330a;

        /* renamed from: b  reason: collision with root package name */
        public an f55331b;

        static {
            Covode.recordClassIndex(34676);
        }

        o() {
            this.f55330a = 0.0f;
            this.f55331b = an.px;
        }

        /* access modifiers changed from: package-private */
        public final boolean a() {
            if (this.f55330a == 0.0f) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final boolean b() {
            if (this.f55330a < 0.0f) {
                return true;
            }
            return false;
        }

        public final String toString() {
            return String.valueOf(this.f55330a) + this.f55331b;
        }

        /* access modifiers changed from: package-private */
        public final float b(g gVar) {
            if (this.f55331b != an.percent) {
                return a(gVar);
            }
            a a2 = gVar.a();
            if (a2 == null) {
                return this.f55330a;
            }
            return (this.f55330a * a2.f55241d) / 100.0f;
        }

        /* access modifiers changed from: package-private */
        public final float d(g gVar) {
            if (this.f55331b == an.percent) {
                return (this.f55330a * 1.0f) / 100.0f;
            }
            return a(gVar);
        }

        /* access modifiers changed from: package-private */
        public final float c(g gVar) {
            if (this.f55331b != an.percent) {
                return a(gVar);
            }
            a a2 = gVar.a();
            if (a2 == null) {
                return this.f55330a;
            }
            float f2 = a2.f55240c;
            float f3 = a2.f55241d;
            if (f2 == f3) {
                return (this.f55330a * f2) / 100.0f;
            }
            return (this.f55330a * ((float) (Math.sqrt((double) ((f2 * f2) + (f3 * f3))) / 1.414213562373095d))) / 100.0f;
        }

        /* access modifiers changed from: package-private */
        public final float a(g gVar) {
            switch (AnonymousClass1.f55237a[this.f55331b.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return com.lynx.tasm.utils.n.a(this.f55330a + this.f55331b.toString(), gVar.f55360b, gVar.f55361c.f55380d.getTextSize());
                case 4:
                    return this.f55330a * (gVar.f55361c.f55380d.getTextSize() / 2.0f);
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    return this.f55330a * gVar.f55359a;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return (this.f55330a * gVar.f55359a) / 2.54f;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    return (this.f55330a * gVar.f55359a) / 25.4f;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    return (this.f55330a * gVar.f55359a) / 72.0f;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return (this.f55330a * gVar.f55359a) / 6.0f;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    a a2 = gVar.a();
                    if (a2 == null) {
                        return this.f55330a;
                    }
                    return (this.f55330a * a2.f55240c) / 100.0f;
                default:
                    return this.f55330a;
            }
        }

        o(float f2, an anVar) {
            this.f55330a = f2;
            this.f55331b = anVar;
        }

        public final float a(float f2, float f3) {
            switch (AnonymousClass1.f55237a[this.f55331b.ordinal()]) {
                case 2:
                case 3:
                    return com.lynx.tasm.utils.n.a(this.f55330a + this.f55331b.toString(), f3, 0.0f);
                case 4:
                default:
                    return this.f55330a;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    return this.f55330a * f2;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return (this.f55330a * f2) / 2.54f;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    return (this.f55330a * f2) / 25.4f;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    return (this.f55330a * f2) / 72.0f;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return (this.f55330a * f2) / 6.0f;
            }
        }
    }

    static class e extends aj {

        /* renamed from: b  reason: collision with root package name */
        static final e f55305b = new e(-16777216);

        /* renamed from: c  reason: collision with root package name */
        static final e f55306c = new e(0);

        /* renamed from: a  reason: collision with root package name */
        int f55307a;

        static {
            Covode.recordClassIndex(34666);
        }

        public final String toString() {
            return com.a.a("#%08x", new Object[]{Integer.valueOf(this.f55307a)});
        }

        e(int i2) {
            this.f55307a = i2;
        }
    }

    static class r extends aj {

        /* renamed from: a  reason: collision with root package name */
        String f55336a;

        /* renamed from: b  reason: collision with root package name */
        aj f55337b;

        static {
            Covode.recordClassIndex(34679);
        }

        public final String toString() {
            return this.f55336a + " " + this.f55337b;
        }

        r(String str, aj ajVar) {
            this.f55336a = str;
            this.f55337b = ajVar;
        }
    }

    f() {
    }

    enum j {
        pad,
        reflect,
        repeat;

        static {
            Covode.recordClassIndex(34671);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f55237a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
            // Method dump skipped, instructions count: 139
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.a.f.AnonymousClass1.<clinit>():void");
        }
    }

    public enum an {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent,
        rpx,
        rem;

        static {
            Covode.recordClassIndex(34661);
        }
    }

    public static f a(String str) {
        MethodCollector.i(4979);
        f a2 = new i().a(new ByteArrayInputStream(str.getBytes()));
        MethodCollector.o(4979);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final ai b(String str) {
        String substring;
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String replace = str.replace("\\\n", "").replace("\\A", "\n");
        if (replace.length() <= 1 || !replace.startsWith("#") || (substring = replace.substring(1)) == null || substring.length() == 0) {
            return null;
        }
        if (substring.equals(this.f55232a.f55268k)) {
            return this.f55232a;
        }
        if (this.f55236e.containsKey(substring)) {
            return this.f55236e.get(substring);
        }
        ag a2 = a(this.f55232a, substring);
        this.f55236e.put(substring, a2);
        return a2;
    }

    private ag a(ae aeVar, String str) {
        ag a2;
        ag agVar = (ag) aeVar;
        if (str.equals(agVar.f55268k)) {
            return agVar;
        }
        for (ai aiVar : aeVar.b()) {
            if (aiVar instanceof ag) {
                ag agVar2 = (ag) aiVar;
                if (str.equals(agVar2.f55268k)) {
                    return agVar2;
                }
                if ((aiVar instanceof ae) && (a2 = a((ae) aiVar, str)) != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    public static f a(Resources resources, int i2) {
        MethodCollector.i(5050);
        i iVar = new i();
        InputStream openRawResource = resources.openRawResource(i2);
        try {
            return iVar.a(openRawResource);
        } finally {
            try {
                openRawResource.close();
            } catch (IOException unused) {
            }
            MethodCollector.o(5050);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        o f55297a;

        /* renamed from: b  reason: collision with root package name */
        o f55298b;

        /* renamed from: c  reason: collision with root package name */
        o f55299c;

        /* renamed from: d  reason: collision with root package name */
        o f55300d;

        static {
            Covode.recordClassIndex(34663);
        }

        b(o oVar, o oVar2, o oVar3, o oVar4) {
            this.f55297a = oVar;
            this.f55298b = oVar2;
            this.f55299c = oVar3;
            this.f55300d = oVar4;
        }
    }

    public final Picture a(int i2, int i3, e eVar, com.lynx.component.svg.d dVar) {
        this.f55235d = eVar;
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i2, i3);
        if (eVar != null) {
            if (eVar.f55230b == null) {
                eVar = new e(eVar);
            }
            new g(beginRecording, this.f55234c, eVar.f55231c, dVar).a(this, eVar);
            picture.endRecording();
            return picture;
        }
        eVar = new e(14.0f);
        eVar.a((float) i2, (float) i3);
        new g(beginRecording, this.f55234c, eVar.f55231c, dVar).a(this, eVar);
        picture.endRecording();
        return picture;
    }
}
