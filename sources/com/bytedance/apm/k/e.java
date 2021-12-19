package com.bytedance.apm.k;

import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.c;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class e implements com.bytedance.services.slardar.config.a {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Boolean> f25098a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Boolean> f25099b;

    /* renamed from: c  reason: collision with root package name */
    public volatile JSONObject f25100c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f25101d;

    /* renamed from: e  reason: collision with root package name */
    private List<String> f25102e;

    /* renamed from: f  reason: collision with root package name */
    private List<String> f25103f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, String> f25104g;

    static {
        Covode.recordClassIndex(14654);
    }

    @Override // com.bytedance.services.slardar.config.a
    public final void d() {
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f25105a = new e((byte) 0);

        static {
            Covode.recordClassIndex(14655);
        }
    }

    private e() {
        this.f25098a = new ConcurrentHashMap();
        this.f25099b = new ConcurrentHashMap();
        this.f25104g = new HashMap();
        LinkedList linkedList = new LinkedList();
        this.f25101d = linkedList;
        linkedList.addAll(Arrays.asList("battery", "smooth", "cpu", "disk", "memory", "thread", "fd", "page_load", "page_load_trace", "start", "start_trace", "traffic", "ui"));
        ArrayList arrayList = new ArrayList();
        this.f25102e = arrayList;
        arrayList.add("enable_upload");
        this.f25102e.add("drop_enable_upload");
        this.f25102e.add("serious_block_enable_upload");
        this.f25102e.add("block_enable_upload");
        this.f25102e.add("slow_method_enable_upload");
        LinkedList linkedList2 = new LinkedList();
        this.f25103f = linkedList2;
        linkedList2.add("enable_perf_data_collect");
        this.f25104g.put("enable_upload", "fps");
        this.f25104g.put("drop_enable_upload", "fps_drop");
        this.f25104g.put("block_enable_upload", "block_monitor");
        this.f25104g.put("slow_method_enable_upload", "drop_frame_stack");
        this.f25104g.put("serious_block_enable_upload", "serious_block_monitor");
        ((IConfigManager) c.a(IConfigManager.class)).registerConfigListener(this);
    }

    /* synthetic */ e(byte b2) {
        this();
    }

    public final boolean a(String str) {
        Boolean bool = this.f25099b.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0106, code lost:
        if (r8 != null) goto L_0x0108;
     */
    @Override // com.bytedance.services.slardar.config.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(org.json.JSONObject r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.k.e.a(org.json.JSONObject, boolean):void");
    }
}
