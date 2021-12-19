package com.ss.android.ugc.aweme.shoutouts.review.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class d extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final h f133482a;

    /* renamed from: b  reason: collision with root package name */
    private final h f133483b;

    /* renamed from: c  reason: collision with root package name */
    private final h f133484c;

    static {
        Covode.recordClassIndex(87295);
    }

    private final ShoutoutsReviewHeaderDescription getHeaderDescription() {
        return (ShoutoutsReviewHeaderDescription) this.f133483b.getValue();
    }

    public final ShoutoutsReviewHeaderSteps getHeaderSteps() {
        return (ShoutoutsReviewHeaderSteps) this.f133484c.getValue();
    }

    public final ShoutoutsReviewHeaderTop getHeaderTop() {
        return (ShoutoutsReviewHeaderTop) this.f133482a.getValue();
    }

    static final class a extends m implements h.f.a.a<ShoutoutsReviewHeaderDescription> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(87296);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ShoutoutsReviewHeaderDescription invoke() {
            return this.this$0.findViewById(R.id.akm);
        }
    }

    static final class b extends m implements h.f.a.a<ShoutoutsReviewHeaderSteps> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(87297);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ShoutoutsReviewHeaderSteps invoke() {
            return this.this$0.findViewById(R.id.ea7);
        }
    }

    static final class c extends m implements h.f.a.a<ShoutoutsReviewHeaderTop> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(87298);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ShoutoutsReviewHeaderTop invoke() {
            return this.this$0.findViewById(R.id.bf1);
        }
    }

    public final void setDescription(String str) {
        l.d(str, "");
        getHeaderDescription().setDescription(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(2403);
        com.a.a(LayoutInflater.from(context), R.layout.b0v, this, true);
        this.f133482a = i.a((h.f.a.a) new c(this));
        this.f133483b = i.a((h.f.a.a) new a(this));
        this.f133484c = i.a((h.f.a.a) new b(this));
        MethodCollector.o(2403);
    }

    public /* synthetic */ d(Context context, byte b2) {
        this(context);
    }

    public final void a(float f2, long j2) {
        getHeaderTop().a(f2, j2);
    }
}
