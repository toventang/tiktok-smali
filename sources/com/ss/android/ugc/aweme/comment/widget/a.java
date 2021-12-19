package com.ss.android.ugc.aweme.comment.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.comment.api.CommentPinAPI;
import com.ss.android.ugc.aweme.comment.c.h;
import com.ss.android.ugc.aweme.comment.c.i;
import com.ss.android.ugc.aweme.comment.c.j;
import com.ss.android.ugc.aweme.comment.c.k;
import com.ss.android.ugc.aweme.comment.f.g;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.ui.CommentTranslationStatusView;
import com.ss.android.ugc.aweme.comment.util.f;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.zhiliaoapp.musically.R;
import f.a.ae;
import h.f.b.l;

public final class a implements g {

    /* renamed from: f  reason: collision with root package name */
    public static b f73019f;

    /* renamed from: g  reason: collision with root package name */
    public static b f73020g;

    /* renamed from: h  reason: collision with root package name */
    public static final C1628a f73021h = new C1628a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Context f73022a;

    /* renamed from: b  reason: collision with root package name */
    public CommentTranslationStatusView f73023b;

    /* renamed from: c  reason: collision with root package name */
    public MentionTextView f73024c;

    /* renamed from: d  reason: collision with root package name */
    public b f73025d;

    /* renamed from: e  reason: collision with root package name */
    public Comment f73026e;

