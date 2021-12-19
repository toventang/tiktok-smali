package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.google.android.material.internal.CheckableImageButton;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    protected View f127985a;

    /* renamed from: b  reason: collision with root package name */
    protected a f127986b;

    /* renamed from: c  reason: collision with root package name */
    protected View f127987c;

    /* renamed from: d  reason: collision with root package name */
    protected View f127988d;

    /* renamed from: e  reason: collision with root package name */
    protected View f127989e;

    /* renamed from: f  reason: collision with root package name */
    protected View f127990f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.b f127991g;

    /* renamed from: h  reason: collision with root package name */
    protected CheckableImageButton f127992h;

    /* renamed from: i  reason: collision with root package name */
    protected ImageView f127993i;

    /* renamed from: j  reason: collision with root package name */
    protected e f127994j;

    /* renamed from: k  reason: collision with root package name */
    private View f127995k;

    /* renamed from: l  reason: collision with root package name */
    private View f127996l;

    static {
        Covode.recordClassIndex(83889);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public void a(int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public void a(e eVar, int i2, AnimatorListenerAdapter animatorListenerAdapter) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public void a(e eVar, VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public void a(VideoSegment videoSegment) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public void a(List<? extends VideoSegment> list) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public void a(boolean z, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public void b(androidx.core.g.e<Float, Float> eVar) {
        l.d(eVar, "");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public void b(e eVar, int i2, AnimatorListenerAdapter animatorListenerAdapter) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public void b(VideoSegment videoSegment) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public void c(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public void f() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public void g() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public void h() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public void i() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public void j() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public void k() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void a(boolean z) {
        View view = this.f127995k;
        if (view == null) {
            l.a("playView");
        }
        view.setVisibility(z ? 0 : 8);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final a a() {
        a aVar = this.f127986b;
        if (aVar == null) {
            l.a("videoEditView");
        }
        return aVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final boolean e() {
        a aVar = this.f127986b;
        if (aVar == null) {
            l.a("videoEditView");
        }
        return aVar.g();
    }

    /* access modifiers changed from: protected */
    public final a l() {
        a aVar = this.f127986b;
        if (aVar == null) {
            l.a("videoEditView");
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    public final View m() {
        View view = this.f127987c;
        if (view == null) {
            l.a("cancleView");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    public final View n() {
        View view = this.f127988d;
        if (view == null) {
            l.a("saveView");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    public final View o() {
        View view = this.f127990f;
        if (view == null) {
            l.a("iRephotographLayout");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    public final CheckableImageButton p() {
        CheckableImageButton checkableImageButton = this.f127992h;
        if (checkableImageButton == null) {
            l.a("speedView");
        }
        return checkableImageButton;
    }

    /* access modifiers changed from: protected */
    public final ImageView q() {
        ImageView imageView = this.f127993i;
        if (imageView == null) {
            l.a("rotateView");
        }
        return imageView;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final boolean b() {
        View view = this.f127995k;
        if (view == null) {
            l.a("playView");
        }
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final androidx.core.g.e<Float, Float> d() {
        a aVar = this.f127986b;
        if (aVar == null) {
            l.a("videoEditView");
        }
        androidx.core.g.e<Float, Float> slideX = aVar.getSlideX();
        l.b(slideX, "");
        return slideX;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void c() {
        View view = this.f127985a;
        if (view == null) {
            l.a("tvTime");
        }
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) view;
        e eVar = this.f127994j;
        if (eVar == null) {
            l.a("activity");
        }
        a aVar = this.f127986b;
        if (aVar == null) {
            l.a("videoEditView");
        }
        textView.setText(d.a(eVar, aVar.getSelectedTime(), false));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void a(androidx.core.g.e<Float, Float> eVar) {
        l.d(eVar, "");
        a aVar = this.f127986b;
        if (aVar == null) {
            l.a("videoEditView");
        }
        aVar.a(eVar, (List<VideoSegment>) null);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public void a(View.OnClickListener onClickListener) {
        View view = this.f127987c;
        if (view == null) {
            l.a("cancleView");
        }
        view.setOnClickListener(onClickListener);
        View view2 = this.f127988d;
        if (view2 == null) {
            l.a("saveView");
        }
        view2.setOnClickListener(onClickListener);
        View view3 = this.f127996l;
        if (view3 == null) {
            l.a("videoControlView");
        }
        view3.setOnClickListener(onClickListener);
        View view4 = this.f127990f;
        if (view4 == null) {
            l.a("iRephotographLayout");
        }
        view4.setOnClickListener(onClickListener);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void b(boolean z) {
        int i2;
        View view = this.f127989e;
        if (view == null) {
            l.a("rootView");
        }
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        if (z) {
            a aVar = this.f127986b;
            if (aVar == null) {
                l.a("videoEditView");
            }
            aVar.a();
        }
        a(z);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public final void a(com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.b bVar) {
        l.d(bVar, "");
        this.f127991g = bVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    public void a(e eVar, View view, boolean z) {
        if (eVar != null && view != null) {
            this.f127994j = eVar;
            this.f127989e = view;
            View findViewById = view.findViewById(R.id.ev0);
            l.b(findViewById, "");
            this.f127985a = findViewById;
            View findViewById2 = view.findViewById(R.id.ewh);
            l.b(findViewById2, "");
            this.f127987c = findViewById2;
            View findViewById3 = view.findViewById(R.id.f6c);
            l.b(findViewById3, "");
            this.f127988d = findViewById3;
            View findViewById4 = view.findViewById(R.id.dkv);
            l.b(findViewById4, "");
            this.f127990f = findViewById4;
            View findViewById5 = view.findViewById(R.id.bta);
            l.b(findViewById5, "");
            this.f127995k = findViewById5;
            View findViewById6 = view.findViewById(R.id.af0);
            l.b(findViewById6, "");
            this.f127996l = findViewById6;
            View findViewById7 = view.findViewById(R.id.bti);
            l.b(findViewById7, "");
            this.f127992h = (CheckableImageButton) findViewById7;
            View findViewById8 = view.findViewById(R.id.btg);
            l.b(findViewById8, "");
            this.f127993i = (ImageView) findViewById8;
            View findViewById9 = view.findViewById(R.id.ffa);
            l.b(findViewById9, "");
            a aVar = (a) findViewById9;
            this.f127986b = aVar;
            if (aVar == null) {
                l.a("videoEditView");
            }
            aVar.setVisibility(0);
            a aVar2 = this.f127986b;
            if (aVar2 == null) {
                l.a("videoEditView");
            }
            aVar2.f126141a = z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.fragment.app.e r11, com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel r12, java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r13, boolean r14, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.w r15) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            r5 = r11
            h.f.b.l.d(r5, r0)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a r1 = r10.f127986b
            java.lang.String r3 = "videoEditView"
            if (r1 != 0) goto L_0x000f
            h.f.b.l.a(r3)
        L_0x000f:
            r0 = 1
            r1.setExtractFramesInRoughMode(r0)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a r4 = r10.f127986b
            if (r4 != 0) goto L_0x001a
            h.f.b.l.a(r3)
        L_0x001a:
            r7 = 0
            if (r13 != 0) goto L_0x001f
            h.a.z r13 = h.a.z.INSTANCE
        L_0x001f:
            r1 = 0
            r0 = 6
            r2 = 0
            java.util.ArrayList r8 = com.ss.android.ugc.aweme.shortvideo.cut.videoedit.i.a(r13, r1, r2, r0)
            r6 = r12
            r9 = r14
            r4.a(r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a r1 = r10.f127986b
            if (r1 != 0) goto L_0x0032
            h.f.b.l.a(r3)
        L_0x0032:
            r0 = r9 ^ 1
            r1.setEditViewHeight(r0)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a r1 = r10.f127986b
            if (r1 != 0) goto L_0x003e
            h.f.b.l.a(r3)
        L_0x003e:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView
            if (r0 != 0) goto L_0x004a
        L_0x0042:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView r2 = (com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView) r2
            if (r2 == 0) goto L_0x0049
            r2.setViewConfig(r15)
        L_0x0049:
            return
        L_0x004a:
            r2 = r1
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.b.a(androidx.fragment.app.e, com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel, java.util.List, boolean, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.w):void");
    }
}
