package com.ss.android.ugc.aweme.find.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.ah;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.find.viewmodel.FindFriendsState;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.Iterator;
import java.util.List;

public final class FindFriendsHeaderViewHolder extends FindFriendsBaseViewHolder implements au {

    /* renamed from: c  reason: collision with root package name */
    public List<Integer> f96080c;

    /* renamed from: d  reason: collision with root package name */
    public final ViewGroup f96081d;

    /* renamed from: e  reason: collision with root package name */
    public final View f96082e;

    static {
        Covode.recordClassIndex(60866);
    }

    @Override // com.ss.android.ugc.aweme.find.viewholder.FindFriendsBaseViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final void b() {
        withState(this.f96077a, new g(this));
    }

    public final void c() {
        this.f96077a.b(101);
        com.ss.android.ugc.aweme.friends.e.a.a("find_friends_page");
    }

    public final void d() {
        this.f96077a.b(103);
        com.ss.android.ugc.aweme.friends.e.a.a("contact", this.f96077a.f96128c, com.ss.android.ugc.aweme.friends.i.a.b());
    }

    public final void e() {
        this.f96077a.b(102);
        com.ss.android.ugc.aweme.friends.e.a.a("facebook", this.f96077a.f96128c, a());
        com.ss.android.ugc.aweme.friends.e.a.d();
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindFriendsHeaderViewHolder f96084a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f96085b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f96086c;

        static {
            Covode.recordClassIndex(60869);
        }

        a(FindFriendsHeaderViewHolder findFriendsHeaderViewHolder, int i2, View view) {
            this.f96084a = findFriendsHeaderViewHolder;
            this.f96085b = i2;
            this.f96086c = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f96084a.c();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindFriendsHeaderViewHolder f96087a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f96088b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f96089c;

        static {
            Covode.recordClassIndex(60870);
        }

        b(FindFriendsHeaderViewHolder findFriendsHeaderViewHolder, int i2, View view) {
            this.f96087a = findFriendsHeaderViewHolder;
            this.f96088b = i2;
            this.f96089c = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f96087a.c();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindFriendsHeaderViewHolder f96090a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f96091b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f96092c;

        static {
            Covode.recordClassIndex(60871);
        }

        c(FindFriendsHeaderViewHolder findFriendsHeaderViewHolder, int i2, View view) {
            this.f96090a = findFriendsHeaderViewHolder;
            this.f96091b = i2;
            this.f96092c = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f96090a.d();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindFriendsHeaderViewHolder f96093a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f96094b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f96095c;

        static {
            Covode.recordClassIndex(60872);
        }

        d(FindFriendsHeaderViewHolder findFriendsHeaderViewHolder, int i2, View view) {
            this.f96093a = findFriendsHeaderViewHolder;
            this.f96094b = i2;
            this.f96095c = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f96093a.d();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindFriendsHeaderViewHolder f96096a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f96097b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f96098c;

        static {
            Covode.recordClassIndex(60873);
        }

        e(FindFriendsHeaderViewHolder findFriendsHeaderViewHolder, int i2, View view) {
            this.f96096a = findFriendsHeaderViewHolder;
            this.f96097b = i2;
            this.f96098c = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f96096a.e();
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FindFriendsHeaderViewHolder f96099a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f96100b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f96101c;

        static {
            Covode.recordClassIndex(60874);
        }

        f(FindFriendsHeaderViewHolder findFriendsHeaderViewHolder, int i2, View view) {
            this.f96099a = findFriendsHeaderViewHolder;
            this.f96100b = i2;
            this.f96101c = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f96099a.e();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FindFriendsHeaderViewHolder(android.view.ViewGroup r4) {
        /*
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131559491(0x7f0d0443, float:1.8744328E38)
            r0 = 0
            android.view.View r1 = com.a.a(r2, r1, r4, r0)
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
            r3.<init>(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.find.viewholder.FindFriendsHeaderViewHolder.<init>(android.view.ViewGroup):void");
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.b<FindFriendsState, z> {
        final /* synthetic */ FindFriendsHeaderViewHolder this$0;

        static {
            Covode.recordClassIndex(60875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(FindFriendsHeaderViewHolder findFriendsHeaderViewHolder) {
            super(1);
            this.this$0 = findFriendsHeaderViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(FindFriendsState findFriendsState) {
            FindFriendsState findFriendsState2 = findFriendsState;
            l.d(findFriendsState2, "");
            if (findFriendsState2.getChannels().size() != this.this$0.f96080c.size()) {
                this.this$0.f96080c = findFriendsState2.getChannels();
                this.this$0.b();
            }
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FindFriendsHeaderViewHolder(ViewGroup viewGroup, View view) {
        super(view);
        l.d(viewGroup, "");
        l.d(view, "");
        this.f96081d = viewGroup;
        this.f96082e = view;
        this.f96080c = h.a.z.INSTANCE;
        this.f96078b.getLifecycle().a(this);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.ss.android.ugc.aweme.find.viewholder.FindFriendsHeaderViewHolder.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FindFriendsHeaderViewHolder f96083a;

            static {
                Covode.recordClassIndex(60867);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f96083a = r1;
            }

            public final void onViewDetachedFromWindow(View view) {
                this.f96083a.f96077a.a(true);
            }

            public final void onViewAttachedToWindow(View view) {
                this.f96083a.f96077a.a(false);
                Iterator<T> it = this.f96083a.f96080c.iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (intValue == 0) {
                        com.ss.android.ugc.aweme.friends.e.a.c();
                    } else if (intValue == 1) {
                        com.ss.android.ugc.aweme.friends.e.a.b("contact", this.f96083a.f96077a.f96128c, com.ss.android.ugc.aweme.friends.i.a.b());
                    } else if (intValue == 2) {
                        com.ss.android.ugc.aweme.friends.e.a.b("facebook", this.f96083a.f96077a.f96128c, FindFriendsHeaderViewHolder.a());
                    }
                }
            }
        });
        b();
        f.a.b.b unused = selectSubscribe(this.f96077a, a.f96122a, new ah(), new h.f.a.m<com.bytedance.jedi.arch.i, List<? extends Integer>, z>(this) {
            /* class com.ss.android.ugc.aweme.find.viewholder.FindFriendsHeaderViewHolder.AnonymousClass2 */
            final /* synthetic */ FindFriendsHeaderViewHolder this$0;

            static {
                Covode.recordClassIndex(60868);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: java.util.List<? extends java.lang.Integer> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, List<? extends Integer> list) {
                MethodCollector.i(10216);
                List<? extends Integer> list2 = list;
                l.d(iVar, "");
                l.d(list2, "");
                this.this$0.f96080c = list2;
                FindFriendsHeaderViewHolder findFriendsHeaderViewHolder = this.this$0;
                ((LinearLayout) findFriendsHeaderViewHolder.f96082e.findViewById(R.id.a4n)).removeAllViews();
                Iterator<T> it = findFriendsHeaderViewHolder.f96080c.iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    View a2 = com.a.a(LayoutInflater.from(findFriendsHeaderViewHolder.f96081d.getContext()), R.layout.a2e, findFriendsHeaderViewHolder.f96081d, false);
                    l.b(a2, "");
                    View view = findFriendsHeaderViewHolder.f96082e;
                    if (intValue == 0) {
                        ((TuxIconView) a2.findViewById(R.id.bm4)).setIconRes(R.raw.icon_color_invitation_circle);
                        TuxTextView tuxTextView = (TuxTextView) a2.findViewById(R.id.title);
                        l.b(tuxTextView, "");
                        tuxTextView.setText(view.getResources().getString(R.string.coe));
                        TuxTextView tuxTextView2 = (TuxTextView) a2.findViewById(R.id.ak7);
                        l.b(tuxTextView2, "");
                        tuxTextView2.setText(view.getResources().getString(R.string.b6n));
                        TuxButton tuxButton = (TuxButton) a2.findViewById(R.id.button);
                        l.b(tuxButton, "");
                        tuxButton.setText(view.getResources().getString(R.string.coh));
                        a2.setOnClickListener(new a(findFriendsHeaderViewHolder, intValue, a2));
                        ((TuxButton) a2.findViewById(R.id.button)).setOnClickListener(new b(findFriendsHeaderViewHolder, intValue, a2));
                    } else if (intValue == 1) {
                        ((TuxIconView) a2.findViewById(R.id.bm4)).setIconRes(R.raw.icon_color_contact_circle);
                        TuxTextView tuxTextView3 = (TuxTextView) a2.findViewById(R.id.title);
                        l.b(tuxTextView3, "");
                        tuxTextView3.setText(view.getResources().getString(R.string.atq));
                        TuxTextView tuxTextView4 = (TuxTextView) a2.findViewById(R.id.ak7);
                        l.b(tuxTextView4, "");
                        tuxTextView4.setText(view.getResources().getString(R.string.ats));
                        TuxButton tuxButton2 = (TuxButton) a2.findViewById(R.id.button);
                        l.b(tuxButton2, "");
                        tuxButton2.setText(view.getResources().getString(R.string.a7v));
                        a2.setOnClickListener(new c(findFriendsHeaderViewHolder, intValue, a2));
                        ((TuxButton) a2.findViewById(R.id.button)).setOnClickListener(new d(findFriendsHeaderViewHolder, intValue, a2));
                    } else if (intValue == 2) {
                        ((TuxIconView) a2.findViewById(R.id.bm4)).setIconRes(R.raw.icon_color_facebook_circle);
                        TuxTextView tuxTextView5 = (TuxTextView) a2.findViewById(R.id.title);
                        l.b(tuxTextView5, "");
                        tuxTextView5.setText(view.getResources().getString(R.string.bt2));
                        TuxTextView tuxTextView6 = (TuxTextView) a2.findViewById(R.id.ak7);
                        l.b(tuxTextView6, "");
                        tuxTextView6.setText(view.getResources().getString(R.string.bt1));
                        TuxButton tuxButton3 = (TuxButton) a2.findViewById(R.id.button);
                        l.b(tuxButton3, "");
                        tuxButton3.setText(view.getResources().getString(R.string.a7v));
                        a2.setOnClickListener(new e(findFriendsHeaderViewHolder, intValue, a2));
                        ((TuxButton) a2.findViewById(R.id.button)).setOnClickListener(new f(findFriendsHeaderViewHolder, intValue, a2));
                    }
                    ((LinearLayout) findFriendsHeaderViewHolder.f96082e.findViewById(R.id.a4n)).addView(a2);
                }
                z zVar = z.f158842a;
                MethodCollector.o(10216);
                return zVar;
            }
        });
    }
}
