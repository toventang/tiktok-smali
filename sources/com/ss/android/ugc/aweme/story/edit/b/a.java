package com.ss.android.ugc.aweme.story.edit.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.bq;
import com.ss.android.ugc.aweme.shortvideo.edit.model.b;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import h.f.b.l;

public abstract class a implements bq {

    /* renamed from: a  reason: collision with root package name */
    public boolean f137053a;

    /* renamed from: b  reason: collision with root package name */
    public final StoryEditClipModel f137054b;

    static {
        Covode.recordClassIndex(89610);
    }

    public static int a(int i2) {
        return ((i2 + 16) - 1) & -16;
    }

    public a(StoryEditClipModel storyEditClipModel) {
        l.d(storyEditClipModel, "");
        this.f137054b = storyEditClipModel;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.bq
    public final int a(boolean z) {
        if (z) {
            return com.ss.android.ugc.aweme.story.edit.model.a.b(this.f137054b);
        }
        StoryEditClipModel storyEditClipModel = this.f137054b;
        l.d(storyEditClipModel, "");
        return b.a(storyEditClipModel.getPreviewMediaInfo(), storyEditClipModel.isFastImport());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.bq
    public final int b(boolean z) {
        if (z) {
            return com.ss.android.ugc.aweme.story.edit.model.a.c(this.f137054b);
        }
        StoryEditClipModel storyEditClipModel = this.f137054b;
        l.d(storyEditClipModel, "");
        return b.b(storyEditClipModel.getPreviewMediaInfo(), storyEditClipModel.isFastImport());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.bq
    public final void a(boolean z, boolean z2) {
        this.f137053a = z;
        this.f137054b.getCoverPublishModel().setNeedExpandCompiledSize(z);
        this.f137054b.setVideoCanvasWidth(a());
        this.f137054b.setVideoCanvasHeight(b());
        this.f137054b.setOutVideoWidth(c());
        this.f137054b.setOutVideoHeight(d());
    }
}
