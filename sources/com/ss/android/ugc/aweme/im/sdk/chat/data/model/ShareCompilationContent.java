package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.utils.dw;
import com.zhiliaoapp.musically.R;
import h.f.b.ad;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class ShareCompilationContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @c(a = "author_id")
    private String authorId = "";
    @c(a = "video_cover_urls")
    private List<UrlModel> awemeCoverList;
    @c(a = "mix_id")
    private String compilationId = "";
    @c(a = "cover_url")
    private UrlModel cover;
    @c(a = "text")
    private String title = "";
    @c(a = "play_count")
    private Long viewCount = 0L;

    static {
        Covode.recordClassIndex(64064);
    }

    public static final ShareCompilationContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(64065);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final ShareCompilationContent fromSharePackage(SharePackage sharePackage) {
            l.d(sharePackage, "");
            ShareCompilationContent shareCompilationContent = new ShareCompilationContent();
            Bundle bundle = sharePackage.f124595i;
            shareCompilationContent.setCompilationId(bundle.getString("compilation_id"));
            shareCompilationContent.setAuthorId(bundle.getString("user_id"));
            shareCompilationContent.setTitle(bundle.getString("compilation_name"));
            shareCompilationContent.setViewCount(Long.valueOf(bundle.getLong("view_count")));
            Serializable serializable = bundle.getSerializable("video_cover");
            Object obj = null;
            if (!(serializable instanceof UrlModel)) {
                serializable = null;
            }
            shareCompilationContent.setCover((UrlModel) serializable);
            String string = bundle.getString("aweme_cover_list");
            if (!(string == null || string.length() == 0)) {
                Object a2 = dw.a(string, List.class);
                if (ad.c(a2)) {
                    obj = a2;
                }
                shareCompilationContent.setAwemeCoverList((List) obj);
            }
            return shareCompilationContent;
        }
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public final String getCompilationId() {
        return this.compilationId;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getViewCount() {
        return this.viewCount;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.PreloadFetcher, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final List<UrlModel> fetchPreload() {
        List<UrlModel> list = this.awemeCoverList;
        if (list == null || list.size() < 3) {
            return null;
        }
        return list;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final SharePackage generateSharePackage() {
        SharePackage a2 = PureDataSharePackage.a.a("mix");
        a2.f124595i.putSerializable("video_cover", this.cover);
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final String getMsgHint() {
        String string = d.a().getResources().getString(R.string.ad3, this.title);
        l.b(string, "");
        return string;
    }

    public final void setAuthorId(String str) {
        this.authorId = str;
    }

    public final void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public final void setCompilationId(String str) {
        this.compilationId = str;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setViewCount(Long l2) {
        this.viewCount = l2;
    }
}
