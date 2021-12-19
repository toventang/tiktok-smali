package com.ss.android.ugc.aweme.commerce.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.utils.cs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public final class i {
    static {
        Covode.recordClassIndex(45175);
    }

    public static String a(Context context) {
        BufferedReader bufferedReader;
        Throwable th;
        InputStreamReader inputStreamReader;
        UnsupportedEncodingException e2;
        IOException e3;
        MethodCollector.i(11372);
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader2 = null;
        try {
            inputStreamReader = new InputStreamReader(context.getResources().getAssets().open("omsdk_v1.js"));
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    } catch (UnsupportedEncodingException e4) {
                        e2 = e4;
                        e2.printStackTrace();
                        cs.a(inputStreamReader);
                        cs.a(bufferedReader);
                        String sb2 = sb.toString();
                        MethodCollector.o(11372);
                        return sb2;
                    } catch (IOException e5) {
                        e3 = e5;
                        try {
                            e3.printStackTrace();
                            cs.a(inputStreamReader);
                            cs.a(bufferedReader);
                            String sb22 = sb.toString();
                            MethodCollector.o(11372);
                            return sb22;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            } catch (UnsupportedEncodingException e6) {
                e2 = e6;
                bufferedReader = null;
                e2.printStackTrace();
                cs.a(inputStreamReader);
                cs.a(bufferedReader);
                String sb222 = sb.toString();
                MethodCollector.o(11372);
                return sb222;
            } catch (IOException e7) {
                e3 = e7;
                bufferedReader = null;
                e3.printStackTrace();
                cs.a(inputStreamReader);
                cs.a(bufferedReader);
                String sb2222 = sb.toString();
                MethodCollector.o(11372);
                return sb2222;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                inputStreamReader2 = inputStreamReader;
                cs.a(inputStreamReader2);
                cs.a(bufferedReader);
                MethodCollector.o(11372);
                throw th;
            }
        } catch (UnsupportedEncodingException e8) {
            e2 = e8;
            inputStreamReader = null;
            bufferedReader = null;
            e2.printStackTrace();
            cs.a(inputStreamReader);
            cs.a(bufferedReader);
            String sb22222 = sb.toString();
            MethodCollector.o(11372);
            return sb22222;
        } catch (IOException e9) {
            e3 = e9;
            inputStreamReader = null;
            bufferedReader = null;
            e3.printStackTrace();
            cs.a(inputStreamReader);
            cs.a(bufferedReader);
            String sb222222 = sb.toString();
            MethodCollector.o(11372);
            return sb222222;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            cs.a(inputStreamReader2);
            cs.a(bufferedReader);
            MethodCollector.o(11372);
            throw th;
        }
        cs.a(inputStreamReader);
        cs.a(bufferedReader);
        String sb2222222 = sb.toString();
        MethodCollector.o(11372);
        return sb2222222;
    }
}
