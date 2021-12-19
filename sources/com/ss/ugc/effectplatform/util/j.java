package com.ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.UrlModel;
import d.a.d.a.d;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f153969a = new j();

    private j() {
    }

    public static boolean a(UrlModel urlModel) {
        List<String> url_list;
        return urlModel == null || (url_list = urlModel.getUrl_list()) == null || url_list.isEmpty();
    }

    static {
        Covode.recordClassIndex(102676);
    }

    public static String a(ProviderEffect providerEffect) {
        String url;
        l.c(providerEffect, "");
        ProviderEffect.StickerBean sticker_info = providerEffect.getSticker_info();
        if (sticker_info == null || (url = sticker_info.getUrl()) == null) {
            return "";
        }
        return url;
    }

    public static List<String> b(UrlModel urlModel) {
        if (urlModel == null || a(urlModel)) {
            return new ArrayList();
        }
        return urlModel.getUrl_list();
    }

    public static boolean a(Effect effect) {
        if (effect != null && !a(effect.getFile_url())) {
            return true;
        }
        return false;
    }

    private static List<String> a(List<String> list, String str) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next() + str);
        }
        return arrayList;
    }

    public static void b(String str, List<? extends Effect> list) {
        if (list != null) {
            for (Effect effect : list) {
                if (!u.a(str)) {
                    if (str == null) {
                        l.a();
                    }
                    effect.setRecId(str);
                }
            }
        }
    }

    public static void a(String str, Effect effect) {
        String uri;
        l.c(str, "");
        l.c(effect, "");
        UrlModel trans_file_url = effect.getTrans_file_url();
        if (trans_file_url != null && (uri = trans_file_url.getUri()) != null && !p.a((CharSequence) uri)) {
            effect.setTransResPath(str + d.f156619a + effect.getId() + "_trans_" + uri);
        }
    }

    public static void a(String str, List<? extends Effect> list) {
        l.c(str, "");
        if (list != null) {
            for (Effect effect : list) {
                effect.setZipPath(str + d.f156619a + effect.getId() + ".zip");
                effect.setUnzipPath(str + d.f156619a + effect.getId());
                a(str, effect);
            }
        }
    }

    public static void a(List<String> list, List<? extends Effect> list2) {
        if (list2 != null) {
            for (Effect effect : list2) {
                UrlModel file_url = effect.getFile_url();
                List<String> a2 = a(list, effect.getFile_url().getUri());
                if (a2 == null) {
                    a2 = new ArrayList<>();
                }
                file_url.setUrl_list(a2);
                UrlModel icon_url = effect.getIcon_url();
                List<String> a3 = a(list, effect.getIcon_url().getUri());
                if (a3 == null) {
                    a3 = new ArrayList<>();
                }
                icon_url.setUrl_list(a3);
                List<String> url_list = effect.getHint_icon().getUrl_list();
                if (url_list != null && !url_list.isEmpty()) {
                    UrlModel hint_icon = effect.getHint_icon();
                    List<String> a4 = a(list, effect.getHint_icon().getUri());
                    if (a4 == null) {
                        a4 = new ArrayList<>();
                    }
                    hint_icon.setUrl_list(a4);
                }
                UrlModel trans_file_url = effect.getTrans_file_url();
                if (trans_file_url != null) {
                    String uri = trans_file_url.getUri();
                    if (uri != null && !p.a((CharSequence) uri)) {
                        List<String> a5 = a(list, trans_file_url.getUri());
                        if (a5 == null) {
                            a5 = new ArrayList<>();
                        }
                        trans_file_url.setUrl_list(a5);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void a(String str, String str2, List<? extends Effect> list) {
        String str3;
        l.c(str, "");
        if (list != null) {
            for (Effect effect : list) {
                effect.setZipPath(str + d.f156619a + effect.getId() + ".zip");
                effect.setUnzipPath(str + d.f156619a + effect.getId());
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                effect.setPanel(str3);
                a(str, effect);
            }
        }
    }
}
