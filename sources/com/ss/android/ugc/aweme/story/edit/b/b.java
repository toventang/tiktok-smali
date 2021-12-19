package com.ss.android.ugc.aweme.story.edit.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.a;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.ss.android.ugc.aweme.story.edit.model.c;
import h.f.a.m;
import h.f.b.l;
import h.f.b.y;
import h.h.d;
import h.k.i;

public final class b implements a, m<StoryEditModel, StoryEditClipModel, com.bytedance.creativex.editor.preview.a> {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f137055a = {new y(b.class, "sharedConfigure", "getSharedConfigure()Lcom/ss/android/ugc/aweme/story/edit/model/StorySharedEditConfigure;", 0)};

    /* renamed from: b  reason: collision with root package name */
    private final d f137056b = com.bytedance.o.b.a.a(getDiContainer(), c.class);

    /* renamed from: c  reason: collision with root package name */
    private final f f137057c;

    static {
        Covode.recordClassIndex(89611);
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f137057c;
    }

    public b(f fVar) {
        l.d(fVar, "");
        this.f137057c = fVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0044  */
    @Override // h.f.a.m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.bytedance.creativex.editor.preview.a invoke(com.ss.android.ugc.aweme.story.edit.model.StoryEditModel r7, com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel r8) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.story.edit.model.StoryEditModel r7 = (com.ss.android.ugc.aweme.story.edit.model.StoryEditModel) r7
            com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel r8 = (com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel) r8
            java.lang.String r5 = ""
            h.f.b.l.d(r7, r5)
            h.f.b.l.d(r8, r5)
            h.h.d r2 = r6.f137056b
            h.k.i[] r1 = com.ss.android.ugc.aweme.story.edit.b.b.f137055a
            r0 = 0
            r0 = r1[r0]
            java.lang.Object r0 = r2.a(r6, r0)
            com.ss.android.ugc.aweme.story.edit.model.c r0 = (com.ss.android.ugc.aweme.story.edit.model.c) r0
            com.ss.android.ugc.aweme.shortvideo.edit.bq r4 = r0.a(r8)
            int r3 = com.ss.android.ugc.aweme.shortvideo.at.a()
            r2 = 30
            if (r3 <= 0) goto L_0x004d
            int r1 = r7.getOrigin()
            r0 = 1
            if (r1 == r0) goto L_0x004d
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r0 = r8.getPreviewMediaInfo()
            int r0 = com.ss.android.ugc.aweme.shortvideo.edit.model.b.a(r0)
            if (r0 <= r3) goto L_0x0049
        L_0x0036:
            h.f.b.l.d(r8, r5)
            h.f.b.l.d(r4, r5)
            int r1 = r8.getVideoEditorType()
            r0 = 11
            if (r1 == r0) goto L_0x0050
            dmt.av.video.VEPreviewParams r0 = com.ss.android.ugc.aweme.story.edit.model.a.a(r8, r4, r3)
            return r0
        L_0x0049:
            if (r0 <= r2) goto L_0x004d
            r3 = r0
            goto L_0x0036
        L_0x004d:
            r3 = 30
            goto L_0x0036
        L_0x0050:
            dmt.av.video.VEPreviewParams r0 = com.ss.android.ugc.aweme.story.edit.model.a.a(r8, r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.b.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
