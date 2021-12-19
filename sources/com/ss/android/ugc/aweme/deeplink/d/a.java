package com.ss.android.ugc.aweme.deeplink.d;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import b.i;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.f.b;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.commercialize.d;
import com.ss.android.ugc.aweme.commercialize.d.a;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.deeplink.p;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f79467a;

    /* renamed from: b  reason: collision with root package name */
    private Intent f79468b;

    static {
        Covode.recordClassIndex(49373);
    }

    private static NetworkUtils.h a(Context context) {
        if (j.f107228g != NetworkUtils.h.NONE && j.b() && !j.c()) {
            return j.f107228g;
        }
        NetworkUtils.h networkType = NetworkUtils.getNetworkType(context);
        j.f107228g = networkType;
        return networkType;
    }

    public final void b(Uri uri) {
        if (uri.toString().startsWith(a.AbstractC1652a.f73756a)) {
            i.b(new b(this, uri), i.f4824a);
        }
        com.ss.android.ugc.aweme.commercialize.util.a.a.a(uri);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object c(Uri uri) {
        AwemeRawAd awemeRawAd = d.f73752a.f73753b;
        d.f73752a.f73753b = null;
        if (awemeRawAd == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("tag");
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = "draw_ad";
        }
        f.b b2 = f.a().b(awemeRawAd);
        b2.f74804a = queryParameter;
        b2.f74805b = "open_url_appback";
        b2.a(this.f79467a);
        com.bytedance.ies.ugc.aweme.rich.a.a.a(queryParameter, "open_url_appback", awemeRawAd).c();
        return null;
    }

    public static void a(Uri uri) {
        String queryParameter = uri.getQueryParameter("appParam");
        if (queryParameter != null) {
            try {
                JSONObject jSONObject = new JSONObject(queryParameter);
                String optString = jSONObject.optString("__type__");
                String optString2 = jSONObject.optString("position");
                String optString3 = jSONObject.optString("iid");
                String optString4 = jSONObject.optString("wxshare_count");
                String optString5 = jSONObject.optString("parent_group_id");
                String optString6 = jSONObject.optString("webid");
                s sVar = new s();
                sVar.a("__type__", optString);
                sVar.a("position", optString2);
                sVar.a("iid", optString3);
                if (!m.a(optString4)) {
                    sVar.a("wxshare_count", optString4);
                }
                sVar.a("parent_group_id", optString5);
                if (!m.a(optString6)) {
                    sVar.a("webid", optString6);
                }
                r.onEvent(new MobClick().setEventName("open_url").setLabelName("scheme").setJsonObject(sVar.a()));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public a(Context context, Intent intent) {
        this.f79467a = context;
        this.f79468b = intent;
    }

    public final void a(boolean z, Uri uri) {
        com.ss.android.di.push.a.a().notifyOnDeeplink(z, this.f79467a, this.f79468b, uri);
    }

    private static Uri a(Uri uri, p pVar) {
        String str = pVar.f79518a;
        if (TextUtils.isEmpty(str)) {
            str = uri.getQueryParameter("gd_label");
        }
        if (TextUtils.isEmpty(str)) {
            str = uri.getQueryParameter("launch_method");
        }
        if (TextUtils.isEmpty(str)) {
            str = "link_direct";
        }
        pVar.a(str);
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("launch_method", pVar.f79518a).appendQueryParameter("page_source", pVar.f79519b).appendQueryParameter("enter_to", pVar.f79520c).appendQueryParameter("platform", pVar.f79521d).appendQueryParameter("from_user_id", pVar.f79522e);
        if (!TextUtils.isEmpty(pVar.f79524g)) {
            appendQueryParameter.appendQueryParameter("link_id", pVar.f79524g);
        }
        if (!TextUtils.isEmpty(pVar.f79525h)) {
            appendQueryParameter.appendQueryParameter("referrer_url", pVar.f79525h);
        }
        if (!TextUtils.isEmpty(pVar.f79526i)) {
            appendQueryParameter.appendQueryParameter("params_url", pVar.f79526i);
        }
        if (!TextUtils.isEmpty(pVar.f79523f)) {
            appendQueryParameter.appendQueryParameter("to_user_id", pVar.f79523f);
        }
        appendQueryParameter.appendQueryParameter("needlaunchlog", "true");
        return appendQueryParameter.build();
    }

    public final void a(Uri uri, boolean z) {
        String str;
        String queryParameter = uri.getQueryParameter("label");
        String queryParameter2 = uri.getQueryParameter("push_id");
        uri.getQueryParameter("gd_label");
        if (queryParameter != null || z) {
            JSONObject jSONObject = new JSONObject();
            String str2 = "0";
            if (TextUtils.isEmpty(uri.getLastPathSegment())) {
                str = str2;
            } else {
                str = uri.getLastPathSegment();
            }
            try {
                jSONObject.put("network_type", NetworkUtils.getNetworkAccessType(a(this.f79467a)).toUpperCase(Locale.getDefault()));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            try {
                MobClick eventName = MobClick.obtain().setEventName("push");
                String str3 = "";
                if (queryParameter == null) {
                    queryParameter = str3;
                }
                MobClick labelName = eventName.setLabelName(queryParameter);
                if (queryParameter2 != null) {
                    str3 = queryParameter2;
                }
                MobClick value = labelName.setValue(str3);
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                r.onEvent(value.setExtValueString(str2).setJsonObject(jSONObject));
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            d.a(z, queryParameter2, str, jSONObject, this.f79468b);
        }
        n.a("aweme_app_performance", "main_page_time", (float) (System.currentTimeMillis() - a.b.f109011a.f109007h));
    }

    public final void a(Uri uri, p pVar, boolean z) {
        IUgCommonService j2 = UgCommonServiceImpl.j();
        if (j2.i()) {
            j2.h().a(uri, z, pVar, c.a(), c.f79472b - c.f79471a, c.f79473c);
        } else {
            b.a(this.f79467a).a(a(uri, pVar));
        }
    }
}
