package com.ss.android.ugc.aweme.tcm.impl.bc.view;

import android.view.View;
import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.ax;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.tcm.api.b.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private BCInPublishLayout f138610a;

    static {
        Covode.recordClassIndex(90678);
    }

    public a(ViewStub viewStub, ax.a aVar) {
        String str;
        l.d(viewStub, "");
        l.d(aVar, "");
        MethodCollector.i(8492);
        if (viewStub.getParent() != null) {
            viewStub.setLayoutResource(R.layout.ls);
            viewStub.setInflatedId(R.id.s2);
            View inflate = viewStub.inflate();
            if (inflate != null) {
                this.f138610a = (BCInPublishLayout) inflate;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.tcm.impl.bc.view.BCInPublishLayout");
                MethodCollector.o(8492);
                throw nullPointerException;
            }
        } else {
            this.f138610a = (BCInPublishLayout) viewStub.findViewById(R.id.s2);
        }
        BCInPublishLayout bCInPublishLayout = this.f138610a;
        if (bCInPublishLayout != null) {
            bCInPublishLayout.setMusicUsageOrigin(aVar.b());
        }
        BCInPublishLayout bCInPublishLayout2 = this.f138610a;
        if (bCInPublishLayout2 != null) {
            bCInPublishLayout2.setCommerceMusic(aVar.c());
        }
        BCInPublishLayout bCInPublishLayout3 = this.f138610a;
        if (bCInPublishLayout3 != null) {
            bCInPublishLayout3.setVisibility(0);
        }
        BCInPublishLayout bCInPublishLayout4 = this.f138610a;
        if (bCInPublishLayout4 != null) {
            bCInPublishLayout4.setPublishExtensionDataContainer(aVar);
        }
        BCInPublishLayout bCInPublishLayout5 = this.f138610a;
        if (bCInPublishLayout5 != null) {
            ax.a aVar2 = bCInPublishLayout5.f138593a;
            if (aVar2 != null) {
                str = aVar2.a();
            } else {
                str = null;
            }
            PublishExtensionModel fromString = PublishExtensionModel.fromString(str);
            String str2 = fromString.outerStarAtlas;
            if (!(str2 == null || str2.length() == 0)) {
                JSONObject jSONObject = new JSONObject(fromString.outerStarAtlas);
                if (l.a((Object) jSONObject.optString("recordParam"), (Object) "tcm") && jSONObject.optString("campaignInfo") != null) {
                    c.b("1");
                }
            }
            MethodCollector.o(8492);
            return;
        }
        MethodCollector.o(8492);
    }
}
