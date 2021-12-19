package com.ss.android.ugc.aweme.story.record.recordcontrol;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.x;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.shortvideo.w.g;
import com.ss.android.ugc.aweme.story.record.recordcontrol.StoryRecordNextAction;
import com.ss.android.ugc.aweme.utils.hx;
import com.ss.android.vesdk.ax;
import h.f.a.r;
import h.f.b.l;
import h.f.b.y;
import h.h.d;
import h.k.i;
import h.z;
import java.lang.reflect.Type;
import java.util.Objects;

public final class e extends g<m> {
    static final /* synthetic */ i[] q = {new y(e.class, "cameraApiComponent", "getCameraApiComponent()Lcom/ss/android/ugc/aweme/story/record/camera/StoryCameraCoreComponent;", 0), new y(e.class, "recordComponent", "getRecordComponent()Lcom/ss/android/ugc/aweme/story/record/recordcontrol/StoryRecordControlComponent;", 0), new y(e.class, "recordContext", "getRecordContext()Lcom/ss/android/ugc/aweme/story/record/model/StoryRecordContext;", 0)};
    private final d r = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.story.record.a.b.class);
    private final d s = com.bytedance.o.b.a.a(getDiContainer(), e.class);
    private final d t = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.story.record.f.a.class);

    static {
        Covode.recordClassIndex(90524);
    }

    static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(90527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return ((com.ss.android.ugc.aweme.story.record.h.a) this.this$0.getDiContainer().a((Type) com.ss.android.ugc.aweme.story.record.h.a.class, (String) null)).a();
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ int $infoType;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(90525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, int i2) {
            super(0);
            this.this$0 = eVar;
            this.$infoType = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            int i2 = this.$infoType;
            if (i2 == 1022) {
                x xVar = new x("stop record when stopPreview");
                xVar.f28214a = 3;
                e eVar = this.this$0;
                l.b(xVar, "");
                eVar.b(xVar);
                this.this$0.a(xVar);
            } else if (i2 == 1080) {
                e eVar2 = this.this$0;
                eVar2.f132686j = eVar2.H().H().a();
                this.this$0.getApiComponent().y();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.w.g, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        H().D().a(new b(this));
        Activity b2 = com.bytedance.als.dsl.g.b(this);
        Objects.requireNonNull(b2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        d dVar = this.r;
        i<?>[] iVarArr = q;
        Object a2 = getDiContainer().a(com.bytedance.creativex.recorder.sticker.a.a.class);
        l.b(a2, "");
        a(StoryRecordNextAction.a.class, new StoryRecordNextAction((androidx.fragment.app.e) b2, (com.ss.android.ugc.aweme.story.record.a.b) dVar.a(this, iVarArr[0]), (com.bytedance.creativex.recorder.sticker.a.a) a2, (com.ss.android.ugc.aweme.story.record.f.a) this.t.a(this, iVarArr[2]), ((g) this.s.a(this, iVarArr[1])).f132687k, new c(this)));
        a(StoryRecordNextAction.a.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(f fVar, h.f.a.b<? super g.b, z> bVar) {
        super(fVar, bVar);
        l.d(fVar, "");
    }

    static final class b extends h.f.b.m implements r<Integer, Integer, String, ax, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(90526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(4);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ z a(Integer num, Integer num2, String str, ax axVar) {
            int intValue = num.intValue();
            l.d(axVar, "");
            hx.a(0, new a(this.this$0, intValue));
            return z.f158842a;
        }
    }
}
