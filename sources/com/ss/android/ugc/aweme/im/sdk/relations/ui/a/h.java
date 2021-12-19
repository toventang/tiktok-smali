package com.ss.android.ugc.aweme.im.sdk.relations.ui.a;

import android.text.TextUtils;
import android.widget.SectionIndexer;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public final class h implements SectionIndexer {

    /* renamed from: a  reason: collision with root package name */
    private String[] f103245a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f103246b;

    /* renamed from: c  reason: collision with root package name */
    private int f103247c;

    static {
        Covode.recordClassIndex(66185);
    }

    public final Object[] getSections() {
        return this.f103245a;
    }

    public final int getPositionForSection(int i2) {
        if (i2 < 0 || i2 >= this.f103245a.length) {
            return -1;
        }
        return this.f103246b[i2];
    }

    public final int getSectionForPosition(int i2) {
        if (i2 < 0 || i2 >= this.f103247c) {
            return -1;
        }
        int binarySearch = Arrays.binarySearch(this.f103246b, i2);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return (-binarySearch) - 2;
    }

    public h(String[] strArr, int[] iArr) {
        int min = Math.min(strArr.length, iArr.length);
        this.f103245a = strArr;
        this.f103246b = new int[min];
        int i2 = 0;
        for (int i3 = 0; i3 < min; i3++) {
            if (TextUtils.isEmpty(this.f103245a[i3])) {
                this.f103245a[i3] = " ";
            } else if (!this.f103245a[i3].equals(" ")) {
                String[] strArr2 = this.f103245a;
                strArr2[i3] = strArr2[i3].trim();
            }
            this.f103246b[i3] = i2;
            i2 += iArr[i3];
        }
        this.f103247c = i2;
    }
}
