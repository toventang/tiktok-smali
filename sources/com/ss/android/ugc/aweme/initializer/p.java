package com.ss.android.ugc.aweme.initializer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.ss.android.ugc.aweme.ac;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.c;
import com.ss.android.ugc.aweme.commercialize.h;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.ax;
import com.ss.android.ugc.aweme.port.internal.MainActivityCallback;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.setting.serverpush.a.b;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.ss.android.ugc.aweme.share.ai;
import com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.j.d;
import com.ss.android.ugc.aweme.shortvideo.model.StarAtlasPublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeApi;
import com.ss.android.ugc.aweme.shortvideo.publish.q;
import com.ss.android.ugc.aweme.shortvideo.ui.ae;
import com.ss.android.ugc.aweme.shortvideo.ui.x;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.tcm.impl.b.a;
import com.ss.android.ugc.h.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public final class p implements ax {
    static {
        Covode.recordClassIndex(67152);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ax
    public final int c() {
        return a.f138567a;
    }

    @Override // com.ss.android.ugc.aweme.port.in.ax
    public final boolean a(e eVar, Intent intent) {
        q publishModel;
        com.ss.android.ugc.aweme.framework.a.a.b(4, "Tools-Client", "PublishServiceImpl process publish intent:" + a(intent));
        if (intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT")) {
            com.ss.android.ugc.aweme.framework.a.a.a("processPublish. EXTRA_AWEME_DRAFT ");
            return true;
        } else if (intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_LIGHTENING_PUBLISH")) {
            if (intent.hasExtra("multi_publish_id")) {
                return new MainActivityCallback(eVar, a(intent, "multi_publish_id")).f115664e;
            }
            return true;
        } else if (intent.hasExtra("multi_publish_id")) {
            return new MainActivityCallback(eVar, a(intent, "multi_publish_id")).f115664e;
        } else {
            IAVPublishService publishService = AVExternalServiceImpl.a().publishService();
            if (!publishService.isParallelPublishEnabled() && (publishModel = publishService.getPublishModel(null)) != null && publishModel.f129874c == 0 && publishService.isPublishing()) {
                return new MainActivityCallback(eVar, null).f115664e;
            }
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.ax
    public final int d() {
        return g.f();
    }

    @Override // com.ss.android.ugc.aweme.port.in.ax
    public final List<com.ss.android.ugc.aweme.shortvideo.publish.e> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h());
        arrayList.add(new ai());
        arrayList.add(new com.ss.android.ugc.aweme.commercialize.a());
        arrayList.add(new c());
        arrayList.add(new com.ss.android.ugc.aweme.mix.c());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.port.in.ax
    public final boolean a() {
        return b.a(PushSettingsApiManager.a().T);
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.ax
    public final com.google.c.h.a.q<? extends com.ss.android.ugc.aweme.shortvideo.ai> a(LinkedHashMap<String, String> linkedHashMap) {
        return CreateAwemeApi.f129659a.createAweme(null, linkedHashMap);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ax
    public final List<androidx.core.g.e<Class<?>, IAVPublishExtension<?>>> a(AVPublishContentType aVPublishContentType) {
        l.d(aVPublishContentType, "");
        l.d(aVPublishContentType, "");
        ArrayList arrayList = new ArrayList();
        int i2 = ac.f62560a[aVPublishContentType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            androidx.core.g.e<Class<?>, IAVPublishExtension<?>> b2 = com.ss.android.ugc.aweme.poi_api.service.c.a().b();
            if (b2 != null) {
                arrayList.add(b2);
            }
            arrayList.add(androidx.core.g.e.a(StarAtlasPublishModel.class, new com.ss.android.ugc.aweme.tcm.impl.b.c()));
            arrayList.add(androidx.core.g.e.a(x.class, new x()));
            return arrayList;
        }
        throw new IllegalArgumentException("unknown type: " + aVPublishContentType.getContentType());
    }

    @Override // com.ss.android.ugc.aweme.port.in.ax
    public final void a(boolean z) {
        com.ss.android.ugc.d.a.c.a(new d(z));
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.ax
    public final void a(Activity activity, String str) {
        if (MainActivityCallback.a(activity)) {
            bj.a("PublishService bindProgressHost direct bind");
            new MainActivityCallback((e) activity, str);
            return;
        }
        bj.a("PublishService bindProgressHost post retry event");
        com.ss.android.ugc.d.a.c.b(new com.ss.android.ugc.aweme.base.component.g(str));
    }

    @Override // com.ss.android.ugc.aweme.port.in.ax
    public final void a(BaseResponse baseResponse, int i2) {
        if (baseResponse instanceof CreateAwemeResponse) {
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) baseResponse;
            if (createAwemeResponse.aweme != null) {
                createAwemeResponse.aweme.getVideo().setVideoLength(i2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.ax
    public final void a(CommonItemView commonItemView, boolean z, HashMap<String, String> hashMap) {
        new ae(commonItemView, z, hashMap);
    }
}
