package com.ss.android.ugc.tools.infosticker.view.internal;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.h.a.m;
import f.a.t;
import h.f.b.l;
import h.p;
import java.util.List;

public interface f {
    static {
        Covode.recordClassIndex(98516);
    }

    ViewPager a();

    void a(List<? extends p<a, ? extends h.f.a.a<? extends View>>> list);

    void a(boolean z);

    void b();

    t<p<a, Integer>> c();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final m f149605a;

        /* renamed from: b  reason: collision with root package name */
        public final String f149606b;

        /* renamed from: c  reason: collision with root package name */
        public final String f149607c;

        static {
            Covode.recordClassIndex(98517);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f149605a, aVar.f149605a) && l.a(this.f149606b, aVar.f149606b) && l.a(this.f149607c, aVar.f149607c);
        }

        public final int hashCode() {
            m mVar = this.f149605a;
            int i2 = 0;
            int hashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
            String str = this.f149606b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f149607c;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode2 + i2;
        }

        public final String toString() {
            return "Page(meta=" + this.f149605a + ", name=" + this.f149606b + ", displayName=" + this.f149607c + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(com.ss.android.ugc.tools.h.a.m r2) {
            /*
                r1 = this;
                java.lang.String r0 = r2.f149215e
                r1.<init>(r2, r0, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tools.infosticker.view.internal.f.a.<init>(com.ss.android.ugc.tools.h.a.m):void");
        }

        private a(m mVar, String str, String str2) {
            l.d(mVar, "");
            l.d(str, "");
            l.d(str2, "");
            this.f149605a = mVar;
            this.f149606b = str;
            this.f149607c = str2;
        }
    }
}
