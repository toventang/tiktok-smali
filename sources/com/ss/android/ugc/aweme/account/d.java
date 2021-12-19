package com.ss.android.ugc.aweme.account;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.n.a;
import com.ss.android.ugc.aweme.account.n.e;
import com.ss.android.ugc.aweme.account.util.u;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.y;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f62927a = new d();

    private d() {
    }

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f62928a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f62929b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f62930c;

        static {
            Covode.recordClassIndex(38759);
        }

        /* renamed from: com.ss.android.ugc.aweme.account.d$a$a  reason: collision with other inner class name */
        public static final class C1387a implements e.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f62936a;

            static {
                Covode.recordClassIndex(38760);
            }

            @Override // com.ss.android.ugc.aweme.account.n.e.a
            public final void a() {
                this.f62936a.f62930c.invoke();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C1387a(a aVar) {
                this.f62936a = aVar;
            }
        }

        @Override // com.ss.android.ugc.aweme.account.c
        public final void a() {
            Bundle bundle = this.f62928a;
            if (bundle == null) {
                l.b();
            }
            String str = "";
            l.d(bundle, str);
            String string = bundle.getString("gms_store_id");
            String string2 = bundle.getString("gms_store_pwd");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                IAccountUserService e2 = cj.f71084b.e();
                l.b(e2, str);
                if (!e2.isChildrenMode()) {
                    com.bytedance.sdk.a.e.a aVar = new com.bytedance.sdk.a.e.a();
                    aVar.f43163a = string;
                    aVar.f43165c = string2;
                    if (cj.f() != null) {
                        User f2 = cj.f();
                        l.b(f2, str);
                        aVar.f43164b = f2.getNickname();
                        if (f2.getAvatarThumb() != null) {
                            UrlModel avatarThumb = f2.getAvatarThumb();
                            l.b(avatarThumb, str);
                            if (avatarThumb.getUrlList() != null) {
                                UrlModel avatarThumb2 = f2.getAvatarThumb();
                                l.b(avatarThumb2, str);
                                if (!avatarThumb2.getUrlList().isEmpty()) {
                                    UrlModel avatarThumb3 = f2.getAvatarThumb();
                                    l.b(avatarThumb3, str);
                                    str = avatarThumb3.getUrlList().get(0);
                                }
                            }
                        }
                        aVar.f43166d = str;
                    }
                    com.ss.android.ugc.aweme.account.n.e.a(this.f62929b, this.f62928a, new C1387a(this), aVar);
                    return;
                }
            }
            this.f62930c.invoke();
        }

        a(Bundle bundle, Activity activity, h.f.a.a aVar) {
            this.f62928a = bundle;
            this.f62929b = activity;
            this.f62930c = aVar;
        }
    }

    static {
        Covode.recordClassIndex(38758);
    }

    static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ Bundle $bundle;
        final /* synthetic */ h.f.a.b $listener;
        final /* synthetic */ List $mNeedRunActions;

        static {
            Covode.recordClassIndex(38765);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(List list, h.f.a.b bVar, Bundle bundle) {
            super(0);
            this.$mNeedRunActions = list;
            this.$listener = bVar;
            this.$bundle = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (!this.$mNeedRunActions.isEmpty()) {
                ((c) this.$mNeedRunActions.remove(0)).a();
            } else if (l.a(Looper.myLooper(), Looper.getMainLooper())) {
                h.f.a.b bVar = this.$listener;
                b.i<Bundle> a2 = com.ss.android.ugc.aweme.c.a(this.$bundle);
                l.b(a2, "");
                bVar.invoke(a2);
            } else {
                throw new IllegalArgumentException("Need to run on UI Thread".toString());
            }
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d$d  reason: collision with other inner class name */
    static final class C1391d<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f62954a;

        static {
            Covode.recordClassIndex(38763);
        }

        C1391d(Bundle bundle) {
            this.f62954a = bundle;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            return u.b(this.f62954a);
        }
    }

    static final class e<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f62955a;

        static {
            Covode.recordClassIndex(38764);
        }

        e(h.f.a.a aVar) {
            this.f62955a = aVar;
        }

        @Override // b.g
        public final Object then(b.i<com.ss.android.ugc.aweme.account.login.b.a> iVar) {
            this.f62955a.invoke();
            return null;
        }
    }

    public static final class g<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f62956a;

        static {
            Covode.recordClassIndex(38766);
        }

        public g(Bundle bundle) {
            this.f62956a = bundle;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            return u.c(this.f62956a);
        }
    }

    public static final class h<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f62957a;

        static {
            Covode.recordClassIndex(38767);
        }

        public h(Bundle bundle) {
            this.f62957a = bundle;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            return u.b(this.f62957a);
        }
    }

    static final class b<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f62941a;

        static {
            Covode.recordClassIndex(38761);
        }

        b(Bundle bundle) {
            this.f62941a = bundle;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            Bundle bundle = this.f62941a;
            if (bundle == null) {
                l.b();
            }
            return u.a(bundle);
        }
    }

    static final class c<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f62947a;

        static {
            Covode.recordClassIndex(38762);
        }

        c(Bundle bundle) {
            this.f62947a = bundle;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            Bundle bundle = this.f62947a;
            if (bundle == null) {
                l.b();
            }
            return u.c(bundle);
        }
    }

    public static final class i<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IAccountUserService f62958a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bundle f62959b;

        static {
            Covode.recordClassIndex(38768);
        }

        public i(IAccountUserService iAccountUserService, Bundle bundle) {
            this.f62958a = iAccountUserService;
            this.f62959b = bundle;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            IAccountUserService iAccountUserService = this.f62958a;
            l.b(iAccountUserService, "");
            cj.a(true, iAccountUserService.getCurUser());
            Bundle bundle = this.f62959b;
            return y.a(bundle, null).a(new com.ss.android.ugc.aweme.e(bundle), b.i.f4826c, null);
        }
    }

    public static final void a(Bundle bundle, Activity activity, h.f.a.b<? super b.i<Bundle>, z> bVar) {
        l.d(bVar, "");
        if (bundle == null) {
            b.i a2 = b.i.a(new Exception("Bundle is empty"));
            l.b(a2, "");
            bVar.invoke(a2);
        }
        ArrayList arrayList = new ArrayList();
        f fVar = new f(arrayList, bVar, bundle);
        arrayList.add(new a(bundle, activity, fVar));
        if (!TextUtils.isEmpty(TwoStepAuthApi.f63745a)) {
            String str = TwoStepAuthApi.f63745a;
            if (str == null) {
                l.b();
            }
            l.d(str, "");
            TwoStepAuthApi.a().addAuthDevice(str);
            TwoStepAuthApi.f63745a = null;
        }
        b.i b2 = b.i.b(a.CallableC1451a.f65161a, b.i.f4824a);
        l.b(b2, "");
        b2.a((b.g) new b(bundle)).b((b.g) new c(bundle)).b((b.g) new C1391d(bundle)).a(new e(fVar), b.i.f4826c, null);
    }
}
