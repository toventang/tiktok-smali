package com.bytedance.android.livesdk.userservice;

import android.content.DialogInterface;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.host.g;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final String f22079a;

    /* renamed from: b  reason: collision with root package name */
    private final long f22080b;

    /* renamed from: c  reason: collision with root package name */
    private final String f22081c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f22082d = false;

    /* renamed from: e  reason: collision with root package name */
    private final String f22083e;

    /* renamed from: f  reason: collision with root package name */
    private final String f22084f;

    /* renamed from: g  reason: collision with root package name */
    private final DialogInterface.OnClickListener f22085g;

    static {
        Covode.recordClassIndex(13005);
    }

    e(String str, long j2, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener) {
        this.f22079a = str;
        this.f22080b = j2;
        this.f22081c = str2;
        this.f22083e = str3;
        this.f22084f = str4;
        this.f22085g = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        String str = this.f22079a;
        long j2 = this.f22080b;
        String str2 = this.f22081c;
        boolean z = this.f22082d;
        String str3 = this.f22083e;
        String str4 = this.f22084f;
        DialogInterface.OnClickListener onClickListener = this.f22085g;
        try {
            new JSONObject().put("source", str);
        } catch (JSONException unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("follow_source", str);
        hashMap.put("user_id", String.valueOf(j2));
        hashMap.put("enter_from", str2);
        hashMap.put("source", str2);
        if (z) {
            hashMap.put("event_type", "click");
            hashMap.put("event_belong", "video");
            hashMap.put("event_module", "toast");
            if (!m.a(str3)) {
                hashMap.put("event_page", str3);
            }
            if (!m.a(str4)) {
                hashMap.put("enter_from", str4);
            }
        }
        ((g) a.a(g.class)).a("unfollow_popup_confirm", hashMap);
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i2);
        }
    }
}
