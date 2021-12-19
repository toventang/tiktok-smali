package com.ss.android.ugc.aweme.story.avatar;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import h.f.b.m;

public final class ProfileStoryRingViewModel extends AssemViewModel<p> {

    /* renamed from: m  reason: collision with root package name */
    public static final a f136760m = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public boolean f136761j;

    /* renamed from: k  reason: collision with root package name */
    public User f136762k;

    /* renamed from: l  reason: collision with root package name */
    boolean f136763l = true;

    static {
        Covode.recordClassIndex(89348);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89349);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ p f() {
        return new p();
    }

    public final String g() {
        if (this.f136761j) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    public final void a(String str) {
        l.d(str, "");
        a(new b(str));
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<p, p> {
        final /* synthetic */ String $reason;

        static {
            Covode.recordClassIndex(89350);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.$reason = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ p invoke(p pVar) {
            l.d(pVar, "");
            com.bytedance.assem.arch.extensions.a aVar = new com.bytedance.assem.arch.extensions.a(this.$reason);
            l.d(aVar, "");
            return new p(aVar);
        }
    }
}
