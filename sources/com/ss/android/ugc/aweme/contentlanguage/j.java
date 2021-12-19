package com.ss.android.ugc.aweme.contentlanguage;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService;
import com.ss.android.ugc.aweme.contentlanguage.api.LanguageApi;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.utils.in;
import f.a.z;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class j {

    /* renamed from: e  reason: collision with root package name */
    public static final h f78191e = i.a(m.SYNCHRONIZED, b.f78198a);

    /* renamed from: f  reason: collision with root package name */
    public static final a f78192f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final o f78193a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f78194b;

    /* renamed from: c  reason: collision with root package name */
    public String f78195c;

    /* renamed from: d  reason: collision with root package name */
    public i f78196d;

    /* renamed from: g  reason: collision with root package name */
    private final h f78197g;

    public final LanguageApi a() {
        return (LanguageApi) this.f78197g.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(48479);
        }

        public static j a() {
            return (j) j.f78191e.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class e implements z<BaseResponse> {
        static {
            Covode.recordClassIndex(48483);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        e() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            BaseResponse baseResponse2 = baseResponse;
            l.d(baseResponse2, "");
            if (baseResponse2.status_code == 0) {
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                l.b(createIUserServicebyMonsterPlugin, "");
                User currentUser = createIUserServicebyMonsterPlugin.getCurrentUser();
                if (currentUser != null) {
                    currentUser.setContentLanguageDialogShown(true);
                }
                com.ss.android.ugc.aweme.account.b.g().forceSave();
            }
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<j> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f78198a = new b();

        static {
            Covode.recordClassIndex(48480);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j invoke() {
            return new j((byte) 0);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<LanguageApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f78199a = new c();

        static {
            Covode.recordClassIndex(48481);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LanguageApi invoke() {
            return com.ss.android.ugc.aweme.contentlanguage.api.b.a();
        }
    }

    public final void d() {
        if (!this.f78193a.c()) {
            this.f78193a.d();
        }
    }

    static {
        Covode.recordClassIndex(48478);
    }

    private j() {
        this.f78193a = new o();
        this.f78195c = "";
        this.f78197g = i.a((h.f.a.a) c.f78199a);
    }

    /* access modifiers changed from: package-private */
    public static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f78200a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f78201b;

        static {
            Covode.recordClassIndex(48484);
        }

        f(j jVar, Context context) {
            this.f78200a = jVar;
            this.f78201b = context;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            i iVar;
            this.f78200a.f78196d = new i(this.f78201b, this.f78200a.f78195c);
            i iVar2 = this.f78200a.f78196d;
            if (iVar2 != null) {
                iVar2.setOnDismissListener(new DialogInterface.OnDismissListener(this) {
                    /* class com.ss.android.ugc.aweme.contentlanguage.j.f.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ f f78202a;

                    static {
                        Covode.recordClassIndex(48485);
                    }

                    {
                        this.f78202a = r1;
                    }

                    public final void onDismiss(DialogInterface dialogInterface) {
                    }
                });
            }
            i iVar3 = this.f78200a.f78196d;
            if (!(iVar3 == null || iVar3.isShowing() || (iVar = this.f78200a.f78196d) == null)) {
                iVar.show();
            }
            return h.z.f158842a;
        }
    }

    public final boolean b() {
        if (com.ss.android.ugc.aweme.user.f.a(com.ss.android.ugc.aweme.user.e.f142364k.a())) {
            if (in.g()) {
                return true;
            }
            return false;
        } else if (!TextUtils.isEmpty(this.f78193a.b()) || this.f78193a.a()) {
            return true;
        } else {
            return false;
        }
    }

    public final void c() {
        if (com.ss.android.ugc.aweme.user.f.a(com.ss.android.ugc.aweme.user.e.f142364k.a())) {
            a().setContentLanguageDialogShown("content_language_already_popup").b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new e());
        } else {
            this.f78193a.a(true);
        }
    }

    public /* synthetic */ j(byte b2) {
        this();
    }

    public static final class d implements z<BaseResponse> {
        static {
            Covode.recordClassIndex(48482);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            l.d(baseResponse, "");
            ContentLanguageServiceImpl.f().a((com.ss.android.ugc.aweme.setting.serverpush.a) null);
        }
    }

    public static final class g implements z<BaseResponse> {
        static {
            Covode.recordClassIndex(48486);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            ContentLanguageServiceImpl.f().a((com.ss.android.ugc.aweme.setting.serverpush.a) null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            BaseResponse baseResponse2 = baseResponse;
            l.d(baseResponse2, "");
            if (baseResponse2.status_code == 0) {
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                l.b(createIUserServicebyMonsterPlugin, "");
                User currentUser = createIUserServicebyMonsterPlugin.getCurrentUser();
                currentUser.setContentLanguageDialogShown(true);
                com.ss.android.ugc.aweme.user.e.f142364k.b(currentUser);
            }
            ContentLanguageServiceImpl.f().a((com.ss.android.ugc.aweme.setting.serverpush.a) null);
        }
    }

    private final void c(Context context) {
        b.i.b(new f(this, context), b.i.f4826c);
    }

    public final void b(Context context) {
        l.d(context, "");
        if (this.f78194b) {
            a(context);
        }
    }

    private final boolean d(Context context) {
        Pair<Boolean, String> a2 = ContentLanguageServiceImpl.f().a(context);
        String str = (String) a2.second;
        if (str == null) {
            str = "";
        }
        this.f78195c = str;
        Object obj = a2.first;
        l.b(obj, "");
        return ((Boolean) obj).booleanValue();
    }

    public final void a(Context context) {
        l.d(context, "");
        d();
        IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
        l.b(iESSettingsProxy, "");
        if (!com.bytedance.common.utility.collection.b.a((Collection) iESSettingsProxy.getContentLanguageGuideCodes()) && !b()) {
            if (!d(context)) {
                this.f78194b = true;
                return;
            }
            IContentLanguageService f2 = ContentLanguageServiceImpl.f();
            l.b(f2, "");
            int a2 = f2.a();
            if (a2 <= 5 || a2 > 9) {
                c(context);
            }
            this.f78194b = false;
        }
    }
}
