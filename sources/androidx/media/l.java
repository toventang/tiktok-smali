package androidx.media;

import android.text.TextUtils;
import androidx.core.g.d;
import androidx.media.i;
import com.bytedance.covode.number.Covode;

class l {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f3752a = i.f3748a;

    static {
        Covode.recordClassIndex(1442);
    }

    /* access modifiers changed from: package-private */
    public static class a implements i.b {

        /* renamed from: a  reason: collision with root package name */
        private String f3753a;

        /* renamed from: b  reason: collision with root package name */
        private int f3754b;

        /* renamed from: c  reason: collision with root package name */
        private int f3755c;

        static {
            Covode.recordClassIndex(1443);
        }

        public final int hashCode() {
            return d.a(this.f3753a, Integer.valueOf(this.f3754b), Integer.valueOf(this.f3755c));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (TextUtils.equals(this.f3753a, aVar.f3753a) && this.f3754b == aVar.f3754b && this.f3755c == aVar.f3755c) {
                return true;
            }
            return false;
        }

        a(String str, int i2, int i3) {
            this.f3753a = str;
            this.f3754b = i2;
            this.f3755c = i3;
        }
    }
}
