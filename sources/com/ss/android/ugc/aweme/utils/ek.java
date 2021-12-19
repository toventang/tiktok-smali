package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import f.a.d.g;
import f.a.d.k;
import h.f.b.l;
import org.json.JSONObject;

public final class ek {

    /* renamed from: a  reason: collision with root package name */
    public static final ek f142862a = new ek();

    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f142866a = new d();

        static {
            Covode.recordClassIndex(93485);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private ek() {
    }

    static {
        Covode.recordClassIndex(93481);
    }

    public static final class a<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f142863a = new a();

        static {
            Covode.recordClassIndex(93482);
        }

        a() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            l.d(str, "");
            return new JSONObject(str);
        }
    }

    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f142865a;

        static {
            Covode.recordClassIndex(93484);
        }

        public c(h.f.a.b bVar) {
            this.f142865a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f142865a.invoke(Integer.valueOf(((JSONObject) obj).optInt("stream_type", 0)));
        }
    }

    public static final class b<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final b f142864a = new b();

        static {
            Covode.recordClassIndex(93483);
        }

        b() {
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            l.d(jSONObject, "");
            if (TextUtils.equals(jSONObject.optString("source"), "TTLiveSDK_Android") || TextUtils.equals(jSONObject.optString("source"), "TTLiveSDK_IOS")) {
                return true;
            }
            return false;
        }
    }
}
