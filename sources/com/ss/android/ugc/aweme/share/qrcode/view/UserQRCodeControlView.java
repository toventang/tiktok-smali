package com.ss.android.ugc.aweme.share.qrcode.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.c.c.az;
import com.ss.android.ugc.aweme.share.improve.e.a;
import com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelBar;
import com.ss.android.ugc.aweme.sharer.ui.bar.f;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.List;

public final class UserQRCodeControlView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public a f124228a;

    /* renamed from: b  reason: collision with root package name */
    private View f124229b;

    /* renamed from: c  reason: collision with root package name */
    private View f124230c;

    /* renamed from: d  reason: collision with root package name */
    private ShareChannelBar f124231d;

    public interface a {
        static {
            Covode.recordClassIndex(81593);
        }

        void a(View view);

        void a(com.ss.android.ugc.aweme.sharer.b bVar);

        void b(View view);
    }

    static {
        Covode.recordClassIndex(81589);
    }

    public UserQRCodeControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final void a() {
        ShareChannelBar shareChannelBar = this.f124231d;
        if (shareChannelBar != null) {
            Context context = getContext();
            l.b(context, "");
            List<com.ss.android.ugc.aweme.sharer.b> a2 = a.C3219a.a(com.ss.android.ugc.aweme.share.improve.c.b.a(context));
            a2.add(new com.ss.android.ugc.aweme.share.qrcode.a.a());
            az a3 = az.a(new com.ss.android.ugc.aweme.share.improve.f.d());
            n.a((List) a2, (h.f.a.b) new b(this));
            ArrayList arrayList = new ArrayList();
            for (T t : a2) {
                T t2 = t;
                if (a.C3219a.a().isEmpty() || l.a((Object) t2.a(), (Object) "qr_code_save") || a.C3219a.a().contains(t2.a())) {
                    arrayList.add(t);
                }
            }
            List<? extends com.ss.android.ugc.aweme.sharer.b> a4 = a3.a(arrayList);
            l.b(a4, "");
            shareChannelBar.a(a4);
            shareChannelBar.a(new c(this));
        }
    }

    public static final class c implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UserQRCodeControlView f124235a;

        static {
            Covode.recordClassIndex(81595);
        }

        c(UserQRCodeControlView userQRCodeControlView) {
            this.f124235a = userQRCodeControlView;
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.bar.f
        public final void a_(com.ss.android.ugc.aweme.sharer.b bVar) {
            l.d(bVar, "");
            a aVar = this.f124235a.f124228a;
            if (aVar != null) {
                aVar.a(bVar);
            }
        }
    }

    public final void setCallback(a aVar) {
        l.d(aVar, "");
        this.f124228a = aVar;
    }

    private static /* synthetic */ void a(View view) {
        view.setOnTouchListener(new d());
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.sharer.b, Boolean> {
        final /* synthetic */ UserQRCodeControlView this$0;

        static {
            Covode.recordClassIndex(81594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(UserQRCodeControlView userQRCodeControlView) {
            super(1);
            this.this$0 = userQRCodeControlView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sharer.b bVar) {
            com.ss.android.ugc.aweme.sharer.b bVar2 = bVar;
            l.d(bVar2, "");
            Context context = this.this$0.getContext();
            l.b(context, "");
            return Boolean.valueOf(!bVar2.b(context));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f124236a = 0.75f;

        static {
            Covode.recordClassIndex(81596);
        }

        d() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l.b(motionEvent, "");
            int action = motionEvent.getAction();
            if (action == 0) {
                l.b(view, "");
                view.setAlpha(this.f124236a);
                return false;
            } else if (action != 1 && action != 3) {
                return false;
            } else {
                l.b(view, "");
                view.setAlpha(1.0f);
                return false;
            }
        }
    }

    private /* synthetic */ UserQRCodeControlView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private UserQRCodeControlView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(11126);
        int a2 = com.ss.android.ugc.aweme.share.f.c.a();
        if (a2 == 0) {
            com.a.a(LayoutInflater.from(context), R.layout.b06, this, true);
            this.f124229b = findViewById(R.id.cg5);
            this.f124230c = findViewById(R.id.cg6);
        } else if (a2 == 1) {
            com.a.a(LayoutInflater.from(context), R.layout.b07, this, true);
            this.f124229b = findViewById(R.id.cg5);
            this.f124230c = findViewById(R.id.cg6);
            View view = this.f124229b;
            if (view != null) {
                a(view);
            }
            View view2 = this.f124230c;
            if (view2 != null) {
                a(view2);
            }
        } else if (a2 == 2) {
            com.a.a(LayoutInflater.from(context), R.layout.b08, this, true);
            this.f124230c = findViewById(R.id.cg6);
        } else if (a2 == 3) {
            com.a.a(LayoutInflater.from(context), R.layout.b09, this, true);
            View findViewById = findViewById(R.id.cg6);
            this.f124230c = findViewById;
            if (findViewById != null) {
                a(findViewById);
            }
        } else if (a2 != 4) {
            setVisibility(8);
        } else {
            com.a.a(LayoutInflater.from(context), R.layout.b0_, this, true);
            this.f124231d = (ShareChannelBar) findViewById(R.id.fds);
            findViewById(R.id.e2b).setOnClickListener(AnonymousClass1.f124232a);
        }
        View view3 = this.f124229b;
        if (view3 != null) {
            view3.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.share.qrcode.view.UserQRCodeControlView.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ UserQRCodeControlView f124233a;

                static {
                    Covode.recordClassIndex(81591);
                }

                {
                    this.f124233a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    a aVar = this.f124233a.f124228a;
                    if (aVar != null) {
                        l.b(view, "");
                        aVar.a(view);
                    }
                }
            });
        }
        View view4 = this.f124230c;
        if (view4 != null) {
            view4.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.share.qrcode.view.UserQRCodeControlView.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ UserQRCodeControlView f124234a;

                static {
                    Covode.recordClassIndex(81592);
                }

                {
                    this.f124234a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    a aVar = this.f124234a.f124228a;
                    if (aVar != null) {
                        l.b(view, "");
                        aVar.b(view);
                    }
                }
            });
        }
        a();
        MethodCollector.o(11126);
    }
}
