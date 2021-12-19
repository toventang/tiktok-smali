package com.ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.util.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class CommentMultiAnchorTagLayout extends FrameLayout {

    /* renamed from: g  reason: collision with root package name */
    public static final a f71696g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.barrage.a.d f71697a;

    /* renamed from: b  reason: collision with root package name */
    public final TuxTextView f71698b;

    /* renamed from: c  reason: collision with root package name */
    public final TuxIconView f71699c;

    /* renamed from: d  reason: collision with root package name */
    public final AnchorsFlowLayout f71700d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f71701e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.barrage.c f71702f;

    static {
        Covode.recordClassIndex(44099);
    }

    public CommentMultiAnchorTagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44100);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final AnchorsFlowLayout getFlowView() {
        return this.f71700d;
    }

    public final void a() {
        b(this.f71701e);
        a(this.f71701e);
        boolean z = !this.f71701e;
        this.f71701e = z;
        com.ss.android.ugc.aweme.comment.barrage.c cVar = this.f71702f;
        if (cVar != null) {
            cVar.setAnchorsFold(z);
        }
    }

    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentMultiAnchorTagLayout f71703a;

        static {
            Covode.recordClassIndex(44101);
        }

        public final void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver = this.f71703a.f71700d.getViewTreeObserver();
            if (this.f71703a.f71700d.getWidth() != 0) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                i.a("CommentMultiAnchorTag", " flow.finalLines: " + this.f71703a.f71700d.getFinalLines() + "  childViewCount " + this.f71703a.f71700d.getChildCount() + "  flow.firstLineCount " + this.f71703a.f71700d.getFirstLineCount());
                if (this.f71703a.f71700d.getChildCount() > this.f71703a.f71700d.getFirstLineCount()) {
                    i.a.a.a.a.b.c(this.f71703a.f71698b);
                    CommentMultiAnchorTagLayout commentMultiAnchorTagLayout = this.f71703a;
                    commentMultiAnchorTagLayout.a(!commentMultiAnchorTagLayout.f71701e);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b(CommentMultiAnchorTagLayout commentMultiAnchorTagLayout) {
            this.f71703a = commentMultiAnchorTagLayout;
        }
    }

    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentMultiAnchorTagLayout f71704a;

        static {
            Covode.recordClassIndex(44102);
        }

        public c(CommentMultiAnchorTagLayout commentMultiAnchorTagLayout) {
            this.f71704a = commentMultiAnchorTagLayout;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f71704a.a();
        }
    }

    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentMultiAnchorTagLayout f71705a;

        static {
            Covode.recordClassIndex(44103);
        }

        public d(CommentMultiAnchorTagLayout commentMultiAnchorTagLayout) {
            this.f71705a = commentMultiAnchorTagLayout;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f71705a.a();
        }
    }

    public final void b(boolean z) {
        if (z) {
            this.f71700d.setMaxTagLines(100);
        } else {
            this.f71700d.setMaxTagLines(1);
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.f71698b.setText(getContext().getString(R.string.ajo));
            i.a.a.a.a.b.a(this.f71699c);
            return;
        }
        i.a.a.a.a.b.c(this.f71699c);
        this.f71698b.setText("+" + (this.f71700d.getChildCount() - this.f71700d.getFirstLineCount()) + ' ' + getContext().getString(R.string.d5u));
    }

    private /* synthetic */ CommentMultiAnchorTagLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommentMultiAnchorTagLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(919);
        this.f71697a = new com.ss.android.ugc.aweme.comment.barrage.a.a();
        this.f71701e = true;
        FrameLayout.inflate(context, R.layout.jf, this);
        View findViewById = findViewById(R.id.ehu);
        l.b(findViewById, "");
        AnchorsFlowLayout anchorsFlowLayout = (AnchorsFlowLayout) findViewById;
        this.f71700d = anchorsFlowLayout;
        anchorsFlowLayout.setGravity(-1);
        anchorsFlowLayout.setMaxTagLines(1);
        View findViewById2 = findViewById(R.id.ayp);
        l.b(findViewById2, "");
        this.f71698b = (TuxTextView) findViewById2;
        View findViewById3 = findViewById(R.id.ayo);
        l.b(findViewById3, "");
        this.f71699c = (TuxIconView) findViewById3;
        MethodCollector.o(919);
    }
}
