package com.bytedance.ies.web.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public String f35530a;

    /* renamed from: b  reason: collision with root package name */
    public String f35531b;

    /* renamed from: c  reason: collision with root package name */
    public String f35532c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f35533d;

    /* renamed from: e  reason: collision with root package name */
    public int f35534e;

    /* renamed from: f  reason: collision with root package name */
    public String f35535f;

    /* renamed from: g  reason: collision with root package name */
    public String f35536g;

    /* renamed from: h  reason: collision with root package name */
    public String f35537h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f35538i = true;

    static {
        Covode.recordClassIndex(21247);
    }

    public String toString() {
        String str;
        StringBuilder append = new StringBuilder("JsMsg{type='").append(this.f35530a).append('\'').append(", callback_id='").append(this.f35531b).append('\'').append(", func='").append(this.f35532c).append('\'').append(", params=").append(this.f35533d).append(", version=").append(this.f35534e).append(", namespace=").append(this.f35535f).append(", iFrameUrl=").append(this.f35536g).append(", permissionGroup=");
        if (TextUtils.isEmpty(this.f35537h)) {
            str = "";
        } else {
            str = this.f35537h;
        }
        return append.append(str).append('}').toString();
    }
}
