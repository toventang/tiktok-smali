package com.ss.android.agilelogger.a.c;

import com.bytedance.covode.number.Covode;

public final class a implements b {
    static {
        Covode.recordClassIndex(36543);
    }

    @Override // com.ss.android.agilelogger.a.b
    public final /* synthetic */ String a(Object obj) {
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj;
        StringBuilder sb = new StringBuilder(256);
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return null;
        }
        if (stackTraceElementArr.length == 1) {
            return "\t─ " + stackTraceElementArr[0].toString();
        }
        int length = stackTraceElementArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 == 0) {
                sb.append("\n");
            }
            if (i2 != length - 1) {
                sb.append("\t├ ");
                sb.append(stackTraceElementArr[i2].toString());
                sb.append("\n");
            } else {
                sb.append("\t└ ");
                sb.append(stackTraceElementArr[i2].toString());
            }
        }
        return sb.toString();
    }
}
