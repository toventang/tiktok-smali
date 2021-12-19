package com.ss.android.ugc.aweme.feed.assem.desc;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.commercialize.feed.ba;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.assem.h;
import com.ss.android.ugc.aweme.feed.experiment.q;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.bv;
import com.ss.android.ugc.aweme.feed.x.af;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.r;
import h.k.i;
import h.z;
import java.util.Map;
import java.util.concurrent.Callable;

public final class VideoDescVM extends FeedBaseViewModel<l> {

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ i[] f92141k = {new r(VideoDescVM.class, "context", "getContext()Landroid/content/Context;", 0)};
    public int A;
    public int B;
    public int C;
    private final h D = new h(a.f92144a);

    /* renamed from: l  reason: collision with root package name */
    public final boolean f92142l = com.ss.android.ugc.aweme.adaptation.c.f66191a;

    /* renamed from: m  reason: collision with root package name */
    public boolean f92143m;
    public boolean n;
    public boolean v;
    public boolean w;
    public SpannableStringBuilder x;
    public SpannableStringBuilder y;
    public int z;

    static final class a extends m implements h.f.a.a<Context> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f92144a = new a();

        static {
            Covode.recordClassIndex(58133);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ Context invoke() {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(58132);
    }

    public final void a(Context context) {
        this.D.a(f92141k[0], context);
    }

    public final Context h() {
        return (Context) this.D.a(f92141k[0]);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new l();
    }

    static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoDescVM f92149a;

        static {
            Covode.recordClassIndex(58138);
        }

        e(VideoDescVM videoDescVM) {
            this.f92149a = videoDescVM;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            com.ss.android.ugc.aweme.common.r.a("video_title", this.f92149a.a("show"));
            return null;
        }
    }

