package com.bytedance.apm.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public final class c implements f {
    static {
        Covode.recordClassIndex(14304);
    }

    static class a implements Comparable<a> {

        /* renamed from: a  reason: collision with root package name */
        public String f24351a;

        /* renamed from: b  reason: collision with root package name */
        public long f24352b;

        /* renamed from: c  reason: collision with root package name */
        public String f24353c;

        static {
            Covode.recordClassIndex(14305);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(a aVar) {
            return (int) (aVar.f24352b - this.f24352b);
        }

        public static a a(File file) {
            String str;
            long j2;
            String[] split = file.getName().split("_");
            try {
                if (split.length >= 4) {
                    j2 = Long.parseLong(split[3]);
                    str = split[5];
                } else {
                    if (split.length > 1) {
                        j2 = Long.parseLong(split[0]);
                        str = split[1];
                    }
                    throw new NumberFormatException();
                }
                if (j2 >= 0) {
                    return new a(file.getAbsolutePath(), j2 / 1000, str);
                }
                throw new NumberFormatException();
            } catch (NumberFormatException unused) {
                return new a("INVALID_FORMAT", -1, "");
            }
        }

        private a(String str, long j2, String str2) {
            this.f24351a = str;
            this.f24352b = j2;
            this.f24353c = str2;
        }
    }

    @Override // com.bytedance.apm.a.f
    public final List<String> a(String str, long j2, long j3) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && j2 <= j3) {
            File file = new File(str);
            if (file.exists() && file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    a a2 = a.a(file2);
                    if (a2.f24351a.endsWith(".hot") && !a2.f24351a.equals("INVALID_FORMAT") && a2.f24352b <= j3) {
                        if (!hashMap.containsKey(a2.f24353c)) {
                            hashMap.put(a2.f24353c, new PriorityQueue());
                        }
                        ((PriorityQueue) hashMap.get(a2.f24353c)).offer(a2);
                    }
                }
                for (PriorityQueue priorityQueue : hashMap.values()) {
                    while (!priorityQueue.isEmpty()) {
                        a aVar = (a) priorityQueue.poll();
                        arrayList.add(aVar.f24351a);
                        if (aVar.f24352b < j2) {
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
