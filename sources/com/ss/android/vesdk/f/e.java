package com.ss.android.vesdk.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.bg;
import com.ss.android.vesdk.clipparam.VEClipParam;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.x;
import java.util.ArrayList;
import java.util.List;

public interface e {
    static {
        Covode.recordClassIndex(99437);
    }

    int a(int i2);

    int a(int i2, int i3);

    int a(int i2, int i3, int i4);

    int a(int i2, int i3, int i4, int i5, int i6, boolean z);

    int a(int i2, int i3, int i4, boolean z);

    int a(int i2, int i3, ROTATE_DEGREE rotate_degree);

    int a(int i2, int i3, x.g gVar);

    int a(int i2, int i3, ArrayList<VEClipSourceParam> arrayList, ArrayList<VEClipTimelineParam> arrayList2);

    int a(int i2, int i3, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr);

    int a(bg bgVar);

    int a(bg bgVar, int i2, int i3);

    int a(String str, int i2, int i3, int i4, int i5, boolean z);

    int a(String str, int i2, int i3, boolean z);

    String a(int i2, int i3, int i4, String str);

    boolean a(int i2, int i3, float f2);

    int b(int i2);

    int b(int i2, int i3, int i4);

    int b(int i2, int i3, x.g gVar);

    List<VEClipParam> b(int i2, int i3);

    float c(int i2);
}
