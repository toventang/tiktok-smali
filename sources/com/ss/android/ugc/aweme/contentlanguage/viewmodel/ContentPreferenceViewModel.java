package com.ss.android.ugc.aweme.contentlanguage.viewmodel;

import android.app.Activity;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService;
import com.ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl;
import com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService;
import com.ss.android.ugc.aweme.contentlanguage.api.LanguageApi;
import com.ss.android.ugc.aweme.contentlanguage.l;
import com.ss.android.ugc.aweme.contentlanguage.model.ConfigListResponse;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.zhiliaoapp.musically.R;
import f.a.z;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class ContentPreferenceViewModel extends ac implements l.a {

    /* renamed from: a  reason: collision with root package name */
    public int f78216a = -1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f78217b;

    /* renamed from: c  reason: collision with root package name */
    private final h f78218c = i.a((h.f.a.a) new d(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f78219d = i.a((h.f.a.a) g.f78229a);

    /* renamed from: e  reason: collision with root package name */
    private final h f78220e = i.a((h.f.a.a) a.f78222a);

    /* renamed from: f  reason: collision with root package name */
    private final h f78221f = i.a((h.f.a.a) f.f78228a);

    static {
        Covode.recordClassIndex(48503);
    }

    public final t<Integer> b() {
        return (t) this.f78219d.getValue();
    }

    public final t<ArrayList<com.ss.android.ugc.aweme.setting.serverpush.a.a>> c() {
        return (t) this.f78220e.getValue();
    }

    public final t<ArrayList<com.ss.android.ugc.aweme.i18n.language.b>> d() {
        return (t) this.f78221f.getValue();
    }

    static final class a extends m implements h.f.a.a<t<ArrayList<com.ss.android.ugc.aweme.setting.serverpush.a.a>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f78222a = new a();

        static {
            Covode.recordClassIndex(48504);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<ArrayList<com.ss.android.ugc.aweme.setting.serverpush.a.a>> invoke() {
            return new t();
        }
    }

    static final class f extends m implements h.f.a.a<t<ArrayList<com.ss.android.ugc.aweme.i18n.language.b>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f78228a = new f();

        static {
            Covode.recordClassIndex(48509);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<ArrayList<com.ss.android.ugc.aweme.i18n.language.b>> invoke() {
            return new t();
        }
    }

    static final class d extends m implements h.f.a.a<l> {
        final /* synthetic */ ContentPreferenceViewModel this$0;

        static {
            Covode.recordClassIndex(48507);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ContentPreferenceViewModel contentPreferenceViewModel) {
            super(0);
            this.this$0 = contentPreferenceViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ l invoke() {
            l lVar = new l();
            lVar.f78211b = this.this$0;
            return lVar;
        }
    }

    public final void e() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        if (!g2.isLogin()) {
            f();
        } else {
            ContentLanguageServiceImpl.f().a(new c(this));
        }
    }

    static final class g extends m implements h.f.a.a<t<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f78229a = new g();

        static {
            Covode.recordClassIndex(48510);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Integer> invoke() {
            Integer valueOf;
            t tVar = new t();
            if (com.ss.android.ugc.aweme.compliance.api.a.e().d() == 0) {
                valueOf = com.ss.android.ugc.aweme.compliance.api.a.e().g();
            } else {
                valueOf = Integer.valueOf(com.ss.android.ugc.aweme.compliance.api.a.e().d());
            }
            tVar.setValue(valueOf);
            return tVar;
        }
    }

    public ContentPreferenceViewModel() {
        e();
    }

    private final void f() {
        ((LanguageApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(LanguageApi.class)).getUnloginContentLanguage("content_language_region", ContentLanguageServiceImpl.f().d()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new b(this, ContentLanguageServiceImpl.f().c()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0 == null) goto L_0x0017;
     */
    @Override // com.ss.android.ugc.aweme.contentlanguage.l.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel.a():void");
    }

    public static final class c implements com.ss.android.ugc.aweme.setting.serverpush.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ContentPreferenceViewModel f78225a;

        static {
            Covode.recordClassIndex(48506);
        }

        @Override // com.ss.android.ugc.aweme.setting.serverpush.a
        public final void a(Exception exc) {
            h.f.b.l.d(exc, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(ContentPreferenceViewModel contentPreferenceViewModel) {
            this.f78225a = contentPreferenceViewModel;
        }

        @Override // com.ss.android.ugc.aweme.setting.serverpush.a
        public final void a(com.ss.android.ugc.aweme.setting.serverpush.a.f fVar) {
            Integer valueOf;
            h.f.b.l.d(fVar, "");
            this.f78225a.a(fVar.aa, fVar.Z);
            ContentPreferenceViewModel contentPreferenceViewModel = this.f78225a;
            int i2 = fVar.ad;
            if (com.ss.android.ugc.aweme.compliance.api.a.e().a()) {
                if (i2 == 0) {
                    valueOf = com.ss.android.ugc.aweme.compliance.api.a.e().g();
                } else {
                    valueOf = Integer.valueOf(i2);
                }
                contentPreferenceViewModel.b().setValue(valueOf);
                IVPAService e2 = com.ss.android.ugc.aweme.compliance.api.a.e();
                if (valueOf == null) {
                    h.f.b.l.b();
                }
                e2.a(valueOf.intValue());
            }
        }
    }

    public static final class e implements z<BaseResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ContentPreferenceViewModel f78226a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f78227b;

        static {
            Covode.recordClassIndex(48508);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            h.f.b.l.d(bVar, "");
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            h.f.b.l.d(th, "");
            ContentPreferenceViewModel.b(this.f78227b);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            BaseResponse baseResponse2 = baseResponse;
            h.f.b.l.d(baseResponse2, "");
            if (baseResponse2.error_code == 0) {
                Integer value = this.f78226a.b().getValue();
                if (value != null && value.intValue() == 3) {
                    ContentLanguageServiceImpl.f().a(true);
                    return;
                }
                return;
            }
            ContentPreferenceViewModel.b(this.f78227b);
        }

        e(ContentPreferenceViewModel contentPreferenceViewModel, int i2) {
            this.f78226a = contentPreferenceViewModel;
            this.f78227b = i2;
        }
    }

    public static final class b implements z<ConfigListResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ContentPreferenceViewModel f78223a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f78224b;

        static {
            Covode.recordClassIndex(48505);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            h.f.b.l.d(th, "");
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            h.f.b.l.d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(ConfigListResponse configListResponse) {
            ConfigListResponse configListResponse2 = configListResponse;
            h.f.b.l.d(configListResponse2, "");
            com.ss.android.ugc.aweme.contentlanguage.api.a a2 = ContentLanguageServiceImpl.f().a(this.f78224b, configListResponse2.getContentLanguage());
            this.f78223a.a(a2.f78157a, a2.f78158b);
        }

        b(ContentPreferenceViewModel contentPreferenceViewModel, List list) {
            this.f78223a = contentPreferenceViewModel;
            this.f78224b = list;
        }
    }

    public static void b(int i2) {
        com.ss.android.ugc.aweme.compliance.api.a.e().a(i2);
        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
        if (j2 != null) {
            new com.bytedance.tux.g.b(j2).e(R.string.g4a).b();
        }
        n.a("opt_out_failed_settings", "", (JSONObject) null);
    }

    public final void a(int i2) {
        int d2 = com.ss.android.ugc.aweme.compliance.api.a.e().d();
        b().setValue(Integer.valueOf(i2));
        com.ss.android.ugc.aweme.compliance.api.a.e().a(i2);
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        if (g2.isLogin()) {
            com.ss.android.ugc.aweme.compliance.api.a.e().b(i2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new e(this, d2));
            return;
        }
        Integer value = b().getValue();
        if (value != null && value.intValue() == 3) {
            ContentLanguageServiceImpl.f().a(false);
        }
    }

    public final void a(com.ss.android.ugc.aweme.setting.serverpush.a.a aVar) {
        if (aVar != null) {
            ArrayList<com.ss.android.ugc.aweme.setting.serverpush.a.a> value = c().getValue();
            if (value == null) {
                value = new ArrayList<>();
            }
            value.add(aVar);
            c().setValue(value);
            this.f78217b = false;
            ((l) this.f78218c.getValue()).a(aVar, 1);
            ArrayList<com.ss.android.ugc.aweme.i18n.language.b> value2 = d().getValue();
            if (value2 != null) {
                h.f.b.l.b(value2, "");
                Iterator<com.ss.android.ugc.aweme.i18n.language.b> it = value2.iterator();
                h.f.b.l.b(it, "");
                while (it.hasNext()) {
                    com.ss.android.ugc.aweme.i18n.language.b next = it.next();
                    h.f.b.l.b(next, "");
                    if (h.f.b.l.a((Object) next.a(), (Object) aVar.getLocalName())) {
                        it.remove();
                    }
                }
                d().setValue(value2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.l.a
    public final void a(Throwable th) {
        h.f.b.l.d(th, "");
        Throwable a2 = com.ss.android.ugc.aweme.app.api.b.a.a(th);
        if (a2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) a2;
            int errorCode = aVar.getErrorCode();
            aVar.getResponse();
            if (errorCode == 2090) {
                IContentLanguageService f2 = ContentLanguageServiceImpl.f();
                h.f.b.l.b(f2, "");
                Activity b2 = f2.b();
                if (b2 != null) {
                    new com.bytedance.tux.g.b(b2).e(R.string.g4a).b();
                }
                ArrayList<com.ss.android.ugc.aweme.setting.serverpush.a.a> value = c().getValue();
                if (!com.bytedance.common.utility.collection.b.a((Collection) value)) {
                    if (value != null) {
                        value.remove(value.size() - 1);
                    }
                    c().setValue(value);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.setting.serverpush.a.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(List<? extends com.ss.android.ugc.aweme.setting.serverpush.a.a> list, List<? extends com.ss.android.ugc.aweme.setting.serverpush.a.a> list2) {
        if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
            c().setValue(list);
        }
        if (!com.bytedance.common.utility.collection.b.a((Collection) list2)) {
            ArrayList<com.ss.android.ugc.aweme.i18n.language.b> arrayList = new ArrayList<>();
            if (list2 == null) {
                h.f.b.l.b();
            }
            for (com.ss.android.ugc.aweme.setting.serverpush.a.a aVar : list2) {
                arrayList.add(new com.ss.android.ugc.aweme.i18n.language.b(new com.ss.android.ugc.aweme.i18n.language.i18n.a("", aVar.getEnglishName(), aVar.getLanguageCode(), aVar.getLocalName()), false));
            }
            d().setValue(arrayList);
        }
    }
}
