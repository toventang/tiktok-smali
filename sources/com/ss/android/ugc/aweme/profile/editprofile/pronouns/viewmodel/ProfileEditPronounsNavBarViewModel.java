package com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import h.f.b.ab;
import h.f.b.l;
import h.h;

public final class ProfileEditPronounsNavBarViewModel extends AssemViewModel<a> {

    /* renamed from: l  reason: collision with root package name */
    public static final a f116224l = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public final f.a.b.a f116225j = new f.a.b.a();

    /* renamed from: k  reason: collision with root package name */
    public final h f116226k = com.bytedance.assem.arch.a.c.a(this, ab.a(com.ss.android.ugc.aweme.profile.editprofile.pronouns.a.b.class));

    static {
        Covode.recordClassIndex(75019);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75020);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ a f() {
        return new a();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ac
    public final void onCleared() {
        this.f116225j.dispose();
        super.onCleared();
    }

    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileEditPronounsNavBarViewModel f116227a;

        static {
            Covode.recordClassIndex(75021);
        }

        public b(ProfileEditPronounsNavBarViewModel profileEditPronounsNavBarViewModel) {
            this.f116227a = profileEditPronounsNavBarViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final com.ss.android.ugc.aweme.profile.editprofile.pronouns.a.c cVar = (com.ss.android.ugc.aweme.profile.editprofile.pronouns.a.c) obj;
            this.f116227a.a(new h.f.a.b<a, a>() {
                /* class com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsNavBarViewModel.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(75022);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ a invoke(a aVar) {
                    a aVar2 = aVar;
                    String str = "";
                    l.d(aVar2, str);
                    String str2 = cVar.f116171a;
                    if (str2 != null) {
                        str = str2;
                    }
                    return a.a(aVar2, true, str, null, 4);
                }
            });
        }
    }

    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileEditPronounsNavBarViewModel f116228a;

        static {
            Covode.recordClassIndex(75023);
        }

        public c(ProfileEditPronounsNavBarViewModel profileEditPronounsNavBarViewModel) {
            this.f116228a = profileEditPronounsNavBarViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (!(th instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                this.f116228a.a(AnonymousClass2.f116230a);
            } else if (((com.ss.android.ugc.aweme.base.api.a.a) th).getErrorCode() == 3002131) {
                this.f116228a.a(AnonymousClass1.f116229a);
            }
        }
    }
}
