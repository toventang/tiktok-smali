package com.ss.android.ugc.aweme.friends.a;

import android.text.TextUtils;
import android.widget.SectionIndexer;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public final class c implements SectionIndexer {

    /* renamed from: a  reason: collision with root package name */
    private String[] f96753a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f96754b;

    /* renamed from: c  reason: collision with root package name */
    private int f96755c;

    static {
        Covode.recordClassIndex(61402);
    }

    public final Object[] getSections() {
        return this.f96753a;
    }

    public final int getPositionForSection(int i2) {
        if (i2 < 0 || i2 >= this.f96753a.length) {
            return -1;
        }
        return this.f96754b[i2];
    }

    public final int getSectionForPosition(int i2) {
        if (i2 < 0 || i2 >= this.f96755c) {
            return -1;
        }
        int binarySearch = Arrays.binarySearch(this.f96754b, i2);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return (-binarySearch) - 2;
    }

    public final int a(int i2) {
        if (i2 < 0 || i2 >= this.f96755c) {
            return -1;
        }
        int[] iArr = this.f96754b;
        int i3 = 0;
        int length = iArr.length - 1;
        while (true) {
            if (i3 <= length) {
                int i4 = (i3 + length) >>> 1;
                if (i2 >= iArr[i4]) {
                    if (i2 <= iArr[i4]) {
                        i3 = i4;
                        break;
                    }
                    i3 = i4 + 1;
                } else {
                    length = i4 - 1;
                }
            } else if (i3 == iArr.length || iArr[i3] > i2) {
                i3--;
            }
        }
        if (i3 >= 0) {
            return i3;
        }
        return (-i3) - 2;
    }

    public c(String[] strArr, int[] iArr) {
        int min = Math.min(strArr.length, iArr.length);
        this.f96753a = strArr;
        this.f96754b = new int[min];
        int i2 = 0;
        for (int i3 = 0; i3 < min; i3++) {
            if (TextUtils.isEmpty(this.f96753a[i3])) {
                this.f96753a[i3] = " ";
            } else if (!this.f96753a[i3].equals(" ")) {
                String[] strArr2 = this.f96753a;
                strArr2[i3] = strArr2[i3].trim();
            }
            this.f96754b[i3] = i2;
            i2 += iArr[i3];
        }
        this.f96755c = i2;
    }
}
