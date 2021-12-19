package com.ss.android.ugc.aweme.duet.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.NoSuchElementException;

public final class f implements e {

    /* renamed from: b  reason: collision with root package name */
    public final Context f84158b;

    /* renamed from: c  reason: collision with root package name */
    public final h.f.a.a<String> f84159c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteImageView f84160d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f84161e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f84162f;

    /* renamed from: g  reason: collision with root package name */
    private ViewGroup f84163g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f84164h;

    /* renamed from: i  reason: collision with root package name */
    private View f84165i;

    public enum a {
        UNKNOWN_REMIND_TYPE(-1),
        REMIND_SELF_SEE(R.string.bdx),
        REMIND_FRIEND_SEE(R.string.bdw),
        REMIND_ANYONE_SEE(R.string.bdv),
        REMIND_DUET_NOT_ALLOWED(R.string.be7),
        REMIND_SOUND_NOT_READY(R.string.a9r);
        
        public static final C2010a Companion = new C2010a((byte) 0);
        private final int textId;

        /* renamed from: com.ss.android.ugc.aweme.duet.ui.f$a$a  reason: collision with other inner class name */
        public static final class C2010a {
            static {
                Covode.recordClassIndex(52478);
            }

            private C2010a() {
            }

            public /* synthetic */ C2010a(byte b2) {
                this();
            }

            public static a a(Integer num) {
                if (num == null) {
                    return null;
                }
                num.intValue();
                a[] values = a.values();
                for (a aVar : values) {
                    if (aVar.ordinal() == num.intValue()) {
                        return aVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        public final int getTextId() {
            return this.textId;
        }

        static {
            Covode.recordClassIndex(52477);
        }

        private a(int i2) {
            this.textId = i2;
        }
    }

    static {
        Covode.recordClassIndex(52476);
    }

    public static final class c extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f84168a;

        static {
            Covode.recordClassIndex(52480);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(500);
            this.f84168a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            new g(this.f84168a.f84158b).show();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f84167a;

        static {
            Covode.recordClassIndex(52479);
        }

        b(f fVar) {
            this.f84167a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f84167a.f84158b, "//aweme/detail").withParam("id", this.f84167a.f84159c.invoke()).withParam("isChain", false).open();
        }
    }

    @Override // com.ss.android.ugc.aweme.duet.ui.e
    public final void a(View view) {
        l.d(view, "");
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bf9);
        if (viewGroup != null) {
            View a2 = com.a.a(LayoutInflater.from(this.f84158b), R.layout.b40, viewGroup, true);
            this.f84160d = (RemoteImageView) a2.findViewById(R.id.aqb);
            this.f84161e = (TextView) a2.findViewById(R.id.ar1);
            this.f84162f = (TextView) a2.findViewById(R.id.ar2);
            this.f84163g = (ViewGroup) a2.findViewById(R.id.cf6);
            this.f84164h = (TextView) a2.findViewById(R.id.eyu);
            this.f84165i = a2.findViewById(R.id.aq7);
        }
    }

    @Override // com.ss.android.ugc.aweme.duet.ui.e
    public final void a(com.ss.android.ugc.aweme.duet.a.c cVar) {
        l.d(cVar, "");
        e.a(this.f84160d, cVar.f84126c);
        TextView textView = this.f84161e;
        if (textView != null) {
            textView.setText(cVar.f84124a);
        }
        TextView textView2 = this.f84162f;
        if (textView2 != null) {
            textView2.setText(cVar.f84125b + " ");
        }
        a a2 = a.C2010a.a(cVar.f84128e);
        if (a2 != null) {
            int i2 = 8;
            if (a2 == a.UNKNOWN_REMIND_TYPE) {
                ViewGroup viewGroup = this.f84163g;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
            } else {
                ViewGroup viewGroup2 = this.f84163g;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                TextView textView3 = this.f84164h;
                if (textView3 != null) {
                    textView3.setText(this.f84158b.getString(a2.getTextId()));
                }
                View view = this.f84165i;
                if (view != null) {
                    if (a2 == a.REMIND_SELF_SEE || a2 == a.REMIND_FRIEND_SEE || a2 == a.REMIND_ANYONE_SEE) {
                        i2 = 0;
                    }
                    view.setVisibility(i2);
                }
            }
        }
        RemoteImageView remoteImageView = this.f84160d;
        if (remoteImageView != null) {
            remoteImageView.setOnClickListener(new b(this));
        }
        View view2 = this.f84165i;
        if (view2 != null) {
            view2.setOnClickListener(new c(this));
        }
    }

    public f(Context context, h.f.a.a<String> aVar) {
        l.d(context, "");
        l.d(aVar, "");
        this.f84158b = context;
        this.f84159c = aVar;
    }
}
