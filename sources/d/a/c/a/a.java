package d.a.c.a;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f156588a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f156589b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final String f156590c = f156590c;

    private a() {
    }

    static {
        Covode.recordClassIndex(103971);
        int[] iArr = new int[256];
        int i2 = 0;
        do {
            iArr[i2] = -1;
            i2++;
        } while (i2 <= 255);
        int length = f156590c.length();
        for (int i3 = 0; i3 < length; i3++) {
            iArr[f156590c.charAt(i3)] = i3;
        }
        f156588a = iArr;
    }
}