    static {
        Covode.recordClassIndex(44979);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.a$a  reason: collision with other inner class name */
    public static final class C1628a {
        static {
            Covode.recordClassIndex(44980);
        }

        private C1628a() {
        }

        public /* synthetic */ C1628a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.g
    public final Comment a() {
        Comment comment = this.f73026e;
        if (comment == null) {
            l.a(UGCMonitor.EVENT_COMMENT);
        }
        return comment;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.g
    public final void d() {
        CommentTranslationStatusView commentTranslationStatusView = this.f73023b;
        if (commentTranslationStatusView == null) {
            l.a("statusView");
        }
        commentTranslationStatusView.setLoading(false);
    }

    public final MentionTextView e() {
        MentionTextView mentionTextView = this.f73024c;
        if (mentionTextView == null) {
            l.a("mentionTextView");
        }
        return mentionTextView;
    }

    public final b f() {
        b bVar = this.f73025d;
        if (bVar == null) {
            l.a("singlePinStatus");
        }
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.g
    public final LiveData<h> b() {
        b bVar = this.f73025d;
        if (bVar == null) {
            l.a("singlePinStatus");
        }
        if (bVar.f73029c || a() == null || a().getAwemeId() == null || a().getCid() == null) {
            return null;
        }
        return a(false, false);
    }

    @Override // com.ss.android.ugc.aweme.comment.f.g
    public final void c() {
        MentionTextView mentionTextView = this.f73024c;
        if (mentionTextView == null) {
            l.a("mentionTextView");
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(mentionTextView, "alpha", 0.0f).setDuration(100L);
        l.b(duration, "");
        duration.setInterpolator(new com.ss.android.ugc.aweme.bd.a());
        MentionTextView mentionTextView2 = this.f73024c;
        if (mentionTextView2 == null) {
            l.a("mentionTextView");
        }
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(mentionTextView2, "alpha", 0.0f, 1.0f).setDuration(100L);
        l.b(duration2, "");
        duration2.setInterpolator(new com.ss.android.ugc.aweme.bd.a());
        duration.addListener(new d(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2);
        animatorSet.start();
    }

    public final class b {

        /* renamed from: a  reason: collision with root package name */
        f.a.b.b f73027a;

        /* renamed from: b  reason: collision with root package name */
        t<h> f73028b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f73029c;

        static {
            Covode.recordClassIndex(44981);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }

        public final void a(h hVar) {
            l.d(hVar, "");
            f.a.b.b bVar = this.f73027a;
            if (bVar != null) {
                bVar.dispose();
            }
            t<h> tVar = this.f73028b;
            if (tVar != null) {
                tVar.postValue(hVar);
            }
            this.f73029c = false;
            this.f73027a = null;
            this.f73028b = null;
        }
    }

    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f73034a;

        static {
            Covode.recordClassIndex(44983);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(a aVar) {
            this.f73034a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            this.f73034a.e().setText(f.a(this.f73034a.a(), true));
            MentionTextView e2 = this.f73034a.e();
            Comment a2 = this.f73034a.a();
            Context context = this.f73034a.f73022a;
            if (context == null) {
                l.a("context");
            }
            e2.a(f.a(a2, context, false), (MentionTextView.d) null, (MentionTextView.d) null);
            a.C0730a aVar = new a.C0730a();
            CharSequence text = this.f73034a.e().getText();
            l.b(text, "");
            aVar.a(text);
            this.f73034a.e().setText(aVar.f33382a);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.g
    public final void a(boolean z) {
        if (z) {
            CommentTranslationStatusView commentTranslationStatusView = this.f73023b;
            if (commentTranslationStatusView == null) {
                l.a("statusView");
            }
            commentTranslationStatusView.setLoadingText(R.string.alm);
        } else {
            CommentTranslationStatusView commentTranslationStatusView2 = this.f73023b;
            if (commentTranslationStatusView2 == null) {
                l.a("statusView");
            }
            commentTranslationStatusView2.setLoadingText(R.string.amx);
        }
        CommentTranslationStatusView commentTranslationStatusView3 = this.f73023b;
        if (commentTranslationStatusView3 == null) {
            l.a("statusView");
        }
        commentTranslationStatusView3.setLoading(true);
    }

    public static final class c implements ae<j> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f73031a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f73032b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f73033c;

        static {
            Covode.recordClassIndex(44982);
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            Throwable th2;
            l.d(th, "");
            th.getMessage();
            i iVar = null;
            if (!(th instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                th2 = null;
            } else {
                th2 = th;
            }
            com.ss.android.ugc.aweme.base.api.a.a aVar = (com.ss.android.ugc.aweme.base.api.a.a) th2;
            if (aVar == null || aVar.getErrorCode() != 3008034) {
                this.f73031a.f().a(new h(k.FAIL, null));
                return;
            }
            b f2 = this.f73031a.f();
            k kVar = k.LIMIT;
            Object rawResponse = ((com.ss.android.ugc.aweme.base.api.a.b.a) th).getRawResponse();
            if (!(rawResponse instanceof j)) {
                rawResponse = null;
            }
            j jVar = (j) rawResponse;
            if (jVar != null) {
                iVar = jVar.f71765a;
            }
            f2.a(new h(kVar, iVar));
        }

        @Override // f.a.ae
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
            b f2 = this.f73031a.f();
            t<h> tVar = this.f73032b;
            f2.f73027a = bVar;
            f2.f73028b = tVar;
            f2.f73029c = true;
            boolean z = this.f73033c;
            b f3 = this.f73031a.f();
            l.d(f3, "");
            if (z) {
                if (!l.a(a.f73019f, f3)) {
                    b bVar2 = a.f73019f;
                    if (bVar2 != null) {
                        bVar2.a(new h(k.CANCEL, null));
                    }
                    a.f73019f = f3;
                }
            } else if (!l.a(a.f73020g, f3)) {
                b bVar3 = a.f73020g;
                if (bVar3 != null) {
                    bVar3.a(new h(k.CANCEL, null));
                }
                a.f73020g = f3;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.ae
        public final /* synthetic */ void onSuccess(j jVar) {
            j jVar2 = jVar;
            l.d(jVar2, "");
            if (jVar2.status_code == 0) {
                this.f73031a.f().a(new h(k.SUCCESS, null));
            } else if (jVar2.status_code == 3008034) {
                this.f73031a.f().a(new h(k.LIMIT, jVar2.f71765a));
            } else {
                onError(new Exception("response status_code != 0"));
            }
        }

        c(a aVar, t tVar, boolean z) {
            this.f73031a = aVar;
            this.f73032b = tVar;
            this.f73033c = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.g
    public final LiveData<h> b(boolean z) {
        b bVar = this.f73025d;
        if (bVar == null) {
            l.a("singlePinStatus");
        }
        if (bVar.f73029c || a() == null || a().getAwemeId() == null || a().getCid() == null) {
            return null;
        }
        return a(true, z);
    }

    private final t<h> a(boolean z, boolean z2) {
        int i2;
        t<h> tVar = new t<>();
        CommentPinAPI commentPinAPI = com.ss.android.ugc.aweme.comment.api.d.f71463a;
        String awemeId = a().getAwemeId();
        l.b(awemeId, "");
        String cid = a().getCid();
        l.b(cid, "");
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        commentPinAPI.pinComment(awemeId, cid, currentTimeMillis, i2, z2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new c(this, tVar, z));
        return tVar;
    }
}
