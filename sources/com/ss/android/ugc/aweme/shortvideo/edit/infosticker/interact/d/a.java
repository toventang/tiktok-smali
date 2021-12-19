package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.editSticker.a.m;
import com.ss.android.ugc.aweme.editSticker.g;
import com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel;
import com.ss.android.ugc.aweme.editSticker.text.view.q;
import com.ss.android.ugc.aweme.property.ay;
import com.ss.android.ugc.aweme.property.de;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.qa.EditPageQaStickerViewModel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;

public final class a extends m {
    public static final C3302a r = new C3302a((byte) 0);
    public EditTextStickerViewModel o;
    public EditPageQaStickerViewModel p;
    public boolean q;
    private final boolean s = com.ss.android.ugc.gamora.editor.sticker.permission.a.f146748a;
    private EditCommentStickerViewModel t;

    static {
        Covode.recordClassIndex(83439);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.a$a  reason: collision with other inner class name */
    public static final class C3302a {
        static {
            Covode.recordClassIndex(83440);
        }

        private C3302a() {
        }

        public /* synthetic */ C3302a(byte b2) {
            this();
        }

        public static boolean a(String str) {
            l.d(str, "");
            if (str.length() > 150) {
                return false;
            }
            List<String> a2 = de.a();
            if (a2 == null || a2.isEmpty()) {
                a2 = n.b("^why .*", "^what .*", "^when .*", "^where .*", "^who .*", "^how .*", ".*could you .*", ".*can you .*", ".*would you .*");
            }
            Iterator<T> it = a2.iterator();
            while (it.hasNext()) {
                Locale locale = Locale.US;
                l.b(locale, "");
                String lowerCase = str.toLowerCase(locale);
                l.b(lowerCase, "");
                if (Pattern.matches(it.next(), lowerCase)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.a.b, com.ss.android.ugc.aweme.editSticker.a.m
    public final View c() {
        int i2;
        MethodCollector.i(7108);
        View c2 = super.c();
        if (c2 != null) {
            LinearLayout linearLayout = (LinearLayout) c2;
            boolean z = this.q;
            EditPageQaStickerViewModel editPageQaStickerViewModel = this.p;
            if (editPageQaStickerViewModel == null) {
                l.a("qaStickerViewModel");
            }
            boolean b2 = editPageQaStickerViewModel.k().d().b();
            if (ay.a()) {
                View view = this.f88070h;
                if (view != null) {
                    String text = ((q) view).getText();
                    l.b(text, "");
                    if (C3302a.a(text) && !g.a().f88142f && this.s && com.ss.android.ugc.aweme.port.in.g.a().A().b() && !z && !b2) {
                        EditPageQaStickerViewModel editPageQaStickerViewModel2 = this.p;
                        if (editPageQaStickerViewModel2 == null) {
                            l.a("qaStickerViewModel");
                        }
                        VideoPublishEditModel videoPublishEditModel = editPageQaStickerViewModel2.f146782b.f119162b;
                        if (videoPublishEditModel != null) {
                            r.a("text_to_question_show", new d().a("enter_from", "video_edit_page").a("creation_id", videoPublishEditModel.creationId).a("shoot_way", com.ss.android.ugc.aweme.port.in.g.a().A().c()).f66730a);
                        }
                        if (gb.a()) {
                            i2 = 2131230970;
                        } else {
                            i2 = 2131230969;
                        }
                        LinearLayout a2 = a(i2, R.string.f2v);
                        a2.setOnClickListener(new b(this, z));
                        if (linearLayout.getChildCount() == 0) {
                            linearLayout.addView(a2);
                        } else {
                            linearLayout.addView(a2, linearLayout.getChildCount() - 1);
                            linearLayout.addView(e(), linearLayout.getChildCount() - 1);
                        }
                    }
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.text.view.TextStickerView");
                    MethodCollector.o(7108);
                    throw nullPointerException;
                }
            }
            a(this.f88069g + 1);
            MethodCollector.o(7108);
            return linearLayout;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        MethodCollector.o(7108);
        throw nullPointerException2;
    }

    public static final /* synthetic */ EditPageQaStickerViewModel a(a aVar) {
        EditPageQaStickerViewModel editPageQaStickerViewModel = aVar.p;
        if (editPageQaStickerViewModel == null) {
            l.a("qaStickerViewModel");
        }
        return editPageQaStickerViewModel;
    }

    static final class c extends h.f.b.m implements h.f.a.b<k, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(83442);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(k kVar) {
            boolean z;
            Boolean bool;
            k kVar2 = kVar;
            a aVar = this.this$0;
            if (kVar2 == null || (bool = (Boolean) kVar2.a()) == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            aVar.q = z;
            return z.f158842a;
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f127202a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f127203b;

        static {
            Covode.recordClassIndex(83441);
        }

        b(a aVar, boolean z) {
            this.f127202a = aVar;
            this.f127203b = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
            if (r11 == null) goto L_0x0077;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r19) {
            /*
            // Method dump skipped, instructions count: 165
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.a.b.onClick(android.view.View):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view, com.ss.android.ugc.aweme.editSticker.a.k kVar) {
        super(view, kVar);
        l.d(view, "");
        Context context = this.f88067e;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((e) context).a(EditTextStickerViewModel.class);
        l.b(a2, "");
        this.o = (EditTextStickerViewModel) a2;
        Context context2 = this.f88067e;
        Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = t.a((e) context2).a(EditPageQaStickerViewModel.class);
        l.b(a3, "");
        this.p = (EditPageQaStickerViewModel) a3;
        JediViewModel a4 = t.a((e) this.f88067e).a(EditCommentStickerViewModel.class);
        l.b(a4, "");
        EditCommentStickerViewModel editCommentStickerViewModel = (EditCommentStickerViewModel) a4;
        this.t = editCommentStickerViewModel;
        if (editCommentStickerViewModel == null) {
            l.a("commentStickerViewModel");
        }
        f.a.b.b unused = editCommentStickerViewModel.b((androidx.lifecycle.m) this.f88067e, b.f127204a, new ah(), new c(this));
    }
}
