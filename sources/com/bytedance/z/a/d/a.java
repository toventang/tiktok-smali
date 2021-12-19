package com.bytedance.z.a.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.z.a.d.b;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f46304a;

    /* renamed from: b  reason: collision with root package name */
    private static int f46305b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static List<C1152a> f46306c;

    /* renamed from: d  reason: collision with root package name */
    private static List<Integer> f46307d;

    static {
        Covode.recordClassIndex(28268);
    }

    public static int a() {
        if (f46305b == -1) {
            f46305b = new File("/sys/devices/system/cpu").listFiles(new FilenameFilter() {
                /* class com.bytedance.z.a.d.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(28269);
                }

                public final boolean accept(File file, String str) {
                    return Pattern.matches("cpu[0-9]", str);
                }
            }).length;
        }
        return f46305b;
    }

    /* renamed from: com.bytedance.z.a.d.a$a  reason: collision with other inner class name */
    public static class C1152a {

        /* renamed from: a  reason: collision with root package name */
        public String f46310a;

        /* renamed from: b  reason: collision with root package name */
        public List<Integer> f46311b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public List<Long> f46312c = new ArrayList();

        static {
            Covode.recordClassIndex(28275);
        }

        public final String toString() {
            return "CpuClusterInfo{name='" + this.f46310a + '\'' + ", affectedCpuList=" + this.f46311b + ", freqList=" + this.f46312c + '}';
        }

        public C1152a(String str) {
            this.f46310a = str;
        }
    }

    public static List<Integer> b() {
        List<Integer> list = f46307d;
        if (list != null) {
            return list;
        }
        if (f46306c == null) {
            f46306c = new ArrayList();
            File[] listFiles = new File("/sys/devices/system/cpu/cpufreq").listFiles(new FilenameFilter() {
                /* class com.bytedance.z.a.d.a.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(28271);
                }

                public final boolean accept(File file, String str) {
                    return Pattern.matches("policy[0-9]", str);
                }
            });
            Arrays.sort(listFiles, new Comparator<File>() {
                /* class com.bytedance.z.a.d.a.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(28272);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(File file, File file2) {
                    return file.getName().compareTo(file2.getName());
                }
            });
            if (listFiles != null) {
                for (File file : listFiles) {
                    C1152a aVar = new C1152a(file.getName());
                    final ArrayList arrayList = new ArrayList();
                    final ArrayList arrayList2 = new ArrayList();
                    b.a(file.getAbsolutePath() + "/scaling_available_frequencies", new b.a() {
                        /* class com.bytedance.z.a.d.a.AnonymousClass5 */

                        static {
                            Covode.recordClassIndex(28273);
                        }

                        @Override // com.bytedance.z.a.d.b.a
                        public final boolean a(String str) {
                            if (str != null && !str.isEmpty()) {
                                for (String str2 : str.split(" ")) {
                                    arrayList.add(Long.valueOf(Long.parseLong(str2)));
                                }
                            }
                            return true;
                        }
                    });
                    b.a(file.getAbsolutePath() + "/affected_cpus", new b.a() {
                        /* class com.bytedance.z.a.d.a.AnonymousClass6 */

                        static {
                            Covode.recordClassIndex(28274);
                        }

                        @Override // com.bytedance.z.a.d.b.a
                        public final boolean a(String str) {
                            if (str != null && !str.isEmpty()) {
                                for (String str2 : str.split(" ")) {
                                    arrayList2.add(Integer.valueOf(Integer.parseInt(str2)));
                                }
                            }
                            return true;
                        }
                    });
                    aVar.f46312c = arrayList;
                    aVar.f46311b = arrayList2;
                    f46306c.add(aVar);
                }
            }
        }
        List<C1152a> list2 = f46306c;
        f46307d = new ArrayList();
        for (C1152a aVar2 : list2) {
            f46307d.add(Integer.valueOf(aVar2.f46311b.size()));
        }
        return f46307d;
    }
}
