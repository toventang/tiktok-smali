package com.ss.android.ugc.aweme.discover.mixfeed.d;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.e.q;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.discover.a.at;
import com.ss.android.ugc.aweme.discover.a.w;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.k.bj;
import com.ss.android.ugc.aweme.search.k.bk;
import com.ss.android.ugc.aweme.search.k.bl;
import com.ss.android.ugc.aweme.search.k.p;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.search.n.d;
import com.ss.android.ugc.aweme.utils.by;
import com.ss.android.ugc.aweme.utils.iv;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.Iterator;
import java.util.List;

public final class f extends RecyclerView.ViewHolder implements p {

    /* renamed from: i  reason: collision with root package name */
    public static final a f81730i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h f81731a = i.a((h.f.a.a) new C1913f(this));

    /* renamed from: b  reason: collision with root package name */
    int f81732b;

    /* renamed from: c  reason: collision with root package name */
    int f81733c;

    /* renamed from: d  reason: collision with root package name */
    int f81734d;

    /* renamed from: e  reason: collision with root package name */
    int f81735e;

    /* renamed from: f  reason: collision with root package name */
    public r f81736f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.search.model.d f81737g;

    /* renamed from: h  reason: collision with root package name */
    public final View f81738h;

    /* renamed from: j  reason: collision with root package name */
    private final h f81739j = i.a((h.f.a.a) new g(this));

    /* renamed from: k  reason: collision with root package name */
    private final h f81740k = i.a((h.f.a.a) new c(this));

    /* renamed from: l  reason: collision with root package name */
    private com.ss.android.ugc.aweme.discover.mixfeed.h f81741l;

    static {
        Covode.recordClassIndex(50775);
    }

    /* access modifiers changed from: package-private */
    public final LinearLayout a() {
        return (LinearLayout) this.f81739j.getValue();
    }

