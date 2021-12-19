package com.bytedance.crash.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.i;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentLinkedQueue<i> f27555a = new ConcurrentLinkedQueue<>();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap<Integer, i> f27556b = new ConcurrentHashMap<>();

    /* renamed from: com.bytedance.crash.entity.a$a  reason: collision with other inner class name */
    public interface AbstractC0587a {
        static {
            Covode.recordClassIndex(16184);
        }

        boolean a(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(16183);
    }
}
