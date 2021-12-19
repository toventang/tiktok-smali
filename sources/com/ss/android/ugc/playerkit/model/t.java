package com.ss.android.ugc.playerkit.model;

import com.bytedance.covode.number.Covode;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public int f148817a;

    /* renamed from: b  reason: collision with root package name */
    public String f148818b;

    /* renamed from: c  reason: collision with root package name */
    public long f148819c;

    /* renamed from: d  reason: collision with root package name */
    public Object f148820d;

    /* renamed from: e  reason: collision with root package name */
    public long f148821e;

    /* renamed from: f  reason: collision with root package name */
    public String f148822f;

    /* renamed from: g  reason: collision with root package name */
    public int f148823g;

    static {
        Covode.recordClassIndex(98015);
    }

    public final String toString() {
        return "ProcessSubUrlData{id=" + this.f148817a + ", language=" + this.f148818b + ", languageId='" + this.f148819c + ", url=" + this.f148820d + ", expire='" + this.f148821e + '\'' + ", format=" + this.f148822f + ", subId=" + this.f148823g + '}';
    }

    public static String a(List<t> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        for (t tVar : list) {
            if (tVar != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", tVar.f148817a);
                    jSONObject.put("language", tVar.f148818b);
                    jSONObject.put("language_id", tVar.f148819c);
                    jSONObject.put("url", tVar.f148820d);
                    jSONObject.put("expire", tVar.f148821e);
                    jSONObject.put("format", tVar.f148822f);
                    jSONObject.put("sub_id", tVar.f148823g);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                jSONArray.put(jSONObject);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("list", jSONArray);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        return jSONObject2.toString();
    }
}
