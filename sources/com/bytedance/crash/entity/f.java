package com.bytedance.crash.entity;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f27567a;

    /* renamed from: b  reason: collision with root package name */
    public int f27568b;

    /* renamed from: c  reason: collision with root package name */
    public long f27569c;

    /* renamed from: d  reason: collision with root package name */
    public long f27570d;

    /* renamed from: e  reason: collision with root package name */
    public long f27571e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f27572f;

    /* renamed from: g  reason: collision with root package name */
    public String f27573g;

    /* renamed from: h  reason: collision with root package name */
    public String f27574h;

    /* renamed from: i  reason: collision with root package name */
    public String f27575i;

    /* renamed from: j  reason: collision with root package name */
    public String f27576j;

    static {
        Covode.recordClassIndex(16190);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msg", this.f27573g);
            jSONObject.put("cpuDuration", this.f27571e);
            jSONObject.put("duration", this.f27570d);
            jSONObject.put("tick", this.f27569c);
            jSONObject.put(StringSet.type, this.f27568b);
            jSONObject.put("count", this.f27567a);
            String str = this.f27574h;
            if (str != null) {
                jSONObject.put("block_stack", str);
                jSONObject.put("block_uuid", this.f27576j);
            }
            String str2 = this.f27575i;
            if (str2 != null) {
                jSONObject.put("sblock_stack", str2);
                jSONObject.put("sblock_uuid", this.f27576j);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public final String toString() {
        int i2 = this.f27568b;
        if (i2 == 0) {
            return "[[[ IDLE  ]]] cost " + this.f27569c + " tick , mDuration：" + this.f27570d + ",cpuTime:" + this.f27571e;
        }
        if (i2 == 1) {
            return "[[[ Long IDLE  ]]] cost " + this.f27569c + " tick , mDuration：" + this.f27570d + ",cpuTime:" + this.f27571e;
        }
        if (i2 == 2) {
            return "[[[  1 msg  ]]] cost " + this.f27569c + " tick , mDuration：" + this.f27570d + ",cpuTime:" + this.f27571e + ", msg:" + this.f27573g;
        }
        if (i2 == 3) {
            return "[[[ 1 msg + IDLE  ]]] cost " + this.f27569c + " tick , mDuration：" + this.f27570d + ",cpuTime:" + this.f27571e;
        }
        if (i2 == 4) {
            return "[[[ " + (this.f27567a - 1) + " msgs  ]]] cost less than 1 tick, [[[  last msg ]]] cost more than " + (this.f27569c - 1) + "tick ,, mDuration：" + this.f27570d + "cpuTime:" + this.f27571e + " msg:" + this.f27573g;
        }
        if (i2 == 5) {
            return "[[[ " + this.f27567a + " msgs ]]] cost less than 1 tick but [[[  IDLE ]]] cost more than" + (this.f27569c - 1) + " ticks, , mDuration：" + this.f27570d + "cpuTime:" + this.f27571e;
        }
        if (i2 == 6) {
            return "[[[  1 msg  ]]] cost less than 1 tick , but [[[  IDLE ]]] cost more than" + (this.f27569c - 1) + ", , mDuration：" + this.f27570d + "cpuTime:" + this.f27571e;
        }
        if (i2 == 7) {
            return "[[[ " + this.f27567a + " msgs + IDLE  ]]] cost 1 tick , mDuration：" + this.f27570d + " cost cpuTime:" + this.f27571e;
        }
        if (i2 == 8) {
            return "[[[ 1 msgs ]]] cost " + this.f27569c + " ticks , mDuration：" + this.f27570d + " cost cpuTime:" + this.f27571e + " msg:" + this.f27573g;
        }
        if (i2 == 9) {
            return "[[[ " + this.f27567a + " msgs ]]] cost 1 tick , mDuration：" + this.f27570d + " cost cpuTime:" + this.f27571e;
        }
        return "=========   UNKNOW =========  Type:" + this.f27568b + " cost ticks " + this.f27569c + " msgs:" + this.f27567a;
    }
}
