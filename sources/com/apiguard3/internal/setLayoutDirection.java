package com.apiguard3.internal;

import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

final class setLayoutDirection extends Thread {
    private static int AGRequest = -370738468;
    private static int AGRequest$Builder = 0;
    private static byte[] addHeader = {-52};
    private static int getHeaders = -477720331;
    private static int getUrl = 53;
    private static int method = 1;
    private static int newBuilder;
    private static int url = 0;
    private final BufferedReader getBody;
    private final StringBuilder getMethod = new StringBuilder();

    static {
        Covode.recordClassIndex(2602);
        newBuilder = 1;
        newBuilder = 73;
    }

    public final String getUrl() {
        int i2 = AGRequest$Builder;
        int i3 = i2 + 47;
        newBuilder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (url + 60) - 1;
        method = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = i2 + 117;
            newBuilder = i6 % 128;
            int i7 = i6 % 2;
        }
        String obj = this.getMethod.toString();
        int i8 = method;
        int i9 = ((i8 | 73) << 1) - (i8 ^ 73);
        url = i9 % 128;
        int i10 = i9 % 2;
        return obj;
    }

    public final void run() {
        MethodCollector.i(2821);
        while (true) {
            try {
                String readLine = this.getBody.readLine();
                if (readLine != null) {
                    int i2 = AGRequest$Builder + 49;
                    newBuilder = i2 % 128;
                    int i3 = i2 % 2;
                    StringBuilder sb = this.getMethod;
                    StringBuilder append = new StringBuilder().append(readLine);
                    int i4 = (370738478 - ((-ExpandableListView.getPackedPositionGroup(0)) ^ -1)) - 1;
                    int i5 = -View.MeasureSpec.getSize(0);
                    int i6 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    int i7 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1));
                    short s = (short) ((i7 ^ 44) + ((i7 & 44) << 1));
                    int i8 = -(ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1));
                    sb.append(append.append(getMethod(i4, (byte) (((i5 | -72) << 1) - (i5 ^ -72)), ((i6 | -54) << 1) - (i6 ^ -54), s, (i8 ^ 477720331) + ((i8 & 477720331) << 1))).toString());
                    int i9 = AGRequest$Builder + 91;
                    newBuilder = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = (method + 106) - 1;
                    url = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    this.getBody.close();
                    int i13 = method;
                    int i14 = (i13 ^ 17) + ((i13 & 17) << 1);
                    url = i14 % 128;
                    int i15 = i14 % 2;
                    MethodCollector.o(2821);
                    return;
                }
            } catch (IOException unused) {
                MethodCollector.o(2821);
                return;
            }
        }
    }

    public setLayoutDirection(InputStream inputStream) {
        this.getBody = new BufferedReader(new InputStreamReader(inputStream));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMethod(int r7, byte r8, int r9, short r10, int r11) {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setLayoutDirection.getMethod(int, byte, int, short, int):java.lang.String");
    }
}
