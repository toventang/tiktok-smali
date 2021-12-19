package com.bytedance.im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    static {
        Covode.recordClassIndex(23120);
    }

    public static ai a(ai aiVar) {
        JSONObject jSONObject;
        if (!(aiVar == null || aiVar.getAttachments() == null || aiVar.getAttachments().isEmpty())) {
            JSONObject jSONObject2 = new JSONObject();
            for (com.bytedance.im.core.d.c cVar : aiVar.getAttachments()) {
                if (!TextUtils.isEmpty(cVar.getDisplayType())) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("length", cVar.getLength());
                        jSONObject3.put("md5", cVar.getHash());
                        jSONObject3.put("mime", cVar.getMimeType());
                        jSONObject3.put("remoteURL", cVar.getRemoteUrl());
                        jSONObject3.put("displayType", cVar.getDisplayType());
                        jSONObject3.put(StringSet.type, cVar.getType());
                        jSONObject3.put("encryptUrl", cVar.getEncryptUrl());
                        jSONObject3.put("secretKey", cVar.getSecretKey());
                        jSONObject3.put("algorithm", cVar.getAlgorithm());
                        jSONObject3.put("ext", f.c(cVar.getExt()));
                        jSONObject2.put(cVar.getDisplayType(), jSONObject3);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            try {
                if (TextUtils.isEmpty(aiVar.getContent())) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(aiVar.getContent());
                }
                jSONObject.put("__files", jSONObject2);
                aiVar.setContent(jSONObject.toString());
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        return aiVar;
    }

    public static ai b(ai aiVar) {
        if (TextUtils.isEmpty(aiVar.getContent())) {
            return aiVar;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject optJSONObject = new JSONObject(aiVar.getContent()).optJSONObject("__files");
            if (optJSONObject == null) {
                return aiVar;
            }
            Iterator<String> keys = optJSONObject.keys();
            int i2 = 0;
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject = optJSONObject.getJSONObject(next);
                com.bytedance.im.core.d.c cVar = new com.bytedance.im.core.d.c();
                cVar.setMsgUuid(aiVar.getUuid());
                cVar.setDisplayType(next);
                cVar.setLength(jSONObject.optLong("length"));
                cVar.setHash(jSONObject.optString("md5"));
                cVar.setMimeType(jSONObject.optString("mime"));
                cVar.setRemoteUrl(jSONObject.optString("remoteURL"));
                cVar.setType(jSONObject.optString(StringSet.type));
                cVar.setIndex(i2);
                cVar.setStatus(1);
                cVar.setExt(f.a(jSONObject.optJSONObject("ext")));
                cVar.setEncryptUrl(jSONObject.optString("encryptUrl"));
                cVar.setSecretKey(jSONObject.optString("secretKey"));
                cVar.setAlgorithm(jSONObject.optString("algorithm"));
                arrayList.add(cVar);
                i2++;
            }
            if (!arrayList.isEmpty()) {
                aiVar.setAttachments(arrayList);
            }
            return aiVar;
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
