package com.google.android.gms.internal.g;

import com.bytedance.covode.number.Covode;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final k f50608a;

    /* renamed from: b  reason: collision with root package name */
    private static final int f50609b;

    static final class a extends k {
        static {
            Covode.recordClassIndex(31585);
        }

        @Override // com.google.android.gms.internal.g.k
        public final void a(Throwable th, Throwable th2) {
        }

        a() {
        }
    }

    private static Integer a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e2) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e2.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    static {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.g.i.<clinit>():void");
    }
}
