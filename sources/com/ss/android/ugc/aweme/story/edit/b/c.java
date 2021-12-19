package com.ss.android.ugc.aweme.story.edit.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.b;
import com.ss.android.ugc.aweme.shortvideo.dg;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.ss.android.ugc.aweme.story.edit.model.a;
import h.f.b.l;
import h.j.h;

public final class c extends a {

    /* renamed from: c  reason: collision with root package name */
    private int f137058c;

    /* renamed from: d  reason: collision with root package name */
    private int f137059d;

    static {
        Covode.recordClassIndex(89612);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.bq
    public final int a() {
        if (this.f137058c == 0) {
            e();
        }
        return this.f137058c;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.bq
    public final int b() {
        if (this.f137059d == 0) {
            e();
        }
        return this.f137059d;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.bq
    public final int c() {
        if (this.f137053a) {
            return a();
        }
        return a.b(this.f137054b);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.bq
    public final int d() {
        if (this.f137053a) {
            return b();
        }
        return a.c(this.f137054b);
    }

    private final void e() {
        int i2;
        int a2;
        int ceil;
        int b2;
        int c2;
        if (a.d(this.f137054b)) {
            if (this.f137054b.getVideoCanvasWidth() > 0) {
                b2 = this.f137054b.getVideoCanvasWidth();
            } else {
                b2 = a.b(this.f137054b);
            }
            this.f137058c = b2;
            if (this.f137054b.getVideoCanvasHeight() > 0) {
                c2 = this.f137054b.getVideoCanvasHeight();
            } else {
                c2 = a.c(this.f137054b);
            }
            this.f137059d = c2;
            return;
        }
        boolean a3 = dg.a(a.b(this.f137054b), a.c(this.f137054b));
        if (a3) {
            a2 = a.b(this.f137054b);
        } else {
            int[] h2 = b.h();
            if (h2 != null) {
                i2 = h2[0];
            } else {
                i2 = 720;
            }
            a2 = a(h.c(a.b(this.f137054b), i2));
        }
        this.f137058c = a2;
        if (a3) {
            ceil = a.c(this.f137054b);
        } else {
            double d2 = (double) a2;
            Double.isNaN(d2);
            ceil = (int) (Math.ceil(d2 / 9.0d) * 16.0d);
        }
        this.f137059d = ceil;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(StoryEditClipModel storyEditClipModel) {
        super(storyEditClipModel);
        l.d(storyEditClipModel, "");
    }
}
