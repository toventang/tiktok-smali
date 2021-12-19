package com.bytedance.b.f.a;

import com.bytedance.apm.block.i;
import com.bytedance.apm.config.e;
import com.bytedance.apm.config.f;
import com.bytedance.b.f.a.a.a;
import com.bytedance.b.f.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.k;
import org.json.JSONObject;

public final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    e f26240a;

    static {
        Covode.recordClassIndex(15239);
    }

    public d() {
        a.a().b();
        a.a().a(new b() {
            /* class com.bytedance.b.f.a.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15240);
            }

            @Override // com.bytedance.b.f.a.a.b
            public final void a(JSONObject jSONObject) {
                JSONObject a2;
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                boolean z6;
                boolean z7;
                boolean z8;
                boolean z9;
                boolean z10;
                int i2;
                d dVar = d.this;
                if (!(jSONObject == null || (a2 = com.bytedance.b.i.a.a.a(jSONObject, "smooth")) == null)) {
                    dVar.f26240a = new e();
                    boolean z11 = false;
                    if (a2.optInt("enable_stack_sampling", 0) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    dVar.f26240a.f24833a = z;
                    if (a2.optInt("enable_trace", 0) == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    dVar.f26240a.f24834b = z2;
                    dVar.f26240a.f24835c = a2.optLong("atrace_tag", 0);
                    if (a2.optInt("block_dump_stack_enable", 1) == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    dVar.f26240a.f24836d = z3;
                    if (a2.optInt("enable_gfx_monitor", 0) == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    dVar.f26240a.f24837e = z4;
                    dVar.f26240a.f24838f = a2.optInt("block_monitor_mode", 1001);
                    if (a2.optInt("serious_block_enable_upload", 1) == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    dVar.f26240a.f24839g = z5;
                    dVar.f26240a.f24840h = a2.optLong("serious_block_threshold", 4000);
                    if (a2.optInt("slow_method_enable_upload", 0) == 1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    dVar.f26240a.f24841i = z6;
                    if (a2.optInt("drop_enable_upload", 1) == 1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    dVar.f26240a.f24842j = z7;
                    if (a2.optInt("enable_upload", 0) == 1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    dVar.f26240a.f24843k = z8;
                    dVar.f26240a.f24844l = a2.optLong("block_threshold", 2500);
                    long j2 = 1000;
                    dVar.f26240a.f24845m = a2.optLong("drop_threshold", 1000);
                    if (a2.optInt("block_enable_upload", 0) == 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    dVar.f26240a.n = z9;
                    dVar.f26240a.o = a2.optBoolean("drop_slow_method_switch", false);
                    if (a2.optInt("enable_slow_method_ext", 0) == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dVar.f26240a.p = z10;
                    dVar.f26240a.q = a2.optJSONObject("scene_enable_upload");
                    e eVar = dVar.f26240a;
                    if (eVar != null) {
                        long j3 = eVar.f24845m;
                        if (j3 >= 70) {
                            j2 = j3;
                        }
                        i.f24665e = j2;
                        com.bytedance.apm.block.f.a();
                        k.a().f41549e = true;
                        com.bytedance.apm.block.f a3 = com.bytedance.apm.block.f.a();
                        int i3 = eVar.f24838f;
                        if (i3 == 11) {
                            i2 = 2;
                        } else if (i3 == 101) {
                            i2 = 3;
                        } else if (i3 != 1001) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        a3.f24660a = i2;
                        k a4 = k.a();
                        int i4 = a3.f24660a;
                        if (a4.f41549e) {
                            for (com.bytedance.monitor.collector.b bVar : a4.f41546b) {
                                if (bVar != null) {
                                    bVar.a(i4);
                                }
                            }
                        }
                        com.bytedance.apm.f.a(eVar);
                        if (eVar.f24841i && eVar.o) {
                            z11 = true;
                        }
                        com.bytedance.apm.block.e.a(z11, eVar.f24845m, eVar.p);
                    }
                }
            }
        });
    }
}
