package com.ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.f;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.policy.v4.UpdateModel;
import com.bytedance.geckox.policy.v4.a;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.web.k;
import f.a.b.b;
import f.a.z;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class GeckoCustomRequest implements w {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f120685a = Collections.singletonList(CheckRequestBodyModel.GroupType.NORMAL.getValue());

    /* renamed from: b  reason: collision with root package name */
    private long f120686b = 0;

    static {
        Covode.recordClassIndex(78618);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    private long c() {
        long j2 = this.f120686b;
        if (j2 != 0) {
            return j2;
        }
        Context a2 = d.a();
        try {
            long j3 = a2.getPackageManager().getPackageInfo(a2.getPackageName(), 0).firstInstallTime;
            this.f120686b = j3;
            return j3;
        } catch (Exception unused) {
            return this.f120686b;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        boolean z;
        if (System.currentTimeMillis() - c() <= TimeUnit.DAYS.toMillis(7)) {
            z = true;
        } else {
            z = false;
        }
        if (s.a().booleanValue() || z) {
            f.a();
            String c2 = k.f145061a.c();
            List<String> list = this.f120685a;
            if (!TextUtils.isEmpty("occasion_normal") && !TextUtils.isEmpty(c2)) {
                if (list != null && !list.isEmpty()) {
                    if (a.f30006b == null) {
                        a.f30006b = new ConcurrentHashMap();
                    }
                    com.bytedance.geckox.i.a.a("register group update occasion:".concat("occasion_normal"), c2, list);
                    Map<String, UpdateModel> map = a.f30006b.get("occasion_normal");
                    if (map == null) {
                        Hashtable hashtable = new Hashtable();
                        hashtable.put(c2, new UpdateModel(new CopyOnWriteArrayList(list), null));
                        a.f30006b.put("occasion_normal", hashtable);
                    } else {
                        UpdateModel updateModel = map.get(c2);
                        if (updateModel == null) {
                            map.put(c2, new UpdateModel(new CopyOnWriteArrayList(list), null));
                        } else if (!(updateModel.getGroups() == null && updateModel.getChannels() == null)) {
                            if (updateModel.getGroups() == null) {
                                updateModel.setGroups(new CopyOnWriteArrayList(list));
                            } else {
                                updateModel.getGroups().addAll(list);
                            }
                        }
                    }
                } else if (!TextUtils.isEmpty("occasion_normal") && !TextUtils.isEmpty(c2)) {
                    if (a.f30006b == null) {
                        a.f30006b = new ConcurrentHashMap();
                    }
                    com.bytedance.geckox.i.a.a("register accessKey update occasion:".concat("occasion_normal"), c2);
                    Map<String, UpdateModel> map2 = a.f30006b.get("occasion_normal");
                    if (map2 == null) {
                        Hashtable hashtable2 = new Hashtable();
                        hashtable2.put(c2, new UpdateModel());
                        a.f30006b.put("occasion_normal", hashtable2);
                    } else {
                        map2.put(c2, new UpdateModel());
                    }
                }
            }
            com.bytedance.ies.ugc.appcontext.f.g().b(new z<Boolean>() {
                /* class com.ss.android.ugc.aweme.requesttask.idle.GeckoCustomRequest.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(78619);
                }

                @Override // f.a.z
                public final void onComplete() {
                }

                @Override // f.a.z
                public final void onError(Throwable th) {
                }

                @Override // f.a.z
                public final void onSubscribe(b bVar) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.z
                public final /* synthetic */ void onNext(Boolean bool) {
                    List<GlobalConfigSettings.SyncItem> list;
                    if (bool.booleanValue()) {
                        f a2 = f.a();
                        if (a2.f29847f != null) {
                            a aVar = a2.f29847f;
                            if (!TextUtils.isEmpty("occasion_normal") && aVar.f30008c != null && !aVar.f30008c.isEmpty() && (list = aVar.f30008c.get("occasion_normal")) != null && !list.isEmpty()) {
                                com.bytedance.geckox.i.a.a("registered occasion is triggered:".concat("occasion_normal"), list);
                                aVar.a(7, list, null);
                            }
                        }
                    }
                }
            });
        }
    }
}
