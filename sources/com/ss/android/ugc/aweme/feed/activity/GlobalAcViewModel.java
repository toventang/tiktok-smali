package com.ss.android.ugc.aweme.feed.activity;

import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class GlobalAcViewModel extends ac implements i, j {

    /* renamed from: g  reason: collision with root package name */
    public static final a f91474g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<m> f91475a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference<ViewGroup> f91476b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference<e> f91477c;

    /* renamed from: d  reason: collision with root package name */
    public final t<Boolean> f91478d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.pendant.e f91479e;

    /* renamed from: f  reason: collision with root package name */
    public final GlobalAcViewModel$mainActivityLifecycleObserver$1 f91480f;

    /* renamed from: h  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.money.growth.a f91481h;

    static {
        Covode.recordClassIndex(57558);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(374, new g(GlobalAcViewModel.class, "onLiveSkyShowEvent", com.ss.android.ugc.aweme.activity.b.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57559);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GlobalAcViewModel f91483a;

        static {
            Covode.recordClassIndex(57561);
        }

        public c(GlobalAcViewModel globalAcViewModel) {
            this.f91483a = globalAcViewModel;
        }

        public final void run() {
            this.f91483a.a();
        }
    }

    public GlobalAcViewModel() {
        EventBus.a(EventBus.a(), this);
        this.f91481h = new d(this);
        this.f91480f = new GlobalAcViewModel$mainActivityLifecycleObserver$1(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r3 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r1 == null) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.activity.GlobalAcViewModel.a():void");
    }

    public static final class b implements u<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GlobalAcViewModel f91482a;

        static {
            Covode.recordClassIndex(57560);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b(GlobalAcViewModel globalAcViewModel) {
            this.f91482a = globalAcViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null && this.f91482a.f91479e != null) {
                bool2.booleanValue();
            }
        }
    }

    public static final class d implements com.ss.android.ugc.aweme.money.growth.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GlobalAcViewModel f91484a;

        static {
            Covode.recordClassIndex(57562);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(GlobalAcViewModel globalAcViewModel) {
            this.f91484a = globalAcViewModel;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (r3 == null) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
            if (r1 == null) goto L_0x0043;
         */
        @Override // com.ss.android.ugc.aweme.money.growth.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r7) {
            /*
            // Method dump skipped, instructions count: 104
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.activity.GlobalAcViewModel.d.a(com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting):void");
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onLiveSkyShowEvent(com.ss.android.ugc.aweme.activity.b bVar) {
        l.d(bVar, "");
        com.ss.android.ugc.aweme.pendant.e eVar = this.f91479e;
        if (eVar != null) {
            eVar.a(bVar.f65527a);
        }
    }

    public static final GlobalAcViewModel a(e eVar) {
        l.d(eVar, "");
        ac a2 = ae.a(eVar, (ad.b) null).a(GlobalAcViewModel.class);
        l.b(a2, "");
        return (GlobalAcViewModel) a2;
    }
}
