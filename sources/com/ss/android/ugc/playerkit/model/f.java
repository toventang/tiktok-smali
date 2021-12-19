package com.ss.android.ugc.playerkit.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f148722a;

    /* renamed from: b  reason: collision with root package name */
    public Object f148723b;

    /* renamed from: c  reason: collision with root package name */
    public int f148724c;

    /* renamed from: d  reason: collision with root package name */
    public int f148725d;

    static {
        Covode.recordClassIndex(97995);
    }

    public final boolean a(Object obj) {
        if (obj != null) {
            try {
                switch (this.f148724c) {
                    case 1:
                        this.f148723b = Integer.valueOf(Integer.parseInt(obj.toString()));
                        break;
                    case 2:
                        this.f148723b = Long.valueOf(Long.parseLong(obj.toString()));
                        break;
                    case 3:
                        this.f148723b = Float.valueOf(Float.parseFloat(obj.toString()));
                        break;
                    case 4:
                        this.f148723b = obj.toString();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        this.f148723b = new JSONObject((String) obj);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        this.f148723b = new JSONArray((String) obj);
                        break;
                }
            } catch (Exception unused) {
            }
        }
        if (this.f148723b != null) {
            return true;
        }
        return false;
    }
}
