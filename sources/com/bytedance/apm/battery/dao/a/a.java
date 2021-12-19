package com.bytedance.apm.battery.dao.a;

import android.content.ContentValues;
import com.bytedance.apm.battery.dao.a;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.List;

public class a extends com.bytedance.apm.battery.dao.a<com.bytedance.apm.e.a> implements a.AbstractC0526a<com.bytedance.apm.e.a> {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f24545a;

    /* renamed from: b  reason: collision with root package name */
    private static String f24546b = "_id <= ? ";

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f24547c = {"_id", "front", StringSet.type, "timestamp", "accumulation", "version_id", "source", "status", "scene", "process", "main_process", "sid"};

    /* renamed from: d  reason: collision with root package name */
    private static String f24548d = "main_process = 1 AND delete_flag = 0";

    /* renamed from: e  reason: collision with root package name */
    private static String f24549e = "main_process = 0 AND delete_flag = 0 AND timestamp <= ? ";

    @Override // com.bytedance.apm.battery.dao.a
    public final String a() {
        return "t_battery";
    }

    private a() {
    }

    @Override // com.bytedance.apm.battery.dao.a
    public final String[] b() {
        return f24547c;
    }

    public static a c() {
        if (f24545a == null) {
            synchronized (a.class) {
                if (f24545a == null) {
                    f24545a = new a();
                }
            }
        }
        return f24545a;
    }

    static {
        Covode.recordClassIndex(14456);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.apm.battery.dao.a.AbstractC0526a
    public final /* synthetic */ com.bytedance.apm.e.a a(a.b bVar) {
        boolean z;
        boolean z2;
        long a2 = bVar.a("_id");
        long a3 = bVar.a("front");
        String c2 = bVar.c(StringSet.type);
        long a4 = bVar.a("timestamp");
        long a5 = bVar.a("accumulation");
        long a6 = bVar.a("version_id");
        String c3 = bVar.c("source");
        long a7 = bVar.a("status");
        String c4 = bVar.c("scene");
        int b2 = bVar.b("main_process");
        String c5 = bVar.c("process");
        if (a3 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (a7 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.bytedance.apm.e.a aVar = new com.bytedance.apm.e.a(z, a4, c2, z2, c4, a5, c3);
        aVar.f24913j = c5;
        aVar.f24904a = a2;
        aVar.f24912i = a6;
        boolean z3 = true;
        if (b2 != 1) {
            z3 = false;
        }
        aVar.f24914k = z3;
        aVar.f24915l = bVar.c("sid");
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008c, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long a(com.bytedance.apm.e.a r8) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.battery.dao.a.a.a(com.bytedance.apm.e.a):long");
    }

    public final synchronized void a(long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("delete_flag", (Integer) 1);
        a(contentValues, f24546b, new String[]{String.valueOf(j2)});
    }

    public final synchronized List<com.bytedance.apm.e.a> a(boolean z, long j2) {
        List<com.bytedance.apm.e.a> list;
        if (z) {
            list = a(f24548d, null, "_id", this);
        } else {
            list = a(f24549e, new String[]{String.valueOf(j2)}, "_id", this);
        }
        return list;
    }
}
