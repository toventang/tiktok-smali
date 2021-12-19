package com.bytedance.geckox.policy.v4;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.e;
import com.bytedance.geckox.f;
import com.bytedance.geckox.g;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.geckox.statistic.c;
import com.bytedance.geckox.utils.o;
import com.bytedance.q.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static Map<String, Map<String, UpdateModel>> f30006b;

    /* renamed from: a  reason: collision with root package name */
    public e f30007a;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, List<GlobalConfigSettings.SyncItem>> f30008c;

    /* renamed from: d  reason: collision with root package name */
    private AtomicBoolean f30009d = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(17414);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.geckox.policy.v4.a$a  reason: collision with other inner class name */
    public class C0634a extends com.bytedance.geckox.m.a<List<GlobalConfigSettings.SyncItem>> {
        static {
            Covode.recordClassIndex(17416);
        }

        @Override // com.bytedance.geckox.m.a
        public final int a() {
            return 4;
        }

        @Override // com.bytedance.geckox.m.a
        public final void b() {
            Map<String, Object> map = this.f29929d;
            a.this.a(6, (List) this.f29928c, map);
        }

        private C0634a() {
        }

        /* synthetic */ C0634a(a aVar, byte b2) {
            this();
        }
    }

    public a(GeckoGlobalConfig geckoGlobalConfig) {
        e.a a2 = new e.a(geckoGlobalConfig.getContext()).a(geckoGlobalConfig.getAppId());
        a2.f29804j = geckoGlobalConfig.getDeviceId();
        a2.f29795a = geckoGlobalConfig.getNetWork();
        a2.f29803i = geckoGlobalConfig.getAppVersion();
        a2.f29800f = geckoGlobalConfig.getStatisticMonitor();
        a2.f29805k = geckoGlobalConfig.getHost();
        this.f30007a = a2.b("gecko").a("gecko").b();
    }

    private void a(List<GlobalConfigSettings.RequestConfig> list) {
        Map<String, Map<String, UpdateModel>> map;
        if (!(list == null || list.isEmpty() || (map = f30006b) == null)) {
            for (Map.Entry<String, Map<String, UpdateModel>> entry : map.entrySet()) {
                HashMap hashMap = new HashMap();
                Map<String, UpdateModel> value = entry.getValue();
                for (int size = list.size() - 1; size >= 0; size--) {
                    List<GlobalConfigSettings.SyncItem> sync = list.get(size).getSync();
                    for (int size2 = sync.size() - 1; size2 >= 0; size2--) {
                        GlobalConfigSettings.SyncItem syncItem = sync.get(size2);
                        String accessKey = syncItem.getAccessKey();
                        UpdateModel updateModel = value.get(accessKey);
                        if (updateModel != null) {
                            if (updateModel.getGroups() == null && updateModel.getChannels() == null) {
                                GlobalConfigSettings.SyncItem syncItem2 = (GlobalConfigSettings.SyncItem) hashMap.get(accessKey);
                                if (syncItem2 == null) {
                                    hashMap.put(accessKey, new GlobalConfigSettings.SyncItem(accessKey, new ArrayList(syncItem.getGroup()), new ArrayList(syncItem.getTarget())));
                                } else {
                                    syncItem2.getTarget().addAll(syncItem.getTarget());
                                    syncItem2.getGroup().addAll(syncItem.getGroup());
                                }
                                sync.remove(size2);
                            } else {
                                List<String> group = syncItem.getGroup();
                                List<String> target = syncItem.getTarget();
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                if (updateModel.getGroups() != null && !updateModel.getGroups().isEmpty()) {
                                    for (String str : updateModel.getGroups()) {
                                        if (group.contains(str)) {
                                            arrayList.add(str);
                                            group.remove(str);
                                        }
                                    }
                                }
                                if (updateModel.getChannels() != null && !updateModel.getChannels().isEmpty()) {
                                    for (String str2 : updateModel.getChannels()) {
                                        if (target.contains(str2)) {
                                            arrayList2.add(str2);
                                            target.remove(str2);
                                        }
                                    }
                                }
                                if ((group == null || group.isEmpty()) && (target == null || target.isEmpty())) {
                                    sync.remove(size2);
                                }
                                if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                                    GlobalConfigSettings.SyncItem syncItem3 = (GlobalConfigSettings.SyncItem) hashMap.get(accessKey);
                                    if (syncItem3 == null) {
                                        hashMap.put(accessKey, new GlobalConfigSettings.SyncItem(accessKey, arrayList, arrayList2));
                                    } else {
                                        syncItem3.getTarget().addAll(arrayList2);
                                        syncItem3.getGroup().addAll(arrayList);
                                    }
                                }
                            }
                        }
                    }
                    if (sync.isEmpty()) {
                        list.remove(size);
                    }
                }
                if (!hashMap.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        arrayList3.add(entry2.getValue());
                    }
                    if (this.f30008c == null) {
                        this.f30008c = new HashMap();
                    }
                    List<GlobalConfigSettings.SyncItem> list2 = this.f30008c.get(entry.getKey());
                    if (list2 != null) {
                        list2.addAll(arrayList3);
                        arrayList3 = list2;
                    }
                    this.f30008c.put(entry.getKey(), arrayList3);
                }
            }
        }
    }

    public final void a(long j2, GlobalConfigSettings.ReqMeta reqMeta) {
        boolean z;
        if (this.f30007a != null) {
            Object[] objArr = new Object[2];
            objArr[0] = "sync queue enable";
            if (reqMeta.getEnable() == 1) {
                z = true;
            } else {
                z = false;
            }
            objArr[1] = Boolean.valueOf(z);
            com.bytedance.geckox.i.a.a(objArr);
            if (reqMeta.getEnable() != 0 && reqMeta.getQueue() != null && !reqMeta.getQueue().isEmpty() && !this.f30009d.get()) {
                List<GlobalConfigSettings.RequestConfig> queue = reqMeta.getQueue();
                this.f30009d.set(true);
                a(queue);
                com.bytedance.geckox.i.a.a("sync queue filter registered occasion", this.f30008c);
                com.bytedance.geckox.i.a.a("sync queue after filter", queue);
                ArrayList arrayList = new ArrayList();
                long j3 = 1000;
                long currentTimeMillis = (System.currentTimeMillis() - j2) / 1000;
                int i2 = 0;
                int i3 = -1;
                while (i2 < queue.size()) {
                    GlobalConfigSettings.RequestConfig requestConfig = queue.get(i2);
                    long delay = requestConfig.getDelay();
                    if (delay <= currentTimeMillis) {
                        arrayList.addAll(requestConfig.getSync());
                        i3 = i2;
                        i2 = i3;
                    } else {
                        a(0, (delay - currentTimeMillis) * j3, delay, delay, requestConfig.getSync());
                    }
                    i2++;
                    j3 = 1000;
                }
                if (!arrayList.isEmpty()) {
                    a(1, 0, currentTimeMillis, queue.get(i3).getDelay(), arrayList);
                }
            }
        }
    }

    public final void a(int i2, List<GlobalConfigSettings.SyncItem> list, Map<String, Object> map) {
        long j2;
        int i3;
        long j3 = -1;
        if (map != null) {
            if (map.get("bundle_launch_delay") != null) {
                j2 = ((Long) map.get("bundle_launch_delay")).longValue();
            } else {
                j2 = -1;
            }
            if (map.get("bundle_delay_in_queue") != null) {
                j3 = ((Long) map.get("bundle_delay_in_queue")).longValue();
            }
            if (map.get("bundle_is_merged") != null) {
                i3 = ((Integer) map.get("bundle_is_merged")).intValue();
            }
            i3 = 0;
        } else {
            j2 = -1;
            j3 = -1;
            i3 = 0;
        }
        o.a().b().execute(new Runnable(list, 1, i2, j2, j3, i3) {
            /* class com.bytedance.geckox.policy.v4.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f30010a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f30011b = 1;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f30012c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ long f30013d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ long f30014e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ int f30015f;

            static {
                Covode.recordClassIndex(17415);
            }

            public final void run() {
                try {
                    a aVar = a.this;
                    List list = this.f30010a;
                    for (int size = list.size() - 1; size >= 0; size--) {
                        GlobalConfigSettings.SyncItem syncItem = (GlobalConfigSettings.SyncItem) list.get(size);
                        String accessKey = syncItem.getAccessKey();
                        if ((syncItem.getGroup() == null || !syncItem.getGroup().contains("on_demand")) && !f.a().f29842a.containsKey(accessKey) && !f.a().f29843b.containsKey(accessKey)) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(syncItem);
                            if (aVar.f30008c == null) {
                                aVar.f30008c = new HashMap();
                            }
                            aVar.f30008c.put("occasion_gecko_register-".concat(String.valueOf(accessKey)), arrayList);
                            list.remove(size);
                        }
                    }
                    com.bytedance.geckox.i.a.a("sync queue filter unregistered gecko", a.this.f30008c);
                    b<Object> a2 = g.a(a.this.f30007a, this.f30010a, new OptionCheckUpdateParams().setChannelUpdatePriority(this.f30011b), new com.bytedance.geckox.policy.loop.a());
                    a2.a("req_type", Integer.valueOf(this.f30012c));
                    a2.a("delay_from_launch", Long.valueOf(this.f30013d));
                    a2.a("delay_in_queue", Long.valueOf(this.f30014e));
                    a2.a("is_merged", Integer.valueOf(this.f30015f));
                    com.bytedance.geckox.i.a.a("sync queue execute check update,req type:" + this.f30012c, this.f30010a);
                    a2.a((Object) null);
                } catch (Exception e2) {
                    com.bytedance.geckox.i.a.a("sync queue check update failed", e2);
                } finally {
                    c.a();
                }
            }

            {
                this.f30010a = r3;
                this.f30012c = r5;
                this.f30013d = r6;
                this.f30014e = r8;
                this.f30015f = r10;
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: java.util.List<com.bytedance.geckox.settings.model.GlobalConfigSettings$SyncItem> */
    /* JADX WARN: Multi-variable type inference failed */
    private void a(int i2, long j2, long j3, long j4, List<GlobalConfigSettings.SyncItem> list) {
        C0634a aVar = new C0634a(this, (byte) 0);
        aVar.f29928c = list;
        HashMap hashMap = new HashMap();
        hashMap.put("bundle_is_merged", Integer.valueOf(i2));
        hashMap.put("bundle_launch_delay", Long.valueOf(j3));
        hashMap.put("bundle_delay_in_queue", Long.valueOf(j4));
        aVar.f29929d = hashMap;
        com.bytedance.geckox.m.c.a().a(aVar, j2);
    }
}
