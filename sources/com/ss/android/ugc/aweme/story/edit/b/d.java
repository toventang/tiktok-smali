package com.ss.android.ugc.aweme.story.edit.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import dmt.av.video.b.j;
import dmt.av.video.b.s;
import h.f.a.b;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class d implements com.bytedance.o.a, m<StoryEditModel, StoryEditClipModel, j> {

    /* renamed from: a  reason: collision with root package name */
    private final f f137060a;

    /* renamed from: b  reason: collision with root package name */
    private final b<j, z> f137061b;

    static {
        Covode.recordClassIndex(89613);
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f137060a;
    }

    static final class a extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f137062a = new a();

        static {
            Covode.recordClassIndex(89614);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super dmt.av.video.b.j, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(f fVar, b<? super j, z> bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f137060a = fVar;
        this.f137061b = bVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // h.f.a.m
    public final /* synthetic */ j invoke(StoryEditModel storyEditModel, StoryEditClipModel storyEditClipModel) {
        StoryEditClipModel storyEditClipModel2 = storyEditClipModel;
        l.d(storyEditModel, "");
        l.d(storyEditClipModel2, "");
        s sVar = new s();
        sVar.f156865b = 3;
        sVar.a(a.f137062a);
        j a2 = dmt.av.video.b.m.a(storyEditClipModel2.getVideoEditorType(), sVar);
        this.f137061b.invoke(a2);
        return a2;
    }
}
