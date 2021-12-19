package com.ss.android.ugc.aweme.shortvideo.cover;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.h.v;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.port.in.bh;
import com.ss.android.ugc.aweme.property.bt;
import com.ss.android.ugc.aweme.property.ch;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.eu;
import com.ss.android.ugc.aweme.shortvideo.util.ax;
import com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2;
import com.ss.android.ugc.aweme.shortvideo.widget.o;
import com.ss.android.ugc.aweme.views.d;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends Fragment implements ChooseVideoCoverViewV2.a {
    private final int A = 7;

    /* renamed from: a  reason: collision with root package name */
    public ChooseVideoCoverViewV2 f125230a;

    /* renamed from: b  reason: collision with root package name */
    TextView f125231b;

    /* renamed from: c  reason: collision with root package name */
    View f125232c;

    /* renamed from: d  reason: collision with root package name */
    public ViewGroup f125233d;

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f125234e;

    /* renamed from: f  reason: collision with root package name */
    public FrameLayout f125235f;

    /* renamed from: g  reason: collision with root package name */
    public ViewGroup f125236g;

    /* renamed from: h  reason: collision with root package name */
    public FrameLayout f125237h;

    /* renamed from: i  reason: collision with root package name */
    FrameLayout f125238i;

    /* renamed from: j  reason: collision with root package name */
    a f125239j;

    /* renamed from: k  reason: collision with root package name */
    final SafeHandler f125240k = new SafeHandler(this);

    /* renamed from: l  reason: collision with root package name */
    public a f125241l;

    /* renamed from: m  reason: collision with root package name */
    TextView f125242m;
    float n;
    public final SparseArray<Float> o = new SparseArray<>();
    public final SparseArray<EffectTextModel> p = new SparseArray<>();
    boolean q;
    com.ss.android.ugc.tools.view.e.b r;
    public t<Bitmap> s;
    public t<Boolean> t;
    public boolean u = false;
    private final SafeHandler v = new SafeHandler(this);
    private boolean w;
    private final t<Integer> x = new t<>();
    private final int y = 0;
    private final int z = 1;

    public interface a {
        static {
            Covode.recordClassIndex(82246);
        }

        g a();

        t<dmt.av.video.t> b();

        VideoPublishEditModel c();
    }

    static {
        Covode.recordClassIndex(82242);
    }

    public final boolean b() {
        if (!ax.a(this.f125241l.c().mVideoCoverStartTm, this.n / 1000.0f)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2.a
    public final void c() {
        this.f125240k.removeCallbacksAndMessages(null);
        this.f125241l.b().setValue(dmt.av.video.t.b());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        o oVar;
        if ((this.f125230a.getAdapter() instanceof o) && (oVar = (o) this.f125230a.getAdapter()) != null) {
            oVar.a();
        }
        this.f125240k.removeCallbacksAndMessages(null);
        this.v.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        com.ss.android.ugc.tools.view.e.b bVar = this.r;
        if (bVar != null) {
            bVar.dismiss();
        }
        this.f125240k.removeCallbacksAndMessages(null);
        this.f125241l.b().setValue(dmt.av.video.t.b());
        this.f125241l.a().a(true);
        this.f125241l.b().setValue(dmt.av.video.t.a());
        if (getFragmentManager() != null && isAdded()) {
            requireFragmentManager().a().a(this).c();
        }
    }

    public final void d() {
        Bitmap c2;
        Bitmap c3;
        if (this.u && (c3 = this.f125241l.a().c()) != null) {
            this.u = false;
            this.f125230a.setVideoCoverFrameView(c3);
            c3.recycle();
        }
        if (this.q && (c2 = this.f125241l.a().c()) != null) {
            this.n = (float) this.f125241l.a().k();
            this.u = false;
            this.f125230a.setVideoCoverFrameView(c2);
            c2.recycle();
        }
    }

    private int c(float f2) {
        return (int) (((float) this.f125241l.a().j()) * f2);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isMvThemeVideoType() || this.w) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2.a
    public final void a(float f2) {
        this.q = true;
        this.f125241l.b().setValue(dmt.av.video.t.a((long) c(f2)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof a) {
            this.f125241l = (a) context;
            this.w = ch.a();
            eu.c((Activity) context);
            return;
        }
        throw new IllegalStateException("context must implement ArgumentsDependency");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2.a
    public final void b(float f2) {
        this.f125241l.a().c(new r() {
            /* class com.ss.android.ugc.aweme.shortvideo.cover.b.AnonymousClass3 */

            static {
                Covode.recordClassIndex(82245);
            }

            @Override // com.ss.android.vesdk.r
            public final void onCallback(int i2, int i3, float f2, String str) {
                if (i2 == 4101) {
                    b.this.d();
                    b.this.f125241l.a().d(this);
                }
            }
        });
        a(f2, true);
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.f125241l.c().creationId).a("shoot_way", this.f125241l.c().mShootWay);
        if (this.f125241l.c().draftId != 0) {
            a2.a("draft_id", this.f125241l.c().draftId);
        }
        if (!TextUtils.isEmpty(this.f125241l.c().newDraftId)) {
            a2.a("new_draft_id", this.f125241l.c().newDraftId);
        }
        com.ss.android.ugc.aweme.common.r.a("cover_click", a2.f149193a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        x.a aVar;
        a vEVideoCoverGeneratorImpl;
        super.onActivityCreated(bundle);
        this.f125230a.setOnScrollListener(this);
        VideoPublishEditModel c2 = this.f125241l.c();
        int i2 = 0;
        this.o.put(0, Float.valueOf(c2.getCoverPublishModel().getVideoCoverViewX()));
        this.n = c2.mVideoCoverStartTm * 1000.0f;
        this.p.put(0, c2.getCoverPublishModel().getEffectTextModel());
        this.f125230a.setItemCount(7);
        this.f125230a.setTotalPage(1);
        if (bt.a()) {
            aVar = x.a.GET_FRAMES_MODE_NORMAL;
        } else {
            aVar = x.a.GET_FRAMES_MODE_NOEFFECT;
        }
        if (a(c2)) {
            if (this.f125241l.a() != null) {
                i2 = this.f125241l.a().j();
            }
            vEVideoCoverGeneratorImpl = new MvEffectVideoCoverGeneratorImpl(i2);
        } else if (c2.isMultiVideoEdit()) {
            vEVideoCoverGeneratorImpl = new VEMultiEditVideoCoverGeneratorImpl(this.f125241l.a(), this, this.f125230a.getCoverSize(), this.f125241l.a().j(), 0, aVar);
        } else {
            vEVideoCoverGeneratorImpl = new VEVideoCoverGeneratorImpl(this.f125241l.a(), this, this.f125230a.getCoverSize(), aVar, "choose_cover");
        }
        this.f125239j = vEVideoCoverGeneratorImpl;
        this.f125230a.post(new j(this, c2));
        this.x.observe(this, k.f125259a);
        this.f125231b.setOnClickListener(new d() {
            /* class com.ss.android.ugc.aweme.shortvideo.cover.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(82243);
            }

            @Override // com.ss.android.ugc.aweme.views.d
            public final void a(View view) {
                VideoPublishEditModel c2 = b.this.f125241l.c();
                g a2 = b.this.f125241l.a();
                boolean b2 = b.this.b();
                EffectTextModel effectTextModel = new EffectTextModel();
                bh K = com.ss.android.ugc.aweme.port.in.g.a().K();
                a2.b();
                a2.b();
                K.a(c2, effectTextModel, b2, true, new r(this, effectTextModel, c2));
            }
        });
        this.f125232c.setOnClickListener(new d() {
            /* class com.ss.android.ugc.aweme.shortvideo.cover.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(82244);
            }

            @Override // com.ss.android.ugc.aweme.views.d
            public final void a(View view) {
                b.this.a((h.f.a.b<Boolean, Boolean>) null);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        this.f125241l.b().setValue(dmt.av.video.t.b());
        this.f125241l.b().setValue(dmt.av.video.t.a());
        this.f125240k.postDelayed(new g(this, j2), 1000);
    }

    public final void a(h.f.a.b<Boolean, Boolean> bVar) {
        VideoPublishEditModel c2 = this.f125241l.c();
        g a2 = this.f125241l.a();
        EffectTextModel effectTextModel = new EffectTextModel();
        boolean b2 = b();
        bh K = com.ss.android.ugc.aweme.port.in.g.a().K();
        a2.b();
        a2.b();
        K.a(c2, effectTextModel, b2, false, new f(this, effectTextModel, bVar));
    }

    public final void a(float f2, boolean z2) {
        this.q = z2;
        dmt.av.video.t b2 = dmt.av.video.t.b((long) c(f2));
        this.f125241l.b().setValue(b2);
        if (this.f125239j != null) {
            a(b2.f156955b);
        }
    }

    static boolean a(EffectTextModel effectTextModel, EffectTextModel effectTextModel2) {
        if (effectTextModel == effectTextModel2 || effectTextModel.getTextSticker() == effectTextModel2.getTextSticker()) {
            return false;
        }
        if (effectTextModel.getTextSticker() == null || effectTextModel2.getTextSticker() == null) {
            return true;
        }
        if (!(effectTextModel.getTextSticker().stickerId == null || effectTextModel2.getTextSticker().stickerId == null)) {
            if (!effectTextModel.getTextSticker().stickerId.equals(effectTextModel2.getTextSticker().stickerId)) {
                return true;
            }
            try {
                TextStickerData textStickerData = (TextStickerData) com.ss.android.ugc.aweme.port.in.g.a().G().a(effectTextModel.getTextSticker().extra, TextStickerData.class);
                TextStickerData textStickerData2 = (TextStickerData) com.ss.android.ugc.aweme.port.in.g.a().G().a(effectTextModel2.getTextSticker().extra, TextStickerData.class);
                if (textStickerData == textStickerData2) {
                    return false;
                }
                if (textStickerData == null || textStickerData2 == null) {
                    return true;
                }
                l.d(textStickerData, "");
                l.d(textStickerData2, "");
                if (TextStickerData.b.a.a(textStickerData.getX(), textStickerData2.getX())) {
                    if (TextStickerData.b.a.a(textStickerData.getY(), textStickerData2.getY())) {
                        if (textStickerData.getFontSize() == textStickerData2.getFontSize()) {
                            if (textStickerData.getColor() == textStickerData2.getColor()) {
                                if (textStickerData.getScale() == textStickerData2.getScale()) {
                                    if (textStickerData.getRotation() == textStickerData2.getRotation()) {
                                        if (textStickerData.getBgMode() == textStickerData2.getBgMode()) {
                                            if (textStickerData.getAlign() == textStickerData2.getAlign()) {
                                                if (!l.a((Object) TextStickerData.b.C2144b.a(textStickerData.getTextWrapList()), (Object) TextStickerData.b.C2144b.a(textStickerData2.getTextWrapList()))) {
                                                    return true;
                                                }
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f125230a = (ChooseVideoCoverViewV2) v.c(view, (int) R.id.a61);
        this.f125231b = (TextView) v.c(view, (int) R.id.ewv);
        this.f125232c = v.c(view, (int) R.id.ewu);
        this.f125234e = (FrameLayout) v.c(view, (int) R.id.fhp);
        this.f125235f = (FrameLayout) v.c(view, (int) R.id.b4r);
        this.f125233d = (ViewGroup) v.c(view, (int) R.id.bf9);
        this.f125236g = (ViewGroup) v.c(view, (int) R.id.djm);
        this.f125237h = (FrameLayout) v.c(view, (int) R.id.b4q);
        this.f125238i = (FrameLayout) v.c(view, (int) R.id.b4p);
        TextView textView = (TextView) v.c(view, (int) R.id.ewy);
        this.f125242m = textView;
        textView.setVisibility(8);
        com.ss.android.ugc.aweme.port.in.g.a().K().a((androidx.appcompat.app.d) getActivity(), "coverpic", "covertext", this.f125237h, this.f125238i, this.f125235f, this.f125241l.c().getCoverPublishModel().getEffectTextModel(), this.f125241l.c().getAvetParameter(), new c(this));
        v.c(view, (int) R.id.fjj).setOnTouchListener(d.f125247a);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.d_, viewGroup, false);
    }
}