    private static boolean k() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean i() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean k2 = k();
        com.ss.android.ugc.aweme.lancet.j.f107229h = k2;
        return k2;
    }

    public final void j() {
        com.ss.android.ugc.aweme.commercialize.j.b bVar;
        if (!l()) {
            VideoItemParams videoItemParams = (VideoItemParams) g();
            Aweme aweme = null;
            if (videoItemParams != null && (bVar = videoItemParams.mAdOpenCallBack) != null) {
                ba c2 = g.c();
                Context h2 = h();
                VideoItemParams videoItemParams2 = (VideoItemParams) g();
                if (videoItemParams2 != null) {
                    aweme = videoItemParams2.mAweme;
                }
                c2.a(h2, aweme, 1, bVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r0 == null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        r0 = r0.getWebUrl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        new com.ss.android.ugc.aweme.tux.a.i.a(h()).a(com.zhiliaoapp.musically.R.string.of).a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        if (r1 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r0.isAd() != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (com.ss.android.ugc.aweme.commercialize.utils.br.a(r5.mAweme, 3) == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        r0 = r5.mAweme;
        h.f.b.l.b(r0, "");
        r0 = r0.getAwemeRawAd();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean l() {
        /*
            r6 = this;
            java.lang.Object r5 = r6.g()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r5 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r5
            r4 = 1
            r3 = 0
            if (r5 != 0) goto L_0x000b
        L_0x000a:
            return r3
        L_0x000b:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.mAweme
            boolean r1 = com.ss.android.ugc.aweme.commercialize.e.a.b.E(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.mAweme
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0056
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.mAweme
            h.f.b.l.b(r0, r2)
            boolean r0 = r0.isAd()
            if (r0 == 0) goto L_0x0056
        L_0x0022:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.mAweme
            r0 = 3
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.br.a(r1, r0)
            if (r0 == 0) goto L_0x000a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.mAweme
            h.f.b.l.b(r0, r2)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = r0.getWebUrl()
        L_0x003a:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x000a
        L_0x0040:
            com.ss.android.ugc.aweme.tux.a.i.a r1 = new com.ss.android.ugc.aweme.tux.a.i.a
            android.content.Context r0 = r6.h()
            r1.<init>(r0)
            r0 = 2131821104(0x7f110230, float:1.9274942E38)
            com.ss.android.ugc.aweme.tux.a.i.a r0 = r1.a(r0)
            r0.a()
            return r4
        L_0x0054:
            r0 = 0
            goto L_0x003a
        L_0x0056:
            if (r1 != 0) goto L_0x0040
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM.l():boolean");
    }

    static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoDescVM f92146a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoItemParams f92147b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ bv f92148c;

        static {
            Covode.recordClassIndex(58137);
        }

        d(VideoDescVM videoDescVM, VideoItemParams videoItemParams, bv bvVar) {
            this.f92146a = videoDescVM;
            this.f92147b = videoItemParams;
            this.f92148c = bvVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00ca  */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 261
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM.d.call():java.lang.Object");
        }
    }

    static final class c extends m implements h.f.a.b<l, z> {
        final /* synthetic */ VideoDescVM this$0;

        static {
            Covode.recordClassIndex(58135);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VideoDescVM videoDescVM) {
            super(1);
            this.this$0 = videoDescVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(l lVar) {
            l.d(lVar, "");
            this.this$0.a(AnonymousClass1.f92145a);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<l, l> {
        final /* synthetic */ a $toggleAnimationState;

        static {
            Covode.recordClassIndex(58134);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.$toggleAnimationState = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ l invoke(l lVar) {
            l lVar2 = lVar;
            l.d(lVar2, "");
            return l.a(lVar2, null, false, false, false, this.$toggleAnimationState, null, null, 111);
        }
    }

    public static int a(Aweme aweme) {
        l.d(aweme, "");
        if (c.y || !com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme)) {
            return af.b();
        }
        return aweme.getAdDescMaxLines();
    }

    public final Map<String, String> a(String str) {
        String str2;
        String str3;
        Aweme aweme;
        String authorUid;
        Aweme aweme2;
        String str4 = "";
        l.d(str, str4);
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (videoItemParams == null || (str2 = videoItemParams.mEventType) == null) {
            str2 = str4;
        }
        com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", str2);
        VideoItemParams videoItemParams2 = (VideoItemParams) g();
        if (videoItemParams2 == null || (aweme2 = videoItemParams2.mAweme) == null || (str3 = aweme2.getAid()) == null) {
            str3 = str4;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", str3);
        VideoItemParams videoItemParams3 = (VideoItemParams) g();
        if (!(videoItemParams3 == null || (aweme = videoItemParams3.mAweme) == null || (authorUid = aweme.getAuthorUid()) == null)) {
            str4 = authorUid;
        }
        return a3.a("author_id", str4).a("action_type", str).f66730a;
    }

    public final boolean a(TextExtraStruct textExtraStruct) {
        l.d(textExtraStruct, "");
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (videoItemParams == null || videoItemParams.mAweme == null || videoItemParams.mAweme.getDesc() == null || textExtraStruct.getStart() < 0 || textExtraStruct.getEnd() < 0 || textExtraStruct.getEnd() > videoItemParams.mAweme.getDesc().length() || textExtraStruct.getStart() >= videoItemParams.mAweme.getDesc().length() || textExtraStruct.getStart() >= textExtraStruct.getEnd()) {
            return false;
        }
        return true;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.j
    public final /* synthetic */ VideoItemParams b(j jVar, VideoItemParams videoItemParams) {
        l.d(jVar, "");
        l.d(videoItemParams, "");
        return videoItemParams;
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0031  */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.ss.android.ugc.aweme.feed.assem.desc.l a(com.ss.android.ugc.aweme.feed.assem.desc.l r18, com.ss.android.ugc.aweme.feed.model.VideoItemParams r19) {
        /*
        // Method dump skipped, instructions count: 212
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM.a(com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams):com.bytedance.assem.arch.viewModel.j");
    }

    public final void a(String str, int i2, int i3) {
        SpannableStringBuilder spannableStringBuilder;
        String string;
        String str2 = "";
        l.d(str, str2);
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (videoItemParams != null) {
            if (TextUtils.isEmpty(this.x) || TextUtils.isEmpty(this.y)) {
                Aweme aweme = videoItemParams.mAweme;
                l.b(aweme, str2);
                this.x = new SpannableStringBuilder(aweme.getProcessedDesc());
                Aweme aweme2 = videoItemParams.mAweme;
                l.b(aweme2, str2);
                this.y = new SpannableStringBuilder(aweme2.getEllipsizeDesc());
            }
            Context h2 = h();
            if (!(h2 == null || (string = h2.getString(R.string.bv8)) == null)) {
                str2 = string;
            }
            boolean a2 = l.a((Object) str, (Object) str2);
            if (a2) {
                spannableStringBuilder = this.x;
            } else {
                spannableStringBuilder = this.y;
            }
            if (spannableStringBuilder != null) {
                a(spannableStringBuilder, a2, i2, i3);
            }
        }
    }

    public final void a(SpannableStringBuilder spannableStringBuilder, boolean z2, int i2, int i3) {
        String str;
        int a2;
        Context h2;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        l.d(spannableStringBuilder2, "");
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (videoItemParams != null) {
            int i4 = this.A;
            int i5 = this.z;
            if (videoItemParams.mAweme != null && i2 == 0) {
                if (i3 == 2) {
                    if (videoItemParams.mAweme.getTransDesc() != null) {
                        if (c.y) {
                            i4 = videoItemParams.mAweme.getTruncatedTransTextHeight();
                            Aweme aweme = videoItemParams.mAweme;
                            l.b(aweme, "");
                            i5 = (Math.min(c.z, videoItemParams.mAweme.getTransDescLines()) * i4) / a(aweme);
                        } else {
                            Aweme aweme2 = videoItemParams.mAweme;
                            l.b(aweme2, "");
                            i5 = (videoItemParams.mAweme.getTransDescLines() * i4) / a(aweme2);
                        }
                        spannableStringBuilder2 = z2 ? new SpannableStringBuilder(videoItemParams.mAweme.getTransDesc()) : new SpannableStringBuilder(videoItemParams.mAweme.getEllipsizeTransDesc());
                    }
                } else if (i3 == 0 && videoItemParams.mAweme.getTransDesc() != null && (TextUtils.equals(videoItemParams.mAweme.getTransDesc(), this.x) || TextUtils.equals(videoItemParams.mAweme.getDesc(), videoItemParams.mAweme.getEllipsizeDesc()))) {
                    if (c.y) {
                        i4 = videoItemParams.mAweme.getDescTruncatedTextHeight();
                        Aweme aweme3 = videoItemParams.mAweme;
                        l.b(aweme3, "");
                        i5 = (videoItemParams.mAweme.getDescLines() * i4) / a(aweme3);
                    }
                    spannableStringBuilder2 = z2 ? new SpannableStringBuilder(videoItemParams.mAweme.getProcessedDesc()) : new SpannableStringBuilder(videoItemParams.mAweme.getEllipsizeDesc());
                }
            }
            if (z2) {
                str = "spread";
            } else {
                str = "fold";
            }
            com.ss.android.ugc.aweme.common.r.a("video_title", a(str));
            if (z2) {
                a2 = c.z;
            } else {
                Aweme aweme4 = videoItemParams.mAweme;
                l.b(aweme4, "");
                a2 = a(aweme4);
            }
            if (q.d() && z2 && (h2 = h()) != null) {
                if (this.C != 0) {
                    i5 = Math.min((int) (((float) (this.C + i4)) - (com.ss.android.ugc.tools.utils.r.a(h2, 60.0f) + com.ss.android.ugc.tools.utils.r.a(h2, 40.0f))), i5);
                } else {
                    i5 = Math.min(600, i5);
                }
            }
            a(new b(new a(spannableStringBuilder2, i5, i4, a2, z2)));
        }
    }
}
