package com.ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.t;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.editSticker.interact.e;
import com.ss.android.ugc.aweme.editSticker.interact.view.k;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.ss.android.ugc.tools.utils.r;
import h.f.b.l;
import h.f.b.m;
import java.util.Objects;

public final class w extends j implements e {

    /* renamed from: c  reason: collision with root package name */
    public static final a f147338c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    k f147339b;

    /* renamed from: d  reason: collision with root package name */
    private EditStickerViewModel f147340d;

    static {
        Covode.recordClassIndex(97096);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97097);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.e
    public final void b() {
        k kVar = this.f147339b;
        if (kVar == null) {
            l.a("deleteView");
        }
        kVar.b();
    }

    static final class b extends m implements h.f.a.a<Rect> {
        final /* synthetic */ w this$0;

        static {
            Covode.recordClassIndex(97098);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(w wVar) {
            super(0);
            this.this$0 = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Rect invoke() {
            k kVar = this.this$0.f147339b;
            if (kVar == null) {
                l.a("deleteView");
            }
            Rect deleteRect = kVar.getDeleteRect();
            l.b(deleteRect, "");
            return deleteRect;
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.e
    public final void a() {
        k kVar = this.f147339b;
        if (kVar == null) {
            l.a("deleteView");
        }
        kVar.a();
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((androidx.fragment.app.e) activity).a(EditStickerViewModel.class);
        l.b(a2, "");
        EditStickerViewModel editStickerViewModel = (EditStickerViewModel) a2;
        this.f147340d = editStickerViewModel;
        if (editStickerViewModel == null) {
            l.a("stickerViewModel");
        }
        editStickerViewModel.f146394b = new b(this);
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        k kVar;
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        Context context = viewGroup.getContext();
        if (context == null) {
            kVar = null;
        } else {
            kVar = new k(context);
            int a2 = (int) r.a(context, 72.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
            layoutParams.topMargin = dh.c(context);
            kVar.setLayoutParams(layoutParams);
            layoutParams.gravity = 49;
            kVar.setLayoutParams(layoutParams);
        }
        l.b(kVar, "");
        this.f147339b = kVar;
        if (kVar == null) {
            l.a("deleteView");
        }
        return kVar;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.e
    public final int a(int i2, int i3, boolean z, boolean z2) {
        k kVar = this.f147339b;
        if (kVar == null) {
            l.a("deleteView");
        }
        return kVar.a(i2, i3, z, z2);
    }
}
