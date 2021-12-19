package com.bytedance.android.livesdk.feed.banner.a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f17297a;

    static {
        Covode.recordClassIndex(9594);
    }

    b(a aVar) {
        this.f17297a = aVar;
    }

    public final void onClick(View view) {
        a aVar = this.f17297a;
        if (aVar.f17293e != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_source", aVar.f17294f);
            hashMap.put("banner_id", String.valueOf(aVar.f17293e.getId()));
            b.a.a("banner_click").a((Map<String, String>) hashMap).a().a("banner_position", aVar.f17295g + 1).b();
            if (!TextUtils.isEmpty(aVar.f17293e.f19726g) && a.a(IHostAction.class) != null) {
                ((IHostAction) a.a(IHostAction.class)).handleSchema(aVar.f17292d, aVar.f17293e.f19726g, new Bundle());
            }
        }
    }
}
