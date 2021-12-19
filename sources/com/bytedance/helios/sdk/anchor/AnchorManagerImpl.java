package com.bytedance.helios.sdk.anchor;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.b.n;
import com.bytedance.helios.sdk.d.r;
import com.bytedance.helios.sdk.utils.f;
import com.bytedance.helios.sdk.utils.g;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

public final class AnchorManagerImpl extends com.bytedance.helios.api.a.b implements r {
    public final b mAnchorTask;

    static {
        Covode.recordClassIndex(17877);
    }

    public static int com_bytedance_helios_sdk_anchor_AnchorManagerImpl_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    @Override // com.bytedance.helios.api.a.b
    public final String getAnchorTaskName() {
        return this.mAnchorTask.a();
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f30756a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AnchorManagerImpl f30757b;

        static {
            Covode.recordClassIndex(17878);
        }

        a(a aVar, AnchorManagerImpl anchorManagerImpl) {
            this.f30756a = aVar;
            this.f30757b = anchorManagerImpl;
        }

        public final void run() {
            this.f30757b.mAnchorTask.a(this.f30756a, (Integer) 8);
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f30758a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AnchorManagerImpl f30759b;

        static {
            Covode.recordClassIndex(17879);
        }

        b(a aVar, AnchorManagerImpl anchorManagerImpl) {
            this.f30758a = aVar;
            this.f30759b = anchorManagerImpl;
        }

        public final void run() {
            this.f30759b.mAnchorTask.a(this.f30758a, 9);
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AnchorManagerImpl f30761a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f30762b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f30763c;

        static {
            Covode.recordClassIndex(17881);
        }

        d(AnchorManagerImpl anchorManagerImpl, a aVar, int i2) {
            this.f30761a = anchorManagerImpl;
            this.f30762b = aVar;
            this.f30763c = i2;
        }

        public final void run() {
            this.f30761a.mAnchorTask.a(this.f30762b, this.f30763c);
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AnchorManagerImpl f30764a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f30765b;

        static {
            Covode.recordClassIndex(17882);
        }

        e(AnchorManagerImpl anchorManagerImpl, a aVar) {
            this.f30764a = anchorManagerImpl;
            this.f30765b = aVar;
        }

        public final void run() {
            this.f30764a.mAnchorTask.a(this.f30765b, (Integer) null);
        }
    }

    private AnchorManagerImpl() {
        b a2 = com.bytedance.helios.sdk.anchor.a.a.a(this);
        l.a((Object) a2, "");
        this.mAnchorTask = a2;
    }

    static final class c extends m implements h.f.a.b<n, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f30760a = new c();

        static {
            Covode.recordClassIndex(17880);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(n nVar) {
            n nVar2 = nVar;
            l.c(nVar2, "");
            return "(eventId=" + nVar2.f30673b + " startedTime=" + nVar2.f30683l + ')';
        }
    }

    @Override // com.bytedance.helios.api.a.b
    public final void stopCheck(Activity activity) {
        com_bytedance_helios_sdk_anchor_AnchorManagerImpl_com_ss_android_ugc_aweme_lancet_LogLancet_d("AnchorManager", "stopCheck: ".concat(String.valueOf(activity)));
        g.b().post(new e(this, new a(activity)));
    }

    @Override // com.bytedance.helios.api.a.b
    public final void startCheck(Activity activity, int i2) {
        com_bytedance_helios_sdk_anchor_AnchorManagerImpl_com_ss_android_ugc_aweme_lancet_LogLancet_d("AnchorManager", "startCheck: " + activity + '/' + com.bytedance.helios.api.a.a.a(i2));
        g.b().post(new d(this, new a(activity), i2));
    }

    @Override // com.bytedance.helios.sdk.d.r
    public final void onWindowViewAction(int i2, List<n> list) {
        l.c(list, "");
        if (!(!l.a((Object) this.mAnchorTask.a(), (Object) "AnchorTaskPlanA"))) {
            f.a("Helios-Log-Detection-Task", "onWindowViewAction eventId=" + i2 + " privacyEvents=" + h.a.n.a(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, c.f30760a, 31), (String) null, 12);
            switch (i2) {
                case 102800:
                    for (T t : list) {
                        g.b().post(new a(new a(t.f30681j, t.f30682k, (List) t.n.get("floating_view_activities")), this));
                    }
                    return;
                case 102801:
                    for (T t2 : list) {
                        g.b().post(new b(new a(t2.f30681j, t2.f30682k, (List) t2.n.get("floating_view_activities")), this));
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
