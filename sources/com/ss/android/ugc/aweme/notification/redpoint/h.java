package com.ss.android.ugc.aweme.notification.redpoint;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.e.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.api.a.a;
import com.ss.android.ugc.aweme.notice.api.ab.c;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.api.bean.f;
import com.ss.android.ugc.aweme.notice.api.bean.j;
import com.ss.android.ugc.aweme.notice.api.bean.m;
import com.ss.android.ugc.aweme.notice.api.count.OldRedPointService;
import com.ss.android.ugc.aweme.notice.api.count.RedPointService;
import com.ss.android.ugc.aweme.notice.api.d.d;
import com.ss.android.ugc.aweme.notice.api.e.i;
import com.ss.android.ugc.aweme.notice.api.e.q;
import com.ss.android.ugc.aweme.notice.repo.api.NotificationApi;
import com.ss.android.ugc.aweme.notification.e.a.b;
import com.ss.android.ugc.aweme.utils.in;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class h implements WeakHandler.IHandler, a, OldRedPointService, RedPointService {

    /* renamed from: d  reason: collision with root package name */
    private static long f113812d = System.currentTimeMillis();

    /* renamed from: j  reason: collision with root package name */
    private static volatile h f113813j;

    /* renamed from: a  reason: collision with root package name */
    public boolean f113814a;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray<b> f113815b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    public HashMap<Integer, Integer> f113816c;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray<Integer> f113817e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    private HashMap<Integer, Integer> f113818f;

    /* renamed from: g  reason: collision with root package name */
    private SharedPreferences f113819g;

    /* renamed from: h  reason: collision with root package name */
    private Handler f113820h = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: i  reason: collision with root package name */
    private boolean f113821i = false;

    static {
        Covode.recordClassIndex(73193);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.RedPointService, com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void a() {
        this.f113817e.clear();
        if (!this.f113814a) {
            SharedPreferences.Editor edit = this.f113819g.edit();
            edit.clear();
            com.bytedance.common.utility.e.a.a(edit);
        }
        b.a("RedPointManager", "clearNoticeCountMessage with all type");
    }

    public static h b() {
        MethodCollector.i(2591);
        if (f113813j == null) {
            synchronized (h.class) {
                try {
                    if (f113813j == null) {
                        f113813j = new h();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2591);
                    throw th;
                }
            }
        }
        h hVar = f113813j;
        MethodCollector.o(2591);
        return hVar;
    }

    private h() {
        if (d.a(com.bytedance.ies.ugc.appcontext.d.a())) {
            this.f113814a = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);
        }
        Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
        i iVar = i.f112718b;
        iVar.f112719a.add(new com.ss.android.ugc.aweme.notice.api.a.b());
        q.f112739f.a(f.NOTICE, this);
        if (!this.f113814a) {
            this.f113819g = com.ss.android.ugc.aweme.bf.d.a(a2, "red-point-cache", 0);
            c();
        }
    }

    private void c() {
        for (Map.Entry<String, ?> entry : this.f113819g.getAll().entrySet()) {
            try {
                String key = entry.getKey();
                int intValue = ((Integer) entry.getValue()).intValue();
                if (key.startsWith("unread_")) {
                    this.f113817e.append(Integer.valueOf(key.substring(7)).intValue(), Integer.valueOf(intValue));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.RedPointService, com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void a(boolean z) {
        this.f113821i = z;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object c(int i2) {
        d(i2);
        return null;
    }

    private static String f(int i2) {
        return "unread_".concat(String.valueOf(i2));
    }

    private boolean e(int i2) {
        if (i2 == 11) {
            if (a(i2) <= 0 || a(998) <= 0) {
                return false;
            }
            return true;
        } else if (a(i2) > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.RedPointService, com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final int b(int i2) {
        if (this.f113817e.get(i2) == null) {
            return 0;
        }
        return this.f113817e.get(i2).intValue();
    }

    private void d(final int i2) {
        if (com.ss.android.ugc.aweme.notice.api.ab.b.b()) {
            a.a(i2);
            return;
        }
        n.a().a(this.f113820h, new Callable() {
            /* class com.ss.android.ugc.aweme.notification.redpoint.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(73194);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return NotificationApi.a(i2);
            }
        }, 0);
        b.a("RedPointManager", "queryUnreadNotifyCount, source: ".concat(String.valueOf(i2)));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.RedPointService, com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final int a(int i2) {
        List<Integer> a2 = f.a(i2, null);
        if (a2.isEmpty()) {
            return b(i2) + 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < a2.size(); i4++) {
            i3 += b(a2.get(i4).intValue());
        }
        return i3;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.RedPointService, com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void a(Message message) {
        if (com.ss.android.ugc.aweme.notice.api.ab.b.b()) {
            a.f113788b.a((NoticeList) message.obj);
            return;
        }
        handleMsg(message);
        b.a("RedPointManager", "initNoticeCountFromCombine sync");
    }

    @Override // com.ss.android.ugc.aweme.notice.api.a.a
    public final void a(com.ss.android.ugc.aweme.notice.api.bean.b bVar) {
        boolean z;
        if (c.a() == c.f112659a || c.a() == c.f112660b || c.a() == c.f112661c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.ss.android.ugc.aweme.common.f.c("RedPointManager", "onMessage ignored by reversing ws");
        } else if (bVar instanceof com.ss.android.ugc.aweme.notice.api.bean.h) {
            com.ss.android.ugc.aweme.notice.api.bean.h hVar = (com.ss.android.ugc.aweme.notice.api.bean.h) bVar;
            b.a("RedPointManager", "notice type " + hVar.f112680a + " count " + hVar.f112681b);
            if ((hVar.f112680a != 40 && hVar.f112680a != 41) || com.ss.android.ugc.aweme.notification.ab.b.f113114a.getShowRedDotType() != 3) {
                b(hVar.f112680a, hVar.f112681b);
                this.f113817e.put(hVar.f112680a, Integer.valueOf(hVar.f112681b));
                if (!this.f113814a) {
                    SharedPreferences.Editor edit = this.f113819g.edit();
                    edit.putInt(f(hVar.f112680a), hVar.f112681b);
                    com.bytedance.common.utility.e.a.a(edit);
                }
                b.a("RedPointManager", "setNoticeCountMessage with message group: " + hVar.f112680a + "count:" + hVar.f112681b);
                a(false, 2);
                if (hVar.f112680a == 100) {
                    ((com.ss.android.ugc.aweme.notice.api.d.a) ServiceManager.get().getService(com.ss.android.ugc.aweme.notice.api.d.a.class)).b();
                }
                int i2 = hVar.f112680a;
                b bVar2 = this.f113815b.get(2);
                if (bVar2 != null) {
                    bVar2.a(hVar);
                }
                if (!g.b(i2) && e(i2)) {
                    com.ss.android.ugc.d.a.c.a(new m(i2, a(i2)));
                }
                if (com.ss.android.ugc.aweme.notification.ab.b.f113114a.isEnableMultiAccountLogin() && com.ss.android.ugc.aweme.account.b.g().allUidList().size() > 1) {
                    c.a().a(com.ss.android.ugc.aweme.account.b.g().allUidList(), "ws_message_triggered");
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d0, code lost:
        if (r2 != null) goto L_0x0069;
     */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMsg(android.os.Message r12) {
        /*
        // Method dump skipped, instructions count: 593
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.redpoint.h.handleMsg(android.os.Message):void");
    }

    private void b(int i2, int i3) {
        if (i2 == 11) {
            int a2 = i3 - a(11);
            if (!this.f113821i && a2 > 0) {
                this.f113817e.put(998, Integer.valueOf(a2));
                this.f113817e.put(997, Integer.valueOf(a2));
                if (!this.f113814a) {
                    SharedPreferences.Editor edit = this.f113819g.edit();
                    edit.putInt(f(998), a2);
                    edit.putInt(f(997), a2);
                    com.bytedance.common.utility.e.a.a(edit);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.RedPointService, com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void a(int i2, int i3) {
        b(i2, i3);
        this.f113817e.put(i2, Integer.valueOf(i3));
        if (!this.f113814a) {
            SharedPreferences.Editor edit = this.f113819g.edit();
            edit.putInt(f(i2), i3);
            com.bytedance.common.utility.e.a.a(edit);
        }
    }

    private void b(int i2, com.ss.android.ugc.aweme.notice.api.bean.c cVar) {
        j e2;
        if (cVar == null || (e2 = f.e(i2)) == null || cVar == e2.f112691a) {
            this.f113817e.remove(i2);
            if (!this.f113814a) {
                SharedPreferences.Editor edit = this.f113819g.edit();
                edit.putInt(f(i2), 0);
                com.bytedance.common.utility.e.a.a(edit);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.RedPointService, com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void a(int i2, com.ss.android.ugc.aweme.notice.api.bean.c cVar) {
        List<Integer> a2 = f.a(i2, null);
        if (!a2.isEmpty()) {
            for (int i3 = 0; i3 < a2.size(); i3++) {
                b(a2.get(i3).intValue(), cVar);
            }
        }
        b(i2, cVar);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.RedPointService, com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void a(boolean z, int i2) {
        if (com.ss.android.ugc.aweme.account.b.g().isLogin() && !TextUtils.isEmpty(com.ss.android.ugc.aweme.account.b.g().getCurUserId()) && !in.d()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!z || currentTimeMillis >= f113812d + 300000) {
                if (i2 == 2 || ((com.ss.android.ugc.aweme.notice.api.d.a) d.a.a(com.ss.android.ugc.aweme.notice.api.d.a.class)).a() > 0) {
                    b.i.a((long) ((com.ss.android.ugc.aweme.notice.api.d.a) d.a.a(com.ss.android.ugc.aweme.notice.api.d.a.class)).a()).a(new i(this, i2));
                } else {
                    d(i2);
                }
                f113812d = currentTimeMillis;
            }
        }
    }
}
