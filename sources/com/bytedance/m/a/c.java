package com.bytedance.m.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public final class c {
    static {
        Covode.recordClassIndex(25318);
    }

    public static String a(Context context, String str) {
        MethodCollector.i(8894);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open(str)));
        String str2 = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                str2 = str2 + readLine;
            } else {
                MethodCollector.o(8894);
                return str2;
            }
        }
    }
}
