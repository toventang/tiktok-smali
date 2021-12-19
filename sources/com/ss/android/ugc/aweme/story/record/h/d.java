package com.ss.android.ugc.aweme.story.record.h;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.t;
import com.bytedance.o.f;
import com.bytedance.scene.j;
import com.bytedance.tux.h.g;
import com.ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel;
import com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;

public final class d extends j implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f138342a = {new y(d.class, "recordContext", "getRecordContext()Lcom/ss/android/ugc/aweme/story/record/model/StoryRecordContext;", 0)};
    public static final a v = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public StoryRecordLayout.c f138343b;

    /* renamed from: c  reason: collision with root package name */
    final h.h.d f138344c = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.story.record.f.a.class);

    /* renamed from: d  reason: collision with root package name */
    final h f138345d = h.i.a((h.f.a.a) new C3647d(this));

    /* renamed from: e  reason: collision with root package name */
    RectF f138346e;

    /* renamed from: f  reason: collision with root package name */
    View f138347f;

    /* renamed from: g  reason: collision with root package name */
    View f138348g;

    /* renamed from: h  reason: collision with root package name */
    View f138349h;

    /* renamed from: i  reason: collision with root package name */
    StoryRecordLayout f138350i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f138351j;

    /* renamed from: k  reason: collision with root package name */
    TextView f138352k;

    /* renamed from: l  reason: collision with root package name */
    TextView f138353l;
    public boolean t;
    public boolean u;
    private final h w = h.i.a((h.f.a.a) new e(this));
    private final View.OnTouchListener x = new b(this);
    private final f y;

    static {
        Covode.recordClassIndex(90491);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90492);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.y;
    }

    public static final class c implements StoryRecordLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f138355a;

        static {
            Covode.recordClassIndex(90494);
        }

        @Override // com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout.c
        public final void b() {
            StoryRecordLayout.c cVar = this.f138355a.f138343b;
            if (cVar != null) {
                cVar.b();
            }
        }

        @Override // com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout.c
        public final void c() {
            StoryRecordLayout.c cVar = this.f138355a.f138343b;
            if (cVar != null) {
                cVar.c();
            }
        }

        @Override // com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout.c
        public final void a() {
            StoryRecordLayout.c cVar = this.f138355a.f138343b;
            if (cVar != null) {
                cVar.a();
            }
            if (com.ss.android.ugc.aweme.story.record.c.b.f138191a) {
                d dVar = this.f138355a;
                View view = dVar.f138347f;
                if (view == null) {
                    l.a("lockLayout");
                }
                view.setVisibility(0);
                View view2 = dVar.f138347f;
                if (view2 == null) {
                    l.a("lockLayout");
                }
                d.a(view2, 200);
                TextView textView = dVar.f138351j;
                if (textView == null) {
                    l.a("iDleHint");
                }
                d.a(textView);
                TextView textView2 = dVar.f138352k;
                if (textView2 == null) {
                    l.a("dragLeftHint");
                }
                textView2.setVisibility(0);
                TextView textView3 = dVar.f138352k;
                if (textView3 == null) {
                    l.a("dragLeftHint");
                }
                d.a(textView3, 300);
                return;
            }
            TextView textView4 = this.f138355a.f138351j;
            if (textView4 == null) {
                l.a("iDleHint");
            }
            d.a(textView4);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(d dVar) {
            this.f138355a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout.c
        public final void a(float f2, float f3) {
            StoryRecordLayout.c cVar = this.f138355a.f138343b;
            if (cVar != null) {
                cVar.a(f2, f3);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.h.d$d  reason: collision with other inner class name */
    static final class C3647d extends m implements h.f.a.a<StoryRecordBaseViewModel> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(90495);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3647d(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryRecordBaseViewModel invoke() {
            JediViewModel a2 = t.a(com.bytedance.scene.ktx.c.b(this.this$0)).a(StoryRecordBaseViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    static final class e extends m implements h.f.a.a<g> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(90496);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            Context s = this.this$0.s();
            l.b(s, "");
            return new g(s);
        }
    }

    static void a(View view) {
        if (view.getAlpha() < 1.0f) {
            view.setAlpha(1.0f);
        }
        view.animate().alpha(0.0f).setDuration(300).start();
    }

    public d(f fVar) {
        l.d(fVar, "");
        this.y = fVar;
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        int i2;
        int i3;
        StoryRecordLayout.b bVar;
        int i4;
        super.a(bundle);
        View c2 = c(R.id.cil);
        l.b(c2, "");
        this.f138347f = c2;
        View c3 = c(R.id.fc3);
        l.b(c3, "");
        this.f138348g = c3;
        if (c3 == null) {
            l.a("unLockIcon");
        }
        if (com.ss.android.ugc.aweme.tools.c.a(s())) {
            i2 = R.drawable.bkv;
        } else {
            i2 = R.drawable.bku;
        }
        c3.setBackgroundResource(i2);
        View c4 = c(R.id.cin);
        l.b(c4, "");
        this.f138349h = c4;
        View c5 = c(R.id.dj1);
        l.b(c5, "");
        this.f138350i = (StoryRecordLayout) c5;
        View c6 = c(R.id.bjv);
        l.b(c6, "");
        this.f138351j = (TextView) c6;
        View c7 = c(R.id.app);
        l.b(c7, "");
        TextView textView = (TextView) c7;
        this.f138352k = textView;
        if (textView == null) {
            l.a("dragLeftHint");
        }
        Context s = s();
        if (com.ss.android.ugc.aweme.tools.c.a(s())) {
            i3 = R.string.g8q;
        } else {
            i3 = R.string.g8p;
        }
        textView.setText(s.getText(i3));
        View c8 = c(R.id.dkj);
        l.b(c8, "");
        this.f138353l = (TextView) c8;
        StoryRecordLayout storyRecordLayout = this.f138350i;
        if (storyRecordLayout == null) {
            l.a("recordLayout");
        }
        storyRecordLayout.setListener(new c(this));
        StoryRecordLayout storyRecordLayout2 = this.f138350i;
        if (storyRecordLayout2 == null) {
            l.a("recordLayout");
        }
        if (com.ss.android.ugc.aweme.story.record.c.c.f138193a == 1) {
            bVar = StoryRecordLayout.b.RECORD_LAYOUT_MODE_2;
        } else {
            bVar = StoryRecordLayout.b.RECORD_LAYOUT_MODE_1;
        }
        storyRecordLayout2.setMode(bVar);
        StoryRecordLayout storyRecordLayout3 = this.f138350i;
        if (storyRecordLayout3 == null) {
            l.a("recordLayout");
        }
        storyRecordLayout3.setOnTouchListener(this.x);
        TextView textView2 = this.f138351j;
        if (textView2 == null) {
            l.a("iDleHint");
        }
        Context s2 = s();
        if (com.ss.android.ugc.aweme.story.record.c.c.f138193a == 0) {
            i4 = R.string.g8t;
        } else {
            i4 = R.string.g8s;
        }
        textView2.setText(s2.getText(i4));
    }

    public final void a(boolean z) {
        if (z) {
            View view = this.f138348g;
            if (view == null) {
                l.a("unLockIcon");
            }
            view.animate().alpha(0.0f).setDuration(200).start();
            View view2 = this.f138349h;
            if (view2 == null) {
                l.a("lockedIcon");
            }
            view2.setVisibility(0);
            view2.setScaleX(0.0f);
            view2.setScaleY(0.0f);
            view2.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300).setStartDelay(200).start();
            TextView textView = this.f138353l;
            if (textView == null) {
                l.a("releaseHint");
            }
            textView.setVisibility(0);
            TextView textView2 = this.f138353l;
            if (textView2 == null) {
                l.a("releaseHint");
            }
            a(textView2, 300);
            TextView textView3 = this.f138352k;
            if (textView3 == null) {
                l.a("dragLeftHint");
            }
            a(textView3);
            if (Build.VERSION.SDK_INT >= 29) {
                ((g) this.w.getValue()).b();
                return;
            }
            Context s = s();
            l.b(s, "");
            new g(s).a();
            return;
        }
        View view3 = this.f138349h;
        if (view3 == null) {
            l.a("lockedIcon");
        }
        view3.animate().scaleY(0.0f).scaleX(0.0f).setDuration(300).start();
        View view4 = this.f138348g;
        if (view4 == null) {
            l.a("unLockIcon");
        }
        view4.animate().alpha(1.0f).setDuration(200).setStartDelay(300).start();
        TextView textView4 = this.f138353l;
        if (textView4 == null) {
            l.a("releaseHint");
        }
        a(textView4);
        TextView textView5 = this.f138352k;
        if (textView5 == null) {
            l.a("dragLeftHint");
        }
        a(textView5, 300);
    }

    static void a(View view, long j2) {
        if (view.getAlpha() > 0.0f) {
            view.setAlpha(0.0f);
        }
        view.animate().alpha(1.0f).setDuration(j2).start();
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.b2y, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    static final class b implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f138354a;

        static {
            Covode.recordClassIndex(90493);
        }

        b(d dVar) {
            this.f138354a = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r2 != 3) goto L_0x0019;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouch(android.view.View r17, android.view.MotionEvent r18) {
            /*
            // Method dump skipped, instructions count: 391
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.record.h.d.b.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }
}
