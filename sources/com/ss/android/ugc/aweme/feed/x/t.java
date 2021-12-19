package com.ss.android.ugc.aweme.feed.x;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final String f95364a = "cla_crowdsourcing_onboarding_complete";

    /* renamed from: b  reason: collision with root package name */
    public static final t f95365b = new t();

    private t() {
    }

    static {
        Covode.recordClassIndex(60390);
    }

    public static final boolean a(CaptionItemModel captionItemModel) {
        l.d(captionItemModel, "");
        return l.a((Object) captionItemModel.getVersionType(), (Object) "20");
    }

    public static final CaptionItemModel a(Aweme aweme) {
        Long l2;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        CaptionModel captionModel2;
        CaptionLanguage originalCaptionLanguage;
        T t = null;
        if (aweme == null) {
            return null;
        }
        Video video = aweme.getVideo();
        if (video == null || (captionModel2 = video.getCaptionModel()) == null || (originalCaptionLanguage = captionModel2.getOriginalCaptionLanguage()) == null) {
            l2 = null;
            if (aweme == null) {
                return null;
            }
        } else {
            l2 = Long.valueOf(originalCaptionLanguage.getLanguageId());
        }
        Video video2 = aweme.getVideo();
        if (video2 == null || (captionModel = video2.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null) {
            return null;
        }
        Iterator<T> it = captionList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            long languageId = next.getLanguageId();
            if (l2 != null && l2.longValue() == languageId) {
                t = next;
                break;
            }
        }
        return t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0047 A[EDGE_INSN: B:28:0x0047->B:21:0x0047 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.ss.android.ugc.aweme.feed.model.CaptionItemModel b(com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            r8 = 0
            if (r9 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.feed.model.Video r0 = r9.getVideo()
            if (r0 == 0) goto L_0x0053
            com.ss.android.ugc.aweme.feed.model.CaptionModel r0 = r0.getCaptionModel()
            if (r0 == 0) goto L_0x0053
            com.ss.android.ugc.aweme.feed.model.CaptionLanguage r0 = r0.getOriginalCaptionLanguage()
            if (r0 == 0) goto L_0x0053
            long r0 = r0.getLanguageId()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L_0x001d:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r9.getVideo()
            if (r0 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.feed.model.CaptionModel r0 = r0.getCaptionModel()
            if (r0 == 0) goto L_0x0049
            java.util.List r0 = r0.getCaptionList()
            if (r0 == 0) goto L_0x0049
            java.util.Iterator r6 = r0.iterator()
        L_0x0033:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r5 = r6.next()
            r0 = r5
            com.ss.android.ugc.aweme.feed.model.CaptionItemModel r0 = (com.ss.android.ugc.aweme.feed.model.CaptionItemModel) r0
            long r3 = r0.getLanguageId()
            if (r7 != 0) goto L_0x004a
        L_0x0046:
            r8 = r5
        L_0x0047:
            com.ss.android.ugc.aweme.feed.model.CaptionItemModel r8 = (com.ss.android.ugc.aweme.feed.model.CaptionItemModel) r8
        L_0x0049:
            return r8
        L_0x004a:
            long r1 = r7.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            goto L_0x0046
        L_0x0053:
            r7 = r8
            if (r9 == 0) goto L_0x0049
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.x.t.b(com.ss.android.ugc.aweme.feed.model.Aweme):com.ss.android.ugc.aweme.feed.model.CaptionItemModel");
    }

    public static final void a(Context context, String str, String str2, String str3, boolean z, Aweme aweme) {
        String str4;
        String str5;
        String str6;
        CaptionItemModel b2;
        Video video;
        CaptionModel captionModel;
        CaptionLanguage originalCaptionLanguage;
        User author;
        l.d(context, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        StringBuilder append = new StringBuilder("https://www.tiktok.com/web-inapp/cla/crowdsourcing/translation-center?enter_from=").append(str2).append("&enter_method=").append(str3).append("&translator_id=").append(str).append("&group_id=");
        String str7 = null;
        if (aweme != null) {
            str4 = aweme.getGroupId();
        } else {
            str4 = null;
        }
        StringBuilder append2 = append.append(str4).append("&author_id=");
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            str5 = null;
        } else {
            str5 = author.getUid();
        }
        StringBuilder append3 = append2.append(str5).append("&video_lang=");
        if (aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) == null) {
            str6 = null;
        } else {
            str6 = originalCaptionLanguage.getLanguageName();
        }
        StringBuilder append4 = append3.append(str6).append("&transl_lang=");
        if (!(aweme == null || (b2 = b(aweme)) == null)) {
            str7 = b2.getLanguageName();
        }
        String sb = append4.append(str7).toString();
        if (z) {
            sb = sb + "&tab=translations";
        }
        SmartRouter.buildRoute(context, "aweme://webview").withParam(Uri.parse(sb)).withParam("hide_nav_bar", true).open();
    }
}
