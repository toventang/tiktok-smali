package com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.google.gson.o;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel.AbsAdPopUpWebPageVM;
import com.ss.android.ugc.aweme.commercialize.utils.aa;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;

public final class AdPopUpWebPageVM extends AbsAdPopUpWebPageVM {
    public static final a n = new a((byte) 0);

    public static final class b extends com.google.gson.b.a<List<? extends String>> {
        static {
            Covode.recordClassIndex(45740);
        }
    }

    public static final class c extends com.google.gson.b.a<Boolean> {
        static {
            Covode.recordClassIndex(45741);
        }
    }

    public static final class d extends com.google.gson.b.a<Boolean> {
        static {
            Covode.recordClassIndex(45742);
        }
    }

    static {
        Covode.recordClassIndex(45738);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45739);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void i() {
        String str;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (str = awemeRawAd.getWebUrl()) == null) {
            str = "";
        }
        linkedHashMap.put("url", str);
        linkedHashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        com.bytedance.ies.xbridge.e.b.a(new com.bytedance.ies.xbridge.e.a("ad_webview_close", System.currentTimeMillis(), com.bytedance.ies.xbridge.platform.b.b.a(linkedHashMap)));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel.AbsAdPopUpWebPageVM
    public final void h() {
        String str;
        AwemeRawAd awemeRawAd;
        String str2;
        Aweme aweme;
        Aweme aweme2;
        AwemeRawAd awemeRawAd2;
        Aweme aweme3;
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.feed.popupwebview.d(false));
        a(AbsAdPopUpWebPageVM.a.f74138a);
        a(AbsAdPopUpWebPageVM.d.f74141a);
        if (aa.f75533d == 1) {
            str = "slide";
        } else {
            str = "slide_down";
        }
        VideoItemParams videoItemParams = (VideoItemParams) g();
        AwemeRawAd awemeRawAd3 = null;
        if (videoItemParams == null || (aweme3 = videoItemParams.mAweme) == null) {
            awemeRawAd = null;
        } else {
            awemeRawAd = aweme3.getAwemeRawAd();
        }
        if (a(awemeRawAd)) {
            VideoItemParams videoItemParams2 = (VideoItemParams) g();
            if (videoItemParams2 == null || (aweme2 = videoItemParams2.mAweme) == null || (awemeRawAd2 = aweme2.getAwemeRawAd()) == null || awemeRawAd2.getWebviewPannelStyle() != 1) {
                str2 = "landing_page";
            } else {
                str2 = "close";
            }
            VideoItemParams videoItemParams3 = (VideoItemParams) g();
            if (!(videoItemParams3 == null || (aweme = videoItemParams3.mAweme) == null)) {
                awemeRawAd3 = aweme.getAwemeRawAd();
            }
            a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("landing_ad", str2, awemeRawAd3);
            String str3 = ((AbsAdPopUpWebPageVM) this).f74135k;
            if (str3 != null) {
                str = str3;
            }
            a2.b("refer", str).b();
        }
        a(System.currentTimeMillis() - ((AbsAdPopUpWebPageVM) this).f74136l);
        i();
    }

    public final boolean a(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && awemeRawAd.getWebviewType() == 1 && ((AbsAdPopUpWebPageVM) this).f74137m == 2) {
            return true;
        }
        return false;
    }

    public final String a(Aweme aweme, String str, boolean z, String str2) {
        String str3;
        String str4;
        String str5;
        o oVar = new o();
        try {
            VideoItemParams videoItemParams = (VideoItemParams) g();
            String str6 = null;
            if (videoItemParams != null) {
                str3 = videoItemParams.mEventType;
            } else {
                str3 = null;
            }
            oVar.a("enter_from", str3);
            oVar.a("from_source", "item_anchor");
            if (aweme != null) {
                str4 = aweme.getAid();
            } else {
                str4 = null;
            }
            oVar.a("from_group_id", str4);
            if (aweme != null) {
                str6 = aweme.getAuthorUid();
            }
            oVar.a("from_author_id", str6);
            oVar.a("scene_id", str);
            if (z) {
                str5 = "item_play";
            } else {
                str5 = "anchor_list";
            }
            oVar.a("position", str5);
            oVar.a("anchor_type", str2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        String oVar2 = oVar.toString();
        l.b(oVar2, "");
        return oVar2;
    }
}
