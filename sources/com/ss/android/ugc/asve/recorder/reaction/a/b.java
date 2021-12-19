package com.ss.android.ugc.asve.recorder.reaction.a;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final h f62322a;

    static {
        Covode.recordClassIndex(38293);
    }

    /* access modifiers changed from: package-private */
    public final View a() {
        return (View) this.f62322a.getValue();
    }

    static final class a extends m implements h.f.a.a<View> {
        final /* synthetic */ View $presentView;
        final /* synthetic */ com.ss.android.ugc.asve.recorder.reaction.a $reactionCtrl;
        final /* synthetic */ ViewGroup $rootView;

        static {
            Covode.recordClassIndex(38294);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(com.ss.android.ugc.asve.recorder.reaction.a aVar, ViewGroup viewGroup, View view) {
            super(0);
            this.$reactionCtrl = aVar;
            this.$rootView = viewGroup;
            this.$presentView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            MethodCollector.i(10811);
            int[] b2 = this.$reactionCtrl.b();
            if (b2 == null) {
                MethodCollector.o(10811);
                return null;
            }
            View view = new View(this.$rootView.getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = this.$presentView.getTop() + b2[0];
            layoutParams.height = (this.$presentView.getHeight() - b2[0]) - b2[1];
            layoutParams.leftMargin = this.$presentView.getLeft() + b2[2];
            layoutParams.width = (this.$presentView.getWidth() - b2[2]) - b2[3];
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(layoutParams.leftMargin);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
            layoutParams.gravity = 0;
            view.setBackgroundResource(this.$reactionCtrl.a().g());
            this.$rootView.addView(view, layoutParams);
            MethodCollector.o(10811);
            return view;
        }
    }

    public b(ViewGroup viewGroup, View view, com.ss.android.ugc.asve.recorder.reaction.a aVar) {
        l.d(viewGroup, "");
        l.d(view, "");
        l.d(aVar, "");
        this.f62322a = i.a((h.f.a.a) new a(aVar, viewGroup, view));
    }
}
