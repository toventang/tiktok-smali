package com.bytedance.b.f.a;

import com.bytedance.apm.q.m;
import com.bytedance.b.d.a.a;
import com.bytedance.b.d.a.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    a f26238a;

    static {
        Covode.recordClassIndex(15237);
    }

    @Override // com.bytedance.b.d.a.b
    public final a a() {
        return this.f26238a;
    }

    public c() {
        com.bytedance.b.f.a.a.a.a().b();
        com.bytedance.b.f.a.a.a.a().a(new com.bytedance.b.f.a.a.b() {
            /* class com.bytedance.b.f.a.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15238);
            }

            @Override // com.bytedance.b.f.a.a.b
            public final void a(JSONObject jSONObject) {
                JSONObject optJSONObject;
                c cVar = c.this;
                JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
                if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("disk")) != null) {
                    a aVar = new a();
                    boolean z = false;
                    aVar.f26122a = optJSONObject.optBoolean("enable_collect_apm6", false);
                    if (optJSONObject.optInt("enable_upload", 0) == 1) {
                        z = true;
                    }
                    aVar.f26133l = z;
                    if (optJSONObject.optInt("dump_threshold") > 0) {
                        aVar.f26123b = ((long) optJSONObject.optInt("dump_threshold")) * 1024 * 1024;
                    }
                    if (optJSONObject.optInt("abnormal_folder_size") > 0) {
                        aVar.f26124c = ((long) optJSONObject.optInt("abnormal_folder_size")) * 1024 * 1024;
                    }
                    aVar.f26125d = ((long) optJSONObject.optInt("abnormal_file_size", 100)) * 1024;
                    if (optJSONObject.optInt("dump_top_count") > 0) {
                        aVar.f26126e = optJSONObject.optInt("dump_top_count");
                    }
                    aVar.f26127f = optJSONObject.optInt("dump_outdated_count", 50);
                    aVar.f26128g = optJSONObject.optInt("dump_top_file_count", 20);
                    aVar.f26129h = optJSONObject.optInt("dump_exception_dir_count", 50);
                    if (optJSONObject.optInt("outdated_days") > 0) {
                        aVar.f26130i = ((long) optJSONObject.optInt("outdated_days")) * 86400000;
                    }
                    aVar.f26131j = m.c(optJSONObject, "disk_customed_paths");
                    aVar.f26132k = m.b(optJSONObject, "ignored_relative_paths");
                    cVar.f26238a = aVar;
                    com.bytedance.b.d.a.f26116a.a(cVar.f26238a);
                }
            }
        });
    }
}
