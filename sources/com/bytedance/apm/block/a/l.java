package com.bytedance.apm.block.a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final StackTraceElement[] f24641a;

    static {
        Covode.recordClassIndex(14492);
    }

    public l(StackTraceElement[] stackTraceElementArr) {
        this.f24641a = stackTraceElementArr;
    }

    public static List<String> a(l[] lVarArr) {
        StackTraceElement[] stackTraceElementArr;
        ArrayList arrayList = new ArrayList();
        if (lVarArr != null && lVarArr.length > 0) {
            for (l lVar : lVarArr) {
                if (!(lVar == null || (stackTraceElementArr = lVar.f24641a) == null || stackTraceElementArr.length <= 0)) {
                    arrayList.add(a(stackTraceElementArr));
                }
            }
        }
        return arrayList;
    }

    private static String a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(stackTraceElementArr.length * 30);
        int i2 = 0;
        while (i2 < stackTraceElementArr.length && i2 <= 40) {
            if (i2 == 0) {
                "getThreadStackTrace".equals(stackTraceElementArr[0].getMethodName());
            } else if (i2 == 1) {
                if (!"getStackTrace".equals(stackTraceElementArr[1].getMethodName())) {
                }
            } else if (i2 > 3) {
                sb.append("\tat ").append(stackTraceElementArr[i2].getClassName()).append(".").append(stackTraceElementArr[i2].getMethodName()).append("(").append(stackTraceElementArr[i2].getFileName()).append(":").append(stackTraceElementArr[i2].getLineNumber()).append(")\n");
            }
            i2++;
        }
        return sb.toString();
    }
}
