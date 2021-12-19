package com.bytedance.common.a.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    String f26727a;

    /* renamed from: b  reason: collision with root package name */
    List<String> f26728b = new ArrayList();

    static {
        Covode.recordClassIndex(15760);
    }

    private boolean e() {
        if (!d().exists()) {
            return true;
        }
        return false;
    }

    public final void c() {
        if (e()) {
            f();
        }
    }

    public final File d() {
        return new File(com.bytedance.common.a.a.c(), this.f26727a);
    }

    public final boolean b() {
        List<String> a2 = a();
        if (a2.isEmpty()) {
            return false;
        }
        String[] strArr = (String[]) a2.toArray(new String[0]);
        System.currentTimeMillis();
        for (String str : strArr) {
            try {
                Class.forName(str, false, com.bytedance.common.a.a.a().getClassLoader());
            } catch (Throwable unused) {
            }
        }
        System.currentTimeMillis();
        return true;
    }

    private void f() {
        MethodCollector.i(5855);
        System.currentTimeMillis();
        ArrayList<String> arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(com.bytedance.common.a.a.a().getAssets().open(this.f26727a)));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                MethodCollector.o(5855);
                throw th;
            }
        }
        arrayList.size();
        try {
            bufferedReader.close();
        } catch (FileNotFoundException | IOException unused) {
        }
        List<String> list = null;
        for (String str : arrayList) {
            if (str.endsWith("*")) {
                if (list == null) {
                    list = com.bytedance.common.a.a.e();
                }
                String substring = str.substring(0, str.lastIndexOf(42));
                for (String str2 : list) {
                    if (str2.startsWith(substring)) {
                        this.f26728b.add(str2);
                    }
                }
            } else {
                this.f26728b.add(str);
            }
        }
        if (!this.f26728b.isEmpty()) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(d(), false));
                try {
                    for (String str3 : this.f26728b) {
                        bufferedWriter.write(str3);
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th4) {
                        th.addSuppressed(th4);
                    }
                    MethodCollector.o(5855);
                    throw th3;
                }
            } catch (IOException unused2) {
            }
        }
        arrayList.size();
        this.f26728b.size();
        System.currentTimeMillis();
        d().getAbsolutePath();
        MethodCollector.o(5855);
    }

    public final List<String> a() {
        MethodCollector.i(5803);
        if (!this.f26728b.isEmpty()) {
            List<String> list = this.f26728b;
            MethodCollector.o(5803);
            return list;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(d()));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    arrayList.add(readLine);
                } else {
                    try {
                        break;
                    } catch (FileNotFoundException | IOException unused) {
                        z = false;
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                MethodCollector.o(5803);
                throw th;
            }
        }
        bufferedReader.close();
        if (!z) {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(com.bytedance.common.a.a.a().getAssets().open(this.f26727a)));
            while (true) {
                try {
                    String readLine2 = bufferedReader2.readLine();
                    if (readLine2 == null) {
                        try {
                            break;
                        } catch (FileNotFoundException | IOException unused2) {
                        }
                    } else if (!readLine2.endsWith("*")) {
                        arrayList.add(readLine2);
                    }
                } catch (Throwable th3) {
                    try {
                        bufferedReader2.close();
                    } catch (Throwable th4) {
                        th.addSuppressed(th4);
                    }
                    MethodCollector.o(5803);
                    throw th3;
                }
            }
            bufferedReader2.close();
        }
        this.f26728b.addAll(arrayList);
        List<String> list2 = this.f26728b;
        MethodCollector.o(5803);
        return list2;
    }

    a(String str) {
        this.f26727a = str;
    }
}
