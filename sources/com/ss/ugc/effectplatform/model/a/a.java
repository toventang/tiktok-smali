package com.ss.ugc.effectplatform.model.a;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import com.ss.ugc.effectplatform.model.EffectChannelModel;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.UrlModel;
import com.ss.ugc.effectplatform.util.j;
import d.a.e.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C4091a f153645a = new C4091a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String f153646b;

    /* renamed from: c  reason: collision with root package name */
    private final String f153647c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f153648d;

    static {
        Covode.recordClassIndex(102471);
    }

    /* renamed from: com.ss.ugc.effectplatform.model.a.a$a  reason: collision with other inner class name */
    public static final class C4091a {
        static {
            Covode.recordClassIndex(102472);
        }

        private C4091a() {
        }

        public /* synthetic */ C4091a(byte b2) {
            this();
        }
    }

    public final EffectChannelResponse a(EffectChannelModel effectChannelModel) {
        l.c(effectChannelModel, "");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (Effect effect : effectChannelModel.getEffect_list()) {
            hashMap.put(effect.getEffect_id(), effect);
        }
        for (Effect effect2 : effectChannelModel.getCollection_list()) {
            hashMap2.put(effect2.getEffect_id(), effect2);
        }
        EffectChannelResponse effectChannelResponse = new EffectChannelResponse(null, null, null, null, null, null, null, null, null, 511, null);
        effectChannelResponse.setPanel(this.f153646b);
        effectChannelResponse.setVersion(effectChannelModel.getVersion());
        effectChannelResponse.setAll_category_effects(effectChannelModel.getEffect_list());
        effectChannelResponse.setCollection_list(effectChannelModel.getCollection_list());
        effectChannelResponse.setUrl_prefix(effectChannelModel.getUrl_prefix());
        effectChannelResponse.setCategory_responses(a(effectChannelModel, hashMap));
        a(effectChannelModel.getEffect_list(), hashMap2);
        effectChannelResponse.setPanel_model(effectChannelModel.getPanel_model());
        effectChannelResponse.setFront_effect(a(effectChannelModel.getFront_effect_id(), hashMap));
        effectChannelResponse.setRear_effect(a(effectChannelModel.getRear_effect_id(), hashMap));
        if (!this.f153648d) {
            j.a(this.f153647c, this.f153646b, effectChannelModel.getEffect_list());
            j.a(this.f153647c, this.f153646b, effectChannelModel.getCollection_list());
        }
        return effectChannelResponse;
    }

    private static Effect a(String str, Map<String, ? extends Effect> map) {
        if (str == null) {
            return null;
        }
        return (Effect) map.get(str);
    }

    private static List<Effect> a(EffectCategoryModel effectCategoryModel, Map<String, ? extends Effect> map) {
        ArrayList arrayList = new ArrayList();
        if (effectCategoryModel.getEffects() == null) {
            b.a("BuildEffectChannelResponse", "categoryModel is null");
        }
        List<String> effects = effectCategoryModel.getEffects();
        if (effects == null) {
            return arrayList;
        }
        for (String str : effects) {
            Object obj = map.get(str);
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static void a(List<? extends Effect> list, Map<String, ? extends Effect> map) {
        for (Effect effect : list) {
            if (effect.getEffect_type() == 1) {
                ArrayList arrayList = new ArrayList();
                List<String> children = effect.getChildren();
                if (children == null) {
                    children = new ArrayList<>();
                }
                for (String str : children) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
                effect.setChild_effects(arrayList);
            }
        }
    }

    private static List<EffectCategoryResponse> a(EffectChannelModel effectChannelModel, Map<String, ? extends Effect> map) {
        List<String> url_list;
        List<String> url_list2;
        List<String> url_list3;
        List<String> url_list4;
        ArrayList arrayList = new ArrayList();
        if (!effectChannelModel.getCategory_list().isEmpty()) {
            for (EffectCategoryModel effectCategoryModel : effectChannelModel.getCategory_list()) {
                String str = null;
                EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
                effectCategoryResponse.setId(effectCategoryModel.getId());
                effectCategoryResponse.setName(effectCategoryModel.getName());
                effectCategoryResponse.setKey(effectCategoryModel.getKey());
                UrlModel icon = effectCategoryModel.getIcon();
                if (!(icon == null || (url_list3 = icon.getUrl_list()) == null || !(!url_list3.isEmpty()))) {
                    UrlModel icon2 = effectCategoryModel.getIcon();
                    effectCategoryResponse.setIcon_normal_url((icon2 == null || (url_list4 = icon2.getUrl_list()) == null) ? null : url_list4.get(0));
                }
                UrlModel icon_selected = effectCategoryModel.getIcon_selected();
                if (!(icon_selected == null || (url_list = icon_selected.getUrl_list()) == null || !(!url_list.isEmpty()))) {
                    UrlModel icon_selected2 = effectCategoryModel.getIcon_selected();
                    if (!(icon_selected2 == null || (url_list2 = icon_selected2.getUrl_list()) == null)) {
                        str = url_list2.get(0);
                    }
                    effectCategoryResponse.setIcon_selected_url(str);
                }
                effectCategoryResponse.setTotal_effects(a(effectCategoryModel, map));
                effectCategoryResponse.setTags(effectCategoryModel.getTags());
                effectCategoryResponse.setTags_update_time(effectCategoryModel.getTags_updated_at());
                effectCategoryResponse.setCollection_effect(effectChannelModel.getCollection_list());
                effectCategoryResponse.setExtra(effectCategoryModel.getExtra());
                effectCategoryResponse.set_default(effectCategoryModel.is_default());
                arrayList.add(effectCategoryResponse);
            }
        }
        return arrayList;
    }

    public a(String str, String str2, boolean z) {
        l.c(str, "");
        l.c(str2, "");
        this.f153646b = str;
        this.f153647c = str2;
        this.f153648d = z;
    }
}
