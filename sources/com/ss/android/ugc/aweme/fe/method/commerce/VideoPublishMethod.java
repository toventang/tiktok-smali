package com.ss.android.ugc.aweme.fe.method.commerce;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.VideoMedia;
import com.ss.android.ugc.aweme.utils.cs;
import h.f.b.l;
import java.util.UUID;
import org.json.JSONObject;

public final class VideoPublishMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91257a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57440);
    }

    private VideoPublishMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57441);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements IExternalService.ServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f91258a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPublishMethod f91259b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ JSONObject f91260c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ JSONObject f91261d;

        static {
            Covode.recordClassIndex(57442);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            l.d(asyncAVService, "");
            EditConfig.Builder builder = new EditConfig.Builder();
            VideoMedia videoMedia = new VideoMedia(this.f91258a);
            Bundle bundle = new Bundle();
            bundle.putString("cc_vid", this.f91260c.optString("vid"));
            bundle.putBoolean("edit_publish_session_end_together", true);
            videoMedia.setExtraBundle(bundle);
            EditConfig.Builder creationId = builder.mediaInfo(videoMedia).creationId(UUID.randomUUID().toString());
            String optString = this.f91260c.optString("vid");
            l.b(optString, "");
            asyncAVService.uiService().editService().startEdit(this.f91259b.getActContext(), creationId.ccvid(optString).shootWay("enterprise_service_center").build());
            this.f91261d.put("code", 1);
        }

        b(String str, VideoPublishMethod videoPublishMethod, JSONObject jSONObject, JSONObject jSONObject2) {
            this.f91258a = str;
            this.f91259b = videoPublishMethod;
            this.f91260c = jSONObject;
            this.f91261d = jSONObject2;
        }
    }

    private /* synthetic */ VideoPublishMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public VideoPublishMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String optString;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", -1);
        if (!(jSONObject == null || (optString = jSONObject.optString("path")) == null)) {
            boolean a2 = com.ss.android.ugc.aweme.challenge.ui.a.b.a(optString);
            if (!a2) {
                jSONObject2.put("reason", "path should not be empty");
            } else if (a2) {
                if (!cs.a(optString)) {
                    jSONObject2.put("reason", "filePath doesn't exists");
                } else {
                    AVExternalServiceImpl.a().asyncService("enterprise_service_center", new b(optString, this, jSONObject, jSONObject2));
                }
            }
        }
        if (aVar != null) {
            aVar.a(jSONObject2);
        }
    }
}
