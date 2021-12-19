package com.ss.android.ugc.aweme.setting;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import b.i;
import com.bytedance.apm.b;
import com.bytedance.apm.config.d;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.datacenter.e;
import com.bytedance.ies.abmock.j;
import com.bytedance.ies.abmock.p;
import com.google.gson.l;
import com.google.gson.o;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.utils.k;
import com.ss.android.ugc.aweme.legoImp.task.y;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.setting.api.SettingApi;
import com.ss.android.ugc.aweme.setting.model.d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public abstract class by implements WeakHandler.IHandler, bh {

    /* renamed from: a  reason: collision with root package name */
    public static by f122128a = new bc();

    /* renamed from: b  reason: collision with root package name */
    protected SettingApi f122129b = ((SettingApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(SettingApi.class));

    /* renamed from: c  reason: collision with root package name */
    protected WeakHandler f122130c = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: d  reason: collision with root package name */
    public String f122131d = "{}";

    /* renamed from: e  reason: collision with root package name */
    protected List<a> f122132e = new ArrayList();

    public interface a {
        static {
            Covode.recordClassIndex(80074);
        }

        void a(d dVar);
    }

    public void a(Object obj) {
    }

    static {
        Covode.recordClassIndex(80072);
    }

    protected by() {
    }

    public final void a(a aVar) {
        this.f122132e.add(aVar);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        a(message.obj);
    }

    public final void a(Context context) {
        if (j.a().c()) {
            d.a a2 = com.bytedance.apm.config.d.a();
            a2.f24827a = "settings_v3_fallback_to_v1";
            b.a(a2.a());
        }
        cg.a();
        com.ss.android.ugc.aweme.global.config.settings.d.a().a(false);
        n.a().a(this.f122130c, new bz(this, context), 0);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object b(Context context) {
        try {
            String b2 = com.ss.android.ugc.aweme.co.b.b().b(com.bytedance.ies.ugc.appcontext.d.a(), "last_setting_version", "");
            int i2 = 0;
            if (context != null) {
                i2 = k.a(context);
            }
            l lVar = this.f122129b.queryRawSetting(y.a(), i2, b2).get();
            i.b(new cc(this, lVar), i.f4824a);
            return lVar;
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(l lVar) {
        if (lVar == null || !(lVar instanceof o)) {
            com.ss.android.ugc.aweme.framework.a.a.a("creator_fund_investigate action = creator_fund_setting_finished, success = false, is_combine = false, is_v3 = " + j.a().c() + ", is_v3_api = false");
            return null;
        }
        a((o) lVar, true);
        com.ss.android.ugc.aweme.framework.a.a.a("creator_fund_investigate action = creator_fund_setting_finished, success = true, is_combine = false, is_v3 = " + j.a().c() + ", is_v3_api = false");
        String str = "";
        try {
            if (((o) lVar).c("creator_fund_setting_entry_schema") != null) {
                str = ((o) lVar).c("creator_fund_setting_entry_schema").c();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        com.ss.android.ugc.aweme.framework.a.a.a("creator_fund_investigate action = creator_fund_setting_success, content = ".concat(String.valueOf(str)));
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(final com.ss.android.ugc.aweme.setting.model.d r10) {
        /*
        // Method dump skipped, instructions count: 1962
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.by.b(com.ss.android.ugc.aweme.setting.model.d):void");
    }

    public final void a(Object obj, boolean z) {
        i.b(new ca(this, obj, z), i.f4824a);
    }

    public final void a(o oVar, boolean z) {
        this.f122131d = oVar.toString();
        if (z) {
            SettingsManager a2 = SettingsManager.a();
            p.a(oVar);
            e.a().b();
            a2.c();
            return;
        }
        SettingsManager.a();
        e.a().b();
        SettingsManager.a().c();
    }
}
