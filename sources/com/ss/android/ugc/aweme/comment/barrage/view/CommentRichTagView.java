package com.ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class CommentRichTagView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public final Context f71706a;

    /* renamed from: b  reason: collision with root package name */
    private final h f71707b;

    /* renamed from: c  reason: collision with root package name */
    private final h f71708c;

    /* renamed from: d  reason: collision with root package name */
    private final h f71709d;

    /* renamed from: e  reason: collision with root package name */
    private final h f71710e;

    static {
        Covode.recordClassIndex(44104);
    }

    public CommentRichTagView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getDescId() {
        return R.id.dn1;
    }

    public final int getImageId() {
        return R.id.dn2;
    }

    public final RelativeLayout getMContentView() {
        return (RelativeLayout) this.f71708c.getValue();
    }

    public final TuxTextView getMDescTextView() {
        return (TuxTextView) this.f71709d.getValue();
    }

    public final ImageView getMImageView() {
        return (ImageView) this.f71710e.getValue();
    }

    public final View getMRootView() {
        return (View) this.f71707b.getValue();
    }

    static final class a extends m implements h.f.a.a<RelativeLayout> {
        final /* synthetic */ CommentRichTagView this$0;

        static {
            Covode.recordClassIndex(44105);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(CommentRichTagView commentRichTagView) {
            super(0);
            this.this$0 = commentRichTagView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RelativeLayout invoke() {
            return this.this$0.getMRootView().findViewById(R.id.dn3);
        }
    }

    static final class b extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ CommentRichTagView this$0;

        static {
            Covode.recordClassIndex(44106);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CommentRichTagView commentRichTagView) {
            super(0);
            this.this$0 = commentRichTagView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.getMRootView().findViewById(R.id.dn1);
        }
    }

    static final class c extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ CommentRichTagView this$0;

        static {
            Covode.recordClassIndex(44107);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CommentRichTagView commentRichTagView) {
            super(0);
            this.this$0 = commentRichTagView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.this$0.getMRootView().findViewById(R.id.dn2);
        }
    }

    public final ViewGroup.LayoutParams getDescViewParams() {
        ViewGroup.LayoutParams layoutParams = getMDescTextView().getLayoutParams();
        l.b(layoutParams, "");
        return layoutParams;
    }

    public final ViewGroup.LayoutParams getImageViewParams() {
        ViewGroup.LayoutParams layoutParams = getMImageView().getLayoutParams();
        l.b(layoutParams, "");
        return layoutParams;
    }

    public final ViewGroup.LayoutParams getTagViewParams() {
        ViewGroup.LayoutParams layoutParams = getMContentView().getLayoutParams();
        l.b(layoutParams, "");
        return layoutParams;
    }

    static final class d extends m implements h.f.a.a<View> {
        final /* synthetic */ CommentRichTagView this$0;

        static {
            Covode.recordClassIndex(44108);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(CommentRichTagView commentRichTagView) {
            super(0);
            this.this$0 = commentRichTagView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            MethodCollector.i(631);
            View inflate = View.inflate(this.this$0.f71706a, R.layout.i6, this.this$0);
            MethodCollector.o(631);
            return inflate;
        }
    }

    private /* synthetic */ CommentRichTagView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommentRichTagView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(903);
        this.f71706a = context;
        this.f71707b = i.a((h.f.a.a) new d(this));
        this.f71708c = i.a((h.f.a.a) new a(this));
        this.f71709d = i.a((h.f.a.a) new b(this));
        this.f71710e = i.a((h.f.a.a) new c(this));
        MethodCollector.o(903);
    }
}
