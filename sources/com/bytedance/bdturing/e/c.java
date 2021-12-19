package com.bytedance.bdturing.e;

import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final JSONObject f26468a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f26469b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static final h f26470c;

    static final class a extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f26471a = new a();

        static {
            Covode.recordClassIndex(15561);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "{\n    \"common\": {\n        \"period\": 300000, \n        \"alpha\": \"0.5\",\n        \"retry_count\":3,\n        \"retry_interval\":2000,\n        \"rgb\": \"000000\",\n        \"skip_launch\":0, \n        \"use_jsb_request\":0, \n        \"pre_create\":0,\n        \"request_encrypt\":0, \n        \"host\": {\n            \"va\": \"https://vcs-va.byteoversea.com/\",\n            \"sg\": \"https://vcs-sg.byteoversea.com/\",\n            \"in\":\"https://vcs-va-useast2a.byteoversea.com/\"\n        },\n        \"back_up_host\": {\n            \"va\": \"https://vcs-va.byteoversea.com/\",\n            \"sg\": \"https://vcs-sg.byteoversea.com/\",\n            \"in\":\"https://vcs-va-useast2a.byteoversea.com/\"\n        }\n    },\n    \"verify\": {\n        \"host\": {\n            \"va\": \"https://verification-va.byteoversea.com/\",\n            \"sg\": \"https://verify-sg.byteoversea.com/\",\n            \"in\":\"https://verification-va-useast2a.byteoversea.com/\"\n        },\n        \"url\": {\n            \"va\": \"https://sf16-scmcdn-va.ibytedtos.com/obj/static-us/secsdk-captcha/va/2.21.2/index.html\",\n            \"sg\": \"https://sf16-scmcdn-sg.ibytedtos.com/obj/static-sg/secsdk-captcha/sg/2.21.2/index.html\",\n            \"in\": \"https://sf16-scmcdn-useast2a.ibytedtos.com/obj/static-aiso/secsdk-captcha/in/2.21.2/index.html\"\n        },\n      \"height\": 303,\n      \"width\": 300\n    }\n}";
        }
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(15560);
        h a2 = i.a((h.f.a.a) a.f26471a);
        f26470c = a2;
        f26468a = new JSONObject((String) a2.getValue());
    }
}
