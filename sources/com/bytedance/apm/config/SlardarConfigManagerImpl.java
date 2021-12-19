package com.bytedance.apm.config;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.apm.c;
import com.bytedance.apm.config.g;
import com.bytedance.apm.p.b;
import com.bytedance.apm.q.h;
import com.bytedance.apm.q.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.slardar.config.IConfigManager;
import com.bytedance.services.slardar.config.a;
import com.bytedance.services.slardar.config.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public class SlardarConfigManagerImpl implements IConfigManager {
    private g mSlardarConfigFetcher = new g();

    static {
        Covode.recordClassIndex(14525);
    }

    public JSONObject getConfig() {
        return this.mSlardarConfigFetcher.f24852g;
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean isConfigReady() {
        return this.mSlardarConfigFetcher.f24846a;
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public String queryConfig() {
        return this.mSlardarConfigFetcher.d();
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void fetchConfig() {
        g gVar = this.mSlardarConfigFetcher;
        boolean a2 = gVar.a();
        if (c.b()) {
            if (gVar.f24854i > System.currentTimeMillis()) {
                a2 = true;
            }
            gVar.a(a2);
        }
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public JSONObject getConfigJSON(String str) {
        return this.mSlardarConfigFetcher.b(str);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getServiceSwitch(String str) {
        return this.mSlardarConfigFetcher.a(str);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void unregisterConfigListener(a aVar) {
        g gVar = this.mSlardarConfigFetcher;
        if (aVar != null && gVar.f24858m != null) {
            gVar.f24858m.remove(aVar);
        }
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void unregisterResponseConfigListener(b bVar) {
        if (bVar != null && com.bytedance.b.a.f25824a != null) {
            com.bytedance.b.a.f25824a.remove(bVar);
        }
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getMetricTypeSwitch(String str) {
        g gVar = this.mSlardarConfigFetcher;
        if (gVar.f24849d == null || TextUtils.isEmpty(str) || gVar.f24849d.optInt(str) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getSwitch(String str) {
        g gVar = this.mSlardarConfigFetcher;
        if (TextUtils.isEmpty(str) || gVar.f24852g == null) {
            return false;
        }
        return gVar.f24852g.optBoolean(str);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void registerResponseConfigListener(b bVar) {
        if (bVar != null) {
            if (com.bytedance.b.a.f25824a == null) {
                com.bytedance.b.a.f25824a = new CopyOnWriteArrayList();
            }
            if (!com.bytedance.b.a.f25824a.contains(bVar)) {
                com.bytedance.b.a.f25824a.add(bVar);
            }
        }
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getLogTypeSwitch(String str) {
        g gVar = this.mSlardarConfigFetcher;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals(str, "block_monitor")) {
            str = "caton_monitor";
        }
        if (TextUtils.equals(str, "core_exception_monitor")) {
            return gVar.f24847b;
        }
        if (gVar.f24848c == null || gVar.f24848c.optInt(str) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void registerConfigListener(a aVar) {
        g gVar = this.mSlardarConfigFetcher;
        if (aVar != null) {
            if (gVar.f24858m == null) {
                gVar.f24858m = new CopyOnWriteArrayList();
            }
            if (!gVar.f24858m.contains(aVar)) {
                gVar.f24858m.add(aVar);
            }
            if (gVar.f24846a) {
                aVar.a(gVar.f24852g, gVar.f24853h);
                aVar.d();
            }
        }
    }

    public void forceUpdateFromRemote(com.bytedance.apm.core.c cVar, List<String> list) {
        g gVar = this.mSlardarConfigFetcher;
        gVar.b();
        if (cVar != null) {
            gVar.f24851f = cVar;
        }
        if (!h.a(list)) {
            gVar.f24850e = new ArrayList(list);
        }
        gVar.a(true);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public int getConfigInt(String str, int i2) {
        g gVar = this.mSlardarConfigFetcher;
        if (TextUtils.isEmpty(str) || gVar.f24852g == null) {
            return i2;
        }
        return gVar.f24852g.optInt(str, i2);
    }

    public void initParams(boolean z, com.bytedance.apm.core.c cVar, List<String> list) {
        g gVar = this.mSlardarConfigFetcher;
        gVar.f24856k = z;
        gVar.f24857l = c.b();
        gVar.b();
        gVar.f24851f = cVar;
        if (!h.a(list)) {
            gVar.f24850e = g.a(list);
        }
        if (!gVar.f24855j) {
            gVar.f24855j = true;
            if (gVar.c()) {
                b.a.f25210a.a(gVar);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.apm.setting.update.action");
            g.AnonymousClass1 r1 = new BroadcastReceiver() {
                /* class com.bytedance.apm.config.g.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(14538);
                }

                private static String a(Intent intent, String str) {
                    try {
                        return intent.getStringExtra(str);
                    } catch (Exception unused) {
                        return null;
                    }
                }

                public final void onReceive(Context context, Intent intent) {
                    if (intent != null) {
                        try {
                            String a2 = a(intent, "PROCESS_NAME");
                            String a3 = n.a();
                            if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a3) && !a2.equals(a3)) {
                                b.a.f25210a.a(new Runnable() {
                                    /* class com.bytedance.apm.config.g.AnonymousClass1.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(14539);
                                    }

                                    public final void run() {
                                        try {
                                            g.this.a();
                                        } catch (Throwable unused) {
                                        }
                                    }
                                });
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            };
            if (c.f24685a != null) {
                g.a(c.f24685a, r1, intentFilter);
            }
        }
    }
}
