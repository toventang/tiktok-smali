package com.ss.android.ugc.effectmanager.common.utils;

import android.content.res.AssetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import h.f.b.l;
import h.f.b.z;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public final class AssetUtils {
    public static final AssetUtils INSTANCE = new AssetUtils();

    private AssetUtils() {
    }

    static {
        Covode.recordClassIndex(95325);
    }

    public static final String loadJson(AssetManager assetManager, String str) {
        BufferedReader bufferedReader;
        Throwable th;
        InputStreamReader inputStreamReader;
        Exception e2;
        MethodCollector.i(1602);
        l.c(assetManager, "");
        InputStreamReader inputStreamReader2 = null;
        if (str != null) {
            try {
                inputStreamReader = new InputStreamReader(assetManager.open(str));
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                } catch (Exception e3) {
                    e2 = e3;
                    bufferedReader = null;
                    try {
                        EPLog.e("AssetUtils", "#loadJson::jsonFilePath=".concat(String.valueOf(str)), e2);
                        CloseUtil.close(inputStreamReader);
                        CloseUtil.close(bufferedReader);
                        MethodCollector.o(1602);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStreamReader2 = inputStreamReader;
                        CloseUtil.close(inputStreamReader2);
                        CloseUtil.close(bufferedReader);
                        MethodCollector.o(1602);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = null;
                    inputStreamReader2 = inputStreamReader;
                    CloseUtil.close(inputStreamReader2);
                    CloseUtil.close(bufferedReader);
                    MethodCollector.o(1602);
                    throw th;
                }
            } catch (Exception e4) {
                e2 = e4;
                bufferedReader = null;
                inputStreamReader = null;
                EPLog.e("AssetUtils", "#loadJson::jsonFilePath=".concat(String.valueOf(str)), e2);
                CloseUtil.close(inputStreamReader);
                CloseUtil.close(bufferedReader);
                MethodCollector.o(1602);
                return null;
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
                CloseUtil.close(inputStreamReader2);
                CloseUtil.close(bufferedReader);
                MethodCollector.o(1602);
                throw th;
            }
            try {
                StringBuilder sb = new StringBuilder();
                z.e eVar = new z.e();
                while (true) {
                    T t = (T) bufferedReader.readLine();
                    eVar.element = t;
                    if (t != null) {
                        sb.append((String) eVar.element);
                    } else {
                        String sb2 = sb.toString();
                        CloseUtil.close(inputStreamReader);
                        CloseUtil.close(bufferedReader);
                        MethodCollector.o(1602);
                        return sb2;
                    }
                }
            } catch (Exception e5) {
                e2 = e5;
                EPLog.e("AssetUtils", "#loadJson::jsonFilePath=".concat(String.valueOf(str)), e2);
                CloseUtil.close(inputStreamReader);
                CloseUtil.close(bufferedReader);
                MethodCollector.o(1602);
                return null;
            }
        } else {
            CloseUtil.close(null);
            CloseUtil.close(null);
            MethodCollector.o(1602);
            return null;
        }
    }
}
