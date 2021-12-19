package com.ss.android.ugc.aweme.notification.tutorial;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import b.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.notice.api.d.d;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.v;
import f.a.w;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.lang.ref.WeakReference;

public final class TutorialVideoViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public final t<TutorialVideoResp> f113832a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public final h f113833b = i.a((h.f.a.a) a.f113835a);

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<Context> f113834c;

    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f113837a = new c();

        static {
            Covode.recordClassIndex(73208);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(73205);
    }

    static final class a extends m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f113835a = new a();

        static {
            Covode.recordClassIndex(73206);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    public final f.a.t<TutorialVideoResp> a() {
        f.a.t<TutorialVideoResp> a2 = f.a.t.a(new d(this));
        l.b(a2, "");
        return a2;
    }

    public final TutorialVideoResp b() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        try {
            com.ss.android.ugc.aweme.notice.api.d.e eVar = (com.ss.android.ugc.aweme.notice.api.d.e) d.a.a(com.ss.android.ugc.aweme.notice.api.d.e.class);
            str6 = eVar.a("");
            str5 = eVar.c("");
            str4 = eVar.e(a(R.string.dei));
            if (TextUtils.isEmpty(str4)) {
                str4 = a(R.string.dei);
            }
            str3 = eVar.g(a(R.string.dej));
            if (TextUtils.isEmpty(str3)) {
                str3 = a(R.string.dej);
            }
            str2 = eVar.i(a(R.string.dek));
            if (TextUtils.isEmpty(str2)) {
                str2 = a(R.string.dek);
            }
            str = eVar.k("");
        } catch (Exception unused) {
            str4 = a(R.string.dei);
            str3 = a(R.string.dei);
            str2 = a(R.string.dei);
            str6 = "";
            str5 = str6;
            str = str5;
        }
        if (TextUtils.isEmpty(str6) || TextUtils.isEmpty(str)) {
            return new TutorialVideoResp(null);
        }
        return new TutorialVideoResp(new TutorialVideoInfo(str6, str5, str4, str3, str2, str));
    }

    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TutorialVideoViewModel f113836a;

        static {
            Covode.recordClassIndex(73207);
        }

        public b(TutorialVideoViewModel tutorialVideoViewModel) {
            this.f113836a = tutorialVideoViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f113836a.f113832a.postValue(obj);
        }
    }

    private final String a(int i2) {
        Context context;
        WeakReference<Context> weakReference = this.f113834c;
        if (weakReference == null || (context = weakReference.get()) == null) {
            context = com.bytedance.ies.ugc.appcontext.d.a();
        }
        String string = context.getString(i2);
        l.b(string, "");
        return string;
    }

    public final z a(Context context) {
        if (context == null) {
            return null;
        }
        this.f113834c = new WeakReference<>(context);
        return z.f158842a;
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TutorialVideoViewModel f113838a;

        static {
            Covode.recordClassIndex(73209);
        }

        d(TutorialVideoViewModel tutorialVideoViewModel) {
            this.f113838a = tutorialVideoViewModel;
        }

        @Override // f.a.w
        public final void subscribe(v<TutorialVideoResp> vVar) {
            l.d(vVar, "");
            TutorialVideoViewModel tutorialVideoViewModel = this.f113838a;
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            String curUserId = g2.getCurUserId();
            Keva repo = Keva.getRepo("top_message_keva_repo");
            String string = repo.getString("msg_id_".concat(String.valueOf(curUserId)), "");
            long j2 = repo.getLong("first_show_time_".concat(String.valueOf(curUserId)), 0);
            long j3 = repo.getLong("current_show_time_".concat(String.valueOf(curUserId)), 0);
            int i2 = repo.getInt("clicked_".concat(String.valueOf(curUserId)), 0);
            l.b(string, "");
            TutorialVideoApiManager.a.a(string, j2, j3, i2).a(new e(tutorialVideoViewModel, string, repo, curUserId, vVar));
        }
    }

    static final class e<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TutorialVideoViewModel f113839a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f113840b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Keva f113841c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f113842d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f113843e;

        static {
            Covode.recordClassIndex(73210);
        }

        e(TutorialVideoViewModel tutorialVideoViewModel, String str, Keva keva, String str2, v vVar) {
            this.f113839a = tutorialVideoViewModel;
            this.f113840b = str;
            this.f113841c = keva;
            this.f113842d = str2;
            this.f113843e = vVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            TutorialVideoInfo info;
            l.b(iVar, "");
            if (iVar.a()) {
                TutorialVideoResp tutorialVideoResp = (TutorialVideoResp) iVar.d();
                if (!(tutorialVideoResp == null || (info = tutorialVideoResp.getInfo()) == null)) {
                    com.ss.android.ugc.aweme.notice.api.d.e eVar = (com.ss.android.ugc.aweme.notice.api.d.e) d.a.a(com.ss.android.ugc.aweme.notice.api.d.e.class);
                    if (!TextUtils.isEmpty(info.getMsgId())) {
                        if (eVar != null) {
                            eVar.b(info.getMsgId());
                        }
                        if (!TextUtils.equals(this.f113840b, info.getMsgId())) {
                            this.f113841c.storeString("msg_id_" + this.f113842d, info.getMsgId());
                            this.f113841c.storeLong("first_show_time_" + this.f113842d, System.currentTimeMillis());
                            this.f113841c.storeInt("clicked_" + this.f113842d, 0);
                        }
                        this.f113841c.storeLong("current_show_time_" + this.f113842d, System.currentTimeMillis());
                    }
                    if (eVar != null) {
                        eVar.d(info.getIcon());
                        eVar.f(info.getTitle());
                        eVar.h(info.getDesc());
                        eVar.j(info.getButton());
                        eVar.l(info.getDeepLink());
                    }
                }
                v vVar = this.f113843e;
                if (vVar == null) {
                    return null;
                }
                com.ss.android.ugc.aweme.common.ac.a(vVar, this.f113839a.b());
                return null;
            }
            v vVar2 = this.f113843e;
            if (vVar2 == null) {
                return null;
            }
            Exception e2 = iVar.e();
            if (e2 == null) {
                e2 = new IllegalStateException("Unknown exception");
            }
            com.ss.android.ugc.aweme.common.ac.a(vVar2, (Throwable) e2);
            return null;
        }
    }
}