    public final Context b() {
        return (Context) this.f81740k.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50776);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.android.ugc.aweme.discover.mixfeed.h $data;
        final /* synthetic */ com.ss.android.ugc.aweme.search.model.d $param;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(50777);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, com.ss.android.ugc.aweme.discover.mixfeed.h hVar, com.ss.android.ugc.aweme.search.model.d dVar) {
            super(0);
            this.this$0 = fVar;
            this.$data = hVar;
            this.$param = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f81738h.post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.discover.mixfeed.d.f.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f81742a;

                static {
                    Covode.recordClassIndex(50778);
                }

                {
                    this.f81742a = r1;
                }

                public final void run() {
                    boolean z;
                    int i2;
                    int i3;
                    String str;
                    int i4;
                    String str2;
                    String str3;
                    com.facebook.drawee.f.a a2;
                    MethodCollector.i(3956);
                    f fVar = this.f81742a.this$0;
                    com.ss.android.ugc.aweme.discover.mixfeed.h hVar = this.f81742a.$data;
                    LinearLayout a3 = fVar.a();
                    l.b(a3, "");
                    int childCount = a3.getChildCount();
                    if (childCount > 1) {
                        fVar.f81735e = 0;
                        fVar.a().removeViews(1, childCount - 1);
                    }
                    boolean a4 = w.a();
                    if (c.a() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (at.a()) {
                        i2 = 10;
                    } else {
                        i2 = 16;
                    }
                    int a5 = (int) by.a(i2);
                    int i5 = 8;
                    if (a4) {
                        fVar.a().setPadding(0, a5, 0, 0);
                    } else {
                        int i6 = b.f81717a;
                        fVar.a().setPadding(i6, a5, i6, (int) by.a(8));
                    }
                    LinearLayout a6 = fVar.a();
                    l.b(a6, "");
                    int height = a6.getHeight();
                    LinearLayout a7 = fVar.a();
                    l.b(a7, "");
                    int paddingTop = height - a7.getPaddingTop();
                    LinearLayout a8 = fVar.a();
                    l.b(a8, "");
                    int paddingBottom = paddingTop - a8.getPaddingBottom();
                    TextView textView = (TextView) fVar.f81731a.getValue();
                    l.b(textView, "");
                    fVar.f81732b = paddingBottom - textView.getHeight();
                    LinearLayout a9 = fVar.a();
                    l.b(a9, "");
                    int width = a9.getWidth();
                    LinearLayout a10 = fVar.a();
                    l.b(a10, "");
                    int paddingLeft = width - a10.getPaddingLeft();
                    LinearLayout a11 = fVar.a();
                    l.b(a11, "");
                    fVar.f81733c = paddingLeft - a11.getPaddingRight();
                    List<g> list = hVar.f81784f;
                    if (list != null) {
                        i3 = list.size();
                    } else {
                        i3 = 0;
                    }
                    fVar.f81734d = i3;
                    c.a();
                    List<g> list2 = hVar.f81784f;
                    if (list2 != null) {
                        Integer.valueOf(list2.size());
                    }
                    List<g> list3 = hVar.f81784f;
                    l.b(list3, "");
                    Iterator it = n.d((Iterable) list3, 5).iterator();
                    int i7 = 0;
                    while (true) {
                        String str4 = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        g gVar = (g) it.next();
                        l.b(gVar, "");
                        FrameLayout frameLayout = new FrameLayout(fVar.b());
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, b.f81718b);
                        layoutParams.topMargin = (int) by.a(i5);
                        frameLayout.setLayoutParams(layoutParams);
                        if (z) {
                            RemoteImageView remoteImageView = new RemoteImageView(fVar.b());
                            remoteImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            if (at.a()) {
                                com.facebook.drawee.f.b bVar = new com.facebook.drawee.f.b(Resources.getSystem());
                                bVar.t = com.facebook.drawee.f.e.b(by.a(2));
                                a2 = bVar.a(q.b.f47442h).a();
                            } else {
                                com.facebook.drawee.f.b bVar2 = new com.facebook.drawee.f.b(Resources.getSystem());
                                bVar2.t = com.facebook.drawee.f.e.b(by.a(4));
                                a2 = bVar2.a(q.b.f47442h).a();
                            }
                            remoteImageView.setHierarchy(a2);
                            remoteImageView.setImageURI(gVar.f81749c);
                            frameLayout.addView(remoteImageView);
                        }
                        Context b2 = fVar.b();
                        l.b(b2, "");
                        TuxTextView tuxTextView = new TuxTextView(b2, null, 0, 6);
                        tuxTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        tuxTextView.setGravity(17);
                        if (z) {
                            tuxTextView.setBackground(androidx.core.content.b.a(tuxTextView.getContext(), (int) R.drawable.bdy));
                            tuxTextView.setTextColor(-1);
                        } else {
                            tuxTextView.setBackground(androidx.core.content.b.a(tuxTextView.getContext(), (int) R.drawable.bdz));
                            tuxTextView.setTextColor(androidx.core.content.b.c(tuxTextView.getContext(), R.color.bx));
                        }
                        tuxTextView.setMaxLines(2);
                        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                        int i8 = b.f81717a;
                        tuxTextView.setPadding(i8, 0, i8, 0);
                        if (at.a()) {
                            tuxTextView.setTuxFont(62);
                        } else {
                            tuxTextView.setTuxFont(52);
                        }
                        tuxTextView.setText(gVar.f81747a);
                        frameLayout.addView(tuxTextView);
                        tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(fVar.f81733c, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if (tuxTextView.getLineCount() > 1 || fVar.f81734d <= 4) {
                            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                            layoutParams2.height = b.f81719c;
                            frameLayout.setLayoutParams(layoutParams2);
                        }
                        com.bytedance.ies.dmt.ui.f.c.a(frameLayout, 0.5f);
                        frameLayout.setOnClickListener(new d(fVar, gVar));
                        if (a.a()) {
                            frameLayout.setOnLongClickListener(new e(fVar, gVar));
                        }
                        ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                        if (!(layoutParams3 instanceof LinearLayout.LayoutParams)) {
                            layoutParams3 = null;
                        }
                        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                        if (layoutParams4 != null) {
                            i4 = layoutParams4.height + layoutParams4.topMargin + layoutParams4.bottomMargin;
                        } else {
                            i4 = 0;
                        }
                        if (fVar.f81735e + i4 <= fVar.f81732b) {
                            fVar.f81735e += i4;
                            fVar.a().addView(frameLayout);
                            Word word = gVar.f81748b;
                            if (word != null) {
                                com.ss.android.ugc.aweme.search.model.d dVar = fVar.f81737g;
                                if (dVar != null) {
                                    str2 = dVar.getKeyword();
                                } else {
                                    str2 = null;
                                }
                                r rVar = fVar.f81736f;
                                l.d(word, "");
                                if (!word.isShowed()) {
                                    bk v = new bl().v(word.getWordSource());
                                    if (rVar != null) {
                                        str3 = rVar.f121274i;
                                    } else {
                                        str3 = null;
                                    }
                                    com.ss.android.ugc.aweme.search.k.c a12 = v.a(str3);
                                    if (rVar != null) {
                                        str4 = rVar.f121275j;
                                    }
                                    ((bk) a12.d(str4)).x(str2).d(Integer.valueOf(word.getWordPosition())).w(word.getWord()).y("general").w(word.getWord()).i(word.getId()).f();
                                    word.setShowed(true);
                                }
                            }
                            i7++;
                        }
                        i5 = 8;
                    }
                    com.ss.android.ugc.aweme.search.model.d dVar2 = this.f81742a.$param;
                    if (dVar2 != null) {
                        str = dVar2.getKeyword();
                    } else {
                        str = null;
                    }
                    e.a("related_search", i7, str, null, this.f81742a.this$0.f81736f);
                    MethodCollector.o(3956);
                }
            });
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.a<Context> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(50779);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Context invoke() {
            return this.this$0.f81738h.getContext();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d.f$f  reason: collision with other inner class name */
    static final class C1913f extends m implements h.f.a.a<TextView> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(50782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1913f(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.f81738h.findViewById(R.id.f5o);
        }
    }

    static final class g extends m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(50783);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return this.this$0.f81738h.findViewById(R.id.cg_);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.k.p
    public final r F() {
        r rVar = this.f81736f;
        if (rVar == null) {
            return r.a.a();
        }
        return rVar;
    }

    @Override // com.ss.android.ugc.aweme.search.k.p
    public final void a(r rVar) {
        l.d(rVar, "");
        this.f81736f = rVar;
    }

    static final class e implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f81745a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f81746b;

        static {
            Covode.recordClassIndex(50781);
        }

        e(f fVar, g gVar) {
            this.f81745a = fVar;
            this.f81746b = gVar;
        }

        public final boolean onLongClick(View view) {
            Context b2 = this.f81745a.b();
            l.b(b2, "");
            e.a(b2, this.f81745a.f81736f, this.f81746b.f81748b, "related_search");
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(View view) {
        super(view);
        l.d(view, "");
        this.f81738h = view;
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f81743a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f81744b;

        static {
            Covode.recordClassIndex(50780);
        }

        d(f fVar, g gVar) {
            this.f81743a = fVar;
            this.f81744b = gVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            ClickAgent.onClick(view);
            Word word = this.f81744b.f81748b;
            String str4 = null;
            if (word != null) {
                com.ss.android.ugc.aweme.search.model.d dVar = this.f81743a.f81737g;
                if (dVar != null) {
                    str = dVar.getKeyword();
                } else {
                    str = null;
                }
                r rVar = this.f81743a.f81736f;
                l.d(word, "");
                bk w = ((bk) new bj().i(word.getId())).v(word.getWordSource()).d(Integer.valueOf(word.getWordPosition())).w(word.getWord());
                if (rVar != null) {
                    str2 = rVar.f121274i;
                } else {
                    str2 = null;
                }
                com.ss.android.ugc.aweme.search.k.c a2 = w.a(str2);
                if (rVar != null) {
                    str3 = rVar.f121275j;
                } else {
                    str3 = null;
                }
                ((bk) a2.d(str3)).x(str).w(word.getWord()).y("general").f();
            }
            com.ss.android.ugc.aweme.search.model.d searchFrom = new com.ss.android.ugc.aweme.search.model.d().setSearchFrom("related_search_keyword");
            r rVar2 = this.f81743a.f81736f;
            if (rVar2 != null) {
                str4 = rVar2.f121274i;
            }
            com.ss.android.ugc.aweme.search.model.d keyword = searchFrom.setLastSearchId(str4).setKeyword(this.f81744b.f81747a);
            Context b2 = this.f81743a.b();
            l.b(keyword, "");
            com.ss.android.ugc.aweme.search.g.a(b2, keyword, keyword.getSearchEnterParam(), d.a.a());
        }
    }

    public final void a(com.ss.android.ugc.aweme.discover.mixfeed.h hVar, com.ss.android.ugc.aweme.search.model.d dVar) {
        getAdapterPosition();
        hashCode();
        this.f81738h.hashCode();
        if (hVar != null) {
            List<g> list = hVar.f81784f;
            if (list != null) {
                Integer.valueOf(list.hashCode());
            }
            List<g> list2 = hVar.f81784f;
            if (list2 != null) {
                Integer.valueOf(list2.size());
            }
            this.f81741l = hVar;
            this.f81737g = dVar;
            iv.a(this.f81738h, new b(this, hVar, dVar));
        }
    }
}
