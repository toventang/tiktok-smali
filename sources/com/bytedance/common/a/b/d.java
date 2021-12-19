package com.bytedance.common.a.b;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.a.a.b;
import com.bytedance.common.a.b;
import com.bytedance.common.a.c;
import com.bytedance.common.a.c.a;
import com.bytedance.common.a.d.b;
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
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static int f26713a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static int f26714b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static int f26715c = 3;

    /* renamed from: d  reason: collision with root package name */
    public static int f26716d = 4;

    /* renamed from: e  reason: collision with root package name */
    public static int f26717e = 5;

    /* renamed from: f  reason: collision with root package name */
    public static int f26718f = 101;

    /* renamed from: g  reason: collision with root package name */
    public static int f26719g = 102;

    /* renamed from: h  reason: collision with root package name */
    public static int f26720h = 103;

    /* renamed from: i  reason: collision with root package name */
    public static int f26721i = 104;

    /* renamed from: j  reason: collision with root package name */
    public static int f26722j = 107;

    /* renamed from: k  reason: collision with root package name */
    public static int f26723k = 108;

    /* renamed from: l  reason: collision with root package name */
    List<String> f26724l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    Set<String> f26725m = new HashSet();
    String n = "none";
    String o = "0";
    final Context p;
    boolean q;
    boolean r;
    String s;
    boolean t;
    boolean u;
    boolean v;
    List<String> w = Collections.emptyList();
    List<a> x = new ArrayList();

    static {
        Covode.recordClassIndex(15757);
    }

    private int b() {
        String str;
        MethodCollector.i(6547);
        if (!com.bytedance.common.a.d.d.a() && !com.bytedance.common.a.d.d.b() && !com.bytedance.common.a.d.d.c()) {
            int i2 = f26718f;
            MethodCollector.o(6547);
            return i2;
        } else if (this.f26725m.isEmpty()) {
            int i3 = f26717e;
            MethodCollector.o(6547);
            return i3;
        } else {
            File file = new File(com.bytedance.common.a.a.c(), "cart_" + this.n + "_" + this.o + ".prof");
            if (this.r || !b.c(file)) {
                File file2 = new File(com.bytedance.common.a.a.c(), "cart.list");
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2, false));
                    try {
                        for (String str2 : this.f26725m) {
                            StringBuilder append = new StringBuilder("L").append(str2.replace('.', '/'));
                            if (this.v) {
                                str = ";->*";
                            } else {
                                str = ";";
                            }
                            bufferedWriter.write(append.append(str).toString());
                            bufferedWriter.newLine();
                        }
                        bufferedWriter.flush();
                        bufferedWriter.close();
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        MethodCollector.o(6547);
                        throw th;
                    }
                } catch (IOException unused) {
                }
                if (!b.c(file2)) {
                    int i4 = f26719g;
                    MethodCollector.o(6547);
                    return i4;
                }
                if (this.s == null) {
                    this.s = com.bytedance.common.a.a.a().getPackageCodePath();
                }
                String str3 = this.s;
                if (b.c(file2) && !TextUtils.isEmpty(str3)) {
                    File file3 = new File(str3);
                    if (file3.exists() && new b.a().a("--create-profile-from=" + file2.toString()).a("--apk=" + file3.toString()).a("--dex-location=" + file3.getName()).a("--reference-profile-file=" + file.toString()).a().a() == 0) {
                        if (!b.a.a(file, new File("/data/misc/profiles/cur/" + (Process.myUid() / 100000) + "/" + com.bytedance.common.a.a.b() + "/primary.prof"))) {
                            int i5 = f26721i;
                            MethodCollector.o(6547);
                            return i5;
                        } else if (!this.q) {
                            int i6 = f26714b;
                            MethodCollector.o(6547);
                            return i6;
                        } else if (com.bytedance.common.a.a.a.a()) {
                            int i7 = f26713a;
                            MethodCollector.o(6547);
                            return i7;
                        } else {
                            int i8 = f26723k;
                            MethodCollector.o(6547);
                            return i8;
                        }
                    }
                }
                int i9 = f26720h;
                MethodCollector.o(6547);
                return i9;
            } else if (new File(com.bytedance.common.a.a.d()).exists()) {
                file.getAbsolutePath();
                int i10 = f26715c;
                MethodCollector.o(6547);
                return i10;
            } else {
                file.getAbsolutePath();
                int i11 = f26716d;
                MethodCollector.o(6547);
                return i11;
            }
        }
    }

    public final int a() {
        MethodCollector.i(6415);
        boolean z = true;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 21) {
            long currentTimeMillis = System.currentTimeMillis();
            System.currentTimeMillis();
            for (a aVar : this.x) {
                aVar.c();
                this.f26725m.addAll(aVar.a());
                aVar.a().size();
                aVar.d().getAbsolutePath();
            }
            File file = new File(com.bytedance.common.a.a.c(), "classes_" + this.n + "_" + this.o + ".list");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        this.f26725m.add(readLine);
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
                    MethodCollector.o(6415);
                    throw th;
                }
            }
            bufferedReader.close();
            if (z) {
                this.f26725m.size();
                file.getAbsolutePath();
                System.currentTimeMillis();
            } else {
                for (String str : this.w) {
                    ArrayList arrayList = new ArrayList();
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(com.bytedance.common.a.a.a().getAssets().open(str)));
                    while (true) {
                        try {
                            String readLine2 = bufferedReader2.readLine();
                            if (readLine2 == null) {
                                break;
                            }
                            arrayList.add(readLine2);
                        } catch (Throwable th3) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable th4) {
                                th.addSuppressed(th4);
                            }
                            MethodCollector.o(6415);
                            throw th3;
                        }
                    }
                    arrayList.size();
                    this.f26724l.addAll(arrayList);
                    try {
                        bufferedReader2.close();
                    } catch (FileNotFoundException | IOException unused2) {
                    }
                }
                List<String> list = null;
                for (String str2 : this.f26724l) {
                    if (str2.endsWith("*")) {
                        if (list == null) {
                            list = com.bytedance.common.a.a.e();
                        }
                        String substring = str2.substring(0, str2.lastIndexOf(42));
                        for (String str3 : list) {
                            if (str3.startsWith(substring)) {
                                this.f26725m.add(str3);
                            }
                        }
                    } else {
                        this.f26725m.add(str2);
                    }
                }
                if (!this.f26725m.isEmpty()) {
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false));
                        try {
                            for (String str4 : this.f26725m) {
                                bufferedWriter.write(str4);
                                bufferedWriter.newLine();
                            }
                            bufferedWriter.close();
                        } catch (Throwable th5) {
                            try {
                                bufferedWriter.close();
                            } catch (Throwable th6) {
                                th.addSuppressed(th6);
                            }
                            MethodCollector.o(6415);
                            throw th5;
                        }
                    } catch (IOException unused3) {
                    }
                }
                this.f26724l.size();
                this.f26725m.size();
                System.currentTimeMillis();
                file.getAbsolutePath();
            }
            if (this.t) {
                a((String[]) this.f26725m.toArray(new String[0]));
            }
            if (!this.u) {
                i2 = b();
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("commit_took", currentTimeMillis2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("commit_ret", i2);
                c.a().a("editor_commit", jSONObject2, jSONObject, (JSONObject) null);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            MethodCollector.o(6415);
            return i2;
        }
        int i3 = f26718f;
        MethodCollector.o(6415);
        return i3;
    }

    public final void a(a aVar) {
        if (aVar != null) {
            this.x.add(aVar);
        }
    }

    private static void a(String[] strArr) {
        System.currentTimeMillis();
        for (String str : strArr) {
            try {
                Class.forName(str, false, com.bytedance.common.a.a.a().getClassLoader());
            } catch (Throwable unused) {
            }
        }
        System.currentTimeMillis();
    }

    public d(Context context) {
        this.p = context;
    }
}
