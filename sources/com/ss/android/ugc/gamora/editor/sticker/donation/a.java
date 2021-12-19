package com.ss.android.ugc.gamora.editor.sticker.donation;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f146501a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f146502b = i.a((h.f.a.a) C3920a.f146503a);

    public static String a() {
        return (String) f146502b.getValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a$a  reason: collision with other inner class name */
    static final class C3920a extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3920a f146503a = new C3920a();

        static {
            Covode.recordClassIndex(96398);
        }

        C3920a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String appLanguage = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getAppLanguage();
            if (appLanguage == null) {
                return "";
            }
            return appLanguage;
        }
    }

    static {
        Covode.recordClassIndex(96397);
    }

    static final class f extends m implements h.f.a.b<JSONObject, z> {
        final /* synthetic */ String $creationId;
        final /* synthetic */ String $shootWay;

        static {
            Covode.recordClassIndex(96403);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(String str, String str2) {
            super(1);
            this.$shootWay = str;
            this.$creationId = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            l.d(jSONObject2, "");
            jSONObject2.put("enter_from", "video_edit_page");
            jSONObject2.put("shoot_way", this.$shootWay);
            jSONObject2.put("creation_id", this.$creationId);
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<JSONObject, z> {
        final /* synthetic */ String $contentSource;
        final /* synthetic */ String $contentType;
        final /* synthetic */ String $creationId;
        final /* synthetic */ String $ngoName;
        final /* synthetic */ String $shootWay;

        static {
            Covode.recordClassIndex(96399);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, String str2, String str3, String str4, String str5) {
            super(1);
            this.$shootWay = str;
            this.$creationId = str2;
            this.$ngoName = str3;
            this.$contentSource = str4;
            this.$contentType = str5;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            l.d(jSONObject2, "");
            jSONObject2.put("enter_from", "video_edit_page");
            jSONObject2.put("shoot_way", this.$shootWay);
            jSONObject2.put("creation_id", this.$creationId);
            jSONObject2.put("ngo_name", this.$ngoName);
            jSONObject2.put("language", a.a());
            jSONObject2.put("content_source", this.$contentSource);
            jSONObject2.put("content_type", this.$contentType);
            return z.f158842a;
        }
    }

    public static final class c extends m implements h.f.a.b<JSONObject, z> {
        final /* synthetic */ String $creationId;
        final /* synthetic */ String $ngoName;
        final /* synthetic */ String $shootWay;

        static {
            Covode.recordClassIndex(96400);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3) {
            super(1);
            this.$shootWay = str;
            this.$creationId = str2;
            this.$ngoName = str3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            l.d(jSONObject2, "");
            jSONObject2.put("enter_from", "video_edit_page");
            jSONObject2.put("shoot_way", this.$shootWay);
            jSONObject2.put("creation_id", this.$creationId);
            jSONObject2.put("ngo_name", this.$ngoName);
            jSONObject2.put("language", a.a());
            return z.f158842a;
        }
    }

    public static final class e extends m implements h.f.a.b<JSONObject, z> {
        final /* synthetic */ String $creationId;
        final /* synthetic */ int $imprPosition;
        final /* synthetic */ String $ngoName;
        final /* synthetic */ String $shootWay;

        static {
            Covode.recordClassIndex(96402);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, String str3, int i2) {
            super(1);
            this.$shootWay = str;
            this.$creationId = str2;
            this.$ngoName = str3;
            this.$imprPosition = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            l.d(jSONObject2, "");
            jSONObject2.put("enter_from", "video_edit_page");
            jSONObject2.put("shoot_way", this.$shootWay);
            jSONObject2.put("creation_id", this.$creationId);
            jSONObject2.put("ngo_name", this.$ngoName);
            jSONObject2.put("language", a.a());
            jSONObject2.put("impr_position", this.$imprPosition);
            return z.f158842a;
        }
    }

    public static final class d extends m implements h.f.a.b<JSONObject, z> {
        final /* synthetic */ String $contentSource;
        final /* synthetic */ String $contentType;
        final /* synthetic */ String $creationId;
        final /* synthetic */ int $imprPosition;
        final /* synthetic */ String $ngoName;
        final /* synthetic */ String $shootWay;

        static {
            Covode.recordClassIndex(96401);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3, String str4, String str5, int i2) {
            super(1);
            this.$shootWay = str;
            this.$creationId = str2;
            this.$ngoName = str3;
            this.$contentSource = str4;
            this.$contentType = str5;
            this.$imprPosition = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            l.d(jSONObject2, "");
            jSONObject2.put("enter_from", "video_edit_page");
            jSONObject2.put("shoot_way", this.$shootWay);
            jSONObject2.put("creation_id", this.$creationId);
            jSONObject2.put("ngo_name", this.$ngoName);
            jSONObject2.put("language", a.a());
            jSONObject2.put("content_source", this.$contentSource);
            jSONObject2.put("content_type", this.$contentType);
            jSONObject2.put("impr_position", this.$imprPosition);
            return z.f158842a;
        }
    }

    public static void a(JSONObject jSONObject, h.f.a.b<? super JSONObject, z> bVar) {
        try {
            bVar.invoke(jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
