package com.ss.android.ugc.aweme.mix.editname;

import com.bytedance.assem.arch.extensions.n;
import com.bytedance.assem.arch.extensions.o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;

public final class EditPlayListNameEditTextVM extends AssemViewModel<a> {

    /* renamed from: j  reason: collision with root package name */
    private final h f109920j = com.bytedance.assem.arch.a.c.a(this, c.f109927a);

    static {
        Covode.recordClassIndex(70429);
    }

    public final com.bytedance.assem.arch.a.a<c> g() {
        return (com.bytedance.assem.arch.a.a) this.f109920j.getValue();
    }

    static final class c extends m implements h.f.a.a<com.bytedance.assem.arch.a.a<c>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f109927a = new c();

        static {
            Covode.recordClassIndex(70442);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.a.a<c> invoke() {
            return new b();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ a f() {
        return new a();
    }

    public final void a(String str) {
        l.d(str, "");
        b(new b(this, str));
    }

    static final class a extends m implements h.f.a.b<a, z> {
        final /* synthetic */ String $mixID;
        final /* synthetic */ String $name;
        final /* synthetic */ EditPlayListNameEditTextVM this$0;

        static {
            Covode.recordClassIndex(70430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(EditPlayListNameEditTextVM editPlayListNameEditTextVM, String str, String str2) {
            super(1);
            this.this$0 = editPlayListNameEditTextVM;
            this.$mixID = str;
            this.$name = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            if (!(aVar2.f109931a instanceof n)) {
                this.this$0.c(AnonymousClass1.f109921a);
                EditPlayListNameEditTextVM editPlayListNameEditTextVM = this.this$0;
                f.a.b.b a2 = editPlayListNameEditTextVM.g().a().a(this.$mixID, this.$name).a(new f(this) {
                    /* class com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM.a.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f109922a;

                    static {
                        Covode.recordClassIndex(70432);
                    }

                    {
                        this.f109922a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        final com.ss.android.ugc.aweme.mix.api.response.b bVar = (com.ss.android.ugc.aweme.mix.api.response.b) obj;
                        this.f109922a.this$0.a(new h.f.a.b<a, a>() {
                            /* class com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM.a.AnonymousClass2.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(70433);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ a invoke(a aVar) {
                                a aVar2 = aVar;
                                l.d(aVar2, "");
                                return a.a(aVar2, null, new o(bVar), 1);
                            }
                        });
                    }
                }, new f(this) {
                    /* class com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM.a.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f109923a;

                    static {
                        Covode.recordClassIndex(70434);
                    }

                    {
                        this.f109923a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        final Throwable th = (Throwable) obj;
                        this.f109923a.this$0.a(new h.f.a.b<a, a>() {
                            /* class com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM.a.AnonymousClass3.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(70435);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ a invoke(a aVar) {
                                a aVar2 = aVar;
                                l.d(aVar2, "");
                                Throwable th = th;
                                l.b(th, "");
                                return a.a(aVar2, null, new com.bytedance.assem.arch.extensions.h(th), 1);
                            }
                        });
                    }
                });
                l.b(a2, "");
                editPlayListNameEditTextVM.a(a2);
            }
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<a, z> {
        final /* synthetic */ int $checkType = 1;
        final /* synthetic */ String $name;
        final /* synthetic */ EditPlayListNameEditTextVM this$0;

        static {
            Covode.recordClassIndex(70436);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(EditPlayListNameEditTextVM editPlayListNameEditTextVM, String str) {
            super(1);
            this.this$0 = editPlayListNameEditTextVM;
            this.$name = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            if (!(aVar2.f109931a instanceof n)) {
                this.this$0.c(AnonymousClass1.f109924a);
                EditPlayListNameEditTextVM editPlayListNameEditTextVM = this.this$0;
                f.a.b.b a2 = editPlayListNameEditTextVM.g().a().a(this.$checkType, this.$name).a(new f(this) {
                    /* class com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM.b.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f109925a;

                    static {
                        Covode.recordClassIndex(70438);
                    }

                    {
                        this.f109925a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        final com.ss.android.ugc.aweme.mix.api.response.a aVar = (com.ss.android.ugc.aweme.mix.api.response.a) obj;
                        this.f109925a.this$0.a(new h.f.a.b<a, a>() {
                            /* class com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM.b.AnonymousClass2.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(70439);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ a invoke(a aVar) {
                                a aVar2 = aVar;
                                l.d(aVar2, "");
                                return a.a(aVar2, new o(aVar), null, 2);
                            }
                        });
                    }
                }, new f(this) {
                    /* class com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM.b.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f109926a;

                    static {
                        Covode.recordClassIndex(70440);
                    }

                    {
                        this.f109926a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        final Throwable th = (Throwable) obj;
                        this.f109926a.this$0.a(new h.f.a.b<a, a>() {
                            /* class com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM.b.AnonymousClass3.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(70441);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ a invoke(a aVar) {
                                a aVar2 = aVar;
                                l.d(aVar2, "");
                                Throwable th = th;
                                l.b(th, "");
                                return a.a(aVar2, new com.bytedance.assem.arch.extensions.h(th), null, 2);
                            }
                        });
                    }
                });
                l.b(a2, "");
                editPlayListNameEditTextVM.a(a2);
            }
            return z.f158842a;
        }
    }
}
