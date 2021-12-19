package com.ss.android.ugc.aweme.feed.caption.edit;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.e.e.e.v;
import f.a.t;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CaptionEditApi {

    /* renamed from: a  reason: collision with root package name */
    public static ICaptionEditApi f92789a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f92790b = new a((byte) 0);

    public interface ICaptionEditApi {
        static {
            Covode.recordClassIndex(58849);
        }

        @h(a = "/tiktok/cla/next_translation_candidate/get/v1/")
        t<EdtCaptionModel> getNewTask();

        @h(a = "/tiktok/cla/translation_edit/get/v1/")
        t<EdtCaptionModel> queryAwemeAndCaption(@z(a = "subtitle_id") String str);

        @com.bytedance.retrofit2.b.t(a = "/tiktok/cla/translation_edit/create/v1/")
        @g
        t<BaseResponse> updateTranslation(@f LinkedHashMap<String, String> linkedHashMap);
    }

    static {
        Covode.recordClassIndex(58848);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(58850);
        }

        private a() {
        }

        public static t<EdtCaptionModel> a() {
            try {
                return b().getNewTask();
            } catch (ExecutionException e2) {
                com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
                t<EdtCaptionModel> a2 = f.a.h.a.a(v.f157740a);
                l.b(a2, "");
                return a2;
            }
        }

        private static ICaptionEditApi b() {
            if (CaptionEditApi.f92789a == null) {
                CaptionEditApi.f92789a = (ICaptionEditApi) RetrofitFactory.a().a(b.f59141e).a(ICaptionEditApi.class);
            }
            ICaptionEditApi iCaptionEditApi = CaptionEditApi.f92789a;
            if (iCaptionEditApi == null) {
                l.b();
            }
            return iCaptionEditApi;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static t<EdtCaptionModel> a(String str) {
            l.d(str, "");
            try {
                return b().queryAwemeAndCaption(str);
            } catch (ExecutionException e2) {
                com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
                t<EdtCaptionModel> a2 = f.a.h.a.a(v.f157740a);
                l.b(a2, "");
                return a2;
            }
        }

        public static t<BaseResponse> a(String str, List<CaptionData> list, List<CaptionData> list2) {
            l.d(str, "");
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                for (CaptionData captionData : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("start_time", captionData.getStartTime());
                    jSONObject.put("end_time", captionData.getEndTime());
                    jSONObject.put("text", captionData.getText());
                    jSONObject.put("gender", captionData.getGender());
                    jSONArray.put(jSONObject);
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            if (list2 != null) {
                for (CaptionData captionData2 : list2) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("start_time", captionData2.getStartTime());
                    jSONObject2.put("end_time", captionData2.getEndTime());
                    jSONObject2.put("text", captionData2.getText());
                    jSONObject2.put("gender", captionData2.getGender());
                    jSONArray2.put(jSONObject2);
                }
            }
            try {
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                linkedHashMap.put("subtitle_id", str);
                String jSONArray3 = jSONArray.toString();
                l.b(jSONArray3, "");
                linkedHashMap.put("trans_subtitle", jSONArray3);
                String jSONArray4 = jSONArray2.toString();
                l.b(jSONArray4, "");
                linkedHashMap.put("src_subtitle", jSONArray4);
                return b().updateTranslation(linkedHashMap);
            } catch (ExecutionException e2) {
                com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
                t<BaseResponse> a2 = f.a.h.a.a(v.f157740a);
                l.b(a2, "");
                return a2;
            }
        }
    }
}
