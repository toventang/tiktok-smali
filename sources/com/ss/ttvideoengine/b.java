package com.ss.ttvideoengine;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static Context f152303a;

    /* renamed from: b  reason: collision with root package name */
    public static int f152304b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static String f152305c;

    /* renamed from: d  reason: collision with root package name */
    public static String f152306d;

    /* renamed from: e  reason: collision with root package name */
    public static String f152307e;

    /* renamed from: f  reason: collision with root package name */
    public static String f152308f;

    /* renamed from: g  reason: collision with root package name */
    public static String f152309g;

    /* renamed from: h  reason: collision with root package name */
    public static int f152310h;

    /* renamed from: i  reason: collision with root package name */
    public static int f152311i;

    static {
        Covode.recordClassIndex(101507);
    }

    public static String a() {
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", Integer.valueOf(f152304b));
        hashMap.put("app_name", f152305c);
        hashMap.put("screen_width", Integer.valueOf(f152310h));
        hashMap.put("screen_height", Integer.valueOf(f152311i));
        return new JSONObject(hashMap).toString();
    }
}
