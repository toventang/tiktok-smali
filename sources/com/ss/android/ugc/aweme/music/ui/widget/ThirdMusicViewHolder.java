package com.ss.android.ugc.aweme.music.ui.widget;

import android.graphics.drawable.Animatable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.c.c;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.views.WrapContentRemoteImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;

public final class ThirdMusicViewHolder extends PowerCell<d> {

    /* renamed from: a  reason: collision with root package name */
    public WrapContentRemoteImageView f112094a;

    /* renamed from: b  reason: collision with root package name */
    private View f112095b;

    /* renamed from: j  reason: collision with root package name */
    private TuxTextView f112096j;

    /* renamed from: k  reason: collision with root package name */
    private View f112097k;

    /* renamed from: l  reason: collision with root package name */
    private Animation f112098l;

    static {
        Covode.recordClassIndex(72034);
    }

    public final void a() {
        View view = this.f112095b;
        if (view == null) {
            l.a("loading");
        }
        view.clearAnimation();
        View view2 = this.f112095b;
        if (view2 == null) {
            l.a("loading");
        }
        view2.setVisibility(8);
    }

    public static final class b extends c<f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ThirdMusicViewHolder f112101a;

        static {
            Covode.recordClassIndex(72036);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(ThirdMusicViewHolder thirdMusicViewHolder) {
            this.f112101a = thirdMusicViewHolder;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* synthetic */ void onIntermediateImageSet(String str, f fVar) {
            l.d(str, "");
            ThirdMusicViewHolder.a(this.f112101a).a(fVar);
            this.f112101a.a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
            l.d(str, "");
            ThirdMusicViewHolder.a(this.f112101a).a(fVar);
            this.f112101a.a();
        }
    }

    public static final /* synthetic */ WrapContentRemoteImageView a(ThirdMusicViewHolder thirdMusicViewHolder) {
        WrapContentRemoteImageView wrapContentRemoteImageView = thirdMusicViewHolder.f112094a;
        if (wrapContentRemoteImageView == null) {
            l.a("cover");
        }
        return wrapContentRemoteImageView;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ThirdMusicViewHolder f112099a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExternalMusicInfo f112100b;

        static {
            Covode.recordClassIndex(72035);
        }

        a(ThirdMusicViewHolder thirdMusicViewHolder, ExternalMusicInfo externalMusicInfo) {
            this.f112099a = thirdMusicViewHolder;
            this.f112100b = externalMusicInfo;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((b) d.a(this.f112099a, ab.a(b.class))).b(this.f112100b);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        MethodCollector.i(13437);
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.alh, viewGroup, false);
        View findViewById = a2.findViewById(R.id.bzx);
        l.b(findViewById, "");
        this.f112094a = (WrapContentRemoteImageView) findViewById;
        View findViewById2 = a2.findViewById(R.id.bzy);
        l.b(findViewById2, "");
        this.f112095b = findViewById2;
        View findViewById3 = a2.findViewById(R.id.bzz);
        l.b(findViewById3, "");
        this.f112096j = (TuxTextView) findViewById3;
        View findViewById4 = a2.findViewById(R.id.flj);
        l.b(findViewById4, "");
        this.f112097k = findViewById4;
        Animation loadAnimation = AnimationUtils.loadAnimation(viewGroup.getContext(), R.anim.cw);
        l.b(loadAnimation, "");
        this.f112098l = loadAnimation;
        l.b(a2, "");
        MethodCollector.o(13437);
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.music.ui.widget.d r8) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.widget.ThirdMusicViewHolder.a(com.bytedance.ies.powerlist.b.a):void");
    }
}
