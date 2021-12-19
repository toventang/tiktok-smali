package com.bytedance.common.wschannel.channel.a.a;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.channel.a.a.b;
import com.bytedance.common.wschannel.d.c;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.io.UnsupportedEncodingException;
import k.i;
import okhttp3.Response;
import org.json.JSONObject;

final class d implements b.d {

    /* renamed from: a  reason: collision with root package name */
    private final IWsChannelClient f27163a;

    /* renamed from: b  reason: collision with root package name */
    private final b f27164b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f27165c;

    static {
        Covode.recordClassIndex(16007);
    }

    @Override // com.bytedance.common.wschannel.channel.a.a.b.d
    public final void a(i iVar) {
        IWsChannelClient iWsChannelClient = this.f27163a;
        if (iWsChannelClient != null) {
            iWsChannelClient.onMessage(iVar.toByteArray());
        }
    }

    @Override // com.bytedance.common.wschannel.channel.a.a.b.d
    public final void c(String str) {
        IWsChannelClient iWsChannelClient = this.f27163a;
        if (iWsChannelClient != null) {
            try {
                iWsChannelClient.onMessage(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.a.a.b.d
    public final void a(String str) {
        if (this.f27163a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(StringSet.type, 1);
                jSONObject.put("state", 1);
                jSONObject.put("url", str);
                jSONObject.put("channel_type", 2);
                this.f27163a.onConnection(jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.a.a.b.d
    public final void b(String str) {
        if (this.f27163a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(StringSet.type, 0);
                jSONObject.put("state", 3);
                jSONObject.put("url", str);
                jSONObject.put("channel_type", 2);
                this.f27163a.onConnection(jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.a.a.b.d
    public final void a(Response response) {
        if (this.f27163a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(StringSet.type, 1);
                jSONObject.put("state", 4);
                jSONObject.put("url", response.request().url().toString());
                jSONObject.put("channel_type", 2);
                this.f27163a.onConnection(jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    d(Context context, b bVar, IWsChannelClient iWsChannelClient) {
        this.f27164b = bVar;
        this.f27163a = iWsChannelClient;
        this.f27165c = context;
    }

    @Override // com.bytedance.common.wschannel.channel.a.a.b.d
    public final void a(String str, int i2, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putInt("error_code", i2);
        bundle.putString("error_msg", str2);
        bundle.putString("method", "onFailure");
        c.a(this.f27165c, "WsChannelSdk_ok", bundle);
        if (this.f27163a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(StringSet.type, 0);
                jSONObject.put("state", 2);
                jSONObject.put("url", str);
                jSONObject.put("channel_type", 2);
                jSONObject.put("error", str2);
                jSONObject.put("error_code", i2);
                this.f27163a.onConnection(jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
