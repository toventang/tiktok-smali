package com.bytedance.android.live.publicscreen.impl.model.chat;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import androidx.fragment.app.i;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.f;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.ui.cz;
import com.bytedance.android.livesdk.j.ao;
import com.bytedance.android.livesdk.model.message.s;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c extends a<s> {

    /* renamed from: l  reason: collision with root package name */
    public static final int f12462l = y.d(R.dimen.xx);

    /* renamed from: m  reason: collision with root package name */
    static final int f12463m = y.d(R.dimen.xy);
    static final int n = y.d(R.dimen.xw);
    public static final a o = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    final SpannableStringBuilder f12464h = new SpannableStringBuilder();

    /* renamed from: i  reason: collision with root package name */
    EmoteModel f12465i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12466j;

    /* renamed from: k  reason: collision with root package name */
    final int f12467k = 1;
    private final List<b> p = new ArrayList();

    static final class a {
        static {
            Covode.recordClassIndex(6843);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final CharSequence a() {
        return this.f12464h;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        return ((s) this.f12190d).f19687f;
    }

    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f12468a;

        /* renamed from: b  reason: collision with root package name */
        public com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> f12469b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f12470c;

        /* renamed from: d  reason: collision with root package name */
        public m f12471d;

        /* renamed from: e  reason: collision with root package name */
        public final int f12472e;

        /* renamed from: f  reason: collision with root package name */
        public final EmoteModel f12473f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f12474g;

        static {
            Covode.recordClassIndex(6844);
        }

        public final void a() {
            if (this.f12468a == null && !this.f12470c) {
                this.f12470c = true;
                com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar = this.f12469b;
                if (cVar != null) {
                    cVar.g();
                }
                ImageModel imageModel = this.f12473f.f7391h;
                int i2 = c.f12462l;
                com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> a2 = k.a(imageModel, i2, i2);
                this.f12469b = a2;
                if (a2 != null) {
                    a2.a(new a(this), com.facebook.common.b.a.f47054a);
                }
            }
        }

        public static final class a extends com.facebook.imagepipeline.f.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f12475a;

            static {
                Covode.recordClassIndex(6845);
            }

            /* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.c$b$a$a  reason: collision with other inner class name */
            static final class RunnableC0262a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f12476a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Bitmap f12477b;

                static {
                    Covode.recordClassIndex(6846);
                }

                RunnableC0262a(a aVar, Bitmap bitmap) {
                    this.f12476a = aVar;
                    this.f12477b = bitmap;
                }

                public final void run() {
                    b bVar = this.f12476a.f12475a;
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f12476a.f12475a.f12474g.A().f12200d.getResources(), this.f12477b);
                    int i2 = c.f12462l;
                    bitmapDrawable.setBounds(0, 0, i2, i2);
                    androidx.core.graphics.drawable.a.b(bitmapDrawable, this.f12476a.f12475a.f12474g.f12466j ? 1 : 0);
                    bVar.f12468a = bitmapDrawable;
                    c cVar = this.f12476a.f12475a.f12474g;
                    b bVar2 = this.f12476a.f12475a;
                    Drawable drawable = bVar2.f12468a;
                    if (drawable != null) {
                        cVar.f12464h.removeSpan(bVar2.f12471d);
                        int i3 = (cVar.f12467k * bVar2.f12472e) + 1;
                        SpannableStringBuilder spannableStringBuilder = cVar.f12464h;
                        m mVar = new m(drawable);
                        mVar.a((float) c.n);
                        mVar.f22625a = c.f12463m;
                        bVar2.f12471d = mVar;
                        spannableStringBuilder.setSpan(mVar, i3, i3 + 1, 33);
                        cVar.f12188b = null;
                        cVar.A().a(cVar);
                    }
                    this.f12476a.f12475a.f12470c = false;
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(b bVar) {
                this.f12475a = bVar;
            }

            @Override // com.facebook.d.b
            public final void onFailureImpl(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
                l.d(cVar, "");
                cVar.g();
                this.f12475a.f12470c = false;
            }

            @Override // com.facebook.imagepipeline.f.b
            public final void a(Bitmap bitmap) {
                com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar = this.f12475a.f12469b;
                if (!(cVar == null || !cVar.b() || bitmap == null)) {
                    ((a) this.f12475a.f12474g).f12415e.post(new RunnableC0262a(this, bitmap));
                }
                com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar2 = this.f12475a.f12469b;
                if (cVar2 != null) {
                    cVar2.g();
                }
            }
        }

        public b(c cVar, int i2, EmoteModel emoteModel) {
            l.d(emoteModel, "");
            this.f12474g = cVar;
            this.f12472e = i2;
            this.f12473f = emoteModel;
            this.f12468a = emoteModel.f7396m;
        }
    }

    static {
        Covode.recordClassIndex(6842);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.a.d.d, com.bytedance.android.live.publicscreen.impl.model.chat.a
    public final void e() {
        super.e();
        Iterator<T> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        if (A() != null) {
            b.a.a("livesdk_privilege_emote_show").a(A().f12208l).a("show_entrance", "comment_area").b();
        }
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.a.d.h, com.bytedance.android.live.publicscreen.impl.model.chat.a
    public final void r() {
        super.r();
        for (T t : this.p) {
            t.f12470c = false;
            com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar = t.f12469b;
            if (cVar != null) {
                cVar.g();
            }
        }
        this.f12464h.clear();
    }

    /* access modifiers changed from: package-private */
    public final void a(EmoteModel emoteModel) {
        DataChannel dataChannel;
        i iVar;
        g A = A();
        if (A != null && (dataChannel = A.f12208l) != null && (iVar = (i) dataChannel.b(ao.class)) != null) {
            ((f) com.bytedance.android.live.t.a.a(f.class)).showEmoteDetailDialog(emoteModel, iVar);
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.c$c  reason: collision with other inner class name */
    public static final class C0263c extends cz {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f12478a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f12479b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ GradientDrawable f12480c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.c f12481d;

        static {
            Covode.recordClassIndex(6847);
        }

        @Override // com.bytedance.android.livesdk.chatroom.ui.cz
        public final void a(View view) {
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
        }

        public final void onClick(View view) {
            String str;
            l.d(view, "");
            c cVar = this.f12479b;
            EmoteModel emoteModel = this.f12478a.f12473f;
            if (cVar.A() != null) {
                if (cVar.A().f12203g) {
                    cVar.a(emoteModel);
                } else {
                    cVar.f12465i = emoteModel;
                    com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdkapi.f.a(1));
                }
                User b2 = cVar.b();
                if (b2 == null || b2.getId() != cVar.A().f12199c) {
                    if (cVar.A().f12205i) {
                        str = "live_anchor_c_audience";
                    } else {
                        str = "live_audience_c_audience";
                    }
                } else if (cVar.A().f12205i) {
                    str = "live_anchor_c_anchor";
                } else {
                    str = "live_audience_c_anchor";
                }
                b.a.a("livesdk_privilege_emote_click").a(cVar.A().f12208l).a("request_page", str).a("click_position", "comment_area").b();
            }
        }

        C0263c(b bVar, c cVar, GradientDrawable gradientDrawable, z.c cVar2) {
            this.f12478a = bVar;
            this.f12479b = cVar;
            this.f12480c = gradientDrawable;
            this.f12481d = cVar2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(s sVar) {
        super(sVar);
        List g2;
        l.d(sVar, "");
        List<EmoteModel> list = sVar.f19686a;
        if (!(list == null || (g2 = n.g((Iterable) list)) == null)) {
            int i2 = 0;
            for (Object obj : g2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                this.p.add(new b(this, i2, (EmoteModel) obj));
                i2 = i3;
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.a.d.g, com.bytedance.android.live.publicscreen.impl.model.chat.a
    public final void b(g gVar) {
        l.d(gVar, "");
        super.b(gVar);
        this.f12466j = com.bytedance.android.live.uikit.c.a.a(gVar.f12200d);
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i2 = f12462l;
        int i3 = 0;
        gradientDrawable.setBounds(0, 0, i2, i2);
        gradientDrawable.setCornerRadius((float) n);
        gradientDrawable.setColor(com.bytedance.android.live.design.b.a(gVar.f12200d, (int) R.attr.amp));
        androidx.core.graphics.drawable.a.b(gradientDrawable, this.f12466j ? 1 : 0);
        if (this.f12466j) {
            this.f12464h.append((char) 8207);
        } else {
            this.f12464h.append((char) 8206);
        }
        z.c cVar = new z.c();
        for (T t : this.p) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                n.a();
            }
            T t2 = t;
            this.f12464h.append((char) 65532);
            Drawable drawable = t2.f12468a;
            if (drawable == null) {
                drawable = gradientDrawable;
            }
            cVar.element = (this.f12467k * i3) + 1;
            SpannableStringBuilder spannableStringBuilder = this.f12464h;
            m mVar = new m(drawable);
            mVar.a((float) n);
            mVar.f22625a = f12463m;
            t2.f12471d = mVar;
            spannableStringBuilder.setSpan(mVar, cVar.element, cVar.element + this.f12467k, 33);
            this.f12464h.setSpan(new C0263c(t2, this, gradientDrawable, cVar), cVar.element, cVar.element + 1, 33);
            t2.a();
            i3 = i4;
        }
        EmoteModel emoteModel = this.f12465i;
        if (emoteModel != null) {
            a(emoteModel);
            this.f12465i = null;
        }
    }
}
