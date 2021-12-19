package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.feed.model.LiveEvent;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import org.json.JSONObject;

public final class y implements h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f123814b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.ies.web.a.a f123815a;

    /* renamed from: c  reason: collision with root package name */
    private final LiveEvent f123816c;

    static {
        Covode.recordClassIndex(81261);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.gfg;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "refund_live_event";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81262);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        return ch_();
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        String startTime = this.f123816c.getStartTime();
        if (startTime == null || Long.parseLong(startTime) - (System.currentTimeMillis() / 1000) < 43200) {
            return R.raw.icon_2pt_refund_grey;
        }
        return R.raw.icon_2pt_refund_black;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(ImageView imageView) {
        l.d(imageView, "");
        l.d(imageView, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(TextView textView) {
        l.d(textView, "");
        h.a.a(this, textView);
    }

    public y(LiveEvent liveEvent, com.bytedance.ies.web.a.a aVar) {
        l.d(liveEvent, "");
        this.f123816c = liveEvent;
        this.f123815a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(StringSet.type, "refund");
        com.bytedance.ies.web.a.a aVar = this.f123815a;
        if (aVar != null) {
            aVar.b("live_event_operation", jSONObject);
        }
    }
}
