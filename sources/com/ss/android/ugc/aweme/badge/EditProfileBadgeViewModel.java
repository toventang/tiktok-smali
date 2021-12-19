package com.ss.android.ugc.aweme.badge;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeApi;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.List;

public final class EditProfileBadgeViewModel extends JediViewModel<EditProfileBadgeState> {

    /* renamed from: a  reason: collision with root package name */
    public List<h> f67881a = new ArrayList();

    static {
        Covode.recordClassIndex(41783);
    }

    private final void b() {
        this.f67881a.clear();
    }

    public final void a() {
        b();
        g();
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ EditProfileBadgeState d() {
        return new EditProfileBadgeState(null, 1, null);
    }

    private final void g() {
        c(new a(this));
        EditProfileBadgeApi.a.a().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this), new c(this));
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditProfileBadgeViewModel f67883a;

        static {
            Covode.recordClassIndex(41788);
        }

        c(EditProfileBadgeViewModel editProfileBadgeViewModel) {
            this.f67883a = editProfileBadgeViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) obj);
            this.f67883a.c(new h.f.a.b<EditProfileBadgeState, EditProfileBadgeState>(this) {
                /* class com.ss.android.ugc.aweme.badge.EditProfileBadgeViewModel.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(41789);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ EditProfileBadgeState invoke(EditProfileBadgeState editProfileBadgeState) {
                    EditProfileBadgeState editProfileBadgeState2 = editProfileBadgeState;
                    l.d(editProfileBadgeState2, "");
                    return editProfileBadgeState2.copy(new k(this.this$0.f67883a.f67881a, false, 11));
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<EditProfileBadgeState, EditProfileBadgeState> {
        final /* synthetic */ EditProfileBadgeViewModel this$0;

        static {
            Covode.recordClassIndex(41784);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(EditProfileBadgeViewModel editProfileBadgeViewModel) {
            super(1);
            this.this$0 = editProfileBadgeViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditProfileBadgeState invoke(EditProfileBadgeState editProfileBadgeState) {
            EditProfileBadgeState editProfileBadgeState2 = editProfileBadgeState;
            l.d(editProfileBadgeState2, "");
            return editProfileBadgeState2.copy(new k(this.this$0.f67881a, true, 43));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditProfileBadgeViewModel f67882a;

        static {
            Covode.recordClassIndex(41785);
        }

        b(EditProfileBadgeViewModel editProfileBadgeViewModel) {
            this.f67882a = editProfileBadgeViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final i iVar = (i) obj;
            if (iVar.error_code == 0) {
                List<h> list = iVar.f67929b;
                if (list != null) {
                    this.f67882a.f67881a.addAll(list);
                }
                this.f67882a.c(new h.f.a.b<EditProfileBadgeState, EditProfileBadgeState>(this) {
                    /* class com.ss.android.ugc.aweme.badge.EditProfileBadgeViewModel.b.AnonymousClass1 */
                    final /* synthetic */ b this$0;

                    static {
                        Covode.recordClassIndex(41786);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ EditProfileBadgeState invoke(EditProfileBadgeState editProfileBadgeState) {
                        EditProfileBadgeState editProfileBadgeState2 = editProfileBadgeState;
                        l.d(editProfileBadgeState2, "");
                        return editProfileBadgeState2.copy(new k(Integer.valueOf(iVar.status_code), iVar.status_msg, this.this$0.f67882a.f67881a, iVar.f67928a, false, true));
                    }
                });
                return;
            }
            this.f67882a.c(new h.f.a.b<EditProfileBadgeState, EditProfileBadgeState>(this) {
                /* class com.ss.android.ugc.aweme.badge.EditProfileBadgeViewModel.b.AnonymousClass2 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(41787);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ EditProfileBadgeState invoke(EditProfileBadgeState editProfileBadgeState) {
                    EditProfileBadgeState editProfileBadgeState2 = editProfileBadgeState;
                    l.d(editProfileBadgeState2, "");
                    return editProfileBadgeState2.copy(new k(this.this$0.f67882a.f67881a, false, 11));
                }
            });
        }
    }
}
