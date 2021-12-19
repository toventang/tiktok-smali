package com.bytedance.android.livesdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.android.livesdk.aa.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import org.json.JSONObject;

public final class af {
    static {
        Covode.recordClassIndex(13123);
    }

    public static Object a(String str, int i2) {
        File[] listFiles;
        MethodCollector.i(13075);
        File file = new File(str);
        JSONObject jSONObject = null;
        if (file.exists() && !file.isFile() && (listFiles = file.listFiles()) != null) {
            if (listFiles.length == 1) {
                try {
                    g.a(listFiles[0].getPath(), str);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            HashMap<String, Bitmap> hashMap = new HashMap<>();
            String str2 = "";
            boolean z = false;
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (file2.isDirectory()) {
                    File[] listFiles2 = file2.listFiles();
                    for (File file3 : listFiles2) {
                        String name2 = file3.getName();
                        if (name2.contains(".png")) {
                            hashMap.put(name2, BitmapFactory.decodeFile(file3.getAbsolutePath()));
                        }
                    }
                } else if (name.contains(".json") && !z) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        }
                        bufferedReader.close();
                        fileInputStream.close();
                        str2 = sb.toString();
                        jSONObject = new JSONObject(sb.toString());
                        z = true;
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            }
            a aVar = new a();
            aVar.f13386a = i2;
            aVar.f13387b = str;
            aVar.f13388c = jSONObject;
            aVar.f13389d = str2;
            aVar.f13390e = hashMap;
            MethodCollector.o(13075);
            return aVar;
        }
        MethodCollector.o(13075);
        return null;
    }
}
