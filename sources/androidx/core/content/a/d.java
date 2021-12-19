package androidx.core.content.a;

import android.graphics.Shader;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* access modifiers changed from: package-private */
public final class d {
    static {
        Covode.recordClassIndex(713);
    }

    static Shader.TileMode a(int i2) {
        if (i2 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i2 != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int[] f2282a;

        /* renamed from: b  reason: collision with root package name */
        final float[] f2283b;

        static {
            Covode.recordClassIndex(714);
        }

        a(int i2, int i3) {
            this.f2282a = new int[]{i2, i3};
            this.f2283b = new float[]{0.0f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f2282a = new int[size];
            this.f2283b = new float[size];
            for (int i2 = 0; i2 < size; i2++) {
                this.f2282a[i2] = list.get(i2).intValue();
                this.f2283b[i2] = list2.get(i2).floatValue();
            }
        }

        a(int i2, int i3, int i4) {
            this.f2282a = new int[]{i2, i3, i4};
            this.f2283b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007f, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.core.content.a.d.a a(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.a.d.a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.a.d$a");
    }
}
