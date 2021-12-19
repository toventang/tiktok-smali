package com.aweme.storage;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static long f5966a;

    /* renamed from: b  reason: collision with root package name */
    public static long f5967b;

    /* renamed from: c  reason: collision with root package name */
    public static List<String> f5968c;

    static {
        Covode.recordClassIndex(2805);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f5969a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f5970b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private String f5971c;

        /* renamed from: d  reason: collision with root package name */
        private a f5972d;

        /* renamed from: e  reason: collision with root package name */
        private String f5973e;

        static {
            Covode.recordClassIndex(2806);
        }

        /* access modifiers changed from: package-private */
        public final boolean a() {
            if (this.f5969a > d.f5966a) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final String b() {
            String str = this.f5973e;
            if (str != null) {
                return str;
            }
            if (this.f5972d == null) {
                this.f5973e = this.f5971c;
            } else {
                this.f5973e = this.f5972d.b() + File.separator + this.f5971c;
            }
            return this.f5973e;
        }

        /* access modifiers changed from: package-private */
        public final JSONObject c() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(StringSet.name, this.f5971c);
                jSONObject.put("size", this.f5969a);
                List<a> list = this.f5970b;
                if (list != null && list.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (a aVar : this.f5970b) {
                        if (aVar != null) {
                            jSONArray.put(aVar.c());
                        }
                    }
                    jSONObject.put("child", jSONArray);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return jSONObject;
        }

        /* access modifiers changed from: package-private */
        public final void a(a aVar) {
            this.f5970b.add(aVar);
        }

        static a a(JSONObject jSONObject, a aVar) {
            if (jSONObject == null) {
                return null;
            }
            try {
                String optString = jSONObject.optString(StringSet.name);
                long optLong = jSONObject.optLong("size", 0);
                if (optString == null) {
                    return null;
                }
                a aVar2 = new a(optString, optLong, aVar);
                if (aVar != null) {
                    aVar.a(aVar2);
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("child");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                        if (jSONObject2 != null) {
                            a(jSONObject2, aVar2);
                        }
                    }
                }
                return aVar2;
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }

        a(String str, long j2, a aVar) {
            this.f5971c = str;
            this.f5969a = j2;
            this.f5972d = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public enum b {
        p,
        e;

        static {
            Covode.recordClassIndex(2807);
        }
    }

    static a a(String str) {
        Throwable th;
        FileInputStream fileInputStream;
        FileNotFoundException e2;
        IOException e3;
        Exception e4;
        MethodCollector.i(10675);
        File file = new File(str);
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            MethodCollector.o(10675);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                a a2 = a.a(new JSONObject(new String(bArr, "utf-8")), null);
                try {
                    fileInputStream.close();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                MethodCollector.o(10675);
                return a2;
            } catch (FileNotFoundException e6) {
                e2 = e6;
                e2.printStackTrace();
                fileInputStream.close();
                MethodCollector.o(10675);
                return null;
            } catch (IOException e7) {
                e3 = e7;
                e3.printStackTrace();
                fileInputStream.close();
                MethodCollector.o(10675);
                return null;
            } catch (Exception e8) {
                e4 = e8;
                try {
                    e4.printStackTrace();
                    try {
                        fileInputStream.close();
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                    MethodCollector.o(10675);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    try {
                        fileInputStream2.close();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    MethodCollector.o(10675);
                    throw th;
                }
            }
        } catch (FileNotFoundException e11) {
            e2 = e11;
            fileInputStream = null;
            e2.printStackTrace();
            fileInputStream.close();
            MethodCollector.o(10675);
            return null;
        } catch (IOException e12) {
            e3 = e12;
            fileInputStream = null;
            e3.printStackTrace();
            fileInputStream.close();
            MethodCollector.o(10675);
            return null;
        } catch (Exception e13) {
            e4 = e13;
            fileInputStream = null;
            e4.printStackTrace();
            fileInputStream.close();
            MethodCollector.o(10675);
            return null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2.close();
            MethodCollector.o(10675);
            throw th;
        }
    }

    static a a(File file, a aVar, b bVar) {
        List<String> list;
        String name;
        File[] listFiles;
        if (file == null || !file.exists()) {
            return null;
        }
        if (file.isFile() || ((list = f5968c) != null && list.contains(file.getName()))) {
            return null;
        }
        if (aVar == null) {
            name = bVar.name();
        } else {
            name = file.getName();
        }
        a aVar2 = new a(name, e.a(file), aVar);
        if (aVar != null) {
            aVar.a(aVar2);
        }
        if (file.isFile()) {
            return null;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                a(file2, aVar2, bVar);
            }
        }
        return aVar2;
    }

    static void a(a aVar, a aVar2, List<a> list) {
        if (!(aVar == null || aVar2 == null || list == null)) {
            if (aVar2.f5969a - aVar.f5969a > f5966a) {
                list.add(aVar2);
            }
            List<a> list2 = aVar2.f5970b;
            if (!(list2 == null || list2.isEmpty())) {
                List<a> list3 = aVar.f5970b;
                if (list3 == null || list3.isEmpty()) {
                    for (a aVar3 : list2) {
                        if (aVar3 != null && aVar3.a()) {
                            list.add(aVar3);
                        }
                    }
                    return;
                }
                for (a aVar4 : list2) {
                    if (aVar4 != null) {
                        Iterator<a> it = list3.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            a next = it.next();
                            if (next != null && aVar4.b().equals(next.b())) {
                                a(next, aVar4, list);
                                break;
                            }
                            i2++;
                        }
                        if (i2 >= list3.size() && aVar4.a()) {
                            list.add(aVar4);
                        }
                    }
                }
            }
        }
    }
}
