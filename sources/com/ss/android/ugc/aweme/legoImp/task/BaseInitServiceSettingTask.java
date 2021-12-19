package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.ttsetting.FetchTTSettingTask;
import com.bytedance.ies.ugc.aweme.ttsetting.b;
import com.ss.android.newmedia.h;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.d;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public class BaseInitServiceSettingTask implements w {
    static {
        Covode.recordClassIndex(68942);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public String h() {
        return getClass().getSimpleName();
    }

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseInitServiceSettingTask f107748a;

        static {
            Covode.recordClassIndex(68943);
        }

        @Override // com.bytedance.ies.ugc.aweme.ttsetting.b
        public final void a(Throwable th) {
            l.d(th, "");
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.BaseInitServiceSettingTask$a$a  reason: collision with other inner class name */
        static final class CallableC2771a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f107749a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ JSONObject f107750b;

            static {
                Covode.recordClassIndex(68944);
            }

            CallableC2771a(a aVar, JSONObject jSONObject) {
                this.f107749a = aVar;
                this.f107750b = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                com.ss.android.ugc.aweme.de.a aVar;
                if (!d.f() && (aVar = com.ss.android.ugc.aweme.de.a.f79387a) != null) {
                    aVar.a(this.f107750b);
                }
                this.f107749a.f107748a.a(this.f107750b);
                return z.f158842a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(BaseInitServiceSettingTask baseInitServiceSettingTask) {
            this.f107748a = baseInitServiceSettingTask;
        }

        @Override // com.bytedance.ies.ugc.aweme.ttsetting.b
        public final void a(JSONObject jSONObject) {
            com.ss.android.ugc.aweme.de.a aVar;
            if (com.bytedance.ies.abmock.b.a().a(true, "is_async_setting", true)) {
                i.b(new CallableC2771a(this, jSONObject), g.a());
                return;
            }
            if (!d.f() && (aVar = com.ss.android.ugc.aweme.de.a.f79387a) != null) {
                aVar.a(jSONObject);
            }
            this.f107748a.a(jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        l.d(context, "");
        f.c cVar = new f.c();
        String str = Api.f66569d;
        l.b(str, "");
        cVar.b((w) new FetchTTSettingTask(str)).a();
        com.bytedance.ies.ugc.aweme.ttsetting.a.a(new a(this));
    }

    /* access modifiers changed from: protected */
    public void a(JSONObject jSONObject) {
        com.ss.android.ugc.aweme.settingsrequest.d.a aVar;
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("aweme_uniqueid_settings");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("user_badge_click_settings");
            if (!(optJSONObject2 == null || TextUtils.isEmpty(optJSONObject2.toString()) || (aVar = (com.ss.android.ugc.aweme.settingsrequest.d.a) com.ss.android.ugc.aweme.settingsrequest.d.d.f123212a.getValue()) == null)) {
                aVar.a(optJSONObject2.toString());
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("aweme_music_ailab");
            IExternalService a2 = AVExternalServiceImpl.a();
            if (optJSONObject3 != null) {
                a2.initService().initTask(2, optJSONObject3.toString());
            } else {
                a2.initService().initTask(2, "");
            }
            if (optJSONObject != null) {
                boolean z = true;
                if (optJSONObject.optInt("enable_push_deduplication", 1) <= 0) {
                    z = false;
                }
                h.f59976a = z;
            }
        }
    }
}
