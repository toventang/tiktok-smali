package com.bytedance.android.monitorV2.lynx.a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f24022a;

    /* renamed from: b  reason: collision with root package name */
    public float f24023b;

    /* renamed from: c  reason: collision with root package name */
    public int f24024c;

    /* renamed from: d  reason: collision with root package name */
    public int f24025d;

    /* renamed from: e  reason: collision with root package name */
    public int f24026e;

    /* renamed from: f  reason: collision with root package name */
    public int f24027f;

    /* renamed from: g  reason: collision with root package name */
    public List<C0515a> f24028g;

    static {
        Covode.recordClassIndex(14169);
    }

    public final String a() {
        return "BlankDetectData{template='" + this.f24022a + '\'' + ", percentage=" + this.f24023b + ", width=" + this.f24024c + ", height=" + this.f24025d + ", alpha=" + this.f24026e + ", elementCount=" + this.f24027f + '}';
    }

    public String toString() {
        return "BlankDetectData{template='" + this.f24022a + '\'' + ", percentage=" + this.f24023b + ", width=" + this.f24024c + ", height=" + this.f24025d + ", alpha=" + this.f24026e + ", elementCount=" + this.f24027f + ", dataList=" + this.f24028g + '}';
    }

    /* renamed from: com.bytedance.android.monitorV2.lynx.a.a$a  reason: collision with other inner class name */
    public static class C0515a {

        /* renamed from: a  reason: collision with root package name */
        public int f24029a;

        /* renamed from: b  reason: collision with root package name */
        public int f24030b;

        /* renamed from: c  reason: collision with root package name */
        public int f24031c;

        /* renamed from: d  reason: collision with root package name */
        public int f24032d;

        /* renamed from: e  reason: collision with root package name */
        public String f24033e;

        /* renamed from: f  reason: collision with root package name */
        public float f24034f;

        /* renamed from: g  reason: collision with root package name */
        public float f24035g;

        /* renamed from: h  reason: collision with root package name */
        public float f24036h;

        /* renamed from: i  reason: collision with root package name */
        public int f24037i;

        /* renamed from: j  reason: collision with root package name */
        public int f24038j;

        static {
            Covode.recordClassIndex(14170);
        }

        public final String toString() {
            String str;
            String str2;
            if (this.f24037i == 0) {
                StringBuilder append = new StringBuilder("Element{left=").append(this.f24029a).append(", right=").append(this.f24030b).append(", top=").append(this.f24031c).append(", bottom=").append(this.f24032d).append(", result= ");
                if (this.f24038j == 1) {
                    str2 = "validate";
                } else {
                    str2 = "invalidate";
                }
                return append.append(str2).append(", className='").append(this.f24033e).append('\'').append('}').toString();
            }
            StringBuilder append2 = new StringBuilder("Element{left=").append(this.f24029a).append(", right=").append(this.f24030b).append(", top=").append(this.f24031c).append(", bottom=").append(this.f24032d).append(", alpha=").append(this.f24034f).append(", scaleX=").append(this.f24035g).append(", scaleY=").append(this.f24036h).append(", visibility=");
            if (this.f24037i == 4) {
                str = "invisible";
            } else {
                str = "gone";
            }
            return append2.append(str).append(", className='").append(this.f24033e).append('\'').append('}').toString();
        }
    }

    public final void a(C0515a aVar) {
        if (aVar != null) {
            if (this.f24028g == null) {
                this.f24028g = new ArrayList();
            }
            this.f24028g.add(aVar);
        }
    }
}
