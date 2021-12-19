package com.bytedance.android.livesdk.qa;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.paging.a.b;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.ac.g;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.j.ao;
import com.bytedance.android.livesdk.model.message.bj;
import com.bytedance.android.livesdk.model.message.bk;
import com.bytedance.android.livesdk.p;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;

public final class i extends com.bytedance.android.live.core.paging.a.b<af> implements OnMessageListener {

    /* renamed from: j  reason: collision with root package name */
    public Boolean f20466j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f20467k;

    /* renamed from: l  reason: collision with root package name */
    public Room f20468l;

    /* renamed from: m  reason: collision with root package name */
    public int f20469m = -1;
    public DataChannel n;
    public String o;
    at p;

    static {
        Covode.recordClassIndex(12088);
    }

    class e extends b.f {

        /* renamed from: a  reason: collision with root package name */
        public View f20483a;

        /* renamed from: c  reason: collision with root package name */
        private ViewGroup f20485c;

        /* renamed from: d  reason: collision with root package name */
        private PagingViewModel f20486d;

        static {
            Covode.recordClassIndex(12095);
        }

        @Override // com.bytedance.android.live.core.paging.a.b.f
        public final void a() {
            this.f20486d.f9211b.observeForever(new u<com.bytedance.android.live.core.e.b>() {
                /* class com.bytedance.android.livesdk.qa.i.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(12096);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(com.bytedance.android.live.core.e.b bVar) {
                    com.bytedance.android.live.core.e.b bVar2 = bVar;
                    if (bVar2 == null) {
                        return;
                    }
                    if (bVar2.a()) {
                        e.this.f20483a.setVisibility(0);
                    } else {
                        e.this.f20483a.setVisibility(8);
                    }
                }
            });
        }

        e(View view, PagingViewModel pagingViewModel) {
            super(view);
            MethodCollector.i(937);
            this.f20486d = pagingViewModel;
            this.f20485c = (ViewGroup) view.findViewById(R.id.chp);
            LiveLoadingView liveLoadingView = new LiveLoadingView(view.getContext());
            this.f20483a = liveLoadingView;
            this.f20485c.addView(liveLoadingView);
            MethodCollector.o(937);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.android.live.core.paging.a.b
    public final /* bridge */ /* synthetic */ int a(af afVar) {
        return afVar.f20351a.f19334c;
    }

    public final void b(long j2) {
        a(-1, j2);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof bk) {
            a(((bk) iMessage).f19337a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.bytedance.android.live.core.paging.a.b
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof f) {
            ((f) viewHolder).f20495h.a();
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends b.a {

        /* renamed from: a  reason: collision with root package name */
        PagingViewModel f20481a;

        static {
            Covode.recordClassIndex(12094);
        }

        @Override // com.bytedance.android.live.core.paging.a.b.a
        public final void a(boolean z) {
            this.itemView.findViewById(R.id.dmf).setOnClickListener(new j(this));
        }

        public d(View view, PagingViewModel<af> pagingViewModel) {
            super(view);
            this.f20481a = pagingViewModel;
        }
    }

    @Override // com.bytedance.android.live.core.paging.a.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        return new c(viewGroup.getContext(), com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bdm, viewGroup, false));
    }

    @Override // com.bytedance.android.live.core.paging.a.b
    public final RecyclerView.ViewHolder c(ViewGroup viewGroup) {
        return new a(viewGroup.getContext(), com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bdq, viewGroup, false));
    }

    public final void a(long j2) {
        for (af afVar : ((QuestionViewModel) ((com.bytedance.android.live.core.paging.a.b) this).f9133a).f20320j.f20334l) {
            if (afVar.f20351a.f19332a == j2) {
                a(j2, -1);
                return;
            }
        }
    }

    class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public View f20475a;

        static {
            Covode.recordClassIndex(12092);
        }

        public b(View view) {
            super(view);
            this.f20475a = view.findViewById(R.id.b_t);
        }
    }

    protected i(DataChannel dataChannel, String str) {
        super(new j.e<af>() {
            /* class com.bytedance.android.livesdk.qa.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(12089);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // androidx.recyclerview.widget.j.e
            public final /* synthetic */ boolean b(af afVar, af afVar2) {
                return afVar.equals(afVar2);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // androidx.recyclerview.widget.j.e
            public final /* bridge */ /* synthetic */ boolean a(af afVar, af afVar2) {
                af afVar3 = afVar;
                af afVar4 = afVar2;
                if (afVar3.f20351a == null || afVar4.f20351a == null || afVar3.f20351a.f19332a != afVar4.f20351a.f19332a) {
                    return false;
                }
                return true;
            }
        });
        this.n = dataChannel;
        this.o = str;
    }

    /* access modifiers changed from: package-private */
    public class f extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        bj f20488a;

        /* renamed from: b  reason: collision with root package name */
        Context f20489b;

        /* renamed from: c  reason: collision with root package name */
        View f20490c;

        /* renamed from: d  reason: collision with root package name */
        String f20491d = "QuestionVieHolder";

        /* renamed from: e  reason: collision with root package name */
        Boolean f20492e = false;

        /* renamed from: f  reason: collision with root package name */
        long f20493f;

        /* renamed from: g  reason: collision with root package name */
        boolean f20494g;

        /* renamed from: h  reason: collision with root package name */
        f.a.b.a f20495h = new f.a.b.a();

        static {
            Covode.recordClassIndex(12097);
        }

        /* access modifiers changed from: package-private */
        public final void a(User user, String str) {
            UserProfileEvent userProfileEvent = new UserProfileEvent(user);
            userProfileEvent.mReportType = "report_question";
            userProfileEvent.chatType = "3";
            userProfileEvent.msgId = this.f20488a.f19332a;
            userProfileEvent.content = this.f20488a.f19333b;
            userProfileEvent.setClickUserPosition("qa_board");
            userProfileEvent.setClickModule(str);
            com.bytedance.android.livesdk.an.a.a().a(userProfileEvent);
        }

        /* access modifiers changed from: package-private */
        public final void a(af afVar, int i2) {
            i.this.f20469m = i2;
            this.f20495h.a(((QAApi) com.bytedance.android.live.network.e.a().a(QAApi.class)).startAnswer(i.this.f20468l.getId(), this.f20488a.f19332a).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new u(this, afVar), v.f20520a));
        }

        f(Context context, View view) {
            super(view);
            this.f20489b = context;
            this.f20490c = view;
        }

        static void a(ImageView imageView, TextView textView, int i2, int i3, long j2) {
            int i4;
            imageView.setBackgroundResource(i2);
            textView.setText(aa.a(j2));
            textView.setTextColor(com.bytedance.android.live.design.b.a(textView, i3));
            if (j2 <= 0) {
                i4 = 4;
            } else {
                i4 = 0;
            }
            textView.setVisibility(i4);
        }
    }

    @Override // com.bytedance.android.live.core.paging.a.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (i2 == -1091576148) {
            return new e(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b8n, viewGroup, false), ((com.bytedance.android.live.core.paging.a.b) this).f9133a);
        }
        if (i2 == -1091576149) {
            return new d(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bdo, viewGroup, false), ((com.bytedance.android.live.core.paging.a.b) this).f9133a);
        }
        return super.a(viewGroup, i2);
    }

    @Override // com.bytedance.android.live.core.paging.a.b
    public final RecyclerView.ViewHolder b(ViewGroup viewGroup, int i2) {
        View view;
        if (i2 == 3) {
            return a(viewGroup);
        }
        if (i2 == 4) {
            return new b(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bdr, viewGroup, false));
        }
        if (this.f20466j.booleanValue() || this.f20467k) {
            view = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bdp, viewGroup, false);
        } else {
            view = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bds, viewGroup, false);
        }
        return new f(viewGroup.getContext(), view);
    }

    private void a(long j2, long j3) {
        boolean z;
        QuestionViewModel questionViewModel = (QuestionViewModel) ((com.bytedance.android.live.core.paging.a.b) this).f9133a;
        questionViewModel.a(this.f20468l, this.f20466j.booleanValue(), this.f20467k);
        androidx.h.i a2 = a();
        Iterator it = a2.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            af afVar = (af) it.next();
            bj bjVar = afVar.f20351a;
            if (!(bjVar.f19332a == j2 || bjVar.f19336e.getId() == j3)) {
                questionViewModel.f20320j.f20334l.add(afVar);
                if (afVar.f20351a.f19334c == 1) {
                    questionViewModel.f20320j.n.add(afVar);
                }
                if (afVar.f20351a.f19334c == 0 || afVar.f20351a.f19334c == 2) {
                    questionViewModel.f20320j.f20335m.add(afVar);
                }
            }
        }
        if (com.bytedance.common.utility.collection.b.a((Collection) questionViewModel.f20320j.n) && com.bytedance.common.utility.collection.b.a((Collection) questionViewModel.f20320j.f20335m)) {
            questionViewModel.f20320j.f20334l.clear();
            z = false;
        }
        a((androidx.h.i) questionViewModel.f20320j.a(a2.f3142f, z));
    }

    @Override // com.bytedance.android.live.core.paging.a.b
    public final void b(RecyclerView.ViewHolder viewHolder, int i2) {
        super.b(viewHolder, i2);
        if (viewHolder instanceof a) {
            a aVar = (a) viewHolder;
            if (i.this.f20466j.booleanValue()) {
                aVar.f20471a.setText(R.string.e16);
                TextView textView = (TextView) aVar.f20472b.findViewById(R.id.bf1);
                ViewGroup viewGroup = (ViewGroup) aVar.f20472b.findViewById(R.id.bfa);
                if (!com.bytedance.android.live.m.c.b(i.this.n)) {
                    i.this.a(aVar.f20473c, textView, viewGroup);
                    textView.setVisibility(0);
                    return;
                }
                textView.setVisibility(8);
                return;
            }
            aVar.f20471a.setText(R.string.e15);
        }
    }

    @Override // com.bytedance.android.live.core.paging.a.b
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        int i3;
        int i4;
        String str;
        int i5;
        af afVar = (af) a(i2);
        if (viewHolder instanceof f) {
            f fVar = (f) viewHolder;
            if (afVar != null && afVar.f20351a != null) {
                QuestionViewModel questionViewModel = (QuestionViewModel) ((com.bytedance.android.live.core.paging.a.b) i.this).f9133a;
                if (questionViewModel.f20320j.o != null) {
                    ViewGroup viewGroup = (ViewGroup) fVar.f20490c.findViewById(R.id.ko);
                    if (((i.this.f20466j.booleanValue() || i.this.f20467k) && i2 == 1) || (!i.this.f20466j.booleanValue() && i2 == 0)) {
                        k.a((HSImageView) fVar.f20490c.findViewById(R.id.ahq), "tiktok_live_basic_resource", "current_question.webp");
                        viewGroup.setVisibility(0);
                        i.this.f20469m = i2;
                    } else {
                        viewGroup.setVisibility(8);
                    }
                }
                fVar.f20488a = afVar.f20351a;
                TextView textView = (TextView) fVar.f20490c.findViewById(R.id.cv8);
                ImageView imageView = (ImageView) fVar.f20490c.findViewById(R.id.n5);
                TextView textView2 = (TextView) fVar.f20490c.findViewById(R.id.dfn);
                if (i.this.f20466j.booleanValue() || i.this.f20467k) {
                    ImageView imageView2 = (ImageView) fVar.f20490c.findViewById(R.id.cnk);
                    if (i.this.f20467k && fVar.f20488a.f19336e.getId() == com.bytedance.android.livesdk.userservice.u.a().b().c()) {
                        imageView2.setVisibility(8);
                    }
                    imageView2.setOnClickListener(new k(fVar, afVar));
                    if (i.this.f20469m == i2) {
                        fVar.f20490c.setBackgroundResource(R.drawable.c_5);
                    } else {
                        fVar.f20490c.setBackgroundResource(R.drawable.c_6);
                    }
                    fVar.f20490c.setOnClickListener(new l(fVar, questionViewModel, afVar, i2));
                    TextView textView3 = (TextView) fVar.f20490c.findViewById(R.id.c_v);
                    long j2 = (long) ((int) afVar.f20352b);
                    textView3.setText(textView3.getContext().getResources().getQuantityString(R.plurals.fs, (int) j2, ((p) com.bytedance.android.live.t.a.a(p.class)).formatLikeNumber(j2)));
                } else {
                    TextView textView4 = (TextView) fVar.f20490c.findViewById(R.id.c_p);
                    fVar.f20493f = afVar.f20352b;
                    textView4.setText(aa.a(fVar.f20493f));
                    if (fVar.f20493f <= 0) {
                        i5 = 4;
                    } else {
                        i5 = 0;
                    }
                    textView4.setVisibility(i5);
                    ImageView imageView3 = (ImageView) fVar.f20490c.findViewById(R.id.bfv);
                    if (afVar.f20353c == 1) {
                        imageView3.setBackgroundResource(2131234832);
                        textView4.setTextColor(com.bytedance.android.live.design.b.a(textView2, (int) R.attr.ama));
                        fVar.f20492e = true;
                    }
                    imageView3.setOnClickListener(new q(fVar, imageView3, textView4));
                    textView2.setOnLongClickListener(new r(fVar));
                }
                textView.setOnClickListener(new s(fVar));
                imageView.setOnClickListener(new t(fVar));
                textView.setText(g.a(fVar.f20488a.f19336e));
                if (fVar.f20488a.f19336e == null || fVar.f20488a.f19336e.getAvatarThumb() == null) {
                    com.bytedance.android.live.core.f.p.a(imageView, 2131234726, imageView.getWidth(), imageView.getHeight());
                } else {
                    com.bytedance.android.livesdk.chatroom.g.g.a(imageView, fVar.f20488a.f19336e.getAvatarThumb(), imageView.getWidth(), imageView.getHeight(), 2131234726);
                }
                View findViewById = fVar.f20490c.findViewById(R.id.r1);
                if (fVar.f20488a.f19336e == null || fVar.f20488a.f19336e.getUserAttr() == null || !fVar.f20488a.f19336e.getUserAttr().f19030b) {
                    i4 = 8;
                } else {
                    i4 = 0;
                }
                findViewById.setVisibility(i4);
                Long valueOf = Long.valueOf((System.currentTimeMillis() / 1000) - fVar.f20488a.f19335d);
                if (valueOf.longValue() < 60) {
                    str = y.a((int) R.string.eol);
                } else if (valueOf.longValue() < 3600) {
                    str = (valueOf.longValue() / 60) + y.a((int) R.string.efq);
                } else if (valueOf.longValue() < 86400) {
                    str = (valueOf.longValue() / 1440) + y.a((int) R.string.e5y);
                } else if (valueOf.longValue() < 604800) {
                    str = (valueOf.longValue() / 86400) + y.a((int) R.string.dzr);
                } else {
                    str = "1" + y.a((int) R.string.eq_);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fVar.f20488a.f19333b);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) " ".concat(String.valueOf(str)));
                com.bytedance.android.live.design.widget.c.a(textView2.getContext(), spannableStringBuilder, 0, length, 3, 600);
                if (fVar.f20488a.f19334c == 1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(com.bytedance.android.live.design.b.a(textView2, (int) R.attr.amp)), 0, length, 33);
                    imageView.setAlpha(0.5f);
                    textView.setTextColor(com.bytedance.android.live.design.b.a(textView2, (int) R.attr.amp));
                } else {
                    textView.setTextColor(com.bytedance.android.live.design.b.a(textView2, (int) R.attr.amv));
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(com.bytedance.android.live.design.b.a(textView2, (int) R.attr.amo)), 0, length, 33);
                }
                int i6 = length + 1;
                com.bytedance.android.live.design.widget.c.a(textView2.getContext(), spannableStringBuilder, i6, spannableStringBuilder.length(), 3, 400);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(com.bytedance.android.live.design.b.a(textView2, (int) R.attr.amp)), i6, spannableStringBuilder.length(), 33);
                textView2.setText(spannableStringBuilder);
            }
        } else if (viewHolder instanceof b) {
            if (this.f20466j.booleanValue() || this.f20467k || i2 == 0) {
                ((b) viewHolder).f20475a.setVisibility(8);
            }
        } else if (!(viewHolder instanceof c)) {
        } else {
            if (this.f20466j.booleanValue() || this.f20467k) {
                c cVar = (c) viewHolder;
                if (com.bytedance.android.live.m.c.b(i.this.n) || !i.this.f20466j.booleanValue()) {
                    cVar.f20479c.setBackgroundResource(R.color.a24);
                    if (i.this.f20466j.booleanValue()) {
                        i3 = R.string.e5o;
                    } else {
                        i3 = R.string.ejj;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(y.a(i3));
                    com.bytedance.android.live.design.widget.c.a(cVar.f20477a.getContext(), spannableStringBuilder2, 0, spannableStringBuilder2.length(), 5, 400);
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(com.bytedance.android.live.design.b.a(cVar.f20477a, (int) R.attr.amv)), 0, spannableStringBuilder2.length(), 33);
                    cVar.f20477a.setText(spannableStringBuilder2);
                    return;
                }
                i.this.a(cVar.f20478b, cVar.f20477a, cVar.f20479c);
            }
        }
    }

    class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        TextView f20471a;

        /* renamed from: b  reason: collision with root package name */
        View f20472b;

        /* renamed from: c  reason: collision with root package name */
        Context f20473c;

        static {
            Covode.recordClassIndex(12091);
        }

        public a(Context context, View view) {
            super(view);
            this.f20472b = view;
            this.f20473c = context;
            this.f20471a = (TextView) view.findViewById(R.id.adh);
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        TextView f20477a;

        /* renamed from: b  reason: collision with root package name */
        Context f20478b;

        /* renamed from: c  reason: collision with root package name */
        ViewGroup f20479c;

        static {
            Covode.recordClassIndex(12093);
        }

        public c(Context context, View view) {
            super(view);
            this.f20478b = context;
            this.f20477a = (TextView) view.findViewById(R.id.bf1);
            this.f20479c = (ViewGroup) view.findViewById(R.id.bfa);
        }
    }

    private void a(Context context, TextView textView, ViewGroup viewGroup) {
        viewGroup.setBackgroundColor(com.bytedance.android.live.design.b.a(viewGroup, (int) R.attr.alg));
        String a2 = y.a((int) R.string.ep_);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a2 + " " + y.a((int) R.string.ep9));
        spannableStringBuilder.setSpan(new ClickableSpan() {
            /* class com.bytedance.android.livesdk.qa.i.AnonymousClass2 */

            static {
                Covode.recordClassIndex(12090);
            }

            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }

            public final void onClick(View view) {
                androidx.fragment.app.i iVar = (androidx.fragment.app.i) i.this.n.b(ao.class);
                if (iVar != null) {
                    new ax().show(iVar, "HeaderViewHolder");
                }
            }
        }, a2.length() + 1, spannableStringBuilder.length(), 33);
        com.bytedance.android.live.design.widget.c.a(context, spannableStringBuilder, a2.length() + 1, spannableStringBuilder.length(), 5, 600);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(com.bytedance.android.live.design.b.a(textView, (int) R.attr.ama)), a2.length() + 1, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
