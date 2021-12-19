package com.ss.android.ugc.gamora.editor.toolbar;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.e;
import b.i;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.ab;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.edit.EditMusicStruct;
import com.ss.android.ugc.aweme.services.edit.IReplaceMusicService;
import com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicApi;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import h.f.b.z;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class ReplaceMusicServiceImpl implements IReplaceMusicService {

    /* renamed from: a  reason: collision with root package name */
    private boolean f146993a;

    /* renamed from: b  reason: collision with root package name */
    private String f146994b = "";

    /* renamed from: c  reason: collision with root package name */
    private ReplaceMusicRequest f146995c = new ReplaceMusicRequest();

    static {
        Covode.recordClassIndex(96827);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final boolean isInPublish() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final boolean getClickPost() {
        return this.f146993a;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final String getCover() {
        return this.f146994b;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final ReplaceMusicRequest getReplaceMusicRequest() {
        return this.f146995c;
    }

    public static IReplaceMusicService a() {
        MethodCollector.i(4036);
        Object a2 = com.ss.android.ugc.b.a(IReplaceMusicService.class, false);
        if (a2 != null) {
            IReplaceMusicService iReplaceMusicService = (IReplaceMusicService) a2;
            MethodCollector.o(4036);
            return iReplaceMusicService;
        }
        if (com.ss.android.ugc.b.eI == null) {
            synchronized (IReplaceMusicService.class) {
                try {
                    if (com.ss.android.ugc.b.eI == null) {
                        com.ss.android.ugc.b.eI = new ReplaceMusicServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4036);
                    throw th;
                }
            }
        }
        ReplaceMusicServiceImpl replaceMusicServiceImpl = (ReplaceMusicServiceImpl) com.ss.android.ugc.b.eI;
        MethodCollector.o(4036);
        return replaceMusicServiceImpl;
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReplaceMusicRequest f146996a;

        static {
            Covode.recordClassIndex(96828);
        }

        a(ReplaceMusicRequest replaceMusicRequest) {
            this.f146996a = replaceMusicRequest;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ReplaceMusicRequest replaceMusicRequest = this.f146996a;
            l.d(replaceMusicRequest, "");
            String b2 = g.a().C().getRetrofitFactoryGson().b(replaceMusicRequest.getEditMusicStruct());
            String itemID = replaceMusicRequest.getItemID();
            String originalVid = replaceMusicRequest.getOriginalVid();
            l.b(b2, "");
            T t = ((ReplaceMusicApi.Api) g.a().C().createRetrofit(g.a().C().getApiHost(), true, ReplaceMusicApi.Api.class)).get(itemID, originalVid, b2).execute().f42630b;
            l.b(t, "");
            return t;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147003a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f147004b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f147005c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReplaceMusicRequest f147006d;

        static {
            Covode.recordClassIndex(96831);
        }

        c(e eVar, boolean z, String str, ReplaceMusicRequest replaceMusicRequest) {
            this.f147003a = eVar;
            this.f147004b = z;
            this.f147005c = str;
            this.f147006d = replaceMusicRequest;
        }

        public final void run() {
            if (!this.f147003a.isFinishing()) {
                q.a("ReplaceMusicToolbarScene", "showWindow: " + this.f147004b + ' ');
                final z.e eVar = new z.e();
                eVar.element = (T) new com.ss.android.ugc.gamora.editor.toolbar.a.a(this.f147003a, true, this.f147005c, null);
                if (!this.f147004b) {
                    if (this.f147006d != null) {
                        eVar.element = (T) new com.ss.android.ugc.gamora.editor.toolbar.a.a(this.f147003a, false, this.f147005c, this.f147006d);
                    } else {
                        return;
                    }
                }
                if (this.f147004b) {
                    new SafeHandler(this.f147003a).postDelayed(new Runnable() {
                        /* class com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl.c.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(96832);
                        }

                        public final void run() {
                            if (eVar.element.isShowing()) {
                                eVar.element.dismiss();
                            }
                        }
                    }, 4000);
                }
                T t = eVar.element;
                if (!t.f147021b.isFinishing()) {
                    PullUpLayout pullUpLayout = t.f147020a;
                    if (pullUpLayout != null) {
                        pullUpLayout.a();
                    }
                    try {
                        Window window = t.f147021b.getWindow();
                        l.b(window, "");
                        View decorView = window.getDecorView();
                        int i2 = Build.VERSION.SDK_INT;
                        t.showAtLocation(decorView, 48, 0, -n.e(com.ss.android.ugc.aweme.df.b.a()));
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setClickPost(boolean z) {
        this.f146993a = z;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setCover(String str) {
        l.d(str, "");
        this.f146994b = str;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void setReplaceMusicRequest(ReplaceMusicRequest replaceMusicRequest) {
        l.d(replaceMusicRequest, "");
        this.f146995c = replaceMusicRequest;
    }

    static final class b<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReplaceMusicServiceImpl f146997a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f146998b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f146999c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReplaceMusicRequest f147000d;

        static {
            Covode.recordClassIndex(96829);
        }

        b(ReplaceMusicServiceImpl replaceMusicServiceImpl, e eVar, String str, ReplaceMusicRequest replaceMusicRequest) {
            this.f146997a = replaceMusicServiceImpl;
            this.f146998b = eVar;
            this.f146999c = str;
            this.f147000d = replaceMusicRequest;
        }

        @Override // b.g
        public final /* synthetic */ Object then(final i iVar) {
            String str;
            l.d(iVar, "");
            if (iVar.c() || iVar.b()) {
                Exception e2 = iVar.e();
                String str2 = null;
                if (!(e2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                    e2 = null;
                }
                com.ss.android.ugc.aweme.base.api.a.a aVar = (com.ss.android.ugc.aweme.base.api.a.a) e2;
                if (aVar != null && aVar.getErrorCode() == 3013002) {
                    Exception e3 = iVar.e();
                    if (!(e3 instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                        e3 = null;
                    }
                    com.ss.android.ugc.aweme.base.api.a.b.a aVar2 = (com.ss.android.ugc.aweme.base.api.a.b.a) e3;
                    if (aVar2 != null) {
                        str = aVar2.getErrorMsg();
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        new SafeHandler(this.f146998b).post(new Runnable(this) {
                            /* class com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl.b.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ b f147001a;

                            static {
                                Covode.recordClassIndex(96830);
                            }

                            {
                                this.f147001a = r1;
                            }

                            public final void run() {
                                String str;
                                com.bytedance.tux.g.b bVar = new com.bytedance.tux.g.b(this.f147001a.f146998b);
                                Exception e2 = iVar.e();
                                if (!(e2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                                    e2 = null;
                                }
                                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) e2;
                                if (aVar == null || (str = aVar.getErrorMsg()) == null) {
                                    str = "";
                                }
                                bVar.a(str).b();
                            }
                        });
                        q.a("ReplaceMusicToolbarScene", "error code 3013002");
                    }
                }
                StringBuilder sb = new StringBuilder("first network error ");
                Exception e4 = iVar.e();
                if (e4 != null) {
                    str2 = e4.toString();
                }
                q.a("ReplaceMusicToolbarScene", sb.append(str2).toString());
                this.f146997a.showWindow(false, this.f146999c, this.f147000d);
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void showWindow(JSONObject jSONObject, boolean z) {
        String str;
        EditMusicStruct editMusicStruct;
        l.d(jSONObject, "");
        try {
            String string = jSONObject.getString("item_id");
            String string2 = jSONObject.getString("original_vid");
            String string3 = jSONObject.getString("cover_url");
            EditMusicStruct editMusicStruct2 = (EditMusicStruct) g.a().C().getRetrofitFactoryGson().a(jSONObject.getString("new_music_info"), EditMusicStruct.class);
            ReplaceMusicRequest replaceMusicRequest = new ReplaceMusicRequest();
            l.b(editMusicStruct2, "");
            replaceMusicRequest.setEditMusicStruct(editMusicStruct2);
            l.b(string, "");
            replaceMusicRequest.setItemID(string);
            l.b(string2, "");
            replaceMusicRequest.setOriginalVid(string2);
            l.b(string3, "");
            showWindow(z, string3, replaceMusicRequest);
            q.a("ReplaceMusicToolbarScene", "long link response ".concat(String.valueOf(jSONObject)));
            d dVar = new d();
            ReplaceMusicRequest replaceMusicRequest2 = getReplaceMusicRequest();
            String str2 = null;
            if (replaceMusicRequest2 != null) {
                str = replaceMusicRequest2.getItemID();
            } else {
                str = null;
            }
            dVar.a("group_id", str);
            ReplaceMusicRequest replaceMusicRequest3 = getReplaceMusicRequest();
            if (!(replaceMusicRequest3 == null || (editMusicStruct = replaceMusicRequest3.getEditMusicStruct()) == null)) {
                str2 = editMusicStruct.getMusicID();
            }
            dVar.a("replace_music_id", str2);
            dVar.a("replace_status", z ? 1 : 0);
            r.a("publish_replace_music_status", dVar.f66730a);
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void doRequest(String str, ReplaceMusicRequest replaceMusicRequest, e eVar) {
        l.d(str, "");
        l.d(replaceMusicRequest, "");
        l.d(eVar, "");
        i.b(new a(replaceMusicRequest), i.f4824a).a(new b(this, eVar, str, replaceMusicRequest), i.f4826c, null);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IReplaceMusicService
    public final void showWindow(boolean z, String str, ReplaceMusicRequest replaceMusicRequest) {
        l.d(str, "");
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        ab applicationService = createIAVServiceProxybyMonsterPlugin.getApplicationService();
        l.b(applicationService, "");
        e f2 = applicationService.f();
        if (f2 != null) {
            new SafeHandler(f2).post(new c(f2, z, str, replaceMusicRequest));
        }
    }
}
