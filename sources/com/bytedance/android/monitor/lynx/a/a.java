package com.bytedance.android.monitor.lynx.a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f23543a;

    /* renamed from: b  reason: collision with root package name */
    public float f23544b;

    /* renamed from: c  reason: collision with root package name */
    public int f23545c;

    /* renamed from: d  reason: collision with root package name */
    public int f23546d;

    /* renamed from: e  reason: collision with root package name */
    public int f23547e;

    /* renamed from: f  reason: collision with root package name */
    public int f23548f;

    /* renamed from: g  reason: collision with root package name */
    public List<C0509a> f23549g;

    static {
        Covode.recordClassIndex(13987);
    }

    public final String a() {
        return "BlankDetectData{template='" + this.f23543a + '\'' + ", percentage=" + this.f23544b + ", width=" + this.f23545c + ", height=" + this.f23546d + ", alpha=" + this.f23547e + ", elementCount=" + this.f23548f + '}';
    }

    public String toString() {
        return "BlankDetectData{template='" + this.f23543a + '\'' + ", percentage=" + this.f23544b + ", width=" + this.f23545c + ", height=" + this.f23546d + ", alpha=" + this.f23547e + ", elementCount=" + this.f23548f + ", dataList=" + this.f23549g + '}';
    }

    /* renamed from: com.bytedance.android.monitor.lynx.a.a$a  reason: collision with other inner class name */
    public static class C0509a {

        /* renamed from: a  reason: collision with root package name */
        public int f23550a;

        /* renamed from: b  reason: collision with root package name */
        public int f23551b;

        /* renamed from: c  reason: collision with root package name */
        public int f23552c;

        /* renamed from: d  reason: collision with root package name */
        public int f23553d;

        /* renamed from: e  reason: collision with root package name */
        public String f23554e;

        /* renamed from: f  reason: collision with root package name */
        public float f23555f;

        /* renamed from: g  reason: collision with root package name */
        public float f23556g;

        /* renamed from: h  reason: collision with root package name */
        public float f23557h;

        /* renamed from: i  reason: collision with root package name */
        public int f23558i;

        /* renamed from: j  reason: collision with root package name */
        public int f23559j;

        static {
            Covode.recordClassIndex(13988);
        }

        public final String toString() {
            String str;
            String str2;
            if (this.f23558i == 0) {
                StringBuilder append = new StringBuilder("Element{left=").append(this.f23550a).append(", right=").append(this.f23551b).append(", top=").append(this.f23552c).append(", bottom=").append(this.f23553d).append(", result= ");
                if (this.f23559j == 1) {
                    str2 = "validate";
                } else {
                    str2 = "invalidate";
                }
                return append.append(str2).append(", className='").append(this.f23554e).append('\'').append('}').toString();
            }
            StringBuilder append2 = new StringBuilder("Element{left=").append(this.f23550a).append(", right=").append(this.f23551b).append(", top=").append(this.f23552c).append(", bottom=").append(this.f23553d).append(", alpha=").append(this.f23555f).append(", scaleX=").append(this.f23556g).append(", scaleY=").append(this.f23557h).append(", visibility=");
            if (this.f23558i == 4) {
                str = "invisible";
            } else {
                str = "gone";
            }
            return append2.append(str).append(", className='").append(this.f23554e).append('\'').append('}').toString();
        }
    }

    public final void a(C0509a aVar) {
        if (aVar != null) {
            if (this.f23549g == null) {
                this.f23549g = new ArrayList();
            }
            this.f23549g.add(aVar);
        }
    }
}
