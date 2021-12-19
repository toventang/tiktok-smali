package com.ss.android.ugc.aweme.base.component;

import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.fragment.app.e;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.activity.a;
import com.ss.android.ugc.aweme.analysis.c;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.internal.MainActivityCallback;
import com.ss.android.ugc.aweme.share.c.b;
import com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class EventActivityComponent implements f, i, j {

    /* renamed from: c  reason: collision with root package name */
    static i f68053c;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f68054e;

    /* renamed from: a  reason: collision with root package name */
    b f68055a;

    /* renamed from: b  reason: collision with root package name */
    e f68056b;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<c> f68057d;

    static {
        Covode.recordClassIndex(41918);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(50, new g(EventActivityComponent.class, "onNotificationRetry", g.class, ThreadMode.POSTING, 0, true));
        hashMap.put(51, new g(EventActivityComponent.class, "onPublishStatus", com.ss.android.ugc.aweme.shortvideo.j.f.class, ThreadMode.POSTING, -1, true));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.EventActivityComponent$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f68058a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 41919(0xa3bf, float:5.8741E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.lifecycle.i$a[] r0 = androidx.lifecycle.i.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.base.component.EventActivityComponent.AnonymousClass1.f68058a = r2
                androidx.lifecycle.i$a r0 = androidx.lifecycle.i.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.base.component.EventActivityComponent.AnonymousClass1.f68058a     // Catch:{ NoSuchFieldError -> 0x0023 }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.i.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.ugc.aweme.base.component.EventActivityComponent.AnonymousClass1.f68058a     // Catch:{ NoSuchFieldError -> 0x002e }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.i.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.android.ugc.aweme.base.component.EventActivityComponent.AnonymousClass1.f68058a     // Catch:{ NoSuchFieldError -> 0x0039 }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.i.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.component.EventActivityComponent.AnonymousClass1.<clinit>():void");
        }
    }

    public EventActivityComponent(e eVar) {
        this.f68056b = eVar;
    }

    @r(b = true)
    public void onNotificationRetry(g gVar) {
        this.f68056b.getClass().getSimpleName();
        if (MainActivityCallback.a(this.f68056b)) {
            new MainActivityCallback(this.f68056b, gVar.f68067a, true);
            EventBus.a().f(gVar);
        }
    }

    @r(b = true, c = -1)
    public void onPublishStatus(com.ss.android.ugc.aweme.shortvideo.j.f fVar) {
        e eVar = this.f68056b;
        eVar.getClass().getSimpleName();
        if (a.a(eVar)) {
            f68054e = false;
            if (fVar.f128578b == 12) {
                if (eVar == com.bytedance.ies.ugc.appcontext.f.j()) {
                    new com.bytedance.tux.g.b(this.f68056b).e(R.string.bym).b();
                }
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception(fVar.toString()));
            } else if (fVar.f128578b == 9) {
                if (eVar == com.bytedance.ies.ugc.appcontext.f.j() && fVar.f128588l) {
                    String str = fVar.f128581e;
                    if (TextUtils.isEmpty(str)) {
                        str = eVar.getResources().getString(R.string.f0q);
                    }
                    Toast makeText = Toast.makeText(this.f68056b, str, 1);
                    if (Build.VERSION.SDK_INT == 25) {
                        ic.a(makeText);
                    }
                    makeText.show();
                }
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception(fVar.toString()));
            } else if (fVar.f128578b == 10 && !fVar.f128587k) {
                c cVar = new c(this, fVar, eVar);
                ai aiVar = fVar.f128584h;
                if (!(aiVar instanceof CreateAwemeResponse) || ((CreateAwemeResponse) aiVar).couponInfo == null) {
                    cVar.run();
                } else {
                    MusicService.m().j();
                }
            }
            AVExternalServiceImpl.a().publishService().setPublishStatus(fVar.f128578b);
        }
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        b bVar;
        int i2 = AnonymousClass1.f68058a[aVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                EventBus.a(EventBus.a(), this);
            } else if (i2 == 3) {
                EventBus.a().b(this);
            } else if (i2 == 4 && (bVar = this.f68055a) != null) {
                bVar.d();
            }
        } else if (this.f68056b instanceof c) {
            this.f68057d = new WeakReference<>(this.f68056b);
        }
    }
}
