package com.ss.android.ugc.aweme.music.search;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.ss.android.ugc.aweme.music.assem.h;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.Serializable;

public final class d extends com.bytedance.ies.foundation.fragment.a implements h {

    /* renamed from: e  reason: collision with root package name */
    public static final a f111697e = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f111698f;

    static {
        Covode.recordClassIndex(71792);
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.f111698f == null) {
            this.f111698f = new SparseArray();
        }
        View view = (View) this.f111698f.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f111698f.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        SparseArray sparseArray = this.f111698f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71793);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
    @Override // com.bytedance.assem.arch.service.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.ss.android.ugc.aweme.music.assem.b e() {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.music.assem.b r2 = new com.ss.android.ugc.aweme.music.assem.b
            android.os.Bundle r1 = r10.getArguments()
            r8 = 0
            if (r1 == 0) goto L_0x005d
            java.lang.String r0 = "user_id"
            java.lang.String r3 = r1.getString(r0)
        L_0x000f:
            android.os.Bundle r1 = r10.getArguments()
            if (r1 == 0) goto L_0x005b
            java.lang.String r0 = "sec_user_id"
            java.lang.String r4 = r1.getString(r0)
        L_0x001b:
            r0 = 1
            com.ss.android.ugc.aweme.experiment.ProfileMusicTabConfig r0 = com.ss.android.ugc.aweme.experiment.fr.a()
            boolean r0 = r0.getEnablePin()
            if (r0 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.b.g()
            java.lang.String r1 = ""
            h.f.b.l.b(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            h.f.b.l.b(r0, r1)
            int r1 = r0.getAccountType()
            r0 = 3
            if (r1 == r0) goto L_0x0058
            r0 = 1
            r6 = 1
        L_0x003f:
            r0 = 1
            android.os.Bundle r1 = r10.getArguments()
            if (r1 == 0) goto L_0x004c
            java.lang.String r0 = "pinned_music_list"
            java.io.Serializable r8 = r1.getSerializable(r0)
        L_0x004c:
            com.ss.android.ugc.aweme.music.model.PinnedMusicList r8 = (com.ss.android.ugc.aweme.music.model.PinnedMusicList) r8
            r0 = 64
            r5 = 1
            r7 = 1
            r9 = 64
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L_0x0058:
            r0 = 0
            r6 = 0
            goto L_0x003f
        L_0x005b:
            r4 = r8
            goto L_0x001b
        L_0x005d:
            r3 = r8
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.search.d.e():com.bytedance.assem.arch.service.a");
    }

    static final class b extends m implements h.f.a.b<BaseFragmentViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f111699a = new b();

        static {
            Covode.recordClassIndex(71794);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            l.d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(AnonymousClass1.f111700a);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(b.f111699a);
    }

    static final class c extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ SearchMusicArg $arg;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(71796);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, SearchMusicArg searchMusicArg) {
            super(1);
            this.this$0 = dVar;
            this.$arg = searchMusicArg;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super i<com.bytedance.assem.arch.extensions.c>, z>) new h.f.a.b<i<com.bytedance.assem.arch.extensions.c>, z>(this) {
                /* class com.ss.android.ugc.aweme.music.search.d.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(71797);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(i<com.bytedance.assem.arch.extensions.c> iVar) {
                    i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                    l.d(iVar2, "");
                    iVar2.a(this.this$0.$arg);
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, AnonymousClass2.f111701a);
            assembler2.b(this.this$0, AnonymousClass3.f111702a);
            assembler2.b(this.this$0, AnonymousClass4.f111703a);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        String str2;
        String str3;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("is_me", false);
        } else {
            z = false;
        }
        Bundle arguments2 = getArguments();
        Serializable serializable = null;
        if (arguments2 != null) {
            str = arguments2.getString("user_id");
        } else {
            str = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str2 = arguments3.getString("sec_user_id");
        } else {
            str2 = null;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            str3 = arguments4.getString("previous_page");
        } else {
            str3 = null;
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            serializable = arguments5.getSerializable("pinned_music_list");
        }
        com.bytedance.assem.arch.extensions.d.a(this, new c(this, new SearchMusicArg(z, str, str2, str3, (PinnedMusicList) serializable)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.aob, viewGroup, false);
    }
}
