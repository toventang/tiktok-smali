package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.google.c.a.p;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.utils.dw;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.a.n;
import h.a.z;
import h.f.a.a;
import h.f.b.g;
import h.f.b.l;
import h.v;
import java.util.List;
import java.util.Map;

public final class ShareQnAContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @c(a = "cover_url")
    private List<? extends UrlModel> awemeCoverList = z.INSTANCE;
    @c(a = "push_detail")
    private String pushDetail;
    @c(a = "qa_id")
    private long questionId;
    @c(a = "title")
    private String questionName = "";
    private transient a<? extends Resources> resourcesGetter = ShareQnAContent$resourcesGetter$1.INSTANCE;
    @c(a = "video_count")
    private int userCount;

    static {
        Covode.recordClassIndex(64069);
    }

    public static /* synthetic */ void getResourcesGetter$im_base_release$annotations() {
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(64070);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final ShareQnAContent fromSharePackage(SharePackage sharePackage) {
            l.d(sharePackage, "");
            long j2 = sharePackage.f124595i.getLong("qna_id");
            String string = sharePackage.f124595i.getString("qna_name");
            int i2 = sharePackage.f124595i.getInt("user_count");
            String string2 = sharePackage.f124595i.getString("aweme_cover_list");
            List<? extends UrlModel> list = null;
            if (string2 != null && !p.a(string2)) {
                list = dw.b(string2, UrlModel.class);
            }
            ShareQnAContent shareQnAContent = new ShareQnAContent();
            shareQnAContent.setQuestionId(j2);
            shareQnAContent.setQuestionName(string);
            shareQnAContent.setUserCount(i2);
            if (list == null) {
                list = z.INSTANCE;
            }
            shareQnAContent.setAwemeCoverList(list);
            shareQnAContent.setPushDetail(string);
            return shareQnAContent;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel>, java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> */
    public final List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public final String getPushDetail() {
        return this.pushDetail;
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public final String getQuestionName() {
        return this.questionName;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.a<? extends android.content.res.Resources>, h.f.a.a<android.content.res.Resources> */
    public final a<Resources> getResourcesGetter$im_base_release() {
        return this.resourcesGetter;
    }

    public final int getUserCount() {
        return this.userCount;
    }

    public final UrlModel getCoverThumb() {
        List<? extends UrlModel> list = this.awemeCoverList;
        if (list != null) {
            return (UrlModel) n.h((List) list);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final Map<String, String> eventParam() {
        return ag.a(v.a("question_id", String.valueOf(this.questionId)));
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel>, java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.PreloadFetcher, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final List<UrlModel> fetchPreload() {
        List subList;
        List<? extends UrlModel> list = this.awemeCoverList;
        if (list == null || (subList = list.subList(0, Math.min(3, list.size()))) == null) {
            return z.INSTANCE;
        }
        return subList;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final SharePackage generateSharePackage() {
        SharePackage a2 = PureDataSharePackage.a.a("qna");
        a2.f124595i.putSerializable("video_cover", getCoverThumb());
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final String getMsgHint() {
        String string = ((Resources) this.resourcesGetter.invoke()).getString(R.string.f2z, this.questionName);
        l.b(string, "");
        return string;
    }

    public final void setAwemeCoverList(List<? extends UrlModel> list) {
        this.awemeCoverList = list;
    }

    public final void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public final void setQuestionId(long j2) {
        this.questionId = j2;
    }

    public final void setQuestionName(String str) {
        this.questionName = str;
    }

    public final void setUserCount(int i2) {
        this.userCount = i2;
    }

    public final void setResourcesGetter$im_base_release(a<? extends Resources> aVar) {
        l.d(aVar, "");
        this.resourcesGetter = aVar;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final String wrapMsgHint(boolean z, boolean z2, String str) {
        if (z || z2) {
            String string = ((Resources) this.resourcesGetter.invoke()).getString(R.string.f2z, this.questionName);
            l.b(string, "");
            return string;
        }
        String string2 = ((Resources) this.resourcesGetter.invoke()).getString(R.string.f2y, this.questionName);
        l.b(string2, "");
        return string2;
    }
}
