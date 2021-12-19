package com.ss.android.ugc.aweme.mix.editname;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.q;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.r;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class h extends Fragment implements com.bytedance.assem.arch.viewModel.h, k {

    /* renamed from: a  reason: collision with root package name */
    public static final c f109955a = new c((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    private static Aweme f109956g;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f109957b;

    /* renamed from: c  reason: collision with root package name */
    private String f109958c = "";

    /* renamed from: d  reason: collision with root package name */
    private Long f109959d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f109960e = MixFeedService.k().b();

    /* renamed from: f  reason: collision with root package name */
    private String f109961f = "";

    /* renamed from: h  reason: collision with root package name */
    private SparseArray f109962h;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.mix.createmix.viewmodel.a, com.ss.android.ugc.aweme.mix.createmix.viewmodel.a> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(70473);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.mix.createmix.viewmodel.a invoke(com.ss.android.ugc.aweme.mix.createmix.viewmodel.a aVar) {
            l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70471);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final androidx.lifecycle.m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public static final class c {
        static {
            Covode.recordClassIndex(70474);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }

        private static h a(int i2, String str, String str2, Aweme aweme, Long l2, String str3) {
            l.d(str3, "");
            h hVar = new h();
            Bundle bundle = new Bundle();
            bundle.putInt("open_edit_fragment_type", i2);
            bundle.putString("user_last_name", str);
            bundle.putString("mix_id", str2);
            if (aweme != null) {
                bundle.putSerializable("key_mix_add_aweme_info", aweme);
            }
            if (l2 != null) {
                l2.longValue();
                bundle.putLong("moderated_rename_timestamp", l2.longValue());
            }
            bundle.putString("enter_from", str3);
            hVar.setArguments(bundle);
            return hVar;
        }

        public static /* synthetic */ h a(int i2, String str, String str2, Aweme aweme, Long l2, String str3, int i3) {
            if ((i3 & 2) != 0) {
                str = "";
            }
            if ((i3 & 4) != 0) {
                str2 = "";
            }
            if ((i3 & 8) != 0) {
                aweme = null;
            }
            if ((i3 & 16) != 0) {
                l2 = null;
            }
            if ((i3 & 32) != 0) {
                str3 = "";
            }
            return a(i2, str, str2, aweme, l2, str3);
        }
    }

    @Override // com.bytedance.tiktok.proxy.f
    public final androidx.lifecycle.m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.h
    public final com.bytedance.tiktok.proxy.d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.h<com.bytedance.tiktok.proxy.d> getActualReceiverHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.b
    public final /* synthetic */ j e() {
        return new j();
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f109962h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(70472);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public h() {
        h.k.c a2 = ab.a(MixCreateViewModel.class);
        this.f109957b = new com.bytedance.assem.arch.viewModel.b(a2, new a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((ag) this, true), u.c.f25670a, b.INSTANCE);
    }

    static final class d extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ View $view;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(70475);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar, View view) {
            super(1);
            this.this$0 = hVar;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.mix.editname.h.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(70476);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    l.d(qVar2, "");
                    qVar2.a(ab.a(d.class));
                    qVar2.f25596b = new d();
                    qVar2.f25599e = this.this$0.$view;
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(70478);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(h hVar, Context context) {
            super(1);
            this.this$0 = hVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            String string = this.$context.getString(R.string.c7);
            l.b(string, "");
            bVar2.a(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.mix.editname.h.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(70479);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    androidx.fragment.app.e activity = this.this$0.this$0.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<j, j> {
        final /* synthetic */ Bundle $it;

        static {
            Covode.recordClassIndex(70477);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Bundle bundle) {
            super(1);
            this.$it = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ j invoke(j jVar) {
            if (jVar != null) {
                return new j(this.$it.getInt("open_edit_fragment_type"), this.$it.getString("user_last_name"), this.$it.getString("mix_id"));
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.editname.k
    public final void a(String str) {
        l.d(str, "");
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.mix.b.c(str, this.f109958c));
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0122, code lost:
        if (r4.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x0124;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r17) {
        /*
        // Method dump skipped, instructions count: 431
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.editname.h.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        com.bytedance.assem.arch.extensions.d.a(this, new d(this, view));
        Long l2 = this.f109959d;
        if (l2 != null) {
            long longValue = l2.longValue() + TimeUnit.DAYS.toSeconds(1);
            if (System.currentTimeMillis() / 1000 < longValue) {
                String format = new SimpleDateFormat("MMM dd, yyyy hh:mm a", Locale.getDefault()).format(new Date(longValue * 1000));
                l.b(format, "");
                Context context = view.getContext();
                l.b(context, "");
                com.bytedance.tux.dialog.b bVar = new com.bytedance.tux.dialog.b(context);
                String string = getString(R.string.gih);
                l.b(string, "");
                String a2 = com.a.a(string, Arrays.copyOf(new Object[]{format}, 1));
                l.b(a2, "");
                ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(bVar.d(a2), new f(this, context)).a(false)).a().b().show();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.akt, viewGroup, false);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j> void a(AssemViewModel<S> assemViewModel, k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, k<com.bytedance.assem.arch.extensions.q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, z> qVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, k<r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, z> rVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(kVar5, "");
        l.d(sVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
