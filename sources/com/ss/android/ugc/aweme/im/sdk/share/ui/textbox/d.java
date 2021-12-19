package com.ss.android.ugc.aweme.im.sdk.share.ui.textbox;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Editable;
import android.text.InputFilter;
import android.util.TypedValue;
import android.view.View;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ad;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.z;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final DmtEditText f103725a;

    /* renamed from: b  reason: collision with root package name */
    public final TuxButton f103726b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.social.widget.card.d f103727c;

    /* renamed from: d  reason: collision with root package name */
    public final Activity f103728d;

    /* renamed from: e  reason: collision with root package name */
    public final View f103729e;

    /* renamed from: f  reason: collision with root package name */
    final SharePackage f103730f;

    /* renamed from: g  reason: collision with root package name */
    public final ShareTextBoxViewModel f103731g;

    /* renamed from: h  reason: collision with root package name */
    private final RemoteImageView f103732h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f103733i;

    /* renamed from: j  reason: collision with root package name */
    private final androidx.lifecycle.m f103734j;

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final b f103737a = new b();

        static {
            Covode.recordClassIndex(66450);
        }

        b() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final f f103746a = new f();

        static {
            Covode.recordClassIndex(66454);
        }

        f() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(66448);
    }

    /* access modifiers changed from: package-private */
    public static final class l<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f103752a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f103753b;

        static {
            Covode.recordClassIndex(66460);
        }

        l(d dVar, boolean z) {
            this.f103752a = dVar;
            this.f103753b = z;
        }

        static final class a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ l this$0;

            static {
                Covode.recordClassIndex(66461);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(l lVar) {
                super(0);
                this.this$0 = lVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                ShareTextBoxViewModel shareTextBoxViewModel = this.this$0.f103752a.f103731g;
                if (h.f.b.l.a((Object) shareTextBoxViewModel.f103709k.getValue(), (Object) true)) {
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.im.service.model.d((byte) 0));
                    shareTextBoxViewModel.f103705g.setValue(true);
                }
                return z.f158842a;
            }
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List<? extends User> list = (List) obj;
            if (list != null && !list.isEmpty()) {
                com.ss.android.ugc.aweme.social.widget.card.d dVar = this.f103752a.f103727c;
                if (dVar == null) {
                    d dVar2 = this.f103752a;
                    com.ss.android.ugc.aweme.social.widget.card.i iVar = com.ss.android.ugc.aweme.social.widget.card.i.f133800a;
                    Activity activity = dVar2.f103728d;
                    Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
                    String string = dVar2.f103730f.f124595i.getString("enter_from");
                    if (string == null) {
                        string = "";
                    }
                    h.f.b.l.b(string, "");
                    dVar = iVar.a(new com.ss.android.ugc.aweme.social.widget.a(eVar, null, string, null, 10), com.ss.android.ugc.aweme.social.a.f.a());
                    dVar.a(new a(this));
                    dVar.a(new b(dVar, this));
                }
                dVar.a(list);
                dVar.b();
            }
        }

        static final class b extends h.f.b.m implements h.f.a.b<List<? extends IMUser>, z> {
            final /* synthetic */ com.ss.android.ugc.aweme.social.widget.card.d $this_apply;
            final /* synthetic */ l this$0;

            static {
                Covode.recordClassIndex(66462);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(com.ss.android.ugc.aweme.social.widget.card.d dVar, l lVar) {
                super(1);
                this.$this_apply = dVar;
                this.this$0 = lVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(List<? extends IMUser> list) {
                String str;
                List<? extends IMUser> list2 = list;
                h.f.b.l.d(list2, "");
                ShareTextBoxViewModel shareTextBoxViewModel = this.this$0.f103752a.f103731g;
                Editable text = this.this$0.f103752a.f103725a.getText();
                if (text != null) {
                    str = text.toString();
                } else {
                    str = null;
                }
                boolean z = this.this$0.f103753b;
                h.f.b.l.d(list2, "");
                shareTextBoxViewModel.f103707i.f124595i.putBoolean("show_tips_until_cancel", false);
                shareTextBoxViewModel.f103707i.f124595i.putString("is_share_pop_up", "1");
                if (!h.f.b.l.a((Object) shareTextBoxViewModel.f103709k.getValue(), (Object) true)) {
                    shareTextBoxViewModel.f103709k.postValue(true);
                }
                String uuid = UUID.randomUUID().toString();
                h.f.b.l.b(uuid, "");
                com.ss.android.ugc.aweme.im.sdk.share.b.b.a.a((List<IMContact>) list2, str, shareTextBoxViewModel.f103707i, uuid, !z, (com.ss.android.ugc.aweme.im.sdk.share.b.a.a) null);
                com.ss.android.ugc.aweme.im.sdk.relations.a.b.a(shareTextBoxViewModel.f103707i, str, n.g((Collection) list2));
                shareTextBoxViewModel.f103705g.setValue(true);
                this.$this_apply.c();
                return z.f158842a;
            }
        }
    }

    public final void a(boolean z) {
        if (this.f103733i) {
            b(z);
        } else {
            c(z);
        }
        d(z);
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f103747a;

        static {
            Covode.recordClassIndex(66455);
        }

        g(d dVar) {
            this.f103747a = dVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            com.bytedance.tux.g.b bVar = new com.bytedance.tux.g.b(this.f103747a.f103729e);
            h.f.b.l.b(num, "");
            bVar.e(num.intValue()).b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f103750a;

        static {
            Covode.recordClassIndex(66458);
        }

        j(d dVar) {
            this.f103750a = dVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f2 = (Float) obj;
            TuxButton tuxButton = this.f103750a.f103726b;
            h.f.b.l.b(f2, "");
            tuxButton.setAlpha(f2.floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f103754a;

        static {
            Covode.recordClassIndex(66463);
        }

        m(d dVar) {
            this.f103754a = dVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.social.widget.card.d dVar;
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue() && (dVar = this.f103754a.f103727c) != null) {
                dVar.d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f103735a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f103736b;

        static {
            Covode.recordClassIndex(66449);
        }

        a(d dVar, boolean z) {
            this.f103735a = dVar;
            this.f103736b = z;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.im.sdk.common.controller.utils.u.a(view, 500)) {
                ShareTextBoxViewModel shareTextBoxViewModel = this.f103735a.f103731g;
                Editable text = this.f103735a.f103725a.getText();
                if (text != null) {
                    str = text.toString();
                } else {
                    str = null;
                }
                shareTextBoxViewModel.a(str, this.f103736b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f103738a = new c();

        static {
            Covode.recordClassIndex(66451);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.e eVar) {
            com.bytedance.tux.c.e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            eVar2.f44777c = Float.valueOf(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
            eVar2.f44776b = Integer.valueOf((int) R.attr.w);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.d$d  reason: collision with other inner class name */
    public static final class C2641d extends com.bytedance.lighten.a.c.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f103739a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f103740b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f103741c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f103742d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TuxTextView f103743e;

        static {
            Covode.recordClassIndex(66452);
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Throwable th) {
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Bitmap bitmap) {
            Activity activity = this.f103739a.f103728d;
            String str = this.f103740b;
            h.f.b.l.b(str, "");
            String str2 = this.f103741c;
            String str3 = this.f103742d;
            h.f.b.l.b(str3, "");
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            this.f103743e.setText(CommentSharePackage.a.a(activity, str, str2, str3, bitmap, h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()))));
        }

        C2641d(d dVar, String str, String str2, String str3, TuxTextView tuxTextView) {
            this.f103739a = dVar;
            this.f103740b = str;
            this.f103741c = str2;
            this.f103742d = str3;
            this.f103743e = tuxTextView;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f103744a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f103745b;

        static {
            Covode.recordClassIndex(66453);
        }

        e(d dVar, boolean z) {
            this.f103744a = dVar;
            this.f103745b = z;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.im.sdk.common.controller.utils.u.a(view, 500)) {
                ShareTextBoxViewModel shareTextBoxViewModel = this.f103744a.f103731g;
                Editable text = this.f103744a.f103725a.getText();
                if (text != null) {
                    str = text.toString();
                } else {
                    str = null;
                }
                shareTextBoxViewModel.a(str, this.f103745b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f103748a;

        static {
            Covode.recordClassIndex(66456);
        }

        h(d dVar) {
            this.f103748a = dVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            a aVar = (a) obj;
            String string = this.f103748a.f103728d.getString(aVar.f103716a, new Object[]{Integer.valueOf(aVar.f103717b)});
            h.f.b.l.b(string, "");
            new com.bytedance.tux.g.b(this.f103748a.f103729e).a(string).b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f103751a;

        static {
            Covode.recordClassIndex(66459);
        }

        k(d dVar) {
            this.f103751a = dVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            TuxButton tuxButton = this.f103751a.f103726b;
            h.f.b.l.b(bool, "");
            tuxButton.setLoading(bool.booleanValue());
            if (bool.booleanValue()) {
                this.f103751a.f103726b.setBackgroundResource(R.color.bh);
            } else {
                this.f103751a.f103726b.setBackgroundResource(R.drawable.ar6);
            }
        }
    }

    private final void c(boolean z) {
        this.f103725a.setFilters(new InputFilter[]{new ad(this.f103725a)});
        this.f103726b.setOnClickListener(new e(this, z));
        this.f103729e.setOnClickListener(f.f103746a);
        this.f103729e.setEnabled(false);
        if (!com.ss.android.ugc.aweme.im.sdk.common.ui.widget.a.a(this.f103732h, this.f103730f, (Boolean) false)) {
            this.f103732h.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f103749a;

        static {
            Covode.recordClassIndex(66457);
        }

        i(d dVar) {
            this.f103749a = dVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            b bVar = (b) obj;
            if (bVar.f103719b > 0) {
                this.f103749a.f103726b.setText(this.f103749a.f103728d.getString(bVar.f103718a) + " (" + bVar.f103719b + ')');
            } else {
                this.f103749a.f103726b.setText(this.f103749a.f103728d.getText(bVar.f103718a));
            }
        }
    }

    private final void d(boolean z) {
        this.f103731g.f103699a.observe(this.f103734j, new g(this));
        this.f103731g.f103700b.observe(this.f103734j, new h(this));
        this.f103731g.f103701c.observe(this.f103734j, new i(this));
        this.f103731g.f103702d.observe(this.f103734j, new j(this));
        this.f103731g.f103703e.observe(this.f103734j, new k(this));
        this.f103731g.f103704f.observe(this.f103734j, new l(this, z));
        this.f103731g.f103706h.observe(this.f103734j, new m(this));
    }

    private final void b(boolean z) {
        MethodCollector.i(5720);
        this.f103725a.setFilters(new InputFilter[]{new ad(this.f103725a)});
        this.f103726b.setOnClickListener(new a(this, z));
        this.f103729e.setOnClickListener(b.f103737a);
        this.f103729e.setEnabled(false);
        this.f103732h.setVisibility(8);
        View findViewById = this.f103729e.findViewById(R.id.a_1);
        h.f.b.l.b(findViewById, "");
        TuxTextView tuxTextView = (TuxTextView) findViewById;
        tuxTextView.setVisibility(0);
        com.bytedance.tux.c.e a2 = com.bytedance.tux.c.f.a(c.f103738a);
        Context context = tuxTextView.getContext();
        h.f.b.l.b(context, "");
        tuxTextView.setBackground(a2.a(context));
        SharePackage sharePackage = this.f103730f;
        if (sharePackage != null) {
            CommentSharePackage commentSharePackage = (CommentSharePackage) sharePackage;
            Comment comment = commentSharePackage.f123941a;
            if (comment == null) {
                h.f.b.l.b();
            }
            User user = comment.getUser();
            h.f.b.l.b(user, "");
            String nickname = user.getNickname();
            Comment comment2 = commentSharePackage.f123941a;
            if (comment2 == null) {
                h.f.b.l.b();
            }
            String text = comment2.getText();
            Comment comment3 = commentSharePackage.f123941a;
            if (comment3 == null) {
                h.f.b.l.b();
            }
            String replyToUserName = comment3.getReplyToUserName();
            if (replyToUserName == null) {
                replyToUserName = "";
            }
            Bitmap decodeResource = BitmapFactory.decodeResource(this.f103728d.getResources(), 2131232780);
            h.f.b.l.b(decodeResource, "");
            Activity activity = this.f103728d;
            h.f.b.l.b(nickname, "");
            h.f.b.l.b(text, "");
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            tuxTextView.setText(CommentSharePackage.a.a(activity, nickname, replyToUserName, text, decodeResource, h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()))));
            Comment comment4 = commentSharePackage.f123941a;
            if (comment4 == null) {
                h.f.b.l.b();
            }
            User user2 = comment4.getUser();
            h.f.b.l.b(user2, "");
            v a3 = r.a(com.ss.android.ugc.aweme.base.v.a(user2.getAvatarThumb()));
            a3.f39906b = this.f103728d;
            a3.a("CommentShare").a(new C2641d(this, nickname, replyToUserName, text, tuxTextView));
            MethodCollector.o(5720);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage");
        MethodCollector.o(5720);
        throw nullPointerException;
    }

    public d(Activity activity, View view, SharePackage sharePackage, ShareTextBoxViewModel shareTextBoxViewModel, androidx.lifecycle.m mVar) {
        h.f.b.l.d(activity, "");
        h.f.b.l.d(view, "");
        h.f.b.l.d(sharePackage, "");
        h.f.b.l.d(shareTextBoxViewModel, "");
        h.f.b.l.d(mVar, "");
        this.f103728d = activity;
        this.f103729e = view;
        this.f103730f = sharePackage;
        this.f103731g = shareTextBoxViewModel;
        this.f103734j = mVar;
        View findViewById = view.findViewById(R.id.asv);
        h.f.b.l.b(findViewById, "");
        this.f103725a = (DmtEditText) findViewById;
        View findViewById2 = view.findViewById(R.id.f72);
        h.f.b.l.b(findViewById2, "");
        this.f103726b = (TuxButton) findViewById2;
        View findViewById3 = view.findViewById(R.id.bvt);
        h.f.b.l.b(findViewById3, "");
        this.f103732h = (RemoteImageView) findViewById3;
        this.f103733i = h.f.b.l.a((Object) sharePackage.f124590d, (Object) UGCMonitor.EVENT_COMMENT);
    }
}
