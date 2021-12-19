package com.bytedance.android.live.broadcast.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.broadcast.utils.d;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.browser.c.e;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveObsBroadcastGuideStrategySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveObsHelpPageSetting;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.widget.g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.b.b;

public final class a extends g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7548a;

    /* renamed from: b  reason: collision with root package name */
    String f7549b;

    /* renamed from: c  reason: collision with root package name */
    private String f7550c;

    /* renamed from: d  reason: collision with root package name */
    private String f7551d;

    /* renamed from: e  reason: collision with root package name */
    private String f7552e;

    /* renamed from: f  reason: collision with root package name */
    private String f7553f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f7554g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f7555h;

    /* renamed from: j  reason: collision with root package name */
    private TextView f7556j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f7557k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f7558l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f7559m;
    private TextView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private Room r;
    private LinearLayout s;
    private TextView t;
    private b u;
    private Context v;

    static {
        Covode.recordClassIndex(3729);
    }

    @Override // com.bytedance.android.livesdk.widget.g
    public final int b() {
        return R.layout.b68;
    }

    public final void show() {
        a();
        super.show();
    }

    public final void c() {
        b bVar = this.u;
        if (bVar != null && !bVar.isDisposed()) {
            this.u.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.t != null && !TextUtils.isEmpty(this.f7549b) && !TextUtils.equals(this.t.getText(), this.f7549b)) {
            this.t.setText(this.f7549b);
        }
    }

    private void a(boolean z) {
        String str;
        String idStr;
        String str2;
        if (z) {
            str = "livesdk_server_url_copy";
        } else {
            str = "livesdk_stream_key_copy";
        }
        com.bytedance.android.livesdk.ab.b a2 = b.a.a(str);
        Room room = this.r;
        if (room == null) {
            idStr = "";
        } else {
            idStr = room.getIdStr();
        }
        com.bytedance.android.livesdk.ab.b a3 = a2.a("room_id", idStr);
        if (this.f7548a) {
            str2 = "live_start";
        } else {
            str2 = "live_room";
        }
        a3.a("request_page", str2).b();
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.bfz) {
            d webViewManager = ((f) com.bytedance.android.live.t.a.a(f.class)).webViewManager();
            Context context = getContext();
            d.a b2 = e.b(this.f7550c);
            b2.f14291b = y.a((int) R.string.gsi);
            webViewManager.a(context, b2);
            b.a.a("thirdparty_take_guide").a().b("live").c("click").a("request_page", "live_room").b();
        } else if (id == R.id.dzc) {
            a(this.f7552e, true, PrivacyCert.Builder.with("bpea-211").usage("In the OBS scenario, the user needs to copy the push url and key to the clipboard, and then push the stream on the computer.").tag("copy_server_url").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
        } else if (id == R.id.dz8) {
            a(this.f7553f, false, PrivacyCert.Builder.with("bpea-212").usage("In the OBS scenario, the user needs to copy the push url and key to the clipboard, and then push the stream on the computer.").tag("copy_server_key").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
        }
    }

    @Override // com.bytedance.android.livesdk.widget.g
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7550c = LiveObsHelpPageSetting.INSTANCE.getValue();
        int lastIndexOf = this.f7551d.lastIndexOf("/");
        if (lastIndexOf == -1) {
            String str = this.f7551d;
            this.f7553f = str;
            this.f7552e = str;
        } else {
            int i2 = lastIndexOf + 1;
            this.f7552e = this.f7551d.substring(0, i2);
            this.f7553f = this.f7551d.substring(i2);
        }
        this.f7554g = (TextView) findViewById(R.id.title_tv);
        this.f7555h = (TextView) findViewById(R.id.bfz);
        this.f7556j = (TextView) findViewById(R.id.dzd);
        this.f7557k = (TextView) findViewById(R.id.dz9);
        this.f7558l = (TextView) findViewById(R.id.dzc);
        this.f7559m = (TextView) findViewById(R.id.dz8);
        this.n = (TextView) findViewById(R.id.dz4);
        this.o = (TextView) findViewById(R.id.dz5);
        this.p = (TextView) findViewById(R.id.dz6);
        this.q = (TextView) findViewById(R.id.dz7);
        this.s = (LinearLayout) findViewById(R.id.dza);
        this.t = (TextView) findViewById(R.id.dzb);
        this.f7555h.setOnClickListener(this);
        this.f7558l.setOnClickListener(this);
        this.f7559m.setOnClickListener(this);
        this.f7556j.setText(this.f7552e);
        this.f7557k.setText(this.f7553f);
        if (LiveObsBroadcastGuideStrategySetting.INSTANCE.getValue() == 1) {
            this.q.setVisibility(0);
        }
        Context context = this.v;
        if (context instanceof Activity) {
            this.f7549b = a(p.a(context).getIntent(), "live.intent.extra.LIVE_PC_TIPS");
        }
        if (TextUtils.isEmpty(this.f7549b)) {
            this.f7549b = getContext().getString(R.string.eor);
            a();
            this.u = d.a.a().a().getPreviewRoomCreateInfo(0).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this), new c(this));
            return;
        }
        a();
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public a(Context context, String str, Room room) {
        super(context);
        this.v = context;
        this.f7551d = str;
        this.r = room;
    }

    private void a(String str, boolean z, PrivacyCert privacyCert) {
        int i2;
        try {
            com.bytedance.android.live.broadcast.utils.b.a(str, privacyCert);
            if (z) {
                i2 = R.string.emg;
            } else {
                i2 = R.string.emy;
            }
            ao.a(y.e(), i2);
            a(z);
        } catch (Exception unused) {
            ao.a(y.e(), (int) R.string.gpj);
        }
    }
}
