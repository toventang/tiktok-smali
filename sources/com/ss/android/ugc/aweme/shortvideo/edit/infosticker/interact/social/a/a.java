package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import b.i;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.interact.view.g;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.f;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.story.h.c.a.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public abstract class a<T> extends c implements f<T>, b.a {
    public g A;
    public final VideoPublishEditModel B;

    /* renamed from: a  reason: collision with root package name */
    public String f127582a;

    /* renamed from: b  reason: collision with root package name */
    public b<T> f127583b;

    /* renamed from: c  reason: collision with root package name */
    public b f127584c;

    static {
        Covode.recordClassIndex(83646);
    }

    public abstract List<InteractStickerStruct> a(List<? extends StickerItemModel> list);

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.d.b
    public final InteractStickerStruct c() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final int f() {
        return R.string.ayb;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final boolean l() {
        return true;
    }

    public abstract List<String> q();

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.b o() {
        return new f();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final boolean b() {
        List list = this.f127194m;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public final void r() {
        Iterator it = this.f127194m.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            l.b(gVar, "");
            if (gVar.getParent() == null || gVar.getParent() == this.f127185d) {
                this.f127185d.removeView(gVar);
                this.f127193l = null;
                if (this.n != null) {
                    this.n.d();
                }
                it.remove();
            } else {
                return;
            }
        }
    }

    public final void t() {
        this.A = this.f127193l;
        this.f127193l = null;
        b<T> bVar = this.f127583b;
        if (bVar != null) {
            FrameLayout frameLayout = this.f127185d;
            l.b(frameLayout, "");
            float height = (float) frameLayout.getHeight();
            FrameLayout frameLayout2 = this.f127185d;
            l.b(frameLayout2, "");
            bVar.a(height, (float) frameLayout2.getTop());
        }
        b<T> bVar2 = this.f127583b;
        if (bVar2 != null) {
            bVar2.a((d) null, new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.a((byte) 0));
        }
    }

    public final void s() {
        d<T> dVar;
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.a aVar;
        Context context = this.t;
        e eVar = null;
        if (!(context instanceof e)) {
            context = null;
        }
        e eVar2 = (e) context;
        if (eVar2 != null) {
            ((com.ss.android.ugc.aweme.shortvideo.preview.a) ApiCenter.a.a(eVar2).a(com.ss.android.ugc.aweme.shortvideo.preview.a.class)).a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
        }
        b<T> bVar = this.f127583b;
        if (bVar != null) {
            FrameLayout frameLayout = this.f127185d;
            l.b(frameLayout, "");
            float height = (float) frameLayout.getHeight();
            FrameLayout frameLayout2 = this.f127185d;
            l.b(frameLayout2, "");
            bVar.a(height, (float) frameLayout2.getTop());
        }
        n();
        g gVar = this.f127193l;
        if (!(gVar instanceof e)) {
            gVar = null;
        }
        e eVar3 = (e) gVar;
        if (eVar3 != null) {
            dVar = eVar3.getBaseView();
        } else {
            dVar = null;
        }
        g gVar2 = this.f127193l;
        if (gVar2 instanceof e) {
            eVar = gVar2;
        }
        e eVar4 = eVar;
        if (eVar4 == null || dVar == null) {
            aVar = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.a((byte) 0);
        } else {
            eVar4.r();
            aVar = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.a((byte) 0);
            aVar.f127507c = c.b(eVar4.getRotateAngle());
            View contentView = eVar4.getContentView();
            l.b(contentView, "");
            aVar.f127505a = contentView.getScaleX();
            View contentView2 = eVar4.getContentView();
            l.b(contentView2, "");
            aVar.f127506b = contentView2.getScaleY();
            View contentView3 = eVar4.getContentView();
            l.b(contentView3, "");
            float x = contentView3.getX();
            FrameLayout frameLayout3 = this.f127185d;
            l.b(frameLayout3, "");
            aVar.f127508d = x + frameLayout3.getX();
            View contentView4 = eVar4.getContentView();
            l.b(contentView4, "");
            float y = contentView4.getY();
            FrameLayout frameLayout4 = this.f127185d;
            l.b(frameLayout4, "");
            aVar.f127509e = y + frameLayout4.getY();
        }
        b<T> bVar2 = this.f127583b;
        if (bVar2 != null) {
            bVar2.a(dVar, aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void b(g gVar) {
        this.f127185d.addView(this.f127193l);
    }

    public a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        this.B = videoPublishEditModel;
    }

    @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
    public final void c(int i2) {
        b<T> bVar = this.f127583b;
        if (bVar != null && bVar.getVisibility() == 0) {
            bVar.f127595k += i2;
            bVar.setSearchListMarginBottom(bVar.f127595k);
        }
    }

    public final void a(b<T> bVar) {
        if (this.f127583b == null) {
            this.f127583b = bVar;
            if (bVar != null) {
                bVar.setVisibility(8);
            }
            b<T> bVar2 = this.f127583b;
            if (bVar2 != null) {
                bVar2.setMEditingListener(this);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
    public final void b(int i2) {
        b<T> bVar = this.f127583b;
        if (bVar != null) {
            boolean z = true;
            if (bVar.getVisibility() == 0 && !bVar.getMIsDismissing()) {
                if (this.f127193l != null) {
                    z = false;
                }
                d<T> dVar = bVar.f127587c;
                if (dVar != null) {
                    if (z) {
                        bVar.f127588d.f127508d = (float) ((bVar.getWidth() - dVar.getWidth()) / 2);
                        bVar.f127588d.f127509e = ((bVar.f127591g.x - ((float) dVar.getHeight())) / 2.0f) + bVar.f127591g.y;
                    }
                    bVar.f127589e.f127508d = (float) ((bVar.getWidth() - dVar.getWidth()) / 2);
                    bVar.f127589e.f127509e = (float) (((bVar.getHeight() - i2) - dVar.getHeight()) / 2);
                }
                g gVar = this.f127193l;
                if (gVar == null) {
                    bVar.d();
                } else if (gVar instanceof e) {
                    float newLayoutHeight = ((e) gVar).getNewLayoutHeight();
                    b<T> bVar2 = this.f127583b;
                    if (bVar2 != null) {
                        bVar2.f127588d.f127509e += newLayoutHeight;
                    }
                    b<T> bVar3 = this.f127583b;
                    if (bVar3 != null) {
                        bVar3.d();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
    public final void a(int i2) {
        float f2;
        b<T> bVar = this.f127583b;
        if (bVar != null && bVar.getVisibility() == 0 && !bVar.getMIsEditing()) {
            bVar.f127595k = i2;
            bVar.setSearchListMarginBottom(bVar.f127595k);
            d<T> dVar = bVar.f127587c;
            if (dVar != null) {
                bVar.f127589e.f127508d = (float) ((bVar.getWidth() - dVar.getWidth()) / 2);
                bVar.f127589e.f127509e = (float) (((bVar.getHeight() - i2) - dVar.getHeight()) / 2);
            }
            bVar.f127593i = false;
            if (!bVar.f127592h) {
                bVar.f127592h = true;
                int i3 = bVar.f127594j;
                if (i3 == c.f127606c) {
                    bVar.f127594j = c.f127604a;
                    d<T> dVar2 = bVar.f127587c;
                    if (dVar2 != null) {
                        dVar2.setVisibility(0);
                        b.C3318b bVar2 = new b.C3318b(bVar);
                        l.d(dVar2, "");
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dVar2, "scaleX", bVar.f127588d.f127505a, bVar.f127589e.f127505a);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dVar2, "scaleY", bVar.f127588d.f127506b, bVar.f127589e.f127506b);
                        float[] fArr = new float[2];
                        fArr[0] = bVar.f127588d.f127507c;
                        if (bVar.f127588d.f127507c > 180.0f) {
                            f2 = 360.0f;
                        } else {
                            f2 = bVar.f127589e.f127507c;
                        }
                        fArr[1] = f2;
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(dVar2, "rotation", fArr);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(dVar2, "x", bVar.f127588d.f127508d, bVar.f127589e.f127508d);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(dVar2, "y", bVar.f127588d.f127509e, bVar.f127589e.f127509e);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.setDuration(300L);
                        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5);
                        animatorSet.addListener(bVar2);
                        animatorSet.start();
                        bVar.f127590f = animatorSet;
                    }
                } else if (i3 == c.f127605b) {
                    bVar.f127594j = c.f127604a;
                    d<T> dVar3 = bVar.f127587c;
                    if (dVar3 != null) {
                        dVar3.setX(bVar.f127589e.f127508d);
                        dVar3.setY(bVar.f127589e.f127509e);
                        dVar3.setVisibility(0);
                        bVar.requestLayout();
                        b.c cVar = new b.c(bVar);
                        l.d(dVar3, "");
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(dVar3, "scaleX", 0.0f, 1.0f);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(dVar3, "scaleY", 0.0f, 1.0f);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.setDuration(300L);
                        animatorSet2.playTogether(ofFloat6, ofFloat7);
                        animatorSet2.addListener(cVar);
                        animatorSet2.start();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(Context context, FrameLayout frameLayout) {
        super.a(context, frameLayout);
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        e eVar = (e) context;
        if (eVar != null) {
            com.ss.android.ugc.aweme.story.h.c.a.b bVar = new com.ss.android.ugc.aweme.story.h.c.a.b(eVar, null);
            this.f127584c = bVar;
            bVar.a(this);
        }
    }

    public final void a(g gVar, InteractStickerStruct interactStickerStruct) {
        NormalTrackTimeStamp a2;
        if (gVar != null && interactStickerStruct != null && (a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(interactStickerStruct)) != null) {
            Point b2 = b(new PointF(a2.getX(), a2.getY()));
            PointF centerViewPoint = gVar.getCenterViewPoint();
            gVar.a(((float) b2.x) - centerViewPoint.x, ((float) b2.y) - centerViewPoint.y, false);
            gVar.b();
            gVar.a(-a2.getRotation(), (Boolean) false);
            Float scale = a2.getScale();
            Objects.requireNonNull(scale, "null cannot be cast to non-null type kotlin.Float");
            gVar.a(scale.floatValue());
        }
    }

    public final i<List<com.ss.android.ugc.aweme.editSticker.compile.b>> b(String str, int i2, int i3, int i4, int i5) {
        l.d(str, "");
        ArrayList arrayList = new ArrayList();
        for (g gVar : this.f127194m) {
            i<com.ss.android.ugc.aweme.editSticker.compile.b> a2 = this.p.a(gVar, this.f127185d, str, i2, i3, i4, i5);
            l.b(a2, "");
            arrayList.add(a2);
        }
        i<List<com.ss.android.ugc.aweme.editSticker.compile.b>> a3 = i.a((Collection) arrayList);
        l.b(a3, "");
        return a3;
    }
}
