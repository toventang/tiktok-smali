package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class a {
    static {
        Covode.recordClassIndex(31426);
    }

    public static int a(Parcel parcel) {
        String str;
        int readInt = parcel.readInt();
        int a2 = a(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            if (valueOf.length() != 0) {
                str = "Expected object header. Got 0x".concat(valueOf);
            } else {
                str = new String("Expected object header. Got 0x");
            }
            throw new C1213a(str, parcel);
        }
        int i2 = a2 + dataPosition;
        if (i2 >= dataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        throw new C1213a(new StringBuilder(54).append("Size read is invalid start=").append(dataPosition).append(" end=").append(i2).toString(), parcel);
    }

    public static void b(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + a(parcel, i2));
    }

    public static boolean c(Parcel parcel, int i2) {
        a(parcel, i2, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static int d(Parcel parcel, int i2) {
        a(parcel, i2, 4);
        return parcel.readInt();
    }

    public static long e(Parcel parcel, int i2) {
        a(parcel, i2, 8);
        return parcel.readLong();
    }

    public static int a(Parcel parcel, int i2) {
        if ((i2 & -65536) != -65536) {
            return (i2 >> 16) & 65535;
        }
        return parcel.readInt();
    }

    public static String f(Parcel parcel, int i2) {
        int a2 = a(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (a2 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + a2);
        return readString;
    }

    public static IBinder g(Parcel parcel, int i2) {
        int a2 = a(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (a2 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + a2);
        return readStrongBinder;
    }

    public static Bundle h(Parcel parcel, int i2) {
        int a2 = a(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (a2 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + a2);
        return readBundle;
    }

    public static String[] i(Parcel parcel, int i2) {
        int a2 = a(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (a2 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + a2);
        return createStringArray;
    }

    public static ArrayList<String> j(Parcel parcel, int i2) {
        int a2 = a(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (a2 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + a2);
        return createStringArrayList;
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.a$a  reason: collision with other inner class name */
    public static class C1213a extends RuntimeException {
        static {
            Covode.recordClassIndex(31427);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C1213a(java.lang.String r5, android.os.Parcel r6) {
            /*
                r4 = this;
                int r3 = r6.dataPosition()
                int r2 = r6.dataSize()
                java.lang.String r0 = java.lang.String.valueOf(r5)
                int r0 = r0.length()
                int r1 = r0 + 41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r1)
                java.lang.StringBuilder r1 = r0.append(r5)
                java.lang.String r0 = " Parcel: pos="
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.StringBuilder r1 = r0.append(r3)
                java.lang.String r0 = " size="
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.a.C1213a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static void k(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            throw new C1213a(new StringBuilder(37).append("Overread allowed size end=").append(i2).toString(), parcel);
        }
    }

    public static <T> T[] b(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int a2 = a(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (a2 == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + a2);
        return tArr;
    }

    public static <T> ArrayList<T> c(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int a2 = a(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (a2 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + a2);
        return createTypedArrayList;
    }

    public static <T extends Parcelable> T a(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int a2 = a(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (a2 == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + a2);
        return createFromParcel;
    }

    public static void b(Parcel parcel, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            throw new C1213a(new StringBuilder(String.valueOf(hexString).length() + 46).append("Expected size ").append(i3).append(" got ").append(i2).append(" (0x").append(hexString).append(")").toString(), parcel);
        }
    }

    public static void a(Parcel parcel, int i2, int i3) {
        int a2 = a(parcel, i2);
        if (a2 != i3) {
            String hexString = Integer.toHexString(a2);
            throw new C1213a(new StringBuilder(String.valueOf(hexString).length() + 46).append("Expected size ").append(i3).append(" got ").append(a2).append(" (0x").append(hexString).append(")").toString(), parcel);
        }
    }
}
