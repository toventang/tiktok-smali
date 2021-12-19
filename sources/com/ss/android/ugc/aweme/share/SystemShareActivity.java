package com.ss.android.ugc.aweme.share;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.ad;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.opensdkservice.HandleMediaListener;
import com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService;
import com.ss.android.ugc.aweme.opensdkservice.OpenPlatformServiceImpl;
import com.ss.android.ugc.aweme.openshare.Share;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import com.ss.android.ugc.aweme.tasks.LogLaunchModeTask;
import com.ss.android.ugc.aweme.utils.cs;
import com.ss.android.ugc.aweme.utils.ge;
import com.ss.android.ugc.aweme.utils.ha;
import com.zhiliaoapp.musically.R;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class SystemShareActivity extends androidx.appcompat.app.d {

    /* renamed from: a  reason: collision with root package name */
    public final String f123264a = "homepage_hot";

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.openshare.a f123265b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.common.d f123266c;

    /* renamed from: d  reason: collision with root package name */
    public Share.Request f123267d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.share.viewmodel.c f123268e;

    /* renamed from: f  reason: collision with root package name */
    public SystemShareActivity f123269f;

    /* renamed from: g  reason: collision with root package name */
    public final u<i> f123270g = new m(this);

    /* renamed from: h  reason: collision with root package name */
    private com.ss.android.ugc.aweme.share.viewmodel.b f123271h;

    /* renamed from: i  reason: collision with root package name */
    private IOpenPlatformService f123272i;

    /* renamed from: j  reason: collision with root package name */
    private final String f123273j = "click_open_share";

    /* renamed from: k  reason: collision with root package name */
    private final String f123274k = "share";

    /* renamed from: l  reason: collision with root package name */
    private final u<Boolean> f123275l = new n(this);

    /* renamed from: m  reason: collision with root package name */
    private final u<Share.Response> f123276m = new l(this);

    public enum a {
        IMAGE,
        VIDEO;

        static {
            Covode.recordClassIndex(80976);
        }
    }

    static {
        Covode.recordClassIndex(80975);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: package-private */
    public static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SystemShareActivity f123286a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Uri f123287b;

        static {
            Covode.recordClassIndex(80981);
        }

        f(SystemShareActivity systemShareActivity, Uri uri) {
            this.f123286a = systemShareActivity;
            this.f123287b = uri;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String a2 = ge.f142986a.a(this.f123286a, this.f123287b);
            if (a2 == null) {
                return "";
            }
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SystemShareActivity f123278a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Uri f123279b;

        static {
            Covode.recordClassIndex(80977);
        }

        b(SystemShareActivity systemShareActivity, Uri uri) {
            this.f123278a = systemShareActivity;
            this.f123279b = uri;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ge geVar = ge.f142986a;
            SystemShareActivity systemShareActivity = this.f123278a;
            Uri uri = this.f123279b;
            h.f.b.l.b(uri, "");
            String a2 = geVar.a(systemShareActivity, uri);
            if (a2 == null) {
                return "";
            }
            return a2;
        }
    }

    public static final class j implements HandleMediaListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SystemShareActivity f123293a;

        static {
            Covode.recordClassIndex(80985);
        }

        @Override // com.ss.android.ugc.aweme.opensdkservice.HandleMediaListener
        public final void onArgsError() {
            SystemShareActivity systemShareActivity = this.f123293a;
            new aj(systemShareActivity, systemShareActivity.f123266c).a("Params parsing error, media resource type difference you pass", 20002);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(SystemShareActivity systemShareActivity) {
            this.f123293a = systemShareActivity;
        }

        @Override // com.ss.android.ugc.aweme.opensdkservice.HandleMediaListener
        public final void onGetImagePath(ArrayList<String> arrayList) {
            this.f123293a.a(arrayList, a.IMAGE);
        }

        @Override // com.ss.android.ugc.aweme.opensdkservice.HandleMediaListener
        public final void onGetVideoPath(ArrayList<String> arrayList) {
            h.f.b.l.d(arrayList, "");
            this.f123293a.a(arrayList, a.VIDEO);
        }
    }

    public final com.ss.android.ugc.aweme.openshare.a a() {
        com.ss.android.ugc.aweme.openshare.a aVar = this.f123265b;
        if (aVar == null) {
            h.f.b.l.a("shareDistictType");
        }
        return aVar;
    }

    public final void b() {
        IOpenPlatformService b2 = OpenPlatformServiceImpl.b();
        h.f.b.l.b(b2, "");
        this.f123272i = b2;
        if (b2 == null) {
            h.f.b.l.a("mOpenPlatformService");
        }
        b2.a();
        e();
    }

    /* access modifiers changed from: package-private */
    public static final class h<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SystemShareActivity f123290a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f123291b;

        static {
            Covode.recordClassIndex(80983);
        }

        h(SystemShareActivity systemShareActivity, ArrayList arrayList) {
            this.f123290a = systemShareActivity;
            this.f123291b = arrayList;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f123291b;
            if (arrayList2 == null) {
                h.f.b.l.b();
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                ge geVar = ge.f142986a;
                SystemShareActivity systemShareActivity = this.f123290a;
                String str = "";
                h.f.b.l.b(uri, str);
                String a2 = geVar.a(systemShareActivity, uri);
                if (a2 != null) {
                    str = a2;
                }
                com.ss.android.ugc.aweme.framework.a.a.a("SystemShareActivity realPath = ".concat(String.valueOf(str)));
                arrayList.add(str);
            }
            return arrayList;
        }
    }

    public final void c() {
        com.ss.android.ugc.aweme.openshare.a aVar = this.f123265b;
        if (aVar == null) {
            h.f.b.l.a("shareDistictType");
        }
        com.ss.android.ugc.aweme.share.viewmodel.b bVar = new com.ss.android.ugc.aweme.share.viewmodel.b(aVar);
        this.f123271h = bVar;
        bVar.f124416c.postValue(this.f123266c);
        String str = this.f123264a;
        Share.Request request = this.f123267d;
        if (request == null) {
            h.f.b.l.a("shareRequest");
        }
        Context b2 = b(this);
        h.f.b.l.b(b2, "");
        bVar.a(str, request, this, b2);
        bVar.f124415b.observeForever(this.f123276m);
        bVar.f124417d.observeForever(this.f123275l);
    }

    public final void finish() {
        t<i> tVar;
        t<Share.Response> tVar2;
        t<Boolean> tVar3;
        super.finish();
        com.ss.android.ugc.aweme.share.viewmodel.b bVar = this.f123271h;
        if (!(bVar == null || (tVar3 = bVar.f124417d) == null)) {
            tVar3.removeObserver(this.f123275l);
        }
        com.ss.android.ugc.aweme.share.viewmodel.b bVar2 = this.f123271h;
        if (!(bVar2 == null || (tVar2 = bVar2.f124415b) == null)) {
            tVar2.removeObserver(this.f123276m);
        }
        com.ss.android.ugc.aweme.share.viewmodel.c cVar = this.f123268e;
        if (cVar != null && (tVar = cVar.f124421b) != null) {
            tVar.removeObserver(this.f123270g);
        }
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SystemShareActivity f123282a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f123283b;

        static {
            Covode.recordClassIndex(80979);
        }

        d(SystemShareActivity systemShareActivity, ArrayList arrayList) {
            this.f123282a = systemShareActivity;
            this.f123283b = arrayList;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f123283b;
            if (arrayList2 == null) {
                h.f.b.l.b();
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Uri parse = Uri.parse(str);
                String str2 = "";
                h.f.b.l.b(parse, str2);
                if (p.a("content", parse.getScheme(), true)) {
                    String a2 = ge.f142986a.a(this.f123282a, parse);
                    if (a2 != null) {
                        str2 = a2;
                    }
                    arrayList.add(str2);
                } else {
                    h.f.b.l.b(str, str2);
                    arrayList.add(str);
                }
            }
            return arrayList;
        }
    }

    private final void d() {
        String str;
        String str2;
        try {
            Intent intent = getIntent();
            Uri uri = null;
            if (intent != null) {
                uri = intent.getData();
                str = a(intent, "_aweme_open_sdk_params_client_key");
                if (str == null) {
                    str = "";
                }
                boolean booleanExtra = getIntent().getBooleanExtra("from_notification", false);
                if (uri != null) {
                    str2 = uri.getQueryParameter("gd_label");
                } else {
                    str2 = "";
                }
                if (booleanExtra || str2 != null) {
                    if (!TextUtils.isEmpty(str)) {
                        new f.c().b((w) new LogLaunchModeTask(uri, str, this.f123273j)).a();
                    } else {
                        new f.c().b((w) new LogLaunchModeTask(uri, str)).a();
                    }
                    com.ss.android.ugc.aweme.app.j a2 = com.ss.android.ugc.aweme.app.j.a();
                    h.f.b.l.b(a2, "");
                    a2.f66809b = false;
                    return;
                }
            } else {
                str = "";
            }
            r.onEvent(MobClick.obtain().setEventName("launch_app").setLabelName("enter_launch"));
            if (!TextUtils.isEmpty(str)) {
                new f.c().b((w) new LogLaunchModeTask(uri, str, this.f123273j)).a();
            } else {
                new f.c().b((w) new LogLaunchModeTask(uri, str)).a();
            }
            com.ss.android.ugc.aweme.app.j a3 = com.ss.android.ugc.aweme.app.j.a();
            h.f.b.l.b(a3, "");
            a3.f66809b = false;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void e() {
        d();
        this.f123265b = new com.ss.android.ugc.aweme.openshare.a();
        Intent intent = getIntent();
        h.f.b.l.b(intent, "");
        if (TextUtils.equals(intent.getAction(), "android.intent.action.SEND")) {
            ad b2 = ha.b(getIntent());
            this.f123266c = b2;
            if (b2 == null) {
                ha.a();
                return;
            }
            Uri uri = (Uri) getIntent().getParcelableExtra("android.intent.extra.STREAM");
            if (uri != null) {
                com.ss.android.ugc.aweme.framework.a.a.a("SystemShareActivity uri = ".concat(String.valueOf(uri)));
                b.i.b(new f(this, uri), b.i.f4824a).a(new g(this, uri), b.i.f4826c, null);
                return;
            }
            return;
        }
        Intent intent2 = getIntent();
        h.f.b.l.b(intent2, "");
        if (TextUtils.equals(intent2.getAction(), "android.intent.action.SEND_MULTIPLE")) {
            ad b3 = ha.b(getIntent());
            this.f123266c = b3;
            if (b3 == null) {
                com.ss.android.ugc.aweme.framework.a.a.a("SystemShareActivity shareBase is null, return");
                ha.a();
                return;
            }
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("android.intent.extra.STREAM");
            if (com.bytedance.common.utility.collection.b.a((Collection) parcelableArrayListExtra)) {
                com.ss.android.ugc.aweme.framework.a.a.a("SystemShareActivity uriList is null, return");
                ha.a();
                return;
            }
            b.i.b(new h(this, parcelableArrayListExtra), b.i.f4824a).a(new i(this), b.i.f4826c, null);
            return;
        }
        IOpenPlatformService iOpenPlatformService = this.f123272i;
        if (iOpenPlatformService == null) {
            h.f.b.l.a("mOpenPlatformService");
        }
        Intent intent3 = getIntent();
        h.f.b.l.b(intent3, "");
        if (iOpenPlatformService.a(intent3)) {
            ad a2 = ha.a(getIntent());
            this.f123266c = a2;
            if (a2 != null) {
                Share.Request a3 = ha.a(a2.getShareRequestBundle());
                h.f.b.l.b(a3, "");
                this.f123267d = a3;
                IOpenPlatformService iOpenPlatformService2 = this.f123272i;
                if (iOpenPlatformService2 == null) {
                    h.f.b.l.a("mOpenPlatformService");
                }
                Intent intent4 = getIntent();
                h.f.b.l.b(intent4, "");
                iOpenPlatformService2.a(intent4, new j(this));
                return;
            }
            return;
        }
        finish();
    }

    static final class n<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SystemShareActivity f123298a;

        static {
            Covode.recordClassIndex(80990);
        }

        n(SystemShareActivity systemShareActivity) {
            this.f123298a = systemShareActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f123298a.finish();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SystemShareActivity f123288a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Uri f123289b;

        static {
            Covode.recordClassIndex(80982);
        }

        g(SystemShareActivity systemShareActivity, Uri uri) {
            this.f123288a = systemShareActivity;
            this.f123289b = uri;
        }

        private static Context a(SystemShareActivity systemShareActivity) {
            Context applicationContext = systemShareActivity.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            return applicationContext;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: java.util.List<java.lang.String> */
        /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: java.util.List<java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            StringBuilder sb = new StringBuilder("SystemShareActivity path = ");
            h.f.b.l.b(iVar, "");
            com.ss.android.ugc.aweme.framework.a.a.a(sb.append((String) iVar.d()).toString());
            Object d2 = iVar.d();
            h.f.b.l.b(d2, "");
            if (((CharSequence) d2).length() == 0) {
                com.bytedance.services.apm.api.a.a("SystemShareActivity path is null, uri = " + this.f123289b);
            }
            if (!cs.a((String) iVar.d())) {
                com.ss.android.ugc.aweme.framework.a.a.a("SystemShareActivity path not exists, return");
                new com.ss.android.ugc.aweme.tux.a.i.a(a(this.f123288a)).a(this.f123288a.getString(R.string.ft8)).a();
                ha.a();
            } else {
                StringBuilder sb2 = new StringBuilder("SystemShareActivity intent.type = ");
                Intent intent = this.f123288a.getIntent();
                h.f.b.l.b(intent, "");
                com.ss.android.ugc.aweme.framework.a.a.a(sb2.append(intent.getType()).toString());
                Intent intent2 = this.f123288a.getIntent();
                h.f.b.l.b(intent2, "");
                if (ha.a(intent2.getType())) {
                    this.f123288a.a().f114533a = com.ss.android.ugc.aweme.openshare.a.f114526d;
                    List<String> list = this.f123288a.a().f114534b;
                    Object d3 = iVar.d();
                    h.f.b.l.b(d3, "");
                    list.add(d3);
                } else {
                    Intent intent3 = this.f123288a.getIntent();
                    h.f.b.l.b(intent3, "");
                    if (ha.b(intent3.getType())) {
                        this.f123288a.a().f114533a = com.ss.android.ugc.aweme.openshare.a.f114525c;
                        List<String> list2 = this.f123288a.a().f114534b;
                        Object d4 = iVar.d();
                        h.f.b.l.b(d4, "");
                        list2.add(d4);
                    } else {
                        com.ss.android.ugc.aweme.framework.a.a.a("SystemShareActivity can not handle intent.type, return");
                        new com.ss.android.ugc.aweme.tux.a.i.a(a(this.f123288a)).a(this.f123288a.getString(R.string.ft8)).a();
                        ha.a();
                    }
                }
                com.ss.android.ugc.aweme.base.utils.e.a("system_share");
                this.f123288a.f123268e = new com.ss.android.ugc.aweme.share.viewmodel.c(this.f123288a.a());
                com.ss.android.ugc.aweme.share.viewmodel.c cVar = this.f123288a.f123268e;
                if (cVar != null) {
                    cVar.f124420a.setValue(this.f123288a.f123266c);
                    cVar.a(this.f123288a.f123264a, SystemShareActivity.a(this.f123288a));
                    cVar.f124421b.observeForever(this.f123288a.f123270g);
                }
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SystemShareActivity f123292a;

        static {
            Covode.recordClassIndex(80984);
        }

        i(SystemShareActivity systemShareActivity) {
            this.f123292a = systemShareActivity;
        }

        private static Context a(SystemShareActivity systemShareActivity) {
            Context applicationContext = systemShareActivity.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            return applicationContext;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            boolean z;
            h.f.b.l.b(iVar, "");
            for (String str : (List) iVar.d()) {
                if (cs.a(str)) {
                    this.f123292a.a().f114534b.add(str);
                }
            }
            Intent intent = this.f123292a.getIntent();
            h.f.b.l.b(intent, "");
            if (ha.a(intent.getType())) {
                this.f123292a.a().f114533a = com.ss.android.ugc.aweme.openshare.a.f114528f;
            } else {
                Intent intent2 = this.f123292a.getIntent();
                h.f.b.l.b(intent2, "");
                if (ha.b(intent2.getType())) {
                    this.f123292a.a().f114533a = com.ss.android.ugc.aweme.openshare.a.f114527e;
                } else {
                    Intent intent3 = this.f123292a.getIntent();
                    h.f.b.l.b(intent3, "");
                    String type = intent3.getType();
                    if (type != null) {
                        z = type.startsWith("*/*");
                    } else {
                        z = false;
                    }
                    if (z) {
                        List list = (List) iVar.d();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= list.size()) {
                                this.f123292a.a().f114533a = com.ss.android.ugc.aweme.openshare.a.f114527e;
                                break;
                            }
                            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(ha.c((String) list.get(i2)));
                            if (TextUtils.isEmpty(mimeTypeFromExtension) || mimeTypeFromExtension.contains("image")) {
                                i2++;
                            } else {
                                List list2 = (List) iVar.d();
                                for (int i3 = 0; i3 < list2.size(); i3++) {
                                    String mimeTypeFromExtension2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(ha.c((String) list2.get(i3)).toLowerCase());
                                    if (!(TextUtils.isEmpty(mimeTypeFromExtension2) || mimeTypeFromExtension2.contains("video"))) {
                                        new com.ss.android.ugc.aweme.tux.a.i.a(a(this.f123292a)).a(this.f123292a.getString(R.string.ft_)).a();
                                        ha.a();
                                        break;
                                    }
                                }
                                this.f123292a.a().f114533a = com.ss.android.ugc.aweme.openshare.a.f114528f;
                            }
                        }
                    } else {
                        new com.ss.android.ugc.aweme.tux.a.i.a(a(this.f123292a)).a(this.f123292a.getString(R.string.ft_)).a();
                        ha.a();
                    }
                    return z.f158842a;
                }
            }
            com.ss.android.ugc.aweme.base.utils.e.a("system_share");
            this.f123292a.f123268e = new com.ss.android.ugc.aweme.share.viewmodel.c(this.f123292a.a());
            com.ss.android.ugc.aweme.share.viewmodel.c cVar = this.f123292a.f123268e;
            if (cVar != null) {
                cVar.f124420a.setValue(this.f123292a.f123266c);
                cVar.a(this.f123292a.f123264a, SystemShareActivity.a(this.f123292a));
                cVar.f124421b.observeForever(this.f123292a.f123270g);
            }
            return z.f158842a;
        }
    }

    public static final /* synthetic */ SystemShareActivity a(SystemShareActivity systemShareActivity) {
        SystemShareActivity systemShareActivity2 = systemShareActivity.f123269f;
        if (systemShareActivity2 == null) {
            h.f.b.l.a("activity");
        }
        return systemShareActivity2;
    }

    private static Context b(SystemShareActivity systemShareActivity) {
        Context applicationContext = systemShareActivity.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    /* access modifiers changed from: package-private */
    public static final class c<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SystemShareActivity f123280a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f123281b;

        static {
            Covode.recordClassIndex(80978);
        }

        c(SystemShareActivity systemShareActivity, a aVar) {
            this.f123280a = systemShareActivity;
            this.f123281b = aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.String[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            int i2;
            com.ss.android.ugc.aweme.openshare.a a2 = this.f123280a.a();
            if (this.f123281b == a.IMAGE) {
                i2 = com.ss.android.ugc.aweme.openshare.a.f114525c;
            } else {
                i2 = com.ss.android.ugc.aweme.openshare.a.f114526d;
            }
            a2.f114533a = i2;
            com.ss.android.ugc.aweme.openshare.a a3 = this.f123280a.a();
            String[] strArr = new String[1];
            h.f.b.l.b(iVar, "");
            Object d2 = iVar.d();
            if (d2 == null) {
                h.f.b.l.b();
            }
            strArr[0] = d2;
            a3.a(h.a.n.c(strArr));
            this.f123280a.c();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SystemShareActivity f123284a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f123285b;

        static {
            Covode.recordClassIndex(80980);
        }

        e(SystemShareActivity systemShareActivity, a aVar) {
            this.f123284a = systemShareActivity;
            this.f123285b = aVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            int i2;
            com.ss.android.ugc.aweme.openshare.a a2 = this.f123284a.a();
            h.f.b.l.b(iVar, "");
            Object d2 = iVar.d();
            h.f.b.l.b(d2, "");
            a2.a((List) d2);
            com.ss.android.ugc.aweme.openshare.a a3 = this.f123284a.a();
            if (this.f123285b == a.IMAGE) {
                i2 = com.ss.android.ugc.aweme.openshare.a.f114527e;
            } else {
                i2 = com.ss.android.ugc.aweme.openshare.a.f114528f;
            }
            a3.f114533a = i2;
            this.f123284a.c();
            return z.f158842a;
        }
    }

    static final class m<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SystemShareActivity f123296a;

        static {
            Covode.recordClassIndex(80988);
        }

        m(SystemShareActivity systemShareActivity) {
            this.f123296a = systemShareActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            i iVar = (i) obj;
            if (!(iVar == null || (str = iVar.f123564c) == null || !(!p.a((CharSequence) str)))) {
                Context applicationContext = this.f123296a.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(applicationContext).a(str).a();
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.share.SystemShareActivity.m.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ m f123297a;

                static {
                    Covode.recordClassIndex(80989);
                }

                {
                    this.f123297a = r1;
                }

                public final void run() {
                    this.f123297a.f123296a.finish();
                }
            }, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        }
    }

    static final class l<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SystemShareActivity f123295a;

        static {
            Covode.recordClassIndex(80987);
        }

        l(SystemShareActivity systemShareActivity) {
            this.f123295a = systemShareActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Share.Response response = (Share.Response) obj;
            if (response != null) {
                SystemShareActivity systemShareActivity = this.f123295a;
                aj ajVar = new aj(systemShareActivity, systemShareActivity.f123266c);
                Share.Request request = this.f123295a.f123267d;
                if (request == null) {
                    h.f.b.l.a("shareRequest");
                }
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("launch_from", ajVar.f123355a.mClientKey);
                String str = "";
                if (ajVar.f123355a.extras != null) {
                    str = ajVar.f123355a.extras.getString("style_id", str);
                }
                r.a("share_error_status", a2.a("style_id", str).a("error_code", response.subErrorCode).f66730a);
                ajVar.a(request, response);
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f123269f = this;
        if (MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).shouldShowForcedLogin()) {
            Bundle loginActivityBundle = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).getLoginActivityBundle();
            loginActivityBundle.putBoolean("is_disable_animation", true);
            IAccountService.d dVar = new IAccountService.d();
            dVar.f62401a = this;
            dVar.f62402b = this.f123274k;
            dVar.f62403c = this.f123273j;
            dVar.f62405e = new k(this);
            dVar.f62404d = loginActivityBundle;
            com.ss.android.ugc.aweme.account.b.b().showLoginAndRegisterView(dVar.a());
        } else {
            b();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a(ArrayList<String> arrayList, a aVar) {
        int i2;
        h.f.b.l.d(aVar, "");
        if (!com.bytedance.common.utility.collection.b.a((Collection) arrayList)) {
            if (arrayList == null || arrayList.size() != 1) {
                b.i.b(new d(this, arrayList), b.i.f4824a).a(new e(this, aVar), b.i.f4826c, null);
            } else {
                Uri parse = Uri.parse(arrayList.get(0));
                h.f.b.l.b(parse, "");
                if (p.a("content", parse.getScheme(), true)) {
                    b.i.b(new b(this, parse), b.i.f4824a).a(new c(this, aVar), b.i.f4826c, null);
                } else {
                    com.ss.android.ugc.aweme.openshare.a aVar2 = this.f123265b;
                    if (aVar2 == null) {
                        h.f.b.l.a("shareDistictType");
                    }
                    if (aVar == a.IMAGE) {
                        i2 = com.ss.android.ugc.aweme.openshare.a.f114525c;
                    } else {
                        i2 = com.ss.android.ugc.aweme.openshare.a.f114526d;
                    }
                    aVar2.f114533a = i2;
                    com.ss.android.ugc.aweme.openshare.a aVar3 = this.f123265b;
                    if (aVar3 == null) {
                        h.f.b.l.a("shareDistictType");
                    }
                    aVar3.a(arrayList);
                    c();
                }
            }
            com.ss.android.ugc.aweme.base.utils.e.a("system_share");
            return;
        }
        new aj(this, this.f123266c).a("Params parsing error, media resource type difference you pass", 20002);
    }

    static final class k implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SystemShareActivity f123294a;

        static {
            Covode.recordClassIndex(80986);
        }

        k(SystemShareActivity systemShareActivity) {
            this.f123294a = systemShareActivity;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i2 == 1 && i3 == 1) {
                this.f123294a.b();
            }
        }
    }
}
