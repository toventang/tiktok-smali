package com.ss.android.ugc.aweme.external;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.detail.api.CheckDuetReactPermissionApi;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.AVSettingsServiceImpl;
import com.ss.android.ugc.aweme.services.GeoFencingServiceImpl;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.aweme.services.config.ShortVideoConfigImpl;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.services.external.ICacheService;
import com.ss.android.ugc.aweme.services.external.IConfigService;
import com.ss.android.ugc.aweme.services.external.IGeofencingService;
import com.ss.android.ugc.aweme.services.external.IPrivacyConfig;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.services.storage.StorageServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.ca;
import com.ss.android.ugc.aweme.shortvideo.ce;
import com.ss.android.ugc.aweme.shortvideo.cf;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.k.k;
import com.ss.android.ugc.aweme.shortvideo.ui.PermissionSettingItem;
import com.ss.android.ugc.aweme.shortvideo.ui.j;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;
import com.ss.android.ugc.aweme.tools.policysecurity.a;
import com.ss.ugc.effectplatform.util.u;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class e implements IConfigService {

    /* renamed from: a  reason: collision with root package name */
    public static final h f90378a = i.a((h.f.a.a) b.f90381a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f90379b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final h f90380c = i.a((h.f.a.a) new c(this));

    public static final class d implements IPrivacyConfig {
        static {
            Covode.recordClassIndex(56740);
        }

        public static final class a implements IPrivacyConfig.IPermissionModule {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ cf f90389a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f90390b;

            static {
                Covode.recordClassIndex(56741);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionModule
            public final void setOnPermissionSetListener(ca caVar) {
                l.d(caVar, "");
            }

            @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionModule
            public final boolean isEnablePublishExclusionExperiment() {
                return k.f128632a;
            }

            /* renamed from: com.ss.android.ugc.aweme.external.e$d$a$a  reason: collision with other inner class name */
            public static final class C2183a implements j {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ IPrivacyConfig.IPermissionPostCallback f90391a;

                static {
                    Covode.recordClassIndex(56742);
                }

                C2183a(IPrivacyConfig.IPermissionPostCallback iPermissionPostCallback) {
                    this.f90391a = iPermissionPostCallback;
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.ui.j
                public final void a(int i2) {
                    this.f90391a.doPostData(i2);
                }
            }

            @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionModule
            public final void onSaveInstanceState(Bundle bundle) {
                l.d(bundle, "");
                cf.a(bundle);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionModule
            public final void receivePermissionResult(int i2) {
                this.f90389a.f125110b.a(i2, null, 0);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionModule
            public final void restoreSavedInstanceState(Bundle bundle) {
                l.d(bundle, "");
                cf cfVar = this.f90389a;
                int i2 = bundle.getInt("allowRecommend");
                cfVar.f125110b.a(bundle.getInt("permission"), (List) bundle.getSerializable("excludeUserList"), i2);
            }

            a(cf cfVar, boolean z) {
                this.f90389a = cfVar;
                this.f90390b = z;
            }

            @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionModule
            public final void setupV2(ce ceVar, IPrivacyConfig.IPermissionPostCallback iPermissionPostCallback) {
                l.d(ceVar, "");
                l.d(iPermissionPostCallback, "");
                this.f90389a.a(ceVar, (j) new C2183a(iPermissionPostCallback), (DialogInterface.OnDismissListener) null, this.f90390b, true);
            }
        }

        public static final class b implements IPrivacyConfig.IPermissionSettingItem {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ PermissionSettingItem f90392a;

            static {
                Covode.recordClassIndex(56743);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionSettingItem
            public final View asView() {
                return this.f90392a;
            }

            @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionSettingItem
            public final TextView getPrivateHint() {
                View findViewById = this.f90392a.findViewById(R.id.d9l);
                l.b(findViewById, "");
                return (TextView) findViewById;
            }

            @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionSettingItem
            public final ImageView getPrivateIcon() {
                View findViewById = this.f90392a.findViewById(R.id.d9n);
                l.b(findViewById, "");
                return (ImageView) findViewById;
            }

            b(PermissionSettingItem permissionSettingItem) {
                this.f90392a = permissionSettingItem;
            }

            @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionSettingItem
            public final void setAdvPromotable(boolean z) {
                this.f90392a.setAdvPromotable(z);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionSettingItem
            public final void setAllowRecommend(int i2) {
                this.f90392a.setAllowRecommend(i2);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionSettingItem
            public final void setFromChangePrivacy(boolean z) {
                this.f90392a.setFromChangePrivacy(z);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionSettingItem
            public final void setMission(int i2, String str) {
                l.d(str, "");
                this.f90392a.setMissionStatus(i2);
                this.f90392a.setMissionId(str);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionSettingItem
            public final void setPermission(int i2, List<? extends User> list, int i3) {
                this.f90392a.a(i2, list, i3);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionSettingItem
            public final void setPermission(int i2, boolean z, String str) {
                l.d(str, "");
                this.f90392a.a(i2, null, 0, z, str);
            }
        }

        d() {
        }

        @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig
        public final IPrivacyConfig.IPermissionSettingItem createPermissionSettingItem(Context context) {
            l.d(context, "");
            return new b(new PermissionSettingItem(context, null));
        }

        @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig
        public final com.ss.android.ugc.aweme.shortvideo.duet.b checkDuetReactPermission(String str, int i2) {
            l.d(str, "");
            l.d(str, "");
            T t = ((CheckDuetReactPermissionApi.CheckDuetReactPermissionRequest) g.a().C().createRetrofit(CheckDuetReactPermissionApi.f79605a, true, CheckDuetReactPermissionApi.CheckDuetReactPermissionRequest.class)).checkDuetReactPermission(str, i2).execute().f42630b;
            l.b(t, "");
            return t;
        }

        @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig
        public final IPrivacyConfig.IPermissionModule createPermissionModule(Fragment fragment, IPrivacyConfig.IPermissionSettingItem iPermissionSettingItem, int i2, boolean z) {
            l.d(fragment, "");
            l.d(iPermissionSettingItem, "");
            View asView = iPermissionSettingItem.asView();
            Objects.requireNonNull(asView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.PermissionSettingItem");
            return new a(new cf(fragment, (PermissionSettingItem) asView, i2), z);
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(56730);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final IGeofencingService geoFencingConfig() {
        return GeoFencingServiceImpl.INSTANCE;
    }

    static final class b extends m implements h.f.a.a<e> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f90381a = new b();

        static {
            Covode.recordClassIndex(56731);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return new e();
        }
    }

    static final class c extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(56732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new ICacheService(this) {
                /* class com.ss.android.ugc.aweme.external.e.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f90382a;

                static {
                    Covode.recordClassIndex(56733);
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final String cacheDir() {
                    String str = di.o;
                    l.b(str, "");
                    return str;
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final String compatMusDraftDir() {
                    String str = di.u;
                    l.b(str, "");
                    return str;
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final String filterDir() {
                    String str = di.p;
                    l.b(str, "");
                    return str;
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final String musicDir() {
                    String str = di.r;
                    l.b(str, "");
                    return str;
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final String rootDir() {
                    String str = di.f126461d;
                    l.b(str, "");
                    return str;
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final String stickerDir() {
                    String str = di.f126458a;
                    l.b(str, "");
                    return str;
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final Collection<String> allowList() {
                    return new StorageServiceImpl().getPrefixAllowList();
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final void clearMvCache() {
                    com.ss.android.ugc.aweme.port.in.c.D.d().a().d();
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final ArrayList<String> draftEffectList() {
                    ArrayList<String> e2 = EffectPlatform.e();
                    l.b(e2, "");
                    return e2;
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final String effectCacheDir() {
                    String absolutePath = EffectPlatform.f89012a.getAbsolutePath();
                    l.b(absolutePath, "");
                    return absolutePath;
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final String mvRootDir() {
                    String b2 = com.ss.android.ugc.aweme.tools.mvtemplate.e.b.b();
                    l.b(b2, "");
                    return b2;
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final Collection<String> tempVideoFile() {
                    HashSet hashSet = new HashSet();
                    new File(di.f126462e).getAbsolutePath();
                    return hashSet;
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final void clearFilterCache() {
                    com.ss.android.ugc.aweme.port.in.c.C.r().d().b();
                    com.ss.android.ugc.aweme.port.in.c.C.r().g();
                    com.ss.android.ugc.aweme.port.in.c.C.n().a();
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final ArrayList<String> draftMusicList() {
                    ArrayList<String> arrayList;
                    if (EffectPlatform.f89015d != null) {
                        arrayList = EffectPlatform.f89015d;
                    } else {
                        EffectPlatform.f();
                        if (EffectPlatform.f89015d != null) {
                            arrayList = EffectPlatform.f89015d;
                        } else {
                            arrayList = new ArrayList<>();
                        }
                    }
                    l.b(arrayList, "");
                    return arrayList;
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final File[] outputFile() {
                    File[] listFiles = new File(cacheDir()).listFiles(a.f90383a);
                    l.b(listFiles, "");
                    return listFiles;
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final File[] rawDuetFile() {
                    File[] listFiles = new File(di.o).listFiles(b.f90384a);
                    l.b(listFiles, "");
                    return listFiles;
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final File[] rawVideoFile() {
                    File[] listFiles = new File(di.o).listFiles(C2181c.f90385a);
                    l.b(listFiles, "");
                    return listFiles;
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final String shareDir() {
                    return di.f126461d + "share/";
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final File[] synthesisFile() {
                    File[] listFiles = new File(di.o).listFiles(d.f90386a);
                    l.b(listFiles, "");
                    return listFiles;
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final File[] tempDuetFile() {
                    File[] listFiles = new File(di.o).listFiles(C2182e.f90387a);
                    l.b(listFiles, "");
                    return listFiles;
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final File[] voiceFile() {
                    File[] listFiles = new File(cacheDir()).listFiles(f.f90388a);
                    l.b(listFiles, "");
                    return listFiles;
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final void clearDraftEffectCache() {
                    try {
                        EffectService instance = EffectService.getInstance();
                        l.b(instance, "");
                        String cacheDir = instance.getCacheDir();
                        EffectService instance2 = EffectService.getInstance();
                        l.b(instance2, "");
                        ArrayList<String> draftEffectList = instance2.getDraftEffectList();
                        e eVar = this.f90382a.this$0;
                        File file = new File(cacheDir);
                        l.b(draftEffectList, "");
                        eVar.a(file, draftEffectList);
                    } catch (Exception unused) {
                    }
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final void clearEffectCache() {
                    com.ss.android.ugc.aweme.sticker.p.e.a().clear();
                    e eVar = this.f90382a.this$0;
                    EffectService instance = EffectService.getInstance();
                    l.b(instance, "");
                    eVar.a(instance.getCacheDir());
                    e eVar2 = this.f90382a.this$0;
                    EffectService instance2 = EffectService.getInstance();
                    l.b(instance2, "");
                    eVar2.a(instance2.getModelCacheDir());
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final Collection<String> draftAllowList() {
                    HashSet hashSet = new HashSet();
                    for (com.ss.android.ugc.aweme.draft.model.c cVar : new com.ss.android.ugc.aweme.tools.draft.j.c().queryAllDraftList(true)) {
                        if (cVar != null) {
                            hashSet.addAll(com.ss.android.ugc.aweme.draft.model.d.f(cVar));
                        }
                    }
                    return hashSet;
                }

                @Override // com.ss.android.ugc.aweme.services.external.ICacheService
                public final Collection<String> originSoundFile() {
                    Application application = com.ss.android.ugc.aweme.port.in.c.f115622a;
                    l.b(application, "");
                    ArrayList<OriginalSoundUploadTask> a2 = a.C3732a.a(application).a();
                    ArrayList arrayList = new ArrayList(n.a((Iterable) a2, 10));
                    Iterator<T> it = a2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().f140994c);
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    return h.a.i.a(array);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f90382a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.external.e$c$1$a */
                static final class a implements FileFilter {

                    /* renamed from: a  reason: collision with root package name */
                    public static final a f90383a = new a();

                    static {
                        Covode.recordClassIndex(56734);
                    }

                    a() {
                    }

                    public final boolean accept(File file) {
                        if (!(file == null || !file.exists() || file.getName() == null)) {
                            String name = file.getName();
                            l.b(name, "");
                            if (p.c(name, "-mix-concat-a", false)) {
                                return true;
                            }
                        }
                        return false;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.external.e$c$1$b */
                static final class b implements FileFilter {

                    /* renamed from: a  reason: collision with root package name */
                    public static final b f90384a = new b();

                    static {
                        Covode.recordClassIndex(56735);
                    }

                    b() {
                    }

                    public final boolean accept(File file) {
                        if (!(file == null || !file.exists() || file.getName() == null)) {
                            String name = file.getName();
                            l.b(name, "");
                            if (!p.b(name, "temp_", false)) {
                                String name2 = file.getName();
                                l.b(name2, "");
                                if (p.c(name2, ".mp4", false)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.external.e$c$1$c  reason: collision with other inner class name */
                static final class C2181c implements FileFilter {

                    /* renamed from: a  reason: collision with root package name */
                    public static final C2181c f90385a = new C2181c();

                    static {
                        Covode.recordClassIndex(56736);
                    }

                    C2181c() {
                    }

                    public final boolean accept(File file) {
                        if (!(file == null || !file.exists() || file.getName() == null)) {
                            String name = file.getName();
                            l.b(name, "");
                            if (p.c(name, "-concat-v", false)) {
                                String name2 = file.getName();
                                l.b(name2, "");
                                if (!p.b(name2, "synthetise_", false)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.external.e$c$1$d */
                static final class d implements FileFilter {

                    /* renamed from: a  reason: collision with root package name */
                    public static final d f90386a = new d();

                    static {
                        Covode.recordClassIndex(56737);
                    }

                    d() {
                    }

                    public final boolean accept(File file) {
                        if (!(file == null || !file.exists() || file.getName() == null)) {
                            String name = file.getName();
                            l.b(name, "");
                            if (p.b(name, "synthetise_", false)) {
                                return true;
                            }
                            String name2 = file.getName();
                            l.b(name2, "");
                            if (p.c(name2, "_synthetise", false)) {
                                return true;
                            }
                        }
                        return false;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.external.e$c$1$e  reason: collision with other inner class name */
                static final class C2182e implements FileFilter {

                    /* renamed from: a  reason: collision with root package name */
                    public static final C2182e f90387a = new C2182e();

                    static {
                        Covode.recordClassIndex(56738);
                    }

                    C2182e() {
                    }

                    public final boolean accept(File file) {
                        if (!(file == null || !file.exists() || file.getName() == null)) {
                            String name = file.getName();
                            l.b(name, "");
                            if (p.b(name, "temp_", false)) {
                                return true;
                            }
                        }
                        return false;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.external.e$c$1$f */
                static final class f implements FileFilter {

                    /* renamed from: a  reason: collision with root package name */
                    public static final f f90388a = new f();

                    static {
                        Covode.recordClassIndex(56739);
                    }

                    f() {
                    }

                    public final boolean accept(File file) {
                        if (!(file == null || !file.exists() || file.getName() == null)) {
                            String name = file.getName();
                            l.b(name, "");
                            if (p.c(name, "-concat-a", false)) {
                                String name2 = file.getName();
                                l.b(name2, "");
                                if (!p.c(name2, "-mix-concat-a", false)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }
            };
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final IPrivacyConfig privacyConfig() {
        return new d();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final IShortVideoConfig shortVideoConfig() {
        return ShortVideoConfigImpl.Companion.getInstance();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final IAVSettingsService avsettingsConfig() {
        AVSettingsServiceImpl instance = AVSettingsServiceImpl.getInstance();
        l.b(instance, "");
        return instance;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final ICacheService cacheConfig() {
        return (c.AnonymousClass1) this.f90380c.getValue();
    }

    static {
        Covode.recordClassIndex(56729);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final void updateServerSettings(IESSettingsProxy iESSettingsProxy) {
        AVSettingsServiceImpl.getInstance().updateServerSettings(iESSettingsProxy);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IConfigService
    public final void userAction(int i2) {
        if (i2 == 2) {
            com.ss.android.ugc.aweme.sticker.types.lock.e.f136141b = false;
            com.ss.android.ugc.aweme.sticker.types.lock.e.f136140a.clear();
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(9295);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(9295);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(9295);
        return delete;
    }

    public final void a(String str) {
        File[] listFiles;
        if (!u.a(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    l.b(file2, "");
                    if (file2.isDirectory()) {
                        a(file2.getPath());
                    } else {
                        a(file2);
                    }
                }
                a(file);
            }
        }
    }

    public final void a(File file, ArrayList<String> arrayList) {
        if (file.exists() && file.isDirectory()) {
            if (arrayList.isEmpty()) {
                a(file.getAbsolutePath());
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        l.b(file2, "");
                        if (!file2.isDirectory()) {
                            a(file2);
                        } else if (!arrayList.contains(file2.getName())) {
                            a(file2.getAbsolutePath());
                        }
                    }
                    com.ss.android.ugc.aweme.cw.g.a();
                }
            }
        }
    }
}
